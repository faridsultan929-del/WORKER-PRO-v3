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

        showStamping();
    }

    void showStamping() {

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
            return "Ştamplama";
        }

        if (language.equals("EN")) {
            return "Stamping";
        }

        return "Штамповка";
    }

    String getBoxTitle(int number) {

        if (language.equals("AZ")) {

            switch (number) {

                case 1:
                    return "Ştamplama nədir?";

                case 2:
                    return "Soyuq ştamplama";

                case 3:
                    return "İsti ştamplama";

                case 4:
                    return "Ştamplama presləri";

                case 5:
                    return "Ştamplama alətləri";

                case 6:
                    return "Materialın hazırlanması";

                case 7:
                    return "Keyfiyyətə nəzarət";

                case 8:
                    return "Ştamplamada təhlükəsizlik";
            }
        }

        if (language.equals("EN")) {

            switch (number) {

                case 1:
                    return "What is Stamping?";

                case 2:
                    return "Cold Stamping";

                case 3:
                    return "Hot Stamping";

                case 4:
                    return "Stamping Presses";

                case 5:
                    return "Stamping Tools";

                case 6:
                    return "Material Preparation";

                case 7:
                    return "Quality Control";

                case 8:
                    return "Stamping Safety";
            }
        }

        switch (number) {

            case 1:
                return "Что такое штамповка?";

            case 2:
                return "Холодная штамповка";

            case 3:
                return "Горячая штамповка";

            case 4:
                return "Штамповочные прессы";

            case 5:
                return "Штамповочный инструмент";

            case 6:
                return "Подготовка материала";

            case 7:
                return "Контроль качества";

            case 8:
                return "Безопасность при штамповке";
        }

        return "";
    }

    String getBoxText(int number) {

        if (language.equals("AZ")) {

            switch (number) {

                case 1:
                    return "Ştamplama pres və xüsusi alətlər vasitəsilə metalın formasının dəyişdirilməsi prosesidir.";

                case 2:
                    return "Soyuq ştamplama metalın əvvəlcədən qızdırılmadan presdə formalaşdırılması prosesidir.";

                case 3:
                    return "İsti ştamplamada metal yüksək temperatura qədər qızdırılır və sonra presdə formalaşdırılır.";

                case 4:
                    return "Ştamplama presləri metal detalları müəyyən edilmiş forma və ölçüdə hazırlamaq üçün istifadə olunur.";

                case 5:
                    return "Ştamplama alətlərinə matrisalar, puansonlar və digər xüsusi alətlər daxildir.";

                case 6:
                    return "İşə başlamazdan əvvəl materialın ölçüsü, vəziyyəti və texniki tələblərə uyğunluğu yoxlanılmalıdır.";

                case 7:
                    return "Hazır detalın ölçüləri, forması, səthi və digər keyfiyyət göstəriciləri yoxlanılmalıdır.";

                case 8:
                    return "Preslə işləyərkən qoruyucu vasitələrdən istifadə edin və təhlükəsizlik qaydalarına əməl edin.";
            }
        }

        if (language.equals("EN")) {

            switch (number) {

                case 1:
                    return "Stamping is the process of changing the shape of metal using a press and special tools.";

                case 2:
                    return "Cold stamping forms metal without heating the material first.";

                case 3:
                    return "In hot stamping, the metal is heated and then formed in a press.";

                case 4:
                    return "Stamping presses are used to produce metal parts with a specified shape and size.";

                case 5:
                    return "Stamping tools include dies, punches and other special tools.";

                case 6:
                    return "Before work, check the material size, condition and technical requirements.";

                case 7:
                    return "Check the dimensions, shape, surface and quality of the finished part.";

                case 8:
                    return "Use protective equipment and follow safety rules when operating a press.";
            }
        }

        switch (number) {

            case 1:
                return "Штамповка — это процесс изменения формы металла с помощью пресса и специального инструмента.";

            case 2:
                return "Холодная штамповка выполняется без предварительного нагрева металла.";

            case 3:
                return "При горячей штамповке металл нагревают до высокой температуры, после чего формируют на прессе.";

            case 4:
                return "Штамповочные прессы используются для изготовления металлических деталей заданной формы и размера.";

            case 5:
                return "К штамповочному инструменту относятся матрицы, пуансоны и другие специальные инструменты.";

            case 6:
                return "Перед началом работы необходимо проверить размер, состояние материала и соответствие техническим требованиям.";

            case 7:
                return "Проверяйте размеры, форму, поверхность и другие показатели качества готовой детали.";

            case 8:
                return "Используйте средства защиты, не приближайте руки к опасной зоне и соблюдайте правила безопасности при работе на прессе.";
        }

        return "";
    }
}