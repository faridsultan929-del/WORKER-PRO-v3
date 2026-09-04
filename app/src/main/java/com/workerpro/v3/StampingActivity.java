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

public class StampingActivity extends Activity {

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
        title.setText("🔨  " + getStampingTitle());
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

    private String getStampingTitle() {

        if (language.equals("AZ")) {
            return "Ştamplama";
        }

        if (language.equals("EN")) {
            return "Stamping";
        }

        return "Штамповка";
    }

    private String[] getCards() {

        if (language.equals("AZ")) {

            return new String[]{
                    "🔨 Ştamplama nədir?",
                    "❄️ Soyuq ştamplama",
                    "🔥 İsti ştamplama",
                    "⚙️ Ştamplama presləri",
                    "🔧 Ştamplama aləti",
                    "🔩 Materialın hazırlanması",
                    "✅ Keyfiyyətə nəzarət",
                    "🦺 Ştamplama zamanı təhlükəsizlik"
            };

        } else if (language.equals("EN")) {

            return new String[]{
                    "🔨 What is Stamping?",
                    "❄️ Cold Stamping",
                    "🔥 Hot Stamping",
                    "⚙️ Stamping Presses",
                    "🔧 Stamping Tools",
                    "🔩 Material Preparation",
                    "✅ Quality Control",
                    "🦺 Stamping Safety"
            };

        } else {

            return new String[]{
                    "🔨 Что такое штамповка?",
                    "❄️ Холодная штамповка",
                    "🔥 Горячая штамповка",
                    "⚙️ Штамповочные прессы",
                    "🔧 Штамповочный инструмент",
                    "🔩 Подготовка материала",
                    "✅ Контроль качества",
                    "🦺 Безопасность при штамповке"
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
                        "Что такое штамповка?",
                        "Ştamplama nədir?",
                        "What is Stamping?"
                },

                {
                        "Холодная штамповка",
                        "Soyuq ştamplama",
                        "Cold Stamping"
                },

                {
                        "Горячая штамповка",
                        "İsti ştamplama",
                        "Hot Stamping"
                },

                {
                        "Штамповочные прессы",
                        "Ştamplama presləri",
                        "Stamping Presses"
                },

                {
                        "Штамповочный инструмент",
                        "Ştamplama aləti",
                        "Stamping Tools"
                },

                {
                        "Подготовка материала",
                        "Materialın hazırlanması",
                        "Material Preparation"
                },

                {
                        "Контроль качества",
                        "Keyfiyyətə nəzarət",
                        "Quality Control"
                },

                {
                        "Безопасность при штамповке",
                        "Ştamplama zamanı təhlükəsizlik",
                        "Stamping Safety"
                }
        };

        return titles[number][getLanguageIndex()];
    }

    private String getInfoText(int number) {

        String[][] texts = {

                {
                        "Штамповка — это технологический процесс обработки металла давлением с использованием штампа и пресса. Метод позволяет получать детали нужной формы и размеров.",

                        "Ştamplama metalın ştamp və pres vasitəsilə təzyiq altında emal prosesidir. Bu üsul tələb olunan forma və ölçüdə detallar almağa imkan verir.",

                        "Stamping is a metal forming process that uses a die and press. It allows parts with the required shape and dimensions to be produced."
                },

                {
                        "Холодная штамповка выполняется без нагрева заготовки. Она применяется для получения деталей из листового и других металлических материалов.",

                        "Soyuq ştamplama material qızdırılmadan aparılır. Bu üsul təbəqə və digər metal materiallardan detallar hazırlamaq üçün istifadə olunur.",

                        "Cold stamping is performed without heating the workpiece. It is used to produce parts from sheet and other metal materials."
                },

                {
                        "Горячая штамповка выполняется при повышенной температуре металла. Нагрев делает металл более пластичным и облегчает формирование детали.",

                        "İsti ştamplama metalın yüksək temperaturda emal edilməsidir. Qızdırma metalı daha plastik edir və detalın formalaşdırılmasını asanlaşdırır.",

                        "Hot stamping is performed at an elevated metal temperature. Heating makes the metal more plastic and easier to form."
                },

                {
                        "Штамповочные прессы создают усилие, необходимое для деформации металла. Перед работой оператор должен проверить пресс, инструмент и защитные устройства.",

                        "Ştamplama presləri metalın deformasiyası üçün lazım olan qüvvəni yaradır. İşdən əvvəl operator presi, aləti və qoruyucu qurğuları yoxlamalıdır.",

                        "Stamping presses provide the force needed to form metal. Before operation, the operator must check the press, tool and safety guards."
                },

                {
                        "Штамповочный инструмент определяет форму детали. Инструмент должен быть исправным, правильно установленным и соответствовать технологическому процессу.",

                        "Ştamplama aləti detalın formasını müəyyən edir. Alət saz vəziyyətdə olmalı, düzgün quraşdırılmalı və texnoloji prosesə uyğun olmalıdır.",

                        "The stamping tool determines the shape of the part. It must be in good condition, correctly installed and suitable for the process."
                },

                {
                        "Перед штамповкой необходимо проверить материал: размер, толщину, состояние поверхности и соответствие заданию.",

                        "Ştamplamadan əvvəl materialın ölçüsü, qalınlığı, səthinin vəziyyəti və tapşırığa uyğunluğu yoxlanılmalıdır.",

                        "Before stamping, check the material size, thickness, surface condition and compliance with the job requirements."
                },

                {
                        "Контролируйте размеры, форму и внешний вид детали. При обнаружении дефекта остановите процесс и сообщите ответственному специалисту.",

                        "Detalın ölçülərini, formasını və görünüşünü yoxlayın. Qüsur aşkar edilərsə prosesi dayandırın və məsul şəxsə məlumat verin.",

                        "Check the dimensions, shape and appearance of the part. If a defect is found, stop the process and inform the responsible person."
                },

                {
                        "При работе на прессе используйте необходимые СИЗ. Не помещайте руки в опасную зону. Перед обслуживанием оборудования отключите энергию.",

                        "Presdə işləyərkən lazımi fərdi mühafizə vasitələrindən istifadə edin. Əllərinizi təhlükəli zonaya salmayın. Texniki xidmətdən əvvəl enerjini söndürün.",

                        "Use the required PPE when working with a press. Keep your hands out of the danger zone. Isolate the energy before maintenance."
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