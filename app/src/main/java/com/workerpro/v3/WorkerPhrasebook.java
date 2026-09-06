package com.workerpro.v3;

import java.util.ArrayList;
import java.util.List;

public class WorkerPhrasebook {

    public static class Phrase {

        public String english;
        public String russian;
        public String azerbaijani;
        public String turkish;
        public String german;
        public String category;

        public Phrase(
                String english,
                String russian,
                String azerbaijani,
                String turkish,
                String german,
                String category) {

            this.english = english;
            this.russian = russian;
            this.azerbaijani = azerbaijani;
            this.turkish = turkish;
            this.german = german;
            this.category = category;
        }

        // Для совместимости со старым кодом
        public Phrase(
                String english,
                String russian,
                String azerbaijani,
                String category) {

            this(
                    english,
                    russian,
                    azerbaijani,
                    english,
                    english,
                    category
            );
        }
    }

    private static void add(
            List<Phrase> list,
            String english,
            String russian,
            String azerbaijani,
            String turkish,
            String german,
            String category) {

        list.add(
                new Phrase(
                        english,
                        russian,
                        azerbaijani,
                        turkish,
                        german,
                        category
                )
        );
    }

    public static List<Phrase> getPhrases() {

        List<Phrase> phrases = new ArrayList<>();

        // ================= WORK =================

        add(phrases,
                "I am ready to start work.",
                "Я готов начать работу.",
                "İşə başlamağa hazıram.",
                "İşe başlamaya hazırım.",
                "Ich bin bereit, mit der Arbeit zu beginnen.",
                "WORK");

        add(phrases,
                "I am starting my work.",
                "Я начинаю работу.",
                "İşə başlayıram.",
                "İşime başlıyorum.",
                "Ich beginne meine Arbeit.",
                "WORK");

        add(phrases,
                "What is my task today?",
                "Какое у меня сегодня задание?",
                "Bu gün mənim tapşırığım nədir?",
                "Bugünkü görevim nedir?",
                "Was ist heute meine Aufgabe?",
                "WORK");

        add(phrases,
                "What should I do?",
                "Что мне делать?",
                "Nə etməliyəm?",
                "Ne yapmalıyım?",
                "Was soll ich tun?",
                "WORK");

        add(phrases,
                "I have finished my task.",
                "Я закончил своё задание.",
                "Tapşırığımı bitirmişəm.",
                "Görevimi bitirdim.",
                "Ich habe meine Aufgabe beendet.",
                "WORK");

        add(phrases,
                "I need more time.",
                "Мне нужно больше времени.",
                "Mənə daha çox vaxt lazımdır.",
                "Daha fazla zamana ihtiyacım var.",
                "Ich brauche mehr Zeit.",
                "WORK");

        add(phrases,
                "The work is finished.",
                "Работа закончена.",
                "İş bitib.",
                "İş bitti.",
                "Die Arbeit ist fertig.",
                "WORK");

        add(phrases,
                "Please check my work.",
                "Пожалуйста, проверьте мою работу.",
                "Zəhmət olmasa işimi yoxlayın.",
                "Lütfen işimi kontrol edin.",
                "Bitte überprüfen Sie meine Arbeit.",
                "WORK");

        add(phrases,
                "I understand.",
                "Я понимаю.",
                "Başa düşürəm.",
                "Anlıyorum.",
                "Ich verstehe.",
                "WORK");

        add(phrases,
                "I don't understand.",
                "Я не понимаю.",
                "Başa düşmürəm.",
                "Anlamıyorum.",
                "Ich verstehe nicht.",
                "WORK");

        add(phrases,
                "Please explain again.",
                "Пожалуйста, объясните ещё раз.",
                "Zəhmət olmasa bir daha izah edin.",
                "Lütfen tekrar açıklayın.",
                "Bitte erklären Sie noch einmal.",
                "WORK");

        add(phrases,
                "Can you show me?",
                "Можете мне показать?",
                "Mənə göstərə bilərsiniz?",
                "Bana gösterebilir misiniz?",
                "Können Sie es mir zeigen?",
                "WORK");

        add(phrases,
                "I need help.",
                "Мне нужна помощь.",
                "Mənə kömək lazımdır.",
                "Yardıma ihtiyacım var.",
                "Ich brauche Hilfe.",
                "WORK");

        add(phrases,
                "I can do it.",
                "Я могу это сделать.",
                "Mən bunu edə bilərəm.",
                "Bunu yapabilirim.",
                "Ich kann das machen.",
                "WORK");

        add(phrases,
                "I cannot do it alone.",
                "Я не могу сделать это один.",
                "Mən bunu tək edə bilmirəm.",
                "Bunu tek başıma yapamam.",
                "Ich kann das nicht allein machen.",
                "WORK");


        // ================= BOSS =================

        add(phrases,
                "Good morning, boss.",
                "Доброе утро, начальник.",
                "Sabahınız xeyir, rəhbər.",
                "Günaydın, patron.",
                "Guten Morgen, Chef.",
                "BOSS");

        add(phrases,
                "What should I do next?",
                "Что мне делать дальше?",
                "Sonra nə etməliyəm?",
                "Sonra ne yapmalıyım?",
                "Was soll ich als Nächstes tun?",
                "BOSS");

        add(phrases,
                "Is this correct?",
                "Это правильно?",
                "Bu düzgündür?",
                "Bu doğru mu?",
                "Ist das richtig?",
                "BOSS");

        add(phrases,
                "Please check this part.",
                "Пожалуйста, проверьте эту деталь.",
                "Zəhmət olmasa bu detalı yoxlayın.",
                "Lütfen bu parçayı kontrol edin.",
                "Bitte überprüfen Sie dieses Teil.",
                "BOSS");

        add(phrases,
                "The machine has a problem.",
                "У станка проблема.",
                "Dəzgahda problem var.",
                "Makinede bir sorun var.",
                "Die Maschine hat ein Problem.",
                "BOSS");

        add(phrases,
                "The machine stopped.",
                "Станок остановился.",
                "Dəzgah dayandı.",
                "Makine durdu.",
                "Die Maschine ist stehen geblieben.",
                "BOSS");

        add(phrases,
                "We need maintenance.",
                "Нам нужно техническое обслуживание.",
                "Bizə texniki xidmət lazımdır.",
                "Bakım yapmamız gerekiyor.",
                "Wir brauchen Wartung.",
                "BOSS");

        add(phrases,
                "The tool is worn.",
                "Инструмент изношен.",
                "Alət aşınıb.",
                "Takım aşınmış.",
                "Das Werkzeug ist verschlissen.",
                "BOSS");

        add(phrases,
                "The part is defective.",
                "Деталь бракованная.",
                "Detal qüsurludur.",
                "Parça kusurlu.",
                "Das Teil ist fehlerhaft.",
                "BOSS");

        add(phrases,
                "The measurement is not correct.",
                "Измерение неправильное.",
                "Ölçmə düzgün deyil.",
                "Ölçüm doğru değil.",
                "Die Messung ist nicht korrekt.",
                "BOSS");

        add(phrases,
                "I found a defect.",
                "Я нашёл дефект.",
                "Qüsur tapdım.",
                "Bir kusur buldum.",
                "Ich habe einen Fehler gefunden.",
                "BOSS");

        add(phrases,
                "We need to stop the machine.",
                "Нужно остановить станок.",
                "Dəzgahı dayandırmaq lazımdır.",
                "Makineyi durdurmamız gerekiyor.",
                "Wir müssen die Maschine stoppen.",
                "BOSS");


        // ================= MACHINE =================

        add(phrases,
                "Start the machine.",
                "Запусти станок.",
                "Dəzgahı işə sal.",
                "Makineyi çalıştır.",
                "Starte die Maschine.",
                "MACHINE");

        add(phrases,
                "Stop the machine.",
                "Останови станок.",
                "Dəzgahı dayandır.",
                "Makineyi durdur.",
                "Stoppe die Maschine.",
                "MACHINE");

        add(phrases,
                "The machine is running.",
                "Станок работает.",
                "Dəzgah işləyir.",
                "Makine çalışıyor.",
                "Die Maschine läuft.",
                "MACHINE");

        add(phrases,
                "The machine is not working.",
                "Станок не работает.",
                "Dəzgah işləmir.",
                "Makine çalışmıyor.",
                "Die Maschine funktioniert nicht.",
                "MACHINE");

        add(phrases,
                "Check the machine.",
                "Проверь станок.",
                "Dəzgahı yoxla.",
                "Makineyi kontrol et.",
                "Überprüfe die Maschine.",
                "MACHINE");

        add(phrases,
                "Check the sensor.",
                "Проверь датчик.",
                "Sensoru yoxla.",
                "Sensörü kontrol et.",
                "Überprüfe den Sensor.",
                "MACHINE");

        add(phrases,
                "The sensor is not working.",
                "Датчик не работает.",
                "Sensor işləmir.",
                "Sensör çalışmıyor.",
                "Der Sensor funktioniert nicht.",
                "MACHINE");

        add(phrases,
                "There is an error.",
                "Есть ошибка.",
                "Səhv var.",
                "Bir hata var.",
                "Es gibt einen Fehler.",
                "MACHINE");

        add(phrases,
                "Check the error code.",
                "Проверь код ошибки.",
                "Səhv kodunu yoxla.",
                "Hata kodunu kontrol et.",
                "Überprüfe den Fehlercode.",
                "MACHINE");

        add(phrases,
                "The motor is hot.",
                "Двигатель горячий.",
                "Mühərrik istidir.",
                "Motor sıcak.",
                "Der Motor ist heiß.",
                "MACHINE");

        add(phrases,
                "The machine is making noise.",
                "Станок издаёт шум.",
                "Dəzgah səs-küy yaradır.",
                "Makine gürültü yapıyor.",
                "Die Maschine macht Geräusche.",
                "MACHINE");

        add(phrases,
                "There is vibration.",
                "Есть вибрация.",
                "Vibrasiya var.",
                "Titreşim var.",
                "Es gibt Vibrationen.",
                "MACHINE");


        // ================= CNC =================

        add(phrases,
                "Check the CNC program.",
                "Проверь программу CNC.",
                "CNC proqramını yoxla.",
                "CNC programını kontrol et.",
                "Überprüfe das CNC-Programm.",
                "CNC");

        add(phrases,
                "Start the CNC program.",
                "Запусти программу CNC.",
                "CNC proqramını işə sal.",
                "CNC programını başlat.",
                "Starte das CNC-Programm.",
                "CNC");

        add(phrases,
                "Stop the CNC program.",
                "Останови программу CNC.",
                "CNC proqramını dayandır.",
                "CNC programını durdur.",
                "Stoppe das CNC-Programm.",
                "CNC");

        add(phrases,
                "Check the coordinates.",
                "Проверь координаты.",
                "Koordinatları yoxla.",
                "Koordinatları kontrol et.",
                "Überprüfe die Koordinaten.",
                "CNC");

        add(phrases,
                "Check the zero point.",
                "Проверь нулевую точку.",
                "Sıfır nöqtəsini yoxla.",
                "Sıfır noktasını kontrol et.",
                "Überprüfe den Nullpunkt.",
                "CNC");

        add(phrases,
                "Check the tool number.",
                "Проверь номер инструмента.",
                "Alət nömrəsini yoxla.",
                "Takım numarasını kontrol et.",
                "Überprüfe die Werkzeugnummer.",
                "CNC");

        add(phrases,
                "Change the tool.",
                "Замени инструмент.",
                "Aləti dəyiş.",
                "Takımı değiştir.",
                "Wechsle das Werkzeug.",
                "CNC");

        add(phrases,
                "The tool is broken.",
                "Инструмент сломан.",
                "Alət sınıb.",
                "Takım kırılmış.",
                "Das Werkzeug ist gebrochen.",
                "CNC");

        add(phrases,
                "Check the feed rate.",
                "Проверь скорость подачи.",
                "Veriş sürətini yoxla.",
                "İlerleme hızını kontrol et.",
                "Überprüfe den Vorschub.",
                "CNC");

        add(phrases,
                "The cycle is finished.",
                "Цикл закончен.",
                "Tsikl bitib.",
                "Çevrim tamamlandı.",
                "Der Zyklus ist beendet.",
                "CNC");


        // ================= STAMPING =================

        add(phrases,
                "The stamping machine is ready.",
                "Штамповочная машина готова.",
                "Ştamplama maşını hazırdır.",
                "Pres makinesi hazır.",
                "Die Stanzmaschine ist bereit.",
                "STAMPING");

        add(phrases,
                "Check the die.",
                "Проверь матрицу.",
                "Matrisi yoxla.",
                "Kalıbı kontrol et.",
                "Überprüfe die Matrize.",
                "STAMPING");

        add(phrases,
                "Check the punch.",
                "Проверь пуансон.",
                "Puansonu yoxla.",
                "Punç'u kontrol et.",
                "Überprüfe den Stempel.",
                "STAMPING");

        add(phrases,
                "The die is damaged.",
                "Матрица повреждена.",
                "Matris zədələnib.",
                "Kalıp hasarlı.",
                "Die Matrize ist beschädigt.",
                "STAMPING");

        add(phrases,
                "The punch is worn.",
                "Пуансон изношен.",
                "Puanson aşınıb.",
                "Punç aşınmış.",
                "Der Stempel ist verschlissen.",
                "STAMPING");

        add(phrases,
                "Check the blank thickness.",
                "Проверь толщину заготовки.",
                "Pəstah qalınlığını yoxla.",
                "Taslak kalınlığını kontrol et.",
                "Überprüfe die Dicke des Rohlings.",
                "STAMPING");

        add(phrases,
                "The stamping force is too high.",
                "Усилие штамповки слишком высокое.",
                "Ştamplama qüvvəsi çox yüksəkdir.",
                "Presleme kuvveti çok yüksek.",
                "Die Stanzkraft ist zu hoch.",
                "STAMPING");

        add(phrases,
                "The part has a defect.",
                "На детали есть дефект.",
                "Detalda qüsur var.",
                "Parçada kusur var.",
                "Das Teil hat einen Fehler.",
                "STAMPING");

        add(phrases,
                "Stop the press.",
                "Останови пресс.",
                "Presi dayandır.",
                "Presi durdur.",
                "Stoppe die Presse.",
                "STAMPING");

        add(phrases,
                "Check the finished part.",
                "Проверь готовую деталь.",
                "Hazır detalı yoxla.",
                "Bitmiş parçayı kontrol et.",
                "Überprüfe das fertige Teil.",
                "STAMPING");


        // ================= QUALITY =================

        add(phrases,
                "Check the quality.",
                "Проверь качество.",
                "Keyfiyyəti yoxla.",
                "Kaliteyi kontrol et.",
                "Überprüfe die Qualität.",
                "QUALITY");

        add(phrases,
                "The quality is good.",
                "Качество хорошее.",
                "Keyfiyyət yaxşıdır.",
                "Kalite iyi.",
                "Die Qualität ist gut.",
                "QUALITY");

        add(phrases,
                "The quality is not good.",
                "Качество плохое.",
                "Keyfiyyət yaxşı deyil.",
                "Kalite iyi değil.",
                "Die Qualität ist nicht gut.",
                "QUALITY");

        add(phrases,
                "I found a crack.",
                "Я нашёл трещину.",
                "Çat tapdım.",
                "Bir çatlak buldum.",
                "Ich habe einen Riss gefunden.",
                "QUALITY");

        add(phrases,
                "There is a burr.",
                "Есть заусенец.",
                "Qrat var.",
                "Çapak var.",
                "Es gibt einen Grat.",
                "QUALITY");

        add(phrases,
                "The dimension is correct.",
                "Размер правильный.",
                "Ölçü düzgündür.",
                "Ölçü doğru.",
                "Das Maß ist korrekt.",
                "QUALITY");

        add(phrases,
                "The dimension is not correct.",
                "Размер неправильный.",
                "Ölçü düzgün deyil.",
                "Ölçü doğru değil.",
                "Das Maß ist nicht korrekt.",
                "QUALITY");

        add(phrases,
                "Check the tolerance.",
                "Проверь допуск.",
                "Toleransı yoxla.",
                "Toleransı kontrol et.",
                "Überprüfe die Toleranz.",
                "QUALITY");

        add(phrases,
                "This part is rejected.",
                "Эта деталь забракована.",
                "Bu detal rədd edilib.",
                "Bu parça reddedildi.",
                "Dieses Teil wurde abgelehnt.",
                "QUALITY");

        add(phrases,
                "The inspection is complete.",
                "Проверка завершена.",
                "Yoxlama tamamlandı.",
                "Kontrol tamamlandı.",
                "Die Prüfung ist abgeschlossen.",
                "QUALITY");


        // ================= SAFETY =================

        add(phrases,
                "Safety first.",
                "Безопасность прежде всего.",
                "Təhlükəsizlik hər şeydən əvvəl.",
                "Önce güvenlik.",
                "Sicherheit geht vor.",
                "SAFETY");

        add(phrases,
                "Wear your safety glasses.",
                "Надень защитные очки.",
                "Qoruyucu eynəyini tax.",
                "Koruyucu gözlüğünü tak.",
                "Trage deine Schutzbrille.",
                "SAFETY");

        add(phrases,
                "Wear your gloves.",
                "Надень перчатки.",
                "Əlcəklərini tax.",
                "Eldivenlerini tak.",
                "Ziehe deine Handschuhe an.",
                "SAFETY");

        add(phrases,
                "Wear your safety shoes.",
                "Надень защитную обувь.",
                "Qoruyucu ayaqqabını geyin.",
                "İş güvenliği ayakkabılarını giy.",
                "Trage deine Sicherheitsschuhe.",
                "SAFETY");

        add(phrases,
                "Wear your helmet.",
                "Надень каску.",
                "Dəbilqəni tax.",
                "Baretini tak.",
                "Trage deinen Helm.",
                "SAFETY");

        add(phrases,
                "Be careful.",
                "Будь осторожен.",
                "Ehtiyatlı ol.",
                "Dikkatli ol.",
                "Sei vorsichtig.",
                "SAFETY");

        add(phrases,
                "This is dangerous.",
                "Это опасно.",
                "Bu təhlükəlidir.",
                "Bu tehlikeli.",
                "Das ist gefährlich.",
                "SAFETY");

        add(phrases,
                "Do not touch the machine.",
                "Не трогай станок.",
                "Dəzgaha toxunma.",
                "Makineye dokunma.",
                "Berühre die Maschine nicht.",
                "SAFETY");

        add(phrases,
                "Stop work immediately.",
                "Немедленно прекрати работу.",
                "Dərhal işi dayandır.",
                "İşi hemen durdur.",
                "Stelle die Arbeit sofort ein.",
                "SAFETY");

        add(phrases,
                "Follow the safety rules.",
                "Соблюдай правила безопасности.",
                "Təhlükəsizlik qaydalarına əməl et.",
                "Güvenlik kurallarına uy.",
                "Befolge die Sicherheitsregeln.",
                "SAFETY");


        // ================= FIRE =================

        add(phrases,
                "There is a fire.",
                "Пожар.",
                "Yanğın var.",
                "Yangın var.",
                "Es gibt einen Brand.",
                "FIRE");

        add(phrases,
                "Call the fire department.",
                "Вызовите пожарную службу.",
                "Yanğınsöndürmə xidmətinə zəng edin.",
                "İtfaiyeyi arayın.",
                "Rufen Sie die Feuerwehr.",
                "FIRE");

        add(phrases,
                "Use the fire extinguisher.",
                "Используй огнетушитель.",
                "Yanğınsöndürəndən istifadə et.",
                "Yangın söndürücüyü kullan.",
                "Benutze den Feuerlöscher.",
                "FIRE");

        add(phrases,
                "Where is the fire extinguisher?",
                "Где огнетушитель?",
                "Yanğınsöndürən haradadır?",
                "Yangın söndürücü nerede?",
                "Wo ist der Feuerlöscher?",
                "FIRE");

        add(phrases,
                "Where is the emergency exit?",
                "Где аварийный выход?",
                "Fövqəladə çıxış haradadır?",
                "Acil çıkış nerede?",
                "Wo ist der Notausgang?",
                "FIRE");

        add(phrases,
                "Go to the muster point.",
                "Идите к месту сбора.",
                "Toplanış yerinə gedin.",
                "Toplanma noktasına gidin.",
                "Gehen Sie zum Sammelplatz.",
                "FIRE");

        add(phrases,
                "Do not use water on an electrical fire.",
                "Не используй воду при электрическом пожаре.",
                "Elektrik yanğınında sudan istifadə etmə.",
                "Elektrik yangınında su kullanma.",
                "Verwende kein Wasser bei einem Elektrobrand.",
                "FIRE");

        add(phrases,
                "There is smoke.",
                "Есть дым.",
                "Tüstü var.",
                "Duman var.",
                "Es gibt Rauch.",
                "FIRE");


        // ================= WELDING =================

        add(phrases,
                "The welding machine is ready.",
                "Сварочный аппарат готов.",
                "Qaynaq aparatı hazırdır.",
                "Kaynak makinesi hazır.",
                "Das Schweißgerät ist bereit.",
                "WELDING");

        add(phrases,
                "Check the welding cable.",
                "Проверь сварочный кабель.",
                "Qaynaq kabelini yoxla.",
                "Kaynak kablosunu kontrol et.",
                "Überprüfe das Schweißkabel.",
                "WELDING");

        add(phrases,
                "Check the electrode.",
                "Проверь электрод.",
                "Elektrodu yoxla.",
                "Elektrodu kontrol et.",
                "Überprüfe die Elektrode.",
                "WELDING");

        add(phrases,
                "The weld is good.",
                "Сварка хорошая.",
                "Qaynaq yaxşıdır.",
                "Kaynak iyi.",
                "Die Schweißnaht ist gut.",
                "WELDING");

        add(phrases,
                "The weld has a defect.",
                "В сварке есть дефект.",
                "Qaynaqda qüsur var.",
                "Kaynakta kusur var.",
                "Die Schweißnaht hat einen Fehler.",
                "WELDING");

        add(phrases,
                "Wear a welding mask.",
                "Надень сварочную маску.",
                "Qaynaq maskasını tax.",
                "Kaynak maskesini tak.",
                "Trage eine Schweißmaske.",
                "WELDING");


        // ================= GALVANIC =================

        add(phrases,
                "Check the bath temperature.",
                "Проверь температуру ванны.",
                "Vannanın temperaturunu yoxla.",
                "Banyo sıcaklığını kontrol et.",
                "Überprüfe die Badtemperatur.",
                "GALVANIC");

        add(phrases,
                "Check the bath level.",
                "Проверь уровень ванны.",
                "Vannanın səviyyəsini yoxla.",
                "Banyo seviyesini kontrol et.",
                "Überprüfe den Badpegel.",
                "GALVANIC");

        add(phrases,
                "Check the pH value.",
                "Проверь значение pH.",
                "pH dəyərini yoxla.",
                "pH değerini kontrol et.",
                "Überprüfe den pH-Wert.",
                "GALVANIC");

        add(phrases,
                "The coating is too thin.",
                "Покрытие слишком тонкое.",
                "Örtük çox nazikdir.",
                "Kaplama çok ince.",
                "Die Beschichtung ist zu dünn.",
                "GALVANIC");

        add(phrases,
                "The coating is damaged.",
                "Покрытие повреждено.",
                "Örtük zədələnib.",
                "Kaplama hasarlı.",
                "Die Beschichtung ist beschädigt.",
                "GALVANIC");

        add(phrases,
                "There is a chemical spill.",
                "Произошёл разлив химического вещества.",
                "Kimyəvi maddə dağılıb.",
                "Kimyasal madde döküldü.",
                "Es gibt eine Chemikalienverschüttung.",
                "GALVANIC");

        add(phrases,
                "Use the eye wash station.",
                "Используй станцию промывания глаз.",
                "Göz yuma stansiyasından istifadə et.",
                "Göz yıkama istasyonunu kullan.",
                "Benutze die Augenspülstation.",
                "GALVANIC");


        // ================= MAINTENANCE =================

        add(phrases,
                "The machine needs maintenance.",
                "Станку нужно обслуживание.",
                "Dəzgaha texniki xidmət lazımdır.",
                "Makinenin bakıma ihtiyacı var.",
                "Die Maschine braucht Wartung.",
                "MAINTENANCE");

        add(phrases,
                "The machine needs repair.",
                "Станку нужен ремонт.",
                "Dəzgaha təmir lazımdır.",
                "Makinenin tamire ihtiyacı var.",
                "Die Maschine muss repariert werden.",
                "MAINTENANCE");

        add(phrases,
                "Check the oil level.",
                "Проверь уровень масла.",
                "Yağ səviyyəsini yoxla.",
                "Yağ seviyesini kontrol et.",
                "Überprüfe den Ölstand.",
                "MAINTENANCE");

        add(phrases,
                "Add lubricant.",
                "Добавь смазку.",
                "Sürtkü əlavə et.",
                "Yağlayıcı ekle.",
                "Füge Schmiermittel hinzu.",
                "MAINTENANCE");

        add(phrases,
                "Replace the filter.",
                "Замени фильтр.",
                "Filtri dəyiş.",
                "Filtreyi değiştir.",
                "Ersetze den Filter.",
                "MAINTENANCE");

        add(phrases,
                "The bearing is worn.",
                "Подшипник изношен.",
                "Yastıqça aşınıb.",
                "Rulman aşınmış.",
                "Das Lager ist verschlissen.",
                "MAINTENANCE");

        add(phrases,
                "The belt is damaged.",
                "Ремень повреждён.",
                "Kəmər zədələnib.",
                "Kayış hasarlı.",
                "Der Riemen ist beschädigt.",
                "MAINTENANCE");


        // ================= EMERGENCY =================

        add(phrases,
                "Emergency!",
                "Авария!",
                "Fövqəladə vəziyyət!",
                "Acil durum!",
                "Notfall!",
                "EMERGENCY");

        add(phrases,
                "Stop the machine immediately!",
                "Немедленно останови станок!",
                "Dəzgahı dərhal dayandır!",
                "Makineyi hemen durdur!",
                "Stoppe die Maschine sofort!",
                "EMERGENCY");

        add(phrases,
                "Press the emergency stop button.",
                "Нажми кнопку аварийной остановки.",
                "Fövqəladə dayandırma düyməsini bas.",
                "Acil durdurma düğmesine bas.",
                "Drücke die Not-Aus-Taste.",
                "EMERGENCY");

        add(phrases,
                "Call for help!",
                "Позовите на помощь!",
                "Kömək çağırın!",
                "Yardım çağırın!",
                "Rufen Sie Hilfe!",
                "EMERGENCY");

        add(phrases,
                "Someone is injured.",
                "Кто-то получил травму.",
                "Kimsə xəsarət alıb.",
                "Birisi yaralandı.",
                "Jemand wurde verletzt.",
                "EMERGENCY");

        add(phrases,
                "Do not move the injured person.",
                "Не перемещайте пострадавшего.",
                "Xəsarət alan şəxsi hərəkət etdirməyin.",
                "Yaralı kişiyi hareket ettirmeyin.",
                "Bewegen Sie die verletzte Person nicht.",
                "EMERGENCY");

        add(phrases,
                "Leave the area.",
                "Покиньте эту зону.",
                "Bu ərazini tərk edin.",
                "Bölgeyi terk edin.",
                "Verlassen Sie den Bereich.",
                "EMERGENCY");

        add(phrases,
                "Follow the emergency route.",
                "Следуйте по аварийному маршруту.",
                "Fövqəladə marşrutla gedin.",
                "Acil durum güzergahını takip edin.",
                "Folgen Sie dem Notfallweg.",
                "EMERGENCY");

        return phrases;
    }
}