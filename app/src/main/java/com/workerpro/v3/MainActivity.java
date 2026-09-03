package com.workerpro.v3;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {

    LinearLayout content;
    String language = "RU";

    String[][] sections = {
            {"🦺  Охрана труда", "🦺  İş təhlükəsizliyi", "🦺  Workplace Safety"},
            {"🏭  Производство", "🏭  İstehsalat", "🏭  Manufacturing"},
            {"⚙️  Штамповка", "⚙️  Ştamplama", "⚙️  Stamping"},
            {"🔥  Печи и нагрев", "🔥  Sobalar və qızdırma", "🔥  Furnaces & Heating"},
            {"🧯  Огнетушители", "🧯  Yanğınsöndürənlər", "🧯  Fire Extinguishers"},
            {"📡  Датчики", "📡  Sensorlar", "📡  Sensors"},
            {"🔧  Сварка", "🔧  Qaynaq", "🔧  Welding"},
            {"✅  Контроль качества", "✅  Keyfiyyətə nəzarət", "✅  Quality Control"},
            {"🇬🇧  Английский для рабочих", "🇬🇧  İşçilər üçün ingilis dili", "🇬🇧  English for Workers"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildScreen();
    }

    void buildScreen() {

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(Color.rgb(245, 247, 246));

        // Верхняя панель
        LinearLayout top = new LinearLayout(this);
        top.setOrientation(LinearLayout.VERTICAL);
        top.setPadding(12, 12, 12, 12);

        LinearLayout languages = new LinearLayout(this);
        languages.setGravity(Gravity.CENTER);

        String[] langs = {"RU", "AZ", "EN"};

        for (String lang : langs) {

            Button button = new Button(this);
            button.setText(lang);
            button.setTextSize(12);

            LinearLayout.LayoutParams lp =
                    new LinearLayout.LayoutParams(70, 45);

            lp.setMargins(4, 0, 4, 0);

            languages.addView(button, lp);

            if (lang.equals(language)) {
                button.setTextColor(Color.WHITE);
                button.setBackgroundColor(Color.rgb(20, 160, 80));
            } else {
                button.setTextColor(Color.rgb(20, 160, 80));
                button.setBackgroundColor(Color.WHITE);
            }

            button.setOnClickListener(v -> {
                language = lang;
                buildScreen();
            });
        }

        top.addView(languages);

        // Заголовок
        TextView header = new TextView(this);
        header.setText("WORKER PRO");
        header.setTextColor(Color.WHITE);
        header.setTextSize(26);
        header.setGravity(Gravity.CENTER);
        header.setTypeface(null, 1);
        header.setPadding(10, 25, 10, 25);

        GradientDrawable headerBg = new GradientDrawable(
                GradientDrawable.Orientation.TL_BR,
                new int[]{
                        Color.rgb(10, 190, 90),
                        Color.rgb(0, 120, 60)
                }
        );

        headerBg.setCornerRadius(25);
        header.setBackground(headerBg);

        LinearLayout.LayoutParams headerLp =
                new LinearLayout.LayoutParams(-1, -2);

        headerLp.setMargins(8, 10, 8, 12);

        top.addView(header, headerLp);

        root.addView(top);

        // Список разделов
        ScrollView scrollView = new ScrollView(this);

        content = new LinearLayout(this);
        content.setOrientation(LinearLayout.VERTICAL);
        content.setPadding(16, 4, 16, 16);

        for (int i = 0; i < sections.length; i++) {

            final int index = i;

            LinearLayout card = new LinearLayout(this);
            card.setOrientation(LinearLayout.HORIZONTAL);
            card.setGravity(Gravity.CENTER_VERTICAL);
            card.setPadding(20, 18, 18, 18);

            GradientDrawable cardBg = new GradientDrawable();
            cardBg.setColor(Color.WHITE);
            cardBg.setCornerRadius(22);
            cardBg.setStroke(2, Color.rgb(220, 230, 224));

            card.setBackground(cardBg);
            card.setElevation(5);

            TextView title = new TextView(this);
            title.setText(getSectionTitle(index));
            title.setTextColor(Color.rgb(25, 35, 30));
            title.setTextSize(18);
            title.setTypeface(null, 1);

            LinearLayout.LayoutParams titleLp =
                    new LinearLayout.LayoutParams(0, -2, 1);

            card.addView(title, titleLp);

            TextView arrow = new TextView(this);
            arrow.setText("›");
            arrow.setTextColor(Color.rgb(20, 160, 80));
            arrow.setTextSize(32);
            arrow.setGravity(Gravity.CENTER);

            card.addView(arrow,
                    new LinearLayout.LayoutParams(45, 55));

            card.setOnClickListener(v -> openSection(index));

            LinearLayout.LayoutParams cardLp =
                    new LinearLayout.LayoutParams(-1, -2);

            cardLp.setMargins(0, 0, 0, 14);

            content.addView(card, cardLp);
        }

        scrollView.addView(content);

        root.addView(
                scrollView,
                new LinearLayout.LayoutParams(-1, 0, 1)
        );

        // Разработчик
        TextView developer = new TextView(this);
        developer.setText("F.S");
        developer.setTextColor(Color.GRAY);
        developer.setTextSize(12);
        developer.setGravity(Gravity.CENTER);
        developer.setPadding(0, 6, 0, 8);

        root.addView(developer);

        setContentView(root);
    }

    String getSectionTitle(int index) {

        if (language.equals("AZ")) {
            return sections[index][1];
        }

        if (language.equals("EN")) {
            return sections[index][2];
        }

        return sections[index][0];
    }

    void openSection(int index) {

        switch (index) {

            case 0:
                startActivity(new Intent(this, SafetyActivity.class));
                break;

            case 1:
                startActivity(new Intent(this, ProductionActivity.class));
                break;

            case 2:
                startActivity(new Intent(this, StampingActivity.class));
                break;

            case 3:
                startActivity(new Intent(this, FurnaceActivity.class));
                break;

            case 4:
                startActivity(new Intent(this, FireExtinguisherActivity.class));
                break;

            case 5:
                startActivity(new Intent(this, SensorsActivity.class));
                break;

            case 6:
                startActivity(new Intent(this, WeldingActivity.class));
                break;

            case 7:
                showMessage(getMessage7());
                break;

            case 8:
                showMessage(getMessage8());
                break;
        }
    }

    void showMessage(String message) {

        android.widget.Toast.makeText(
                this,
                message,
                android.widget.Toast.LENGTH_LONG
        ).show();
    }

    String getMessage7() {

        if (language.equals("AZ")) {
            return "Keyfiyyətə nəzarət bölməsi tezliklə əlavə olunacaq.";
        }

        if (language.equals("EN")) {
            return "Quality Control section will be added soon.";
        }

        return "Раздел «Контроль качества» будет добавлен следующим.";
    }

    String getMessage8() {

        if (language.equals("AZ")) {
            return "İşçilər üçün ingilis dili bölməsi tezliklə əlavə olunacaq.";
        }

        if (language.equals("EN")) {
            return "English for Workers section will be added soon.";
        }

        return "Раздел «Английский для рабочих» будет добавлен следующим.";
    }
}