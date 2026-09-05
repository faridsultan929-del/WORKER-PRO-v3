package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.content.Context;
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

import android.graphics.drawable.GradientDrawable;

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
                tts.setLanguage(Locale.ENGLISH);
            }
        });

        createScreen();
    }

    private void createScreen() {

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(Color.WHITE);

        // =========================
        // TOP BAR
        // =========================

        LinearLayout topBar = new LinearLayout(this);
        topBar.setOrientation(LinearLayout.HORIZONTAL);
        topBar.setGravity(Gravity.CENTER_VERTICAL);
        topBar.setPadding(8, 8, 8, 8);

        TextView title = new TextView(this);

        title.setText("🇬🇧 " + getTitleText());
        title.setTextSize(17);
        title.setTextColor(Color.WHITE);
        title.setTypeface(null, Typeface.BOLD);
        title.setGravity(Gravity.CENTER_VERTICAL);
        title.setSingleLine(true);
        title.setEllipsize(
                android.text.TextUtils.TruncateAt.END
        );

        topBar.setBackgroundColor(
                Color.rgb(35, 35, 40)
        );

        topBar.addView(
                title,
                new LinearLayout.LayoutParams(
                        0,
                        58,
                        1
                )
        );

        String[] langs = {
                "RU",
                "AZ",
                "EN",
                "TR",
                "DE"
        };

        LinearLayout langLayout =
                new LinearLayout(this);

        langLayout.setOrientation(
                LinearLayout.HORIZONTAL
        );

        langLayout.setGravity(
                Gravity.CENTER_VERTICAL
        );

        for (String lang : langs) {

            TextView b =
                    new TextView(this);

            b.setText(lang);
            b.setTextSize(11);
            b.setTextColor(Color.BLACK);
            b.setTypeface(
                    null,
                    Typeface.BOLD
            );
            b.setGravity(Gravity.CENTER);

            GradientDrawable bg =
                    new GradientDrawable();

            bg.setColor(Color.WHITE);
            bg.setStroke(
                    2,
                    Color.DKGRAY
            );
            bg.setCornerRadius(9);

            b.setBackground(bg);

            LinearLayout.LayoutParams p =
                    new LinearLayout.LayoutParams(
                            37,
                            38
                    );

            p.setMargins(
                    2,
                    0,
                    2,
                    0
            );

            langLayout.addView(b, p);

            b.setOnClickListener(v -> {

                language = lang;

                getSharedPreferences(
                        "WORKER_PRO_SETTINGS",
                        MODE_PRIVATE
                )
                        .edit()
                        .putString(
                                "language",
                                language
                        )
                        .apply();

                createScreen();
            });
        }

        topBar.addView(langLayout);

        root.addView(
                topBar,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        74
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
                8,
                5,
                8,
                5
        );

        searchEdit =
                new EditText(this);

        searchEdit.setHint(
                getSearchText()
        );

        searchEdit.setTextColor(
                Color.BLACK
        );

        searchEdit.setHintTextColor(
                Color.GRAY
        );

        searchEdit.setTextSize(16);
        searchEdit.setSingleLine(true);

        searchEdit.setPadding(
                14,
                0,
                14,
                0
        );

        GradientDrawable searchBg =
                new GradientDrawable();

        searchBg.setColor(Color.WHITE);
        searchBg.setStroke(
                2,
                Color.DKGRAY
        );
        searchBg.setCornerRadius(14);

        searchEdit.setBackground(
                searchBg
        );

        searchRow.addView(
                searchEdit,
                new LinearLayout.LayoutParams(
                        0,
                        52,
                        1
                )
        );

        TextView searchButton =
                new TextView(this);

        searchButton.setText("🔍");
        searchButton.setTextSize(24);
        searchButton.setTextColor(Color.BLACK);
        searchButton.setGravity(
                Gravity.CENTER
        );

        GradientDrawable searchButtonBg =
                new GradientDrawable();

        searchButtonBg.setColor(
                Color.WHITE
        );

        searchButtonBg.setStroke(
                2,
                Color.DKGRAY
        );

        searchButtonBg.setCornerRadius(14);

        searchButton.setBackground(
                searchButtonBg
        );

        LinearLayout.LayoutParams searchParams =
                new LinearLayout.LayoutParams(
                        56,
                        52
                );

        searchParams.setMargins(
                6,
                0,
                0,
                0
        );

        searchRow.addView(
                searchButton,
                searchParams
        );

        root.addView(
                searchRow,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        62
                )
        );

        searchButton.setOnClickListener(
                v -> refreshList()
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

        // =========================
        // ALPHABET
        // =========================

        HorizontalScrollView alphabetScroll =
                new HorizontalScrollView(this);

        alphabetScroll.setHorizontalScrollBarEnabled(
                false
        );

        alphabetScroll.setPadding(
                4,
                2,
                4,
                2
        );

        LinearLayout alphabet =
                new LinearLayout(this);

        alphabet.setOrientation(
                LinearLayout.HORIZONTAL
        );

        alphabet.setGravity(
                Gravity.CENTER_VERTICAL
        );

        String[] letters = {
                "ALL",
                "A","B","C","D","E","F","G","H","I","J",
                "K","L","M","N","O","P","Q","R","S","T",
                "U","V","W","X","Y","Z"
        };

        for (String letter : letters) {

            TextView b =
                    createSectionButton(letter);

            alphabet.addView(b);

            b.setOnClickListener(v -> {

                selectedLetter =
                        ((TextView) v)
                                .getText()
                                .toString();

                refreshList();
            });
        }

        alphabetScroll.addView(
                alphabet
        );

        root.addView(
                alphabetScroll,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        82
                )
        );

        // =========================
        // SECTIONS TITLE
        // =========================

        TextView sectionTitle =
                new TextView(this);

        sectionTitle.setText(
                "📂 " + getSectionsText()
        );

        sectionTitle.setTextSize(17);
        sectionTitle.setTextColor(
                Color.BLACK
        );

        sectionTitle.setTypeface(
                null,
                Typeface.BOLD
        );

        sectionTitle.setGravity(
                Gravity.CENTER_VERTICAL
        );

        sectionTitle.setPadding(
                12,
                4,
                12,
                4
        );

        root.addView(
                sectionTitle,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        48
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

        categoryScroll.setPadding(
                4,
                2,
                4,
                2
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

            TextView b =
                    createSectionButton(
                            getCategoryName(
                                    category
                            )
                    );

            b.setTag(category);

            categoryLayout.addView(b);

            b.setOnClickListener(v -> {

                selectedCategory =
                        (String) v.getTag();

                refreshList();
            });
        }

        categoryScroll.addView(
                categoryLayout
        );

        root.addView(
                categoryScroll,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        84
                )
        );

        // =========================
        // WORD LIST
        // =========================

        ScrollView scroll =
                new ScrollView(this);

        listLayout =
                new LinearLayout(this);

        listLayout.setOrientation(
                LinearLayout.VERTICAL
        );

        listLayout.setPadding(
                8,
                5,
                8,
                10
        );

        scroll.addView(
                listLayout
        );

        root.addView(
                scroll,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        0,
                        1
                )
        );

        // =========================
        // FOOTER
        // =========================

        TextView footer =
                new TextView(this);

        footer.setText("F.S");
        footer.setTextSize(12);
        footer.setTextColor(Color.GRAY);
        footer.setGravity(
                Gravity.CENTER
        );

        footer.setPadding(
                0,
                4,
                0,
                6
        );

        root.addView(
                footer,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        32
                )
        );

        setContentView(root);

        refreshList();
    }

    // =========================
    // SECTION BUTTON
    // =========================

    private TextView createSectionButton(
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

        button.setPadding(
                18,
                5,
                18,
                5
        );

        button.setSingleLine(true);

        GradientDrawable bg =
                new GradientDrawable();

        bg.setColor(
                Color.WHITE
        );

        bg.setStroke(
                2,
                Color.DKGRAY
        );

        bg.setCornerRadius(
                18
        );

        button.setBackground(bg);

        LinearLayout.LayoutParams p =
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        62
                );

        p.setMargins(
                4,
                7,
                4,
                7
        );

        button.setLayoutParams(p);

        return button;
    }

    // =========================
    // WORD LIST
    // =========================

    private void refreshList() {

        if (listLayout == null)
            return;

        listLayout.removeAllViews();

        String search = "";

        if (searchEdit != null) {

            search =
                    searchEdit
                            .getText()
                            .toString()
                            .trim()
                            .toLowerCase();
        }

        List<EnglishDictionary.Word> words =
                EnglishDictionary.getWords();

        Collections.sort(
                words,
                new Comparator<
                        EnglishDictionary.Word>() {

                    @Override
                    public int compare(
                            EnglishDictionary.Word a,
                            EnglishDictionary.Word b
                    ) {
                        return a.english
                                .compareToIgnoreCase(
                                        b.english
                                );
                    }
                }
        );

        int count = 0;

        for (
                EnglishDictionary.Word word :
                words
        ) {

            boolean categoryOK =
                    selectedCategory.equals("ALL")
                    ||
                    word.category.equals(
                            selectedCategory
                    );

            boolean letterOK =
                    selectedLetter.equals("ALL")
                    ||
                    word.english
                            .toUpperCase()
                            .startsWith(
                                    selectedLetter
                            );

            boolean searchOK =
                    search.isEmpty()
                    ||
                    word.english
                            .toLowerCase()
                            .contains(search)
                    ||
                    word.russian
                            .toLowerCase()
                            .contains(search)
                    ||
                    word.azerbaijani
                            .toLowerCase()
                            .contains(search);

            if (
                    !categoryOK
                    ||
                    !letterOK
                    ||
                    !searchOK
            ) {
                continue;
            }

            addWordCard(word);

            count++;
        }

        if (count == 0) {

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

            empty.setPadding(
                    20,
                    50,
                    20,
                    50
            );

            listLayout.addView(
                    empty
            );
        }
    }

    // =========================
    // WORD CARD
    // =========================

    private void addWordCard(
            EnglishDictionary.Word word
    ) {

        LinearLayout card =
                new LinearLayout(this);

        card.setOrientation(
                LinearLayout.VERTICAL
        );

        card.setPadding(
                14,
                12,
                14,
                12
        );

        GradientDrawable cardBg =
                new GradientDrawable();

        cardBg.setColor(
                Color.WHITE
        );

        cardBg.setStroke(
                2,
                Color.LTGRAY
        );

        cardBg.setCornerRadius(
                15
        );

        card.setBackground(
                cardBg
        );

        LinearLayout.LayoutParams cp =
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                );

        cp.setMargins(
                0,
                4,
                0,
                4
        );

        card.setLayoutParams(cp);

        TextView english =
                new TextView(this);

        english.setText(
                "🇬🇧 " + word.english
        );

        english.setTextSize(20);
        english.setTextColor(
                Color.BLACK
        );

        english.setTypeface(
                null,
                Typeface.BOLD
        );

        card.addView(
                english
        );

        TextView russian =
                new TextView(this);

        russian.setText(
                "🇷🇺 " + word.russian
        );

        russian.setTextSize(16);
        russian.setTextColor(
                Color.BLACK
        );

        card.addView(
                russian
        );

        TextView az =
                new TextView(this);

        az.setText(
                "🇦🇿 " +
                word.azerbaijani
        );

        az.setTextSize(16);
        az.setTextColor(
                Color.BLACK
        );

        card.addView(
                az
        );

        TextView cat =
                new TextView(this);

        cat.setText(
                "📂 " +
                getCategoryName(
                        word.category
                )
        );

        cat.setTextSize(13);
        cat.setTextColor(
                Color.DKGRAY
        );

        cat.setPadding(
                0,
                7,
                0,
                3
        );

        card.addView(
                cat
        );

        LinearLayout buttons =
                new LinearLayout(this);

        buttons.setOrientation(
                LinearLayout.HORIZONTAL
        );

        TextView speak =
                createActionButton("🔊");

        speak.setOnClickListener(
                v -> speak(
                        word.english
                )
        );

        buttons.addView(
                speak
        );

        TextView favorite =
                createActionButton(
                        favorites.contains(
                                word.english
                        )
                        ? "⭐"
                        : "☆"
                );

        favorite.setOnClickListener(v -> {

            if (
                    favorites.contains(
                            word.english
                    )
            ) {

                favorites.remove(
                        word.english
                );

                favorite.setText("☆");

            } else {

                favorites.add(
                        word.english
                );

                favorite.setText("⭐");
            }

            saveFavorites();
        });

        buttons.addView(
                favorite
        );

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
                    android.content.ClipData
                            .newPlainText(
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

        buttons.addView(
                copy
        );

        card.addView(
                buttons
        );

        listLayout.addView(
                card
        );
    }

    private TextView createActionButton(
            String text
    ) {

        TextView b =
                new TextView(this);

        b.setText(text);
        b.setTextSize(19);
        b.setTextColor(
                Color.BLACK
        );

        b.setGravity(
                Gravity.CENTER
        );

        GradientDrawable bg =
                new GradientDrawable();

        bg.setColor(
                Color.WHITE
        );

        bg.setStroke(
                2,
                Color.DKGRAY
        );

        bg.setCornerRadius(
                12
        );

        b.setBackground(bg);

        LinearLayout.LayoutParams p =
                new LinearLayout.LayoutParams(
                        58,
                        48
                );

        p.setMargins(
                3,
                3,
                3,
                3
        );

        b.setLayoutParams(p);

        return b;
    }

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

    private void speak(
            String text
    ) {

        if (tts == null)
            return;

        tts.speak(
                text,
                TextToSpeech.QUEUE_FLUSH,
                null,
                "worker_pro_word"
        );
    }

    // =========================
    // LOCALIZATION
    // =========================

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

    private String getSectionsText() {

        switch (language) {

            case "AZ":
                return "Bölmələr";

            case "EN":
                return "Sections";

            case "TR":
                return "Bölümler";

            case "DE":
                return "Bereiche";

            default:
                return "Разделы";
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