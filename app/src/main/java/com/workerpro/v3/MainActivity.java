package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    LinearLayout main;
    String language = "RU";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showMainScreen();
    }

    void showMainScreen() {

        main = new LinearLayout(this);
        main.setOrientation(LinearLayout.VERTICAL);
        main.setPadding(20, 20, 20, 20);
        main.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("WORKER PRO");
        title.setTextSize(30);
        title.setTypeface(null, Typeface.BOLD);
        title.setTextColor(Color.rgb(0, 120, 60));
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 10, 0, 20);
        main.addView(title);

        TextView languageTitle = new TextView(this);
        languageTitle.setText(getLanguageTitle());
        languageTitle.setTextSize(16);
        languageTitle.setGravity(Gravity.CENTER);
        languageTitle.setTextColor(Color.DKGRAY);
        main.addView(languageTitle);

        Button ru = new Button(this);
        ru.setText("Русский");
        ru.setOnClickListener(v -> {
            language = "RU";
            showMainScreen();
        });
        main.addView(ru);

        Button az = new Button(this);
        az.setText("Azərbaycan");
        az.setOnClickListener(v -> {
            language = "AZ";
            showMainScreen();
        });
        main.addView(az);

        Button en = new Button(this);
        en.setText("English");
        en.setOnClickListener(v -> {
            language = "EN";
            showMainScreen();
        });
        main.addView(en);

        addButton(1);
        addButton(2);
        addButton(3);
        addButton(4);
        addButton(5);
        addButton(6);
        addButton(7);
        addButton(8);
        addButton(9);

        TextView developer = new TextView(this);
        developer.setText(getDeveloper());
        developer.setTextSize(14);
        developer.setGravity(Gravity.CENTER);
        developer.setTextColor(Color.GRAY);
        developer.setPadding(0, 25, 0, 10);
        main.addView(developer);

        setContentView(main);
    }

    void addButton(int number) {

        Button button = new Button(this);
        button.setText(getButtonText(number));

        button.setOnClickListener(v -> {

            if (number == 1) {

                startActivity(
                        new Intent(MainActivity.this, SafetyActivity.class)
                );

            } else {

                Toast.makeText(
                        this,
                        getButtonText(number),
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        main.addView(button);
    }

    String getLanguageTitle() {

        if (language.equals("AZ")) {
            return "Dil seçin";
        }

        if (language.equals("EN")) {
            return "Select language";
        }

        return "Выберите язык";
    }

    String getDeveloper() {

        if (language.equals("AZ")) {
            return "Tərtibatçı: Sultanov Farid Rafiq oğlu";
        }

        if (language.equals("EN")) {
            return "Developer: Sultanov Farid Rafiq oglu";
        }

        return "Разработчик: Султанов Фарид Рафиг оглы";
    }

    String getButtonText(int n) {

        if (language.equals("AZ")) {

            switch (n) {

                case 1:
                    return "İŞ TƏHLÜKƏSİZLİYİ";

                case 2:
                    return "İSTEHSALAT";

                case 3:
                    return "ŞTAMPLAMA";

                case 4:
                    return "SOBALAR";

                case 5:
                    return "YANĞINSÖNDÜRƏNLƏR";

                case 6:
                    return "SENSORLAR";

                case 7:
                    return "QAYNAQ";

                case 8:
                    return "KEYFİYYƏTƏ NƏZARƏT";

                case 9:
                    return "İŞÇİLƏR ÜÇÜN İNGİLİS DİLİ";

                default:
                    return "";
            }
        }

        if (language.equals("EN")) {

            switch (n) {

                case 1:
                    return "WORKPLACE SAFETY";

                case 2:
                    return "MANUFACTURING";

                case 3:
                    return "STAMPING";

                case 4:
                    return "FURNACES";

                case 5:
                    return "FIRE EXTINGUISHERS";

                case 6:
                    return "SENSORS";

                case 7:
                    return "WELDING";

                case 8:
                    return "QUALITY CONTROL";

                case 9:
                    return "ENGLISH FOR WORKERS";

                default:
                    return "";
            }
        }

        switch (n) {

            case 1:
                return "ОХРАНА ТРУДА";

            case 2:
                return "ПРОИЗВОДСТВО";

            case 3:
                return "ШТАМПОВКА";

            case 4:
                return "ПЕЧИ";

            case 5:
                return "ОГНЕТУШИТЕЛИ";

            case 6:
                return "ДАТЧИКИ";

            case 7:
                return "СВАРКА";

            case 8:
                return "КОНТРОЛЬ КАЧЕСТВА";

            case 9:
                return "АНГЛИЙСКИЙ ДЛЯ РАБОЧИХ";

            default:
                return "";
        }
    }
}