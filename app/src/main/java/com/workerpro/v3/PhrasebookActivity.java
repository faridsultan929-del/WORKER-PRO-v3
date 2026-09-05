package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
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

    // =========================
    // DP
    // =========================

    private int dp(int value) {
        return (int) (
                value *
                getResources()
                        .getDisplayMetrics()
                        .density + 0.5f
        );
    }

    // =========================
    // ON CREATE
    // =========================

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String receivedLanguage =
                getIntent().getStringExtra("LANGUAGE");

        if (receivedLanguage != null) {
            language = receivedLanguage;
        }

        favorites.addAll(
                getSharedPreferences(
                        "WORKER_PRO_PHRASE_FAVORITES",
                        MODE_PRIVATE
                ).getStringSet(
                        "favorites",
                        new HashSet<String>()
                )
        );

        tts = new TextToSpeech(
                this,
                status -> {

                    if (status == TextToSpeech.SUCCESS) {

                        tts.setLanguage(
                                Locale.US
                        );
                    }
                }
        );

        createScreen();
    }

    // =========================
    // SCREEN
    // =========================

    private void createScreen() {

        LinearLayout root =
                new LinearLayout(this);

        root.setOrientation(
                LinearLayout.VERTICAL
        );

        root.setBackgroundColor(
                Color.WHITE
        );

        root.setPadding(
                dp(8),
                dp(8),
                dp(8),
                dp(4)
        );

        // =========================
        // TITLE
        // =========================

        TextView title =
                new TextView(this);

        title.setText(
                getTitleText()
        );

        title.setTextSize(24);

        title.setTextColor(
                Color.BLACK
        );

        title.setTypeface(
                null,
                Typeface.BOLD
        );

        title.setGravity(
                Gravity.CENTER
        );

        title.setIncludeFontPadding(
                false
        );

        title.setPadding(
                0,
                dp(6),
                0,
                dp(8)
        );

        root.addView(
                title,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        dp(52)
                )
        );

        // =========================
        // LANGUAGES
        // =========================

        HorizontalScrollView languageScroll =
                new HorizontalScrollView(this);

        languageScroll.setHorizontalScrollBarEnabled(
                false
        );

        languageScroll.setFillViewport(false);

        languageScroll.setPadding(
                dp(2),
                dp(2),
                dp(2),
                dp(2)
        );

        LinearLayout languageLayout =
                new LinearLayout(this);

        languageLayout.setOrientation(
                LinearLayout.HORIZONTAL
        );

        languageLayout.setGravity(
                Gravity.CENTER_VERTICAL
        );

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

        for (int i = 0; i < languageCodes.length; i++) {

            TextView languageButton =
                    createLanguageButton(
                            languageNames[i],
                            languageCodes[i]
                    );

            final String selectedLanguage =
                    languageCodes[i];

            languageButton.setOnClickListener(v -> {

                language = selectedLanguage;

                createScreen();
            });

            languageLayout.addView(
                    languageButton
            );
        }

        languageScroll.addView(
                languageLayout,
                new HorizontalScrollView.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        dp(58)
                )
        );

        root.addView(
                languageScroll,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        dp(62)
                )
        );

        // =========================
        // SEARCH
        // =========================

        LinearLayout searchRow =
                new LinearLayout(this);

        searchRow.setOrientation(
                LinearLayout.HORIZONTAL
        );

        searchRow.setGravity(
                Gravity.CENTER_VERTICAL
        );

        searchRow.setPadding(
                0,
                dp(3),
                0,
                dp(5)
        );

        searchBox =
                new EditText(this);

        searchBox.setHint(
                getSearchHint()
        );

        searchBox.setTextSize(16);

        searchBox.setTextColor(
                Color.BLACK
        );

        searchBox.setHintTextColor(
                Color.DKGRAY
        );

        searchBox.setSingleLine(true);

        searchBox.setPadding(
                dp(14),
                0,
                dp(14),
                0
        );

        GradientDrawable searchBg =
                new GradientDrawable();

        searchBg.setColor(
                Color.WHITE
        );

        searchBg.setStroke(
                dp(2),
                Color.DKGRAY
        );

        searchBg.setCornerRadius(
                dp(14)
        );

        searchBox.setBackground(
                searchBg
        );

        searchRow.addView(
                searchBox,
                new LinearLayout.LayoutParams(
                        0,
                        dp(50),
                        1
                )
        );

        TextView searchButton =
                new TextView(this);

        searchButton.setText(
                "🔍"
        );

        searchButton.setTextSize(23);

        searchButton.setTextColor(
                Color.BLACK
        );

        searchButton.setGravity(
                Gravity.CENTER
        );

        searchButton.setIncludeFontPadding(
                false
        );

        GradientDrawable searchButtonBg =
                new GradientDrawable();

        searchButtonBg.setColor(
                Color.WHITE
        );

        searchButtonBg.setStroke(
                dp(2),
                Color.DKGRAY
        );

        searchButtonBg.setCornerRadius(
                dp(14)
        );

        searchButton.setBackground(
                searchButtonBg
        );

        LinearLayout.LayoutParams searchButtonParams =
                new LinearLayout.LayoutParams(
                        dp(55),
                        dp(50)
                );

        searchButtonParams.setMargins(
                dp(6),
                0,
                0,
                0
        );

        searchRow.addView(
                searchButton,
                searchButtonParams
        );

        root.addView(
                searchRow,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        dp(58)
                )
        );

        searchButton.setOnClickListener(
                v -> refreshPhrases()
        );

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
                }
        );

        // =========================
        // CATEGORY TITLE
        // =========================

        TextView categoryTitle =
                new TextView(this);

        categoryTitle.setText(
                getCategoryTitle()
        );

        categoryTitle.setTextSize(18);

        categoryTitle.setTextColor(
                Color.BLACK
        );

        categoryTitle.setTypeface(
                null,
                Typeface.BOLD
        );

        categoryTitle.setGravity(
                Gravity.CENTER_VERTICAL
        );

        categoryTitle.setIncludeFontPadding(
                false
        );

        categoryTitle.setPadding(
                dp(5),
                0,
                dp(5),
                0
        );

        root.addView(
                categoryTitle,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        dp(40)
                )
        );

        // =========================
        // CATEGORIES
        // =========================

        HorizontalScrollView categoryScroll =
                new HorizontalScrollView(this);

        categoryScroll.setHorizontalScrollBarEnabled(
                false
        );

        categoryScroll.setFillViewport(
                false
        );

        categoryScroll.setPadding(
                dp(2),
                dp(3),
                dp(2),
                dp(3)
        );

        LinearLayout categoryLayout =
                new LinearLayout(this);

        categoryLayout.setOrientation(
                LinearLayout.HORIZONTAL
        );

        categoryLayout.setGravity(
                Gravity.CENTER_VERTICAL
        );

        for (String category : categories) {

            TextView button =
                    createCategoryButton(
                            category
                    );

            button.setOnClickListener(v -> {

                selectedCategory =
                        category;

                refreshPhrases();
            });

            categoryLayout.addView(
                    button
            );
        }

        categoryScroll.addView(
                categoryLayout,
                new HorizontalScrollView.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.MATCH_PARENT
                )
        );

        root.addView(
                categoryScroll,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        dp(62)
                )
        );

        // =========================
        // FAVORITES
        // =========================

        TextView favoriteButton =
                createWideButton(
                        getFavoriteButtonText()
                );

        root.addView(
                favoriteButton,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        dp(48)
                )
        );

        favoriteButton.setOnClickListener(v -> {

            favoritesOnly =
                    !favoritesOnly;

            favoriteButton.setText(
                    getFavoriteButtonText()
            );

            refreshPhrases();
        });

        // =========================
        // PHRASES
        // =========================

        ScrollView scrollView =
                new ScrollView(this);

        phrasesContainer =
                new LinearLayout(this);

        phrasesContainer.setOrientation(
                LinearLayout.VERTICAL
        );

        phrasesContainer.setPadding(
                dp(4),
                dp(5),
                dp(4),
                dp(15)
        );

        scrollView.addView(
                phrasesContainer
        );

        root.addView(
                scrollView,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        0,
                        1
                )
        );

        // =========================
        // BACK
        // =========================

        TextView backButton =
                createWideButton(
                        getBackText()
                );

        root.addView(
                backButton,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        dp(46)
                )
        );

        backButton.setOnClickListener(
                v -> finish()
        );

        // =========================
        // FOOTER
        // =========================

        TextView footer =
                new TextView(this);

        footer.setText("F.S");

        footer.setTextSize(12);

        footer.setTextColor(
                Color.DKGRAY
        );

        footer.setGravity(
                Gravity.CENTER
        );

        footer.setIncludeFontPadding(
                false
        );

        root.addView(
                footer,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        dp(25)
                )
        );

        setContentView(root);

        refreshPhrases();
    }

    // =========================
    // LANGUAGE BUTTON
    // =========================

    private TextView createLanguageButton(
            String text,
            String code
    ) {

        TextView button =
                new TextView(this);

        button.setText(text);

        button.setTextSize(15);

        button.setTextColor(
                Color.BLACK
        );

        button.setTypeface(
                null,
                Typeface.BOLD
        );

        button.setGravity(
                Gravity.CENTER
        );

        button.setIncludeFontPadding(
                false
        );

        button.setLineSpacing(
                0,
                0.9f
        );

        button.setPadding(
                dp(5),
                dp(3),
                dp(5),
                dp(3)
        );

        GradientDrawable bg =
                new GradientDrawable();

        if (language.equals(code)) {

            bg.setColor(
                    Color.rgb(220, 245, 220)
            );

            bg.setStroke(
                    dp(3),
                    Color.rgb(46, 125, 50)
            );

        } else {

            bg.setColor(
                    Color.WHITE
            );

            bg.setStroke(
                    dp(2),
                    Color.DKGRAY
            );
        }

        bg.setCornerRadius(
                dp(12)
        );

        button.setBackground(
                bg
        );

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        dp(68),
                        dp(54)
                );

        params.setMargins(
                dp(4),
                dp(2),
                dp(4),
                dp(2)
        );

        button.setLayoutParams(
                params
        );

        return button;
    }

    // =========================
    // CATEGORY BUTTON
    // =========================

    private TextView createCategoryButton(
            String category
    ) {

        TextView button =
                new TextView(this);

        button.setText(
                getCategoryName(
                        category
                )
        );

        button.setTextSize(15);

        button.setTextColor(
                Color.BLACK
        );

        button.setTypeface(
                null,
                Typeface.BOLD
        );

        button.setGravity(
                Gravity.CENTER
        );

        button.setIncludeFontPadding(
                false
        );

        button.setSingleLine(true);

        button.setPadding(
                dp(18),
                0,
                dp(18),
                0
        );

        GradientDrawable bg =
                new GradientDrawable();

        bg.setColor(
                Color.WHITE
        );

        bg.setStroke(
                dp(2),
                Color.DKGRAY
        );

        bg.setCornerRadius(
                dp(16)
        );

        button.setBackground(
                bg
        );

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        dp(50)
                );

        params.setMargins(
                dp(4),
                dp(3),
                dp(4),
                dp(3)
        );

        button.setLayoutParams(
                params
        );

        return button;
    }

    // =========================
    // WIDE BUTTON
    // =========================

    private TextView createWideButton(
            String text
    ) {

        TextView button =
                new TextView(this);

        button.setText(text);

        button.setTextSize(15);

        button.setTextColor(
                Color.BLACK
        );

        button.setTypeface(
                null,
                Typeface.BOLD
        );

        button.setGravity(
                Gravity.CENTER
        );

        button.setIncludeFontPadding(
                false
        );

        GradientDrawable bg =
                new GradientDrawable();

        bg.setColor(
                Color.WHITE
        );

        bg.setStroke(
                dp(2),
                Color.DKGRAY
        );

        bg.setCornerRadius(
                dp(12)
        );

        button.setBackground(
                bg
        );

        return button;
    }

    // =========================
    // REFRESH PHRASES
    // =========================

    private void refreshPhrases() {

        if (phrasesContainer == null)
            return;

        phrasesContainer.removeAllViews();

        String search =
                searchBox
                        .getText()
                        .toString()
                        .toLowerCase(
                                Locale.ROOT
                        )
                        .trim();

        List<WorkerPhrasebook.Phrase> result =
                new ArrayList<>();

        for (
                WorkerPhrasebook.Phrase phrase :
                WorkerPhrasebook.getPhrases()
        ) {

            boolean categoryMatch =
                    selectedCategory.equals("ALL")
                            ||
                            phrase.category.equals(
                                    selectedCategory
                            );

            boolean searchMatch =
                    search.isEmpty()
                            ||
                            phrase.english
                                    .toLowerCase(
                                            Locale.ROOT
                                    )
                                    .contains(search)
                            ||
                            phrase.russian
                                    .toLowerCase(
                                            Locale.ROOT
                                    )
                                    .contains(search)
                            ||
                            phrase.azerbaijani
                                    .toLowerCase(
                                            Locale.ROOT
                                    )
                                    .contains(search);

            boolean favoriteMatch =
                    !favoritesOnly
                            ||
                            favorites.contains(
                                    phrase.english
                            );

            if (
                    categoryMatch
                            &&
                    searchMatch
                            &&
                    favoriteMatch
            ) {

                result.add(phrase);
            }
        }

        for (
                WorkerPhrasebook.Phrase phrase :
                result
        ) {

            addPhraseCard(phrase);
        }

        if (result.isEmpty()) {

            TextView empty =
                    new TextView(this);

            empty.setText(
                    getNoResultsText()
            );

            empty.setTextSize(18);

            empty.setTextColor(
                    Color.BLACK
            );

            empty.setGravity(
                    Gravity.CENTER
            );

            empty.setIncludeFontPadding(
                    false
            );

            empty.setPadding(
                    dp(10),
                    dp(40),
                    dp(10),
                    dp(40)
            );

            phrasesContainer.addView(
                    empty
            );
        }
    }

    // =========================
    // PHRASE CARD
    // =========================

    private void addPhraseCard(
            WorkerPhrasebook.Phrase phrase
    ) {

        LinearLayout card =
                new LinearLayout(this);

        card.setOrientation(
                LinearLayout.VERTICAL
        );

        card.setPadding(
                dp(14),
                dp(12),
                dp(14),
                dp(12)
        );

        GradientDrawable cardBg =
                new GradientDrawable();

        cardBg.setColor(
                Color.WHITE
        );

        cardBg.setStroke(
                dp(2),
                Color.LTGRAY
        );

        cardBg.setCornerRadius(
                dp(15)
        );

        card.setBackground(
                cardBg
        );

        LinearLayout.LayoutParams cardParams =
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                );

        cardParams.setMargins(
                0,
                dp(4),
                0,
                dp(4)
        );

        card.setLayoutParams(
                cardParams
        );

        // ENGLISH

        TextView english =
                new TextView(this);

        english.setText(
                "🇬🇧 " +
                phrase.english
        );

        english.setTextSize(19);

        english.setTextColor(
                Color.BLACK
        );

        english.setTypeface(
                null,
                Typeface.BOLD
        );

        english.setIncludeFontPadding(
                false
        );

        english.setPadding(
                0,
                0,
                0,
                dp(6)
        );

        card.addView(
                english
        );

        // RUSSIAN

        TextView russian =
                new TextView(this);

        russian.setText(
                "🇷🇺 " +
                phrase.russian
        );

        russian.setTextSize(16);

        russian.setTextColor(
                Color.BLACK
        );

        russian.setIncludeFontPadding(
                false
        );

        russian.setPadding(
                0,
                dp(2),
                0,
                dp(4)
        );

        card.addView(
                russian
        );

        // AZERBAIJANI

        TextView azerbaijani =
                new TextView(this);

        azerbaijani.setText(
                "🇦🇿 " +
                phrase.azerbaijani
        );

        azerbaijani.setTextSize(16);

        azerbaijani.setTextColor(
                Color.BLACK
        );

        azerbaijani.setIncludeFontPadding(
                false
        );

        azerbaijani.setPadding(
                0,
                dp(2),
                0,
                dp(8)
        );

        card.addView(
                azerbaijani
        );

        // ACTIONS

        LinearLayout actions =
                new LinearLayout(this);

        actions.setOrientation(
                LinearLayout.HORIZONTAL
        );

        actions.setGravity(
                Gravity.CENTER_VERTICAL
        );

        // SPEAK

        TextView speak =
                createActionButton(
                        "🔊"
                );

        speak.setOnClickListener(v -> {

            if (tts != null) {

                tts.setLanguage(
                        Locale.US
                );

                tts.speak(
                        phrase.english,
                        TextToSpeech.QUEUE_FLUSH,
                        null,
                        "worker_phrase"
                );
            }
        });

        actions.addView(
                speak
        );

        // COPY

        TextView copy =
                createActionButton(
                        "📋"
                );

        copy.setOnClickListener(v -> {

            ClipboardManager clipboard =
                    (ClipboardManager)
                            getSystemService(
                                    Context.CLIPBOARD_SERVICE
                            );

            String text =
                    phrase.english
                            + "\n"
                            + phrase.russian
                            + "\n"
                            + phrase.azerbaijani;

            clipboard.setPrimaryClip(
                    ClipData.newPlainText(
                            "WORKER PRO",
                            text
                    )
            );

            Toast.makeText(
                    this,
                    getCopiedText(),
                    Toast.LENGTH_SHORT
            ).show();
        });

        actions.addView(
                copy
        );

        // FAVORITE

        TextView favorite =
                createActionButton(
                        favorites.contains(
                                phrase.english
                        )
                        ? "⭐"
                        : "☆"
                );

        favorite.setOnClickListener(v -> {

            if (
                    favorites.contains(
                            phrase.english
                    )
            ) {

                favorites.remove(
                        phrase.english
                );

            } else {

                favorites.add(
                        phrase.english
                );
            }

            saveFavorites();

            refreshPhrases();
        });

        actions.addView(
                favorite
        );

        card.addView(
                actions
        );

        phrasesContainer.addView(
                card
        );
    }

    // =========================
    // ACTION BUTTON
    // =========================

    private TextView createActionButton(
            String text
    ) {

        TextView button =
                new TextView(this);

        button.setText(text);

        button.setTextSize(20);

        button.setTextColor(
                Color.BLACK
        );

        button.setGravity(
                Gravity.CENTER
        );

        button.setIncludeFontPadding(
                false
        );

        GradientDrawable bg =
                new GradientDrawable();

        bg.setColor(
                Color.WHITE
        );

        bg.setStroke(
                dp(2),
                Color.DKGRAY
        );

        bg.setCornerRadius(
                dp(12)
        );

        button.setBackground(
                bg
        );

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        dp(58),
                        dp(48)
                );

        params.setMargins(
                dp(3),
                dp(3),
                dp(3),
                dp(3)
        );

        button.setLayoutParams(
                params
        );

        return button;
    }

    // =========================
    // SAVE FAVORITES
    // =========================

    private void saveFavorites() {

        getSharedPreferences(
                "WORKER_PRO_PHRASE_FAVORITES",
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

    // =========================
    // TEXTS
    // =========================

    private String getTitleText() {

        if (language.equals("AZ")) {
            return "💬 Danışıq kitabçası";
        }

        if (language.equals("EN")) {
            return "💬 Phrasebook";
        }

        if (language.equals("TR")) {
            return "💬 Konuşma Kitabı";
        }

        if (language.equals("DE")) {
            return "💬 Sprachführer";
        }

        return "💬 Разговорник";
    }

    private String getSearchHint() {

        if (language.equals("AZ")) {
            return "İfadə axtar...";
        }

        if (language.equals("EN")) {
            return "Search phrase...";
        }

        if (language.equals("TR")) {
            return "Cümle ara...";
        }

        if (language.equals("DE")) {
            return "Phrase suchen...";
        }

        return "Поиск фразы...";
    }

    private String getCategoryTitle() {

        if (language.equals("AZ")) {
            return "📚 Kateqoriyalar";
        }

        if (language.equals("EN")) {
            return "📚 Categories";
        }

        if (language.equals("TR")) {
            return "📚 Kategoriler";
        }

        if (language.equals("DE")) {
            return "📚 Kategorien";
        }

        return "📚 Категории";
    }

    // =========================
    // CATEGORY NAMES
    // =========================

    private String getCategoryName(
            String category
    ) {

        if (language.equals("AZ")) {

            switch (category) {

                case "ALL":
                    return "HAMISI";

                case "WORK":
                    return "İŞ";

                case "BOSS":
                    return "RƏHBƏR";

                case "MACHINE":
                    return "MAŞIN";

                case "CNC":
                    return "CNC";

                case "STAMPING":
                    return "ŞTAMPLAMA";

                case "QUALITY":
                    return "KEYFİYYƏT";

                case "SAFETY":
                    return "TƏHLÜKƏSİZLİK";

                case "FIRE":
                    return "YANĞIN";

                case "WELDING":
                    return "QAYNAQ";

                case "GALVANIC":
                    return "GALVANİK";

                case "MAINTENANCE":
                    return "TƏMİR";

                case "EMERGENCY":
                    return "FÖVQƏLADƏ";
            }
        }

        if (language.equals("EN")) {

            switch (category) {

                case "ALL":
                    return "ALL";

                case "WORK":
                    return "WORK";

                case "BOSS":
                    return "BOSS";

                case "MACHINE":
                    return "MACHINE";

                case "CNC":
                    return "CNC";

                case "STAMPING":
                    return "STAMPING";

                case "QUALITY":
                    return "QUALITY";

                case "SAFETY":
                    return "SAFETY";

                case "FIRE":
                    return "FIRE";

                case "WELDING":
                    return "WELDING";

                case "GALVANIC":
                    return "GALVANIC";

                case "MAINTENANCE":
                    return "MAINTENANCE";

                case "EMERGENCY":
                    return "EMERGENCY";
            }
        }

        if (language.equals("TR")) {

            switch (category) {

                case "ALL":
                    return "TÜMÜ";

                case "WORK":
                    return "İŞ";

                case "BOSS":
                    return "YÖNETİCİ";

                case "MACHINE":
                    return "MAKİNE";

                case "CNC":
                    return "CNC";

                case "STAMPING":
                    return "PRESLEME";

                case "QUALITY":
                    return "KALİTE";

                case "SAFETY":
                    return "GÜVENLİK";

                case "FIRE":
                    return "YANGIN";

                case "WELDING":
                    return "KAYNAK";

                case "GALVANIC":
                    return "GALVANİK";

                case "MAINTENANCE":
                    return "BAKIM";

                case "EMERGENCY":
                    return "ACİL DURUM";
            }
        }

        if (language.equals("DE")) {

            switch (category) {

                case "ALL":
                    return "ALLE";

                case "WORK":
                    return "ARBEIT";

                case "BOSS":
                    return "VORGESETZTER";

                case "MACHINE":
                    return "MASCHINE";

                case "CNC":
                    return "CNC";

                case "STAMPING":
                    return "STANZEN";

                case "QUALITY":
                    return "QUALITÄT";

                case "SAFETY":
                    return "SICHERHEIT";

                case "FIRE":
                    return "FEUER";

                case "WELDING":
                    return "SCHWEISSEN";

                case "GALVANIC":
                    return "GALVANISCH";

                case "MAINTENANCE":
                    return "WARTUNG";

                case "EMERGENCY":
                    return "NOTFALL";
            }
        }

        switch (category) {

            case "ALL":
                return "ВСЕ";

            case "WORK":
                return "РАБОТА";

            case "BOSS":
                return "РУКОВОДИТЕЛЬ";

            case "MACHINE":
                return "СТАНОК";

            case "CNC":
                return "CNC";

            case "STAMPING":
                return "ШТАМПОВКА";

            case "QUALITY":
                return "КАЧЕСТВО";

            case "SAFETY":
                return "БЕЗОПАСНОСТЬ";

            case "FIRE":
                return "ПОЖАР";

            case "WELDING":
                return "СВАРКА";

            case "GALVANIC":
                return "ГАЛЬВАНИКА";

            case "MAINTENANCE":
                return "РЕМОНТ";

            case "EMERGENCY":
                return "АВАРИЯ";
        }

        return category;
    }

    // =========================
    // FAVORITE TEXT
    // =========================

    private String getFavoriteButtonText() {

        if (favoritesOnly) {

            if (language.equals("AZ")) {
                return "⭐ Yalnız seçilmişlər";
            }

            if (language.equals("EN")) {
                return "⭐ Favorites only";
            }

            if (language.equals("TR")) {
                return "⭐ Sadece favoriler";
            }

            if (language.equals("DE")) {
                return "⭐ Nur Favoriten";
            }

            return "⭐ Только избранное";
        }

        if (language.equals("AZ")) {
            return "⭐ Seçilmişlər";
        }

        if (language.equals("EN")) {
            return "⭐ Favorites";
        }

        if (language.equals("TR")) {
            return "⭐ Favoriler";
        }

        if (language.equals("DE")) {
            return "⭐ Favoriten";
        }

        return "⭐ Избранное";
    }

    // =========================
    // NO RESULTS
    // =========================

    private String getNoResultsText() {

        if (language.equals("AZ")) {
            return "Nəticə tapılmadı";
        }

        if (language.equals("EN")) {
            return "No results";
        }

        if (language.equals("TR")) {
            return "Sonuç bulunamadı";
        }

        if (language.equals("DE")) {
            return "Keine Ergebnisse";
        }

        return "Ничего не найдено";
    }

    // =========================
    // COPIED
    // =========================

    private String getCopiedText() {

        if (language.equals("AZ")) {
            return "Kopyalandı";
        }

        if (language.equals("EN")) {
            return "Copied";
        }

        if (language.equals("TR")) {
            return "Kopyalandı";
        }

        if (language.equals("DE")) {
            return "Kopiert";
        }

        return "Скопировано";
    }

    // =========================
    // BACK
    // =========================

    private String getBackText() {

        if (language.equals("AZ")) {
            return "← Geri";
        }

        if (language.equals("EN")) {
            return "← Back";
        }

        if (language.equals("TR")) {
            return "← Geri";
        }

        if (language.equals("DE")) {
            return "← Zurück";
        }

        return "← Назад";
    }

    // =========================
    // DESTROY
    // =========================

    @Override
    protected void onDestroy() {

        if (tts != null) {

            tts.stop();
            tts.shutdown();
        }

        super.onDestroy();
    }
}