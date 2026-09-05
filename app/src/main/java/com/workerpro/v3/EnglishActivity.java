package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.speech.tts.TextToSpeech;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class EnglishActivity extends Activity {

    private LinearLayout listLayout;
    private EditText searchBox;

    private List<EnglishDictionary.Word> words;

    private TextToSpeech tts;

    private String language = "RU";

    private String selectedCategory = "ALL";

    private String selectedLetter = "ALL";

    private boolean favoritesOnly = false;

    private final Set<String> favorites =
            new HashSet<>();

    private final String[] categories = {
            "ALL",
            "WORK",
            "MACHINE",
            "CNC",
            "STAMPING",
            "FURNACE",
            "FIRE",
            "SAFETY",
            "WELDING",
            "GALVANIC",
            "MAINTENANCE",
            "QUALITY",
            "MEASUREMENT",
            "TOOLS"
    };

    private final String[] letters = {
            "ALL",
            "A", "B", "C", "D", "E", "F",
            "G", "H", "I", "J", "K", "L",
            "M", "N", "O", "P", "Q", "R",
            "S", "T", "U", "V", "W", "X",
            "Y", "Z"
    };

    @Override
    protected void onCreate(
            Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        language =
                getIntent().getStringExtra(
                        "LANGUAGE"
                );

        if (language == null) {
            language = "RU";
        }

        words =
                EnglishDictionary.getWords();

        loadFavorites();

        tts =
                new TextToSpeech(
                        this,
                        status -> {

                            if (status ==
                                    TextToSpeech.SUCCESS) {

                                tts.setLanguage(
                                        Locale.US
                                );
                            }
                        }
                );

        buildScreen();
    }

    private void buildScreen() {

        LinearLayout root =
                new LinearLayout(this);

        root.setOrientation(
                LinearLayout.VERTICAL
        );

        root.setPadding(
                16,
                16,
                16,
                10
        );

        root.setBackgroundColor(
                Color.WHITE
        );

        // ================= TITLE =================

        TextView title =
                new TextView(this);

        title.setText(
                getTitleText()
        );

        title.setTextSize(25);

        title.setTypeface(
                Typeface.DEFAULT,
                Typeface.BOLD
        );

        title.setTextColor(
                Color.rgb(0, 130, 70)
        );

        title.setGravity(
                Gravity.CENTER
        );

        title.setPadding(
                0,
                5,
                0,
                12
        );

        root.addView(title);

        // ================= SEARCH =================

        searchBox =
                new EditText(this);

        searchBox.setHint(
                getSearchHint()
        );

        searchBox.setTextSize(17);

        searchBox.setSingleLine(true);

        searchBox.setPadding(
                18,
                0,
                18,
                0
        );

        root.addView(
                searchBox,
                new LinearLayout.LayoutParams(
                        -1,
                        58
                )
        );

        // ================= FAVORITES =================

        Button favoritesButton =
                new Button(this);

        favoritesButton.setText(
                favoritesOnly
                        ? "⭐ " +
                        getFavoritesText()
                        : "☆ " +
                        getFavoritesText()
        );

        favoritesButton.setTextSize(13);

        favoritesButton.setOnClickListener(
                v -> {

                    favoritesOnly =
                            !favoritesOnly;

                    favoritesButton.setText(
                            favoritesOnly
                                    ? "⭐ " +
                                    getFavoritesText()
                                    : "☆ " +
                                    getFavoritesText()
                    );

                    showWords(
                            searchBox
                                    .getText()
                                    .toString()
                    );
                }
        );

        root.addView(
                favoritesButton,
                new LinearLayout.LayoutParams(
                        -1,
                        52
                )
        );

        // ================= ALPHABET =================

        TextView alphabetTitle =
                new TextView(this);

        alphabetTitle.setText(
                getAlphabetText()
        );

        alphabetTitle.setTextSize(15);

        alphabetTitle.setTypeface(
                Typeface.DEFAULT,
                Typeface.BOLD
        );

        alphabetTitle.setTextColor(
                Color.DKGRAY
        );

        alphabetTitle.setPadding(
                4,
                4,
                4,
                2
        );

        root.addView(
                alphabetTitle
        );

        HorizontalScrollView
                alphabetScroll =
                new HorizontalScrollView(this);

        alphabetScroll
                .setHorizontalScrollBarEnabled(
                        false
                );

        LinearLayout alphabetLayout =
                new LinearLayout(this);

        alphabetLayout.setOrientation(
                LinearLayout.HORIZONTAL
        );

        buildAlphabetButtons(
                alphabetLayout
        );

        alphabetScroll.addView(
                alphabetLayout
        );

        root.addView(
                alphabetScroll,
                new LinearLayout.LayoutParams(
                        -1,
                        58
                )
        );

        // ================= CATEGORIES =================

        TextView categoryTitle =
                new TextView(this);

        categoryTitle.setText(
                getCategoryTitle()
        );

        categoryTitle.setTextSize(15);

        categoryTitle.setTypeface(
                Typeface.DEFAULT,
                Typeface.BOLD
        );

        categoryTitle.setTextColor(
                Color.DKGRAY
        );

        categoryTitle.setPadding(
                4,
                4,
                4,
                2
        );

        root.addView(
                categoryTitle
        );

        HorizontalScrollView
                categoryScroll =
                new HorizontalScrollView(this);

        categoryScroll
                .setHorizontalScrollBarEnabled(
                        false
                );

        LinearLayout categoryLayout =
                new LinearLayout(this);

        categoryLayout.setOrientation(
                LinearLayout.HORIZONTAL
        );

        buildCategoryButtons(
                categoryLayout
        );

        categoryScroll.addView(
                categoryLayout
        );

        root.addView(
                categoryScroll,
                new LinearLayout.LayoutParams(
                        -1,
                        62
                )
        );

        // ================= WORD LIST =================

        listLayout =
                new LinearLayout(this);

        listLayout.setOrientation(
                LinearLayout.VERTICAL
        );

        ScrollView scrollView =
                new ScrollView(this);

        scrollView.addView(
                listLayout
        );

        root.addView(
                scrollView,
                new LinearLayout.LayoutParams(
                        -1,
                        0,
                        1
                )
        );

        // ================= FOOTER =================

        TextView footer =
                new TextView(this);

        footer.setText("F.S");

        footer.setTextSize(13);

        footer.setTextColor(
                Color.GRAY
        );

        footer.setGravity(
                Gravity.CENTER
        );

        root.addView(
                footer
        );

        setContentView(root);

        // ================= SEARCH =================

        searchBox.addTextChangedListener(
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

                        showWords(
                                s.toString()
                        );
                    }

                    @Override
                    public void afterTextChanged(
                            Editable s) {
                    }
                }
        );

        showWords("");
    }

    // ================= ALPHABET =================

    private void buildAlphabetButtons(
            LinearLayout alphabetLayout) {

        alphabetLayout.removeAllViews();

        for (String letter :
                letters) {

            Button button =
                    new Button(this);

            if (letter.equals("ALL")) {

                button.setText(
                        getAllText()
                );

            } else {

                button.setText(
                        letter
                );
            }

            button.setTextSize(12);

            if (letter.equals(
                    selectedLetter)) {

                button.setTextColor(
                        Color.rgb(
                                0,
                                130,
                                70
                        )
                );

                button.setTypeface(
                        Typeface.DEFAULT,
                        Typeface.BOLD
                );
            }

            button.setOnClickListener(
                    v -> {

                        selectedLetter =
                                letter;

                        buildAlphabetButtons(
                                alphabetLayout
                        );

                        showWords(
                                searchBox
                                        .getText()
                                        .toString()
                        );
                    }
            );

            alphabetLayout.addView(
                    button,
                    new LinearLayout.LayoutParams(
                            -2,
                            52
                    )
            );
        }
    }

    // ================= CATEGORIES =================

    private void buildCategoryButtons(
            LinearLayout categoryLayout) {

        categoryLayout.removeAllViews();

        for (String category :
                categories) {

            Button button =
                    new Button(this);

            button.setText(
                    getCategoryText(
                            category
                    )
            );

            button.setTextSize(12);

            if (category.equals(
                    selectedCategory)) {

                button.setTextColor(
                        Color.rgb(
                                0,
                                130,
                                70
                        )
                );

                button.setTypeface(
                        Typeface.DEFAULT,
                        Typeface.BOLD
                );
            }

            button.setOnClickListener(
                    v -> {

                        selectedCategory =
                                category;

                        buildCategoryButtons(
                                categoryLayout
                        );

                        showWords(
                                searchBox
                                        .getText()
                                        .toString()
                        );
                    }
            );

            categoryLayout.addView(
                    button,
                    new LinearLayout.LayoutParams(
                            -2,
                            54
                    )
            );
        }
    }

    // ================= SHOW WORDS =================

    private void showWords(
            String search) {

        if (listLayout == null) {
            return;
        }

        listLayout.removeAllViews();

        String query =
                search.toLowerCase(
                        Locale.ROOT
                );

        int shown = 0;

        for (EnglishDictionary.Word word :
                words) {

            boolean matchesSearch =
                    query.isEmpty()

                            || word.english
                            .toLowerCase(
                                    Locale.ROOT
                            )
                            .contains(query)

                            || word.russian
                            .toLowerCase(
                                    Locale.ROOT
                            )
                            .contains(query)

                            || word.azerbaijani
                            .toLowerCase(
                                    Locale.ROOT
                            )
                            .contains(query);

            boolean matchesCategory =
                    selectedCategory.equals(
                            "ALL"
                    )
                            || selectedCategory.equals(
                            word.category
                    );

            boolean matchesLetter =
                    selectedLetter.equals(
                            "ALL"
                    )
                            || word.english
                            .toUpperCase(
                                    Locale.ROOT
                            )
                            .startsWith(
                                    selectedLetter
                            );

            boolean matchesFavorite =
                    !favoritesOnly

                            || favorites.contains(
                            word.english
                    );

            if (!matchesSearch
                    || !matchesCategory
                    || !matchesLetter
                    || !matchesFavorite) {

                continue;
            }

            addWordCard(word);

            shown++;
        }

        if (shown == 0) {

            TextView empty =
                    new TextView(this);

            empty.setText(
                    getNoResultsText()
            );

            empty.setTextSize(17);

            empty.setTextColor(
                    Color.GRAY
            );

            empty.setGravity(
                    Gravity.CENTER
            );

            empty.setPadding(
                    20,
                    40,
                    20,
                    40
            );

            listLayout.addView(
                    empty,
                    new LinearLayout.LayoutParams(
                            -1,
                            -2
                    )
            );
        }
    }

    // ================= WORD CARD =================

    private void addWordCard(
            EnglishDictionary.Word word) {

        LinearLayout card =
                new LinearLayout(this);

        card.setOrientation(
                LinearLayout.VERTICAL
        );

        card.setPadding(
                18,
                14,
                18,
                14
        );

        card.setBackgroundColor(
                Color.rgb(
                        245,
                        250,
                        247
                )
        );

        LinearLayout.LayoutParams
                cardParams =
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

        TextView text =
                new TextView(this);

        text.setText(
                "🇬🇧 " +
                        word.english
                        + "\n"
                        + "🇷🇺 " +
                        word.russian
                        + "\n"
                        + "🇦🇿 " +
                        word.azerbaijani
        );

        text.setTextSize(17);

        text.setTextColor(
                Color.DKGRAY
        );

        text.setPadding(
                0,
                0,
                0,
                8
        );

        card.addView(text);

        LinearLayout buttons =
                new LinearLayout(this);

        buttons.setOrientation(
                LinearLayout.HORIZONTAL
        );

        // SPEAK

        Button speakButton =
                new Button(this);

        speakButton.setText("🔊");

        speakButton.setTextSize(17);

        speakButton.setOnClickListener(
                v -> speak(
                        word.english
                )
        );

        // COPY

        Button copyButton =
                new Button(this);

        copyButton.setText("📋");

        copyButton.setTextSize(17);

        copyButton.setOnClickListener(
                v -> copyWord(word)
        );

        // FAVORITE

        Button favoriteButton =
                new Button(this);

        favoriteButton.setText(
                favorites.contains(
                        word.english
                )
                        ? "⭐"
                        : "☆"
        );

        favoriteButton.setTextSize(17);

        favoriteButton.setOnClickListener(
                v -> {

                    toggleFavorite(
                            word.english
                    );

                    favoriteButton.setText(
                            favorites.contains(
                                    word.english
                            )
                                    ? "⭐"
                                    : "☆"
                    );

                    if (favoritesOnly) {

                        showWords(
                                searchBox
                                        .getText()
                                        .toString()
                        );
                    }
                }
        );

        buttons.addView(
                speakButton,
                new LinearLayout.LayoutParams(
                        0,
                        50,
                        1
                )
        );

        buttons.addView(
                copyButton,
                new LinearLayout.LayoutParams(
                        0,
                        50,
                        1
                )
        );

        buttons.addView(
                favoriteButton,
                new LinearLayout.LayoutParams(
                        0,
                        50,
                        1
                )
        );

        card.addView(buttons);

        card.setOnClickListener(
                v -> speak(
                        word.english
                )
        );

        listLayout.addView(
                card,
                cardParams
        );
    }

    // ================= SPEAK =================

    private void speak(
            String text) {

        if (tts != null) {

            tts.speak(
                    text,
                    TextToSpeech.QUEUE_FLUSH,
                    null,
                    "word_" +
                            System.currentTimeMillis()
            );
        }
    }

    // ================= COPY =================

    private void copyWord(
            EnglishDictionary.Word word) {

        android.content.ClipboardManager
                clipboard =
                (android.content.ClipboardManager)
                        getSystemService(
                                CLIPBOARD_SERVICE
                        );

        android.content.ClipData clip =
                android.content.ClipData
                        .newPlainText(
                                "WORKER PRO",
                                word.english
                                        + "\n"
                                        + word.russian
                                        + "\n"
                                        + word.azerbaijani
                        );

        clipboard.setPrimaryClip(
                clip
        );

        Toast.makeText(
                this,
                getCopiedText(),
                Toast.LENGTH_SHORT
        ).show();
    }

    // ================= FAVORITES =================

    private void toggleFavorite(
            String english) {

        if (favorites.contains(
                english)) {

            favorites.remove(
                    english
            );

        } else {

            favorites.add(
                    english
            );
        }

        getSharedPreferences(
                "WORKER_PRO_ENGLISH_FAVORITES",
                MODE_PRIVATE
        )
                .edit()
                .putStringSet(
                        "favorites",
                        new HashSet<>(
                                favorites
                        )
                )
                .apply();
    }

    private void loadFavorites() {

        Set<String> saved =
                getSharedPreferences(
                        "WORKER_PRO_ENGLISH_FAVORITES",
                        MODE_PRIVATE
                )
                        .getStringSet(
                                "favorites",
                                null
                        );

        if (saved != null) {

            favorites.clear();

            favorites.addAll(
                    saved
            );
        }
    }

    // ================= TEXT =================

    private String getTitleText() {

        if (language.equals("AZ")) {

            return "🇬🇧 İşçilər üçün İngilis dili";
        }

        if (language.equals("EN")) {

            return "🇬🇧 English for Workers";
        }

        return "🇬🇧 Английский для рабочих";
    }

    private String getSearchHint() {

        if (language.equals("AZ")) {

            return "🔍 Axtarış...";
        }

        if (language.equals("EN")) {

            return "🔍 Search...";
        }

        return "🔍 Поиск...";
    }

    private String getAlphabetText() {

        if (language.equals("AZ")) {

            return "🔤 Əlifba";
        }

        if (language.equals("EN")) {

            return "🔤 Alphabet";
        }

        return "🔤 Алфавит";
    }

    private String getCategoryTitle() {

        if (language.equals("AZ")) {

            return "📂 Kateqoriyalar";
        }

        if (language.equals("EN")) {

            return "📂 Categories";
        }

        return "📂 Категории";
    }

    private String getAllText() {

        if (language.equals("AZ")) {

            return "Hamısı";
        }

        if (language.equals("EN")) {

            return "All";
        }

        return "Все";
    }

    private String getFavoritesText() {

        if (language.equals("AZ")) {

            return "Seçilmişlər";
        }

        if (language.equals("EN")) {

            return "Favorites";
        }

        return "Избранное";
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

    private String getNoResultsText() {

        if (language.equals("AZ")) {

            return "Nəticə tapılmadı";
        }

        if (language.equals("EN")) {

            return "No results";
        }

        return "Ничего не найдено";
    }

    // ================= CATEGORIES =================

    private String getCategoryText(
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

    // ================= DESTROY =================

    @Override
    protected void onDestroy() {

        if (tts != null) {

            tts.stop();

            tts.shutdown();
        }

        super.onDestroy();
    }
}