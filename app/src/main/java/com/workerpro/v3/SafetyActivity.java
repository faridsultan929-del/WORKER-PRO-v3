package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class SafetyActivity extends Activity {

    private LinearLayout main;
    private String language = "RU";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showScreen();
    }

    private void showScreen() {

        ScrollView scroll = new ScrollView(this);
        scroll.setBackgroundColor(Color.rgb(241, 248, 243));

        main = new LinearLayout(this);
        main.setOrientation(LinearLayout.VERTICAL);
        main.setPadding(20, 20, 20, 30);

        TextView title = new TextView(this);
        title.setText("WORKER PRO\n🦺 " + getSafetyTitle());
        title.setTextSize(27);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);
        title.setPadding(10, 25, 10, 25);
        title.setBackgroundColor(Color.rgb(27, 94, 32));
        main.addView(title);

        LinearLayout languages = new LinearLayout(this);
        languages.setOrientation(LinearLayout.HORIZONTAL);
        languages.setGravity(Gravity.CENTER);
        languages.setPadding(0, 10, 0, 10);

        Button ru = new Button(this);
        ru.setText("RU");

        Button az = new Button(this);
        az.setText("AZ");

        Button en = new Button(this);
        en.setText("EN");

        languages.addView(ru);
        languages.addView(az);
        languages.addView(en);
        main.addView(languages);

        ru.setOnClickListener(v -> {
            language = "RU";
            showScreen();
        });

        az.setOnClickListener(v -> {
            language = "AZ";
            showScreen();
        });

        en.setOnClickListener(v -> {
            language = "EN";
            showScreen();
        });

        addTopic(main, getTitle(1), getText(1));
        addTopic(main, getTitle(2), getText(2));
        addTopic(main, getTitle(3), getText(3));
        addTopic(main, getTitle(4), getText(4));
        addTopic(main, getTitle(5), getText(5));
        addTopic(main, getTitle(6), getText(6));
        addTopic(main, getTitle(7), getText(7));
        addTopic(main, getTitle(8), getText(8));
        addTopic(main, getTitle(9), getText(9));
        addTopic(main, getTitle(10), getText(10));
        addTopic(main, getTitle(11), getText(11));
        addTopic(main, getTitle(12), getText(12));
        addTopic(main, getTitle(13), getText(13));
        addTopic(main, getTitle(14), getText(14));
        addTopic(main, getTitle(15), getText(15));
        addTopic(main, getTitle(16), getText(16));
        addTopic(main, getTitle(17), getText(17));
        addTopic(main, getTitle(18), getText(18));

        TextView warning = new TextView(this);
        warning.setText(getWarning());
        warning.setTextSize(15);
        warning.setTextColor(Color.DKGRAY);
        warning.setPadding(5, 20, 5, 20);
        main.addView(warning);

        TextView developer = new TextView(this);
        developer.setText(getDeveloper());
        developer.setTextSize(15);
        developer.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        developer.setTextColor(Color.rgb(80, 80, 80));
        developer.setGravity(Gravity.CENTER);
        developer.setPadding(5, 15, 5, 20);
        main.addView(developer);

        Button back = new Button(this);
        back.setText(getBack());
        back.setTextSize(17);
        back.setTextColor(Color.WHITE);
        back.setBackgroundTintList(
                android.content.res.ColorStateList.valueOf(
                        Color.rgb(27, 94, 32)
                )
        );

        back.setOnClickListener(v -> finish());

        main.addView(back);

        scroll.addView(main);
        setContentView(scroll);
    }

    private void addTopic(LinearLayout layout, String title, String text) {

        TextView heading = new TextView(this);
        heading.setText(title);
        heading.setTextSize(19);
        heading.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        heading.setTextColor(Color.rgb(27, 94, 32));
        heading.setPadding(5, 18, 5, 8);
        layout.addView(heading);

        TextView description = new TextView(this);
        description.setText(text);
        description.setTextSize(16);
        description.setTextColor(Color.rgb(45, 45, 45));
        description.setPadding(5, 0, 5, 12);
        layout.addView(description);
    }

    private String getSafetyTitle() {
        if (language.equals("AZ")) return "TƏHLÜKƏSİZLİK";
        if (language.equals("EN")) return "SAFETY";
        return "БЕЗОПАСНОСТЬ";
    }

    private String getDeveloper() {
        if (language.equals("AZ"))
            return "Tərtibatçı: Sultanov Farid Rafiq oğlu";

        if (language.equals("EN"))
            return "Developer: Sultanov Farid Rafiq oglu";

        return "Разработчик: Султанов Фарид Рафиг оглы";
    }

    private String getBack() {
        if (language.equals("AZ")) return "← GERİ";
        if (language.equals("EN")) return "← BACK";
        return "← НАЗАД";
    }

    private String getWarning() {

        if (language.equals("AZ")) {
            return "⚠ VACİB\n\n"
                    + "Bu məlumat ümumi təlim məqsədi daşıyır. "
                    + "İş yerində müəssisənin rəsmi təhlükəsizlik qaydalarına "
                    + "və təlimatlarına əməl edin.";
        }

        if (language.equals("EN")) {
            return "⚠ IMPORTANT\n\n"
                    + "This information is for general training purposes. "
                    + "Always follow your company's official safety procedures "
                    + "and instructions.";
        }

        return "⚠ ВАЖНО\n\n"
                + "Эта информация предназначена для общего обучения. "
                + "На рабочем месте всегда соблюдай официальные инструкции "
                + "и правила безопасности предприятия.";
    }

    private String getTitle(int n) {

        if (language.equals("AZ")) {
            String[] a = {
                    "",
                    "1. İŞƏ BAŞLAMAZDAN ƏVVƏL",
                    "2. FƏRDİ MÜHAFİZƏ VASİTƏLƏRİ",
                    "3. AVADANLIQLA İŞ",
                    "4. TƏCİLİ DAYANDIRMA",
                    "5. ELEKTRİK TƏHLÜKƏSİZLİYİ",
                    "6. LOTO — ENERJİNİN TƏCRİDİ",
                    "7. YANĞIN TƏHLÜKƏSİZLİYİ",
                    "8. YANĞINSÖNDÜRƏNLƏR",
                    "9. İSTİ METALLA İŞ",
                    "10. ŞTAMPLAMA PRESLƏRİ",
                    "11. QAYNAQ",
                    "12. SƏS-KÜY",
                    "13. KİMYƏVİ MADDƏLƏR",
                    "14. İŞ YERİNDƏ SƏLİQƏ",
                    "15. YÜKLƏRİN QALDIRILMASI",
                    "16. XƏSARƏT BAŞ VERƏRSƏ",
                    "17. AVADANLIQ NASAZDIRSA",
                    "18. ƏSAS QAYDA"
            };
            return a[n];
        }

        if (language.equals("EN")) {
            String[] e = {
                    "",
                    "1. BEFORE STARTING WORK",
                    "2. PERSONAL PROTECTIVE EQUIPMENT",
                    "3. WORKING WITH MACHINES",
                    "4. EMERGENCY STOP",
                    "5. ELECTRICAL SAFETY",
                    "6. LOTO — ENERGY ISOLATION",
                    "7. FIRE SAFETY",
                    "8. FIRE EXTINGUISHERS",
                    "9. WORKING WITH HOT METAL",
                    "10. STAMPING PRESSES",
                    "11. WELDING",
                    "12. NOISE",
                    "13. CHEMICALS",
                    "14. WORKPLACE ORDER",
                    "15. LIFTING AND MOVING LOADS",
                    "16. IF AN INJURY OCCURS",
                    "17. IF EQUIPMENT IS FAULTY",
                    "18. THE MAIN RULE"
            };
            return e[n];
        }

        String[] r = {
                "",
                "1. ПЕРЕД НАЧАЛОМ РАБОТЫ",
                "2. СРЕДСТВА ИНДИВИДУАЛЬНОЙ ЗАЩИТЫ",
                "3. РАБОТА С ОБОРУДОВАНИЕМ",
                "4. АВАРИЙНАЯ ОСТАНОВКА",
                "5. ЭЛЕКТРОБЕЗОПАСНОСТЬ",
                "6. LOTO — БЛОКИРОВКА ЭНЕРГИИ",
                "7. ПОЖАРНАЯ БЕЗОПАСНОСТЬ",
                "8. ОГНЕТУШИТЕЛИ",
                "9. РАБОТА С ГОРЯЧИМ МЕТАЛЛОМ",
                "10. ШТАМПОВОЧНЫЕ ПРЕССЫ",
                "11. СВАРКА",
                "12. ШУМ",
                "13. ХИМИЧЕСКИЕ ВЕЩЕСТВА",
                "14. ПОРЯДОК НА РАБОЧЕМ МЕСТЕ",
                "15. ПОДЪЁМ И ПЕРЕМЕЩЕНИЕ ГРУЗОВ",
                "16. ЕСЛИ ПРОИЗОШЛА ТРАВМА",
                "17. ЕСЛИ ОБОРУДОВАНИЕ НЕИСПРАВНО",
                "18. ГЛАВНОЕ ПРАВИЛО"
        };

        return r[n];
    }

    private String getText(int n) {

        if (language.equals("AZ")) return getAZ(n);
        if (language.equals("EN")) return getEN(n);
        return getRU(n);
    }

    private String getRU(int n) {

        String[] r = {
                "",
                "Перед началом смены осмотри рабочее место. "
                        + "Проверь состояние оборудования, защитные ограждения, "
                        + "инструмент и освещение. Если обнаружил опасную неисправность, "
                        + "не начинай работу и сообщи ответственному лицу.",

                "Используй средства индивидуальной защиты в соответствии с опасностями "
                        + "рабочего места: каску, защитные очки, перчатки, спецодежду, "
                        + "защитную обувь, средства защиты слуха и органов дыхания.",

                "Не приближай руки к движущимся механизмам. "
                        + "Не снимай защитные ограждения. Не пытайся остановить движущуюся "
                        + "деталь руками. Ремонт и регулировку выполняй только по установленной процедуре.",

                "При непосредственной опасности используй аварийную остановку, "
                        + "если это безопасно. Сообщи ответственному лицу. "
                        + "Не запускай оборудование до выяснения причины остановки.",

                "Не используй повреждённые кабели и электрооборудование. "
                        + "Не открывай электрические шкафы без соответствующего разрешения "
                        + "и квалификации. Электрические неисправности передавай специалисту.",

                "LOTO применяется для изоляции опасной энергии перед обслуживанием. "
                        + "Это может быть электрическая, пневматическая, гидравлическая "
                        + "или механическая энергия. Не снимай чужую блокировку.",

                "Знай расположение огнетушителей и эвакуационных выходов. "
                        + "Не загромождай проходы. При пожаре немедленно сообщи об опасности "
                        + "и следуй плану эвакуации предприятия.",

                "Используй только подходящий тип огнетушителя и только если это безопасно. "
                        + "Если пожар быстро распространяется или много дыма, покинь опасную зону.",

                "Горячий металл может вызвать серьёзные ожоги. "
                        + "Используй подходящие средства защиты. Не прикасайся к горячей детали "
                        + "до подтверждения безопасной температуры.",

                "Штамповочный пресс может привести к защемлению и раздавливанию. "
                        + "Не помещай руки в рабочую зону. Не обходи защитные устройства "
                        + "и блокировки.",

                "При сварке защищай глаза и лицо от излучения, искр и брызг металла. "
                        + "Следи за вентиляцией и пожарной безопасностью.",

                "Длительный производственный шум может повредить слух. "
                        + "В местах с высоким уровнем шума используй защиту слуха.",

                "Перед работой с химическими веществами ознакомься с инструкцией "
                        + "и паспортом безопасности. Используй необходимые СИЗ. "
                        + "Не смешивай неизвестные химические вещества.",

                "Содержи рабочее место в чистоте. Убирай масло, металлическую стружку, "
                        + "инструмент и другие препятствия. Свободные проходы уменьшают риск травм.",

                "Перед подъёмом оцени вес и устойчивость груза. Используй подходящее "
                        + "грузоподъёмное оборудование. Никогда не стой под подвешенным грузом.",

                "При травме прекрати работу и обеспечь безопасность места, если это возможно. "
                        + "Сообщи ответственному лицу и обратись за медицинской помощью.",

                "Если оборудование неисправно и представляет опасность, не продолжай работу. "
                        + "Останови его безопасным способом и сообщи ответственному специалисту.",

                "БЕЗОПАСНОСТЬ ВАЖНЕЕ СКОРОСТИ.\n\n"
                        + "Никогда не жертвуй безопасностью ради выполнения плана быстрее. "
                        + "Если ситуация опасная — остановись и сообщи ответственному лицу."
        };

        return r[n];
    }

    private String getAZ(int n) {

        String[] a = {
                "",
                "Növbəyə başlamazdan əvvəl iş yerini yoxlayın. "
                        + "Avadanlığın, qoruyucu qurğuların, alətlərin və işıqlandırmanın "
                        + "vəziyyətini yoxlayın. Təhlükəli nasazlıq aşkar etdikdə işi başlamayın.",

                "İş yerinin təhlükələrinə uyğun fərdi mühafizə vasitələrindən istifadə edin: "
                        + "dəbilqə, qoruyucu eynək, əlcək, xüsusi geyim, qoruyucu ayaqqabı "
                        + "və lazım olduqda eşitmə və tənəffüs mühafizəsi.",

                "Hərəkətdə olan mexanizmlərə əllərinizi yaxınlaşdırmayın. "
                        + "Qoruyucu örtükləri çıxarmayın. Hərəkətdə olan detalları əllə dayandırmayın. "
                        + "Təmir və sazlama işlərini müəyyən edilmiş qaydalara uyğun aparın.",

                "Birbaşa təhlükə olduqda, təhlükəsizdirsə, təcili day