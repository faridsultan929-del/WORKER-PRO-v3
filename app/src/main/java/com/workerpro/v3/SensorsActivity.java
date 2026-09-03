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

public class SensorsActivity extends Activity {

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

        showSensors();
    }

    void showSensors() {

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
        addBox(root, 9);

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
            return "Sensorlar";
        }

        if (language.equals("EN")) {
            return "Sensors";
        }

        return "Датчики";
    }

    String getBoxTitle(int number) {

        if (language.equals("AZ")) {

            switch (number) {

                case 1:
                    return "Elektron sensorlar";

                case 2:
                    return "Maqnit sensorlar";

                case 3:
                    return "Temperatur sensorları";

                case 4:
                    return "Mövqe sensorları";

                case 5:
                    return "Hidravlik sensorlar";

                case 6:
                    return "Təzyiq sensorları";

                case 7:
                    return "Sensorların yoxlanılması";

                case 8:
                    return "Sensor nasazlıqları";

                case 9:
                    return "Təhlükəsizlik";
            }
        }

        if (language.equals("EN")) {

            switch (number) {

                case 1:
                    return "Electronic Sensors";

                case 2:
                    return "Magnetic Sensors";

                case 3:
                    return "Temperature Sensors";

                case 4:
                    return "Position Sensors";

                case 5:
                    return "Hydraulic Sensors";

                case 6:
                    return "Pressure Sensors";

                case 7:
                    return "Sensor Testing";

                case 8:
                    return "Sensor Failures";

                case 9:
                    return "Safety";
            }
        }

        switch (number) {

            case 1:
                return "Электронные датчики";

            case 2:
                return "Магнитные датчики";

            case 3:
                return "Датчики температуры";

            case 4:
                return "Датчики положения";

            case 5:
                return "Гидравлические датчики";

            case 6:
                return "Датчики давления";

            case 7:
                return "Проверка датчиков";

            case 8:
                return "Неисправности датчиков";

            case 9:
                return "Безопасность";
        }

        return "";
    }

    String getBoxText(int number) {

        if (language.equals("AZ")) {

            switch (number) {

                case 1:
                    return "Elektron sensorlar temperaturanı, təzyiqi, mövqeni və digər parametrləri elektrik siqnalına çevirərək idarəetmə sisteminə məlumat göndərir.";

                case 2:
                    return "Maqnit sensorlar maqnit sahəsindəki dəyişiklikləri aşkar edir və avadanlığın mövqeyini və ya hərəkətini müəyyən etmək üçün istifadə oluna bilər.";

                case 3:
                    return "Temperatur sensorları metalın, yağın, suyun və digər mühitlərin temperaturunu ölçmək üçün istifadə olunur.";

                case 4:
                    return "Mövqe sensorları mexanizmin müəyyən vəziyyətdə olub-olmadığını və hərəkət sərhədlərini müəyyən etməyə kömək edir.";

                case 5:
                    return "Hidravlik sensorlar hidravlik sistemlərdə təzyiq, mövqe və digər parametrlərə nəzarət etmək üçün istifadə olunur. Şlanqların və birləşmələrin vəziyyəti də yoxlanılmalıdır.";

                case 6:
                    return "Təzyiq sensorları hidravlik və pnevmatik sistemlərdə təzyiqi ölçür və idarəetmə sisteminə siqnal göndərir.";

                case 7:
                    return "Sensoru yoxlamazdan əvvəl avadanlığı təhlükəsiz vəziyyətə gətirin. Naqilləri, birləşmələri və sensorun göstəricilərini yoxlayın.";

                case 8:
                    return "Sensorun nasazlığı yanlış siqnal, qeyri-sabit iş və ya avadanlığın dayanmasına səbəb ola bilər. Nasazlıq zamanı texniki xidmətə məlumat verin.";

                case 9:
                    return "Sensorlarla işləyərkən elektrik və hidravlik təhlükəsizlik qaydalarına əməl edin. Təzyiq altında olan sistemi icazəsiz açmayın.";
            }
        }

        if (language.equals("EN")) {

            switch (number) {

                case 1:
                    return "Electronic sensors measure temperature, pressure, position and other parameters and send electrical signals to the control system.";

                case 2:
                    return "Magnetic sensors detect changes in a magnetic field and can be used to detect equipment position or movement.";

                case 3:
                    return "Temperature sensors are used to measure the temperature of metal, oil, water and other media.";

                case 4:
                    return "Position sensors help determine the position of a mechanism and its movement limits.";

                case 5:
                    return "Hydraulic sensors are used to monitor pressure, position and other parameters in hydraulic systems. Check hoses and connections as well.";

                case 6:
                    return "Pressure sensors measure pressure in hydraulic and pneumatic systems and send a signal to the control system.";

                case 7:
                    return "Before testing a sensor, put the equipment in a safe condition. Check wires, connections and sensor readings.";

                case 8:
                    return "A sensor failure can cause an incorrect signal, unstable operation or equipment shutdown. Report faults to maintenance.";

                case 9:
                    return "Follow electrical and hydraulic safety rules when working with sensors. Do not open a pressurized system without authorization.";
            }
        }

        switch (number) {

            case 1:
                return "Электронные датчики измеряют температуру, давление, положение и другие параметры и передают электрический сигнал в систему управления.";

            case 2:
                return "Магнитные датчики обнаруживают изменения магнитного поля и могут использоваться для определения положения или движения оборудования.";

            case 3:
                return "Датчики температуры используются для измерения температуры металла, масла, воды и других сред.";

            case 4:
                return "Датчики положения помогают определить положение механизма и пределы его перемещения.";

            case 5:
                return "Гидравлические датчики используются для контроля давления, положения и других параметров гидравлической системы. Также проверяйте шланги и соединения.";

            case 6:
                return "Датчики давления измеряют давление в гидравлических и пневматических системах и передают сигнал в систему управления.";

            case 7:
                return "Перед проверкой датчика переведите оборудование в безопасное состояние. Проверьте провода, соединения и показания датчика.";

            case 8:
                return "Неисправность датчика может вызвать неправильный сигнал, нестабильную работу или остановку оборудования. О неисправности сообщите техническому обслуживанию.";

            case 9:
                return "При работе с датчиками соблюдайте правила электрической и гидравлической безопасности. Не открывайте систему под давлением без разрешения.";
        }

        return "";
    }
}