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

        list.add(new Phrase(
                english,
                russian,
                azerbaijani,
                turkish,
                german,
                category
        ));
    }

    public static List<Phrase> getPhrases() {

        List<Phrase> phrases = new ArrayList<>();

        // =====================================================
        // WORK — 20
        // =====================================================

        add(phrases,
                "I have started my shift.",
                "Я начал свою смену.",
                "Növbəmə başlamışam.",
                "Vardiyama başladım.",
                "Ich habe meine Schicht begonnen.",
                "WORK");

        add(phrases,
                "I am checking the equipment.",
                "Я проверяю оборудование.",
                "Avadanlığı yoxlayıram.",
                "Ekipmanı kontrol ediyorum.",
                "Ich überprüfe die Ausrüstung.",
                "WORK");

        add(phrases,
                "The equipment is ready.",
                "Оборудование готово.",
                "Avadanlıq hazırdır.",
                "Ekipman hazır.",
                "Die Ausrüstung ist bereit.",
                "WORK");

        add(phrases,
                "I need the work instructions.",
                "Мне нужны рабочие инструкции.",
                "Mənə iş təlimatı lazımdır.",
                "Çalışma talimatlarına ihtiyacım var.",
                "Ich brauche die Arbeitsanweisungen.",
                "WORK");

        add(phrases,
                "Where can I find the instructions?",
                "Где я могу найти инструкции?",
                "Təlimatları harada tapa bilərəm?",
                "Talimatları nerede bulabilirim?",
                "Wo kann ich die Anweisungen finden?",
                "WORK");

        add(phrases,
                "I am following the instructions.",
                "Я следую инструкциям.",
                "Təlimatlara əməl edirəm.",
                "Talimatlara uyuyorum.",
                "Ich befolge die Anweisungen.",
                "WORK");

        add(phrases,
                "I have checked everything.",
                "Я всё проверил.",
                "Hər şeyi yoxlamışam.",
                "Her şeyi kontrol ettim.",
                "Ich habe alles überprüft.",
                "WORK");

        add(phrases,
                "Everything is ready.",
                "Всё готово.",
                "Hər şey hazırdır.",
                "Her şey hazır.",
                "Alles ist bereit.",
                "WORK");

        add(phrases,
                "I am waiting for the next task.",
                "Я жду следующего задания.",
                "Növbəti tapşırığı gözləyirəm.",
                "Bir sonraki görevi bekliyorum.",
                "Ich warte auf die nächste Aufgabe.",
                "WORK");

        add(phrases,
                "Can I start the machine?",
                "Я могу запустить станок?",
                "Dəzgahı işə sala bilərəm?",
                "Makineyi çalıştırabilir miyim?",
                "Kann ich die Maschine starten?",
                "WORK");

        add(phrases,
                "Can I start the job?",
                "Я могу начать работу?",
                "İşə başlaya bilərəm?",
                "İşe başlayabilir miyim?",
                "Kann ich mit der Arbeit beginnen?",
                "WORK");

        add(phrases,
                "Please give me the drawing.",
                "Пожалуйста, дайте мне чертёж.",
                "Zəhmət olmasa mənə çertyoju verin.",
                "Lütfen bana teknik resmi verin.",
                "Bitte geben Sie mir die Zeichnung.",
                "WORK");

        add(phrases,
                "I need the drawing number.",
                "Мне нужен номер чертежа.",
                "Mənə çertyoj nömrəsi lazımdır.",
                "Teknik resim numarasına ihtiyacım var.",
                "Ich brauche die Zeichnungsnummer.",
                "WORK");

        add(phrases,
                "I need the part number.",
                "Мне нужен номер детали.",
                "Mənə detalın nömrəsi lazımdır.",
                "Parça numarasına ihtiyacım var.",
                "Ich brauche die Teilenummer.",
                "WORK");

        add(phrases,
                "Please repeat the task.",
                "Пожалуйста, повторите задание.",
                "Zəhmət olmasa tapşırığı təkrarlayın.",
                "Lütfen görevi tekrar edin.",
                "Bitte wiederholen Sie die Aufgabe.",
                "WORK");

        add(phrases,
                "I will finish it today.",
                "Я закончу это сегодня.",
                "Bunu bu gün bitirəcəyəm.",
                "Bunu bugün bitireceğim.",
                "Ich werde es heute fertigstellen.",
                "WORK");

        add(phrases,
                "I have a question.",
                "У меня есть вопрос.",
                "Mənim sualım var.",
                "Bir sorum var.",
                "Ich habe eine Frage.",
                "WORK");

        add(phrases,
                "Please wait a moment.",
                "Пожалуйста, подождите минуту.",
                "Zəhmət olmasa bir dəqiqə gözləyin.",
                "Lütfen bir dakika bekleyin.",
                "Bitte warten Sie einen Moment.",
                "WORK");

        add(phrases,
                "The material is ready.",
                "Материал готов.",
                "Material hazırdır.",
                "Malzeme hazır.",
                "Das Material ist bereit.",
                "WORK");

        add(phrases,
                "We can continue the work.",
                "Мы можем продолжить работу.",
                "İşi davam etdirə bilərik.",
                "Çalışmaya devam edebiliriz.",
                "Wir können die Arbeit fortsetzen.",
                "WORK");


        // =====================================================
        // CNC — 20
        // =====================================================

        add(phrases,
                "Check the CNC program.",
                "Проверь программу CNC.",
                "CNC proqramını yoxla.",
                "CNC programını kontrol et.",
                "Überprüfe das CNC-Programm.",
                "CNC");

        add(phrases,
                "Load the CNC program.",
                "Загрузи программу CNC.",
                "CNC proqramını yüklə.",
                "CNC programını yükle.",
                "Lade das CNC-Programm.",
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
                "Set the zero point.",
                "Установи нулевую точку.",
                "Sıfır nöqtəsini təyin et.",
                "Sıfır noktasını ayarla.",
                "Stelle den Nullpunkt ein.",
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
                "The tool is worn.",
                "Инструмент изношен.",
                "Alət aşınıb.",
                "Takım aşınmış.",
                "Das Werkzeug ist verschlissen.",
                "CNC");

        add(phrases,
                "Check the feed rate.",
                "Проверь скорость подачи.",
                "Veriş sürətini yoxla.",
                "İlerleme hızını kontrol et.",
                "Überprüfe den Vorschub.",
                "CNC");

        add(phrases,
                "Check the spindle speed.",
                "Проверь обороты шпинделя.",
                "Şpindelin dövr sayını yoxla.",
                "İş mili devrini kontrol et.",
                "Überprüfe die Spindeldrehzahl.",
                "CNC");

        add(phrases,
                "Start the CNC cycle.",
                "Запусти цикл CNC.",
                "CNC tsiklini işə sal.",
                "CNC çevrimini başlat.",
                "Starte den CNC-Zyklus.",
                "CNC");

        add(phrases,
                "Stop the CNC cycle.",
                "Останови цикл CNC.",
                "CNC tsiklini dayandır.",
                "CNC çevrimini durdur.",
                "Stoppe den CNC-Zyklus.",
                "CNC");

        add(phrases,
                "The cycle is finished.",
                "Цикл закончен.",
                "Tsikl bitib.",
                "Çevrim tamamlandı.",
                "Der Zyklus ist beendet.",
                "CNC");

        add(phrases,
                "Check the program number.",
                "Проверь номер программы.",
                "Proqram nömrəsini yoxla.",
                "Program numarasını kontrol et.",
                "Überprüfe die Programmnummer.",
                "CNC");

        add(phrases,
                "There is a CNC alarm.",
                "Есть аварийный сигнал CNC.",
                "CNC siqnalizasiyası var.",
                "CNC alarmı var.",
                "Es gibt einen CNC-Alarm.",
                "CNC");

        add(phrases,
                "Reset the alarm.",
                "Сбрось аварийный сигнал.",
                "Siqnalizasiyanı sıfırla.",
                "Alarmı sıfırla.",
                "Setze den Alarm zurück.",
                "CNC");

        add(phrases,
                "Check the coolant.",
                "Проверь охлаждающую жидкость.",
                "Soyuducu mayeni yoxla.",
                "Soğutma sıvısını kontrol et.",
                "Überprüfe die Kühlflüssigkeit.",
                "CNC");

        add(phrases,
                "The coolant level is low.",
                "Уровень охлаждающей жидкости низкий.",
                "Soyuducu mayenin səviyyəsi aşağıdır.",
                "Soğutma sıvısı seviyesi düşük.",
                "Der Kühlmittelstand ist niedrig.",
                "CNC");

        add(phrases,
                "Measure the finished part.",
                "Измерь готовую деталь.",
                "Hazır detalı ölç.",
                "Bitmiş parçayı ölç.",
                "Miss das fertige Teil.",
                "CNC");


        // =====================================================
        // MACHINE — 15
        // =====================================================

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

        add(phrases,
                "The machine is overheating.",
                "Станок перегревается.",
                "Dəzgah həddindən artıq qızır.",
                "Makine aşırı ısınıyor.",
                "Die Maschine überhitzt.",
                "MACHINE");

        add(phrases,
                "Check the pressure.",
                "Проверь давление.",
                "Təzyiqi yoxla.",
                "Basıncı kontrol et.",
                "Überprüfe den Druck.",
                "MACHINE");

        add(phrases,
                "Check the power supply.",
                "Проверь электропитание.",
                "Elektrik təchizatını yoxla.",
                "Güç kaynağını kontrol et.",
                "Überprüfe die Stromversorgung.",
                "MACHINE");


        // =====================================================
        // SAFETY — 15
        // =====================================================

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

        add(phrases,
                "Keep the workplace clean.",
                "Держи рабочее место в чистоте.",
                "İş yerini təmiz saxla.",
                "Çalışma alanını temiz tut.",
                "Halte den Arbeitsplatz sauber.",
                "SAFETY");

        add(phrases,
                "Do not remove the safety guard.",
                "Не снимай защитное ограждение.",
                "Qoruyucu örtüyü çıxarma.",
                "Koruyucu kapağı çıkarma.",
                "Entferne die Schutzvorrichtung nicht.",
                "SAFETY");

        add(phrases,
                "Turn off the power before maintenance.",
                "Перед обслуживанием отключи питание.",
                "Texniki xidmətdən əvvəl enerjini söndür.",
                "Bakım öncesi enerjiyi kapat.",
                "Schalte vor der Wartung die Stromversorgung aus.",
                "SAFETY");

        add(phrases,
                "Use the correct protective equipment.",
                "Используй правильные средства защиты.",
                "Düzgün qoruyucu vasitələrdən istifadə et.",
                "Doğru koruyucu ekipmanı kullan.",
                "Verwende die richtige Schutzausrüstung.",
                "SAFETY");

        add(phrases,
                "Report unsafe conditions.",
                "Сообщай об опасных условиях.",
                "Təhlükəli vəziyyətlər barədə məlumat ver.",
                "Güvenli olmayan durumları bildir.",
                "Melde unsichere Bedingungen.",
                "SAFETY");


        // =====================================================
        // QUALITY — 10
        // =====================================================

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


        // =====================================================
        // STAMPING — 10
        // =====================================================

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
                "Punçu kontrol et.",
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


        // =====================================================
        // FIRE — 5
        // =====================================================

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


        // =====================================================
        // EMERGENCY — 5
        // =====================================================

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


        return phrases;
    }
}