package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
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
                        tts.setLanguage(Locale.US);
                    }
                }
        );

        createScreen();
    }

    private void createScreen() {

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(Color.WHITE);
        root.setPadding(10, 10, 10, 10);

        TextView title = new TextView(this);
        title.setText(getTitleText());
        title.setTextSize(25);
        title.setTextColor(Color.BLACK);
        title.setTypeface(null, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 5, 0, 10);

        root.addView(title);

        searchBox = new EditText(this);
        searchBox.setHint(getSearchHint());
        searchBox.setTextSize(16);
        searchBox.setTextColor(Color.BLACK);
        searchBox.setHintTextColor(Color.DKGRAY);
        searchBox.setSingleLine(true);

        root.addView(
                searchBox,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        55
                )
        );

        TextView categoryTitle = new TextView(this);
        categoryTitle.setText(getCategoryTitle());
        categoryTitle.setTextSize(16);
        categoryTitle.setTextColor(Color.BLACK);
        categoryTitle.setTypeface(null, Typeface.BOLD);
        categoryTitle.setPadding(5, 10, 5, 5);

        root.addView(categoryTitle);

        HorizontalScrollView categoryScroll =
                new HorizontalScrollView(this);

        categoryScroll.setHorizontalScrollBarEnabled(false);

        LinearLayout categoryLayout =
                new LinearLayout(this);

        categoryLayout.setOrientation(
                LinearLayout.HORIZONTAL
        );

        for (String category : categories) {

            TextView button =
                    createCategoryButton(category);

            button.setOnClickListener(v -> {
                selectedCategory = category;
                refreshPhrases();
            });

            categoryLayout.addView(button);
        }

        categoryScroll.addView(categoryLayout);
        root.addView(categoryScroll);

        Button favoriteButton = new Button(this);
        favoriteButton.setText(
                getFavoriteButtonText()
        );
        favoriteButton.setTextSize(14);
        favoriteButton.setTextColor(Color.BLACK);
        favoriteButton.setAllCaps(false);

        favoriteButton.setOnClickListener(v -> {

            favoritesOnly = !favoritesOnly;

            favoriteButton.setText(
                    getFavoriteButtonText()
            );

            refreshPhrases();
        });

        root.addView(favoriteButton);

        ScrollView scrollView =
                new ScrollView(this);

        phrasesContainer =
                new LinearLayout(this);

        phrasesContainer.setOrientation(
                LinearLayout.VERTICAL
        );

        phrasesContainer.setPadding(
                5, 5, 5, 20
        );

        scrollView.addView(phrasesContainer);

        root.addView(
                scrollView,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        0,
                        1
                )
        );

        Button backButton = new Button(this);
        backButton.setText(getBackText());
        backButton.setTextSize(16);
        backButton.setTextColor(Color.BLACK);
        backButton.setAllCaps(false);

        backButton.setOnClickListener(v -> finish());

        root.addView(backButton);

        TextView footer = new TextView(this);
        footer.setText("F.S");
        footer.setTextSize(13);
        footer.setTextColor(Color.DKGRAY);
        footer.setGravity(Gravity.CENTER);

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

                        refreshPhrases();
                    }

                    @Override
                    public void afterTextChanged(
                            android.text.Editable s) {
                    }
                }
        );

        refreshPhrases();
    }

    private TextView createCategoryButton(
            String text) {

        TextView button = new TextView(this);

        button.setText(
                getCategoryName(text)
        );

        button.setTextSize(13);
        button.setTextColor(Color.BLACK);
        button.setTypeface(null, Typeface.BOLD);
        button.setGravity(Gravity.CENTER);
        button.setPadding(12, 8, 12, 8);
        button.setClickable(true);
        button.setBackgroundResource(
                android.R.drawable.btn_default
        );

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        45
                );

        params.setMargins(3, 2, 3, 2);

        button.setLayoutParams(params);

        return button;
    }

    private void refreshPhrases() {

        phrasesContainer.removeAllViews();

        String search =
                searchBox.getText()
                        .toString()
                        .toLowerCase(Locale.ROOT)
                        .trim();

        List<WorkerPhrasebook.Phrase> result =
                new ArrayList<>();

        for (WorkerPhrasebook.Phrase phrase :
                WorkerPhrasebook.getPhrases()) {

            boolean categoryMatch =
                    selectedCategory.equals("ALL")
                            || phrase.category.equals(
                            selectedCategory
                    );

            boolean searchMatch =
                    search.isEmpty()
                            || phrase.english
                            .toLowerCase(Locale.ROOT)
                            .contains(search)
                            || phrase.russian
                            .toLowerCase(Locale.ROOT)
                            .contains(search)
                            || phrase.azerbaijani
                            .toLowerCase(Locale.ROOT)
                            .contains(search);

            boolean favoriteMatch =
                    !favoritesOnly
                            || favorites.contains(
                            phrase.english
                    );

            if (categoryMatch
                    && searchMatch
                    && favoriteMatch) {

                result.add(phrase);
            }
        }

        for (WorkerPhrasebook.Phrase phrase :
                result) {

            addPhraseCard(phrase);
        }

        if (result.isEmpty()) {

            TextView empty = new TextView(this);

            empty.setText(
                    getNoResultsText()
            );

            empty.setTextSize(18);
            empty.setTextColor(Color.BLACK);
            empty.setGravity(Gravity.CENTER);
            empty.setPadding(10, 40, 10, 40);

            phrasesContainer.addView(empty);
        }
    }

    private void addPhraseCard(
            WorkerPhrasebook.Phrase phrase) {

        LinearLayout card =
                new LinearLayout(this);

        card.setOrientation(
                LinearLayout.VERTICAL
        );

        card.setPadding(
                15, 12, 15, 12
        );

        TextView english =
                new TextView(this);

        english.setText(
                "🇬🇧 " + phrase.english
        );

        english.setTextSize(19);
        english.setTextColor(Color.BLACK);
        english.setTypeface(
                null,
                Typeface.BOLD
        );

        card.addView(english);

        TextView russian =
                new TextView(this);

        russian.setText(
                "🇷🇺 " + phrase.russian
        );

        russian.setTextSize(16);
        russian.setTextColor(Color.DKGRAY);

        card.addView(russian);

        TextView azerbaijani =
                new TextView(this);

        azerbaijani.setText(
                "🇦🇿 " + phrase.azerbaijani
        );

        azerbaijani.setTextSize(16);
        azerbaijani.setTextColor(Color.DKGRAY);

        card.addView(azerbaijani);

        LinearLayout actions =
                new LinearLayout(this);

        actions.setOrientation(
                LinearLayout.HORIZONTAL
        );

        Button speak =
                new Button(this);

        speak.setText("🔊");
        speak.setTextSize(18);

        speak.setOnClickListener(v -> {

            if (tts != null) {

                tts.setLanguage(Locale.US);

                tts.speak(
                        phrase.english,
                        TextToSpeech.QUEUE_FLUSH,
                        null,
                        "worker_phrase"
                );
            }
        });

        actions.addView(speak);

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

            String text =
                    phrase.english
                            + " — "
                            + phrase.russian
                            + " — "
                            + phrase.azerbaijani;

            clipboard.setPrimaryClip(
                    ClipData.newPlainText(
                            "WORKER PRO",
                            text
                    )
            );
        });

        actions.addView(copy);

        Button favorite =
                new Button(this);

        favorite.setText(
                favorites.contains(
                        phrase.english
                ) ? "★" : "☆"
        );

        favorite.setTextSize(20);

        favorite.setOnClickListener(v -> {

            if (favorites.contains(
                    phrase.english)) {

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

        actions.addView(favorite);

        card.addView(actions);

        phrasesContainer.addView(card);

        View line = new View(this);

        line.setBackgroundColor(
                Color.LTGRAY
        );

        phrasesContainer.addView(
                line,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        1
                )
        );
    }

    private void saveFavorites() {

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

    private String getCategoryName(
            String category) {

        if (language.equals("AZ")) {

            switch (category) {
                case "ALL": return "HAMISI";
                case "WORK": return "İŞ";
                case "BOSS": return "RƏHBƏR";
                case "MACHINE": return "MAŞIN";
                case "CNC": return "CNC";
                case "STAMPING": return "ŞTAMPLAMA";
                case "QUALITY": return "KEYFİYYƏT";
                case "SAFETY": return "TƏHLÜKƏSİZLİK";
                case "FIRE": return "YANĞIN";
                case "WELDING": return "QAYNAQ";
                case "GALVANIC": return "GALVANİK";
                case "MAINTENANCE": return "TƏMİR";
                case "EMERGENCY": return "FÖVQƏLADƏ";
            }
        }

        if (language.equals("EN")) {

            switch (category) {
                case "ALL": return "ALL";
                case "WORK": return "WORK";
                case "BOSS": return "BOSS";
                case "MACHINE": return "MACHINE";
                case "CNC": return "CNC";
                case "STAMPING": return "STAMPING";
                case "QUALITY": return "QUALITY";
                case "SAFETY": return "SAFETY";
                case "FIRE": return "FIRE";
                case "WELDING": return "WELDING";
                case "GALVANIC": return "GALVANIC";
                case "MAINTENANCE": return "MAINTENANCE";
                case "EMERGENCY": return "EMERGENCY";
            }
        }

        if (language.equals("TR")) {

            switch (category) {
                case "ALL": return "TÜMÜ";
                case "WORK": return "İŞ";
                case "BOSS": return "YÖNETİCİ";
                case "MACHINE": return "MAKİNE";
                case "CNC": return "CNC";
                case "STAMPING": return "PRESLEME";
                case "QUALITY": return "KALİTE";
                case "SAFETY": return "GÜVENLİK";
                case "FIRE": return "YANGIN";
                case "WELDING": return "KAYNAK";
                case "GALVANIC": return "GALVANİK";
                case "MAINTENANCE": return "BAKIM";
                case "EMERGENCY": return "ACİL DURUM";
            }
        }

        if (language.equals("DE")) {

            switch (category) {
                case "ALL": return "ALLE";
                case "WORK": return "ARBEIT";
                case "BOSS": return "VORGESETZTER";
                case "MACHINE": return "MASCHINE";
                case "CNC": return "CNC";
                case "STAMPING": return "STANZEN";
                case "QUALITY": return "QUALITÄT";
                case "SAFETY": return "SICHERHEIT";
                case "FIRE": return "FEUER";
                case "WELDING": return "SCHWEISSEN";
                case "GALVANIC": return "GALVANISCH";
                case "MAINTENANCE": return "WARTUNG";
                case "EMERGENCY": return "NOTFALL";
            }
        }

        switch (category) {
            case "ALL": return "ВСЕ";
            case "WORK": return "РАБОТА";
            case "BOSS": return "РУКОВОДИТЕЛЬ";
            case "MACHINE": return "СТАНОК";
            case "CNC": return "CNC";
            case "STAMPING": return "ШТАМПОВКА";
            case "QUALITY": return "КАЧЕСТВО";
            case "SAFETY": return "БЕЗОПАСНОСТЬ";
            case "FIRE": return "ПОЖАР";
            case "WELDING": return "СВАРКА";
            case "GALVANIC": return "ГАЛЬВАНИКА";
            case "MAINTENANCE": return "РЕМОНТ";
            case "EMERGENCY": return "АВАРИЯ";
        }

        return category;
    }

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

    @Override
    protected void onDestroy() {

        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }

        super.onDestroy();
    }
}