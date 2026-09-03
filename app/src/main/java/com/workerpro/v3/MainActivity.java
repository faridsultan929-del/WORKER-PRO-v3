package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    String language = "RU";

    int green = Color.rgb(0, 145, 75);
    int darkGreen = Color.rgb(0, 95, 50);

    LinearLayout root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        showMain();
    }

    void showMain() {

        ScrollView scroll = new ScrollView(this);

        root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(16, 16, 16, 30);
        root.setBackgroundColor(Color.rgb(246, 249, 247));

        LinearLayout languages = new LinearLayout(this);
        languages.setOrientation(LinearLayout.HORIZONTAL);
        languages.setGravity(Gravity.CENTER_VERTICAL);

        TextView ru = createLanguageButton("RU");
        TextView az = createLanguageButton("AZ");
        TextView en = createLanguageButton("EN");

        languages.addView(ru);
        languages.addView(az);
        languages.addView(en);

        root.addView(languages);

        LinearLayout header = new LinearLayout(this);
        header.setOrientation(LinearLayout.VERTICAL);
        header.setGravity(Gravity.CENTER);
        header.setPadding(15, 25, 15, 25);

        GradientDrawable headerBg =
                new GradientDrawable(
                        GradientDrawable.Orientation.TOP_BOTTOM,
                        new int[]{green, darkGreen}
                );

        headerBg.setCornerRadius(25);
        header.setBackground(headerBg);

        TextView title = new TextView(this);
        title.setText("WORKER PRO");
        title.setTextSize(28);
        title.setTypeface(null, Typeface.BOLD);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);

        header.addView(title);
        root.addView(header);

        addSpace(8);

        addCard(1);
        addCard(2);
        addCard(3);
        addCard(4);
        addCard(5);
        addCard(6);
        addCard(7);
        addCard(8);
        addCard(9);

        addSpace(15);

        TextView developer = new TextView(this);
        developer.setText("F.S");
        developer.setTextSize(14);
        developer.setTextColor(Color.GRAY);
        developer.setGravity(Gravity.CENTER);

        root.addView(developer);

        scroll.addView(root);
        setContentView(scroll);
    }

    TextView createLanguageButton(String text) {

        TextView button = new TextView(this);

        button.setText(text);
        button.setTextSize(14);
        button.setTypeface(null, Typeface.BOLD);
        button.setGravity(Gravity.CENTER);
        button.setPadding(18, 10, 18, 10);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );

        params.setMargins(0, 0, 8, 8);
        button.setLayoutParams(params);

        updateLanguageButton(button, text);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                language = text;
                showMain();
            }
        });

        return button;
    }

    void updateLanguageButton(TextView button, String text) {

        GradientDrawable bg = new GradientDrawable();

        bg.setCornerRadius(15);

        if (language.equals(text)) {
            bg.setColor(green);
            button.setTextColor(Color.WHITE);
        } else {
            bg.setColor(Color.WHITE);
            bg.setStroke(2, green);
            button.setTextColor(green);
        }

        button.setBackground(bg);
    }

    void addCard(final int number) {

        LinearLayout card = new LinearLayout(this);

        card.setOrientation(LinearLayout.HORIZONTAL);
        card.setGravity(Gravity.CENTER_VERTICAL);
        card.setPadding(18, 18, 15, 18);

        GradientDrawable bg = new GradientDrawable();
        bg.setColor(Color.WHITE);
        bg.setCornerRadius(20);
        bg.setStroke(2, Color.rgb(220, 230, 224));

        card.setBackground(bg);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );

        params.setMargins(0, 6, 0, 6);
        card.setLayoutParams(params);

        TextView icon = new TextView(this);
        icon.setText(getIcon(number));
        icon.setTextSize(27);
        icon.setGravity(Gravity.CENTER);

        card.addView(icon,
                new LinearLayout.LayoutParams(
                        55,
                        55
                ));

        TextView name = new TextView(this);
        name.setText(getSectionName(number));
        name.setTextSize(17);
        name.setTypeface(null, Typeface.BOLD);
        name.setTextColor(Color.rgb(35, 45, 40));
        name.setGravity(Gravity.CENTER_VERTICAL);

        LinearLayout.LayoutParams nameParams =
                new LinearLayout.LayoutParams(
                        0,
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        1
                );

        nameParams.setMargins(12, 0, 5, 0);

        card.addView(name, nameParams);

        TextView arrow = new TextView(this);
        arrow.setText("›");
        arrow.setTextSize(30);
        arrow.setTextColor(green);
        arrow.setGravity(Gravity.CENTER);

        card.addView(arrow,
                new LinearLayout.LayoutParams(
                        35,
                        55
                ));

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSection(number);
            }
        });

        root.addView(card);
    }

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
                return "⚡";

            case 8:
                return "✓";

            case 9:
                return "A";

            default:
                return "•";
        }
    }

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

    void openSection(int number) {

        if (number == 1) {

            Intent intent =
                    new Intent(this, SafetyActivity.class);

            intent.putExtra("language", language);

            startActivity(intent);
        }

        else if (number == 2) {

            Intent intent =
                    new Intent(this, ProductionActivity.class);

            intent.putExtra("language", language);

            startActivity(intent);
        }

        else if (number == 3) {

            Intent intent =
                    new Intent(this, StampingActivity.class);

            intent.putExtra("language", language);

            startActivity(intent);
        }

        else if (number == 4) {

            Intent intent =
                    new Intent(this, FurnaceActivity.class);

            intent.putExtra("language", language);

            startActivity(intent);
        }

        else if (number == 5) {

            Intent intent =
                    new Intent(this, FireExtinguisherActivity.class);

            intent.putExtra("language", language);

            startActivity(intent);
        }

        else if (number == 6) {

            Intent intent =
                    new Intent(this, SensorsActivity.class);

            intent.putExtra("language", language);

            startActivity(intent);
        }

        else {

            Toast.makeText(
                    this,
                    getToastText(number),
                    Toast.LENGTH_SHORT
            ).show();
        }
    }

    String getToastText(int number) {

        if (language.equals("AZ")) {

            switch (number) {

                case 7:
                    return "Qaynaq bölməsi hazırlanır";

                case 8:
                    return "Keyfiyyətə nəzarət bölməsi hazırlanır";

                case 9:
                    return "İngilis dili bölməsi hazırlanır";
            }
        }

        if (language.equals("EN")) {

            switch (number) {

                case 7:
                    return "Welding section is being prepared";

                case 8:
                    return "Quality Control section is being prepared";

                case 9:
                    return "English section is being prepared";
            }
        }

        switch (number) {

            case 7:
                return "Раздел «Сварка» готовится";

            case 8:
                return "Раздел «Контроль качества» готовится";

            case 9:
                return "Раздел «Английский» готовится";
        }

        return "";
    }

    void addSpace(int height) {

        TextView space = new TextView(this);

        space.setHeight(height);

        root.addView(space);
    }
}