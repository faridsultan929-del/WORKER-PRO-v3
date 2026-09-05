package com.workerpro.v3;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Locale;

public class PhrasebookActivity extends Activity {

    private LinearLayout phraseContainer;
    private EditText search;
    private TextToSpeech tts;
    private SharedPreferences favorites;

    private boolean showFavoritesOnly = false;
    private Button favoritesButton;

    private String selectedCategory = "ALL";
    private String language = "RU";

    private final int GREEN = Color.rgb(0, 150, 70);
    private final int LIGHT_GREEN = Color.rgb(220, 245, 230);
    private final int DARK = Color.rgb(35, 35, 35);

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

        createInterface();

        tts = new TextToSpeech(
                this,
                status -> {
                    if (status == TextToSpeech.SUCCESS) {
                        tts.setLanguage(Locale.ENGLISH);
                    }
                }
        );

        filterPhrases("");
    }

    private void createInterface() {

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(Color.WHITE);

        // TITLE
        TextView title = new TextView(this);

        title.setText(getPhrasebookTitle());
        title.setTextSize(26);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);
        title.setTypeface(
                null,
                android.graphics.Typeface.BOLD
        );

        title.setBackgroundColor(GREEN);

        title.setPadding(
                10,
                25,
                10,
                25
        );

        root.addView(
                title,
                new LinearLayout.LayoutParams(
                        -1,
                        -2
                )
        );

        // SEARCH
        search = new EditText(this);

        search.setHint(getSearchHint());
        search.setSingleLine(true);

        search.setPadding(
                20,
                10,
                20,
                10
        );

        LinearLayout.LayoutParams searchParams =
                new LinearLayout.LayoutParams(
                        -1,
                        -2
                );

        searchParams.setMargins(
                15,
                10,
                15,
                5
        );

        root.addView(
                search,
                searchParams
        );

        search.addTextChangedListener(
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

                        filterPhrases(s.toString());
                    }

                    @Override
                    public void afterTextChanged(
                            android.text.Editable s) {
                    }
                }
        );

        // CATEGORIES
        HorizontalScrollView categoryScroll =
                new HorizontalScrollView(this);

        categoryScroll.setHorizontalScrollBarEnabled(false);

        LinearLayout categories =
                new LinearLayout(this);

        categories.setOrientation(
                LinearLayout.HORIZONTAL
        );

        categories.setPadding(
                10,
                5,
                10,
                8
        );

        String[][] categoryData =
                getCategories();

        for (String[] item : categoryData) {

            Button button =
                    createCategoryButton(
                            item[0],
                            item[1]
                    );

            categories.addView(button);
        }

        categoryScroll.addView(categories);

        root.addView(
                categoryScroll,
                new LinearLayout.LayoutParams(
                        -1,
                        -2
                )
        );

        // FAVORITES
        favoritesButton = new Button(this);

        favoritesButton.setText(
                getFavoritesText()
        );

        favoritesButton.setTextSize(15);

        favoritesButton.setOnClickListener(v -> {

            showFavoritesOnly =
                    !showFavoritesOnly;

            updateFavoritesButton();

            filterPhrases(
                    search.getText().toString()
            );
        });

        LinearLayout.LayoutParams favParams =
                new LinearLayout.LayoutParams(
                        -1,
                        -2
                );

        favParams.setMargins(
                10,
                0,
                10,
                5
        );

        root.addView(
                favoritesButton,
                favParams
        );

        // PHRASES
        ScrollView scroll =
                new ScrollView(this);

        phraseContainer =
                new LinearLayout(this);

        phraseContainer.setOrientation(
                LinearLayout.VERTICAL
        );

        phraseContainer.setPadding(
                10,
                5,
                10,
                20
        );

        scroll.addView(phraseContainer);

        root.addView(
                scroll,
                new LinearLayout.LayoutParams(
                        -1,
                        0,
                        1
                )
        );

        // FOOTER
        TextView footer =
                new TextView(this);

        footer.setText("F.S");
        footer.setTextSize(13);
        footer.setTextColor(Color.GRAY);
        footer.setGravity(Gravity.CENTER);

        footer.setPadding(
                5,
                8,
                5,
                8
        );

        root.addView(
                footer,
                new LinearLayout.LayoutParams(
                        -1,
                        -2
                )
        );

        setContentView(root);
    }

    private Button createCategoryButton(
            String key,
            String text) {

        Button button = new Button(this);

        button.setText(text);
        button.setTextSize(13);
        button.setAllCaps(false);

        button.setPadding(
                15,
                5,
                15,
                5
        );

        button.setTag(key);

        updateCategoryButton(
                button,
                key
        );

        button.setOnClickListener(v -> {

            selectedCategory = key;

            filterPhrases(
                    search.getText().toString()
            );

            View parent = button.getParent();

            if (parent instanceof LinearLayout) {

                LinearLayout layout =
                        (LinearLayout) parent;

                for (int i = 0;
                     i < layout.getChildCount();
                     i++) {

                    View child =
                            layout.getChildAt(i);

                    if (child instanceof Button) {

                        Button b =
                                (Button) child;

                        String categoryKey =
                                (String) b.getTag();

                        updateCategoryButton(
                                b,
                                categoryKey
                        );
                    }
                }
            }
        });

        return button;
    }

    private void updateCategoryButton(
            Button button,
            String key) {

        GradientDrawable background =
                new GradientDrawable();

        background.setCornerRadius(30);

        if (key.equals(selectedCategory)) {

            button.setTextColor(Color.WHITE);

            background.setColor(GREEN);

        } else {

            button.setTextColor(DARK);

            background.setColor(LIGHT_GREEN);
        }

        button.setBackground(background);
    }

    private void filterPhrases(String query) {

        phraseContainer.removeAllViews();

        String text =
                query == null
                        ? ""
                        : query.toLowerCase(
                                Locale.getDefault()
                        );

        List<WorkerPhrasebook.Phrase> phrases =
                WorkerPhrasebook.getPhrases();

        int count = 0;

        for (
                WorkerPhrasebook.Phrase phrase
                : phrases
        ) {

            boolean matchesCategory =
                    selectedCategory.equals("ALL")
                            || phrase.category.equals(
                                    selectedCategory
                            );

            boolean matchesFavorite =
                    !showFavoritesOnly
                            || favorites.getBoolean(
                                    phrase.english,
                                    false
                            );

            boolean matchesSearch =
                    text.isEmpty()
                            || phrase.english
                            .toLowerCase()
                            .contains(text)
                            || phrase.russian
                            .toLowerCase()
                            .contains(text)
                            || phrase.azerbaijani
                            .toLowerCase()
                            .contains(text);

            if (
                    matchesCategory
                            && matchesFavorite
                            && matchesSearch
            ) {

                addPhraseView(phrase);

                count++;
            }
        }

        if (count == 0) {

            TextView empty =
                    new TextView(this);

            empty.setText(
                    getNoResultsText()
            );

            empty.setTextSize(18);
            empty.setTextColor(Color.GRAY);
            empty.setGravity(Gravity.CENTER);

            empty.setPadding(
                    20,
                    40,
                    20,
                    40
            );

            phraseContainer.addView(empty);
        }
    }

    private void addPhraseView(
            WorkerPhrasebook.Phrase phrase) {

        LinearLayout card =
                new LinearLayout(this);

        card.setOrientation(
                LinearLayout.VERTICAL
        );

        card.setPadding(
                15,
                12,
                15,
                12
        );

        GradientDrawable background =
                new GradientDrawable();

        background.setColor(
                Color.rgb(
                        248,
                        248,
                        248
                )
        );

        background.setCornerRadius(18);

        card.setBackground(background);

        LinearLayout.LayoutParams cardParams =
                new LinearLayout.LayoutParams(
                        -1,
                        -2
                );

        cardParams.setMargins(
                5,
                5,
                5,
                10
        );

        phraseContainer.addView(
                card,
                cardParams
        );

        TextView english =
                new TextView(this);

        english.setText(
                "🇬🇧 " + phrase.english
        );

        english.setTextSize(19);
        english.setTextColor(GREEN);

        english.setTypeface(
                null,
                android.graphics.Typeface.BOLD
        );

        card.addView(english);

        TextView russian =
                new TextView(this);

        russian.setText(
                "🇷🇺 " + phrase.russian
        );

        russian.setTextSize(16);
        russian.setTextColor(DARK);

        russian.setPadding(
                0,
                5,
                0,
                0
        );

        card.addView(russian);

        TextView azerbaijani =
                new TextView(this);

        azerbaijani.setText(
                "🇦🇿 " + phrase.azerbaijani
        );

        azerbaijani.setTextSize(16);
        azerbaijani.setTextColor(DARK);

        azerbaijani.setPadding(
                0,
                3,
                0,
                5
        );

        card.addView(azerbaijani);

        LinearLayout buttons =
                new LinearLayout(this);

        buttons.setOrientation(
                LinearLayout.HORIZONTAL
        );

        buttons.setGravity(
                Gravity.CENTER_VERTICAL
        );

        card.addView(buttons);

        // SPEAK
        Button speak =
                new Button(this);

        speak.setText("🔊");
        speak.setTextSize(18);

        speak.setOnClickListener(v -> {

            if (tts != null) {

                tts.speak(
                        phrase.english,
                        TextToSpeech.QUEUE_FLUSH,
                        null,
                        "worker_phrase"
                );
            }
        });

        buttons.addView(speak);

        // COPY
        Button copy =
                new Button(this);

        copy.setText("📋");
        copy.setTextSize(18);

        copy.setOnClickListener(v -> {

            ClipboardManager clipboard =
                    (ClipboardManager)
                            getSystemService(
                                    Context.CLIPBOARD_SERVICE
                            );

            ClipData data =
                    ClipData.newPlainText(
                            "WORKER PRO",
                            phrase.english
                    );

            clipboard.setPrimaryClip(data);

            Toast.makeText(
                    this,
                    getCopiedText(),
                    Toast.LENGTH_SHORT
            ).show();
        });

        buttons.addView(copy);

        // FAVORITE
        Button favorite =
                new Button(this);

        boolean isFavorite =
                favorites.getBoolean(
                        phrase.english,
                        false
                );

        favorite.setText(
                isFavorite
                        ? "⭐"
                        : "☆"
        );

        favorite.setTextSize(20);

        favorite.setOnClickListener(v -> {

            boolean current =
                    favorites.getBoolean(
                            phrase.english,
                            false
                    );

            favorites.edit()
                    .putBoolean(
                            phrase.english,
                            !current
                    )
                    .apply();

            favorite.setText(
                    !current
                            ? "⭐"
                            : "☆"
            );

            if (showFavoritesOnly) {

                filterPhrases(
                        search.getText().toString()
                );
            }
        });

        buttons.addView(favorite);
    }

    private String[][] getCategories() {

        if (language.equals("AZ")) {

            return new String[][]{

                    {"ALL", "Hamısı"},
                    {"WORK", "🏭 İş"},
                    {"BOSS", "👷 Rəhbər"},
                    {"MACHINE", "⚙️ Dəzgah"},
                    {"CNC", "🖥 CNC"},
                    {"STAMPING", "🔨 Ştamplama"},
                    {"QUALITY", "✅ Keyfiyyət"},
                    {"SAFETY", "🦺 Təhlükəsizlik"},
                    {"FIRE", "🧯 Yanğın"},
                    {"WELDING", "⚡ Qaynaq"},
                    {"GALVANIC", "🧪 Qalvanika"},
                    {"MAINTENANCE", "🔧 Texniki xidmət"},
                    {"EMERGENCY", "🚨 Fövqəladə"}
            };
        }

        if (language.equals("EN")) {

            return new String[][]{

                    {"ALL", "All"},
                    {"WORK", "🏭 Work"},
                    {"BOSS", "👷 Boss"},
                    {"MACHINE", "⚙️ Machine"},
                    {"CNC", "🖥 CNC"},
                    {"STAMPING", "🔨 Stamping"},
                    {"QUALITY", "✅ Quality"},
                    {"SAFETY", "🦺 Safety"},
                    {"FIRE", "🧯 Fire"},
                    {"WELDING", "⚡ Welding"},
                    {"GALVANIC", "🧪 Galvanic"},
                    {"MAINTENANCE", "🔧 Maintenance"},
                    {"EMERGENCY", "🚨 Emergency"}
            };
        }

        return new String[][]{

                {"ALL", "Все"},
                {"WORK", "🏭 Работа"},
                {"BOSS", "👷 Начальник"},
                {"MACHINE", "⚙️ Станок"},
                {"CNC", "🖥 CNC"},
                {"STAMPING", "🔨 Штамповка"},
                {"QUALITY", "✅ Качество"},
                {"SAFETY", "🦺 Безопасность"},
                {"FIRE", "🧯 Пожар"},
                {"WELDING", "⚡ Сварка"},
                {"GALVANIC", "🧪 Гальваника"},
                {"MAINTENANCE", "🔧 Обслуживание"},
                {"EMERGENCY", "🚨 Авария"}
        };
    }

    private String getPhrasebookTitle() {

        if (language.equals("AZ")) {
            return "💬 Danışıq kitabçası";
        }

        if (language.equals("EN")) {
            return "💬 Phrasebook";
        }

        return "💬 Разговорник";
    }

    private String getSearchHint() {

        if (language.equals("AZ")) {
            return "Axtar...";
        }

        if (language.equals("EN")) {
            return "Search...";
        }

        return "Поиск...";
    }

    private String getFavoritesText() {

        if (showFavoritesOnly) {

            if (language.equals("AZ")) {
                return "⭐ Bütün ifadələr";
            }

            if (language.equals("EN")) {
                return "⭐ All phrases";
            }

            return "⭐ Все фразы";
        }

        if (language.equals("AZ")) {
            return "⭐ Seçilmişlər";
        }

        if (language.equals("EN")) {
            return "⭐ Favorites";
        }

        return "⭐ Избранное";
    }

    private void updateFavoritesButton() {

        if (favoritesButton != null) {

            favoritesButton.setText(
                    getFavoritesText()
            );
        }
    }

    private String getNoResultsText() {

        if (language.equals("AZ")) {
            return "Heç nə tapılmadı";
        }

        if (language.equals("EN")) {
            return "Nothing found";
        }

        return "Ничего не найдено";
    }

    private String getCopiedText() {

        if (language.equals("AZ")) {
            return "Kopyalandı";
        }

        if (language.equals("EN")) {
            return "Copied";
        }

        return "Скопировано";
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