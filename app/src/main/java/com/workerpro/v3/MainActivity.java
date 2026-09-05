package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.View;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createMainScreen();
    }

    private void createMainScreen() {

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(Color.WHITE);

        // Верхняя строка
        LinearLayout topBar = new LinearLayout(this);
        topBar.setOrientation(LinearLayout.HORIZONTAL);
        topBar.setGravity(Gravity.CENTER_VERTICAL);
        topBar.setPadding(8, 12, 4, 5);

        TextView header = new TextView(this);
        header.setText("WORKER PRO");
        header.setTextSize(22);
        header.setTypeface(null, Typeface.BOLD);
        header.setGravity(Gravity.CENTER_VERTICAL);

        topBar.addView(
                header,
                new LinearLayout.LayoutParams(
                        0,
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        1
                )
        );

        // Языки справа
        LinearLayout languages = new LinearLayout(this);
        languages.setOrientation(LinearLayout.HORIZONTAL);
        languages.setGravity(Gravity.CENTER_VERTICAL);

        TextView ruButton = createLanguageButton("RU");
        TextView azButton = createLanguageButton("AZ");
        TextView enButton = createLanguageButton("EN");
        TextView trButton = createLanguageButton("TR");
        TextView deButton = createLanguageButton("DE");

        languages.addView(ruButton);
        languages.addView(azButton);
        languages.addView(enButton);
        languages.addView(trButton);
        languages.addView(deButton);

        topBar.addView(languages);

        root.addView(topBar);

        TextView subtitle = new TextView(this);
        subtitle.setText(getSubtitle());
        subtitle.setTextSize(15);
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(0, 0, 0, 10);

        root.addView(subtitle);

        ScrollView scrollView = new ScrollView(this);

        LinearLayout menu = new LinearLayout(this);
        menu.setOrientation(LinearLayout.VERTICAL);
        menu.setPadding(15, 5, 15, 10);

        for (int i = 0; i < 12; i++) {

            final int number = i + 1;

            Button button = new Button(this);
            button.setText(getMenuText(i));
            button.setTextSize(16);
            button.setAllCaps(false);

            LinearLayout.LayoutParams params =
                    new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.WRAP_CONTENT
                    );

            params.setMargins(0, 3, 0, 3);

            menu.addView(button, params);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openSection(number);
                }
            });
        }

        scrollView.addView(menu);

        root.addView(
                scrollView,
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        0,
                        1
                )
        );

        TextView footer = new TextView(this);
        footer.setText("F.S");
        footer.setTextSize(13);
        footer.setGravity(Gravity.CENTER);
        footer.setPadding(0, 5, 0, 8);

        root.addView(footer);

        setContentView(root);

        ruButton.setOnClickListener(v -> {
            language = "RU";
            createMainScreen();
        });

        azButton.setOnClickListener(v -> {
            language = "AZ";
            createMainScreen();
        });

        enButton.setOnClickListener(v -> {
            language = "EN";
            createMainScreen();
        });

        trButton.setOnClickListener(v -> {
            language = "TR";
            createMainScreen();
        });

        deButton.setOnClickListener(v -> {
            language = "DE";
            createMainScreen();
        });
    }

    private TextView createLanguageButton(String text) {

        TextView button = new TextView(this);
        button.setText(text);
        button.setTextSize(11);
        button.setTypeface(null, Typeface.BOLD);
        button.setGravity(Gravity.CENTER);
        button.setPadding(3, 3, 3, 3);
        button.setClickable(true);
        button.setFocusable(true);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        32,
                        38
                );

        button.setLayoutParams(params);

        return button;
    }

    private String getMenuText(int index) {

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

    private void openSection(int number) {

        Intent intent = null;

        switch (number) {

            case 1:
                intent = new Intent(this, SafetyActivity.class);
                break;

            case 2:
                intent = new Intent(this, ProductionActivity.class);
                break;

            case 3:
                intent = new Intent(this, StampingActivity.class);
                break;

            case 4:
                intent = new Intent(this, FurnaceActivity.class);
                break;

            case 5:
                intent = new Intent(this, FireExtinguisherActivity.class);
                break;

            case 6:
                intent = new Intent(this, SensorsActivity.class);
                break;

            case 7:
                intent = new Intent(this, WeldingActivity.class);
                break;

            case 8:
                intent = new Intent(this, QualityControlActivity.class);
                break;

            case 9:
                intent = new Intent(this, EnglishActivity.class);
                break;

            case 10:
                intent = new Intent(this, PhrasebookActivity.class);
                break;

            case 11:
                intent = new Intent(this, LessonOfDayActivity.class);
                break;

            case 12:
                intent = new Intent(this, ProgressActivity.class);
                break;
        }

        if (intent != null) {
            intent.putExtra("LANGUAGE", language);
            startActivity(intent);
        }
    }
}