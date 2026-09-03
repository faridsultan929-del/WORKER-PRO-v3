package com.workerpro.v3;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

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
        createSections();
        createDeveloper();

        setContentView(scrollView);
    }

    private void createHeader() {

        LinearLayout header = new LinearLayout(this);
        header.setOrientation(LinearLayout.VERTICAL);
        header.setGravity(Gravity.CENTER);
        header.setPadding(10, 18, 10, 18);

        GradientDrawable bg = new GradientDrawable(
                GradientDrawable.Orientation.TOP_BOTTOM,
                new int[]{green, darkGreen}
        );
        bg.setCornerRadius(28);
        header.setBackground(bg);

        TextView title = new TextView(this);
        title.setText("WORKER PRO");
        title.setTextColor(Color.WHITE);
        title.setTextSize(28);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText(getSubtitle());
        subtitle.setTextColor(Color.WHITE);
        subtitle.setTextSize(14);
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(0, 5, 0, 0);

        header.addView(title);
        header.addView(subtitle);

        mainLayout.addView(header);

        LinearLayout.LayoutParams params =
                (LinearLayout.LayoutParams) header.getLayoutParams();

        if (params == null) {
            params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
        }

        params.setMargins(0, 0, 0, 8);
        header.setLayoutParams(params);
    }

    private void createLanguageButtons() {

        LinearLayout languageRow = new LinearLayout(this);
        languageRow.setOrientation(LinearLayout.HORIZONTAL);
        languageRow.setGravity(Gravity.RIGHT | Gravity.CENTER_VERTICAL);
        languageRow.setPadding(0, 2, 0, 8);

        String[] languages = {"RU", "AZ", "EN"};

        for (String lang : languages) {

            TextView button = new TextView(this);

            button.setText(lang);
            button.setTextSize(13);
            button.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            button.setGravity(Gravity.CENTER);
            button.setClickable(true);
            button.setFocusable(true);

            LinearLayout.LayoutParams params =
                    new LinearLayout.LayoutParams(58, 42);

            params.setMargins(5, 0, 0, 0);
            button.setLayoutParams(params);

            GradientDrawable buttonBg = new GradientDrawable();

            if (language.equals(lang)) {
                buttonBg.setColor(green);
                button.setTextColor(Color.WHITE);
            } else {
                buttonBg.setColor(Color.WHITE);
                button.setTextColor(green);
            }

            buttonBg.setCornerRadius(14);
            buttonBg.setStroke(2, green);

            button.setBackground(buttonBg);

            button.setOnClickListener(v -> {

                language = lang;
                showMainScreen();

            });

            languageRow.addView(button);
        }

        mainLayout.addView(languageRow);
    }

    private void createSections() {

        addCard(1, getTitle(1), "🦺");
        addCard(2, getTitle(2), "🏭");
        addCard(3, getTitle(3), "⚙️");
        addCard(4, getTitle(4), "🔥");
        addCard(5, getTitle(5), "🧯");
        addCard(6, getTitle(6), "📡");

        // Сварка — обычная искра
        addCard(7, getTitle(7), "⚡");

        addCard(8, getTitle(8), "✅");
        addCard(9, getTitle(9), "🇬🇧");
    }

    private void addCard(int number, String title, String icon) {

        LinearLayout card = new LinearLayout(this);
        card.setOrientation(LinearLayout.HORIZONTAL);
        card.setGravity(Gravity.CENTER_VERTICAL);
        card.setPadding(16, 14, 16, 14);

        GradientDrawable cardBg = new GradientDrawable();
        cardBg.setColor(Color.WHITE);
        cardBg.setCornerRadius(20);
        cardBg.setStroke(1, Color.rgb(220, 230, 224));

        card.setBackground(cardBg);

        TextView iconView = new TextView(this);
        iconView.setText(icon);
        iconView.setTextSize(27);
        iconView.setGravity(Gravity.CENTER);

        LinearLayout.LayoutParams iconParams =
                new LinearLayout.LayoutParams(55, 55);

        iconView.setLayoutParams(iconParams);

        TextView titleView = new TextView(this);
        titleView.setText(title);
        titleView.setTextColor(Color.rgb(30, 30, 30));
        titleView.setTextSize(17);
        titleView.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        titleView.setGravity(Gravity.CENTER_VERTICAL);

        LinearLayout.LayoutParams titleParams =
                new LinearLayout.LayoutParams(
                        0,
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        1
                );

        titleParams.setMargins(12, 0, 8, 0);
        titleView.setLayoutParams(titleParams);

        TextView arrow = new TextView(this);
        arrow.setText("›");
        arrow.setTextColor(green);
        arrow.setTextSize(32);
        arrow.setGravity(Gravity.CENTER);

        card.addView(iconView);
        card.addView(titleView);
        card.addView(arrow);

        card.setOnClickListener(v -> openSection(number));

        LinearLayout.LayoutParams cardParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );

        cardParams.setMargins(0, 5, 0, 5);
        card.setLayoutParams(cardParams);

        mainLayout.addView(card);
    }

    private void createDeveloper() {

        TextView developer = new TextView(this);

        developer.setText("F.S");
        developer.setTextColor(Color.GRAY);
        developer.setTextSize(13);
        developer.setGravity(Gravity.CENTER);
        developer.setPadding(0, 18, 0, 8);

        mainLayout.addView(developer);
    }

    private String getSubtitle() {

        if (language.equals("AZ")) {
            return "İşçilər üçün peşəkar tətbiq";
        }

        if (language.equals("EN")) {
            return "Professional application for workers";
        }

        return "Профессиональное приложение для рабочих";
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

        switch (number) {

            case 1:
                startActivity(new Intent(this, SafetyActivity.class));
                break;

            case 2:
                startActivity(new Intent(this, ProductionActivity.class));
                break;

            case 3:
                startActivity(new Intent(this, StampingActivity.class));
                break;

            case 4:
                startActivity(new Intent(this, FurnaceActivity.class));
                break;

            case 5:
                startActivity(new Intent(this, FireExtinguisherActivity.class));
                break;

            case 6:
                startActivity(new Intent(this, SensorsActivity.class));
                break;

            case 7:
                startActivity(new Intent(this, WeldingActivity.class));
                break;

            case 8:
                Toast.makeText(this, getMessage8(), Toast.LENGTH_SHORT).show();
                break;

            case 9:
                Toast.makeText(this, getMessage9(), Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private String getMessage8() {

        if (language.equals("AZ")) {
            return "Keyfiyyətə nəzarət bölməsi hazırlanır";
        }

        if (language.equals("EN")) {
            return "Quality Control section is being prepared";
        }

        return "Раздел «Контроль качества» готовится";
    }

    private String getMessage9() {

        if (language.equals("AZ")) {
            return "İşçilər üçün ingilis dili bölməsi hazırlanır";
        }

        if (language.equals("EN")) {
            return "English for Workers section is being prepared";
        }

        return "Раздел «Английский для рабочих» готовится";
    }
}