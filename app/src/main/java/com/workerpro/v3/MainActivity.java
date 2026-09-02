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

    int green = Color.rgb(0, 135, 70);
    int darkGreen = Color.rgb(0, 95, 50);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showMainScreen();
    }

    void showMainScreen() {

        ScrollView scroll = new ScrollView(this);

        content = new LinearLayout(this);
        content.setOrientation(LinearLayout.VERTICAL);
        content.setPadding(18, 0, 18, 25);
        content.setBackgroundColor(Color.rgb(247, 249, 248));

        scroll.addView(content);

        createHeader();
        createLanguageButtons();
        createSections();
        createDeveloper();

        setContentView(scroll);
    }

    void createHeader() {

        LinearLayout header = new LinearLayout(this);
        header.setOrientation(LinearLayout.VERTICAL);
        header.setGravity(Gravity.CENTER);
        header.setPadding(20, 28, 20, 25);

        GradientDrawable background = new GradientDrawable(
                GradientDrawable.Orientation.TOP_BOTTOM,
                new int[]{green, darkGreen}
        );

        header.setBackground(background);

        TextView logo = new TextView(this);
        logo.setText("WORKER PRO");
        logo.setTextSize(30);
        logo.setTypeface(null, Typeface.BOLD);
        logo.setTextColor(Color.WHITE);
        logo.setGravity(Gravity.CENTER);

        header.addView(logo);

        TextView subtitle = new TextView(this);
        subtitle.setText(getSubtitle());
        subtitle.setTextSize(15);
        subtitle.setTextColor(Color.WHITE);
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(0, 7, 0, 0);

        header.addView(subtitle);

        content.addView(header);
    }

    void createLanguageButtons() {

        LinearLayout languages = new LinearLayout(this);
        languages.setOrientation(LinearLayout.HORIZONTAL);
        languages.setGravity(Gravity.LEFT | Gravity.CENTER_VERTICAL);
        languages.setPadding(0, 12, 0, 8);

        TextView label = new TextView(this);
        label.setText("LANG:");
        label.setTextSize(13);
        label.setTypeface(null, Typeface.BOLD);
        label.setTextColor(Color.DKGRAY);

        languages.addView(label);

        Button ru = smallLanguageButton("RU");
        Button az = smallLanguageButton("AZ");
        Button en = smallLanguageButton("EN");

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

    Button smallLanguageButton(String text) {

        Button button = new Button(this);
        button.setText(text);
        button.setTextSize(12);
        button.setTextColor(green);
        button.setAllCaps(false);
        button.setPadding(8, 0, 8, 0);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        45
                );

        params.setMargins(5, 0, 5, 0);
        button.setLayoutParams(params);

        return button;
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
        card.setPadding(18, 14, 18, 14);

        GradientDrawable background = new GradientDrawable();
        background.setColor(Color.WHITE);
        background.setCornerRadius(22);
        background.setStroke(2, Color.rgb(220, 230, 224));

        card.setBackground(background);

        LinearLayout.LayoutParams cardParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        78
                );

        cardParams.setMargins(0, 6, 0, 6);
        card.setLayoutParams(cardParams);

        TextView icon = new TextView(this);
        icon.setText(getIcon(number));
        icon.setTextSize(28);
        icon.setGravity(Gravity.CENTER);
        icon.setLayoutParams(
                new LinearLayout.LayoutParams(55, 55)
        );

        card.addView(icon);

        TextView name = new TextView(this);
        name.setText(getSectionName(number));
        name.setTextSize(17);
        name.setTypeface(null, Typeface.BOLD);
        name.setTextColor(Color.rgb(35, 45, 40));
        name.setGravity(Gravity.CENTER_VERTICAL);
        name.setPadding(12, 0, 5, 0);

        card.addView(name);

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
        developer.setPadding(0, 25, 0, 5);

        content.addView(developer);
    }
}