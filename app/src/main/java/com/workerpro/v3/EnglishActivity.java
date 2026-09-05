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
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class EnglishActivity extends Activity {

    private LinearLayout listLayout;
    private EditText searchEdit;
    private String language = "RU";

    private String selectedCategory = "ALL";
    private String selectedLetter = "ALL";

    private TextToSpeech tts;

    private final Set<String> favorites = new HashSet<>();

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

        language = getSharedPreferences(
                "WORKER_PRO_SETTINGS",
                MODE_PRIVATE
        ).getString("language", "RU");

        favorites.addAll(
                getSharedPreferences(
                        "WORKER_PRO_FAVORITES",
                        MODE_PRIVATE
                ).getStringSet(
                        "english_words",
                        new HashSet<String>()
                )
        );

        tts = new TextToSpeech(this, status -> {
            if (status == TextToSpeech.SUCCESS) {
                setTtsLanguage();
            }
        });

        createScreen();
    }

    private void createScreen() {

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(Color.WHITE);

        // TOP BAR
        LinearLayout topBar = new LinearLayout(this);
        topBar.setOrientation(LinearLayout.HORIZONTAL);
        topBar.setGravity(Gravity.CENTER_VERTICAL);
        topBar.setPadding(12, 8, 8, 8);

        TextView title = new TextView(this);
        title.setText("🇬🇧 " + getTitleText());
        title.setTextSize(21);
        title.setTextColor(Color.BLACK);
        title.setTypeface(null, Typeface.BOLD);

        topBar.addView(
                title,
                new LinearLayout.LayoutParams(
                        0,
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        1
                )
        );

        // LANGUAGE BUTTONS
        LinearLayout languages = new LinearLayout(this);
        languages.setOrientation(LinearLayout.HORIZONTAL);

        String[] langs = {"RU", "AZ", "EN", "TR", "DE"};

        for (String lang : langs) {

            TextView langButton = new TextView(this);

            langButton.setText(lang);
            langButton.setTextSize(11);
            langButton.setTextColor(Color.BLACK);
            langButton.setTypeface(null, Typeface.BOLD);
            langButton.setGravity(Gravity.CENTER);

            langButton.setPadding(6, 8, 6, 8);
            langButton.setBackgroundResource(
                    android.R.drawable.btn_default
            );

            LinearLayout.LayoutParams lp =
                    new LinearLayout.LayoutParams(38, 40);

            lp.setMargins(2, 0, 2, 0);

            languages.addView(langButton, lp);

            langButton.setOnClickListener(v -> {

                language = lang;

                getSharedPreferences(
                        "WORKER_PRO_SETTINGS",
                        MODE_PRIVATE
                )
                        .edit()
                        .putString("language", language)
                        .apply();

                createScreen();
            });
        }

        topBar.addView(languages);

        root.addView(
                topBar,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                )
        );

        // SEARCH
        searchEdit = new EditText(this);

        searchEdit.setHint(getSearchText());
        searchEdit.setTextColor(Color.BLACK);
        searchEdit.setHintTextColor(Color.GRAY);
        searchEdit.setTextSize(16);
        searchEdit.setSingleLine(true);
        searchEdit.setPadding(16, 10, 16, 10);

        root.addView(
                searchEdit,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        55
                )
        );

        // ALPHABET
        HorizontalScrollView alphabetScroll =
                new HorizontalScrollView(this);

        LinearLayout alphabetLayout =
                new LinearLayout(this);

        alphabetLayout.setOrientation(
                LinearLayout.HORIZONTAL
        );

        String[] alphabet = {
                "ALL",
                "A","B","C","D","E","F","G","H","I","J",
                "K","L","M","N","O","P","Q","R","S","T",
                "U","V","W","X","Y","Z"
        };

        for (String letter : alphabet) {

            TextView button =
                    createFilterButton(letter);

            button.setOnClickListener(v -> {

                selectedLetter =
                        ((TextView) v).getText().toString();

                refreshList();
            });

            alphabetLayout.addView(button);
        }

        alphabetScroll.addView(alphabetLayout);

        root.addView(
                alphabetScroll,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        58
                )
        );

        // CATEGORIES
        HorizontalScrollView categoryScroll =
                new HorizontalScrollView(this);

        LinearLayout categoryLayout =
                new LinearLayout(this);

        categoryLayout.setOrientation(
                LinearLayout.HORIZONTAL
        );

        for (String category : categories) {

            TextView button =
                    createFilterButton(
                            getCategoryName(category)
                    );

            button.setTag(category);

            button.setOnClickListener(v -> {

                selectedCategory =
                        (String) v.getTag();

                refreshList();
            });

            categoryLayout.addView(button);
        }

        categoryScroll.addView(categoryLayout);

        root.addView(
                categoryScroll,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        58
                )
        );

        // WORD LIST
        ScrollView scrollView = new ScrollView(this);

        listLayout = new LinearLayout(this);
        listLayout.setOrientation(
                LinearLayout.VERTICAL
        );

        listLayout.setPadding(10, 10, 10, 10);

        scrollView.addView(listLayout);

        root.addView(
                scrollView,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        0,
                        1
                )
        );

        // FOOTER
        TextView footer = new TextView(this);

        footer.setText("F.S");
        footer.setTextSize(12);
        footer.setTextColor(Color.GRAY);
        footer.setGravity(Gravity.CENTER);
        footer.setPadding(0, 5, 0, 8);

        root.addView(
                footer,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                )
        );

        setContentView(root);

        searchEdit.setOnEditorActionListener(
                (v, actionId, event) -> {
                    refreshList();
                    return false;
                }
        );

        searchEdit.addTextChangedListener(
                new android.text.TextWatcher() {

                    public void beforeTextChanged(
                            CharSequence s,
                            int start,
                            int count,
                            int after
                    ) {}

                    public void onTextChanged(
                            CharSequence s,
                            int start,
                            int before,
                            int count
                    ) {
                        refreshList();
                    }

                    public void afterTextChanged(
                            android.text.Editable s
                    ) {}
                }
        );

        refreshList();
    }

    // =========================================================
    // FILTER BUTTON
    // =========================================================

    private TextView createFilterButton(String text) {

        TextView button = new TextView(this);

        button.setText(text);
        button.setTextSize(15);
        button.setTextColor(Color.BLACK);
        button.setTypeface(null, Typeface.BOLD);
        button.setGravity(Gravity.CENTER);

        button.setPadding(18, 8, 18, 8);

        button.setClickable(true);
        button.setFocusable(true);

        button.setBackgroundResource(
                android.R.drawable.btn_default
        );

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        50
                );

        params.setMargins(4, 3, 4, 3);

        button.setLayoutParams(params);

        return button;
    }

    // =========================================================
    // LIST
    // =========================================================

    private void refreshList() {

        if (listLayout == null) return;

        listLayout.removeAllViews();

        String search =
                searchEdit == null
                        ? ""
                        : searchEdit
                            .getText()
                            .toString()
                            .trim()
                            .toLowerCase();

        List<EnglishDictionary.Word> words =
                EnglishDictionary.getWords();

        Collections.sort(
                words,
                new Comparator<EnglishDictionary.Word>() {
                    @Override
                    public int compare(
                            EnglishDictionary.Word a,
                            EnglishDictionary.Word b
                    ) {
                        return a.english.compareToIgnoreCase(
                                b.english
                        );
                    }
                }
        );

        int count = 0;

        for (EnglishDictionary.Word word : words) {

            boolean categoryOK =
                    selectedCategory.equals("ALL")
                    || word.category.equals(selectedCategory);

            boolean letterOK =
                    selectedLetter.equals("ALL")
                    || word.english
                        .toUpperCase()
                        .startsWith(selectedLetter);

            boolean searchOK =
                    search.isEmpty()
                    || word.english
                        .toLowerCase()
                        .contains(search)
                    || word.russian
                        .toLowerCase()
                        .contains(search)
                    || word.azerbaijani
                        .toLowerCase()
                        .contains(search);

            if (!categoryOK || !letterOK || !searchOK) {
                continue;
            }

            addWordCard(word);

            count++;
        }

        if (count == 0) {

            TextView empty = new TextView(this);

            empty.setText(getNoResultsText());
            empty.setTextSize(17);
            empty.setTextColor(Color.BLACK);
            empty.setGravity(Gravity.CENTER);
            empty.setPadding(20, 40, 20, 40);

            listLayout.addView(empty);
        }
    }

    // =========================================================
    // WORD CARD
    // =========================================================

    private void addWordCard(
            EnglishDictionary.Word word
    ) {

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

        card.setBackgroundResource(
                android.R.drawable.dialog_holo_light_frame
        );

        LinearLayout.LayoutParams cardParams =
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                );

        cardParams.setMargins(0, 5, 0, 5);

        card.setLayoutParams(cardParams);

        // ENGLISH
        TextView english = new TextView(this);

        english.setText(
                "🇬🇧 " + word.english
        );

        english.setTextSize(20);
        english.setTextColor(Color.BLACK);
        english.setTypeface(null, Typeface.BOLD);

        card.addView(english);

        // RUSSIAN
        TextView russian = new TextView(this);

        russian.setText(
                "🇷🇺 " + word.russian
        );

        russian.setTextSize(16);
        russian.setTextColor(Color.BLACK);

        card.addView(russian);

        // AZERBAIJANI
        TextView azerbaijani = new TextView(this);

        azerbaijani.setText(
                "🇦🇿 " + word.azerbaijani
        );

        azerbaijani.setTextSize(16);
        azerbaijani.setTextColor(Color.BLACK);

        card.addView(azerbaijani);

        // CATEGORY
        TextView category = new TextView(this);

        category.setText(
                "📂 " + getCategoryName(word.category)
        );

        category.setTextSize(13);
        category.setTextColor(Color.DKGRAY);

        category.setPadding(0, 8, 0, 4);

        card.addView(category);

        // BUTTONS
        LinearLayout buttons =
                new LinearLayout(this);

        buttons.setOrientation(
                LinearLayout.HORIZONTAL
        );

        buttons.setGravity(Gravity.CENTER_VERTICAL);

        // SPEAK
        TextView speak =
                createActionButton("🔊");

        speak.setOnClickListener(v ->
                speak(word.english)
        );

        buttons.addView(speak);

        // FAVORITE
        TextView favorite =
                createActionButton(
                        favorites.contains(word.english)
                                ? "⭐"
                                : "☆"
                );

        favorite.setOnClickListener(v -> {

            if (favorites.contains(word.english)) {

                favorites.remove(word.english);
                favorite.setText("☆");

            } else {

                favorites.add(word.english);
                favorite.setText("⭐");
            }

            saveFavorites();
        });

        buttons.addView(favorite);

        // COPY
        TextView copy =
                createActionButton("📋");

        copy.setOnClickListener(v -> {

            android.content.ClipboardManager clipboard =
                    (android.content.ClipboardManager)
                            getSystemService(
                                    Context.CLIPBOARD_SERVICE
                            );

            String text =
                    word.english
                    + "\n"
                    + word.russian
                    + "\n"
                    + word.azerbaijani;

            clipboard.setPrimaryClip(
                    android.content.ClipData.newPlainText(
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

        buttons.addView(copy);

        card.addView(buttons);

        listLayout.addView(card);
    }

    private TextView createActionButton(String text) {

        TextView button = new TextView(this);

        button.setText(text);
        button.setTextSize(18);
        button.setTextColor(Color.BLACK);
        button.setGravity(Gravity.CENTER);

        button.setPadding(15, 8, 15, 8);

        button.setBackgroundResource(
                android.R.drawable.btn_default
        );

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        55,
                        48
                );

        params.setMargins(3, 3, 3, 3);

        button.setLayoutParams(params);

        return button;
    }

    // =========================================================
    // FAVORITES
    // =========================================================

    private void saveFavorites() {

        getSharedPreferences(
                "WORKER_PRO_FAVORITES",
                MODE_PRIVATE
        )
                .edit()
                .putStringSet(
                        "english_words",
                        favorites
                )
                .apply();
    }

    // =========================================================
    // TTS
    // =========================================================

    private void speak(String text) {

        if (tts == null) return;

        setTtsLanguage();

        tts.speak(
                text,
                TextToSpeech.QUEUE_FLUSH,
                null,
                "worker_pro_word"
        );
    }

    private void setTtsLanguage() {

        if (tts == null) return;

        Locale locale =
                Locale.ENGLISH;

        tts.setLanguage(locale);
    }

    // =========================================================
    // LOCALIZATION
    // =========================================================

    private String getTitleText() {

        switch (language) {

            case "AZ":
                return "İşçilər üçün İngilis dili";

            case "EN":
                return "English for Workers";

            case "TR":
                return "İşçiler için İngilizce";

            case "DE":
                return "Englisch für Arbeiter";

            default:
                return "Английский для рабочих";
        }
    }

    private String getSearchText() {

        switch (language) {

            case "AZ":
                return "Axtar...";

            case "EN":
                return "Search...";

            case "TR":
                return "Ara...";

            case "DE":
                return "Suchen...";

            default:
                return "Поиск...";
        }
    }

    private String getNoResultsText() {

        switch (language) {

            case "AZ":
                return "Nəticə tapılmadı";

            case "EN":
                return "No results";

            case "TR":
                return "Sonuç bulunamadı";

            case "DE":
                return "Keine Ergebnisse";

            default:
                return "Ничего не найдено";
        }
    }

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

            default:
                return "Скопировано";
        }
    }

    private String getCategoryName(
            String category
    ) {

        if (language.equals("AZ")) {

            switch (category) {
                case "ALL": return "HAMISI";
                case "WORK": return "İŞ";
                case "MACHINE": return "MAŞIN";
                case "CNC": return "CNC";
                case "STAMPING": return "ŞTAMPLAMA";
                case "FURNACE": return "SOBALAR";
                case "FIRE": return "YANĞIN";
                case "SAFETY": return "TƏHLÜKƏSİZLİK";
                case "WELDING": return "QAYNAQ";
                case "GALVANIC": return "GALVANİK";
                case "MAINTENANCE": return "TƏMİR";
                case "QUALITY": return "KEYFİYYƏT";
                case "MEASUREMENT": return "ÖLÇMƏ";
                case "TOOLS": return "ALƏTLƏR";
            }

        } else if (language.equals("EN")) {

            switch (category) {
                case "ALL": return "ALL";
                case "WORK": return "WORK";
                case "MACHINE": return "MACHINE";
                case "CNC": return "CNC";
                case "STAMPING": return "STAMPING";
                case "FURNACE": return "FURNACE";
                case "FIRE": return "FIRE";
                case "SAFETY": return "SAFETY";
                case "WELDING": return "WELDING";
                case "GALVANIC": return "GALVANIC";
                case "MAINTENANCE": return "MAINTENANCE";
                case "QUALITY": return "QUALITY";
                case "MEASUREMENT": return "MEASUREMENT";
                case "TOOLS": return "TOOLS";
            }

        } else if (language.equals("TR")) {

            switch (category) {
                case "ALL": return "TÜMÜ";
                case "WORK": return "İŞ";
                case "MACHINE": return "MAKİNE";
                case "CNC": return "CNC";
                case "STAMPING": return "PRESLEME";
                case "FURNACE": return "FIRIN";
                case "FIRE": return "YANGIN";
                case "SAFETY": return "GÜVENLİK";
                case "WELDING": return "KAYNAK";
                case "GALVANIC": return "GALVANİK";
                case "MAINTENANCE": return "BAKIM";
                case "QUALITY": return "KALİTE";
                case "MEASUREMENT": return "ÖLÇÜM";
                case "TOOLS": return "ALETLER";
            }

        } else if (language.equals("DE")) {

            switch (category) {
                case "ALL": return "ALLE";
                case "WORK": return "ARBEIT";
                case "MACHINE": return "MASCHINE";
                case "CNC": return "CNC";
                case "STAMPING": return "STANZEN";
                case "FURNACE": return "OFEN";
                case "FIRE": return "FEUER";
                case "SAFETY": return "SICHERHEIT";
                case "WELDING": return "SCHWEISSEN";
                case "GALVANIC": return "GALVANISCH";
                case "MAINTENANCE": return "WARTUNG";
                case "QUALITY": return "QUALITÄT";
                case "MEASUREMENT": return "MESSUNG";
                case "TOOLS": return "WERKZEUGE";
            }

        } else {

            switch (category) {
                case "ALL": return "ВСЕ";
                case "WORK": return "РАБОТА";
                case "MACHINE": return "СТАНОК";
                case "CNC": return "CNC";
                case "STAMPING": return "ШТАМПОВКА";
                case "FURNACE": return "ПЕЧИ";
                case "FIRE": return "ПОЖАР";
                case "SAFETY": return "БЕЗОПАСНОСТЬ";
                case "WELDING": return "СВАРКА";
                case "GALVANIC": return "ГАЛЬВАНИКА";
                case "MAINTENANCE": return "РЕМОНТ";
                case "QUALITY": return "КАЧЕСТВО";
                case "MEASUREMENT": return "ИЗМЕРЕНИЕ";
                case "TOOLS": return "ИНСТРУМЕНТЫ";
            }
        }

        return category;
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