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

    String language = "RU";
    int green = Color.rgb(20, 160, 80);

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
                    "Сварка — это процесс соединения металлических деталей с помощью нагрева, давления или их сочетания.\n\nОсновные виды сварки:\n• Ручная дуговая сварка.\n• Полуавтоматическая сварка.\n• Аргонная сварка.\n\nВыбор метода зависит от металла, толщины детали и требований к соединению.",
                    "Qaynaq metal hissələrin istilik, təzyiq və ya onların birləşməsi ilə birləşdirilməsi prosesidir.\n\nƏsas qaynaq növləri:\n• Əl ilə qövs qaynağı.\n• Yarımavtomatik qaynaq.\n• Arqon qaynağı.\n\nMetod metalın növündən, detalın qalınlığından və birləşməyə olan tələblərdən asılıdır.",
                    "Welding is the process of joining metal parts using heat, pressure or a combination of both.\n\nMain types:\n• Manual arc welding.\n• Semi-automatic welding.\n• TIG welding.\n\nThe method depends on the metal, part thickness and joint requirements."
            },
            {
                    "Ручная дуговая сварка использует электрическую дугу между электродом и металлом.\n\nПеред началом работы:\n• Проверьте сварочный аппарат.\n• Проверьте кабели и держатель электрода.\n• Проверьте заземление.\n• Используйте сварочную маску и защитные перчатки.\n\nНе касайтесь электрода голыми руками и не работайте с повреждёнными кабелями.",
                    "Əl ilə qövs qaynağında elektrod ilə metal arasında elektrik qövsü yaranır.\n\nİşə başlamazdan əvvəl:\n• Qaynaq aparatını yoxlayın.\n• Kabelləri və elektrod tutacağını yoxlayın.\n• Torpaqlamanı yoxlayın.\n• Qaynaq maskası və qoruyucu əlcəklərdən istifadə edin.\n\nElektroda çılpaq əllə toxunmayın və zədələnmiş kabellərlə işləməyin.",
                    "Manual arc welding creates an electric arc between the electrode and the metal.\n\nBefore work:\n• Check the welding machine.\n• Check cables and electrode holder.\n• Check grounding.\n• Wear a welding helmet and protective gloves.\n\nDo not touch the electrode with bare hands or use damaged cables."
            },
            {
                    "Полуавтоматическая сварка использует сварочную проволоку, которая автоматически подаётся в зону сварки.\n\nТакже используется защитный газ.\n\nПеред работой проверьте:\n• Подачу проволоки.\n• Состояние горелки.\n• Газовый баллон и соединения.\n• Кабели и оборудование.\n\nСледите за правильной настройкой сварочного аппарата.",
                    "Yarımavtomatik qaynaqda qaynaq teli avtomatik olaraq qaynaq zonasına verilir.\n\nHəmçinin qoruyucu qazdan istifadə olunur.\n\nİşdən əvvəl yoxlayın:\n• Telin verilməsini.\n• Məşəlin vəziyyətini.\n• Qaz balonunu və birləşmələri.\n• Kabelləri və avadanlığı.\n\nQaynaq aparatının düzgün sazlanmasına nəzarət edin.",
                    "Semi-automatic welding uses welding wire that is automatically fed into the welding zone.\n\nShielding gas is also used.\n\nBefore work, check:\n• Wire feeding.\n• Torch condition.\n• Gas cylinder and connections.\n• Cables and equipment.\n\nMake sure the welding machine is correctly adjusted."
            },
            {
                    "Аргонная сварка, или TIG, используется для получения точного и качественного сварного соединения.\n\nВ процессе используется защитный аргон и вольфрамовый электрод.\n\nПеред работой необходимо проверить:\n• Подачу аргона.\n• Горелку.\n• Вольфрамовый электрод.\n• Кабели и соединения.\n\nРабочее место должно быть чистым и хорошо подготовленным.",
                    "Arqon qaynağı və ya TIG dəqiq və keyfiyyətli qaynaq birləşmələri üçün istifadə olunur.\n\nProsesdə qoruyucu arqon qazı və volfram elektrodu istifadə edilir.\n\nİşdən əvvəl yoxlayın:\n• Arqon qazının verilməsini.\n• Məşəli.\n• Volfram elektrodunu.\n• Kabelləri və birləşmələri.\n\nİş yeri təmiz və düzgün hazırlanmalıdır.",
                    "TIG welding is used to produce precise and high-quality welded joints.\n\nThe process uses shielding argon and a tungsten electrode.\n\nBefore work, check:\n• Argon supply.\n• Torch.\n• Tungsten electrode.\n• Cables and connections.\n\nThe workplace must be clean and properly prepared."
            },
            {
                    "Основное сварочное оборудование:\n\n• Сварочный аппарат.\n• Сварочные кабели.\n• Электрододержатель или горелка.\n• Газовый баллон.\n• Редуктор.\n• Сварочная маска.\n• Защитные перчатки.\n\nПеред началом работы оборудование необходимо осмотреть. Повреждённое оборудование использовать нельзя.",
                    "Əsas qaynaq avadanlığı:\n\n• Qaynaq aparatı.\n• Qaynaq kabelləri.\n• Elektrod tutacağı və ya məşəl.\n• Qaz balonu.\n• Reduktor.\n• Qaynaq maskası.\n• Qoruyucu əlcəklər.\n\nİşdən əvvəl avadanlıq yoxlanılmalıdır. Zədələnmiş avadanlıqdan istifadə etmək olmaz.",
                    "Main welding equipment:\n\n• Welding machine.\n• Welding cables.\n• Electrode holder or torch.\n• Gas cylinder.\n• Regulator.\n• Welding helmet.\n• Protective gloves.\n\nInspect the equipment before work. Do not use damaged equipment."
            },
            {
                    "Перед сваркой поверхность металла необходимо подготовить.\n\nУдалите:\n• Грязь.\n• Масло.\n• Ржавчину.\n• Краску и другие загрязнения.\n\nДетали должны быть правильно установлены и закреплены.\n\nХорошая подготовка металла помогает получить качественный сварной шов.",
                    "Qaynaqdan əvvəl metalın səthi hazırlanmalıdır.\n\nAşağıdakıları təmizləyin:\n• Çirk.\n• Yağ.\n• Pas.\n• Boya və digər çirkləndiricilər.\n\nDetallar düzgün yerləşdirilməli və bərkidilməlidir.\n\nMetalın düzgün hazırlanması keyfiyyətli qaynaq tikişi əldə etməyə kömək edir.",
                    "Before welding, the metal surface must be prepared.\n\nRemove:\n• Dirt.\n• Oil.\n• Rust.\n• Paint and other contamination.\n\nParts must be correctly positioned and secured.\n\nGood metal preparation helps produce a quality weld."
            },
            {
                    "Основные дефекты сварки:\n\n• Трещины.\n• Поры.\n• Непровар.\n• Прожог.\n• Шлаковые включения.\n• Неправильная форма шва.\n\nПричиной дефектов могут быть неправильные параметры сварки, загрязнение металла, неправильная техника или недостаточная подготовка.\n\nДефекты необходимо выявлять и устранять согласно требованиям контроля качества.",
                    "Əsas qaynaq qüsurları:\n\n• Çatlar.\n• Məsamələr.\n• Natamam qaynaq.\n• Yanma.\n• Şlak daxilolmaları.\n• Tikiş formasının düzgün olmaması.\n\nQüsurların səbəbi yanlış qaynaq parametrləri, metalın çirkli olması, düzgün olmayan texnika və ya kifayət qədər hazırlığın olmaması ola bilər.\n\nQüsurlar müəyyən edilməli və keyfiyyətə nəzarət tələblərinə uyğun aradan qaldırılmalıdır.",
                    "Main welding defects:\n\n• Cracks.\n• Porosity.\n• Lack of fusion.\n• Burn-through.\n• Slag inclusions.\n• Incorrect weld shape.\n\nDefects can be caused by incorrect welding parameters, contaminated metal, incorrect technique or insufficient preparation.\n\nDefects must be identified and corrected according to quality-control requirements."
            },
            {
                    "При сварке необходимо соблюдать правила безопасности.\n\nОбязательно используйте:\n• Сварочную маску.\n• Защитные перчатки.\n• Спецодежду.\n• Защитную обувь.\n\nТакже необходимо:\n• Обеспечить вентиляцию.\n• Убрать горючие материалы из рабочей зоны.\n• Проверить кабели и оборудование.\n• Защитить окружающих от дуги и искр.\n• Соблюдать инструкции предприятия.\n\nПри неисправности оборудования немедленно остановите работу и сообщите ответственному сотруднику.",
                    "Qaynaq zamanı təhlükəsizlik qaydalarına riayət edilməlidir.\n\nMütləq istifadə edin:\n• Qaynaq maskası.\n• Qoruyucu əlcəklər.\n• Xüsusi geyim.\n• Qoruyucu ayaqqabı.\n\nHəmçinin:\n• Ventilyasiyanı təmin edin.\n• Yanıcı materialları iş zonasından uzaqlaşdırın.\n• Kabelləri və avadanlığı yoxlayın.\n• Ətrafdakı insanları qövsdən və qığılcımlardan qoruyun.\n• Müəssisənin təlimatlarına əməl edin.\n\nAvadanlıqda nasazlıq olarsa işi dərhal dayandırın və məsul şəxsə məlumat verin.",
                    "Follow safety rules when welding.\n\nAlways use:\n• Welding helmet.\n• Protective gloves.\n• Protective work clothing.\n• Safety footwear.\n\nAlso:\n• Ensure ventilation.\n• Remove flammable materials from the work area.\n• Check cables and equipment.\n• Protect others from the arc and sparks.\n• Follow workplace instructions.\n\nIf equipment is faulty, stop work immediately and report it to the responsible person."
            }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showMainScreen();
    }

    private void showMainScreen() {

        LinearLayout root = createRoot();

        LinearLayout header = createHeader();
        root.addView(header);

        ScrollView scrollView = new ScrollView(this);

        LinearLayout list = new LinearLayout(this);
        list.setOrientation(LinearLayout.VERTICAL);
        list.setPadding(16, 8, 16, 20);

        for (int i = 0; i < titles.length; i++) {

            final int index = i;

            LinearLayout card = new LinearLayout(this);
            card.setOrientation(LinearLayout.HORIZONTAL);
            card.setGravity(Gravity.CENTER_VERTICAL);
            card.setPadding(18, 18, 18, 18);

            GradientDrawable background = new GradientDrawable();
            background.setColor(Color.WHITE);
            background.setCornerRadius(22);
            background.setStroke(2, Color.rgb(220, 230, 224));

            card.setBackground(background);
            card.setElevation(5);

            TextView text = new TextView(this);
            text.setText(getTitle(index));
            text.setTextSize(18);
            text.setTextColor(Color.rgb(25, 35, 30));
            text.setTypeface(null, 1);

            card.addView(
                    text,
                    new LinearLayout.LayoutParams(0, -2, 1)
            );

            TextView arrow = new TextView(this);
            arrow.setText("›");
            arrow.setTextSize(32);
            arrow.setTextColor(green);
            arrow.setGravity(Gravity.CENTER);

            card.addView(arrow, new LinearLayout.LayoutParams(45, 55));

            card.setOnClickListener(v -> showDetails(index));

            LinearLayout.LayoutParams cardParams =
                    new LinearLayout.LayoutParams(-1, -2);

            cardParams.setMargins(0, 0, 0, 14);

            list.addView(card, cardParams);
        }

        scrollView.addView(list);

        root.addView(
                scrollView,
                new LinearLayout.LayoutParams(-1, 0, 1)
        );

        addDeveloper(root);

        setContentView(root);
    }

    private void showDetails(int index) {

        LinearLayout root = createRoot();

        LinearLayout header = createHeader();
        root.addView(header);

        ScrollView scrollView = new ScrollView(this);

        LinearLayout content = new LinearLayout(this);
        content.setOrientation(LinearLayout.VERTICAL);
        content.setPadding(18, 18, 18, 25);

        TextView title = new TextView(this);
        title.setText(getTitle(index));
        title.setTextSize(24);
        title.setTextColor(green);
        title.setTypeface(null, 1);
        title.setPadding(4, 5, 4, 18);

        content.addView(title);

        TextView information = new TextView(this);
        information.setText(getInfoText(index));
        information.setTextSize(17);
        information.setTextColor(Color.rgb(35, 35, 35));
        information.setLineSpacing(5, 1.0f);
        information.setPadding(4, 5, 4, 20);

        content.addView(information);

        Button back = new Button(this);
        back.setText(getBackText());
        back.setTextColor(Color.WHITE);
        back.setTextSize(16);
        back.setBackgroundColor(green);

        back.setOnClickListener(v -> showMainScreen());

        content.addView(back);

        scrollView.addView(content);

        root.addView(
                scrollView,
                new LinearLayout.LayoutParams(-1, 0, 1)
        );

        addDeveloper(root);

        setContentView(root);
    }

    private LinearLayout createRoot() {

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(Color.rgb(245, 247, 246));

        return root;
    }

    private LinearLayout createHeader() {

        LinearLayout header = new LinearLayout(this);
        header.setOrientation(LinearLayout.VERTICAL);
        header.setGravity(Gravity.CENTER);
        header.setPadding(12, 12, 12, 12);

        GradientDrawable background = new GradientDrawable(
                GradientDrawable.Orientation.TL_BR,
                new int[]{
                        Color.rgb(10, 190, 90),
                        Color.rgb(0, 120, 60)
                }
        );

        background.setCornerRadius(24);
        header.setBackground(background);

        TextView title = new TextView(this);
        title.setText("⚡  " + getHeaderTitle());
        title.setTextColor(Color.WHITE);
        title.setTextSize(24);
        title.setGravity(Gravity.CENTER);
        title.setTypeface(null, 1);

        header.addView(title);

        LinearLayout languages = new LinearLayout(this);
        languages.setGravity(Gravity.CENTER);
        languages.setPadding(0, 10, 0, 0);

        String[] langs = {"RU", "AZ", "EN"};

        for (String lang : langs) {

            Button button = new Button(this);
            button.setText(lang);
            button.setTextSize(12);

            LinearLayout.LayoutParams params =
                    new LinearLayout.LayoutParams(65, 45);

            params.setMargins(5, 0, 5, 0);

            languages.addView(button, params);

            if (language.equals(lang)) {
                button.setTextColor(Color.WHITE);
                button.setBackgroundColor(green);
            } else {
                button.setTextColor(green);
                button.setBackgroundColor(Color.WHITE);
            }

            button.setOnClickListener(v -> {
                language = lang;
                showMainScreen();
            });
        }

        header.addView(languages);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(-1, -2);

        params.setMargins(10, 10, 10, 10);

        header.setLayoutParams(params);

        return header;
    }

    private void addDeveloper(LinearLayout root) {

        TextView developer = new TextView(this);
        developer.setText("F.S");
        developer.setTextColor(Color.GRAY);
        developer.setTextSize(12);
        developer.setGravity(Gravity.CENTER);
        developer.setPadding(0, 5, 0, 8);

        root.addView(developer);
    }

    private String getHeaderTitle() {

        if (language.equals("AZ")) {
            return "QAYNAQ";
        }

        if (language.equals("EN")) {
            return "WELDING";
        }

        return "СВАРКА";
    }

    private String getTitle(int index) {

        if (language.equals("AZ")) {
            return titles[index][1];
        }

        if (language.equals("EN")) {
            return titles[index][2];
        }

        return titles[index][0];
    }

    private String getInfoText(int index) {

        if (language.equals("AZ")) {
            return texts[index][1];
        }

        if (language.equals("EN")) {
            return texts[index][2];
        }

        return texts[index][0];
    }

    private String getBackText() {

        if (language.equals("AZ")) {
            return "← Geri";
        }

        if (language.equals("EN")) {
            return "← Back";
        }

        return "← Назад";
    }
}