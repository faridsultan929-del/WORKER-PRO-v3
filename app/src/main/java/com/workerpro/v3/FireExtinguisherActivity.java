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

        showFireExtinguishers();
    }

    void showFireExtinguishers() {

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

        TextView boxTitle = new TextView(this);
        boxTitle.setText(getBoxTitle(number));
        boxTitle.setTextSize(18);
        boxTitle.setTypeface(null, Typeface.BOLD);
        boxTitle.setTextColor(green);

        box.addView(boxTitle);

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
            return "Yanğınsöndürənlər";
        }

        if (language.equals("EN")) {
            return "Fire Extinguishers";
        }

        return "Огнетушители";
    }

    String getBoxTitle(int number) {

        if (language.equals("AZ")) {

            switch (number) {

                case 1:
                    return "Yanğınsöndürən nədir?";

                case 2:
                    return "Tozlu yanğınsöndürən";

                case 3:
                    return "Karbon qazlı yanğınsöndürən";

                case 4:
                    return "Su əsaslı yanğınsöndürən";

                case 5:
                    return "Yanğın sinifləri";

                case 6:
                    return "Düzgün seçim";

                case 7:
                    return "İstifadə qaydası";

                case 8:
                    return "Təhlükəsizlik qaydaları";
            }
        }

        if (language.equals("EN")) {

            switch (number) {

                case 1:
                    return "What is a Fire Extinguisher?";

                case 2:
                    return "Dry Powder Extinguisher";

                case 3:
                    return "Carbon Dioxide Extinguisher";

                case 4:
                    return "Water-Based Extinguisher";

                case 5:
                    return "Fire Classes";

                case 6:
                    return "Choosing the Right Extinguisher";

                case 7:
                    return "How to Use";

                case 8:
                    return "Safety Rules";
            }
        }

        switch (number) {

            case 1:
                return "Что такое огнетушитель?";

            case 2:
                return "Порошковый огнетушитель";

            case 3:
                return "Углекислотный огнетушитель";

            case 4:
                return "Водный огнетушитель";

            case 5:
                return "Классы пожаров";

            case 6:
                return "Правильный выбор";

            case 7:
                return "Как пользоваться";

            case 8:
                return "Правила безопасности";
        }

        return "";
    }

    String getBoxText(int number) {

        if (language.equals("AZ")) {

            switch (number) {

                case 1:
                    return "Yanğınsöndürən kiçik yanğınları ilkin mərhələdə söndürmək üçün istifadə olunan portativ avadanlıqdır.";

                case 2:
                    return "Tozlu yanğınsöndürənlər müxtəlif yanğın növlərində istifadə oluna bilər. İstifadə sahəsi cihazın üzərindəki nişanlara uyğun seçilməlidir.";

                case 3:
                    return "Karbon qazlı yanğınsöndürənlər elektrik avadanlıqları və uyğun yanğınlar üçün istifadə oluna bilər. İstehsalçının təlimatına əməl edin.";

                case 4:
                    return "Su əsaslı yanğınsöndürənlər uyğun bərk material yanğınlarında istifadə olunur. Elektrik avadanlığına tətbiq etməzdən əvvəl uyğunluq yoxlanılmalıdır.";

                case 5:
                    return "Yanğın sinifləri yanan materialın növünə görə müəyyən edilir. İş yerində istifadə olunan standart və nişanlara uyğun seçim edilməlidir.";

                case 6:
                    return "Yanğın növünü müəyyən edin və yalnız həmin yanğın üçün uyğun olan yanğınsöndürəndən istifadə edin.";

                case 7:
                    return "Yanğınsöndürəni təhlükəsiz məsafədən istifadə edin. Cihazın təlimatındakı göstərişlərə əməl edin və yanğın böyüyürsə ərazini tərk edin.";

                case 8:
                    return "Yanğın zamanı əvvəlcə insanların təhlükəsizliyini təmin edin. Tüstü və alov təhlükəlidirsə, yanğını özünüz söndürməyə çalışmayın və təcili yardım çağırın.";
            }
        }

        if (language.equals("EN")) {

            switch (number) {

                case 1:
                    return "A fire extinguisher is portable equipment used to control small fires at an early stage.";

                case 2:
                    return "Dry powder extinguishers can be used for different types of fires. Always check the extinguisher label and instructions.";

                case 3:
                    return "Carbon dioxide extinguishers can be suitable for electrical equipment and certain fires. Follow the manufacturer's instructions.";

                case 4:
                    return "Water-based extinguishers are suitable for certain solid-material fires. Check compatibility before using near electrical equipment.";

                case 5:
                    return "Fire classes are based on the type of burning material. Choose the extinguisher according to workplace standards and labels.";

                case 6:
                    return "Identify the type of fire and use only an extinguisher suitable for that fire.";

                case 7:
                    return "Use the extinguisher from a safe position and follow the instructions on the equipment. Leave the area if the fire grows.";

                case 8:
                    return "Protect people first during a fire. If smoke or flames are dangerous, do not attempt to fight the fire and leave the area safely.";
            }
        }

        switch (number) {

            case 1:
                return "Огнетушитель — переносное оборудование для тушения небольших очагов пожара на начальной стадии.";

            case 2:
                return "Порошковые огнетушители могут применяться при разных типах пожаров. Всегда проверяйте маркировку и инструкцию на огнетушителе.";

            case 3:
                return "Углекислотные огнетушители могут применяться для электрооборудования и некоторых других пожаров. Следуйте инструкции производителя.";

            case 4:
                return "Водные огнетушители применяются для определённых пожаров твёрдых материалов. Перед использованием рядом с электрооборудованием проверьте совместимость.";

            case 5:
                return "Класс пожара определяется типом горящего материала. Выбирайте огнетушитель согласно маркировке и правилам предприятия.";

            case 6:
                return "Определите тип пожара и используйте только огнетушитель, предназначенный для данного типа пожара.";

            case 7:
                return "Используйте огнетушитель с безопасного расстояния и следуйте инструкции на корпусе. Если пожар увеличивается, покиньте опасную зону.";

            case 8:
                return "При пожаре прежде всего обеспечьте безопасность людей. Если дым или огонь представляют опасность, не пытайтесь тушить пожар самостоятельно и покиньте помещение.";
        }

        return "";
    }
}