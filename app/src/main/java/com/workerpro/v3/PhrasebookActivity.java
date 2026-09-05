package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.speech.tts.TextToSpeech;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;

import java.util.List;
import java.util.Locale;
import java.util.ArrayList;

public class PhrasebookActivity extends Activity {

    private String language = "RU";

    private TextToSpeech textToSpeech;

    private LinearLayout phraseContainer;

    private List<WorkerPhrasebook.Phrase> allPhrases;

    private SharedPreferences favorites;

    private boolean showFavoritesOnly = false;

    private Button favoritesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        language = getIntent().getStringExtra("LANGUAGE");

        if (language == null) {
            language = "RU";
        }

        favorites = getSharedPreferences(
                "WORKER_PRO_FAVORITES",
                MODE_PRIVATE
        );

        initTextToSpeech();

        createScreen();
    }

    private void initTextToSpeech() {

        textToSpeech = new TextToSpeech(
                this,
                new TextToSpeech.OnInitListener() {

                    @Override
                    public void onInit(int status) {

                        if (status == TextToSpeech.SUCCESS) {
                            textToSpeech.setLanguage(Locale.ENGLISH);
                        }
                    }
                }
        );
    }

    private void createScreen() {

        LinearLayout root = new LinearLayout(this);

        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(Color.WHITE);

        // Заголовок
        TextView title = new TextView(this);

        title.setText(getPhrasebookTitle());
        title.setTextSize(24);
        title.setTypeface(null, Typeface.BOLD);
        title.setTextColor(Color.rgb(0, 120, 70));
        title.setGravity(Gravity.CENTER);

        title.setPadding(10, 25, 10, 15);

        root.addView(title);

        // Поле поиска
        final EditText search = new EditText(this);

        if (language.equals("AZ")) {

            search.setHint("🔎 Frazanı axtar");

        } else if (language.equals("EN")) {

            search.setHint("🔎 Search phrase");

        } else {

            search.setHint("🔎 Поиск фразы");
        }

        search.setTextSize(17);
        search.setSingleLine(true);

        search.setPadding(20, 10, 20, 10);

        root.addView(search);

        // Кнопка избранного
        favoritesButton = new Button(this);

        updateFavoritesButton();

        favoritesButton.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {

                        showFavoritesOnly = !showFavoritesOnly;

                        updateFavoritesButton();

                        filterPhrases(search.getText().toString());
                    }
                }
        );

        root.addView(favoritesButton);

        // ScrollView
        ScrollView scrollView = new ScrollView(this);

        phraseContainer = new LinearLayout(this);

        phraseContainer.setOrientation(
                LinearLayout.VERTICAL
        );

        phraseContainer.setPadding(
                15,
                10,
                15,
                20
        );

        scrollView.addView(phraseContainer);

        root.addView(
                scrollView,
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        0,
                        1
                )
        );

        // Footer
        TextView footer = new TextView(this);

        footer.setText("F.S");
        footer.setTextSize(14);
        footer.setTextColor(Color.GRAY);
        footer.setGravity(Gravity.CENTER);

        footer.setPadding(10, 8, 10, 15);

        root.addView(footer);

        setContentView(root);

        // Получаем все фразы
        allPhrases = WorkerPhrasebook.getPhrases();

        showPhrases(allPhrases);

        // Поиск
        search.addTextChangedListener(
                new TextWatcher() {

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

                        filterPhrases(s.toString());
                    }

                    @Override
                    public void afterTextChanged(
                            Editable s) {
                    }
                }
        );
    }

    private void updateFavoritesButton() {

        if (showFavoritesOnly) {

            if (language.equals("AZ")) {

                favoritesButton.setText(
                        "⭐ Bütün ifadələr"
                );

            } else if (language.equals("EN")) {

                favoritesButton.setText(
                        "⭐ All phrases"
                );

            } else {

                favoritesButton.setText(
                        "⭐ Все фразы"
                );
            }

        } else {

            if (language.equals("AZ")) {

                favoritesButton.setText(
                        "⭐ Seçilmişlər"
                );

            } else if (language.equals("EN")) {

                favoritesButton.setText(
                        "⭐ Favorites"
                );

            } else {

                favoritesButton.setText(
                        "⭐ Избранное"
                );
            }
        }
    }

    private void filterPhrases(String query) {

        query = query
                .toLowerCase(Locale.getDefault())
                .trim();

        ArrayList<WorkerPhrasebook.Phrase> result =
                new ArrayList<>();

        for (WorkerPhrasebook.Phrase phrase : allPhrases) {

            boolean matchesSearch;

            if (query.isEmpty()) {

                matchesSearch = true;

            } else {

                String english =
                        phrase.english.toLowerCase(
                                Locale.getDefault()
                        );

                String russian =
                        phrase.russian.toLowerCase(
                                Locale.getDefault()
                        );

                String azerbaijani =
                        phrase.azerbaijani.toLowerCase(
                                Locale.getDefault()
                        );

                matchesSearch =
                        english.contains(query)
                        || russian.contains(query)
                        || azerbaijani.contains(query);
            }

            boolean matchesFavorite =
                    !showFavoritesOnly
                    || isFavorite(phrase);

            if (matchesSearch && matchesFavorite) {

                result.add(phrase);
            }
        }

        showPhrases(result);
    }

    private boolean isFavorite(
            WorkerPhrasebook.Phrase phrase) {

        return favorites.getBoolean(
                phrase.english,
                false
        );
    }

    private void toggleFavorite(
            WorkerPhrasebook.Phrase phrase) {

        boolean current =
                isFavorite(phrase);

        favorites.edit()
                .putBoolean(
                        phrase.english,
                        !current
                )
                .apply();
    }

    private void showPhrases(
            List<WorkerPhrasebook.Phrase> phrases) {

        phraseContainer.removeAllViews();

        if (phrases.isEmpty()) {

            TextView empty = new TextView(this);

            if (showFavoritesOnly) {

                if (language.equals("AZ")) {

                    empty.setText(
                            "⭐ Seçilmiş ifadə yoxdur."
                    );

                } else if (language.equals("EN")) {

                    empty.setText(
                            "⭐ No favorite phrases."
                    );

                } else {

                    empty.setText(
                            "⭐ Избранных фраз пока нет."
                    );
                }

            } else {

                if (language.equals("AZ")) {

                    empty.setText(
                            "Heç nə tapılmadı."
                    );

                } else if (language.equals("EN")) {

                    empty.setText(
                            "Nothing found."
                    );

                } else {

                    empty.setText(
                            "Ничего не найдено."
                    );
                }
            }

            empty.setTextSize(18);
            empty.setGravity(Gravity.CENTER);

            empty.setPadding(
                    20,
                    40,
                    20,
                    40
            );

            phraseContainer.addView(empty);

            return;
        }

        for (final WorkerPhrasebook.Phrase phrase :
                phrases) {

            // Карточка
            LinearLayout card =
                    new LinearLayout(this);

            card.setOrientation(
                    LinearLayout.VERTICAL
            );

            card.setPadding(
                    15,
                    15,
                    15,
                    15
            );

            // Английский
            TextView english =
                    new TextView(this);

            english.setText(
                    "🇬🇧 " + phrase.english
            );

            english.setTextSize(18);
            english.setTypeface(
                    null,
                    Typeface.BOLD
            );

            english.setTextColor(
                    Color.rgb(0, 100, 60)
            );

            card.addView(english);

            // Русский
            TextView russian =
                    new TextView(this);

            russian.setText(
                    "🇷🇺 " + phrase.russian
            );

            russian.setTextSize(16);

            russian.setPadding(
                    0,
                    8,
                    0,
                    4
            );

            card.addView(russian);

            // Азербайджанский
            TextView azerbaijani =
                    new TextView(this);

            azerbaijani.setText(
                    "🇦🇿 " + phrase.azerbaijani
            );

            azerbaijani.setTextSize(16);

            azerbaijani.setPadding(
                    0,
                    4,
                    0,
                    8
            );

            card.addView(azerbaijani);

            // Строка кнопок
            LinearLayout buttons =
                    new LinearLayout(this);

            buttons.setOrientation(
                    LinearLayout.HORIZONTAL
            );

            // 🔊 Произношение
            Button speakButton =
                    new Button(this);

            speakButton.setText(
                    "🔊 English"
            );

            speakButton.setOnClickListener(
                    new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {

                            speakPhrase(
                                    phrase.english
                            );
                        }
                    }
            );

            buttons.addView(
                    speakButton,
                    new LinearLayout.LayoutParams(
                            0,
                            LinearLayout.LayoutParams.WRAP_CONTENT,
                            1
                    )
            );

            // 📋 Копировать
            Button copyButton =
                    new Button(this);

            copyButton.setText(
                    "📋"
            );

            copyButton.setOnClickListener(
                    new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {

                            copyPhrase(
                                    phrase.english
                            );
                        }
                    }
            );

            buttons.addView(
                    copyButton,
                    new LinearLayout.LayoutParams(
                            0,
                            LinearLayout.LayoutParams.WRAP_CONTENT,
                            0.6f
                    )
            );

            // ⭐ Избранное
            final Button favoriteButton =
                    new Button(this);

            updateFavoriteButton(
                    favoriteButton,
                    phrase
            );

            favoriteButton.setOnClickListener(
                    new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {

                            toggleFavorite(
                                    phrase
                            );

                            updateFavoriteButton(
                                    favoriteButton,
                                    phrase
                            );

                            if (showFavoritesOnly) {

                                filterPhrases("");
                            }
                        }
                    }
            );

            buttons.addView(
                    favoriteButton,
                    new LinearLayout.LayoutParams(
                            0,
                            LinearLayout.LayoutParams.WRAP_CONTENT,
                            0.6f
                    )
            );

            card.addView(buttons);

            // Разделитель
            View divider =
                    new View(this);

            divider.setBackgroundColor(
                    Color.LTGRAY
            );

            LinearLayout.LayoutParams dividerParams =
                    new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            2
                    );

            dividerParams.setMargins(
                    0,
                    10,
                    0,
                    10
            );

            phraseContainer.addView(card);

            phraseContainer.addView(
                    divider,
                    dividerParams
            );
        }
    }

    private void updateFavoriteButton(
            Button button,
            WorkerPhrasebook.Phrase phrase) {

        if (isFavorite(phrase)) {

            button.setText("⭐");

        } else {

            button.setText("☆");
        }
    }

    private void speakPhrase(String phrase) {

        if (textToSpeech == null) {
            return;
        }

        int result =
                textToSpeech.setLanguage(
                        Locale.ENGLISH
                );

        if (result ==
                TextToSpeech.LANG_MISSING_DATA
                || result ==
                TextToSpeech.LANG_NOT_SUPPORTED) {

            Toast.makeText(
                    PhrasebookActivity.this,
                    "English voice is not available",
                    Toast.LENGTH_SHORT
            ).show();

            return;
        }

        textToSpeech.speak(
                phrase,
                TextToSpeech.QUEUE_FLUSH,
                null,
                "WORKER_PRO_PHRASE"
        );
    }

    private void copyPhrase(String phrase) {

        ClipboardManager clipboard =
                (ClipboardManager)
                        getSystemService(
                                Context.CLIPBOARD_SERVICE
                        );

        ClipData clip =
                ClipData.newPlainText(
                        "WORKER PRO",
                        phrase
                );

        clipboard.setPrimaryClip(clip);

        Toast.makeText(
                this,
                "Copied: " + phrase,
                Toast.LENGTH_SHORT
        ).show();
    }

    private String getPhrasebookTitle() {

        if (language.equals("AZ")) {

            return "💬 Danışıq kitabçası";
        }

        if (language.equals("EN")) {

            return "💬 WORKER PHRASEBOOK";
        }

        return "💬 РАЗГОВОРНИК";
    }

    @Override
    protected void onDestroy() {

        if (textToSpeech != null) {

            textToSpeech.stop();
            textToSpeech.shutdown();
        }

        super.onDestroy();
    }
}