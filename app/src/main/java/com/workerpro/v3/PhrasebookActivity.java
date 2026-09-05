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
import android.view.ViewGroup;
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

public class PhrasebookActivity extends Activity {

    private LinearLayout listLayout;
    private EditText searchBox;

    private List<WorkerPhrasebook.Phrase> phrases;

    private TextToSpeech tts;

    private String language = "RU";
    private String selectedCategory = "ALL";
    private boolean favoritesOnly = false;

    private final Set<String> favorites = new HashSet<>();

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

        language = getIntent().getStringExtra("LANGUAGE");

        if (language == null) {
            language = "RU";
        }

        phrases = WorkerPhrasebook.getPhrases();

        loadFavorites();

        tts = new TextToSpeech(this, status -> {

            if (status == TextToSpeech.SUCCESS) {

                int result = tts.setLanguage(Locale.US);

                if (result == TextToSpeech.LANG_MISSING_DATA
                        || result == TextToSpeech.LANG_NOT_SUPPORTED) {

                    Toast.makeText(
                            this,
                            getTtsErrorText(),
                            Toast.LENGTH_SHORT
                    ).show();
                }
            }
        });

        buildScreen();
    }

    private void buildScreen() {

        LinearLayout root = new LinearLayout(this);

        root.setOrientation(LinearLayout.VERTICAL);

        root.setPadding(
                16,
                16,
                16,
                10
        );

        root.setBackgroundColor(Color.WHITE);

        // ================= TITLE =================

        TextView title = new TextView(this);

        title.setText(getTitleText());

        title.setTextSize(25);

        title.setTypeface(
                Typeface.DEFAULT,
                Typeface.BOLD
        );

        title.setTextColor(
                Color.rgb(0, 130, 70)
        );

        title.setGravity(Gravity.CENTER);

        title.setPadding(
                0,
                5,
                0,
                12
        );

        root.addView(title);

        // ================= SEARCH =================

        searchBox = new EditText(this);

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

        Button favoritesButton = new Button(this);

        favoritesButton.setText(
                favoritesOnly
                        ? "⭐ " + getFavoritesText()
                        : "☆ " + getFavoritesText()
        );

        favoritesButton.setTextSize(13);

        favoritesButton.setOnClickListener(v -> {

            favoritesOnly = !favoritesOnly;

            favoritesButton.setText(
                    favoritesOnly
                            ? "⭐ " + getFavoritesText()
                            : "☆ " + getFavoritesText()
            );

            showPhrases(
                    searchBox.getText().toString()
            );
        });

        root.addView(
                favoritesButton,
                new LinearLayout.LayoutParams(
                        -1,
                        52
                )
        );

        // ================= CATEGORY SCROLL =================

        HorizontalScrollView categoryScroll =
                new HorizontalScrollView(this);

        categoryScroll.setHorizontalScrollBarEnabled(false);

        LinearLayout categoryLayout =
                new LinearLayout(this);

        categoryLayout.setOrientation(
                LinearLayout.HORIZONTAL
        );

        buildCategoryButtons(categoryLayout);

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

        // ================= LIST =================

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

        TextView footer = new TextView(this);

        footer.setText("F.S");

        footer.setTextSize(13);

        footer.setTextColor(Color.GRAY);

        footer.setGravity(Gravity.CENTER);

        footer.setPadding(
                0,
                5,
                0,
                3
        );

        root.addView(footer);

        setContentView(root);

        // ================= SEARCH LISTENER =================

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

                        showPhrases(
                                s.toString()
                        );
                    }

                    @Override
                    public void afterTextChanged(
                            Editable s) {
                    }
                }
        );

        showPhrases("");
    }

    // ================= CATEGORY BUTTONS =================

    private void buildCategoryButtons(
            LinearLayout categoryLayout) {

        categoryLayout.removeAllViews();

        for (String category : categories) {

            Button button =
                    new Button(this);

            button.setText(
                    getCategoryText(category)
            );

            button.setTextSize(12);

            if (category.equals(
                    selectedCategory)) {

                button.setTextColor(
                        Color.rgb(0, 130, 70)
                );

                button.setTypeface(
                        Typeface.DEFAULT,
                        Typeface.BOLD
                );
            }

            button.setOnClickListener(v -> {

                selectedCategory = category;

                buildCategoryButtons(
                        categoryLayout
                );

                showPhrases(
                        searchBox.getText().toString()
                );
            });

            categoryLayout.addView(
                    button,
                    new LinearLayout.LayoutParams(
                            -2,
                            54
                    )
            );
        }
    }

    // ================= SHOW PHRASES =================

    private void showPhrases(String search) {

        if (listLayout == null) {
            return;
        }

        listLayout.removeAllViews();

        String query =
                search.toLowerCase(
                        Locale.ROOT
                );

        int shown = 0;

        for (WorkerPhrasebook.Phrase phrase :
                phrases) {

            boolean matchesSearch =
                    query.isEmpty()
                            || phrase.english
                            .toLowerCase(Locale.ROOT)
                            .contains(query)

                            || phrase.russian
                            .toLowerCase(Locale.ROOT)
                            .contains(query)

                            || phrase.azerbaijani
                            .toLowerCase(Locale.ROOT)
                            .contains(query);

            boolean matchesCategory =
                    selectedCategory.equals("ALL")
                            || selectedCategory.equals(
                            phrase.category
                    );

            boolean matchesFavorite =
                    !favoritesOnly
                            || favorites.contains(
                            phrase.english
                    );

            if (!matchesSearch
                    || !matchesCategory
                    || !matchesFavorite) {

                continue;
            }

            addPhraseCard(phrase);

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

    // ================= PHRASE CARD =================

    private void addPhraseCard(
            WorkerPhrasebook.Phrase phrase) {

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

        // ================= PHRASE TEXT =================

        TextView text =
                new TextView(this);

        text.setText(
                "🇬🇧 " + phrase.english
                        + "\n\n"
                        + "🇷🇺 " + phrase.russian
                        + "\n"
                        + "🇦🇿 " + phrase.azerbaijani
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

        // ================= BUTTONS =================

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
                v -> speak(phrase.english)
        );

        // COPY

        Button copyButton =
                new Button(this);

        copyButton.setText("📋");

        copyButton.setTextSize(17);

        copyButton.setOnClickListener(
                v -> copyPhrase(phrase)
        );

        // FAVORITE

        Button favoriteButton =
                new Button(this);

        favoriteButton.setText(
                favorites.contains(
                        phrase.english
                )
                        ? "⭐"
                        : "☆"
        );

        favoriteButton.setTextSize(17);

        favoriteButton.setOnClickListener(v -> {

            toggleFavorite(
                    phrase.english
            );

            favoriteButton.setText(
                    favorites.contains(
                            phrase.english
                    )
                            ? "⭐"
                            : "☆"
            );

            if (favoritesOnly) {

                showPhrases(
                        searchBox.getText().toString()
                );
            }
        });

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

        // Нажатие на саму карточку
        // тоже произносит английскую фразу

        card.setOnClickListener(
                v -> speak(phrase.english)
        );

        listLayout.addView(
                card,
                cardParams
        );
    }

    // ================= TEXT TO SPEECH =================

    private void speak(String text) {

        if (tts != null) {

            tts.speak(
                    text,
                    TextToSpeech.QUEUE_FLUSH,
                    null,
                    "phrase_" +
                            System.currentTimeMillis()
            );
        }
    }

    // ================= COPY =================

    private void copyPhrase(
            WorkerPhrasebook.Phrase phrase) {

        android.content.ClipboardManager clipboard =
                (android.content.ClipboardManager)
                        getSystemService(
                                CLIPBOARD_SERVICE
                        );

        android.content.ClipData clip =
                android.content.ClipData.newPlainText(
                        "WORKER PRO",
                        phrase.english
                                + "\n"
                                + phrase.russian
                                + "\n"
                                + phrase.azerbaijani
                );

        clipboard.setPrimaryClip(clip);

        Toast.makeText(
                this,
                getCopiedText(),
                Toast.LENGTH_SHORT
        ).show();
    }

    // ================= FAVORITES =================

    private void toggleFavorite(
            String english) {

        if (favorites.contains(english)) {

            favorites.remove(english);

        } else {

            favorites.add(english);
        }

        getSharedPreferences(
                "WORKER_PRO_PHRASE_FAVORITES",
                MODE_PRIVATE
        )
                .edit()
                .putStringSet(
                        "favorites",
                        new HashSet<>(favorites)
                )
                .apply();
    }

    private void loadFavorites() {

        Set<String> saved =
                getSharedPreferences(
                        "WORKER_PRO_PHRASE_FAVORITES",
                        MODE_PRIVATE
                )
                        .getStringSet(
                                "favorites",
                                null
                        );

        if (saved != null) {

            favorites.clear();

            favorites.addAll(saved);
        }
    }

    // ================= LOCALIZATION =================

    private String getTitleText() {

        if (language.equals("AZ")) {

            return "💬 İşçilər üçün danışıq kitabçası";
        }

        if (language.equals("EN")) {

            return "💬 Worker Phrasebook";
        }

        return "💬 Разговорник для рабочих";
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

    private String getTtsErrorText() {

        if (language.equals("AZ")) {

            return "İngilis dili səsi mövcud deyil";
        }

        if (language.equals("EN")) {

            return "English voice is not available";
        }

        return "Английский голос недоступен";
    }

    // ================= CATEGORY NAMES =================

    private String getCategoryText(
            String category) {

        if (language.equals("AZ")) {

            switch (category) {

                case "ALL":
                    return "Hamısı";

                case "WORK":
                    return "🏭 İş";

                case "BOSS":
                    return "👷 Rəhbər";

                case "MACHINE":
                    return "⚙️ Dəzgah";

                case "CNC":
                    return "🖥 CNC";

                case "STAMPING":
                    return "🔨 Ştamplama";

                case "QUALITY":
                    return "✅ Keyfiyyət";

                case "SAFETY":
                    return "🦺 Təhlükəsizlik";

                case "FIRE":
                    return "🧯 Yanğın";

                case "WELDING":
                    return "⚡ Qaynaq";

                case "GALVANIC":
                    return "🧪 Qalvanika";

                case "MAINTENANCE":
                    return "🔧 Texniki xidmət";

                case "EMERGENCY":
                    return "🚨 Fövqəladə";
            }
        }

        if (language.equals("EN")) {

            switch (category) {

                case "ALL":
                    return "All";

                case "WORK":
                    return "🏭 Work";

                case "BOSS":
                    return "👷 Boss";

                case "MACHINE":
                    return "⚙️ Machine";

                case "CNC":
                    return "🖥 CNC";

                case "STAMPING":
                    return "🔨 Stamping";

                case "QUALITY":
                    return "✅ Quality";

                case "SAFETY":
                    return "🦺 Safety";

                case "FIRE":
                    return "🧯 Fire";

                case "WELDING":
                    return "⚡ Welding";

                case "GALVANIC":
                    return "🧪 Galvanic";

                case "MAINTENANCE":
                    return "🔧 Maintenance";

                case "EMERGENCY":
                    return "🚨 Emergency";
            }
        }

        switch (category) {

            case "ALL":
                return "Все";

            case "WORK":
                return "🏭 Работа";

            case "BOSS":
                return "👷 Начальник";

            case "MACHINE":
                return "⚙️ Станок";

            case "CNC":
                return "🖥 CNC";

            case "STAMPING":
                return "🔨 Штамповка";

            case "QUALITY":
                return "✅ Качество";

            case "SAFETY":
                return "🦺 Безопасность";

            case "FIRE":
                return "🧯 Пожар";

            case "WELDING":
                return "⚡ Сварка";

            case "GALVANIC":
                return "🧪 Гальваника";

            case "MAINTENANCE":
                return "🔧 Обслуживание";

            case "EMERGENCY":
                return "🚨 Авария";
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