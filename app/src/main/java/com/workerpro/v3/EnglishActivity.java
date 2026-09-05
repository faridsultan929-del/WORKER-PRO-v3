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

public class EnglishActivity extends Activity {

    private String language = "RU";

    private EditText searchBox;
    private LinearLayout wordsContainer;

    private String selectedCategory = "ALL";
    private String selectedLetter = "ALL";
    private boolean favoritesOnly = false;

    private final Set<String> favorites = new HashSet<>();

    private TextToSpeech tts;

    private final String[] letters = {
            "ALL",
            "A", "B", "C", "D", "E", "F", "G",
            "H", "I", "J", "K", "L", "M", "N",
            "O", "P", "Q", "R", "S", "T", "U",
            "V", "W", "X", "Y", "Z"
    };

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
                        "WORKER_PRO_ENGLISH_FAVORITES",
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

        // Алфавит
        TextView alphabetTitle = new TextView(this);
        alphabetTitle.setText(getAlphabetTitle());
        alphabetTitle.setTextSize(16);
        alphabetTitle.setTextColor(Color.BLACK);
        alphabetTitle.setTypeface(null, Typeface.BOLD);
        alphabetTitle.setPadding(5, 10, 5, 5);

        root.addView(alphabetTitle);

        HorizontalScrollView alphabetScroll =
                new HorizontalScrollView(this);

        alphabetScroll.setHorizontalScrollBarEnabled(false);

        LinearLayout alphabet =
                new LinearLayout(this);

        alphabet.setOrientation(LinearLayout.HORIZONTAL);

        for (String letter : letters) {

            TextView button = createFilterButton(letter);

            button.setOnClickListener(v -> {
                selectedLetter = letter;
                refreshWords();
            });

            alphabet.addView(button);
        }

        alphabetScroll.addView(alphabet);
        root.addView(alphabetScroll);

        // Категории
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
                    createFilterButton(category);

            button.setOnClickListener(v -> {
                selectedCategory = category;
                refreshWords();
            });

            categoryLayout.addView(button);
        }

        categoryScroll.addView(categoryLayout);
        root.addView(categoryScroll);

        // Избранное
        Button favoriteButton = new Button(this);
        favoriteButton.setText(getFavoriteButtonText());
        favoriteButton.setTextSize(14);
        favoriteButton.setTextColor(Color.BLACK);
        favoriteButton.setAllCaps(false);

        favoriteButton.setOnClickListener(v -> {
            favoritesOnly = !favoritesOnly;

            favoriteButton.setText(
                    getFavoriteButtonText()
            );

            refreshWords();
        });

        root.addView(favoriteButton);

        // Список слов
        ScrollView scrollView =
                new ScrollView(this);

        wordsContainer =
                new LinearLayout(this);

        wordsContainer.setOrientation(
                LinearLayout.VERTICAL
        );

        wordsContainer.setPadding(
                5, 5, 5, 20
        );

        scrollView.addView(wordsContainer);

        root.addView(
                scrollView,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        0,
                        1
                )
        );

        // Назад
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

                        refreshWords();
                    }

                    @Override
                    public void afterTextChanged(
                            android.text.Editable s) {
                    }
                }
        );

        refreshWords();
    }

    private TextView createFilterButton(
            String text) {

        TextView button = new TextView(this);

        button.setText(text);
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

    private void refreshWords() {

        wordsContainer.removeAllViews();

        String search =
                searchBox.getText()
                        .toString()
                        .toLowerCase(Locale.ROOT)
                        .trim();

        List<EnglishDictionary.Word> result =
                new ArrayList<>();

        for (EnglishDictionary.Word word :
                EnglishDictionary.getWords()) {

            boolean letterMatch =
                    selectedLetter.equals("ALL")
                            || word.english
                            .toUpperCase(Locale.ROOT)
                            .startsWith(
                                    selectedLetter
                            );

            boolean categoryMatch =
                    selectedCategory.equals("ALL")
                            || word.category
                            .equals(selectedCategory);

            boolean searchMatch =
                    search.isEmpty()
                            || word.english
                            .toLowerCase(Locale.ROOT)
                            .contains(search)
                            || word.russian
                            .toLowerCase(Locale.ROOT)
                            .contains(search)
                            || word.azerbaijani
                            .toLowerCase(Locale.ROOT)
                            .contains(search);

            boolean favoriteMatch =
                    !favoritesOnly
                            || favorites.contains(
                            word.english
                    );

            if (letterMatch
                    && categoryMatch
                    && searchMatch
                    && favoriteMatch) {

                result.add(word);
            }
        }

        for (EnglishDictionary.Word word : result) {

            addWordCard(word);
        }

        if (result.isEmpty()) {

            TextView empty = new TextView(this);

            empty.setText(getNoResultsText());
            empty.setTextSize(18);
            empty.setTextColor(Color.BLACK);
            empty.setGravity(Gravity.CENTER);
            empty.setPadding(10, 40, 10, 40);

            wordsContainer.addView(empty);
        }
    }

    private void addWordCard(
            EnglishDictionary.Word word) {

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
                "🇬🇧 " + word.english
        );

        english.setTextSize(20);
        english.setTextColor(Color.BLACK);
        english.setTypeface(
                null,
                Typeface.BOLD
        );

        card.addView(english);

        TextView russian =
                new TextView(this);

        russian.setText(
                "🇷🇺 " + word.russian
        );

        russian.setTextSize(16);
        russian.setTextColor(Color.DKGRAY);

        card.addView(russian);

        TextView azerbaijani =
                new TextView(this);

        azerbaijani.setText(
                "🇦🇿 " + word.azerbaijani
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
                        word.english,
                        TextToSpeech.QUEUE_FLUSH,
                        null,
                        "worker_word"
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
                    word.english
                            + " — "
                            + word.russian
                            + " — "
                            + word.azerbaijani;

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
                        word.english
                ) ? "★" : "☆"
        );

        favorite.setTextSize(20);

        favorite.setOnClickListener(v -> {

            if (favorites.contains(
                    word.english)) {

                favorites.remove(
                        word.english
                );

            } else {

                favorites.add(
                        word.english
                );
            }

            saveFavorites();
            refreshWords();
        });

        actions.addView(favorite);

        card.addView(actions);

        wordsContainer.addView(card);

        View line = new View(this);

        line.setBackgroundColor(
                Color.LTGRAY
        );

        wordsContainer.addView(
                line,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        1
                )
        );
    }

    private void saveFavorites() {

        getSharedPreferences(
                "WORKER_PRO_ENGLISH_FAVORITES",
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
            return "🇬🇧 İşçilər üçün İngilis dili";
        }

        if (language.equals("EN")) {
            return "🇬🇧 English for Workers";
        }

        if (language.equals("TR")) {
            return "🇬🇧 İşçiler için İngilizce";
        }

        if (language.equals("DE")) {
            return "🇬🇧 Englisch für Arbeiter";
        }

        return "🇬🇧 English for Workers";
    }

    private String getSearchHint() {

        if (language.equals("AZ")) {
            return "Söz axtar...";
        }

        if (language.equals("EN")) {
            return "Search word...";
        }

        if (language.equals("TR")) {
            return "Kelime ara...";
        }

        if (language.equals("DE")) {
            return "Wort suchen...";
        }

        return "Поиск слова...";
    }

    private String getAlphabetTitle() {

        if (language.equals("AZ")) {
            return "🔤 Əlifba";
        }

        if (language.equals("EN")) {
            return "🔤 Alphabet";
        }

        if (language.equals("TR")) {
            return "🔤 Alfabe";
        }

        if (language.equals("DE")) {
            return "🔤 Alphabet";
        }

        return "🔤 Алфавит";
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