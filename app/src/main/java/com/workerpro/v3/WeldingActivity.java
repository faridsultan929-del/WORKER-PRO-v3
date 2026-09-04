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
                        "Types of Welding"
                },

                {
                        "Ручная дуговая сварка",
                        "Əl ilə qövs qaynağı",
                        "Manual Arc Welding"
                },

                {
                        "Полуавтоматическая сварка",
                        "Yarımavtomatik qaynaq",
                        "Semi-Automatic Welding"
                },

                {
                        "Аргонная сварка",
                        "Arqon qaynağı",
                        "TIG Welding"
                },

                {
                        "Сварочное оборудование",
                        "Qaynaq avadanlığı",
                        "Welding Equipment"
                },

                {
                        "Подготовка металла",
                        "Metalın hazırlanması",
                        "Metal Preparation"
                },

                {
                        "Дефекты сварки",
                        "Qaynaq qüsurları",
                        "Welding Defects"
                },

                {
                        "Безопасность при сварке",
                        "Qaynaq zamanı təhlükəsizlik",
                        "Welding Safety"
                }
        };

        return titles[number][getLanguageIndex()];
    }

    private String getInfoText(int number) {

        String[][] texts = {

                {
                        "Основные виды сварки включают ручную дуговую, полуавтоматическую и аргонодуговую сварку. Выбор метода зависит от материала, толщины и требований к соединению.",

                        "Əsas qaynaq növlərinə əl ilə qövs, yarımavtomatik və arqon-qövs qaynağı daxildir. Metodun seçimi materialdan, qalınlıqdan və birləşməyə olan tələblərdən asılıdır.",

                        "Main welding types include manual arc, semi-automatic and TIG welding. The method depends on the material, thickness and joint requirements."
                },

                {
                        "При ручной дуговой сварке используется электрическая дуга между электродом и металлом. Оператор должен контролировать ток, положение электрода и качество шва.",

                        "Əl ilə qövs qaynağında elektrod ilə metal arasında elektrik qövsü yaradılır. Operator cərəyanı, elektrodun vəziyyətini və tikişin keyfiyyətini nəzarətdə saxlamalıdır.",

                        "Manual arc welding uses an electric arc between the electrode and the metal. The operator must control the current, electrode position and weld quality."
                },

                {
                        "Полуавтоматическая сварка использует непрерывную подачу сварочной проволоки. Перед работой проверьте аппарат, проволоку, газ и соединения.",

                        "Yarımavtomatik qaynaqda qaynaq teli fasiləsiz şəkildə verilir. İşdən əvvəl aparatı, teli, qazı və birləşmələri yoxlayın.",

                        "Semi-automatic welding uses continuous wire feeding. Before work, check the welding machine, wire, gas and connections."
                },

                {
                        "TIG-сварка использует неплавящийся вольфрамовый электрод и защитный газ, обычно аргон. Метод позволяет получать точные и качественные сварные соединения.",

                        "TIG qaynağında əriməyən volfram elektrodu və qoruyucu qaz, adətən arqon istifadə olunur. Bu üsul dəqiq və keyfiyyətli qaynaq birləşmələri almağa imkan verir.",

                        "TIG welding uses a non-consumable tungsten electrode and shielding gas, usually argon. It provides precise and high-quality welded joints."
                },

                {
                        "Сварочное оборудование включает источник питания, горелку или электрододержатель, кабели, систему подачи газа и другие компоненты. Перед работой проверьте оборудование.",

                        "Qaynaq avadanlığına enerji mənbəyi, məşəl və ya elektrod tutacağı, kabellər, qaz təchizatı sistemi və digər komponentlər daxildir. İşdən əvvəl avadanlığı yoxlayın.",

                        "Welding equipment includes a power source, torch or electrode holder, cables, gas supply system and other components. Check the equipment before work."
                },

                {
                        "Перед сваркой очистите металл от грязи, масла, ржавчины и других загрязнений. Правильная подготовка помогает получить качественный сварной шов.",

                        "Qaynaqdan əvvəl metalı çirkdən, yağdan, pasdan və digər çirklərdən təmizləyin. Düzgün hazırlıq keyfiyyətli qaynaq tikişi əldə etməyə kömək edir.",

                        "Before welding, clean the metal from dirt, oil, rust and other contamination. Proper preparation helps produce a quality weld."
                },

                {
                        "Распространённые дефекты сварки: поры, трещины, непровар, подрезы и шлаковые включения. Причину дефекта необходимо определить и устранить согласно технологии.",

                        "Yayılmış qaynaq qüsurlarına məsamələr, çatlar, natamam qaynama, altkəsmələr və şlak daxilolmaları daxildir. Qüsurun səbəbi müəyyən edilməli və texnologiyaya uyğun aradan qaldırılmalıdır.",

                        "Common welding defects include porosity, cracks, lack of fusion, undercut and slag inclusions. The cause should be identified and corrected according to the procedure."
                },

                {
                        "Используйте сварочную маску, защитные перчатки, спецодежду и другую необходимую защиту. Обеспечьте вентиляцию и удалите горючие материалы из рабочей зоны.",

                        "Qaynaq maskası, qoruyucu əlcəklər, xüsusi geyim və digər lazımi mühafizə vasitələrindən istifadə edin. Havalandırmanı təmin edin və yanıcı materialları iş zonasından uzaqlaşdırın.",

                        "Use a welding helmet, protective gloves, protective clothing and other required PPE. Ensure ventilation and remove combustible materials from the work area."
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