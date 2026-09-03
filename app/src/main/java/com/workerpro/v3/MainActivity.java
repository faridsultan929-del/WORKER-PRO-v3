package com.workerpro.v3;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {

    private LinearLayout mainLayout;
    private String language = "RU";

    private final int green = Color.rgb(0, 150, 80);
    private final int darkGreen = Color.rgb(0, 105, 60);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        showMainScreen();
    }

    private void showMainScreen() {

        ScrollView scrollView = new ScrollView(this);
        scrollView.setBackgroundColor(Color.rgb(245, 248, 246));

        mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        mainLayout.setPadding(16, 16, 16, 20);

        scrollView.addView(mainLayout);

        createHeader();
        createLanguageButtons();
        createCards();
        createDeveloper();

        setContentView(scrollView);
    }

    private void createHeader() {

        LinearLayout header = new LinearLayout(this);

        header.setOrientation(LinearLayout.VERTICAL);
        header.setGravity(Gravity.CENTER);
        header.setPadding(10, 18, 10, 18);

        GradientDrawable headerBg = new GradientDrawable(
                GradientDrawable.Orientation.TOP_BOTTOM,
                new int[]{green, darkGreen}
        );

        headerBg.setCornerRadius(28);
        header.setBackground(headerBg);

        TextView title = new TextView(this);

        title.setText("WORKER PRO");
        title.setTextColor(Color.WHITE);
        title.setTextSize(28);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);

        header.addView(title);

        TextView subtitle = new TextView(this);

        if (language.equals("AZ")) {
            subtitle.setText("İşçilər üçün peşəkar proqram");
        } else if (language.equals("EN")) {
            subtitle.setText("Professional app for workers");
        } else {
            subtitle.setText("Профессиональное приложение для рабочих");
        }

        subtitle.setTextColor(Color.WHITE);
        subtitle.setTextSize(15);
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(0, 5, 0, 0);

        header.addView(subtitle);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );

        params.setMargins(0, 0, 0, 10);

        mainLayout.addView(header, params);
    }

    private void createLanguageButtons() {

        LinearLayout languages = new LinearLayout(this);

        languages.setOrientation(LinearLayout.HORIZONTAL);
        languages.setGravity(Gravity.RIGHT);
        languages.setPadding(0, 0, 0, 12);

        TextView ru = createLanguageButton("RU");
        TextView az = createLanguageButton("AZ");
        TextView en = createLanguageButton("EN");

        languages.addView(ru);
        languages.addView(az);
        languages.addView(en);

        mainLayout.addView(languages);

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
    }

    private TextView createLanguageButton(String text) {

        TextView button = new TextView(this);

        button.setText(text);
        button.setTextSize(14);
        button.setTextColor(green);
        button.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        button.setGravity(Gravity.CENTER);

        GradientDrawable bg = new GradientDrawable();

        bg.setColor(Color.WHITE);
        bg.setCornerRadius(15);
        bg.setStroke(2, green);

        button.setBackground(bg);
        button.setPadding(12, 6, 12, 6);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        60,
                        42
                );

        params.setMargins(4, 0, 0, 0);

        button.setLayoutParams(params);

        return button;
    }

    private void createCards() {

        addCard(1, "🦺");
        addCard(2, "🏭");
        addCard(3, "⚙️");
        addCard(4, "🔥");
        addCard(5, "🧯");
        addCard(6, "📡");
        addCard(7, "⚡");
        addCard(8, "✅");
        addCard(9, "🇬🇧");
    }

    private void addCard(final int number, String icon) {

        TextView card = new TextView(this);

        card.setText(icon + "  " + getTitle(number));
        card.setTextSize(17);
        card.setTextColor(darkGreen);
        card.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        card.setGravity(Gravity.CENTER_VERTICAL);
        card.setPadding(20, 0, 20, 0);
        card.setClickable(true);

        GradientDrawable cardBg = new GradientDrawable();

        cardBg.setColor(Color.WHITE);
        cardBg.setCornerRadius(20);
        cardBg.setStroke(2, green);

        card.setBackground(cardBg);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        62
                );

        params.setMargins(0, 0, 0, 10);

        mainLayout.addView(card, params);

        card.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openSection(number);
            }
        });
    }

    private String getTitle(int number) {

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
        }

        if (language.equals("EN")) {

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
        }

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

        return "";
    }

    private void openSection(int number) {

        Intent intent;

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
                // Английский для рабочих добавим следующим этапом
                return;

            default:
                return;
        }

        intent.putExtra("LANGUAGE", language);

        startActivity(intent);
    }

    private void createDeveloper() {

        TextView developer = new TextView(this);

        developer.setText("F.S");
        developer.setTextSize(13);
        developer.setTextColor(Color.GRAY);
        developer.setGravity(Gravity.CENTER);
        developer.setPadding(0, 15, 0, 10);

        mainLayout.addView(developer);
    }
}