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

        // HEADER
        TextView title = new TextView(this);
        title.setText("WORKER PRO\n🦺 SAFETY");
        title.setTextSize(27);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);
        title.setPadding(10, 25, 10, 25);
        title.setBackgroundColor(Color.rgb(27, 94, 32));
        main.addView(title);

        // LANGUAGE BUTTONS
        LinearLayout languages = new LinearLayout(this);
        languages.setOrientation(LinearLayout.HORIZONTAL);
        languages.setGravity(Gravity.CENTER);
        languages.setPadding(0, 15, 0, 15);

        Button ru = new Button(this);
        ru.setText("🇷🇺 RU");

        Button az = new Button(this);
        az.setText("🇦🇿 AZ");

        Button en = new Button(this);
        en.setText("🇬🇧 EN");

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

        // SUBTITLE
        TextView subtitle = new TextView(this);
        subtitle.setText(getSubtitle());
        subtitle.setTextSize(18);
        subtitle.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        subtitle.setTextColor(Color.rgb(27, 94, 32));
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(5, 10, 5, 20);
        main.addView(subtitle);

        // INFORMATION
        addTopic(
                getTitle(1),
                getText(1)
        );

        addTopic(
                getTitle(2),
                getText(2)
        );

        addTopic(
                getTitle(3),
                getText(3)
        );

        addTopic(
                getTitle(4),
                getText(4)
        );

        addTopic(
                getTitle(5),
                getText(5)
        );

        addTopic(
                getTitle(6),
                getText(6)
        );

        addTopic(
                getTitle(7),
                getText(7)
        );

        addTopic(
                getTitle(8),
                getText(8)
        );

        addTopic(
                getTitle(9),
                getText(9)
        );

        addTopic(
                getTitle(10),
                getText(10)
        );

        addTopic(
                getTitle(11),
                getText(11)
        );

        addTopic(
                getTitle(12),
                getText(12)
        );

        addTopic(
                getTitle(13),
                getText(13)
        );

        addTopic(
                getTitle(14),
                getText(14)
        );

        addTopic(
                getTitle(15),
                getText(15)
        );

        addTopic(
                getTitle(16),
                getText(16)
        );

        addTopic(
                getTitle(17),
                getText(17)
        );

        addTopic(
                getTitle(18),
                getText(18)
        );

        // IMPORTANT
        TextView warning = new TextView(this);
        warning.setText(getWarning());
        warning.setTextSize(15);
        warning.setTextColor(Color.DKGRAY);
        warning.setPadding(5, 20, 5, 20);
        main.addView(warning);

        // DEVELOPER
        TextView developer = new TextView(this);
        developer.setText(getDeveloper());
        developer.setTextSize(15);
        developer.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        developer.setTextColor(Color.rgb(80, 80, 80));
        developer.setGravity(Gravity.CENTER);
        developer.setPadding(5, 20, 5, 20);
        main.addView(developer);

        // BACK BUTTON
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

    private void addTopic(String title, String text) {

        TextView heading = new TextView(this);
        heading.setText(title);
        heading.setTextSize(19);
        heading.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        heading.setTextColor(Color.rgb(27, 94, 32));
        heading.setPadding(5, 18, 5, 8);

        main.addView(heading);

        TextView description = new TextView(this);
        description.setText(text);
        description.setTextSize(16);
        description.setTextColor(Color.rgb(45, 45, 45));
        description.setPadding(5, 0, 5, 12);

        main.addView(description);
    }

    private String getSubtitle() {

        if (language.equals("AZ")) {
            return "ƏMƏK MÜHAFİZƏSİ VƏ TƏHLÜKƏSİZLİK";
        }

        if (language.equals("EN")) {
            return "OCCUPATIONAL HEALTH AND SAFETY";
        }

        return "ОХРАНА ТРУДА И БЕЗОПАСНОСТЬ";
    }

    private String getDeveloper() {

        if (language.equals("AZ")) {
            return "Tərtibatçı: Sultanov Farid Rafiq oğlu";
        }

        if (language.equals("EN")) {
            return "Developer: Sultanov Farid Rafiq oglu";
        }

        return "Разработчик: Султанов Фарид Рафиг оглы";
    }

    private String getBack() {

        if (language.equals("AZ")) {
            return "← GERİ";
        }

        if (language.equals("EN")) {
            return "← BACK";
        }

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
                    + "and instructions at the workplace.";
        }

        return "⚠ ВАЖНО\n\n"
                + "Эта информация предназначена для общего обучения. "
                + "На рабочем месте всегда соблюдай официальные инструкции "
                + "и правила безопасности предприятия.";
    }

    private String getTitle(int n) {

        if (language.equals("AZ")) {

            switch (n) {
                case 1: return "1. İŞƏ BAŞLAMAZDAN ƏVVƏL";
                case 2: return "2. FƏRDİ MÜHAFİZƏ VASİTƏLƏRİ";
                case 3: return "3. AVADANLIQLA İŞ";
                case 4: return "4. TƏCİLİ DAYANDIRMA";
                case 5: return "5. ELEKTRİK TƏHLÜKƏSİZLİYİ";
                case 6: return "6. LOTO — ENERJİNİN BLOKLANMASI";
                case 7: return "7. YANĞIN TƏHLÜKƏSİZLİYİ";
                case 8: return "8. YANĞINSÖNDÜRƏN";
                case 9: return "9. İSTİ METALLA İŞ";
                case 10: return "10. ŞTAMPLAMA PRESLƏRİ";
                case 11: return "11. QAYNAQ";
                case 12: return "12. SƏS-KÜY";
                case 13: return "13. KİMYƏVİ MADDƏLƏR";
                case 14: return "14. İŞ YERİNDƏ SƏLİQƏ";
                case 15: return "15. YÜKLƏRİN QALDIRILMASI";
                case 16: return "16. XƏSARƏT BAŞ VERƏRSƏ";
                case 17: return "17. AVADANLIQ NASAZDIRSA";
                case 18: return "18. ƏSAS QAYDA";
            }

        } else if (language.equals("EN")) {

            switch (n) {
                case 1: return "1. BEFORE STARTING WORK";
                case 2: return "2. PERSONAL PROTECTIVE EQUIPMENT";
                case 3: return "3. WORKING WITH MACHINES";
                case 4: return "4. EMERGENCY STOP";
                case 5: return "5. ELECTRICAL SAFETY";
                case 6: return "6. LOTO — ENERGY ISOLATION";
                case 7: return "7. FIRE SAFETY";
                case 8: return "8. FIRE EXTINGUISHER";
                case 9: return "9. WORKING WITH HOT METAL";
                case 10: return "10. STAMPING PRESSES";
                case 11: return "11. WELDING";
                case 12: return "12. NOISE";
                case 13: return "13. CHEMICALS";
                case 14: return "14. WORKPLACE ORDER";
                case 15: return "15. LIFTING AND MOVING LOADS";
                case 16: return "16. IF AN INJURY OCCURS";
                case 17: return "17. IF EQUIPMENT IS FAULTY";
                case 18: return "18. THE MAIN RULE";
            }
        }

        switch (n) {
            case 1: return "1. ПЕРЕД НАЧАЛОМ РАБОТЫ";
            case 2: return "2. СРЕДСТВА ИНДИВИДУАЛЬНОЙ ЗАЩИТЫ";
            case 3: return "3. РАБОТА С ОБОРУДОВАНИЕМ";
            case 4: return "4. АВАРИЙНАЯ ОСТАНОВКА";
            case 5: return "5. ЭЛЕКТРОБЕЗОПАСНОСТЬ";
            case 6: return "6. LOTO — БЛОКИРОВКА ЭНЕРГИИ";
            case 7: return "7. ПОЖАРНАЯ БЕЗОПАСНОСТЬ";
            case 8: return "8. ОГНЕТУШИТЕЛЬ";
            case 9: return "9. РАБОТА С ГОРЯЧИМ МЕТАЛЛОМ";
            case 10: return "10. ШТАМПОВОЧНЫЕ ПРЕССЫ";
            case 11: return "11. СВАРКА";
            case 12: return "12. ШУМ";
            case 13: return "13. ХИМИЧЕСКИЕ ВЕЩЕСТВА";
            case 14: return "14. ПОРЯДОК НА РАБОЧЕМ МЕСТЕ";
            case 15: return "15. ПОДЪЁМ И ПЕРЕМЕЩЕНИЕ ГРУЗОВ";
            case 16: return "16. ЕСЛИ ПРОИЗОШЛА ТРАВМА";
            case 17: return "17. ЕСЛИ ОБОРУДОВАНИЕ НЕИСПРАВНО";
            case 18: return "18. ГЛАВНОЕ ПРАВИЛО";
        }

        return "";
    }

    private String getText(int n) {

        if (language.equals("AZ")) {
            return getAzerbaijaniText(n);
        }

        if (language.equals("EN")) {
            return getEnglishText(n);
        }

        return getRussianText(n);
    }

    private String getRussianText(int n) {

        switch (n) {

            case 1:
                return "İşə başlamazdan əvvəl iş yerini yoxla. "
                        + "Avadanlığın saz vəziyyətdə olduğuna əmin ol. "
                        + "Qoruyucu qurğuları, alətləri və işıqlandırmanı yoxla. "
                        + "Təhlükəli nasazlıq aşkar etsən, işi başlama və məsul şəxsə bildir.";

            case 2:
                return "İş yerinin təhlükələrinə uyğun fərdi mühafizə vasitələrindən istifadə et. "
                        + "Bura qoruyucu dəbilqə, eynək, əlcək, xüsusi geyim, qoruyucu ayaqqabı, "
                        + "eşitmə və tənəffüs orqanlarının mühafizəsi daxil ola bilər.";

            case 3:
                return "Hərəkətdə olan mexanizmlərə əllərini yaxınlaşdırma. "
                        + "Qoruyucu örtükləri çıxarma. Hərəkətdə olan detalı əllə dayandırmağa çalışma. "
                        + "Təmir və sazlama işlərini yalnız müəyyən edilmiş qaydalara uyğun apar.";

            case 4:
                return "Təhlükə yarandıqda və təhlükəsizdirsə, təcili dayandırma düyməsindən istifadə et. "
                        + "Avadanlıq dayandıqdan sonra məsul şəxsə məlumat ver. "
                        + "Səbəb müəyyən edilmədən avadanlığı yenidən işə salma.";

            case 5:
                return "Zədələnmiş kabel və elektrik avadanlığından istifadə etmə. "
                        + "Elektrik şkaflarını icazəsiz açma. "
                        + "Elektrik nasazlığı zamanı məsul mütəxəssisə məlumat ver.";

            case 6:
                return "Təmir zamanı təhlükəli enerji mənbələri müəssisənin LOTO proseduruna "
                        + "uyğun təcrid edilməlidir. Elektrik, pnevmatik, hidravlik və digər enerji "
                        + "mənbələri nəzərə alınmalıdır. Başqasının bloklamasını çıxarma.";

            case 7:
                return "Yanğınsöndürənlərin və təxliyə çıxışlarının yerini bil. "
                        + "Keçidləri və çıxışları bağlama. Yanğın zamanı dərhal xəbər ver "
                        + "və müəssisənin təxliyə planına əməl et.";

            case 8:
                return "Yalnız uyğun tipli yanğınsöndürəndən istifadə et və bunu yalnız təhlükəsizdirsə et. "
                        + "Yanğın böyüyürsə və ya tüstü çoxalırsa, təhlükəli ərazini dərhal tərk et.";

            case 9:
                return "İsti metal ciddi yanıq yarada bilər. "
                        + "Uyğun istiliyədavamlı qoruyucu vasitələrdən istifadə et. "
                        + "Temperaturun təhlükəsiz olduğu təsdiqlənmədən isti detala toxunma.";

            case 10:
                return "Ştamp presləri sıxılma və əzilmə təhlükəsi yarada bilər. "
                        + "Əllərini iş zonasına salma. Qoruyucu qurğuları keçmə və nasaz presdə işləmə.";

            case 11:
                return "Qaynaq zamanı gözləri və üzü qoruyan vasitələrdən istifadə et. "
                        + "Qığılcım və metal sıçramalarından qorun. Ventilyasiya və yanğın təhlükəsizliyinə diqqət et.";

            case 12:
                return "Uzunmüddətli yüksək səs eşitməyə zərər verə bilər. "
                        + "Yüksək səs olan yerlərdə qulaq mühafizəsindən istifadə et.";

            case 13:
                return "Kimyəvi maddələrlə işləməzdən əvvəl təhlükəsizlik məlumatlarını oxu. "
                        + "Lazımi fərdi mühafizə vasitələrindən istifadə et. "
                        + "Naməlum maddələri qarışdırma.";

            case 14:
                return "İş yerini təmiz və səliqəli saxla. "
                        + "Yağ, metal yonqarı, alət və digər maneələri vaxtında təmizlə. "
                        + "Təmiz keçidlər qəza riskini azaldır.";

            case 15:
                return "Yükü qaldırmazdan əvvəl onun çəkisini və sabitliyini qiymətləndir. "
                        + "Uyğun qaldırıcı vasitələrdən istifadə et. "
                        + "Asılmış yükün altında dayanma.";

            case 16:
                return "Xəsarət baş verərsə, işi dayandır və təhlükəsizliyi təmin et. "
                        + "Məsul şəxsə məlumat ver və müəssisənin tibbi yardım qaydalarına əməl et. "
                        + "Hadisəni gizlətmə.";

            case 17:
                return "Avadanlıq təhlükəli şəkildə nasazdırsa, işləməyə davam etmə. "
                        + "Təhlükəsiz şəkildə dayandır, ətrafdakıları xəbərdar et və məsul şəxsə bildir.";

            case 18:
                return "TƏHLÜKƏSİZLİK SÜRƏTDƏN DAHA VACİBDİR.\n\n"
                        + "İş planını yerinə yetirmək üçün təhlükəsizliyi qurban vermək olmaz. "
                        + "Vəziyyət təhlükəli görünürsə, dayan və məsul şəxsə məlumat ver.";
        }

        return "";
    }

    private String getAzerbaijaniText(int n) {

        switch (n) {

            case 1:
                return "İşə başlamazdan əvvəl iş yerini yoxlayın. Avadanlığın saz olduğuna əmin olun. "
                        + "Qoruyucu qurğuları, alətləri və işıqlandırmanı yoxlayın. "
                        + "Təhlükəli nasazlıq aşkar etdikdə işi başlamayın və məsul şəxsə məlumat verin.";

            case 2:
                return "İş yerinin təhlükələrinə uyğun fərdi mühafizə vasitələrindən istifadə edin. "
                        + "Dəbilqə, qoruyucu eynək, əlcək, xüsusi geyim və qoruyucu ayaqqabı əsas vasitələrdəndir.";

            case 3:
                return "Hərəkətdə olan mexanizmlərə yaxınlaşmayın. Qoruyucu örtükləri çıxarmayın. "
                        + "Hərəkətdə olan detalları əllə dayandırmağa çalışmayın.";

            case 4:
                return "Təhlükə zamanı təhlükəsizdirsə, təcili dayandırma düyməsindən istifadə edin. "
                        + "Sonra məsul şəxsə məlumat verin və səbəb müəyyən edilmədən avadanlığı işə salmayın.";

            case 5:
                return "Zədələnmiş kabel və elektrik avadanlığından istifadə etməyin. "
                        + "Elektrik şkaflarını icazəsiz açmayın. Nasazlıq barədə məsul mütəxəssisə məlumat verin.";

            case 6:
                return "Təmir zamanı təhlükəli enerji mənbələri müəssisənin LOTO proseduruna uyğun təcrid edilməlidir. "
                        + "Başqasının bloklamasını çıxarmayın.";

            case 7:
                return "Yanğınsöndürənlərin və təxliyə çıxışlarının yerini bilin. "
                        + "Keçidləri bağlamayın. Yanğın zamanı dərhal məlumat verin və təxliyə planına əməl edin.";

            case 8:
                return "Yalnız uyğun tipli yanğınsöndürəndən istifadə edin və bunu yalnız təhlükəsiz olduğu halda edin. "
                        + "Yanğın böyüyürsə, ərazini tərk edin.";

            case 9:
                return "İsti metal ciddi yanıq yarada bilər. İstiliyə davamlı qoruyucu vasitələrdən istifadə edin. "
                        + "Temperatur təhlükəsiz olmadan isti detala toxunmayın.";

            case 10:
                return "Ştamp preslərində sıxılma və əzilmə təhlükəsi var. "
                        + "Əlləri iş zonasına salmayın və qoruyucu sistemləri keçməyin.";

            case 11:
                return "Qaynaq zamanı göz və üz mühafizəsindən istifadə edin. "
                        + "Qığılcımlardan qorunun və yanğın təhlükəsizliyinə riayət edin.";

            case 12:
                return "Yüksək səs eşitməyə zərər verə bilər. "
                        + "Səs-küy olan yerlərdə qulaq mühafizəsindən istifadə edin.";

            case 13:
                return "Kimyəvi maddələrlə işləməzdən əvvəl təhlükəsizlik məlumatlarını oxuyun. "
                        + "Lazımi mühafizə vasitələrindən istifadə edin.";

            case 14:
                return "İş yerini təmiz və səliqəli saxlayın. "
                        + "Yağ, metal yonqarı və digər maneələri vaxtında təmizləyin.";

            case 15:
                return "Yükün çəkisini və sabitliyini qiymətləndirin. "
                        + "Uyğun qaldırıcı vasitələrdən istifadə edin. Asılmış yükün altında dayanmayın.";

            case 16:
                return "Xəsarət zamanı işi dayandırın, məsul şəxsə məlumat verin və tibbi yardım alın. "
                        + "Hadisəni gizlətməyin.";

            case 17:
                return "Avadanlıq təhlükəli şəkildə nasazdırsa, işləməyin. "
                        + "Avadanlığı təhlükəsiz dayandırın və məsul şəxsə məlumat verin.";

            case 18:
                return "TƏHLÜKƏSİZLİK SÜRƏTDƏN DAHA VACİBDİR.\n\n"
                        + "İşi tez bitirmək üçün təhlükəsizliyi qurban verməyin. "
                        + "Təhlükə görürsünüzsə, dayanın və məlumat verin.";
        }

        return "";
    }

    private String getEnglishText(int n) {

        switch (n) {

            case 1:
                return "Before starting work, inspect your workplace. "
                        + "Make sure the equipment is in safe working condition. "
                        + "Check guards, tools and lighting. Report dangerous defects.";

            case 2:
                return "Use personal protective equipment appropriate for the workplace. "
                        + "This may include a helmet, safety glasses, gloves, protective clothing, "
                        + "safety footwear, hearing and respiratory protection.";

            case 3:
                return "Keep your hands away from moving mechanisms. "
                        + "Do not remove safety guards. Never try to stop moving parts with your hands.";

            case 4:
                return "In an emergency, use the emergency stop if it is safe to do so. "
                        + "Inform the responsible person and do not restart equipment until the cause is understood.";

            case 5:
                return "Do not use damaged cables or