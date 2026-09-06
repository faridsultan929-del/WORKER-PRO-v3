package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.speech.tts.TextToSpeech;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Locale;

public class PhrasebookActivity extends Activity {

    private LinearLayout container;
    private EditText searchBox;
    private TextToSpeech tts;

    private String language = "RU";
    private String selectedCategory = "ALL";

    private SharedPreferences favorites;

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

        favorites = getSharedPreferences(
                "WORKER_PRO_FAVORITES",
                MODE_PRIVATE
        );

        tts = new TextToSpeech(this, status -> {
            if (status == TextToSpeech.SUCCESS) {
                setSpeechLanguage();
            }
        });

        createInterface();
    }

    private void createInterface() {

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(Color.WHITE);

        // =========================
        // ЗАГОЛОВОК
        // =========================

        TextView title = new TextView(this);

        title.setText(getTitleText());
        title.setTextSize(25);
        title.setTextColor(Color.rgb(0, 140, 70));
        title.setTypeface(null, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);

        title.setPadding(
                dp(8),
                dp(18),
                dp(8),
                dp(10)
        );

        root.addView(title);

        // =========================
        // ЯЗЫКИ
        // =========================

        HorizontalScrollView languageScroll =
                new HorizontalScrollView(this);

        languageScroll.setHorizontalScrollBarEnabled(false);

        LinearLayout languageLayout =
                new LinearLayout(this);

        languageLayout.setOrientation(
                LinearLayout.HORIZONTAL
        );

        languageLayout.setPadding(
                dp(8),
                dp(4),
                dp(8),
                dp(5)
        );

        String[] languages = {
                "RU",
                "AZ",
                "EN",
                "TR",
                "DE"
        };

        for (String lang : languages) {

            TextView button =
                    createLanguageButton(lang);

            languageLayout.addView(
                    button,
                    new LinearLayout.LayoutParams(
                            dp(65),
                            dp(44)
                    )
            );
        }

        languageScroll.addView(languageLayout);
        root.addView(languageScroll);

        // =========================
        // ПОИСК
        // =========================

        searchBox = new EditText(this);

        searchBox.setHint(
                getSearchText()
        );

        searchBox.setTextSize(16);
        searchBox.setSingleLine(true);

        searchBox.setPadding(
                dp(14),
                0,
                dp(14),
                0
        );

        root.addView(
                searchBox,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        dp(52)
                )
        );

        // =========================
        // ЗАГОЛОВОК РАЗДЕЛОВ
        // =========================

        TextView sectionsTitle =
                new TextView(this);

        sectionsTitle.setText(
                getSectionsText()
        );

        sectionsTitle.setTextSize(17);

        sectionsTitle.setTextColor(
                Color.rgb(0, 130, 60)
        );

        sectionsTitle.setTypeface(
                null,
                Typeface.BOLD
        );

        sectionsTitle.setPadding(
                dp(10),
                dp(8),
                dp(10),
                dp(4)
        );

        root.addView(sectionsTitle);

        // =========================
        // РАЗДЕЛЫ
        // =========================

        HorizontalScrollView categoryScroll =
                new HorizontalScrollView(this);

        categoryScroll.setHorizontalScrollBarEnabled(false);

        LinearLayout categoryLayout =
                new LinearLayout(this);

        categoryLayout.setOrientation(
                LinearLayout.HORIZONTAL
        );

        categoryLayout.setPadding(
                dp(6),
                dp(4),
                dp(6),
                dp(8)
        );

        for (String category : categories) {

            TextView button =
                    createCategoryButton(category);

            categoryLayout.addView(
                    button,
                    new LinearLayout.LayoutParams(
                            ViewGroup.LayoutParams.WRAP_CONTENT,
                            dp(48)
                    )
            );
        }

        categoryScroll.addView(categoryLayout);
        root.addView(categoryScroll);

        // =========================
        // СПИСОК ФРАЗ
        // =========================

        ScrollView scrollView =
                new ScrollView(this);

        container =
                new LinearLayout(this);

        container.setOrientation(
                LinearLayout.VERTICAL
        );

        container.setPadding(
                dp(8),
                dp(4),
                dp(8),
                dp(15)
        );

        scrollView.addView(container);

        root.addView(
                scrollView,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        0,
                        1
                )
        );

        // =========================
        // FOOTER
        // =========================

        TextView footer = new TextView(this);

        footer.setText("F.S");
        footer.setTextSize(14);
        footer.setTextColor(Color.GRAY);
        footer.setGravity(Gravity.CENTER);

        footer.setPadding(
                0,
                dp(5),
                0,
                dp(7)
        );

        root.addView(footer);

        setContentView(root);

        // =========================
        // ПОИСК
        // =========================

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

                        showPhrases();
                    }

                    @Override
                    public void afterTextChanged(
                            android.text.Editable s) {
                    }
                }
        );

        showPhrases();
    }

    // =====================================================
    // ЯЗЫК
    // =====================================================

    private TextView createLanguageButton(
            String lang) {

        TextView button = new TextView(this);

        button.setText(
                getLanguageButtonText(lang)
        );

        button.setTextSize(15);
        button.setTextColor(Color.WHITE);
        button.setGravity(Gravity.CENTER);
        button.setTypeface(null, Typeface.BOLD);

        if (lang.equals(language)) {

            button.setBackgroundColor(
                    Color.rgb(0, 115, 50)
            );

        } else {

            button.setBackgroundColor(
                    Color.rgb(0, 155, 70)
            );
        }

        button.setOnClickListener(v -> {

            language = lang;

            /*
             * После смены языка обновляем
             * весь экран.
             */
            recreateInterface();
        });

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        dp(65),
                        dp(44)
                );

        params.setMargins(
                dp(3),
                0,
                dp(3),
                0
        );

        button.setLayoutParams(params);

        return button;
    }

    private String getLanguageButtonText(
            String lang) {

        switch (lang) {

            case "RU":
                return "🇷🇺 RU";

            case "AZ":
                return "🇦🇿 AZ";

            case "EN":
                return "🇬🇧 EN";

            case "TR":
                return "🇹🇷 TR";

            case "DE":
                return "🇩🇪 DE";

            default:
                return lang;
        }
    }

    // =====================================================
    // ПЕРЕСОЗДАНИЕ ИНТЕРФЕЙСА
    // =====================================================

    private void recreateInterface() {

        if (tts != null) {
            setSpeechLanguage();
        }

        createInterface();
    }

    // =====================================================
    // РАЗДЕЛЫ
    // =====================================================

    private TextView createCategoryButton(
            String category) {

        TextView button = new TextView(this);

        button.setText(
                getCategoryIcon(category)
                        + " "
                        + getCategoryName(category)
        );

        button.setTextSize(14);

        button.setTextColor(Color.WHITE);

        button.setGravity(Gravity.CENTER);

        button.setTypeface(
                null,
                Typeface.BOLD
        );

        button.setPadding(
                dp(12),
                dp(4),
                dp(12),
                dp(4)
        );

        if (category.equals(selectedCategory)) {

            button.setBackgroundColor(
                    Color.rgb(0, 115, 50)
            );

        } else {

            button.setBackgroundColor(
                    Color.rgb(0, 150, 70)
            );
        }

        button.setOnClickListener(v -> {

            selectedCategory = category;

            showPhrases();
        });

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        dp(48)
                );

        params.setMargins(
                dp(3),
                0,
                dp(3),
                0
        );

        button.setLayoutParams(params);

        return button;
    }

    private String getCategoryIcon(
            String category) {

        switch (category) {

            case "WORK":
                return "👷";

            case "BOSS":
                return "👔";

            case "MACHINE":
                return "⚙";

            case "CNC":
                return "🛠";

            case "STAMPING":
                return "🔨";

            case "QUALITY":
                return "✓";

            case "SAFETY":
                return "🦺";

            case "FIRE":
                return "🔥";

            case "WELDING":
                return "⚡";

            case "GALVANIC":
                return "🧪";

            case "MAINTENANCE":
                return "🔧";

            case "EMERGENCY":
                return "🚨";

            default:
                return "📚";
        }
    }

    // =====================================================
    // ПЕРЕВОД РАЗДЕЛОВ
    // =====================================================

    private String getCategoryName(
            String category) {

        if (language.equals("RU")) {

            switch (category) {

                case "ALL":
                    return "ВСЕ";

                case "WORK":
                    return "РАБОТА";

                case "BOSS":
                    return "НАЧАЛЬНИК";

                case "MACHINE":
                    return "МАШИНА";

                case "CNC":
                    return "ЧПУ";

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
                    return "ОБСЛУЖИВАНИЕ";

                case "EMERGENCY":
                    return "АВАРИЯ";
            }
        }

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
                    return "QALVANİKA";

                case "MAINTENANCE":
                    return "TEXNİKİ XİDMƏT";

                case "EMERGENCY":
                    return "FÖVQƏLADƏ HAL";
            }
        }

        if (language.equals("TR")) {

            switch (category) {

                case "ALL":
                    return "TÜMÜ";

                case "WORK":
                    return "İŞ";

                case "BOSS":
                    return "PATRON";

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
                    return "GALVANIK";

                case "MAINTENANCE":
                    return "WARTUNG";

                case "EMERGENCY":
                    return "NOTFALL";
            }
        }

        // EN
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

            default:
                return category;
        }
    }

    // =====================================================
    // ФРАЗЫ
    // =====================================================

    private void showPhrases() {

        if (container == null) {
            return;
        }

        container.removeAllViews();

        List<WorkerPhrasebook.Phrase> phrases =
                WorkerPhrasebook.getPhrases();

        String query = "";

        if (searchBox != null) {

            query = searchBox
                    .getText()
                    .toString()
                    .toLowerCase()
                    .trim();
        }

        int count = 0;

        for (WorkerPhrasebook.Phrase phrase :
                phrases) {

            if (!selectedCategory.equals("ALL")
                    && !phrase.category.equals(
                    selectedCategory)) {

                continue;
            }

            if (!query.isEmpty()) {

                String allText =
                        phrase.english + " " +
                        phrase.russian + " " +
                        phrase.azerbaijani + " " +
                        phrase.turkish + " " +
                        phrase.german;

                if (!allText
                        .toLowerCase()
                        .contains(query)) {

                    continue;
                }
            }

            addPhraseCard(phrase);

            count++;
        }

        if (count == 0) {

            TextView empty =
                    new TextView(this);

            empty.setText(
                    getNoPhrasesText()
            );

            empty.setTextSize(17);
            empty.setTextColor(Color.GRAY);
            empty.setGravity(Gravity.CENTER);

            empty.setPadding(
                    dp(10),
                    dp(30),
                    dp(10),
                    dp(30)
            );

            container.addView(empty);
        }
    }

    // =====================================================
    // КАРТОЧКА
    // =====================================================

    private void addPhraseCard(
            WorkerPhrasebook.Phrase phrase) {

        LinearLayout card =
                new LinearLayout(this);

        card.setOrientation(
                LinearLayout.VERTICAL
        );

        card.setPadding(
                dp(12),
                dp(10),
                dp(8),
                dp(8)
        );

        card.setBackgroundColor(
                Color.rgb(245, 245, 245)
        );

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                );

        params.setMargins(
                0,
                dp(4),
                0,
                dp(4)
        );

        container.addView(card, params);

        // Английский
        TextView english =
                new TextView(this);

        english.setText(
                "🇬🇧 " + phrase.english
        );

        english.setTextSize(18);

        english.setTextColor(Color.BLACK);

        english.setTypeface(
                null,
                Typeface.BOLD
        );

        card.addView(english);

        // Выбранный язык
        TextView translation =
                new TextView(this);

        translation.setText(
                getLanguageFlag(language)
                        + " "
                        + getSelectedText(phrase)
        );

        translation.setTextSize(17);

        translation.setTextColor(
                Color.rgb(0, 110, 55)
        );

        translation.setPadding(
                0,
                dp(5),
                0,
                dp(5)
        );

        card.addView(translation);

        // Кнопки
        LinearLayout buttons =
                new LinearLayout(this);

        buttons.setOrientation(
                LinearLayout.HORIZONTAL
        );

        buttons.setGravity(
                Gravity.RIGHT
        );

        // COPY
        TextView copy =
                createActionButton(
                        "📋",
                        25
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
                            + getSelectedText(phrase);

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

        buttons.addView(
                copy,
                new LinearLayout.LayoutParams(
                        dp(55),
                        dp(48)
                )
        );

        // FAVORITE
        TextView favorite =
                createActionButton(
                        isFavorite(phrase)
                                ? "⭐"
                                : "☆",
                        25
                );

        favorite.setOnClickListener(v -> {

            String key =
                    phrase.english;

            boolean state =
                    favorites.getBoolean(
                            key,
                            false
                    );

            favorites.edit()
                    .putBoolean(
                            key,
                            !state
                    )
                    .apply();

            favorite.setText(
                    !state
                            ? "⭐"
                            : "☆"
            );
        });

        buttons.addView(
                favorite,
                new LinearLayout.LayoutParams(
                        dp(55),
                        dp(48)
                )
        );

        // SPEAKER
        TextView speak =
                createActionButton(
                        "🔊",
                        26
                );

        speak.setTextColor(
                Color.rgb(0, 130, 60)
        );

        speak.setOnClickListener(v -> speakPhrase(phrase));

        buttons.addView(
                speak,
                new LinearLayout.LayoutParams(
                        dp(55),
                        dp(48)
                )
        );

        card.addView(buttons);
    }

    // =====================================================
    // ОЗВУЧКА
    // =====================================================

    private void speakPhrase(
            WorkerPhrasebook.Phrase phrase) {

        if (tts == null) {
            return;
        }

        Locale locale =
                getSpeechLocale();

        int result =
                tts.setLanguage(locale);

        if (result ==
                TextToSpeech.LANG_MISSING_DATA
                ||
                result ==
                        TextToSpeech.LANG_NOT_SUPPORTED) {

            if (language.equals("AZ")) {

                Toast.makeText(
                        this,
                        "Для азербайджанского языка нет голосового пакета",
                        Toast.LENGTH_LONG
                ).show();

            } else {

                Toast.makeText(
                        this,
                        "Голос для этого языка недоступен",
                        Toast.LENGTH_LONG
                ).show();
            }

            return;
        }

        tts.speak(
                getSelectedText(phrase),
                TextToSpeech.QUEUE_FLUSH,
                null,
                "worker_phrase"
        );
    }

    // =====================================================
    // ТЕКСТ ВЫБРАННОГО ЯЗЫКА
    // =====================================================

    private String getSelectedText(
            WorkerPhrasebook.Phrase phrase) {

        switch (language) {

            case "AZ":
                return phrase.azerbaijani;

            case "EN":
                return phrase.english;

            case "TR":
                return phrase.turkish;

            case "DE":
                return phrase.german;

            case "RU":
            default:
                return phrase.russian;
        }
    }

    private String getLanguageFlag(
            String lang) {

        switch (lang) {

            case "AZ":
                return "🇦🇿";

            case "EN":
                return "🇬🇧";

            case "TR":
                return "🇹🇷";

            case "DE":
                return "🇩🇪";

            default:
                return "🇷🇺";
        }
    }

    // =====================================================
    // ИЗБРАННОЕ
    // =====================================================

    private boolean isFavorite(
            WorkerPhrasebook.Phrase phrase) {

        return favorites.getBoolean(
                phrase.english,
                false
        );
    }

    // =====================================================
    // TTS ЯЗЫК
    // =====================================================

    private Locale getSpeechLocale() {

        switch (language) {

            case "AZ":
                return new Locale(
                        "az",
                        "AZ"
                );

            case "EN":
                return new Locale(
                        "en",
                        "US"
                );

            case "TR":
                return new Locale(
                        "tr",
                        "TR"
                );

            case "DE":
                return new Locale(
                        "de",
                        "DE"
                );

            default:
                return new Locale(
                        "ru",
                        "RU"
                );
        }
    }

    private void setSpeechLanguage() {

        if (tts == null) {
            return;
        }

        tts.setLanguage(
                getSpeechLocale()
        );
    }

    // =====================================================
    // ТЕКСТЫ
    // =====================================================

    private String getTitleText() {

        switch (language) {

            case "AZ":
                return "DANIŞIQ KİTABÇASI";

            case "EN":
                return "PHRASEBOOK";

            case "TR":
                return "KONUŞMA KİTABI";

            case "DE":
                return "PHRASENBUCH";

            default:
                return "РАЗГОВОРНИК";
        }
    }

    private String getSectionsText() {

        switch (language) {

            case "AZ":
                return "BÖLMƏLƏR";

            case "EN":
                return "SECTIONS";

            case "TR":
                return "BÖLÜMLER";

            case "DE":
                return "BEREICHE";

            default:
                return "РАЗДЕЛЫ";
        }
    }

    private String getSearchText() {

        switch (language) {

            case "AZ":
                return "🔍  İfadə axtar...";

            case "EN":
                return "🔍  Search phrase...";

            case "TR":
                return "🔍  İfade ara...";

            case "DE":
                return "🔍  Phrase suchen...";

            default:
                return "🔍  Поиск фразы...";
        }
    }

    private String getNoPhrasesText() {

        switch (language) {

            case "AZ":
                return "İfadə tapılmadı";

            case "EN":
                return "No phrases found";

            case "TR":
                return "İfade bulunamadı";

            case "DE":
                return "Keine Sätze gefunden";

            default:
                return "Фразы не найдены";
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

    // =====================================================
    // КНОПКА
    // =====================================================

    private TextView createActionButton(
            String text,
            float size) {

        TextView button =
                new TextView(this);

        button.setText(text);
        button.setTextSize(size);
        button.setGravity(
                Gravity.CENTER
        );

        button.setTypeface(
                null,
                Typeface.BOLD
        );

        button.setBackgroundColor(
                Color.rgb(
                        235,
                        235,
                        235
                )
        );

        button.setClickable(true);
        button.setFocusable(true);

        return button;
    }

    // =====================================================
    // DP
    // =====================================================

    private int dp(int value) {

        return (int) (
                value *
                        getResources()
                                .getDisplayMetrics()
                                .density
        );
    }

    // =====================================================
    // DESTROY
    // =====================================================

    @Override
    protected void onDestroy() {

        if (tts != null) {

            tts.stop();
            tts.shutdown();
        }

        super.onDestroy();
    }
}