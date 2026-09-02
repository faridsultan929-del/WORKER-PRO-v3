package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    String language = "RU";

    LinearLayout root;

    int green = Color.rgb(0, 145, 75);
    int darkGreen = Color.rgb(0, 95, 50);
    int background = Color.rgb(245, 248, 246);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        showMain();
    }

    void showMain() {

        ScrollView scroll = new ScrollView(this);
        scroll.setBackgroundColor(background);

        root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(15, 0, 15, 30);

        scroll.addView(root);

        // ЯЗЫКИ
        createLanguages();

        // ШАПКА
        createHeader();

        // РАЗДЕЛЫ
        createSections();

        // РАЗРАБОТЧИК
        createDeveloper();

        setContentView(scroll);
    }

    // =========================
    // ЯЗЫКИ
    // =========================

    void createLanguages() {

        LinearLayout languages = new LinearLayout(this);

        languages.setOrientation(LinearLayout.HORIZONTAL);
        languages.setGravity(Gravity.LEFT | Gravity.CENTER_VERTICAL);
        languages.setPadding(0, 12, 0, 10);

        Button ru = languageButton("RU");
        Button az = languageButton("AZ");
        Button en = languageButton("EN");

        ru.setOnClickListener(v -> {
            language = "RU";
            showMain();
        });

        az.setOnClickListener(v -> {
            language = "AZ";
            showMain();
        });

        en.setOnClickListener(v -> {
            language = "EN";
            showMain();
        });

        languages.addView(ru);
        languages.addView(az);
        languages.addView(en);

        root.addView(languages);
    }

    Button languageButton(String text) {

        Button button = new Button(this);

        button.setText(text);
        button.setTextSize(14);
        button.setTypeface(null, Typeface.BOLD);
        button.setAllCaps(false);

        if (text.equals(language)) {
            button.setTextColor(Color.WHITE);

            GradientDrawable selected = new GradientDrawable();
            selected.setColor(green);
            selected.setCornerRadius(40);

            button.setBackground(selected);

        } else {

            button.setTextColor(green);

            GradientDrawable normal = new GradientDrawable();
            normal.setColor(Color.WHITE);
            normal.setCornerRadius(40);
            normal.setStroke(2, green);

            button.setBackground(normal);
        }

        button.setPadding(0, 0, 0, 0);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(65, 44);

        params.setMargins(0, 0, 8, 0);

        button.setLayoutParams(params);

        return button;
    }

    // =========================
    // ШАПКА
    // =========================

    void createHeader() {

        LinearLayout header = new LinearLayout(this);

        header.setOrientation(LinearLayout.VERTICAL);
        header.setGravity(Gravity.CENTER);
        header.setPadding(15, 25, 15, 27);

        GradientDrawable headerBackground =
                new GradientDrawable(
                        GradientDrawable.Orientation.TOP_BOTTOM,
                        new int[]{green, darkGreen}
                );

        headerBackground.setCornerRadius(28);

        header.setBackground(headerBackground);

        LinearLayout.LayoutParams headerParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );

        headerParams.setMargins(0, 5, 0, 22);

        header.setLayoutParams(headerParams);

        TextView logo = new TextView(this);

        logo.setText("WORKER PRO");
        logo.setTextSize(31);
        logo.setTypeface(null, Typeface.BOLD);
        logo.setTextColor(Color.WHITE);
        logo.setGravity(Gravity.CENTER);

        header.addView(logo);

        TextView subtitle = new TextView(this);

        subtitle.setText(getSubtitle());
        subtitle.setTextSize(15);
        subtitle.setTextColor(Color.WHITE);
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(0, 8, 0, 0);

        header.addView(subtitle);

        root.addView(header);
    }

    // =========================
    // РАЗДЕЛЫ
    // =========================

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
        card.setPadding(15, 10, 15, 10);

        GradientDrawable cardBackground = new GradientDrawable();

        cardBackground.setColor(Color.WHITE);
        cardBackground.setCornerRadius(22);
        cardBackground.setStroke(
                2,
                Color.rgb(220, 230, 224)
        );

        card.setBackground(cardBackground);

        LinearLayout.LayoutParams cardParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        82
                );

        // ХОРОШЕЕ РАССТОЯНИЕ МЕЖДУ РАЗДЕЛАМИ
        cardParams.setMargins(0, 10, 0, 10);

        card.setLayoutParams(cardParams);

        // ИКОНКА

        TextView icon = new TextView(this);

        icon.setText(getIcon(number));
        icon.setTextSize(28);
        icon.setGravity(Gravity.CENTER);

        GradientDrawable iconBackground = new GradientDrawable();

        iconBackground.setColor(
                Color.rgb(232, 246, 238)
        );

        iconBackground.setCornerRadius(18);

        icon.setBackground(iconBackground);

        LinearLayout.LayoutParams iconParams =
                new LinearLayout.LayoutParams(60, 60);

        icon.setLayoutParams(iconParams);

        card.addView(icon);

        // НАЗВАНИЕ

        TextView name = new TextView(this);

        name.setText(getSectionName(number));
        name.setTextSize(17);
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

        // СТРЕЛКА

        TextView arrow = new TextView(this);

        arrow.setText("›");
        arrow.setTextSize(30);
        arrow.setTextColor(green);
        arrow.setGravity(Gravity.CENTER);

        card.addView(arrow);

        // НАЖАТИЕ

        card.setOnClickListener(v -> openSection(number));

        root.addView(card);
    }

    // =========================
    // ИКОНКИ
    // =========================

    String getIcon(int number) {

        switch (number) {

            case 1:
                return "🦺";

            case 2:
                return "⚙";

            case 3:
                return "🔨";

            case 4:
                return "🔥";

            case 5:
                return "🧯";

            case 6:
                return "📡";

            case 7:
                return "🔧";

            case 8:
                return "✓";

            case 9:
                return "📚";

            default:
                return "•";
        }
    }

    // =========================
    // НАЗВАНИЯ
    // =========================

    String getSectionName(int number) {

        if (language.equals("AZ")) {

            switch (number) {

                case 1:
                    return "İş təhlükəsizliyi";

                case 2:
                    return "İstehsalat";

                case 3:
                    return "Ştamplama";

                case 4:
                    return "Sobalar və qızdırma";

                case 5:
                    return "Yanğınsöndürənlər";

                case 6:
                    return "Sensorlar";

                case 7:
                    return "Qaynaq";

                case 8:
                    return "Keyfiyyətə nəzarət";

                case 9:
                    return "İşçilər üçün ingilis dili";
            }

        } else if (language.equals("EN")) {

            switch (number) {

                case 1:
                    return "Workplace Safety";

                case 2:
                    return "Manufacturing";

                case 3:
                    return "Stamping";

                case 4:
                    return "Furnaces & Heating";

                case 5:
                    return "Fire Extinguishers";

                case 6:
                    return "Sensors";

                case 7:
                    return "Welding";

                case 8:
                    return "Quality Control";

                case 9:
                    return "English for Workers";
            }

        } else {

            switch (number) {

                case 1:
                    return "Охрана труда";

                case 2:
                    return "Производство";

                case 3:
                    return "Штамповка";

                case 4:
                    return "Печи и нагрев";

                case 5:
                    return "Огнетушители";

                case 6:
                    return "Датчики";

                case 7:
                    return "Сварка";

                case 8:
                    return "Контроль качества";

                case 9:
                    return "Английский для рабочих";
            }
        }

        return "";
    }

    // =========================
    // ОТКРЫТИЕ РАЗДЕЛА
    // =========================

    void openSection(int number) {

        if (number == 1) {

            Intent intent =
                    new Intent(
                            MainActivity.this,
                            SafetyActivity.class
                    );

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

    // =========================
    // ПОДЗАГОЛОВОК
    // =========================

    String getSubtitle() {

        if (language.equals("AZ")) {

            return "İşçilər üçün təhlükəsizlik və istehsalat bələdçisi";

        } else if (language.equals("EN")) {

            return "Professional guide for workers and safety";

        } else {

            return "Профессиональный справочник для рабочих";
        }
    }

    // =========================
    // РАЗРАБОТЧИК
    // =========================

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
        developer.setPadding(0, 30, 0, 10);

        root.addView(developer);
    }
}