package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class SafetyActivity extends Activity {

    String language = "RU";

    int green = Color.rgb(0, 145, 75);
    int darkGreen = Color.rgb(0, 95, 50);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String savedLanguage =
                getIntent().getStringExtra("language");

        if (savedLanguage != null) {
            language = savedLanguage;
        }

        showSafetyScreen();
    }

    void showSafetyScreen() {

        ScrollView scroll = new ScrollView(this);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(16, 18, 16, 25);
        root.setBackgroundColor(Color.rgb(246, 249, 247));

        // ЗЕЛЕНАЯ ШАПКА
        LinearLayout header = new LinearLayout(this);
        header.setOrientation(LinearLayout.VERTICAL);
        header.setGravity(Gravity.CENTER);
        header.setPadding(15, 22, 15, 22);

        GradientDrawable headerBg =
                new GradientDrawable(
                        GradientDrawable.Orientation.TOP_BOTTOM,
                        new int[]{green, darkGreen}
                );

        headerBg.setCornerRadius(25);
        header.setBackground(headerBg);

        TextView title = new TextView(this);
        title.setText(getSafetyTitle());
        title.setTextSize(25);
        title.setTypeface(null, Typeface.BOLD);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);

        header.addView(title);

        root.addView(header);

        addSpace(root, 15);

        // ВВОДНЫЙ ТЕКСТ
        addText(
                root,
                getIntro(),
                17,
                Color.rgb(45, 55, 50),
                false
        );

        addSpace(root, 12);

        // РАЗДЕЛ 1
        addBox(
                root,
                getSectionTitle(1),
                getSectionText(1)
        );

        // РАЗДЕЛ 2
        addBox(
                root,
                getSectionTitle(2),
                getSectionText(2)
        );

        // РАЗДЕЛ 3
        addBox(
                root,
                getSectionTitle(3),
                getSectionText(3)
        );

        // РАЗДЕЛ 4
        addBox(
                root,
                getSectionTitle(4),
                getSectionText(4)
        );

        // РАЗДЕЛ 5
        addBox(
                root,
                getSectionTitle(5),
                getSectionText(5)
        );

        addSpace(root, 15);

        TextView bottom = new TextView(this);

        if (language.equals("AZ")) {
            bottom.setText(
                    "Təhlükəsizlik qaydalarına həmişə əməl edin."
            );
        } else if (language.equals("EN")) {
            bottom.setText(
                    "Always follow workplace safety rules."
            );
        } else {
            bottom.setText(
                    "Всегда соблюдайте правила безопасности."
            );
        }

        bottom.setTextSize(14);
        bottom.setTextColor(Color.GRAY);
        bottom.setGravity(Gravity.CENTER);
        bottom.setPadding(5, 15, 5, 10);

        root.addView(bottom);

        scroll.addView(root);

        setContentView(scroll);
    }

    void addBox(
            LinearLayout root,
            String title,
            String text
    ) {

        LinearLayout box = new LinearLayout(this);
        box.setOrientation(LinearLayout.VERTICAL);
        box.setPadding(18, 16, 18, 16);

        GradientDrawable bg = new GradientDrawable();
        bg.setColor(Color.WHITE);
        bg.setCornerRadius(20);
        bg.setStroke(2, Color.rgb(220, 230, 224));

        box.setBackground(bg);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );

        params.setMargins(0, 7, 0, 7);

        box.setLayoutParams(params);

        TextView titleView = new TextView(this);
        titleView.setText(title);
        titleView.setTextSize(18);
        titleView.setTypeface(null, Typeface.BOLD);
        titleView.setTextColor(green);

        box.addView(titleView);

        TextView textView = new TextView(this);
        textView.setText(text);
        textView.setTextSize(15);
        textView.setTextColor(Color.rgb(50, 55, 52));
        textView.setPadding(0, 9, 0, 0);

        box.addView(textView);

        root.addView(box);
    }

    void addText(
            LinearLayout root,
            String text,
            int size,
            int color,
            boolean bold
    ) {

        TextView view = new TextView(this);

        view.setText(text);
        view.setTextSize(size);
        view.setTextColor(color);

        if (bold) {
            view.setTypeface(null, Typeface.BOLD);
        }

        view.setPadding(5, 5, 5, 5);

        root.addView(view);
    }

    void addSpace(LinearLayout root, int height) {

        TextView space = new TextView(this);

        space.setHeight(height);

        root.addView(space);
    }

    String getSafetyTitle() {

        if (language.equals("AZ")) {
            return "İş təhlükəsizliyi";
        }

        if (language.equals("EN")) {
            return "Workplace Safety";
        }

        return "Охрана труда";
    }

    String getIntro() {

        if (language.equals("AZ")) {
            return "İş yerində təhlükəsizlik hər bir işçi üçün əsas qaydadır. " +
                    "İşə başlamazdan əvvəl avadanlığı yoxlayın, " +
                    "fərdi qoruyucu vasitələrdən istifadə edin və təhlükəli " +
                    "vəziyyətlər barədə rəhbərliyə məlumat verin.";
        }

        if (language.equals("EN")) {
            return "Workplace safety is a basic rule for every worker. " +
                    "Before starting work, check the equipment, use personal " +
                    "protective equipment and report dangerous situations.";
        }

        return "İş yerində təhlükəsizlik hər bir işçi üçün əsas qaydadır.";
    }

    String getSectionTitle(int n) {

        if (language.equals("AZ")) {

            switch (n) {
                case 1: return "Fərdi qoruyucu vasitələr";
                case 2: return "Avadanlığın yoxlanılması";
                case 3: return "İşə başlamazdan əvvəl";
                case 4: return "Təhlükəli vəziyyət";
                case 5: return "Əsas qayda";
            }

        } else if (language.equals("EN")) {

            switch (n) {
                case 1: return "Personal Protective Equipment";
                case 2: return "Equipment Inspection";
                case 3: return "Before Starting Work";
                case 4: return "Dangerous Situation";
                case 5: return "Main Safety Rule";
            }

        } else {

            switch (n) {
                case 1: return "Средства защиты";
                case 2: return "Проверка оборудования";
                case 3: return "Перед началом работы";
                case 4: return "Опасная ситуация";
                case 5: return "Главное правило";
            }
        }

        return "";
    }

    String getSectionText(int n) {

        if (language.equals("AZ")) {

            switch (n) {
                case 1:
                    return "Dəbilqə, qoruyucu eynək, əlcək, xüsusi geyim və təhlükəsizlik ayaqqabısından istifadə edin.";

                case 2:
                    return "İşə başlamazdan əvvəl maşını, alətləri, qoruyucu qurğuları və elektrik kabellərini yoxlayın.";

                case 3:
                    return "İş yerini təmiz saxlayın və avadanlığın normal işlədiyinə əmin olun.";

                case 4:
                    return "Təhlükəli vəziyyət yaranarsa işi dayandırın və dərhal rəhbərliyə məlumat verin.";

                case 5:
                    return "Heç bir iş təhlükəsizlik qaydasını pozmağa dəyməz.";
            }

        } else if (language.equals("EN")) {

            switch (n) {
                case 1:
                    return "Use a helmet, safety glasses, gloves, protective clothing and safety shoes.";

                case 2:
                    return "Before work, inspect the machine, tools, guards and electrical cables.";

                case 3:
                    return "Keep the workplace clean and make sure the equipment works correctly.";

                case 4:
                    return "If a dangerous situation occurs, stop work and inform your supervisor.";

                case 5:
                    return "No job is worth breaking a safety rule.";
            }

        } else {

            switch (n) {
                case 1:
                    return "Используйте каску, защитные очки, перчатки, спецодежду и защитную обувь.";

                case 2:
                    return "Перед работой проверьте станок, инструменты, защитные устройства и электрические кабели.";

                case 3:
                    return "Держите рабочее место в чистоте и убедитесь, что оборудование работает нормально.";

                case 4:
                    return "При возникновении опасной ситуации остановите работу и сообщите руководителю.";

                case 5:
                    return "Ни одна работа не стоит нарушения правил безопасности.";
            }
        }

        return "";
    }
}