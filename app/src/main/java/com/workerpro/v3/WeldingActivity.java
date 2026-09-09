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

public class WeldingActivity extends Activity {

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
        title.setText("⚡  " + getWeldingTitle());
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

    private String getWeldingTitle() {

        if (language.equals("AZ")) {
            return "Qaynaq";
        }

        if (language.equals("EN")) {
            return "Welding";
        }

        if (language.equals("TR")) {
            return "Kaynak";
        }

        if (language.equals("DE")) {
            return "Schweißen";
        }

        return "Сварка";
    }

    private String[] getCards() {

        if (language.equals("AZ")) {

            return new String[]{
                    "⚡ Qaynaq növləri",
                    "🔧 Əl ilə qövs qaynağı",
                    "⚙️ Yarımavtomatik qaynaq",
                    "🔥 Arqon qaynağı",
                    "🛠️ Qaynaq avadanlığı",
                    "🔩 Metalın hazırlanması",
                    "❌ Qaynaq qüsurları",
                    "🦺 Qaynaq zamanı təhlükəsizlik"
            };

        } else if (language.equals("EN")) {

            return new String[]{
                    "⚡ Types of Welding",
                    "🔧 Manual Arc Welding",
                    "⚙️ Semi-Automatic Welding",
                    "🔥 TIG Welding",
                    "🛠️ Welding Equipment",
                    "🔩 Metal Preparation",
                    "❌ Welding Defects",
                    "🦺 Welding Safety"
            };

        } else if (language.equals("TR")) {

            return new String[]{
                    "⚡ Kaynak Türleri",
                    "🔧 Manuel Ark Kaynağı",
                    "⚙️ Yarı Otomatik Kaynak",
                    "🔥 TIG Kaynağı",
                    "🛠️ Kaynak Ekipmanları",
                    "🔩 Metal Hazırlama",
                    "❌ Kaynak Hataları",
                    "🦺 Kaynak Güvenliği"
            };

        } else if (language.equals("DE")) {

            return new String[]{
                    "⚡ Schweißarten",
                    "🔧 Lichtbogenhandschweißen",
                    "⚙️ Halbautomatisches Schweißen",
                    "🔥 WIG-Schweißen",
                    "🛠️ Schweißausrüstung",
                    "🔩 Metallvorbereitung",
                    "❌ Schweißfehler",
                    "🦺 Schweißsicherheit"
            };

        } else {

            return new String[]{
                    "⚡ Виды сварки",
                    "🔧 Ручная дуговая сварка",
                    "⚙️ Полуавтоматическая сварка",
                    "🔥 Аргонная сварка",
                    "🛠️ Сварочное оборудование",
                    "🔩 Подготовка металла",
                    "❌ Дефекты сварки",
                    "🦺 Безопасность при сварке"
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
                        "Виды сварки",
                        "Qaynaq növləri",
                        "Types of Welding",
                        "Kaynak Türleri",
                        "Schweißarten"
                },

                {
                        "Ручная дуговая сварка",
                        "Əl ilə qövs qaynağı",
                        "Manual Arc Welding",
                        "Manuel Ark Kaynağı",
                        "Lichtbogenhandschweißen"
                },

                {
                        "Полуавтоматическая сварка",
                        "Yarımavtomatik qaynaq",
                        "Semi-Automatic Welding",
                        "Yarı Otomatik Kaynak",
                        "Halbautomatisches Schweißen"
                },

                {
                        "Аргонная сварка",
                        "Arqon qaynağı",
                        "TIG Welding",
                        "TIG Kaynağı",
                        "WIG-Schweißen"
                },

                {
                        "Сварочное оборудование",
                        "Qaynaq avadanlığı",
                        "Welding Equipment",
                        "Kaynak Ekipmanları",
                        "Schweißausrüstung"
                },

                {
                        "Подготовка металла",
                        "Metalın hazırlanması",
                        "Metal Preparation",
                        "Metal Hazırlama",
                        "Metallvorbereitung"
                },

                {
                        "Дефекты сварки",
                        "Qaynaq qüsurları",
                        "Welding Defects",
                        "Kaynak Hataları",
                        "Schweißfehler"
                },

                {
                        "Безопасность при сварке",
                        "Qaynaq zamanı təhlükəsizlik",
                        "Welding Safety",
                        "Kaynak Güvenliği",
                        "Schweißsicherheit"
                }
        };

        return titles[number][getLanguageIndex()];
    }

    private String getInfoText(int number) {

        String[][] texts = {

                {
                        "Основные виды сварки включают ручную дуговую, полуавтоматическую и аргонодуговую сварку. Выбор метода зависит от материала, толщины и требований к соединению.",

                        "Əsas qaynaq növlərinə əl ilə qövs, yarımavtomatik və arqon-qövs qaynağı daxildir. Metodun seçimi materialdan, qalınlıqdan və birləşməyə olan tələblərdən asılıdır.",

                        "Main welding types include manual arc, semi-automatic and TIG welding. The method depends on the material, thickness and joint requirements.",

                        "Başlıca kaynak türleri manuel ark, yarı otomatik ve TIG kaynağıdır. Yöntem; malzemeye, kalınlığa ve bağlantı gereksinimlerine bağlıdır.",

                        "Zu den wichtigsten Schweißarten gehören Lichtbogenhandschweißen, halbautomatisches Schweißen und WIG-Schweißen. Die Wahl hängt von Material, Dicke und Anforderungen an die Verbindung ab."
                },

                {
                        "При ручной дуговой сварке используется электрическая дуга между электродом и металлом. Оператор должен контролировать ток, положение электрода и качество шва.",

                        "Əl ilə qövs qaynağında elektrod ilə metal arasında elektrik qövsü yaradılır. Operator cərəyanı, elektrodun vəziyyətini və tikişin keyfiyyətini nəzarətdə saxlamalıdır.",

                        "Manual arc welding uses an electric arc between the electrode and the metal. The operator must control the current, electrode position and weld quality.",

                        "Manuel ark kaynağında elektrot ile metal arasında elektrik arkı oluşur. Operatör akımı, elektrot konumunu ve kaynak dikişinin kalitesini kontrol etmelidir.",

                        "Beim Lichtbogenhandschweißen entsteht ein Lichtbogen zwischen Elektrode und Metall. Der Bediener muss Stromstärke, Elektrodenposition und Schweißnahtqualität kontrollieren."
                },

                {
                        "Полуавтоматическая сварка использует непрерывную подачу сварочной проволоки. Перед работой проверьте аппарат, проволоку, газ и соединения.",

                        "Yarımavtomatik qaynaqda qaynaq teli fasiləsiz şəkildə verilir. İşdən əvvəl aparatı, teli, qazı və birləşmələri yoxlayın.",

                        "Semi-automatic welding uses continuous wire feeding. Before work, check the welding machine, wire, gas and connections.",

                        "Yarı otomatik kaynakta kaynak teli sürekli olarak beslenir. Çalışmadan önce makineyi, teli, gazı ve bağlantıları kontrol edin.",

                        "Beim halbautomatischen Schweißen wird der Schweißdraht kontinuierlich zugeführt. Prüfen Sie vor der Arbeit Gerät, Draht, Gas und Anschlüsse."
                },

                {
                        "TIG-сварка использует неплавящийся вольфрамовый электрод и защитный газ, обычно аргон. Метод позволяет получать точные и качественные сварные соединения.",

                        "TIG qaynağında əriməyən volfram elektrodu və qoruyucu qaz, adətən arqon istifadə olunur. Bu üsul dəqiq və keyfiyyətli qaynaq birləşmələri almağa imkan verir.",

                        "TIG welding uses a non-consumable tungsten electrode and shielding gas, usually argon. It provides precise and high-quality welded joints.",

                        "TIG kaynağında erimeyen tungsten elektrot ve genellikle argon olmak üzere koruyucu gaz kullanılır. Bu yöntem hassas ve kaliteli kaynak bağlantıları sağlar.",

                        "Beim WIG-Schweißen wird eine nicht abschmelzende Wolframelektrode und meist Argon als Schutzgas verwendet. Das Verfahren ermöglicht präzise und hochwertige Schweißverbindungen."
                },

                {
                        "Сварочное оборудование включает источник питания, горелку или электрододержатель, кабели, систему подачи газа и другие компоненты. Перед работой проверьте оборудование.",

                        "Qaynaq avadanlığına enerji mənbəyi, məşəl və ya elektrod tutacağı, kabellər, qaz təchizatı sistemi və digər komponentlər daxildir. İşdən əvvəl avadanlığı yoxlayın.",

                        "Welding equipment includes a power source, torch or electrode holder, cables, gas supply system and other components. Check the equipment before work.",

                        "Kaynak ekipmanları güç kaynağı, torç veya elektrot pensesi, kablolar, gaz besleme sistemi ve diğer parçalardan oluşur. Çalışmadan önce ekipmanı kontrol edin.",

                        "Zur Schweißausrüstung gehören Stromquelle, Brenner oder Elektrodenhalter, Kabel, Gasversorgung und weitere Komponenten. Prüfen Sie die Ausrüstung vor der Arbeit."
                },

                {
                        "Перед сваркой очистите металл от грязи, масла, ржавчины и других загрязнений. Правильная подготовка помогает получить качественный сварной шов.",

                        "Qaynaqdan əvvəl metalı çirkdən, yağdan, pasdan və digər çirklərdən təmizləyin. Düzgün hazırlıq keyfiyyətli qaynaq tikişi əldə etməyə kömək edir.",

                        "Before welding, clean the metal from dirt, oil, rust and other contamination. Proper preparation helps produce a quality weld.",

                        "Kaynak öncesinde metali kir, yağ, pas ve diğer kirleticilerden temizleyin. Doğru hazırlık kaliteli bir kaynak dikişi elde etmeye yardımcı olur.",

                        "Reinigen Sie das Metall vor dem Schweißen von Schmutz, Öl, Rost und anderen Verunreinigungen. Eine gute Vorbereitung hilft, eine hochwertige Schweißnaht zu erzeugen."
                },

                {
                        "Распространённые дефекты сварки: поры, трещины, непровар, подрезы и шлаковые включения. Причину дефекта необходимо определить и устранить согласно технологии.",

                        "Yayılmış qaynaq qüsurlarına məsamələr, çatlar, natamam qaynama, altkəsmələr və şlak daxilolmaları daxildir. Qüsurun səbəbi müəyyən edilməli və texnologiyaya uyğun aradan qaldırılmalıdır.",

                        "Common welding defects include porosity, cracks, lack of fusion, undercut and slag inclusions. The cause should be identified and corrected according to the procedure.",

                        "Yaygın kaynak hataları arasında gözeneklilik, çatlaklar, yetersiz ergime, yanma oluğu ve cüruf kalıntıları bulunur. Hatanın nedeni belirlenmeli ve prosedüre göre giderilmelidir.",

                        "Häufige Schweißfehler sind Poren, Risse, Bindefehler, Einbrandkerben und Schlackeneinschlüsse. Die Ursache muss ermittelt und gemäß dem Verfahren behoben werden."
                },

                {
                        "Используйте сварочную маску, защитные перчатки, спецодежду и другую необходимую защиту. Обеспечьте вентиляцию и удалите горючие материалы из рабочей зоны.",

                        "Qaynaq maskası, qoruyucu əlcəklər, xüsusi geyim və digər lazımi mühafizə vasitələrindən istifadə edin. Havalandırmanı təmin edin və yanıcı materialları iş zonasından uzaqlaşdırın.",

                        "Use a welding helmet, protective gloves, protective clothing and other required PPE. Ensure ventilation and remove combustible materials from the work area.",

                        "Kaynak maskesi, koruyucu eldiven, koruyucu giysi ve gerekli diğer KKD'leri kullanın. Havalandırmayı sağlayın ve yanıcı malzemeleri çalışma alanından uzaklaştırın.",

                        "Verwenden Sie einen Schweißhelm, Schutzhandschuhe, Schutzkleidung und die erforderliche persönliche Schutzausrüstung. Sorgen Sie für ausreichende Belüftung und entfernen Sie brennbare Materialien aus dem Arbeitsbereich."
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