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

        if (language.equals("TR")) {
            return "Yangın Söndürücüler";
        }

        if (language.equals("DE")) {
            return "Feuerlöscher";
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

        } else if (language.equals("TR")) {

            return new String[]{
                    "🧯 Yangın Söndürücü Nedir?",
                    "⬜ Kuru Kimyevi Tozlu Söndürücü",
                    "❄️ Karbondioksitli Söndürücü",
                    "💧 Su Bazlı Söndürücü",
                    "🔥 Yangın Sınıfları",
                    "✅ Doğru Söndürücüyü Seçme",
                    "🚨 Kullanım Şekli",
                    "🦺 Güvenlik Kuralları"
            };

        } else if (language.equals("DE")) {

            return new String[]{
                    "🧯 Was ist ein Feuerlöscher?",
                    "⬜ Pulverfeuerlöscher",
                    "❄️ Kohlendioxid-Feuerlöscher",
                    "💧 Wasserlöscher",
                    "🔥 Brandklassen",
                    "✅ Den richtigen Feuerlöscher wählen",
                    "🚨 Anwendung",
                    "🦺 Sicherheitsregeln"
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
        } else if (language.equals("TR")) {
            back.setText("← Geri");
        } else if (language.equals("DE")) {
            back.setText("← Zurück");
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
                        "What is a Fire Extinguisher?",
                        "Yangın Söndürücü Nedir?",
                        "Was ist ein Feuerlöscher?"
                },

                {
                        "Порошковый огнетушитель",
                        "Tozlu yanğınsöndürən",
                        "Dry Powder Extinguisher",
                        "Kuru Kimyevi Tozlu Söndürücü",
                        "Pulverfeuerlöscher"
                },

                {
                        "Углекислотный огнетушитель",
                        "Karbon qazlı yanğınsöndürən",
                        "Carbon Dioxide Extinguisher",
                        "Karbondioksitli Söndürücü",
                        "Kohlendioxid-Feuerlöscher"
                },

                {
                        "Водный огнетушитель",
                        "Su əsaslı yanğınsöndürən",
                        "Water-Based Extinguisher",
                        "Su Bazlı Söndürücü",
                        "Wasserlöscher"
                },

                {
                        "Классы пожаров",
                        "Yanğın sinifləri",
                        "Fire Classes",
                        "Yangın Sınıfları",
                        "Brandklassen"
                },

                {
                        "Правильный выбор",
                        "Düzgün seçim",
                        "Choosing the Right Extinguisher",
                        "Doğru Söndürücüyü Seçme",
                        "Den richtigen Feuerlöscher wählen"
                },

                {
                        "Как пользоваться",
                        "İstifadə qaydası",
                        "How to Use",
                        "Kullanım Şekli",
                        "Anwendung"
                },

                {
                        "Правила безопасности",
                        "Təhlükəsizlik qaydaları",
                        "Safety Rules",
                        "Güvenlik Kuralları",
                        "Sicherheitsregeln"
                }
        };

        return titles[number][getLanguageIndex()];
    }

    private String getInfoText(int number) {

        String[][] texts = {

                {
                        "Огнетушитель — переносное или передвижное устройство для тушения небольших очагов пожара. На производстве важно знать расположение огнетушителей и правила их применения.",

                        "Yanğınsöndürən kiçik yanğın ocaqlarını söndürmək üçün istifadə olunan daşınan və ya hərəkətli qurğudur. İstehsalatda yanğınsöndürənlərin yerini və istifadə qaydalarını bilmək vacibdir.",

                        "A fire extinguisher is a portable or mobile device used to put out small fires. At work, it is important to know where extinguishers are located and how to use them.",

                        "Yangın söndürücü, küçük yangınları söndürmek için kullanılan taşınabilir veya hareketli bir cihazdır. İş yerinde söndürücülerin nerede olduğunu ve nasıl kullanılacağını bilmek önemlidir.",

                        "Ein Feuerlöscher ist ein tragbares oder fahrbares Gerät zum Löschen kleiner Brände. Am Arbeitsplatz ist es wichtig, den Standort der Feuerlöscher und ihre Anwendung zu kennen."
                },

                {
                        "Порошковые огнетушители применяются для различных типов пожаров. Перед использованием проверьте маркировку и убедитесь, что данный огнетушитель подходит для конкретного пожара.",

                        "Tozlu yanğınsöndürənlər müxtəlif yanğın növləri üçün istifadə olunur. İstifadədən əvvəl markalanmanı yoxlayın və yanğınsöndürənin həmin yanğın üçün uyğun olduğuna əmin olun.",

                        "Dry powder extinguishers are used for different types of fires. Check the label before use and make sure the extinguisher is suitable for the specific fire.",

                        "Kuru kimyevi tozlu söndürücüler farklı yangın türlerinde kullanılır. Kullanmadan önce etiketi kontrol edin ve söndürücünün yangına uygun olduğundan emin olun.",

                        "Pulverfeuerlöscher werden für verschiedene Brandarten eingesetzt. Prüfen Sie vor der Anwendung die Kennzeichnung und stellen Sie sicher, dass der Feuerlöscher für den jeweiligen Brand geeignet ist."
                },

                {
                        "Углекислотные огнетушители используют CO₂. Они часто применяются для электрооборудования и некоторых других подходящих пожаров. Не прикасайтесь голыми руками к сильно охлаждённым частям при работе.",

                        "Karbon qazlı yanğınsöndürənlər CO₂ istifadə edir. Onlar tez-tez elektrik avadanlıqları və uyğun digər yanğınlar üçün tətbiq olunur. İstifadə zamanı çox soyuyan hissələrə çılpaq əllə toxunmayın.",

                        "Carbon dioxide extinguishers use CO₂. They are often used for electrical equipment and other suitable fires. Do not touch extremely cold parts with bare hands during use.",

                        "Karbondioksitli söndürücüler CO₂ kullanır. Elektrikli ekipmanlarda ve uygun diğer yangınlarda sıklıkla kullanılır. Kullanım sırasında çok soğuyan parçalara çıplak elle dokunmayın.",

                        "Kohlendioxid-Feuerlöscher verwenden CO₂. Sie werden häufig bei elektrischen Anlagen und anderen geeigneten Bränden eingesetzt. Berühren Sie stark abgekühlte Teile während der Anwendung nicht mit bloßen Händen."
                },

                {
                        "Водные огнетушители применяются только для тех классов пожара, для которых они предназначены. Не используйте воду на электрооборудовании под напряжением.",

                        "Su əsaslı yanğınsöndürənlər yalnız nəzərdə tutulduqları yanğın sinifləri üçün istifadə olunur. Gərginlik altında olan elektrik avadanlığında sudan istifadə etməyin.",

                        "Water-based extinguishers should only be used for the fire classes they are designed for. Do not use water on energized electrical equipment.",

                        "Su bazlı söndürücüler yalnız tasarlandıkları yangın sınıflarında kullanılmalıdır. Enerji altında olan elektrik ekipmanlarında su kullanmayın.",

                        "Wasserlöscher dürfen nur bei den Brandklassen eingesetzt werden, für die sie vorgesehen sind. Verwenden Sie kein Wasser an unter Spannung stehenden elektrischen Anlagen."
                },

                {
                        "Класс пожара определяет тип горящего материала. Перед тушением необходимо выбрать огнетушитель, подходящий для данного класса пожара.",

                        "Yanğın sinfi yanan materialın növünü müəyyən edir. Söndürmədən əvvəl həmin yanğın sinfinə uyğun yanğınsöndürən seçilməlidir.",

                        "The fire class identifies the type of burning material. Before fighting a fire, choose an extinguisher suitable for that fire class.",

                        "Yangın sınıfı yanan malzemenin türünü belirler. Yangına müdahale etmeden önce o yangın sınıfına uygun bir söndürücü seçin.",

                        "Die Brandklasse beschreibt die Art des brennenden Materials. Wählen Sie vor dem Löschen einen für diese Brandklasse geeigneten Feuerlöscher."
                },

                {
                        "Всегда смотрите на маркировку огнетушителя. Выбор зависит от типа пожара, окружающей обстановки и требований предприятия. Если вы сомневаетесь, не рискуйте и покиньте опасную зону.",

                        "Həmişə yanğınsöndürənin markalanmasına baxın. Seçim yanğının növündən, ətraf mühitdən və müəssisənin tələblərindən asılıdır. Əmin deyilsinizsə, risk etməyin və təhlükəli ərazini tərk edin.",

                        "Always check the extinguisher label. The choice depends on the type of fire, the surroundings and workplace requirements. If you are unsure, do not take risks and leave the danger area.",

                        "Her zaman söndürücünün etiketini kontrol edin. Seçim yangının türüne, çevre koşullarına ve iş yeri gerekliliklerine bağlıdır. Emin değilseniz risk almayın ve tehlikeli bölgeden uzaklaşın.",

                        "Beachten Sie immer die Kennzeichnung des Feuerlöschers. Die Auswahl hängt von der Brandart, der Umgebung und den betrieblichen Anforderungen ab. Wenn Sie unsicher sind, gehen Sie kein Risiko ein und verlassen Sie den Gefahrenbereich."
                },

                {
                        "Перед применением убедитесь, что вы знаете инструкцию для конкретного огнетушителя. Если это безопасно, держитесь на рекомендованном расстоянии, направляйте средство на основание пламени и следуйте инструкции на корпусе.",

                        "İstifadədən əvvəl konkret yanğınsöndürənin təlimatını bildiyinizə əmin olun. Təhlükəsizdirsə, tövsiyə olunan məsafəni saxlayın, söndürücü maddəni alovun əsasına yönəldin və gövdədəki təlimata əməl edin.",

                        "Before use, make sure you know the instructions for the specific extinguisher. If it is safe, keep the recommended distance, aim at the base of the flames and follow the instructions on the extinguisher.",

                        "Kullanmadan önce belirli söndürücünün talimatlarını bildiğinizden emin olun. Güvenliyse önerilen mesafeyi koruyun, söndürücü maddeyi alevlerin tabanına yöneltin ve cihaz üzerindeki talimatları izleyin.",

                        "Vergewissern Sie sich vor der Anwendung, dass Sie die Anleitung für den jeweiligen Feuerlöscher kennen. Wenn es sicher ist, halten Sie den empfohlenen Abstand ein, richten Sie das Löschmittel auf den Brandherd und befolgen Sie die Anleitung auf dem Gerät."
                },

                {
                        "Не приближайтесь к большому или быстро распространяющемуся пожару. Немедленно сообщите об опасности, активируйте пожарную тревогу и покиньте зону по плану эвакуации. Никогда не подвергайте себя опасности.",

                        "Böyük və ya sürətlə yayılan yanğına yaxınlaşmayın. Dərhal təhlükə barədə məlumat verin, yanğın siqnalizasiyasını aktivləşdirin və təxliyə planına uyğun olaraq ərazini tərk edin. Özünüzü heç vaxt təhlükəyə atmayın.",

                        "Do not approach a large or rapidly spreading fire. Report the danger immediately, activate the fire alarm and leave the area according to the evacuation plan. Never put yourself at risk.",

                        "Büyük veya hızla yayılan bir yangına yaklaşmayın. Tehlikeyi hemen bildirin, yangın alarmını etkinleştirin ve tahliye planına göre bölgeden ayrılın. Kendinizi asla tehlikeye atmayın.",

                        "Nähern Sie sich keinem großen oder sich schnell ausbreitenden Brand. Melden Sie die Gefahr sofort, lösen Sie den Feueralarm aus und verlassen Sie den Bereich gemäß dem Evakuierungsplan. Bringen Sie sich niemals selbst in Gefahr."
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

        if (language.equals("TR")) {
            return 3;
        }

        if (language.equals("DE")) {
            return 4;
        }

        return 0;
    }
}