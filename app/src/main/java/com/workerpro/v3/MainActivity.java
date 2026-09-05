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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createMainScreen();
    }

    private void createMainScreen() {

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(Color.WHITE);

        TextView header = new TextView(this);
        header.setText("WORKER PRO");
        header.setTextSize(30);
        header.setTypeface(null, Typeface.BOLD);
        header.setGravity(Gravity.CENTER);
        header.setPadding(0, 25, 0, 5);

        root.addView(header);

        TextView subtitle = new TextView(this);
        subtitle.setText(getSubtitle());
        subtitle.setTextSize(16);
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(0, 0, 0, 15);

        root.addView(subtitle);

        LinearLayout languages = new LinearLayout(this);
        languages.setOrientation(LinearLayout.HORIZONTAL);
        languages.setGravity(Gravity.CENTER);

        Button ruButton = new Button(this);
        ruButton.setText("RU");

        Button azButton = new Button(this);
        azButton.setText("AZ");

        Button enButton = new Button(this);
        enButton.setText("EN");

        languages.addView(ruButton);
        languages.addView(azButton);
        languages.addView(enButton);

        root.addView(languages);

        ScrollView scrollView = new ScrollView(this);

        LinearLayout menu = new LinearLayout(this);
        menu.setOrientation(LinearLayout.VERTICAL);
        menu.setPadding(20, 10, 20, 10);

        for (int i = 0; i < 12; i++) {

            final int number = i + 1;

            Button button = new Button(this);
            button.setText(getMenuText(i));
            button.setTextSize(17);
            button.setAllCaps(false);

            LinearLayout.LayoutParams params =
                    new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.WRAP_CONTENT
                    );

            params.setMargins(0, 5, 0, 5);

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
        footer.setTextSize(14);
        footer.setGravity(Gravity.CENTER);
        footer.setPadding(0, 8, 0, 10);

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
    }

    private String getMenuText(int index) {

        if (language.equals("AZ")) {
            return az[index];
        }

        if (language.equals("EN")) {
            return en[index];
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