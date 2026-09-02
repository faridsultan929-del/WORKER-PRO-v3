package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    String language = "RU";
    LinearLayout content;

    int green = Color.rgb(0, 145, 75);
    int darkGreen = Color.rgb(0, 95, 50);
    int lightBackground = Color.rgb(246, 249, 247);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            language = savedInstanceState.getString("language", "RU");
        }

        showMainScreen();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("language", language);
        super.onSaveInstanceState(outState);
    }

    void showMainScreen() {

        ScrollView scroll = new ScrollView(this);
        scroll.setBackgroundColor(lightBackground);

        content = new LinearLayout(this);
        content.setOrientation(LinearLayout.VERTICAL);
        content.setPadding(14, 0, 14, 25);

        scroll.addView(content);

        // ЯЗЫКИ — САМЫЙ ВЕРХ, СЛЕВА
        createLanguageButtons();

        // ЗЕЛЕНАЯ ШАПКА
        createHeader();

        // РАЗДЕЛЫ
        createSections();

        // РАЗРАБОТЧИК
        createDeveloper();

        setContentView(scroll);
    }

    void createLanguageButtons() {

        LinearLayout languages = new LinearLayout(this);
        languages.setOrientation(LinearLayout.HORIZONTAL);
        languages.setGravity(Gravity.LEFT | Gravity.CENTER_VERTICAL);
        languages.setPadding(0, 10, 0, 8);

        Button ru = languageButton("RU");
        Button az = languageButton("AZ");
        Button en = languageButton("EN");

        ru.setOnClickListener(v -> {
            language = "RU";
            showMainScreen();
        });

        az.setOnClickListener(v -> {
            language = "AZ";
            showMainScreen();
        });

        en.setOnClickListener(v -> {
            language = "EN";
            showMainScreen();
        });

        languages.addView(ru);
        languages.addView(az);
        languages.addView(en);

        content.addView(languages);
    }

    Button languageButton(String text) {

        Button button = new Button(this);

        button.setText(text);
        button.setTextSize(12);
        button.setTypeface(null, Typeface.BOLD);
        button.setAllCaps(false);
        button.setTextColor(
                text.equals(language) ? Color.WHITE : green
        );

        GradientDrawable bg = new GradientDrawable();
        bg.setCornerRadius(30);

        if (text.equals(language)) {
            bg.setColor(green);
        } else {
            bg.setColor(Color.WHITE);
            bg.setStroke(2, green);
        }

        button.setBackground(bg);
        button.setPadding(5, 0, 5, 0);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(55, 38);

        params.setMargins(0, 0, 7, 0);

        button.setLayoutParams(params);

        return button;
    }

    void createHeader() {

        LinearLayout header = new LinearLayout(this);
        header.setOrientation(LinearLayout.VERTICAL);
        header.setGravity(Gravity.CENTER);
        header.setPadding(15, 24, 15, 25);

        GradientDrawable background = new GradientDrawable(
                GradientDrawable.Orientation.TOP_BOTTOM,
                new int[]{green, darkGreen}
        );

        background.setCornerRadius(28);

        header.setBackground(background);

        LinearLayout.LayoutParams headerParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );

        headerParams.setMargins(0, 4, 0, 18);

        header.setLayoutParams(headerParams);

        TextView logo = new TextView(this);
        logo.setText("WORKER PRO");
        logo.setTextSize(30);
        logo.setTypeface(null, Typeface.BOLD);
        logo.setTextColor(Color.WHITE);
        logo.setGravity(Gravity.CENTER);

        header.addView(logo);

        TextView subtitle = new TextView(this);
        subtitle.setText(getSubtitle());
        subtitle.setTextSize(14);
        subtitle.setTextColor(Color.WHITE);
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(0, 7, 0, 0);

        header.addView(subtitle);

        content.addView(header);
    }

    void createSections() {

        addSection(1);
        addSection(2);
        addSection(3);
        addSection(4);
        addSection(5);
        addSection(6);
        addSection(7);
        addSection(8);
        addSection(9);
    }

    void addSection(int number) {

        LinearLayout card = new LinearLayout(this);
        card.setOrientation(LinearLayout.HORIZONTAL);
        card.setGravity(Gravity.CENTER_VERTICAL);
        card.setPadding(16, 10, 16, 10);

        GradientDrawable background = new GradientDrawable();
        background.setColor(Color.WHITE);
        background.setCornerRadius(20);
        background.setStroke(2, Color.rgb(220, 230, 224));

        card.setBackground(background);

        LinearLayout.LayoutParams cardParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        78
                );

        // БОЛЬШОЙ ОТСТУП МЕЖДУ РАЗДЕЛАМИ
        cardParams.setMargins(0, 8, 0, 8);

        card.setLayoutParams(cardParams);

        TextView icon = new TextView(this);
        icon.setText(getIcon(number));
        icon.setTextSize(27);
        icon.setGravity(Gravity.CENTER);

        GradientDrawable iconBackground = new GradientDrawable();
        iconBackground.setColor(Color.rgb(232, 246, 238));
        iconBackground.setCornerRadius(18);

        icon.setBackground(iconBackground);

        LinearLayout.LayoutParams iconParams =
                new LinearLayout.LayoutParams(58, 58);

        icon.setLayoutParams(iconParams);

        card.addView(icon);

        TextView name = new TextView(this);
        name.setText(getSectionName(number));
        name.setTextSize(16);
        name.setTypeface(null, Typeface.BOLD);
        name.setTextColor(Color.rgb(35, 45, 40));
        name.setGravity(Gravity.CENTER_VERTICAL);
        name.setPadding(15, 0, 5, 0);

        LinearLayout.LayoutParams nameParams =
                new LinearLayout.LayoutParams(
                        0,
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        1
                );

        name.setLayoutParams(nameParams);

        card.addView(name);

        TextView arrow = new TextView(this);
        arrow.setText("›");
        arrow.setTextSize(28);
        arrow.setTextColor(green);
        arrow.setGravity(Gravity.CENTER);

        card.addView(arrow);

        card.setOnClickListener(v -> openSection(number));

        content.addView(card);
    }

    String getIcon(int n) {

        switch (n) {
            case 1: return "🦺";
            case 2: return "⚙";
            case 3: return "🔨";
            case 4: return "🔥";
            case 5: return "🧯";
            case 6: return "📡";
            case 7: return "🔧";
            case 8: return "✓";
            case 9: return "📚";
            default: return "•";
        }
    }

    String getSectionName(int n) {

        if (language.equals("AZ")) {

            switch (n) {
                case 1: return "İş təhlükəsizliyi";
                case 2: return "İstehsalat";
                case 3: return "Ştamplama";
                case 4: return "Sobalar və qızdırma";
                case 5: return "Yanğınsöndürənlər";
                case 6: return "Sensorlar";
                case 7: return "Qaynaq";
                case 8: return "Keyfiyyətə nəzarət";
                case 9: return "İşçilər üçün ingilis dili";
            }

        } else if (language.equals("EN")) {

            switch (n) {
                case 1: return "Workplace Safety";
                case 2: return "Manufacturing";
                case 3: return "Stamping";
                case 4: return "Furnaces & Heating";
                case 5: return "Fire Extinguishers";
                case 6: return "Sensors";
                case 7: return "Welding";
                case 8: return "Quality Control";
                case 9: return "English for Workers";
            }

        } else {

            switch (n) {
                case 1: return "Охрана труда";
                case 2: return "Производство";
                case 3: return "Штамповка";
                case 4: return "Печи и нагрев";
                case 5: return "Огнетушители";
                case 6: return "Датчики";
                case 7: return "Сварка";
                case 8: return "Контроль качества";
                case 9: return "Английский для рабочих";
            }
        }

        return "";
    }

    void openSection(int number) {

        if (number == 1) {

            Intent intent =
                    new Intent(MainActivity.this, SafetyActivity.class);

            // Передаем выбранный язык в раздел
            intent.putExtra("language", language);

            startActivity(intent);

        } else {

            Toast.makeText(
                    this,
                    getSectionName(number),
                    Toast.LENGTH_SHORT
            ).show();
        }
    }

    String getSubtitle() {

        if (language.equals("AZ")) {
            return "İşçilər üçün təhlükəsizlik və istehsalat bələdçisi";
        }

        if (language.equals("EN")) {
            return "Professional guide for workers and safety";
        }

        return "Профессиональный справочник для рабочих";
    }

    void createDeveloper() {

        TextView developer = new TextView(this);

        if (language.equals("AZ")) {

            developer.setText(
                    "Tərtibatçı: Sultanov Farid Rafiq oğlu"
            );

        } else if (language.equals("EN")) {

            developer.setText(
                    "Developer: Sultanov Farid Rafiq oglu"
            );

        } else {

            developer.setText(
                    "Разработчик: Султанов Фарид Рафиг оглы"
            );
        }

        developer.setTextSize(13);
        developer.setTextColor(Color.GRAY);
        developer.setGravity(Gravity.CENTER);
        developer.setPadding(0, 28, 0, 8);

        content.addView(developer);
    }
}