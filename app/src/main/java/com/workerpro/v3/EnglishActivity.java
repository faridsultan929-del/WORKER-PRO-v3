package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class EnglishActivity extends Activity {

    private LinearLayout listLayout;
    private EditText searchBox;
    private List<EnglishDictionary.Word> words;

    private String language = "RU";
    private String selectedCategory = "ALL";

    private TextToSpeech textToSpeech;

    private final Set<String> favorites = new HashSet<>();

    private final String GREEN = "#008746";
    private final String LIGHT_GREEN = "#F0F8F3";
    private final String DARK = "#333333";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        language = getIntent().getStringExtra("LANGUAGE");

        if (language == null) {
            language = "RU";
        }

        words = EnglishDictionary.getWords();

        loadFavorites();

        textToSpeech = new TextToSpeech(
                this,
                status -> {
                    if (status == TextToSpeech.SUCCESS) {
                        textToSpeech.setLanguage(Locale.US);
                    }
                }
        );

        createInterface();
    }

    private void createInterface() {

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(16, 12, 16, 8);
        root.setBackgroundColor(Color.WHITE);

        // TITLE
        TextView title = new TextView(this);

        title.setText(getTitleText());
        title.setTextSize(25);
        title.setTextColor(Color.rgb(0, 130, 70));
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 8, 0, 14);

        root.addView(title);

        // SEARCH
        searchBox = new EditText(this);

        searchBox.setHint(getSearchHint());
        searchBox.setTextSize(16);
        searchBox.setSingleLine(true);
        searchBox.setPadding(18, 0, 18, 0);

        root.addView(
                searchBox,
                new LinearLayout.LayoutParams(
                        -1,
                        58
                )
        );

        // CATEGORY BUTTONS
        HorizontalScrollView categoryScroll =
                new HorizontalScrollView(this);

        categoryScroll.setHorizontalScrollBarEnabled(false);

        LinearLayout categoryLayout =
                new LinearLayout(this);

        categoryLayout.setOrientation(
                LinearLayout.HORIZONTAL
        );

        addCategoryButton(
                categoryLayout,
                "ALL",
                getCategoryName("ALL")
        );

        addCategoryButton(
                categoryLayout,
                "WORK",
                getCategoryName("WORK")
        );

        addCategoryButton(
                categoryLayout,
                "MACHINE",
                getCategoryName("MACHINE")
        );

        addCategoryButton(
                categoryLayout,
                "CNC",
                getCategoryName("CNC")
        );

        addCategoryButton(
                categoryLayout,
                "STAMPING",
                getCategoryName("STAMPING")
        );

        addCategoryButton(
                categoryLayout,
                "FURNACE",
                getCategoryName("FURNACE")
        );

        addCategoryButton(
                categoryLayout,
                "FIRE",
                getCategoryName("FIRE")
        );

        addCategoryButton(
                categoryLayout,
                "SAFETY",
                getCategoryName("SAFETY")
        );

        addCategoryButton(
                categoryLayout,
                "WELDING",
                getCategoryName("WELDING")
        );

        addCategoryButton(
                categoryLayout,
                "GALVANIC",
                getCategoryName("GALVANIC")
        );

        addCategoryButton(
                categoryLayout,
                "MAINTENANCE",
                getCategoryName("MAINTENANCE")
        );

        addCategoryButton(
                categoryLayout,
                "QUALITY",
                getCategoryName("QUALITY")
        );

        addCategoryButton(
                categoryLayout,
                "MEASUREMENT",
                getCategoryName("MEASUREMENT")
        );

        addCategoryButton(
                categoryLayout,
                "TOOLS",
                getCategoryName("TOOLS")
        );

        categoryScroll.addView(categoryLayout);

        root.addView(
                categoryScroll,
                new LinearLayout.LayoutParams(
                        -1,
                        55
                )
        );

        // WORD LIST
        listLayout = new LinearLayout(this);

        listLayout.setOrientation(
                LinearLayout.VERTICAL
        );

        ScrollView scrollView =
                new ScrollView(this);

        scrollView.addView(listLayout);

        LinearLayout.LayoutParams scrollParams =
                new LinearLayout.LayoutParams(
                        -1,
                        0,
                        1
                );

        root.addView(
                scrollView,
                scrollParams
        );

        // FOOTER
        TextView footer = new TextView(this);

        footer.setText("F.S");
        footer.setTextSize(13);
        footer.setTextColor(Color.GRAY);
        footer.setGravity(Gravity.CENTER);
        footer.setPadding(0, 6, 0, 2);

        root.addView(
                footer,
                new LinearLayout.LayoutParams(
                        -1,
                        28
                )
        );

        setContentView(root);

        showWords("");

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

                        showWords(s.toString());
                    }

                    @Override
                    public void afterTextChanged(
                            android.text.Editable s) {
                    }
                }
        );
    }

    private void addCategoryButton(
            LinearLayout parent,
            String category,
            String text) {

        TextView button = new TextView(this);

        button.setText(text);
        button.setTextSize(14);
        button.setGravity(Gravity.CENTER);
        button.setPadding(18, 0, 18, 0);

        if (selectedCategory.equals(category)) {
            button.setTextColor(Color.WHITE);
            button.setBackgroundColor(
                    Color.rgb(0, 135, 70)
            );
        } else {
            button.setTextColor(
                    Color.rgb(0, 120, 65)
            );
            button.setBackgroundColor(
                    Color.rgb(235, 247, 239)
            );
        }

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        -2,
                        48
                );

        params.setMargins(4, 2, 4, 2);

        parent.addView(button, params);

        button.setOnClickListener(v -> {

            selectedCategory = category;

            createInterface();
        });
    }

    private void showWords(String search) {

        if (listLayout == null) {
            return;
        }

        listLayout.removeAllViews();

        String query =
                search.toLowerCase(Locale.ROOT).trim();

        for (EnglishDictionary.Word word : words) {

            boolean matchesSearch =
                    query.isEmpty()
                            || word.english
                            .toLowerCase(Locale.ROOT)
                            .contains(query)
                            || word.russian
                            .toLowerCase(Locale.ROOT)
                            .contains(query)
                            || word.azerbaijani
                            .toLowerCase(Locale.ROOT)
                            .contains(query);

            boolean matchesCategory =
                    selectedCategory.equals("ALL")
                            || word.category
                            .equals(selectedCategory);

            if (!matchesSearch || !matchesCategory) {
                continue;
            }

            addWordItem(word);
        }
    }

    private void addWordItem(
            EnglishDictionary.Word word) {

        LinearLayout card =
                new LinearLayout(this);

        card.setOrientation(
                LinearLayout.VERTICAL
        );

        card.setPadding(
                16,
                14,
                16,
                14
        );

        card.setBackgroundColor(
                Color.rgb(245, 250, 247)
        );

        LinearLayout.LayoutParams cardParams =
                new LinearLayout.LayoutParams(
                        -1,
                        -2
                );

        cardParams.setMargins(
                0,
                0,
                0,
                12
        );

        // ENGLISH WORD
        TextView english =
                new TextView(this);

        english.setText(
                "🇬🇧 " + word.english
        );

        english.setTextSize(19);
        english.setTextColor(
                Color.rgb(0, 120, 65)
        );

        english.setTypeface(
                Typeface.DEFAULT,
                Typeface.BOLD
        );

        card.addView(english);

        // TRANSLATIONS
        TextView translations =
                new TextView(this);

        translations.setText(
                "🇷🇺 " + word.russian
                        + "\n🇦🇿 " + word.azerbaijani
        );

        translations.setTextSize(16);
        translations.setTextColor(
                Color.DKGRAY
        );

        translations.setPadding(
                0,
                8,
                0,
                8
        );

        card.addView(translations);

        // BUTTON ROW
        LinearLayout buttons =
                new LinearLayout(this);

        buttons.setOrientation(
                LinearLayout.HORIZONTAL
        );

        // SPEAKER
        TextView speak =
                createActionButton("🔊");

        speak.setOnClickListener(
                v -> speakEnglish(word.english)
        );

        buttons.addView(speak);

        // COPY
        TextView copy =
                createActionButton("📋");

        copy.setOnClickListener(
                v -> copyWord(word)
        );

        buttons.addView(copy);

        // FAVORITE
        TextView favorite =
                createActionButton(
                        favorites.contains(word.english)
                                ? "⭐"
                                : "☆"
                );

        favorite.setOnClickListener(v -> {

            toggleFavorite(word.english);

            favorite.setText(
                    favorites.contains(word.english)
                            ? "⭐"
                            : "☆"
            );
        });

        buttons.addView(favorite);

        card.addView(buttons);

        listLayout.addView(
                card,
                cardParams
        );
    }

    private TextView createActionButton(
            String text) {

        TextView button =
                new TextView(this);

        button.setText(text);
        button.setTextSize(20);
        button.setGravity(Gravity.CENTER);
        button.setPadding(
                18,
                4,
                18,
                4
        );

        return button;
    }

    private void speakEnglish(String text) {

        if (textToSpeech != null) {

            textToSpeech.speak(
                    text,
                    TextToSpeech.QUEUE_FLUSH,
                    null,
                    "worker_word"
            );
        }
    }

    private void copyWord(
            EnglishDictionary.Word word) {

        String text =
                word.english
                        + "\n"
                        + word.russian
                        + "\n"
                        + word.azerbaijani;

        ClipboardManager clipboard =
                (ClipboardManager)
                        getSystemService(
                                Context.CLIPBOARD_SERVICE
                        );

        ClipData clip =
                ClipData.newPlainText(
                        "WORKER PRO",
                        text
                );

        clipboard.setPrimaryClip(clip);

        Toast.makeText(
                this,
                getCopiedText(),
                Toast.LENGTH_SHORT
        ).show();
    }

    private void toggleFavorite(
            String english) {

        if (favorites.contains(english)) {
            favorites.remove(english);
        } else {
            favorites.add(english);
        }

        saveFavorites();
    }

    private void loadFavorites() {

        android.content.SharedPreferences prefs =
                getSharedPreferences(
                        "WORKER_PRO_DICTIONARY",
                        MODE_PRIVATE
                );

        favorites.addAll(
                prefs.getStringSet(
                        "FAVORITES",
                        new HashSet<>()
                )
        );
    }

    private void saveFavorites() {

        android.content.SharedPreferences prefs =
                getSharedPreferences(
                        "WORKER_PRO_DICTIONARY",
                        MODE_PRIVATE
                );

        prefs.edit()
                .putStringSet(
                        "FAVORITES",
                        new HashSet<>(favorites)
                )
                .apply();
    }

    private String getTitleText() {

        if (language.equals("AZ")) {
            return "🇬🇧 İşçilər üçün İngilis dili";
        }

        if (language.equals("EN")) {
            return "🇬🇧 English for Workers";
        }

        return "🇬🇧 Английский для работников";
    }

    private String getSearchHint() {

        if (language.equals("AZ")) {
            return "🔍 Axtar...";
        }

        if (language.equals("EN")) {
            return "🔍 Search...";
        }

        return "🔍 Поиск...";
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

    private String getCategoryName(
            String category) {

        if (language.equals("AZ")) {

            switch (category) {

                case "ALL":
                    return "Hamısı";

                case "WORK":
                    return "🏭 İş";

                case "MACHINE":
                    return "⚙️ Dəzgah";

                case "CNC":
                    return "🖥 CNC";

                case "STAMPING":
                    return "🔨 Ştamplama";

                case "FURNACE":
                    return "🔥 Sobalar";

                case "FIRE":
                    return "🧯 Yanğın";

                case "SAFETY":
                    return "🦺 Təhlükəsizlik";

                case "WELDING":
                    return "⚡ Qaynaq";

                case "GALVANIC":
                    return "🧪 Qalvanika";

                case "MAINTENANCE":
                    return "🔧 Texniki xidmət";

                case "QUALITY":
                    return "✅ Keyfiyyət";

                case "MEASUREMENT":
                    return "📏 Ölçmə";

                case "TOOLS":
                    return "🛠 Alətlər";
            }
        }

        if (language.equals("EN")) {

            switch (category) {

                case "ALL":
                    return "All";

                case "WORK":
                    return "🏭 Work";

                case "MACHINE":
                    return "⚙️ Machine";

                case "CNC":
                    return "🖥 CNC";

                case "STAMPING":
                    return "🔨 Stamping";

                case "FURNACE":
                    return "🔥 Furnaces";

                case "FIRE":
                    return "🧯 Fire";

                case "SAFETY":
                    return "🦺 Safety";

                case "WELDING":
                    return "⚡ Welding";

                case "GALVANIC":
                    return "🧪 Galvanic";

                case "MAINTENANCE":
                    return "🔧 Maintenance";

                case "QUALITY":
                    return "✅ Quality";

                case "MEASUREMENT":
                    return "📏 Measurement";

                case "TOOLS":
                    return "🛠 Tools";
            }
        }

        // RUSSIAN

        switch (category) {

            case "ALL":
                return "Все";

            case "WORK":
                return "🏭 Работа";

            case "MACHINE":
                return "⚙️ Станок";

            case "CNC":
                return "🖥 CNC";

            case "STAMPING":
                return "🔨 Штамповка";

            case "FURNACE":
                return "🔥 Печи";

            case "FIRE":
                return "🧯 Пожар";

            case "SAFETY":
                return "🦺 Безопасность";

            case "WELDING":
                return "⚡ Сварка";

            case "GALVANIC":
                return "🧪 Гальваника";

            case "MAINTENANCE":
                return "🔧 Обслуживание";

            case "QUALITY":
                return "✅ Качество";

            case "MEASUREMENT":
                return "📏 Измерение";

            case "TOOLS":
                return "🛠 Инструменты";
        }

        return category;
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