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

public class FurnaceActivity extends Activity {

    private String language = "RU";
    private LinearLayout content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String receivedLanguage = getIntent().getStringExtra("LANGUAGE");

        if (receivedLanguage != null) {
            language = receivedLanguage;
        }

        createScreen();
    }

    private void createScreen() {

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(Color.WHITE);
        root.setPadding(18, 12, 18, 10);

        TextView title = new TextView(this);
        title.setText("🔥  " + getFurnaceTitle());
        title.setTextSize(27);
        title.setTypeface(null, Typeface.BOLD);
        title.setTextColor(Color.rgb(0, 130, 70));
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 8, 0, 15);

        root.addView(title);

        ScrollView scrollView = new ScrollView(this);

        content = new LinearLayout(this);
        content.setOrientation(LinearLayout.VERTICAL);
        content.setPadding(0, 5, 0, 10);

        String[] cards = getCards();

        for (int i = 0; i < cards.length; i++) {

            final int number = i;

            TextView card = createCard(cards[i]);

            card.setOnClickListener(v -> showInfo(number));

            content.addView(card);
        }

        scrollView.addView(content);

        root.addView(
                scrollView,
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        0,
                        1
                )
        );

        TextView developer = new TextView(this);
        developer.setText("F.S");
        developer.setTextSize(16);
        developer.setTextColor(Color.GRAY);
        developer.setGravity(Gravity.CENTER);
        developer.setPadding(0, 5, 0, 5);

        root.addView(developer);

        setContentView(root);
    }

    private TextView createCard(String text) {

        TextView card = new TextView(this);

        card.setText(text);
        card.setTextSize(18);
        card.setTypeface(null, Typeface.BOLD);
        card.setTextColor(Color.rgb(0, 105, 60));
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

    private String getFurnaceTitle() {

        if (language.equals("AZ")) {
            return "Sobalar və qızdırma";
        }

        if (language.equals("EN")) {
            return "Furnaces & Heating";
        }

        return "Печи и нагрев";
    }

    private String[] getCards() {

        if (language.equals("AZ")) {

            return new String[]{
                    "🔥 İnduksiya sobaları",
                    "🌡️ Metalın qızdırılması",
                    "🌡️ Temperatur nəzarəti",
                    "⚙️ Soba quruluşu",
                    "🔩 Materialın hazırlanması",
                    "📋 Prosesə nəzarət",
                    "⚠️ Əsas təhlükələr",
                    "🦺 Təhlükəsizlik qaydaları"
            };

        } else if (language.equals("EN")) {

            return new String[]{
                    "🔥 Induction Furnaces",
                    "🌡️ Metal Heating",
                    "🌡️ Temperature Control",
                    "⚙️ Furnace Structure",
                    "🔩 Material Preparation",
                    "📋 Process Control",
                    "⚠️ Main Hazards",
                    "🦺 Safety Rules"
            };

        } else {

            return new String[]{
                    "🔥 Индукционные печи",
                    "🌡️ Нагрев металла",
                    "🌡️ Контроль температуры",
                    "⚙️ Устройство печи",
                    "🔩 Подготовка материала",
                    "📋 Контроль процесса",
                    "⚠️ Основные опасности",
                    "🦺 Правила безопасности"
            };
        }
    }

    private void showInfo(int number) {

        content.removeAllViews();

        TextView title = new TextView(this);
        title.setText(getInfoTitle(number));
        title.setTextSize(23);
        title.setTypeface(null, Typeface.BOLD);
        title.setTextColor(Color.rgb(0, 130, 70));
        title.setGravity(Gravity.CENTER);
        title.setPadding(10, 20, 10, 20);

        content.addView(title);

        TextView info = new TextView(this);
        info.setText(getInfoText(number));
        info.setTextSize(18);
        info.setTextColor(Color.DKGRAY);
        info.setPadding(20, 10, 20, 30);

        content.addView(info);

        TextView back = new TextView(this);

        if (language.equals("AZ")) {
            back.setText("← Geri");
        } else if (language.equals("EN")) {
            back.setText("← Back");
        } else {
            back.setText("← Назад");
        }

        back.setTextSize(18);
        back.setTypeface(null, Typeface.BOLD);
        back.setTextColor(Color.rgb(0, 130, 70));
        back.setGravity(Gravity.CENTER);
        back.setPadding(20, 20, 20, 20);

        back.setOnClickListener(v -> createScreen());

        content.addView(back);
    }

    private String getInfoTitle(int number) {

        String[][] titles = {

                {
                        "Индукционные печи",
                        "İnduksiya sobaları",
                        "Induction Furnaces"
                },

                {
                        "Нагрев металла",
                        "Metalın qızdırılması",
                        "Metal Heating"
                },

                {
                        "Контроль температуры",
                        "Temperatur nəzarəti",
                        "Temperature Control"
                },

                {
                        "Устройство печи",
                        "Soba quruluşu",
                        "Furnace Structure"
                },

                {
                        "Подготовка материала",
                        "Materialın hazırlanması",
                        "Material Preparation"
                },

                {
                        "Контроль процесса",
                        "Prosesə nəzarət",
                        "Process Control"
                },

                {
                        "Основные опасности",
                        "Əsas təhlükələr",
                        "Main Hazards"
                },

                {
                        "Правила безопасности",
                        "Təhlükəsizlik qaydaları",
                        "Safety Rules"
                }
        };

        return titles[number][getLanguageIndex()];
    }

    private String getInfoText(int number) {

        String[][] texts = {

                {
                        "Индукционная печь нагревает металл с помощью электромагнитного поля. Оператор должен контролировать оборудование, температуру и состояние системы.",

                        "İnduksiya sobası elektromaqnit sahəsindən istifadə edərək metalı qızdırır. Operator avadanlığa, temperatura və sistemin vəziyyətinə nəzarət etməlidir.",

                        "An induction furnace heats metal using an electromagnetic field. The operator must monitor the equipment, temperature and system condition."
                },

                {
                        "При нагреве металл достигает высокой температуры. Используйте подходящие СИЗ и соблюдайте безопасную дистанцию от горячего металла.",

                        "Qızdırma zamanı metal yüksək temperatura çatır. Uyğun fərdi mühafizə vasitələrindən istifadə edin və isti metaldan təhlükəsiz məsafə saxlayın.",

                        "During heating, metal reaches a high temperature. Use appropriate PPE and keep a safe distance from hot metal."
                },

                {
                        "Температуру необходимо контролировать по показаниям датчиков и приборов. При отклонении параметров остановите процесс согласно инструкции.",

                        "Temperatur sensorların və cihazların göstəricilərinə əsasən nəzarətdə saxlanılmalıdır. Parametrlər normadan kənara çıxarsa, təlimata uyğun olaraq prosesi dayandırın.",

                        "Temperature must be monitored using sensors and instruments. If parameters become abnormal, stop the process according to the instructions."
                },

                {
                        "Основные элементы печи включают нагревательную систему, футеровку, датчики, систему управления и защитные устройства.",

                        "Soba əsasən qızdırma sistemi, futerovka, sensorlar, idarəetmə sistemi və qoruyucu qurğulardan ibarətdir.",

                        "The main furnace components include the heating system, lining, sensors, control system and safety devices."
                },

                {
                        "Перед загрузкой материала проверьте его состояние, размер и соответствие технологическому заданию. Не загружайте неподходящий материал.",

                        "Materialı sobaya yerləşdirməzdən əvvəl onun vəziyyətini, ölçüsünü və texnoloji tapşırığa uyğunluğunu yoxlayın. Uyğun olmayan materialı yükləməyin.",

                        "Before loading material, check its condition, size and compliance with the process requirements. Do not load unsuitable material."
                },

                {
                        "Контролируйте температуру, время нагрева и другие параметры процесса. Все отклонения необходимо своевременно выявлять и сообщать ответственному специалисту.",

                        "Temperaturu, qızdırma müddətini və prosesin digər parametrlərini nəzarətdə saxlayın. Bütün kənarlaşmalar vaxtında aşkar edilməli və məsul şəxsə bildirilməlidir.",

                        "Monitor temperature, heating time and other process parameters. Any deviations must be identified promptly and reported to the responsible person."
                },

                {
                        "Основные опасности: высокая температура, горячий металл, электрическая энергия, электромагнитное поле и возможные выбросы горячего материала.",

                        "Əsas təhlükələr: yüksək temperatur, isti metal, elektrik enerjisi, elektromaqnit sahəsi və isti materialın mümkün sıçramalarıdır.",

                        "Main hazards include high temperature, hot metal, electrical energy, electromagnetic fields and possible hot material splashes."
                },

                {
                        "Используйте необходимые СИЗ, не приближайтесь к опасной зоне без разрешения и не работайте с неисправной печью. Перед обслуживанием отключите энергию согласно процедуре.",

                        "Lazımi fərdi mühafizə vasitələrindən istifadə edin, icazəsiz təhlükəli zonaya yaxınlaşmayın və nasaz soba ilə işləməyin. Texniki xidmətdən əvvəl prosedura uyğun olaraq enerjini ayırın.",

                        "Use the required PPE, do not enter the danger zone without authorization and do not operate a faulty furnace. Isolate the energy according to the procedure before maintenance."
                }
        };

        return texts[number][getLanguageIndex()];
    }

    private int getLanguageIndex() {

        if (language.equals("AZ")) {
            return 1;
        }

        if (language.equals("EN")) {
            return 2;
        }

        return 0;
    }
}