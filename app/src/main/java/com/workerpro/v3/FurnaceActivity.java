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

        showFurnaces();
    }

    void showFurnaces() {

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
            return "Sobalar və qızdırma";
        }

        if (language.equals("EN")) {
            return "Furnaces & Heating";
        }

        return "Печи и нагрев";
    }

    String getBoxTitle(int number) {

        if (language.equals("AZ")) {

            switch (number) {

                case 1:
                    return "İnduksiya sobaları";

                case 2:
                    return "Metalın qızdırılması";

                case 3:
                    return "Temperatur nəzarəti";

                case 4:
                    return "Soba quruluşu";

                case 5:
                    return "Materialın hazırlanması";

                case 6:
                    return "İş prosesinə nəzarət";

                case 7:
                    return "Əsas təhlükələr";

                case 8:
                    return "Təhlükəsizlik qaydaları";
            }
        }

        if (language.equals("EN")) {

            switch (number) {

                case 1:
                    return "Induction Furnaces";

                case 2:
                    return "Metal Heating";

                case 3:
                    return "Temperature Control";

                case 4:
                    return "Furnace Structure";

                case 5:
                    return "Material Preparation";

                case 6:
                    return "Process Control";

                case 7:
                    return "Main Hazards";

                case 8:
                    return "Safety Rules";
            }
        }

        switch (number) {

            case 1:
                return "Индукционные печи";

            case 2:
                return "Нагрев металла";

            case 3:
                return "Контроль температуры";

            case 4:
                return "Устройство печи";

            case 5:
                return "Подготовка материала";

            case 6:
                return "Контроль процесса";

            case 7:
                return "Основные опасности";

            case 8:
                return "Правила безопасности";
        }

        return "";
    }

    String getBoxText(int number) {

        if (language.equals("AZ")) {

            switch (number) {

                case 1:
                    return "İnduksiya sobasında metal elektromaqnit sahəsinin köməyi ilə qızdırılır. Proses zamanı temperatur və avadanlığın vəziyyəti nəzarətdə saxlanılır.";

                case 2:
                    return "Metal lazımi texnoloji temperatur qədər qızdırılır. Qızdırma sürəti və temperatur rejimi texnoloji tələblərə uyğun olmalıdır.";

                case 3:
                    return "Temperatur sensorlar və ölçmə cihazları ilə nəzarət edilir. Temperatur göstəricilərinin düzgünlüyü proses üçün vacibdir.";

                case 4:
                    return "Soba əsasən istilik sistemi, induksiya qurğusu, idarəetmə sistemi, temperatur sensorları və qoruyucu elementlərdən ibarət olur.";

                case 5:
                    return "Soba yüklənməzdən əvvəl materialın ölçüsü, vəziyyəti və texniki tələblərə uyğunluğu yoxlanılmalıdır.";

                case 6:
                    return "İşçi qızdırma prosesini, temperaturu, avadanlığın göstəricilərini və qeyri-normal vəziyyətləri daim nəzarətdə saxlamalıdır.";

                case 7:
                    return "Yüksək temperatur, isti metal, elektrik enerjisi, elektromaqnit sahəsi və ərimiş metal əsas təhlükələrdən ola bilər.";

                case 8:
                    return "Qoruyucu vasitələrdən istifadə edin, təhlükəli zonaya yaxınlaşmayın və soba ilə işləyərkən müəssisənin təhlükəsizlik qaydalarına əməl edin.";
            }
        }

        if (language.equals("EN")) {

            switch (number) {

                case 1:
                    return "An induction furnace heats metal using an electromagnetic field. Temperature and equipment condition must be monitored.";

                case 2:
                    return "Metal is heated to the required process temperature. Heating speed and temperature must follow technical requirements.";

                case 3:
                    return "Temperature is controlled using sensors and measuring instruments. Accurate temperature control is important for the process.";

                case 4:
                    return "A furnace can include a heating system, induction unit, control system, temperature sensors and protective components.";

                case 5:
                    return "Before loading the furnace, check the material size, condition and compliance with technical requirements.";

                case 6:
                    return "The worker must monitor the heating process, temperature, equipment readings and abnormal conditions.";

                case 7:
                    return "High temperature, hot metal, electricity, electromagnetic fields and molten metal can be major hazards.";

                case 8:
                    return "Use protective equipment, stay away from dangerous areas and follow workplace safety rules when operating a furnace.";
            }
        }

        switch (number) {

            case 1:
                return "В индукционной печи металл нагревается с помощью электромагнитного поля. Необходимо контролировать температуру и состояние оборудования.";

            case 2:
                return "Металл нагревают до необходимой технологической температуры. Скорость нагрева и температурный режим должны соответствовать требованиям процесса.";

            case 3:
                return "Температура контролируется с помощью датчиков и измерительных приборов. Точность температуры важна для правильного процесса.";

            case 4:
                return "Печь может состоять из нагревательной системы, индукционной установки, системы управления, датчиков температуры и защитных элементов.";

            case 5:
                return "Перед загрузкой печи необходимо проверить размер, состояние материала и его соответствие техническим требованиям.";

            case 6:
                return "Рабочий должен контролировать процесс нагрева, температуру, показания оборудования и возможные неисправности.";

            case 7:
                return "Высокая температура, горячий металл, электричество, электромагнитное поле и расплавленный металл могут быть основными опасностями.";

            case 8:
                return "Используйте средства защиты, не приближайтесь к опасной зоне и соблюдайте правила безопасности при работе с печью.";
        }

        return "";
    }
}