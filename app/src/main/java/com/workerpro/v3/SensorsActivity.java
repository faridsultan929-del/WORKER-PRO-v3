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
        title.setText("📡  " + getSensorsTitle());
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

    private String getSensorsTitle() {

        if (language.equals("AZ")) {
            return "Sensorlar";
        }

        if (language.equals("EN")) {
            return "Sensors";
        }

        if (language.equals("TR")) {
            return "Sensörler";
        }

        if (language.equals("DE")) {
            return "Sensoren";
        }

        return "Датчики";
    }

    private String[] getCards() {

        if (language.equals("AZ")) {

            return new String[]{
                    "🔌 Elektron sensorlar",
                    "🧲 Maqnit sensorlar",
                    "🌡️ Temperatur sensorları",
                    "📍 Mövqe sensorları",
                    "💧 Hidravlik sensorlar",
                    "💨 Təzyiq sensorları",
                    "🔍 Sensorların yoxlanılması",
                    "⚠️ Sensor nasazlıqları",
                    "🦺 Təhlükəsizlik"
            };

        } else if (language.equals("EN")) {

            return new String[]{
                    "🔌 Electronic Sensors",
                    "🧲 Magnetic Sensors",
                    "🌡️ Temperature Sensors",
                    "📍 Position Sensors",
                    "💧 Hydraulic Sensors",
                    "💨 Pressure Sensors",
                    "🔍 Sensor Testing",
                    "⚠️ Sensor Failures",
                    "🦺 Safety"
            };

        } else if (language.equals("TR")) {

            return new String[]{
                    "🔌 Elektronik Sensörler",
                    "🧲 Manyetik Sensörler",
                    "🌡️ Sıcaklık Sensörleri",
                    "📍 Konum Sensörleri",
                    "💧 Hidrolik Sensörler",
                    "💨 Basınç Sensörleri",
                    "🔍 Sensör Kontrolü",
                    "⚠️ Sensör Arızaları",
                    "🦺 Güvenlik"
            };

        } else if (language.equals("DE")) {

            return new String[]{
                    "🔌 Elektronische Sensoren",
                    "🧲 Magnetsensoren",
                    "🌡️ Temperatursensoren",
                    "📍 Positionssensoren",
                    "💧 Hydrauliksensoren",
                    "💨 Drucksensoren",
                    "🔍 Sensorprüfung",
                    "⚠️ Sensorfehler",
                    "🦺 Sicherheit"
            };

        } else {

            return new String[]{
                    "🔌 Электронные датчики",
                    "🧲 Магнитные датчики",
                    "🌡️ Датчики температуры",
                    "📍 Датчики положения",
                    "💧 Гидравлические датчики",
                    "💨 Датчики давления",
                    "🔍 Проверка датчиков",
                    "⚠️ Неисправности датчиков",
                    "🦺 Безопасность"
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
                        "Электронные датчики",
                        "Elektron sensorlar",
                        "Electronic Sensors",
                        "Elektronik Sensörler",
                        "Elektronische Sensoren"
                },

                {
                        "Магнитные датчики",
                        "Maqnit sensorlar",
                        "Magnetic Sensors",
                        "Manyetik Sensörler",
                        "Magnetsensoren"
                },

                {
                        "Датчики температуры",
                        "Temperatur sensorları",
                        "Temperature Sensors",
                        "Sıcaklık Sensörleri",
                        "Temperatursensoren"
                },

                {
                        "Датчики положения",
                        "Mövqe sensorları",
                        "Position Sensors",
                        "Konum Sensörleri",
                        "Positionssensoren"
                },

                {
                        "Гидравлические датчики",
                        "Hidravlik sensorlar",
                        "Hydraulic Sensors",
                        "Hidrolik Sensörler",
                        "Hydrauliksensoren"
                },

                {
                        "Датчики давления",
                        "Təzyiq sensorları",
                        "Pressure Sensors",
                        "Basınç Sensörleri",
                        "Drucksensoren"
                },

                {
                        "Проверка датчиков",
                        "Sensorların yoxlanılması",
                        "Sensor Testing",
                        "Sensör Kontrolü",
                        "Sensorprüfung"
                },

                {
                        "Неисправности датчиков",
                        "Sensor nasazlıqları",
                        "Sensor Failures",
                        "Sensör Arızaları",
                        "Sensorfehler"
                },

                {
                        "Безопасность",
                        "Təhlükəsizlik",
                        "Safety",
                        "Güvenlik",
                        "Sicherheit"
                }
        };

        return titles[number][getLanguageIndex()];
    }

    private String getInfoText(int number) {

        String[][] texts = {

                {
                        "Электронные датчики преобразуют физические параметры в электрический сигнал. Они применяются для контроля температуры, положения, давления и других параметров оборудования.",

                        "Elektron sensorlar fiziki parametrləri elektrik siqnalına çevirir. Onlar temperatur, mövqe, təzyiq və avadanlığın digər parametrlərinə nəzarət etmək üçün istifadə olunur.",

                        "Electronic sensors convert physical parameters into electrical signals. They are used to monitor temperature, position, pressure and other equipment parameters.",

                        "Elektronik sensörler fiziksel parametreleri elektrik sinyaline dönüştürür. Sıcaklık, konum, basınç ve diğer ekipman parametrelerini izlemek için kullanılır.",

                        "Elektronische Sensoren wandeln physikalische Größen in elektrische Signale um. Sie werden zur Überwachung von Temperatur, Position, Druck und anderen Anlagenparametern eingesetzt."
                },

                {
                        "Магнитные датчики используют магнитное поле для определения положения, движения или наличия металлического объекта. Они широко применяются в автоматизации.",

                        "Maqnit sensorlar mövqeyi, hərəkəti və ya metal obyektin mövcudluğunu müəyyən etmək üçün maqnit sahəsindən istifadə edir. Onlar avtomatlaşdırmada geniş tətbiq olunur.",

                        "Magnetic sensors use a magnetic field to detect position, movement or the presence of a metal object. They are widely used in automation.",

                        "Manyetik sensörler konumu, hareketi veya metal bir nesnenin varlığını algılamak için manyetik alan kullanır. Otomasyonda yaygın olarak kullanılır.",

                        "Magnetsensoren verwenden ein Magnetfeld, um Position, Bewegung oder das Vorhandensein eines Metallobjekts zu erkennen. Sie werden häufig in der Automatisierung eingesetzt."
                },

                {
                        "Датчики температуры измеряют температуру оборудования, металла или рабочей среды. Показания датчика необходимо регулярно контролировать.",

                        "Temperatur sensorları avadanlığın, metalın və ya iş mühitinin temperaturunu ölçür. Sensor göstəriciləri müntəzəm olaraq yoxlanılmalıdır.",

                        "Temperature sensors measure the temperature of equipment, metal or the working environment. Sensor readings should be monitored regularly.",

                        "Sıcaklık sensörleri ekipmanın, metalin veya çalışma ortamının sıcaklığını ölçer. Sensör değerleri düzenli olarak kontrol edilmelidir.",

                        "Temperatursensoren messen die Temperatur von Anlagen, Metall oder der Arbeitsumgebung. Die Messwerte sollten regelmäßig kontrolliert werden."
                },

                {
                        "Датчики положения определяют положение или перемещение деталей механизма. Они помогают системе управления контролировать правильность движения оборудования.",

                        "Mövqe sensorları mexanizmin hissələrinin vəziyyətini və ya hərəkətini müəyyən edir. Onlar idarəetmə sisteminə avadanlığın hərəkətini düzgün izləməyə kömək edir.",

                        "Position sensors detect the position or movement of machine components. They help the control system monitor equipment movement.",

                        "Konum sensörleri makine parçalarının konumunu veya hareketini algılar. Kontrol sisteminin ekipman hareketini izlemesine yardımcı olur.",

                        "Positionssensoren erkennen die Position oder Bewegung von Maschinenteilen. Sie helfen der Steuerung, die Bewegung der Anlage zu überwachen."
                },

                {
                        "Гидравлические датчики используются для контроля давления, положения и других параметров гидравлической системы. Также проверяйте шланги и соединения.",

                        "Hidravlik sensorlar hidravlik sistemlərdə təzyiq, mövqe və digər parametrlərə nəzarət etmək üçün istifadə olunur. Şlanqların və birləşmələrin vəziyyəti də yoxlanılmalıdır.",

                        "Hydraulic sensors are used to monitor pressure, position and other parameters in hydraulic systems. Check hoses and connections as well.",

                        "Hidrolik sensörler hidrolik sistemlerde basınç, konum ve diğer parametreleri izlemek için kullanılır. Hortumları ve bağlantıları da kontrol edin.",

                        "Hydrauliksensoren überwachen Druck, Position und andere Parameter in Hydrauliksystemen. Prüfen Sie auch Schläuche und Verbindungen."
                },

                {
                        "Датчики давления измеряют давление в гидравлических, пневматических и других системах. При необычных показаниях необходимо проверить систему согласно инструкции.",

                        "Təzyiq sensorları hidravlik, pnevmatik və digər sistemlərdə təzyiqi ölçür. Qeyri-adi göstəricilər olduqda sistemi təlimata uyğun yoxlamaq lazımdır.",

                        "Pressure sensors measure pressure in hydraulic, pneumatic and other systems. If readings are abnormal, check the system according to the instructions.",

                        "Basınç sensörleri hidrolik, pnömatik ve diğer sistemlerde basıncı ölçer. Değerler normal değilse sistemi talimatlara göre kontrol edin.",

                        "Drucksensoren messen den Druck in hydraulischen, pneumatischen und anderen Systemen. Bei ungewöhnlichen Messwerten muss die Anlage gemäß Anleitung überprüft werden."
                },

                {
                        "При проверке датчика осмотрите его корпус, кабель, разъём и крепление. Сравните показания с нормальными значениями.",

                        "Sensoru yoxlayarkən korpusu, kabeli, konnektoru və bərkidilməsini yoxlayın. Göstəriciləri normal qiymətlərlə müqayisə edin.",

                        "When testing a sensor, inspect its housing, cable, connector and mounting. Compare the readings with normal values.",

                        "Sensörü kontrol ederken gövdesini, kablosunu, bağlantısını ve montajını inceleyin. Değerleri normal değerlerle karşılaştırın.",

                        "Bei der Sensorprüfung Gehäuse, Kabel, Stecker und Befestigung kontrollieren. Vergleichen Sie die Messwerte mit den normalen Werten."
                },

                {
                        "Неисправность датчика может привести к неправильной работе оборудования. Возможные причины: повреждение кабеля, плохой контакт, загрязнение или отказ самого датчика.",

                        "Sensorun nasazlığı avadanlığın düzgün işləməməsinə səbəb ola bilər. Mümkün səbəblər: kabelin zədələnməsi, zəif kontakt, çirklənmə və ya sensorun özünün sıradan çıxması.",

                        "A sensor failure can cause incorrect equipment operation. Possible causes include cable damage, poor contact, contamination or sensor failure.",

                        "Sensör arızası ekipmanın yanlış çalışmasına neden olabilir. Olası nedenler arasında kablo hasarı, kötü bağlantı, kirlenme veya sensörün arızalanması bulunur.",

                        "Ein Sensorfehler kann zu einer fehlerhaften Funktion der Anlage führen. Mögliche Ursachen sind Kabelschäden, schlechter Kontakt, Verschmutzung oder ein Sensordefekt."
                },

                {
                        "Перед проверкой или заменой датчика соблюдайте правила безопасности. При необходимости отключите энергию и выполняйте работу только в соответствии с инструкцией.",

                        "Sensoru yoxlamadan və ya dəyişdirmədən əvvəl təhlükəsizlik qaydalarına əməl edin. Lazım olduqda enerjini ayırın və işi yalnız təlimata uyğun yerinə yetirin.",

                        "Before checking or replacing a sensor, follow safety rules. Isolate the energy when required and perform the work according to the instructions.",

                        "Sensörü kontrol etmeden veya değiştirmeden önce güvenlik kurallarına uyun. Gerektiğinde enerjiyi izole edin ve çalışmayı talimatlara uygun yapın.",

                        "Vor der Prüfung oder dem Austausch eines Sensors die Sicherheitsregeln beachten. Falls erforderlich, die Energieversorgung sicher trennen und nur gemäß Anleitung arbeiten."
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