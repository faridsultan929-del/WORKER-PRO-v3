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

public class FireExtinguisherActivity extends Activity {

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
        title.setText("🧯  " + getFireTitle());
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

    private String getFireTitle() {

        if (language.equals("AZ")) {
            return "Yanğınsöndürənlər";
        }

        if (language.equals("EN")) {
            return "Fire Extinguishers";
        }

        return "Огнетушители";
    }

    private String[] getCards() {

        if (language.equals("AZ")) {

            return new String[]{
                    "🧯 Yanğınsöndürən nədir?",
                    "⬜ Tozlu yanğınsöndürən",
                    "❄️ Karbon qazlı yanğınsöndürən",
                    "💧 Su əsaslı yanğınsöndürən",
                    "🔥 Yanğın sinifləri",
                    "✅ Düzgün seçim",
                    "🚨 İstifadə qaydası",
                    "🦺 Təhlükəsizlik qaydaları"
            };

        } else if (language.equals("EN")) {

            return new String[]{
                    "🧯 What is a Fire Extinguisher?",
                    "⬜ Dry Powder Extinguisher",
                    "❄️ Carbon Dioxide Extinguisher",
                    "💧 Water-Based Extinguisher",
                    "🔥 Fire Classes",
                    "✅ Choosing the Right Extinguisher",
                    "🚨 How to Use",
                    "🦺 Safety Rules"
            };

        } else {

            return new String[]{
                    "🧯 Что такое огнетушитель?",
                    "⬜ Порошковый огнетушитель",
                    "❄️ Углекислотный огнетушитель",
                    "💧 Водный огнетушитель",
                    "🔥 Классы пожаров",
                    "✅ Правильный выбор",
                    "🚨 Как пользоваться",
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
                        "Что такое огнетушитель?",
                        "Yanğınsöndürən nədir?",
                        "What is a Fire Extinguisher?"
                },

                {
                        "Порошковый огнетушитель",
                        "Tozlu yanğınsöndürən",
                        "Dry Powder Extinguisher"
                },

                {
                        "Углекислотный огнетушитель",
                        "Karbon qazlı yanğınsöndürən",
                        "Carbon Dioxide Extinguisher"
                },

                {
                        "Водный огнетушитель",
                        "Su əsaslı yanğınsöndürən",
                        "Water-Based Extinguisher"
                },

                {
                        "Классы пожаров",
                        "Yanğın sinifləri",
                        "Fire Classes"
                },

                {
                        "Правильный выбор",
                        "Düzgün seçim",
                        "Choosing the Right Extinguisher"
                },

                {
                        "Как пользоваться",
                        "İstifadə qaydası",
                        "How to Use"
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
                        "Огнетушитель — переносное или передвижное устройство для тушения небольших очагов пожара. На производстве важно знать расположение огнетушителей и правила их применения.",

                        "Yanğınsöndürən kiçik yanğın ocaqlarını söndürmək üçün istifadə olunan daşınan və ya hərəkətli qurğudur. İstehsalatda yanğınsöndürənlərin yerini və istifadə qaydalarını bilmək vacibdir.",

                        "A fire extinguisher is a portable or mobile device used to put out small fires. At work, it is important to know where extinguishers are located and how to use them."
                },

                {
                        "Порошковые огнетушители применяются для различных типов пожаров. Перед использованием проверьте маркировку и убедитесь, что данный огнетушитель подходит для конкретного пожара.",

                        "Tozlu yanğınsöndürənlər müxtəlif yanğın növləri üçün istifadə olunur. İstifadədən əvvəl markalanmanı yoxlayın və yanğınsöndürənin həmin yanğın üçün uyğun olduğuna əmin olun.",

                        "Dry powder extinguishers are used for different types of fires. Check the label before use and make sure the extinguisher is suitable for the specific fire."
                },

                {
                        "Углекислотные огнетушители используют CO₂. Они часто применяются для электрооборудования и некоторых других подходящих пожаров. Не прикасайтесь голыми руками к сильно охлаждённым частям при работе.",

                        "Karbon qazlı yanğınsöndürənlər CO₂ istifadə edir. Onlar tez-tez elektrik avadanlıqları və uyğun digər yanğınlar üçün tətbiq olunur. İstifadə zamanı çox soyuyan hissələrə çılpaq əllə toxunmayın.",

                        "Carbon dioxide extinguishers use CO₂. They are often used for electrical equipment and other suitable fires. Do not touch extremely cold parts with bare hands during use."
                },

                {
                        "Водные огнетушители применяются только для тех классов пожара, для которых они предназначены. Не используйте воду на электрооборудовании под напряжением.",

                        "Su əsaslı yanğınsöndürənlər yalnız nəzərdə tutulduqları yanğın sinifləri üçün istifadə olunur. Gərginlik altında olan elektrik avadanlığında sudan istifadə etməyin.",

                        "Water-based extinguishers should only be used for the fire classes they are designed for. Do not use water on energized electrical equipment."
                },

                {
                        "Класс пожара определяет тип горящего материала. Перед тушением необходимо выбрать огнетушитель, подходящий для данного класса пожара.",

                        "Yanğın sinfi yanan materialın növünü müəyyən edir. Söndürmədən əvvəl həmin yanğın sinfinə uyğun yanğınsöndürən seçilməlidir.",

                        "The fire class identifies the type of burning material. Before fighting a fire, choose an extinguisher suitable for that fire class."
                },

                {
                        "Всегда смотрите на маркировку огнетушителя. Выбор зависит от типа пожара, окружающей обстановки и требований предприятия. Если вы сомневаетесь, не рискуйте и покиньте опасную зону.",

                        "Həmişə yanğınsöndürənin markalanmasına baxın. Seçim yanğının növündən, ətraf mühitdən və müəssisənin tələblərindən asılıdır. Əmin deyilsinizsə, risk etməyin və təhlükəli ərazini tərk edin.",

                        "Always check the extinguisher label. The choice depends on the type of fire, the surroundings and workplace requirements. If you are unsure, do not take risks and leave the danger area."
                },

                {
                        "Перед применением убедитесь, что вы знаете инструкцию для конкретного огнетушителя. Если это безопасно, держитесь на рекомендованном расстоянии, направляйте средство на основание пламени и следуйте инструкции на корпусе.",

                        "İstifadədən əvvəl konkret yanğınsöndürənin təlimatını bildiyinizə əmin olun. Təhlükəsizdirsə, tövsiyə olunan məsafəni saxlayın, söndürücü maddəni alovun əsasına yönəldin və gövdədəki təlimata əməl edin.",

                        "Before use, make sure you know the instructions for the specific extinguisher. If it is safe, keep the recommended distance, aim at the base of the flames and follow the instructions on the extinguisher."
                },

                {
                        "Не приближайтесь к большому или быстро распространяющемуся пожару. Немедленно сообщите об опасности, активируйте пожарную тревогу и покиньте зону по плану эвакуации. Никогда не подвергайте себя опасности.",

                        "Böyük və ya sürətlə yayılan yanğına yaxınlaşmayın. Dərhal təhlükə barədə məlumat verin, yanğın siqnalizasiyasını aktivləşdirin və təxliyə planına uyğun olaraq ərazini tərk edin. Özünüzü heç vaxt təhlükəyə atmayın.",

                        "Do not approach a large or rapidly spreading fire. Report the danger immediately, activate the fire alarm and leave the area according to the evacuation plan. Never put yourself at risk."
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