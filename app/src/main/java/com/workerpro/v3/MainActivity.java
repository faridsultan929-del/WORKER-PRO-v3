package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {

    LinearLayout main;
    String language = "ru";

    int green = Color.rgb(0, 150, 80);
    int dark = Color.rgb(20, 28, 24);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showHome();
    }

    private TextView text(String value, float size, int color) {
        TextView t = new TextView(this);
        t.setText(value);
        t.setTextSize(size);
        t.setTextColor(color);
        t.setGravity(Gravity.CENTER);
        t.setPadding(15, 15, 15, 15);
        return t;
    }

    private Button button(String value) {
        Button b = new Button(this);
        b.setText(value);
        b.setTextSize(17);
        b.setTextColor(Color.WHITE);
        b.setTypeface(null, Typeface.BOLD);
        b.setBackgroundColor(green);
        return b;
    }

    private void showHome() {

        main = new LinearLayout(this);
        main.setOrientation(LinearLayout.VERTICAL);
        main.setPadding(18, 18, 18, 10);
        main.setBackgroundColor(dark);

        TextView title = text("WORKER PRO", 30, Color.WHITE);
        title.setTypeface(null, Typeface.BOLD);
        title.setBackgroundColor(green);
        main.addView(title);

        TextView subtitle = text(
                "Производство и безопасность",
                17,
                Color.LTGRAY
        );
        main.addView(subtitle);

        LinearLayout languages = new LinearLayout(this);
        languages.setGravity(Gravity.CENTER);

        Button en = button("🇬🇧 EN");
        Button ru = button("🇷🇺 RU");
        Button az = button("🇦🇿 AZ");

        languages.addView(en, new LinearLayout.LayoutParams(0, 60, 1));
        languages.addView(ru, new LinearLayout.LayoutParams(0, 60, 1));
        languages.addView(az, new LinearLayout.LayoutParams(0, 60, 1));

        main.addView(languages);

        en.setOnClickListener(v -> {
            language = "en";
            showHome();
        });

        ru.setOnClickListener(v -> {
            language = "ru";
            showHome();
        });

        az.setOnClickListener(v -> {
            language = "az";
            showHome();
        });

        addSection("🦺", "SAFETY", "Безопасность", "Təhlükəsizlik",
                v -> showSafety());

        addSection("🧯", "FIRE EXTINGUISHERS", "Огнетушители",
                "Yanğınsöndürənlər", v -> showMessage("Fire Extinguishers"));

        addSection("⚙", "STAMPING", "Штамповка",
                "Ştamplama", v -> showMessage("Stamping"));

        addSection("🔧", "CNC", "ЧПУ",
                "CNC", v -> showMessage("CNC"));

        addSection("⚡", "SENSORS", "Датчики",
                "Sensorlar", v -> showMessage("Sensors"));

        addSection("🔥", "WELDING", "Сварка",
                "Qaynaq", v -> showMessage("Welding"));

        addSection("✅", "QUALITY CONTROL", "Контроль качества",
                "Keyfiyyətə nəzarət", v -> showMessage("Quality Control"));

        TextView developer = text(
                language.equals("en")
                        ? "Developed by\nFarid Sultanov"
                        : language.equals("az")
                        ? "Tərtibatçı\nSultanov Farid Rafiq oğlu"
                        : "Разработчик\nСултанов Фарид Рафиг оглы",
                13,
                Color.LTGRAY
        );

        LinearLayout.LayoutParams dp =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        0,
                        1
                );

        main.addView(developer, dp);

        setContentView(main);
    }

    private void addSection(
            String icon,
            String en,
            String ru,
            String az,
            View.OnClickListener listener) {

        String title;

        if (language.equals("en")) {
            title = icon + "  " + en;
        } else if (language.equals("az")) {
            title = icon + "  " + az;
        } else {
            title = icon + "  " + ru;
        }

        Button b = button(title);
        b.setOnClickListener(listener);

        LinearLayout.LayoutParams p =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        62
                );

        p.setMargins(0, 5, 0, 5);

        main.addView(b, p);
    }

    private void showSafety() {

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(20, 20, 20, 20);
        layout.setBackgroundColor(dark);

        String title;
        String content;
        String back;

        if (language.equals("en")) {

            title = "🦺 SAFETY";
            content =
                    "WORKPLACE SAFETY\n\n" +
                    "1. Wear the required PPE.\n\n" +
                    "2. Check the machine before starting work.\n\n" +
                    "3. Keep hands away from moving parts.\n\n" +
                    "4. Do not operate damaged equipment.\n\n" +
                    "5. Know where the emergency stop button is.\n\n" +
                    "6. Keep the workplace clean and safe.";

            back = "← BACK";

        } else if (language.equals("az")) {

            title = "🦺 TƏHLÜKƏSİZLİK";
            content =
                    "İŞ YERİNDƏ TƏHLÜKƏSİZLİK\n\n" +
                    "1. Lazımi fərdi qoruyucu vasitələrdən istifadə edin.\n\n" +
                    "2. İşə başlamazdan əvvəl avadanlığı yoxlayın.\n\n" +
                    "3. Əlləri hərəkət edən hissələrdən uzaq saxlayın.\n\n" +
                    "4. Nasaz avadanlıqla işləməyin.\n\n" +
                    "5. Təcili dayandırma düyməsinin yerini bilin.\n\n" +
                    "6. İş yerini təmiz və təhlükəsiz saxlayın.";

            back = "← GERİ";

        } else {

            title = "🦺 БЕЗОПАСНОСТЬ";
            content =
                    "БЕЗОПАСНОСТЬ НА РАБОЧЕМ МЕСТЕ\n\n" +
                    "1. Используйте необходимые СИЗ.\n\n" +
                    "2. Перед началом работы проверьте оборудование.\n\n" +
                    "3. Держите руки подальше от движущихся частей.\n\n" +
                    "4. Не работайте на неисправном оборудовании.\n\n" +
                    "5. Знайте расположение кнопки аварийной остановки.\n\n" +
                    "6. Содержите рабочее место в чистоте и безопасности.";

            back = "← НАЗАД";
        }

        TextView header = text(title, 26, Color.WHITE);
        header.setTypeface(null, Typeface.BOLD);
        header.setBackgroundColor(green);

        layout.addView(header);

        ScrollView scroll = new ScrollView(this);

        TextView information = text(
                content,
                18,
                Color.WHITE
        );

        information.setGravity(Gravity.LEFT);
        scroll.addView(information);

        layout.addView(
                scroll,
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        0,
                        1
                )
        );

        Button backButton = button(back);

        backButton.setOnClickListener(v -> showHome());

        layout.addView(backButton);

        setContentView(layout);
    }

    private void showMessage(String section) {

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(20, 20, 20, 20);
        layout.setBackgroundColor(dark);

        TextView title = text(section, 26, Color.WHITE);
        title.setTypeface(null, Typeface.BOLD);

        layout.addView(title);

        TextView info = text(
                language.equals("ru")
                        ? "Раздел готовится. Здесь будет учебный материал."
                        : language.equals("az")
                        ? "Bu bölmə hazırlanır. Burada təlim materialları olacaq."
                        : "This section is being prepared. Training material will be added here.",
                18,
                Color.LTGRAY
        );

        layout.addView(info);

        Button back = button(
                language.equals("ru")
                        ? "← НАЗАД"
                        : language.equals("az")
                        ? "← GERİ"
                        : "← BACK"
        );

        back.setOnClickListener(v -> showHome());

        layout.addView(back);

        setContentView(layout);
    }
}