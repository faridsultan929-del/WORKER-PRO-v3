package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.speech.tts.TextToSpeech;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PhrasebookActivity extends Activity {

    private LinearLayout container;
    private EditText searchBox;

    private TextToSpeech tts;

    private String language = "RU";
    private String selectedCategory = "ALL";

    private SharedPreferences favorites;

    private final String[] categories = {
            "ALL",
            "WORK",
            "BOSS",
            "MACHINE",
            "CNC",
            "STAMPING",
            "QUALITY",
            "SAFETY",
            "FIRE",
            "WELDING",
            "GALVANIC",
            "MAINTENANCE",
            "EMERGENCY"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        favorites = getSharedPreferences(
                "WORKER_PRO_FAVORITES",
                MODE_PRIVATE
        );

        tts = new TextToSpeech(this, status -> {
            if (status == TextToSpeech.SUCCESS) {
                setSpeechLanguage();
            }
        });

        createInterface();
    }

    private void createInterface() {

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("РАЗГОВОРНИК");
        title.setTextSize(25);
        title.setTextColor(Color.rgb(0, 140, 70));
        title.setTypeface(null, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);
        title.setPadding(10, 20, 10, 15);

        root.addView(title);

        // Языки
        HorizontalScrollView languageScroll =
                new HorizontalScrollView(this);

        LinearLayout languageLayout =
                new LinearLayout(this);

        languageLayout.setOrientation(LinearLayout.HORIZONTAL);
        languageLayout.setPadding(8, 5, 8, 5);

        String[] languages = {
                "RU", "AZ", "EN", "TR", "DE"
        };

        for (String lang : languages) {
            TextView button = createLanguageButton(lang);

            languageLayout.addView(
                    button,
                    new LinearLayout.LayoutParams(
                            dp(65),
                            dp(45)
                    )
            );
        }

        languageScroll.addView(languageLayout);
        root.addView(languageScroll);

        // Поиск
        searchBox = new EditText(this);
        searchBox.setHint("Поиск фразы...");
        searchBox.setSingleLine(true);
        searchBox.setTextSize(16);
        searchBox.setPadding(
                dp(15),
                dp(5),
                dp(15),
                dp(5)
        );

        root.addView(
                searchBox,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        dp(55)
                )
        );

        // Категории
        HorizontalScrollView categoryScroll =
                new HorizontalScrollView(this);

        LinearLayout categoryLayout =
                new LinearLayout(this);

        categoryLayout.setOrientation(LinearLayout.HORIZONTAL);
        categoryLayout.setPadding(8, 5, 8, 5);

        for (String category : categories) {

            TextView button = new TextView(this);

            button.setText(category);
            button.setTextSize(14);
            button.setTextColor(Color.WHITE);
            button.setGravity(Gravity.CENTER);
            button.setTypeface(null, Typeface.BOLD);
            button.setPadding(
                    dp(12),
                    dp(8),
                    dp(12),
                    dp(8)
            );

            button.setBackgroundColor(
                    Color.rgb(0, 150, 70)
            );

            button.setOnClickListener(v -> {
                selectedCategory = category;
                showPhrases();
            });

            LinearLayout.LayoutParams params =
                    new LinearLayout.LayoutParams(
                            ViewGroup.LayoutParams.WRAP_CONTENT,
                            dp(42)
                    );

            params.setMargins(
                    dp(4),
                    0,
                    dp(4),
                    0
            );

            categoryLayout.addView(button, params);
        }

        categoryScroll.addView(categoryLayout);
        root.addView(categoryScroll);

        // Список фраз
        ScrollView scrollView = new ScrollView(this);

        container = new LinearLayout(this);
        container.setOrientation(LinearLayout.VERTICAL);
        container.setPadding(
                dp(8),
                dp(8),
                dp(8),
                dp(20)
        );

        scrollView.addView(container);

        root.addView(
                scrollView,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        0,
                        1
                )
        );

        TextView footer = new TextView(this);
        footer.setText("F.S");
        footer.setTextSize(14);
        footer.setTextColor(Color.GRAY);
        footer.setGravity(Gravity.CENTER);
        footer.setPadding(0, 8, 0, 8);

        root.addView(footer);

        setContentView(root);

        searchBox.addTextChangedListener(
                new android.text.TextWatcher() {

                    @Override
                    public void beforeTextChanged(
                            CharSequence s,
                            int start,
                            int count,
                            int after) {
                    }

                    @Override
                    public void onTextChanged(
                            CharSequence s,
                            int start,
                            int before,
                            int count) {

                        showPhrases();
                    }

                    @Override
                    public void afterTextChanged(
                            android.text.Editable s) {
                    }
                }
        );

        showPhrases();
    }

    private TextView createLanguageButton(String lang) {

        TextView button = new TextView(this);

        button.setText(lang);
        button.setTextSize(15);
        button.setTextColor(Color.WHITE);
        button.setGravity(Gravity.CENTER);
        button.setTypeface(null, Typeface.BOLD);
        button.setBackgroundColor(
                Color.rgb(0, 150, 70)
        );

        button.setOnClickListener(v -> {

            language = lang;

            setSpeechLanguage();

            showPhrases();
        });

        return button;
    }

    private void showPhrases() {

        if (container == null) {
            return;
        }

        container.removeAllViews();

        List<WorkerPhrasebook.Phrase> phrases =
                WorkerPhrasebook.getPhrases();

        String query = "";

        if (searchBox != null) {
            query = searchBox
                    .getText()
                    .toString()
                    .toLowerCase()
                    .trim();
        }

        for (WorkerPhrasebook.Phrase phrase : phrases) {

            if (!selectedCategory.equals("ALL") &&
                    !phrase.category.equals(selectedCategory)) {
                continue;
            }

            if (!query.isEmpty()) {

                String allText =
                        phrase.english + " " +
                        phrase.russian + " " +
                        phrase.azerbaijani + " " +
                        phrase.turkish + " " +
                        phrase.german;

                if (!allText.toLowerCase()
                        .contains(query)) {
                    continue;
                }
            }

            addPhraseCard(phrase);
        }
    }

    private void addPhraseCard(
            WorkerPhrasebook.Phrase phrase) {

        LinearLayout card = new LinearLayout(this);

        card.setOrientation(LinearLayout.VERTICAL);
        card.setPadding(
                dp(12),
                dp(10),
                dp(8),
                dp(10)
        );

        card.setBackgroundColor(
                Color.rgb(245, 245, 245)
        );

        LinearLayout.LayoutParams cardParams =
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                );

        cardParams.setMargins(
                0,
                dp(5),
                0,
                dp(5)
        );

        container.addView(card, cardParams);

        TextView english = new TextView(this);
        english.setText("🇬🇧 " + phrase.english);
        english.setTextSize(18);
        english.setTextColor(Color.BLACK);
        english.setTypeface(null, Typeface.BOLD);

        card.addView(english);

        TextView russian = new TextView(this);
        russian.setText("🇷🇺 " + phrase.russian);
        russian.setTextSize(16);

        card.addView(russian);

        TextView azerbaijani = new TextView(this);
        azerbaijani.setText("🇦🇿 " + phrase.azerbaijani);
        azerbaijani.setTextSize(16);

        card.addView(azerbaijani);

        TextView turkish = new TextView(this);
        turkish.setText("🇹🇷 " + phrase.turkish);
        turkish.setTextSize(16);

        card.addView(turkish);

        TextView german = new TextView(this);
        german.setText("🇩🇪 " + phrase.german);
        german.setTextSize(16);

        card.addView(german);

        LinearLayout buttons = new LinearLayout(this);
        buttons.setOrientation(LinearLayout.HORIZONTAL);
        buttons.setGravity(Gravity.RIGHT);

        // Копировать
        TextView copy = createActionButton("📋", 25);

        copy.setOnClickListener(v -> {

            String text =
                    phrase.english + "\n" +
                    phrase.russian + "\n" +
                    phrase.azerbaijani + "\n" +
                    phrase.turkish + "\n" +
                    phrase.german;

            ClipboardManager clipboard =
                    (ClipboardManager)
                            getSystemService(Context.CLIPBOARD_SERVICE);

            clipboard.setPrimaryClip(
                    ClipData.newPlainText(
                            "WORKER PRO",
                            text
                    )
            );

            Toast.makeText(
                    this,
                    "Скопировано",
                    Toast.LENGTH_SHORT
            ).show();
        });

        buttons.addView(
                copy,
                new LinearLayout.LayoutParams(
                        dp(55),
                        dp(50)
                )
        );

        // Избранное
        TextView favorite =
                createActionButton(
                        isFavorite(phrase) ? "⭐" : "☆",
                        25
                );

        favorite.setOnClickListener(v -> {

            String key = phrase.english;

            boolean state =
                    favorites.getBoolean(key, false);

            favorites.edit()
                    .putBoolean(key, !state)
                    .apply();

            favorite.setText(
                    !state ? "⭐" : "☆"
            );
        });

        buttons.addView(
                favorite,
                new LinearLayout.LayoutParams(
                        dp(55),
                        dp(50)
                )
        );

        // Озвучка
        TextView speak =
                createActionButton("🔊", 26);

        speak.setTextColor(
                Color.rgb(0, 130, 60)
        );

        speak.setOnClickListener(v -> {

            String text =
                    getSelectedText(phrase);

            if (language.equals("AZ")) {

                int available =
                        tts.isLanguageAvailable(
                                new Locale("az", "AZ")
                        );

                if (available ==
                        TextToSpeech.LANG_MISSING_DATA ||
                        available ==
                                TextToSpeech.LANG_NOT_SUPPORTED) {

                    Toast.makeText(
                            this,
                            "Для азербайджанского языка нет голосового пакета",
                            Toast.LENGTH_LONG
                    ).show();

                    return;
                }
            }

            tts.speak(
                    text,
                    TextToSpeech.QUEUE_FLUSH,
                    null,
                    "worker_phrase"
            );
        });

        buttons.addView(
                speak,
                new LinearLayout.LayoutParams(
                        dp(55),
                        dp(50)
                )
        );

        card.addView(buttons);
    }

    private String getSelectedText(
            WorkerPhrasebook.Phrase phrase) {

        switch (language) {

            case "AZ":
                return phrase.azerbaijani;

            case "EN":
                return phrase.english;

            case "TR":
                return phrase.turkish;

            case "DE":
                return phrase.german;

            case "RU":
            default:
                return phrase.russian;
        }
    }

    private boolean isFavorite(
            WorkerPhrasebook.Phrase phrase) {

        return favorites.getBoolean(
                phrase.english,
                false
        );
    }

    private TextView createActionButton(
            String text,
            float textSize) {

        TextView button = new TextView(this);

        button.setText(text);
        button.setTextSize(textSize);
        button.setTextColor(Color.DKGRAY);
        button.setGravity(Gravity.CENTER);
        button.setTypeface(null, Typeface.BOLD);

        button.setBackgroundColor(
                Color.rgb(235, 235, 235)
        );

        button.setPadding(
                dp(4),
                dp(4),
                dp(4),
                dp(4)
        );

        button.setClickable(true);
        button.setFocusable(true);

        return button;
    }

    private Locale getSpeechLocale() {

        switch (language) {

            case "AZ":
                return new Locale("az", "AZ");

            case "TR":
                return new Locale("tr", "TR");

            case "DE":
                return new Locale("de", "DE");

            case "EN":
                return new Locale("en", "US");

            case "RU":
            default:
                return new Locale("ru", "RU");
        }
    }

    private void setSpeechLanguage() {

        if (tts == null) {
            return;
        }

        Locale locale = getSpeechLocale();

        int result = tts.setLanguage(locale);

        if (language.equals("AZ")) {

            if (result ==
                    TextToSpeech.LANG_MISSING_DATA ||
                    result ==
                            TextToSpeech.LANG_NOT_SUPPORTED) {

                Toast.makeText(
                        this,
                        "Azərbaycan dili üçün səs paketi yoxdur",
                        Toast.LENGTH_LONG
                ).show();
            }
        }
    }

    private int dp(int value) {

        return (int) (
                value *
                        getResources()
                                .getDisplayMetrics()
                                .density
        );
    }

    @Override
    protected void onDestroy() {

        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }

        super.onDestroy();
    }
}