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

        if (language.equals("TR")) {
            return "Fırınlar ve Isıtma";
        }

        if (language.equals("DE")) {
            return "Öfen und Erwärmung";
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

        } else if (language.equals("TR")) {

            return new String[]{
                    "🔥 İndüksiyon Fırınları",
                    "🌡️ Metal Isıtma",
                    "🌡️ Sıcaklık Kontrolü",
                    "⚙️ Fırın Yapısı",
                    "🔩 Malzeme Hazırlama",
                    "📋 Proses Kontrolü",
                    "⚠️ Başlıca Tehlikeler",
                    "🦺 Güvenlik Kuralları"
            };

        } else if (language.equals("DE")) {

            return new String[]{
                    "🔥 Induktionsöfen",
                    "🌡️ Metallerwärmung",
                    "🌡️ Temperaturkontrolle",
                    "⚙️ Ofenaufbau",
                    "🔩 Materialvorbereitung",
                    "📋 Prozesskontrolle",
                    "⚠️ Hauptgefahren",
                    "🦺 Sicherheitsregeln"
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
                        "Индукционные печи",
                        "İnduksiya sobaları",
                        "Induction Furnaces",
                        "İndüksiyon Fırınları",
                        "Induktionsöfen"
                },

                {
                        "Нагрев металла",
                        "Metalın qızdırılması",
                        "Metal Heating",
                        "Metal Isıtma",
                        "Metallerwärmung"
                },

                {
                        "Контроль температуры",
                        "Temperatur nəzarəti",
                        "Temperature Control",
                        "Sıcaklık Kontrolü",
                        "Temperaturkontrolle"
                },

                {
                        "Устройство печи",
                        "Soba quruluşu",
                        "Furnace Structure",
                        "Fırın Yapısı",
                        "Ofenaufbau"
                },

                {
                        "Подготовка материала",
                        "Materialın hazırlanması",
                        "Material Preparation",
                        "Malzeme Hazırlama",
                        "Materialvorbereitung"
                },

                {
                        "Контроль процесса",
                        "Prosesə nəzarət",
                        "Process Control",
                        "Proses Kontrolü",
                        "Prozesskontrolle"
                },

                {
                        "Основные опасности",
                        "Əsas təhlükələr",
                        "Main Hazards",
                        "Başlıca Tehlikeler",
                        "Hauptgefahren"
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
                        "Индукционная печь нагревает металл с помощью электромагнитного поля. Оператор должен контролировать оборудование, температуру и состояние системы.",

                        "İnduksiya sobası elektromaqnit sahəsindən istifadə edərək metalı qızdırır. Operator avadanlığa, temperatura və sistemin vəziyyətinə nəzarət etməlidir.",

                        "An induction furnace heats metal using an electromagnetic field. The operator must monitor the equipment, temperature and system condition.",

                        "İndüksiyon fırını, elektromanyetik alan kullanarak metali ısıtır. Operatör ekipmanı, sıcaklığı ve sistemin durumunu kontrol etmelidir.",

                        "Ein Induktionsofen erwärmt Metall mithilfe eines elektromagnetischen Feldes. Der Bediener muss Anlage, Temperatur und Systemzustand überwachen."
                },

                {
                        "При нагреве металл достигает высокой температуры. Используйте подходящие СИЗ и соблюдайте безопасную дистанцию от горячего металла.",

                        "Qızdırma zamanı metal yüksək temperatura çatır. Uyğun fərdi mühafizə vasitələrindən istifadə edin və isti metaldan təhlükəsiz məsafə saxlayın.",

                        "During heating, metal reaches a high temperature. Use appropriate PPE and keep a safe distance from hot metal.",

                        "Isıtma sırasında metal yüksek sıcaklığa ulaşır. Uygun KKD kullanın ve sıcak metalden güvenli bir mesafede durun.",

                        "Beim Erwärmen erreicht das Metall eine hohe Temperatur. Verwenden Sie geeignete PSA und halten Sie einen sicheren Abstand zum heißen Metall ein."
                },

                {
                        "Температуру необходимо контролировать по показаниям датчиков и приборов. При отклонении параметров остановите процесс согласно инструкции.",

                        "Temperatur sensorların və cihazların göstəricilərinə əsasən nəzarətdə saxlanılmalıdır. Parametrlər normadan kənara çıxarsa, təlimata uyğun olaraq prosesi dayandırın.",

                        "Temperature must be monitored using sensors and instruments. If parameters become abnormal, stop the process according to the instructions.",

                        "Sıcaklık, sensörler ve ölçüm cihazları kullanılarak kontrol edilmelidir. Parametreler normalden saparsa işlemi talimatlara göre durdurun.",

                        "Die Temperatur muss anhand von Sensoren und Messgeräten überwacht werden. Bei Abweichungen der Parameter muss der Prozess gemäß den Anweisungen gestoppt werden."
                },

                {
                        "Основные элементы печи включают нагревательную систему, футеровку, датчики, систему управления и защитные устройства.",

                        "Soba əsasən qızdırma sistemi, futerovka, sensorlar, idarəetmə sistemi və qoruyucu qurğulardan ibarətdir.",

                        "The main furnace components include the heating system, lining, sensors, control system and safety devices.",

                        "Fırının ana bileşenleri ısıtma sistemi, astar, sensörler, kontrol sistemi ve güvenlik cihazlarını içerir.",

                        "Zu den Hauptkomponenten des Ofens gehören Heizsystem, Auskleidung, Sensoren, Steuerungssystem und Schutzeinrichtungen."
                },

                {
                        "Перед загрузкой материала проверьте его состояние, размер и соответствие технологическому заданию. Не загружайте неподходящий материал.",

                        "Materialı sobaya yerləşdirməzdən əvvəl onun vəziyyətini, ölçüsünü və texnoloji tapşırığa uyğunluğunu yoxlayın. Uyğun olmayan materialı yükləməyin.",

                        "Before loading material, check its condition, size and compliance with the process requirements. Do not load unsuitable material.",

                        "Malzemeyi fırına yüklemeden önce durumunu, ölçüsünü ve proses gerekliliklerine uygunluğunu kontrol edin. Uygun olmayan malzemeyi yüklemeyin.",

                        "Prüfen Sie vor dem Beladen des Ofens Zustand, Größe und Übereinstimmung des Materials mit den Prozessanforderungen. Laden Sie kein ungeeignetes Material ein."
                },

                {
                        "Контролируйте температуру, время нагрева и другие параметры процесса. Все отклонения необходимо своевременно выявлять и сообщать ответственному специалисту.",

                        "Temperaturu, qızdırma müddətini və prosesin digər parametrlərini nəzarətdə saxlayın. Bütün kənarlaşmalar vaxtında aşkar edilməli və məsul şəxsə bildirilməlidir.",

                        "Monitor temperature, heating time and other process parameters. Any deviations must be identified promptly and reported to the responsible person.",

                        "Sıcaklığı, ısıtma süresini ve diğer proses parametrelerini takip edin. Tüm sapmalar zamanında tespit edilmeli ve sorumlu kişiye bildirilmelidir.",

                        "Überwachen Sie Temperatur, Erwärmungszeit und andere Prozessparameter. Abweichungen müssen rechtzeitig erkannt und der zuständigen Person gemeldet werden."
                },

                {
                        "Основные опасности: высокая температура, горячий металл, электрическая энергия, электромагнитное поле и возможные выбросы горячего материала.",

                        "Əsas təhlükələr: yüksək temperatur, isti metal, elektrik enerjisi, elektromaqnit sahəsi və isti materialın mümkün sıçramalarıdır.",

                        "Main hazards include high temperature, hot metal, electrical energy, electromagnetic fields and possible hot material splashes.",

                        "Başlıca tehlikeler yüksek sıcaklık, sıcak metal, elektrik enerjisi, elektromanyetik alanlar ve sıcak malzeme sıçramalarıdır.",

                        "Zu den Hauptgefahren gehören hohe Temperaturen, heißes Metall, elektrische Energie, elektromagnetische Felder und mögliche Spritzer heißen Materials."
                },

                {
                        "Используйте необходимые СИЗ, не приближайтесь к опасной зоне без разрешения и не работайте с неисправной печью. Перед обслуживанием отключите энергию согласно процедуре.",

                        "Lazımi fərdi mühafizə vasitələrindən istifadə edin, icazəsiz təhlükəli zonaya yaxınlaşmayın və nasaz soba ilə işləməyin. Texniki xidmətdən əvvəl prosedura uyğun olaraq enerjini ayırın.",

                        "Use the required PPE, do not enter the danger zone without authorization and do not operate a faulty furnace. Isolate the energy according to the procedure before maintenance.",

                        "Gerekli KKD'leri kullanın, izin olmadan tehlikeli bölgeye yaklaşmayın ve arızalı fırını çalıştırmayın. Bakımdan önce prosedüre uygun olarak enerjiyi izole edin.",

                        "Verwenden Sie die erforderliche PSA, betreten Sie den Gefahrenbereich nicht ohne Genehmigung und betreiben Sie keinen defekten Ofen. Vor Wartungsarbeiten muss die Energie gemäß dem Verfahren abgeschaltet und gesichert werden."
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