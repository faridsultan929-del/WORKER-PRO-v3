package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SafetyActivity extends Activity {

    LinearLayout main;
    String language = "RU";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showScreen();
    }

    void showScreen() {

        main = new LinearLayout(this);
        main.setOrientation(LinearLayout.VERTICAL);
        main.setPadding(20, 20, 20, 20);
        main.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText(getTitle());
        title.setTextSize(26);
        title.setTypeface(null, Typeface.BOLD);
        title.setTextColor(Color.rgb(0, 120, 60));
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 10, 0, 20);
        main.addView(title);

        Button ru = new Button(this);
        ru.setText("Русский");
        ru.setOnClickListener(v -> {
            language = "RU";
            showScreen();
        });
        main.addView(ru);

        Button az = new Button(this);
        az.setText("Azərbaycan");
        az.setOnClickListener(v -> {
            language = "AZ";
            showScreen();
        });
        main.addView(az);

        Button en = new Button(this);
        en.setText("English");
        en.setOnClickListener(v -> {
            language = "EN";
            showScreen();
        });
        main.addView(en);

        addTopic(1);
        addTopic(2);
        addTopic(3);
        addTopic(4);
        addTopic(5);
        addTopic(6);
        addTopic(7);
        addTopic(8);
        addTopic(9);
        addTopic(10);

        Button back = new Button(this);
        back.setText(getBack());
        back.setOnClickListener(v -> finish());
        main.addView(back);

        TextView developer = new TextView(this);
        developer.setText(getDeveloper());
        developer.setTextSize(14);
        developer.setGravity(Gravity.CENTER);
        developer.setTextColor(Color.GRAY);
        developer.setPadding(0, 20, 0, 10);
        main.addView(developer);

        setContentView(main);
    }

    void addTopic(int number) {

        TextView topic = new TextView(this);

        topic.setText(getTopic(number));
        topic.setTextSize(17);
        topic.setTextColor(Color.DKGRAY);
        topic.setPadding(15, 15, 15, 15);

        main.addView(topic);
    }

    String getTitle() {

        if (language.equals("AZ")) {
            return "İŞ TƏHLÜKƏSİZLİYİ";
        }

        if (language.equals("EN")) {
            return "WORKPLACE SAFETY";
        }

        return "ОХРАНА ТРУДА";
    }

    String getBack() {

        if (language.equals("AZ")) {
            return "Geri";
        }

        if (language.equals("EN")) {
            return "Back";
        }

        return "Назад";
    }

    String getDeveloper() {

        if (language.equals("AZ")) {
            return "Tərtibatçı: Sultanov Farid Rafiq oğlu";
        }

        if (language.equals("EN")) {
            return "Developer: Sultanov Farid Rafiq oglu";
        }

        return "Разработчик: Султанов Фарид Рафиг оглы";
    }

    String getTopic(int n) {

        if (language.equals("AZ")) {
            switch (n) {

                case 1:
                    return "1. FƏRDİ MÜHAFİZƏ VASİTƏLƏRİ\n\nDəbilqə, qoruyucu eynək, əlcək, təhlükəsizlik ayaqqabısı və iş geyimindən istifadə edin.";

                case 2:
                    return "2. İŞƏ BAŞLAMAZDAN ƏVVƏL\n\nMaşının və avadanlığın vəziyyətini yoxlayın. Qoruyucuların və təhlükəsizlik sistemlərinin işlədiyinə əmin olun.";

                case 3:
                    return "3. MAŞINLA İŞ\n\nİşləyən maşının hərəkət edən hissələrinə əllə toxunmayın. Qoruyucu qurğuları çıxarmayın.";

                case 4:
                    return "4. ELEKTRİK TƏHLÜKƏSİZLİYİ\n\nZədələnmiş kabel və elektrik avadanlığından istifadə etməyin. Elektrik nasazlığı zamanı işi dayandırın və məsul şəxsə məlumat verin.";

                case 5:
                    return "5. YANĞIN TƏHLÜKƏSİZLİYİ\n\nYanğın zamanı sakit olun. Təhlükəsizdirsə, avadanlığı dayandırın, ərazini tərk edin və yanğınsöndürmə vasitələrindən istifadə edin.";

                case 6:
                    return "6. İSTİ SƏTHLƏR\n\nQızmış metal və avadanlıqlara toxunmayın. İstiyədavamlı əlcək və digər qoruyucu vasitələrdən istifadə edin.";

                case 7:
                    return "7. KİMYƏVİ MADDƏLƏR\n\nKimyəvi maddələrlə işləyərkən qoruyucu eynək, əlcək və uyğun iş geyimi istifadə edin.";

                case 8:
                    return "8. QALVANİK PROSESLƏR\n\nKimyəvi məhlullarla işləyərkən təhlükəsizlik qaydalarına riayət edin və maddələrin dəriyə və gözə düşməsinə yol verməyin.";

                case 9:
                    return "9. QƏZA ZAMANI\n\nBirbaşa təhlükə olduqda, təhlükəsizdirsə, təcili dayandırma düyməsindən istifadə edin. Təhlükəsiz yerə keçin və rəhbərə məlumat verin.";

                case 10:
                    return "10. ƏSAS QAYDA\n\nTəhlükəsizlik işdən daha vacibdir. Şübhəniz varsa, işi dayandırın və rəhbərdən kömək istəyin.";

                default:
                    return "";
            }
        }

        if (language.equals("EN")) {
            switch (n) {

                case 1:
                    return "1. PERSONAL PROTECTIVE EQUIPMENT\n\nUse a helmet, safety glasses, gloves, safety shoes and suitable work clothing.";

                case 2:
                    return "2. BEFORE STARTING WORK\n\nCheck the machine and equipment condition. Make sure guards and safety systems are working.";

                case 3:
                    return "3. MACHINE SAFETY\n\nNever touch moving machine parts. Do not remove protective guards.";

                case 4:
                    return "4. ELECTRICAL SAFETY\n\nDo not use damaged cables or electrical equipment. Stop work and report electrical problems.";

                case 5:
                    return "5. FIRE SAFETY\n\nStay calm during a fire. If it is safe, stop the equipment, leave the area and use a fire extinguisher.";

                case 6:
                    return "6. HOT SURFACES\n\nDo not touch hot metal or equipment. Use heat-resistant gloves and suitable protective equipment.";

                case 7:
                    return "7. CHEMICAL SAFETY\n\nUse safety glasses, gloves and suitable work clothing when working with chemicals.";

                case 8:
                    return "8. GALVANIC PROCESSES\n\nFollow safety rules when working with chemical solutions. Prevent contact with skin and eyes.";

                case 9:
                    return "9. EMERGENCY\n\nIf there is immediate danger, use the emergency stop if it is safe. Move to a safe area and inform your supervisor.";

                case 10:
                    return "10. MAIN RULE\n\nSafety is more important than work. If you are unsure, stop the work and ask your supervisor for help.";

                default:
                    return "";
            }
        }

        switch (n) {

            case 1:
                return "1. СРЕДСТВА ИНДИВИДУАЛЬНОЙ ЗАЩИТЫ\n\nИспользуйте каску, защитные очки, перчатки, защитную обувь и рабочую одежду.";

            case 2:
                return "2. ПЕРЕД НАЧАЛОМ РАБОТЫ\n\nПроверьте состояние станка и оборудования. Убедитесь, что защитные устройства и системы безопасности работают.";

            case 3:
                return "3. БЕЗОПАСНОСТЬ ПРИ РАБОТЕ НА СТАНКЕ\n\nНе прикасайтесь к движущимся частям станка. Не снимайте защитные ограждения.";

            case 4:
                return "4. ЭЛЕКТРОБЕЗОПАСНОСТЬ\n\nНе используйте поврежденные кабели и электрооборудование. При неисправности остановите работу и сообщите ответственному лицу.";

            case 5:
                return "5. ПОЖАРНАЯ БЕЗОПАСНОСТЬ\n\nПри пожаре сохраняйте спокойствие. Если это безопасно, остановите оборудование, покиньте опасную зону и используйте огнетушитель.";

            case 6:
                return "6. ГОРЯЧИЕ ПОВЕРХНОСТИ\n\nНе прикасайтесь к горячему металлу и оборудованию. Используйте термостойкие перчатки и подходящие средства защиты.";

            case 7:
                return "7. ХИМИЧЕСКАЯ БЕЗОПАСНОСТЬ\n\nПри работе с химическими веществами используйте защитные очки, перчатки и подходящую рабочую одежду.";

            case 8:
                return "8. ГАЛЬВАНИЧЕСКИЕ ПРОЦЕССЫ\n\nСоблюдайте правила безопасности при работе с химическими растворами. Не допускайте попадания веществ на кожу и в глаза.";

            case 9:
                return "9. АВАРИЙНАЯ СИТУАЦИЯ\n\nПри непосредственной опасности, если это безопасно, используйте кнопку аварийной остановки. Перейдите в безопасное место и сообщите руководителю.";

            case 10:
                return "10. ГЛАВНОЕ ПРАВИЛО\n\nБезопасность важнее работы. Если вы сомневаетесь, остановите работу и обратитесь за помощью к руководителю.";

            default:
                return "";
        }
    }
}