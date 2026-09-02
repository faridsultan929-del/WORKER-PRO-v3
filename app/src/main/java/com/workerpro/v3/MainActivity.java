package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    LinearLayout main;
    TextView title;
    TextView subtitle;
    TextView developer;

    int green = Color.rgb(0, 130, 70);
    int dark = Color.rgb(25, 35, 30);

    String language = "ru";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createScreen();
        setLanguage("ru");
    }

    private void createScreen() {

        main = new LinearLayout(this);
        main.setOrientation(LinearLayout.VERTICAL);
        main.setPadding(20, 20, 20, 15);
        main.setBackgroundColor(dark);

        title = new TextView(this);
        title.setTextSize(30);
        title.setTextColor(Color.WHITE);
        title.setTypeface(null, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);
        title.setPadding(10, 25, 10, 25);

        main.addView(title);

        subtitle = new TextView(this);
        subtitle.setTextSize(17);
        subtitle.setTextColor(Color.LTGRAY);
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(10, 5, 10, 15);

        main.addView(subtitle);

        LinearLayout languages = new LinearLayout(this);
        languages.setOrientation(LinearLayout.HORIZONTAL);
        languages.setGravity(Gravity.CENTER);

        addLanguageButton(languages, "EN", "en");
        addLanguageButton(languages, "RU", "ru");
        addLanguageButton(languages, "AZ", "az");

        main.addView(languages);

        addSection("🦺", "SAFETY", "Безопасность", "Təhlükəsizlik");
        addSection("🧯", "FIRE EXTINGUISHERS", "Огнетушители", "Yanğınsöndürənlər");
        addSection("⚙", "STAMPING", "Штамповка", "Ştamplama");
        addSection("🔧", "CNC", "ЧПУ", "CNC");
        addSection("⚡", "SENSORS", "Датчики", "Sensorlar");
        addSection("🔥", "WELDING", "Сварка", "Qaynaq");
        addSection("✅", "QUALITY CONTROL", "Контроль качества", "Keyfiyyətə nəzarət");

        developer = new TextView(this);
        developer.setTextColor(Color.LTGRAY);
        developer.setTextSize(13);
        developer.setGravity(Gravity.CENTER);
        developer.setPadding(5, 15, 5, 5);

        LinearLayout.LayoutParams devParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        0,
                        1
                );

        main.addView(developer, devParams);

        setContentView(main);
    }

    private void addLanguageButton(
            LinearLayout parent,
            String text,
            String lang) {

        Button button = new Button(this);
        button.setText(text);
        button.setTextSize(14);
        button.setTextColor(Color.WHITE);
        button.setBackgroundColor(green);

        button.setOnClickListener(v -> setLanguage(lang));

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(0, 55, 1);

        params.setMargins(5, 5, 5, 10);

        parent.addView(button, params);
    }

    private void addSection(
            String icon,
            String english,
            String russian,
            String azerbaijani) {

        Button button = new Button(this);

        String text;

        if (language.equals("en")) {
            text = icon + "  " + english;
        } else if (language.equals("az")) {
            text = icon + "  " + azerbaijani;
        } else {
            text = icon + "  " + russian;
        }

        button.setText(text);
        button.setTextSize(17);
        button.setTextColor(Color.WHITE);
        button.setTypeface(null, Typeface.BOLD);
        button.setGravity(Gravity.CENTER);
        button.setBackgroundColor(green);

        button.setOnClickListener(v ->
                Toast.makeText(
                        this,
                        text,
                        Toast.LENGTH_SHORT
                ).show()
        );

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        58
                );

        params.setMargins(0, 5, 0, 5);

        main.addView(button, params);
    }

    private void setLanguage(String lang) {

        language = lang;

        if (lang.equals("en")) {

            title.setText("WORKER PRO");
            subtitle.setText("Manufacturing & Safety Training");
            developer.setText("Developed by\nFarid Sultanov");

        } else if (lang.equals("az")) {

            title.setText("WORKER PRO");
            subtitle.setText("İstehsalat və Əməyin Təhlükəsizliyi");
            developer.setText("Tərtibatçı\nSultanov Farid Rafiq oğlu");

        } else {

            title.setText("WORKER PRO");
            subtitle.setText("Производство и безопасность");
            developer.setText("Разработчик\nСултанов Фарид Рафиг оглы");
        }

        refreshSections();
    }

    private void refreshSections() {

        int count = main.getChildCount();

        if (count > 4) {

            while (main.getChildCount() > 4) {
                main.removeViewAt(4);
            }

            addSection("🦺", "SAFETY",
                    "Безопасность",
                    "Təhlükəsizlik");

            addSection("🧯", "FIRE EXTINGUISHERS",
                    "Огнетушители",
                    "Yanğınsöndürənlər");

            addSection("⚙", "STAMPING",
                    "Штамповка",
                    "Ştamplama");

            addSection("🔧", "CNC",
                    "ЧПУ",
                    "CNC");

            addSection("⚡", "SENSORS",
                    "Датчики",
                    "Sensorlar");

            addSection("🔥", "WELDING",
                    "Сварка",
                    "Qaynaq");

            addSection("✅", "QUALITY CONTROL",
                    "Контроль качества",
                    "Keyfiyyətə nəzarət");

            main.addView(developer);
        }
    }
}