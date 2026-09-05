package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {

    private String language = "RU";

    private final String[] ru = {
            "🦺 Безопасность",
            "🏭 Производство",
            "🔨 Штамповка",
            "🔥 Печи и нагрев",
            "🧯 Огнетушители",
            "📡 Датчики",
            "⚡ Сварка",
            "✅ Контроль качества",
            "🇬🇧 English for Workers",
            "💬 Разговорник",
            "📚 Урок дня",
            "🏆 Мой прогресс"
    };

    private final String[] az = {
            "🦺 Təhlükəsizlik",
            "🏭 İstehsalat",
            "🔨 Ştamplama",
            "🔥 Sobalar və qızdırma",
            "🧯 Yanğınsöndürənlər",
            "📡 Sensorlar",
            "⚡ Qaynaq",
            "✅ Keyfiyyətə nəzarət",
            "🇬🇧 İşçilər üçün İngilis dili",
            "💬 Danışıq kitabçası",
            "📚 Günün dərsi",
            "🏆 Mənim irəliləyişim"
    };

    private final String[] en = {
            "🦺 Safety",
            "🏭 Production",
            "🔨 Stamping",
            "🔥 Furnaces & Heating",
            "🧯 Fire Extinguishers",
            "📡 Sensors",
            "⚡ Welding",
            "✅ Quality Control",
            "🇬🇧 English for Workers",
            "💬 Phrasebook",
            "📚 Lesson of the Day",
            "🏆 My Progress"
    };

    private final String[] tr = {
            "🦺 İş Güvenliği",
            "🏭 Üretim",
            "🔨 Presleme",
            "🔥 Fırınlar ve Isıtma",
            "🧯 Yangın Söndürücüler",
            "📡 Sensörler",
            "⚡ Kaynak",
            "✅ Kalite Kontrol",
            "🇬🇧 İşçiler için İngilizce",
            "💬 Konuşma Kitabı",
            "📚 Günün Dersi",
            "🏆 İlerlemem"
    };

    private final String[] de = {
            "🦺 Arbeitssicherheit",
            "🏭 Produktion",
            "🔨 Stanzen",
            "🔥 Öfen und Erwärmung",
            "🧯 Feuerlöscher",
            "📡 Sensoren",
            "⚡ Schweißen",
            "✅ Qualitätskontrolle",
            "🇬🇧 Englisch für Arbeiter",
            "💬 Sprachführer",
            "📚 Lektion des Tages",
            "🏆 Mein Fortschritt"
    };

    private int dp(int value) {
        return (int) (
                value *
                getResources()
                        .getDisplayMetrics()
                        .density + 0.5f
        );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createMainScreen();
    }

    private void createMainScreen() {

        LinearLayout root = new LinearLayout(this);

        root.setOrientation(
                LinearLayout.VERTICAL
        );

        root.setBackgroundColor(
                Color.WHITE
        );

        root.setPadding(
                dp(8),
                dp(5),
                dp(8),
                dp(3)
        );

        // =========================
        // ВЕРХНЯЯ ПАНЕЛЬ
        // =========================

        LinearLayout topBar =
                new LinearLayout(this);

        topBar.setOrientation(
                LinearLayout.HORIZONTAL
        );

        topBar.setGravity(
                Gravity.CENTER_VERTICAL
        );

        TextView header =
                new TextView(this);

        header.setText(
                "WORKER PRO"
        );

        header.setTextSize(22);

        header.setTextColor(
                Color.BLACK
        );

        header.setTypeface(
                null,
                Typeface.BOLD
        );

        header.setGravity(
                Gravity.CENTER_VERTICAL
        );

        header.setIncludeFontPadding(
                false
        );

        topBar.addView(
                header,
                new LinearLayout.LayoutParams(
                        0,
                        dp(50),
                        1
                )
        );

        // =========================
        // ЯЗЫКИ
        // =========================

        LinearLayout languages =
                new LinearLayout(this);

        languages.setOrientation(
                LinearLayout.HORIZONTAL
        );

        languages.setGravity(
                Gravity.CENTER_VERTICAL
        );

        TextView ruButton =
                createLanguageButton(
                        "🇷🇺\nRU"
                );

        TextView azButton =
                createLanguageButton(
                        "🇦🇿\nAZ"
                );

        TextView enButton =
                createLanguageButton(
                        "🇬🇧\nEN"
                );

        TextView trButton =
                createLanguageButton(
                        "🇹🇷\nTR"
                );

        TextView deButton =
                createLanguageButton(
                        "🇩🇪\nDE"
                );

        languages.addView(ruButton);
        languages.addView(azButton);
        languages.addView(enButton);
        languages.addView(trButton);
        languages.addView(deButton);

        topBar.addView(
                languages,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        dp(50)
                )
        );

        root.addView(
                topBar,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        dp(52)
                )
        );

        // =========================
        // ПОДЗАГОЛОВОК
        // =========================

        TextView subtitle =
                new TextView(this);

        subtitle.setText(
                getSubtitle()
        );

        subtitle.setTextSize(15);

        subtitle.setTextColor(
                Color.DKGRAY
        );

        subtitle.setGravity(
                Gravity.CENTER
        );

        subtitle.setIncludeFontPadding(
                false
        );

        subtitle.setPadding(
                0,
                dp(3),
                0,
                dp(8)
        );

        root.addView(
                subtitle,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        dp(35)
                )
        );

        // =========================
        // МЕНЮ
        // =========================

        ScrollView scrollView =
                new ScrollView(this);

        scrollView.setFillViewport(
                true
        );

        LinearLayout menu =
                new LinearLayout(this);

        menu.setOrientation(
                LinearLayout.VERTICAL
        );

        menu.setPadding(
                dp(10),
                dp(3),
                dp(10),
                dp(10)
        );

        for (int i = 0; i < 12; i++) {

            final int number =
                    i + 1;

            Button button =
                    new Button(this);

            button.setText(
                    getMenuText(i)
            );

            button.setTextSize(16);

            button.setTextColor(
                    Color.WHITE
            );

            button.setTypeface(
                    null,
                    Typeface.BOLD
            );

            button.setAllCaps(
                    false
            );

            button.setGravity(
                    Gravity.CENTER
            );

            button.setIncludeFontPadding(
                    false
            );

            button.setPadding(
                    dp(10),
                    0,
                    dp(10),
                    0
            );

            // Зелёный фон
            GradientDrawable greenBg =
                    new GradientDrawable();

            greenBg.setColor(
                    Color.rgb(
                            46,
                            125,
                            50
                    )
            );

            greenBg.setCornerRadius(
                    dp(14)
            );

            greenBg.setStroke(
                    dp(1),
                    Color.rgb(
                            27,
                            94,
                            32
                    )
            );

            button.setBackground(
                    greenBg
            );

            LinearLayout.LayoutParams params =
                    new LinearLayout.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT,
                            dp(54)
                    );

            params.setMargins(
                    0,
                    dp(4),
                    0,
                    dp(4)
            );

            menu.addView(
                    button,
                    params
            );

            button.setOnClickListener(
                    new View.OnClickListener() {

                        @Override
                        public void onClick(
                                View v
                        ) {

                            openSection(
                                    number
                            );
                        }
                    }
            );
        }

        scrollView.addView(
                menu
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
        // НИЗ
        // =========================

        TextView footer =
                new TextView(this);

        footer.setText(
                "F.S"
        );

        footer.setTextSize(13);

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

        // =========================
        // ПЕРЕКЛЮЧЕНИЕ ЯЗЫКОВ
        // =========================

        ruButton.setOnClickListener(
                v -> {

                    language = "RU";
                    createMainScreen();
                }
        );

        azButton.setOnClickListener(
                v -> {

                    language = "AZ";
                    createMainScreen();
                }
        );

        enButton.setOnClickListener(
                v -> {

                    language = "EN";
                    createMainScreen();
                }
        );

        trButton.setOnClickListener(
                v -> {

                    language = "TR";
                    createMainScreen();
                }
        );

        deButton.setOnClickListener(
                v -> {

                    language = "DE";
                    createMainScreen();
                }
        );
    }

    // =========================
    // КНОПКА ЯЗЫКА
    // =========================

    private TextView createLanguageButton(
            String text
    ) {

        TextView button =
                new TextView(this);

        button.setText(
                text
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

        button.setLineSpacing(
                0,
                0.85f
        );

        button.setClickable(
                true
        );

        button.setFocusable(
                true
        );

        button.setPadding(
                dp(2),
                dp(1),
                dp(2),
                dp(1)
        );

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        dp(46),
                        dp(48)
                );

        params.setMargins(
                dp(1),
                0,
                dp(1),
                0
        );

        button.setLayoutParams(
                params
        );

        return button;
    }

    // =========================
    // ТЕКСТ МЕНЮ
    // =========================

    private String getMenuText(
            int index
    ) {

        if (language.equals("AZ")) {
            return az[index];
        }

        if (language.equals("EN")) {
            return en[index];
        }

        if (language.equals("TR")) {
            return tr[index];
        }

        if (language.equals("DE")) {
            return de[index];
        }

        return ru[index];
    }

    // =========================
    // ПОДЗАГОЛОВОК
    // =========================

    private String getSubtitle() {

        if (language.equals("AZ")) {
            return "İşçilər üçün İngilis dili";
        }

        if (language.equals("EN")) {
            return "English for Workers";
        }

        if (language.equals("TR")) {
            return "İşçiler için İngilizce";
        }

        if (language.equals("DE")) {
            return "Englisch für Arbeiter";
        }

        return "Английский язык для работников";
    }

    // =========================
    // ОТКРЫТИЕ РАЗДЕЛОВ
    // =========================

    private void openSection(
            int number
    ) {

        Intent intent = null;

        switch (number) {

            case 1:
                intent = new Intent(
                        this,
                        SafetyActivity.class
                );
                break;

            case 2:
                intent = new Intent(
                        this,
                        ProductionActivity.class
                );
                break;

            case 3:
                intent = new Intent(
                        this,
                        StampingActivity.class
                );
                break;

            case 4:
                intent = new Intent(
                        this,
                        FurnaceActivity.class
                );
                break;

            case 5:
                intent = new Intent(
                        this,
                        FireExtinguisherActivity.class
                );
                break;

            case 6:
                intent = new Intent(
                        this,
                        SensorsActivity.class
                );
                break;

            case 7:
                intent = new Intent(
                        this,
                        WeldingActivity.class
                );
                break;

            case 8:
                intent = new Intent(
                        this,
                        QualityControlActivity.class
                );
                break;

            case 9:
                intent = new Intent(
                        this,
                        EnglishActivity.class
                );
                break;

            case 10:
                intent = new Intent(
                        this,
                        PhrasebookActivity.class
                );
                break;

            case 11:
                intent = new Intent(
                        this,
                        LessonOfDayActivity.class
                );
                break;

            case 12:
                intent = new Intent(
                        this,
                        ProgressActivity.class
                );
                break;
        }

        if (intent != null) {

            intent.putExtra(
                    "LANGUAGE",
                    language
            );

            startActivity(
                    intent
            );
        }
    }
}