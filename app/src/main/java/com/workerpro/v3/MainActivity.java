package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
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
    root.setPadding(20, 20, 20, 20);

    // HEADER
    LinearLayout header = new LinearLayout(this);
    header.setOrientation(LinearLayout.VERTICAL);
    header.setGravity(Gravity.CENTER);
    header.setPadding(0, 10, 0, 15);

    TextView title = new TextView(this);
    title.setText("WORKER PRO");
    title.setTextSize(30);
    title.setTypeface(null, Typeface.BOLD);
    title.setTextColor(Color.rgb(0, 130, 70));
    title.setGravity(Gravity.CENTER);

    TextView subtitle = new TextView(this);
    subtitle.setText(getSubtitle());
    subtitle.setTextSize(16);
    subtitle.setTextColor(Color.DKGRAY);
    subtitle.setGravity(Gravity.CENTER);

    header.addView(title);
    header.addView(subtitle);

    root.addView(header);

    // LANGUAGE BUTTONS
    LinearLayout languages = new LinearLayout(this);
    languages.setOrientation(LinearLayout.HORIZONTAL);
    languages.setGravity(Gravity.RIGHT | Gravity.CENTER_VERTICAL);

    Button ru = createLanguageButton("RU");
    Button az = createLanguageButton("AZ");
    Button en = createLanguageButton("EN");

    languages.addView(ru);
    languages.addView(az);
    languages.addView(en);

    root.addView(languages);

    // MENU
    LinearLayout menu = new LinearLayout(this);
    menu.setOrientation(LinearLayout.VERTICAL);
    menu.setPadding(0, 20, 0, 0);

    String[] ruTitles = {
            "🦺 Безопасность",
            "🏭 Производство",
            "🔨 Штамповка",
            "🔥 Печи и нагрев",
            "🧯 Огнетушители",
            "📡 Датчики",
            "⚡ Сварка",
            "✅ Контроль качества",
            "🇬🇧 English for Workers"
    };

    String[] azTitles = {
            "🦺 Təhlükəsizlik",
            "🏭 İstehsalat",
            "🔨 Ştamplama",
            "🔥 Sobalar və qızdırma",
            "🧯 Yanğınsöndürənlər",
            "📡 Sensorlar",
            "⚡ Qaynaq",
            "✅ Keyfiyyətə nəzarət",
            "🇬🇧 İşçilər üçün İngilis dili"
    };

    String[] enTitles = {
            "🦺 Safety",
            "🏭 Production",
            "🔨 Stamping",
            "🔥 Furnaces & Heating",
            "🧯 Fire Extinguishers",
            "📡 Sensors",
            "⚡ Welding",
            "✅ Quality Control",
            "🇬🇧 English for Workers"
    };

    for (int i = 0; i < 9; i++) {

        final int section = i + 1;

        Button button = new Button(this);

        if (language.equals("AZ")) {
            button.setText(azTitles[i]);
        } else if (language.equals("EN")) {
            button.setText(enTitles[i]);
        } else {
            button.setText(ruTitles[i]);
        }

        button.setTextSize(18);
        button.setTextColor(Color.rgb(0, 100, 55));
        button.setAllCaps(false);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        90
                );

        params.setMargins(0, 0, 0, 20);

        menu.addView(button, params);

        button.setOnClickListener(v -> openSection(section));
    }

    root.addView(menu,
            new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    0,
                    1
            ));

    // DEVELOPER
    TextView developer = new TextView(this);
    developer.setText("F.S");
    developer.setTextSize(16);
    developer.setTextColor(Color.GRAY);
    developer.setGravity(Gravity.CENTER);
    developer.setPadding(0, 10, 0, 10);

    root.addView(developer);

    // SPACE FOR FUTURE ADVERTISEMENT
    View adSpace = new View(this);

    root.addView(adSpace,
            new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    100
            ));

    setContentView(root);
}

private Button createLanguageButton(String text) {

    Button button = new Button(this);

    button.setText(text);
    button.setTextSize(17);
    button.setAllCaps(false);
    button.setTextColor(Color.rgb(0, 100, 55));

    LinearLayout.LayoutParams params =
            new LinearLayout.LayoutParams(90, 58);

    params.setMargins(8, 0, 0, 0);

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