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

public class ProductionActivity extends Activity {

    String language = "RU";

    int green = Color.rgb(0, 145, 75);
    int darkGreen = Color.rgb(0, 95, 50);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String selectedLanguage =
                getIntent().getStringExtra("language");

        if (selectedLanguage != null) {
            language = selectedLanguage;
        }

        showProduction();
    }

    void showProduction() {

        ScrollView scroll = new ScrollView(this);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(16, 16, 16, 30);
        root.setBackgroundColor(Color.rgb(246, 249, 247));

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
        title.setText(getTitleText());
        title.setTextSize(25);
        title.setTypeface(null, Typeface.BOLD);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);

        header.addView(title);
        root.addView(header);

        addSpace(root, 18);

        addBox(root, 1);
        addBox(root, 2);
        addBox(root, 3);
        addBox(root, 4);
        addBox(root, 5);
        addBox(root, 6);
        addBox(root, 7);
        addBox(root, 8);

        scroll.addView(root);

        setContentView(scroll);
    }

    void addBox(LinearLayout root, int number) {

        LinearLayout box = new LinearLayout(this);
        box.setOrientation(LinearLayout.VERTICAL);
        box.setPadding(18, 17, 18, 17);

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

        params.setMargins(0, 10, 0, 10);
        box.setLayoutParams(params);

        TextView title = new TextView(this);
        title.setText(getBoxTitle(number));
        title.setTextSize(18);
        title.setTypeface(null, Typeface.BOLD);
        title.setTextColor(green);

        box.addView(title);

        TextView text = new TextView(this);
        text.setText(getBoxText(number));
        text.setTextSize(15);
        text.setTextColor(Color.rgb(50, 55, 52));
        text.setPadding(0, 9, 0, 0);

        box.addView(text);

        root.addView(box);
    }

    String getTitleText() {

        if (language.equals("AZ")) {
            return "İstehsalat";
        }

        if (language.equals("EN")) {
            return "Manufacturing";
        }

        return "Производство";
    }

    String getBoxTitle(int n) {

        if (language.equals("AZ")) {

            switch (n) {

                case 1:
                    return "İstehsalatın əsasları";

                case 2:
                    return "İstehsalat avadanlığı";

                case 3:
                    return "Metallar və materiallar";

                case 4:
                    return "Texnoloji proseslər";

                case 5:
                    return "CNC dəzgahları";

                case 6:
                    return "Vərəq 660";

                case 7:
                    return "İş prosesinə nəzarət";

                case 8:
                    return "İstehsalatda təhlükəsizlik";
            }
        }

        if (language.equals("EN")) {

            switch (n) {

                case 1:
                    return "Production Basics";

                case 2:
                    return "Production Equipment";

                case 3:
                    return "Metals and Materials";

                case 4:
                    return "Technological Processes";

                case 5:
                    return "CNC Machines";

                case 6:
                    return "Sheet 660";

                case 7:
                    return "Work Process Control";

                case 8:
                    return "Production Safety";
            }
        }

        switch (n) {

            case 1:
                return "Основы производства";

            case 2:
                return "Производственное оборудование";

            case 3:
                return "Металлы и материалы";

            case 4:
                return "Технологические процессы";

            case 5:
                return "CNC станки";

            case 6:
                return "Лист 660";

            case 7:
                return "Контроль рабочего процесса";

            case 8:
                return "Безопасность на производстве";
        }

        return "";
    }

    String getBoxText(int n) {

        if (language.equals("AZ")) {

            switch (n) {

                case 1:
                    return "İstehsalat məhsulun və ya detalın hazırlanması prosesidir.";

                case 2:
                    return "Dəzgahlar, preslər, sobalar, CNC avadanlığı və digər istehsalat maşınları.";

                case 3:
                    return "İstehsalatda polad, alüminium, mis və digər materiallardan istifadə olunur.";

                case 4:
                    return "Kəsmə, ştamplama, qaynaq, emal, istilik emalı və digər texnoloji proseslər.";

                case 5:
                    return "CNC dəzgahları proqram vasitəsilə dəqiq emal və kəsmə əməliyyatlarını yerinə yetirir.";

                case 6:
                    return "660 vərəq materialı ilə işləyərkən ölçülərə, səthə və texnoloji tələblərə diqqət edilməlidir.";

                case 7:
                    return "İşçi prosesin düzgün aparılmasına, ölçülərə və avadanlığın vəziyyətinə nəzarət etməlidir.";

                case 8:
                    return "Qoruyucu vasitələrdən istifadə edin və avadanlıqla işləyərkən təhlükəsizlik qaydalarına əməl edin.";
            }
        }

        if (language.equals("EN")) {

            switch (n) {

                case 1:
                    return "Manufacturing is the process of producing a product or part.";

                case 2:
                    return "Machines, presses, furnaces, CNC equipment and other production machines.";

                case 3:
                    return "Steel, aluminium, copper and other materials are used in manufacturing.";

                case 4:
                    return "Cutting, stamping, welding, machining, heat treatment and other technological processes.";

                case 5:
                    return "CNC machines perform precise machining and cutting operations using programmed instructions.";

                case 6:
                    return "When working with Sheet 660, pay attention to dimensions, surface condition and technological requirements.";

                case 7:
                    return "The worker must control the process, dimensions and condition of the equipment.";

                case 8:
                    return "Use protective equipment and follow safety rules when working with machinery.";
            }
        }

        switch (n) {

            case 1:
                return "Производство — это процесс изготовления продукции или детали.";

            case 2:
                return "Станки, прессы, печи, CNC-оборудование и другие производственные машины.";

            case 3:
                return "В производстве используются сталь, алюминий, медь и другие материалы.";

            case 4:
                return "Резка, штамповка, сварка, обработка, термообработка и другие технологические процессы.";

            case 5:
                return "CNC станки выполняют точную обработку и резку по заданной программе.";

            case 6:
                return "При работе с листом 660 необходимо контролировать размеры, поверхность и технологические требования.";

            case 7:
                return "Рабочий должен контролировать процесс, размеры деталей и состояние оборудования.";

            case 8:
                return "Используйте средства защиты и соблюдайте правила безопасности при работе с оборудованием.";
        }

        return "";
    }

    void addSpace(LinearLayout root, int height) {

        TextView space = new TextView(this);
        space.setHeight(height);

        root.addView(space);
    }
}