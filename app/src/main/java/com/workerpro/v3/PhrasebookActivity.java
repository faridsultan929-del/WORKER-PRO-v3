package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.content.Context;
import android.content.SharedPreferences;
import android.speech.tts.TextToSpeech;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public class PhrasebookActivity extends Activity {

    private String language = "RU";

    private EditText searchBox;
    private LinearLayout phrasesContainer;

    private String selectedCategory = "ALL";
    private boolean favoritesOnly = false;

    private final Set<String> favorites = new HashSet<>();

    private TextToSpeech tts;

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

        loadFavorites();

        tts = new TextToSpeech(this, status -> {
            if (status == TextToSpeech.SUCCESS) {
                setSpeechLanguage();
            }
        });

        buildUI();
    }

    private int dp(float value) {
        return (int) (value *
                getResources().getDisplayMetrics().density + 0.5f);
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
        button.setBackgroundColor(Color.rgb(235, 235, 235));

        button.setPadding(
                dp(4),
                dp(4),
                dp(4),
                dp(4));

        button.setClickable(true);
        button.setFocusable(true);

        return button;
    }

    private void buildUI() {

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(Color.WHITE);

        // ================= TITLE =================

        TextView title = new TextView(this);

        title.setText(getTitleText());
        title.setTextSize(24);
        title.setTextColor(Color.rgb(0, 150, 70));
        title.setTypeface(null, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);

        title.setPadding(
                dp(10),
                dp(15),
                dp(10),
                dp(10));

        root.addView(
                title,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));

        // ================= LANGUAGES =================

        HorizontalScrollView languageScroll =
                new HorizontalScrollView(this);

        languageScroll.setHorizontalScrollBarEnabled(false);
        languageScroll.setFillViewport(false);

        LinearLayout languageRow =
                new LinearLayout(this);

        languageRow.setOrientation(
                LinearLayout.HORIZONTAL);

        languageRow.setGravity(
                Gravity.CENTER_VERTICAL);

        String[] languageCodes = {
                "RU",
                "AZ",
                "EN",
                "TR",
                "DE"
        };

        String[] languageNames = {
                "🇷🇺\nRU",
                "🇦🇿\nAZ",
                "🇬🇧\nEN",
                "🇹🇷\nTR",
                "🇩🇪\nDE"
        };

        for (int i = 0;
             i < languageCodes.length;
             i++) {

            Button button = new Button(this);

            button.setText(languageNames[i]);
            button.setTextSize(14);
            button.setAllCaps(false);
            button.setGravity(Gravity.CENTER);

            button.setPadding(
                    dp(2),
                    0,
                    dp(2),
                    0);

            if (language.equals(languageCodes[i])) {

                button.setBackgroundColor(
                        Color.rgb(0, 150, 70));

                button.setTextColor(Color.WHITE);

            } else {

                button.setBackgroundColor(
                        Color.LTGRAY);

                button.setTextColor(Color.DKGRAY);
            }

            final String selectedLanguage =
                    languageCodes[i];

            button.setOnClickListener(v -> {

                language = selectedLanguage;

                buildUI();
            });

            LinearLayout.LayoutParams params =
                    new LinearLayout.LayoutParams(
                            dp(70),
                            dp(58));

            params.setMargins(
                    dp(4),
                    dp(2),
                    dp(4),
                    dp(5));

            languageRow.addView(
                    button,
                    params);
        }

        languageScroll.addView(languageRow);

        root.addView(
                languageScroll,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));

        // ================= SEARCH =================

        LinearLayout searchRow =
                new LinearLayout(this);

        searchRow.setOrientation(
                LinearLayout.HORIZONTAL);

        searchRow.setGravity(
                Gravity.CENTER_VERTICAL);

        searchRow.setPadding(
                dp(10),
                dp(5),
                dp(10),
                dp(5));

        searchBox = new EditText(this);

        searchBox.setHint(getSearchHint());
        searchBox.setTextSize(16);
        searchBox.setSingleLine(true);

        searchRow.addView(
                searchBox,
                new LinearLayout.LayoutParams(
                        0,
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        1));

        TextView searchIcon =
                new TextView(this);

        searchIcon.setText("🔍");
        searchIcon.setTextSize(25);
        searchIcon.setGravity(Gravity.CENTER);

        searchIcon.setPadding(
                dp(10),
                0,
                dp(10),
                0);

        searchRow.addView(
                searchIcon,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));

        root.addView(searchRow);

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

                        refreshPhrases();
                    }

                    @Override
                    public void afterTextChanged(
                            android.text.Editable s) {
                    }
                });

        // ================= CATEGORY TITLE =================

        TextView categoryTitle =
                new TextView(this);

        categoryTitle.setText(
                getCategoryTitle());

        categoryTitle.setTextSize(18);
        categoryTitle.setTextColor(Color.DKGRAY);
        categoryTitle.setTypeface(null, Typeface.BOLD);
        categoryTitle.setGravity(Gravity.CENTER_VERTICAL);

        categoryTitle.setPadding(
                dp(12),
                dp(8),
                dp(12),
                dp(8));

        root.addView(
                categoryTitle,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));

        // ================= CATEGORIES =================

        HorizontalScrollView categoryScroll =
                new HorizontalScrollView(this);

        categoryScroll.setHorizontalScrollBarEnabled(false);

        LinearLayout categoryRow =
                new LinearLayout(this);

        categoryRow.setOrientation(
                LinearLayout.HORIZONTAL);

        categoryRow.setGravity(
                Gravity.CENTER_VERTICAL);

        for (String category : categories) {

            Button button = new Button(this);

            button.setText(
                    getCategoryName(category));

            button.setTextSize(14);
            button.setAllCaps(false);
            button.setGravity(Gravity.CENTER);

            button.setPadding(
                    dp(12),
                    0,
                    dp(12),
                    0);

            if (selectedCategory.equals(category)) {

                button.setBackgroundColor(
                        Color.rgb(0, 150, 70));

                button.setTextColor(Color.WHITE);

            } else {

                button.setBackgroundColor(
                        Color.LTGRAY);

                button.setTextColor(Color.DKGRAY);
            }

            button.setOnClickListener(v -> {

                selectedCategory = category;

                refreshPhrases();

                buildUI();
            });

            LinearLayout.LayoutParams params =
                    new LinearLayout.LayoutParams(
                            ViewGroup.LayoutParams.WRAP_CONTENT,
                            dp(52));

            params.setMargins(
                    dp(3),
                    dp(2),
                    dp(3),
                    dp(5));

            categoryRow.addView(
                    button,
                    params);
        }

        categoryScroll.addView(categoryRow);

        root.addView(
                categoryScroll,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));

        // ================= FAVORITES =================

        Button favoritesButton =
                new Button(this);

        favoritesButton.setText(
                getFavoriteButtonText());

        favoritesButton.setTextSize(14);
        favoritesButton.setAllCaps(false);

        favoritesButton.setOnClickListener(v -> {

            favoritesOnly = !favoritesOnly;

            buildUI();
        });

        if (favoritesOnly) {

            favoritesButton.setBackgroundColor(
                    Color.rgb(0, 150, 70));

            favoritesButton.setTextColor(Color.WHITE);
        }

        root.addView(
                favoritesButton,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));

        // ================= PHRASES =================

        ScrollView scrollView =
                new ScrollView(this);

        phrasesContainer =
                new LinearLayout(this);

        phrasesContainer.setOrientation(
                LinearLayout.VERTICAL);

        phrasesContainer.setPadding(
                dp(10),
                dp(5),
                dp(10),
                dp(10));

        scrollView.addView(phrasesContainer);

        root.addView(
                scrollView,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        0,
                        1));

        // ================= BACK =================

        Button backButton =
                new Button(this);

        backButton.setText(getBackText());
        backButton.setTextSize(14);
        backButton.setAllCaps(false);

        backButton.setOnClickListener(
                v -> finish());

        root.addView(
                backButton,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));

        // ================= FOOTER =================

        TextView footer =
                new TextView(this);

        footer.setText("F.S");
        footer.setTextSize(14);
        footer.setTextColor(Color.GRAY);
        footer.setGravity(Gravity.CENTER);

        footer.setPadding(
                dp(5),
                dp(5),
                dp(5),
                dp(8));

        root.addView(footer);

        setContentView(root);

        refreshPhrases();
    }

    // =========================================================
    // REFRESH
    // =========================================================

    private void refreshPhrases() {

        if (phrasesContainer == null) {
            return;
        }

        phrasesContainer.removeAllViews();

        String search = "";

        if (searchBox != null &&
                searchBox.getText() != null) {

            search = searchBox.getText()
                    .toString()
                    .trim()
                    .toLowerCase(Locale.ROOT);
        }

        List<WorkerPhrasebook.Phrase> result =
                new ArrayList<>();

        for (WorkerPhrasebook.Phrase phrase :
                WorkerPhrasebook.getPhrases()) {

            boolean categoryMatch =
                    selectedCategory.equals("ALL")
                            || phrase.category.equals(
                            selectedCategory);

            boolean searchMatch =
                    search.isEmpty()
                            || contains(phrase.english, search)
                            || contains(phrase.russian, search)
                            || contains(phrase.azerbaijani, search)
                            || contains(phrase.turkish, search)
                            || contains(phrase.german, search);

            boolean favoriteMatch =
                    !favoritesOnly
                            || favorites.contains(
                            phrase.english);

            if (categoryMatch &&
                    searchMatch &&
                    favoriteMatch) {

                result.add(phrase);
            }
        }

        if (result.isEmpty()) {

            TextView noResults =
                    new TextView(this);

            noResults.setText(
                    getNoResultsText());

            noResults.setTextSize(18);
            noResults.setTextColor(Color.GRAY);
            noResults.setGravity(Gravity.CENTER);

            noResults.setPadding(
                    dp(10),
                    dp(40),
                    dp(10),
                    dp(40));

            phrasesContainer.addView(
                    noResults);

            return;
        }

        for (WorkerPhrasebook.Phrase phrase :
                result) {

            addPhraseCard(phrase);
        }
    }

    private boolean contains(
            String text,
            String search) {

        if (text == null) {
            return false;
        }

        return text.toLowerCase(
                Locale.ROOT)
                .contains(search);
    }

    // =========================================================
    // PHRASE CARD
    // =========================================================

    private void addPhraseCard(
            WorkerPhrasebook.Phrase phrase) {

        LinearLayout card =
                new LinearLayout(this);

        card.setOrientation(
                LinearLayout.VERTICAL);

        card.setPadding(
                dp(15),
                dp(12),
                dp(15),
                dp(12));

        card.setBackgroundColor(
                Color.rgb(245, 245, 245));

        LinearLayout.LayoutParams cardParams =
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);

        cardParams.setMargins(
                dp(5),
                dp(5),
                dp(5),
                dp(8));

        // ================= ENGLISH =================

        TextView english =
                new TextView(this);

        english.setText(
                "🇬🇧 " + phrase.english);

        english.setTextSize(18);
        english.setTextColor(
                Color.rgb(0, 120, 60));

        english.setTypeface(
                null,
                Typeface.BOLD);

        english.setPadding(
                0,
                dp(2),
                0,
                dp(4));

        card.addView(english);

        // ================= RUSSIAN =================

        TextView russian =
                new TextView(this);

        russian.setText(
                "🇷🇺 " + phrase.russian);

        russian.setTextSize(16);
        russian.setTextColor(Color.DKGRAY);

        card.addView(russian);

        // ================= AZERBAIJANI =================

        TextView azerbaijani =
                new TextView(this);

        azerbaijani.setText(
                "🇦🇿 " + phrase.azerbaijani);

        azerbaijani.setTextSize(16);
        azerbaijani.setTextColor(Color.DKGRAY);

        card.addView(azerbaijani);

        // ================= TURKISH =================

        TextView turkish =
                new TextView(this);

        turkish.setText(
                "🇹🇷 " + phrase.turkish);

        turkish.setTextSize(16);
        turkish.setTextColor(Color.DKGRAY);

        card.addView(turkish);

        // ================= GERMAN =================

        TextView german =
                new TextView(this);

        german.setText(
                "🇩🇪 " + phrase.german);

        german.setTextSize(16);
        german.setTextColor(Color.DKGRAY);

        card.addView(german);

        // =====================================================
        // ACTION BUTTONS
        // =====================================================

        LinearLayout buttons =
                new LinearLayout(this);

        buttons.setOrientation(
                LinearLayout.HORIZONTAL);

        buttons.setGravity(
                Gravity.CENTER_VERTICAL);

        buttons.setPadding(
                0,
                dp(8),
                0,
                0);

        // ================= SPEAKER =================

        TextView speakButton =
                createActionButton("🔊", 26);

        speakButton.setTextColor(
                Color.rgb(0, 130, 60));

        speakButton.setContentDescription(
                "Speak");

        speakButton.setOnClickListener(v -> {

            setSpeechLanguage();

            String text =
                    getSpeechText(phrase);

            if (tts != null) {

                tts.speak(
                        text,
                        TextToSpeech.QUEUE_FLUSH,
                        null,
                        "worker_phrase");
            }
        });

        LinearLayout.LayoutParams speakParams =
                new LinearLayout.LayoutParams(
                        dp(70),
                        dp(58));

        speakParams.setMargins(
                0,
                0,
                dp(8),
                0);

        buttons.addView(
                speakButton,
                speakParams);

        // ================= COPY =================

        TextView copyButton =
                createActionButton("📋", 25);

        copyButton.setContentDescription(
                "Copy");

        copyButton.setOnClickListener(v -> {

            android.content.ClipboardManager clipboard =
                    (android.content.ClipboardManager)
                            getSystemService(
                                    Context.CLIPBOARD_SERVICE);

            android.content.ClipData clip =
                    android.content.ClipData.newPlainText(
                            "WORKER PRO",
                            "🇬🇧 " + phrase.english +
                                    "\n🇷🇺 " + phrase.russian +
                                    "\n🇦🇿 " + phrase.azerbaijani +
                                    "\n🇹🇷 " + phrase.turkish +
                                    "\n🇩🇪 " + phrase.german);

            clipboard.setPrimaryClip(clip);

            Toast.makeText(
                    this,
                    getCopiedText(),
                    Toast.LENGTH_SHORT)
                    .show();
        });

        LinearLayout.LayoutParams copyParams =
                new LinearLayout.LayoutParams(
                        dp(70),
                        dp(58));

        copyParams.setMargins(
                0,
                0,
                dp(8),
                0);

        buttons.addView(
                copyButton,
                copyParams);

        // ================= FAVORITE =================

        TextView favoriteButton =
                createActionButton(
                        favorites.contains(
                                phrase.english)
                                ? "⭐"
                                : "☆",
                        26);

        favoriteButton.setContentDescription(
                "Favorite");

        favoriteButton.setOnClickListener(v -> {

            if (favorites.contains(
                    phrase.english)) {

                favorites.remove(
                        phrase.english);

            } else {

                favorites.add(
                        phrase.english);
            }

            saveFavorites();

            refreshPhrases();
        });

        buttons.addView(
                favoriteButton,
                new LinearLayout.LayoutParams(
                        dp(70),
                        dp(58)));

        card.addView(buttons);

        phrasesContainer.addView(
                card,
                cardParams);
    }

    // =========================================================
    // SPEECH
    // =========================================================

    private String getSpeechText(
            WorkerPhrasebook.Phrase phrase) {

        switch (language) {

            case "RU":
                return phrase.russian;

            case "AZ":
                return phrase.azerbaijani;

            case "TR":
                return phrase.turkish;

            case "DE":
                return phrase.german;

            case "EN":
            default:
                return phrase.english;
        }
    }

    private void setSpeechLanguage() {

        if (tts == null) {
            return;
        }

        Locale locale;

        switch (language) {

            case "RU":
                locale = new Locale("ru");
                break;

            case "AZ":
                locale = new Locale("az");
                break;

            case "TR":
                locale = new Locale("tr");
                break;

            case "DE":
                locale = Locale.GERMAN;
                break;

            case "EN":
            default:
                locale = Locale.US;
                break;
        }

        tts.setLanguage(locale);
    }

    // =========================================================
    // FAVORITES
    // =========================================================

    private void loadFavorites() {

        SharedPreferences preferences =
                getSharedPreferences(
                        "WORKER_PRO_FAVORITES",
                        MODE_PRIVATE);

        favorites.addAll(
                preferences.getStringSet(
                        "phrases",
                        new HashSet<>()));
    }

    private void saveFavorites() {

        SharedPreferences preferences =
                getSharedPreferences(
                        "WORKER_PRO_FAVORITES",
                        MODE_PRIVATE);

        preferences.edit()
                .putStringSet(
                        "phrases",
                        new HashSet<>(favorites))
                .apply();
    }

    // =========================================================
    // TITLE
    // =========================================================

    private String getTitleText() {

        switch (language) {

            case "AZ":
                return "💬 Danışıq kitabçası";

            case "EN":
                return "💬 Phrasebook";

            case "TR":
                return "💬 Konuşma Kitabı";

            case "DE":
                return "💬 Sprachführer";

            case "RU":
            default:
                return "💬 Разговорник";
        }
    }

    // =========================================================
    // SEARCH
    // =========================================================

    private String getSearchHint() {

        switch (language) {

            case "AZ":
                return "Axtar...";

            case "EN":
                return "Search...";

            case "TR":
                return "Ara...";

            case "DE":
                return "Suchen...";

            case "RU":
            default:
                return "Поиск...";
        }
    }

    // =========================================================
    // CATEGORY TITLE
    // =========================================================

    private String getCategoryTitle() {

        switch (language) {

            case "AZ":
                return "Bölmələr";

            case "EN":
                return "Sections";

            case "TR":
                return "Bölümler";

            case "DE":
                return "Bereiche";

            case "RU":
            default:
                return "Разделы";
        }
    }

    // =========================================================
    // CATEGORY NAMES
    // =========================================================

    private String getCategoryName(
            String category) {

        if (language.equals("RU")) {

            switch (category) {

                case "ALL":
                    return "Все";
                case "WORK":
                    return "Работа";
                case "BOSS":
                    return "Начальник";
                case "MACHINE":
                    return "Станок";
                case "CNC":
                    return "CNC";
                case "STAMPING":
                    return "Штамповка";
                case "QUALITY":
                    return "Качество";
                case "SAFETY":
                    return "Безопасность";
                case "FIRE":
                    return "Пожар";
                case "WELDING":
                    return "Сварка";
                case "GALVANIC":
                    return "Гальваника";
                case "MAINTENANCE":
                    return "Обслуживание";
                case "EMERGENCY":
                    return "Авария";
            }
        }

        if (language.equals("AZ")) {

            switch (category) {

                case "ALL":
                    return "Hamısı";
                case "WORK":
                    return "İş";
                case "BOSS":
                    return "Rəhbər";
                case "MACHINE":
                    return "Dəzgah";
                case "CNC":
                    return "CNC";
                case "STAMPING":
                    return "Ştamplama";
                case "QUALITY":
                    return "Keyfiyyət";
                case "SAFETY":
                    return "Təhlükəsizlik";
                case "FIRE":
                    return "Yanğın";
                case "WELDING":
                    return "Qaynaq";
                case "GALVANIC":
                    return "Qalvanika";
                case "MAINTENANCE":
                    return "Texniki xidmət";
                case "EMERGENCY":
                    return "Fövqəladə";
            }
        }

        if (language.equals("TR")) {

            switch (category) {

                case "ALL":
                    return "Tümü";
                case "WORK":
                    return "İş";
                case "BOSS":
                    return "Patron";
                case "MACHINE":
                    return "Makine";
                case "CNC":
                    return "CNC";
                case "STAMPING":
                    return "Presleme";
                case "QUALITY":
                    return "Kalite";
                case "SAFETY":
                    return "Güvenlik";
                case "FIRE":
                    return "Yangın";
                case "WELDING":
                    return "Kaynak";
                case "GALVANIC":
                    return "Galvanik";
                case "MAINTENANCE":
                    return "Bakım";
                case "EMERGENCY":
                    return "Acil Durum";
            }
        }

        if (language.equals("DE")) {

            switch (category) {

                case "ALL":
                    return "Alle";
                case "WORK":
                    return "Arbeit";
                case "BOSS":
                    return "Chef";
                case "MACHINE":
                    return "Maschine";
                case "CNC":
                    return "CNC";
                case "STAMPING":
                    return "Stanzen";
                case "QUALITY":
                    return "Qualität";
                case "SAFETY":
                    return "Sicherheit";
                case "FIRE":
                    return "Feuer";
                case "WELDING":
                    return "Schweißen";
                case "GALVANIC":
                    return "Galvanik";
                case "MAINTENANCE":
                    return "Wartung";
                case "EMERGENCY":
                    return "Notfall";
            }
        }

        switch (category) {

            case "ALL":
                return "All";
            case "WORK":
                return "Work";
            case "BOSS":
                return "Boss";
            case "MACHINE":
                return "Machine";
            case "CNC":
                return "CNC";
            case "STAMPING":
                return "Stamping";
            case "QUALITY":
                return "Quality";
            case "SAFETY":
                return "Safety";
            case "FIRE":
                return "Fire";
            case "WELDING":
                return "Welding";
            case "GALVANIC":
                return "Galvanic";
            case "MAINTENANCE":
                return "Maintenance";
            case "EMERGENCY":
                return "Emergency";

            default:
                return category;
        }
    }

    // =========================================================
    // FAVORITES TEXT
    // =========================================================

    private String getFavoriteButtonText() {

        if (favoritesOnly) {

            switch (language) {

                case "AZ":
                    return "⭐ Seçilmişlər";
                case "EN":
                    return "⭐ Favorites";
                case "TR":
                    return "⭐ Favoriler";
                case "DE":
                    return "⭐ Favoriten";
                case "RU":
                default:
                    return "⭐ Избранное";
            }
        }

        switch (language) {

            case "AZ":
                return "☆ Seçilmişlər";
            case "EN":
                return "☆ Favorites";
            case "TR":
                return "☆ Favoriler";
            case "DE":
                return "☆ Favoriten";
            case "RU":
            default:
                return "☆ Избранное";
        }
    }

    // =========================================================
    // NO RESULTS
    // =========================================================

    private String getNoResultsText() {

        switch (language) {

            case "AZ":
                return "Heç nə tapılmadı";

            case "EN":
                return "Nothing found";

            case "TR":
                return "Sonuç bulunamadı";

            case "DE":
                return "Nichts gefunden";

            case "RU":
            default:
                return "Ничего не найдено";
        }
    }

    // =========================================================
    // COPIED
    // =========================================================

    private String getCopiedText() {

        switch (language) {

            case "AZ":
                return "Kopyalandı";

            case "EN":
                return "Copied";

            case "TR":
                return "Kopyalandı";

            case "DE":
                return "Kopiert";

            case "RU":
            default:
                return "Скопировано";
        }
    }

    // =========================================================
    // BACK
    // =========================================================

    private String getBackText() {

        switch (language) {

            case "AZ":
                return "← Geri";

            case "EN":
                return "← Back";

            case "TR":
                return "← Geri";

            case "DE":
                return "← Zurück";

            case "RU":
            default:
                return "← Назад";
        }
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