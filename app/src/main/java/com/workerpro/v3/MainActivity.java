package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {

private String language = "RU";

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    createMainScreen();
}

private void createMainScreen() {

    LinearLayout root = new LinearLayout(this);
    root.setOrientation(LinearLayout.VERTICAL);
    root.setBackgroundColor(Color.WHITE);
    root.setPadding(18, 12, 18, 8);

    // HEADER
    TextView title = new TextView(this);
    title.setText("WORKER PRO");
    title.setTextSize(30);
    title.setTypeface(null, Typeface.BOLD);
    title.setTextColor(Color.rgb(0, 130, 70));
    title.setGravity(Gravity.CENTER);
    title.setPadding(0, 5, 0, 2);

    root.addView(title);

    TextView subtitle = new TextView(this);
    subtitle.setText(getSubtitle());
    subtitle.setTextSize(16);
    subtitle.setTextColor(Color.DKGRAY);
    subtitle.setGravity(Gravity.CENTER);
    subtitle.setPadding(0, 0, 0, 8);

    root.addView(subtitle);

    // LANGUAGE BUTTONS
    LinearLayout languages = new LinearLayout(this);
    languages.setOrientation(LinearLayout.HORIZONTAL);
    languages.setGravity(Gravity.RIGHT);

    languages.addView(createLanguageButton("RU"));
    languages.addView(createLanguageButton("AZ"));
    languages.addView(createLanguageButton("EN"));

    root.addView(languages);

    // SCROLLABLE MENU
    ScrollView scrollView = new ScrollView(this);
    scrollView.setFillViewport(true);

    LinearLayout menu = new LinearLayout(this);
    menu.setOrientation(LinearLayout.VERTICAL);
    menu.setPadding(0, 12, 0, 12);

    String[] ru = {
            "🦺  Безопасность",
            "🏭  Производство",
            "🔨  Штамповка",
            "🔥  Печи и нагрев",
            "🧯  Огнетушители",
            "📡  Датчики",
            "⚡  Сварка",
            "✅  Контроль качества",
            "🇬🇧  English for Workers"
    };

    String[] az = {
            "🦺  Təhlükəsizlik",
            "🏭  İstehsalat",
            "🔨  Ştamplama",
            "🔥  Sobalar və qızdırma",
            "🧯  Yanğınsöndürənlər",
            "📡  Sensorlar",
            "⚡  Qaynaq",
            "✅  Keyfiyyətə nəzarət",
            "🇬🇧  İşçilər üçün İngilis dili"
    };

    String[] en = {
            "🦺  Safety",
            "🏭  Production",
            "🔨  Stamping",
            "🔥  Furnaces & Heating",
            "🧯  Fire Extinguishers",
            "📡  Sensors",
            "⚡  Welding",
            "✅  Quality Control",
            "🇬🇧  English for Workers"
    };

    for (int i = 0; i < 9; i++) {

        final int section = i + 1;

        String text;

        if (language.equals("AZ")) {
            text = az[i];
        } else if (language.equals("EN")) {
            text = en[i];
        } else {
            text = ru[i];
        }

        TextView card = createMenuCard(text);

        card.setOnClickListener(v -> openSection(section));

        menu.addView(card);
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

    // DEVELOPER
    TextView developer = new TextView(this);
    developer.setText("F.S");
    developer.setTextSize(16);
    developer.setTextColor(Color.GRAY);
    developer.setGravity(Gravity.CENTER);
    developer.setPadding(0, 5, 0, 5);

    root.addView(developer);

    setContentView(root);
}

private TextView createMenuCard(String text) {

    TextView card = new TextView(this);

    card.setText(text);
    card.setTextSize(18);
    card.setTextColor(Color.rgb(0, 105, 60));
    card.setTypeface(null, Typeface.BOLD);
    card.setGravity(Gravity.CENTER_VERTICAL);
    card.setPadding(22, 0, 22, 0);

    GradientDrawable background = new GradientDrawable();
    background.setColor(Color.rgb(242, 248, 244));
    background.setCornerRadius(18);
    background.setStroke(2, Color.rgb(0, 130, 70));

    card.setBackground(background);

    LinearLayout.LayoutParams params =
            new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    82
            );

    params.setMargins(0, 0, 0, 12);

    card.setLayoutParams(params);

    return card;
}

private TextView createLanguageButton(String text) {

    TextView button = new TextView(this);

    button.setText(text);
    button.setTextSize(17);
    button.setTypeface(null, Typeface.BOLD);
    button.setTextColor(Color.rgb(0, 105, 60));
    button.setGravity(Gravity.CENTER);

    GradientDrawable background = new GradientDrawable();
    background.setColor(Color.rgb(242, 248, 244));
    background.setCornerRadius(12);
    background.setStroke(1, Color.rgb(0, 130, 70));

    button.setBackground(background);

    LinearLayout.LayoutParams params =
            new LinearLayout.LayoutParams(78, 52);

    params.setMargins(6, 0, 0, 0);

    button.setLayoutParams(params);

    button.setOnClickListener(v -> {
        language = text;
        createMainScreen();
    });

    return button;
}

private String getSubtitle() {

    if (language.equals("AZ")) {
        return "İşçilər üçün peşəkar tətbiq";
    }

    if (language.equals("EN")) {
        return "Professional app for workers";
    }

    return "Профессиональное приложение для рабочих";
}

private void openSection(int section) {

    Intent intent;

    switch (section) {

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

        default:
            return;
    }

    intent.putExtra("LANGUAGE", language);
    startActivity(intent);
}

}