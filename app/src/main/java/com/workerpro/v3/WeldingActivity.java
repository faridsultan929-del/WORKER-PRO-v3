package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class WeldingActivity extends Activity {

    LinearLayout content;
    int green = Color.rgb(20, 160, 80);

    String language = "RU";

    String[][] titles = {
            {"Виды сварки", "Qaynaq növləri", "Types of Welding"},
            {"Ручная дуговая сварка", "Əl ilə qövs qaynağı", "Manual Arc Welding"},
            {"Полуавтоматическая сварка", "Yarımavtomatik qaynaq", "Semi-Automatic Welding"},
            {"Аргонная сварка", "Arqon qaynağı", "TIG Welding"},
            {"Сварочное оборудование", "Qaynaq avadanlığı", "Welding Equipment"},
            {"Подготовка металла", "Metalın hazırlanması", "Metal Preparation"},
            {"Дефекты сварки", "Qaynaq qüsurları", "Welding Defects"},
            {"Безопасность при сварке", "Qaynaq zamanı təhlükəsizlik", "Welding Safety"}
    };

    String[][] texts = {
            {
                    "Основные виды: ручная дуговая, полуавтоматическая и аргонная сварка.",
                    "Əsas növlər: əl ilə qövs, yarımavtomatik və arqon qaynağı.",
                    "Main types: manual arc, semi-automatic and TIG welding."
            },
            {
                    "При ручной дуговой сварке используется электрод. Перед работой проверьте кабели, держатель электрода и заземление.",
                    "Əl ilə qövs qaynağında elektroddan istifadə olunur. İşdən əvvəl kabelləri, elektrod tutacağını və torpaqlamanı yoxlayın.",
                    "Manual arc welding uses an electrode. Before work, check cables, electrode holder and grounding."
            },
            {
                    "Полуавтоматическая сварка использует сварочную проволоку и защитный газ. Следите за подачей проволоки и состоянием оборудования.",
                    "Yarımavtomatik qaynaqda qaynaq teli və qoruyucu qaz istifadə olunur. Telin verilməsini və avadanlığın vəziyyətini yoxlayın.",
                    "Semi-automatic welding uses welding wire and shielding gas. Check wire feeding and equipment condition."
            },
            {
                    "Аргонная сварка используется для точной сварки металлов. Используется защитный аргон и вольфрамовый электрод.",
                    "Arqon qaynağı metalların dəqiq qaynağı üçün istifadə olunur. Qoruyucu arqon qazı və volfram elektrodu istifadə edilir.",
                    "TIG welding is used for precise metal welding. It uses shielding argon gas and a tungsten electrode."
            },
            {
                    "Основное оборудование: сварочный аппарат, кабели, электрододержатель, горелка, газовый баллон и средства защиты.",
                    "Əsas avadanlıq: qaynaq aparatı, kabellər, elektrod tutacağı, məşəl, qaz balonu və qoruyucu vasitələr.",
                    "Main equipment: welding machine, cables, electrode holder, torch, gas cylinder and protective equipment."
            },
            {
                    "Перед сваркой очистите металл от грязи, масла, ржавчины и краски. Проверьте правильность соединения деталей.",
                    "Qaynaqdan əvvəl metalı çirkdən, yağdan, pasdan və boyadan təmizləyin. Detalların düzgün birləşdirilməsini yoxlayın.",
                    "Before welding, clean the metal from dirt, oil, rust and paint. Check the correct alignment of parts."
            },
            {
                    "Основные дефекты: трещины, поры, непровар, прожоги и неправильная форма шва. Причину дефекта необходимо определить и устранить.",
                    "Əsas qüsurlar: çatlar, məsamələr, natamam qaynaq, yanma və tikiş formasının düzgün olmaması. Səbəb müəyyən edilməli və aradan qaldırılmalıdır.",
                    "Common defects include cracks, pores, lack of fusion, burn-through and incorrect weld shape. Find and correct the cause."
            },
            {
                    "Используйте сварочную маску, защитные перчатки, спецодежду и обувь. Защитите окружающих от сварочной дуги и искр. Обеспечьте вентиляцию.",
                    "Qaynaq maskası, qoruyucu əlcəklər, xüsusi geyim və ayaqqabı istifadə edin. Ətrafdakı insanları qövsdən və qığılcımlardan qoruyun. Ventilyasiyanı təmin edin.",
                    "Wear a welding helmet, protective gloves, work clothing and safety footwear. Protect others from the arc and sparks. Ensure ventilation."
            }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildScreen();
    }

    void buildScreen() {

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(Color.rgb(245, 247, 246));

        LinearLayout header = new LinearLayout(this);
        header.setOrientation(LinearLayout.VERTICAL);
        header.setGravity(Gravity.CENTER);
        header.setPadding(16, 16, 16, 16);

        GradientDrawable headerBg = new GradientDrawable(
                GradientDrawable.Orientation.TL_BR,
                new int[]{
                        Color.rgb(10, 190, 90),
                        Color.rgb(0, 120, 60)
                }
        );
        header.setBackground(headerBg);

        TextView title = new TextView(this);
        title.setText("🔧  СВАРКА");
        title.setTextColor(Color.WHITE);
        title.setTextSize(24);
        title.setGravity(Gravity.CENTER);
        title.setTypeface(null, 1);

        header.addView(title);

        LinearLayout languages = new LinearLayout(this);
        languages.setGravity(Gravity.CENTER);
        languages.setPadding(0, 12, 0, 0);

        String[] langs = {"RU", "AZ", "EN"};

        for (String lang : langs) {
            Button button = new Button(this);
            button.setText(lang);
            button.setTextSize(12);

            LinearLayout.LayoutParams lp =
                    new LinearLayout.LayoutParams(65, 45);
            lp.setMargins(5, 0, 5, 0);

            languages.addView(button, lp);

            if (lang.equals(language)) {
                button.setTextColor(Color.WHITE);
                button.setBackgroundColor(green);
            } else {
                button.setTextColor(green);
                button.setBackgroundColor(Color.WHITE);
            }

            button.setOnClickListener(v -> {
                language = lang;
                buildScreen();
            });
        }

        header.addView(languages);
        root.addView(header);

        ScrollView scrollView = new ScrollView(this);

        content = new LinearLayout(this);
        content.setOrientation(LinearLayout.VERTICAL);
        content.setPadding(16, 16, 16, 25);

        for (int i = 0; i < titles.length; i++) {

            final int index = i;

            LinearLayout card = new LinearLayout(this);
            card.setOrientation(LinearLayout.VERTICAL);
            card.setPadding(18, 18, 18, 18);

            GradientDrawable cardBg = new GradientDrawable();
            cardBg.setColor(Color.WHITE);
            cardBg.set