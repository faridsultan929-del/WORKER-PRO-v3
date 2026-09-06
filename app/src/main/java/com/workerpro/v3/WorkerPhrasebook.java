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
        // WORK
        // =====================================================

        add(phrases,"I am ready to start work.","Я готов начать работу.","İşə başlamağa hazıram.","İşe başlamaya hazırım.","Ich bin bereit, mit der Arbeit zu beginnen.","WORK");
        add(phrases,"I am starting my work.","Я начинаю работу.","İşə başlayıram.","İşime başlıyorum.","Ich beginne meine Arbeit.","WORK");
        add(phrases,"What is my task today?","Какое у меня сегодня задание?","Bu gün mənim tapşırığım nədir?","Bugünkü görevim nedir?","Was ist heute meine Aufgabe?","WORK");
        add(phrases,"What should I do?","Что мне делать?","Nə etməliyəm?","Ne yapmalıyım?","Was soll ich tun?","WORK");
        add(phrases,"I have finished my task.","Я закончил своё задание.","Tapşırığımı bitirmişəm.","Görevimi bitirdim.","Ich habe meine Aufgabe beendet.","WORK");
        add(phrases,"I need more time.","Мне нужно больше времени.","Mənə daha çox vaxt lazımdır.","Daha fazla zamana ihtiyacım var.","Ich brauche mehr Zeit.","WORK");
        add(phrases,"The work is finished.","Работа закончена.","İş bitib.","İş bitti.","Die Arbeit ist fertig.","WORK");
        add(phrases,"Please check my work.","Пожалуйста, проверьте мою работу.","Zəhmət olmasa işimi yoxlayın.","Lütfen işimi kontrol edin.","Bitte überprüfen Sie meine Arbeit.","WORK");
        add(phrases,"I understand.","Я понимаю.","Başa düşürəm.","Anlıyorum.","Ich verstehe.","WORK");
        add(phrases,"I don't understand.","Я не понимаю.","Başa düşmürəm.","Anlamıyorum.","Ich verstehe nicht.","WORK");
        add(phrases,"Please explain again.","Пожалуйста, объясните ещё раз.","Zəhmət olmasa bir daha izah edin.","Lütfen tekrar açıklayın.","Bitte erklären Sie noch einmal.","WORK");
        add(phrases,"Can you show me?","Можете мне показать?","Mənə göstərə bilərsiniz?","Bana gösterebilir misiniz?","Können Sie es mir zeigen?","WORK");
        add(phrases,"I need help.","Мне нужна помощь.","Mənə kömək lazımdır.","Yardıma ihtiyacım var.","Ich brauche Hilfe.","WORK");
        add(phrases,"I can do it.","Я могу это сделать.","Mən bunu edə bilərəm.","Bunu yapabilirim.","Ich kann das machen.","WORK");
        add(phrases,"I cannot do it alone.","Я не могу сделать это один.","Mən bunu tək edə bilmirəm.","Bunu tek başıma yapamam.","Ich kann das nicht allein machen.","WORK");

        add(phrases,"I have started my shift.","Я начал свою смену.","Növbəmə başlamışam.","Vardiyama başladım.","Ich habe meine Schicht begonnen.","WORK");
        add(phrases,"I am checking the equipment.","Я проверяю оборудование.","Avadanlığı yoxlayıram.","Ekipmanı kontrol ediyorum.","Ich überprüfe die Ausrüstung.","WORK");
        add(phrases,"The equipment is ready.","Оборудование готово.","Avadanlıq hazırdır.","Ekipman hazır.","Die Ausrüstung ist bereit.","WORK");
        add(phrases,"I need the work instructions.","Мне нужны рабочие инструкции.","Mənə iş təlimatı lazımdır.","Çalışma talimatlarına ihtiyacım var.","Ich brauche die Arbeitsanweisungen.","WORK");
        add(phrases,"Where can I find the instructions?","Где я могу найти инструкции?","Təlimatları harada tapa bilərəm?","Talimatları nerede bulabilirim?","Wo kann ich die Anweisungen finden?","WORK");
        add(phrases,"I am following the instructions.","Я следую инструкциям.","Təlimatlara əməl edirəm.","Talimatlara uyuyorum.","Ich befolge die Anweisungen.","WORK");
        add(phrases,"I have checked everything.","Я всё проверил.","Hər şeyi yoxlamışam.","Her şeyi kontrol ettim.","Ich habe alles überprüft.","WORK");
        add(phrases,"Everything is ready.","Всё готово.","Hər şey hazırdır.","Her şey hazır.","Alles ist bereit.","WORK");
        add(phrases,"I am waiting for the next task.","Я жду следующего задания.","Növbəti tapşırığı gözləyirəm.","Bir sonraki görevi bekliyorum.","Ich warte auf die nächste Aufgabe.","WORK");
        add(phrases,"Can I start the machine?","Я могу запустить станок?","Dəzgahı işə sala bilərəm?","Makineyi çalıştırabilir miyim?","Kann ich die Maschine starten?","WORK");
        add(phrases,"Can I start the job?","Я могу начать работу?","İşə başlaya bilərəm?","İşe başlayabilir miyim?","Kann ich mit der Arbeit beginnen?","WORK");
        add(phrases,"Please give me the drawing.","Пожалуйста, дайте мне чертёж.","Zəhmət olmasa mənə çertyoju verin.","Lütfen bana teknik resmi verin.","Bitte geben Sie mir die Zeichnung.","WORK");
        add(phrases,"I need the drawing number.","Мне нужен номер чертежа.","Mənə çertyoj nömrəsi lazımdır.","Teknik resim numarasına ihtiyacım var.","Ich brauche die Zeichnungsnummer.","WORK");
        add(phrases,"I need the part number.","Мне нужен номер детали.","Mənə detalın nömrəsi lazımdır.","Parça numarasına ihtiyacım var.","Ich brauche die Teilenummer.","WORK");
        add(phrases,"Please repeat the task.","Пожалуйста, повторите задание.","Zəhmət olmasa tapşırığı təkrarlayın.","Lütfen görevi tekrar edin.","Bitte wiederholen Sie die Aufgabe.","WORK");
        add(phrases,"I will finish it today.","Я закончу это сегодня.","Bunu bu gün bitirəcəyəm.","Bunu bugün bitireceğim.","Ich werde es heute fertigstellen.","WORK");
        add(phrases,"I have a question.","У меня есть вопрос.","Mənim sualım var.","Bir sorum var.","Ich habe eine Frage.","WORK");
        add(phrases,"Please wait a moment.","Пожалуйста, подождите минуту.","Zəhmət olmasa bir dəqiqə gözləyin.","Lütfen bir dakika bekleyin.","Bitte warten Sie einen Moment.","WORK");
        add(phrases,"The material is ready.","Материал готов.","Material hazırdır.","Malzeme hazır.","Das Material ist bereit.","WORK");
        add(phrases,"We can continue the work.","Мы можем продолжить работу.","İşi davam etdirə bilərik.","Çalışmaya devam edebiliriz.","Wir können die Arbeit fortsetzen.","WORK");

        // =====================================================
        // BOSS
        // =====================================================

        add(phrases,"Good morning, boss.","Доброе утро, начальник.","Sabahınız xeyir, rəis.","Günaydın, patron.","Guten Morgen, Chef.","BOSS");
        add(phrases,"What should I do next?","Что мне делать дальше?","Sonra nə etməliyəm?","Sonra ne yapmalıyım?","Was soll ich als Nächstes tun?","BOSS");
        add(phrases,"Is this correct?","Это правильно?","Bu düzgündür?","Bu doğru mu?","Ist das richtig?","BOSS");
        add(phrases,"Please check this part.","Пожалуйста, проверьте эту деталь.","Zəhmət olmasa bu detalı yoxlayın.","Lütfen bu parçayı kontrol edin.","Bitte überprüfen Sie dieses Teil.","BOSS");
        add(phrases,"The machine has a problem.","У станка проблема.","Dəzgahda problem var.","Makinede sorun var.","Die Maschine hat ein Problem.","BOSS");
        add(phrases,"The machine stopped.","Станок остановился.","Dəzgah dayandı.","Makine durdu.","Die Maschine ist stehen geblieben.","BOSS");
        add(phrases,"We need maintenance.","Нам нужно техническое обслуживание.","Bizə texniki xidmət lazımdır.","Bakım gerekiyor.","Wir brauchen Wartung.","BOSS");
        add(phrases,"The tool is worn.","Инструмент изношен.","Alət aşınıb.","Takım aşınmış.","Das Werkzeug ist verschlissen.","BOSS");
        add(phrases,"The part is defective.","Деталь бракованная.","Detal qüsurludur.","Parça kusurlu.","Das Teil ist fehlerhaft.","BOSS");
        add(phrases,"The measurement is not correct.","Измерение неправильное.","Ölçmə düzgün deyil.","Ölçüm doğru değil.","Die Messung ist nicht korrekt.","BOSS");
        add(phrases,"I found a defect.","Я нашёл дефект.","Qüsur tapdım.","Bir kusur buldum.","Ich habe einen Fehler gefunden.","BOSS");
        add(phrases,"We need to stop the machine.","Нам нужно остановить станок.","Dəzgahı dayandırmalıyıq.","Makineyi durdurmamız gerekiyor.","Wir müssen die Maschine stoppen.","BOSS");

        add(phrases,"The material is finished.","Материал закончился.","Material qurtarıb.","Malzeme bitti.","Das Material ist aufgebraucht.","BOSS");
        add(phrases,"I need another tool.","Мне нужен другой инструмент.","Mənə başqa alət lazımdır.","Başka bir takıma ihtiyacım var.","Ich brauche ein anderes Werkzeug.","BOSS");
        add(phrases,"Can I continue?","Я могу продолжать?","Davam edə bilərəm?","Devam edebilir miyim?","Kann ich weitermachen?","BOSS");
        add(phrases,"The job is complete.","Работа выполнена.","İş tamamlanıb.","İş tamamlandı.","Die Arbeit ist abgeschlossen.","BOSS");
        add(phrases,"Please check the result.","Пожалуйста, проверьте результат.","Zəhmət olmasa nəticəni yoxlayın.","Lütfen sonucu kontrol edin.","Bitte überprüfen Sie das Ergebnis.","BOSS");
        add(phrases,"I need your approval.","Мне нужно ваше разрешение.","Mənə sizin təsdiqiniz lazımdır.","Onayınıza ihtiyacım var.","Ich brauche Ihre Genehmigung.","BOSS");
        add(phrases,"The problem is fixed.","Проблема устранена.","Problem həll olunub.","Sorun çözüldü.","Das Problem ist behoben.","BOSS");
        add(phrases,"I will report the problem.","Я сообщу о проблеме.","Problem barədə məlumat verəcəyəm.","Sorunu bildireceğim.","Ich werde das Problem melden.","BOSS");

        // =====================================================
        // MACHINE
        // =====================================================

        add(phrases,"Start the machine.","Запусти станок.","Dəzgahı işə sal.","Makineyi çalıştır.","Starte die Maschine.","MACHINE");
        add(phrases,"Stop the machine.","Останови станок.","Dəzgahı dayandır.","Makineyi durdur.","Stoppe die Maschine.","MACHINE");
        add(phrases,"The machine is running.","Станок работает.","Dəzgah işləyir.","Makine çalışıyor.","Die Maschine läuft.","MACHINE");
        add(phrases,"The machine is not working.","Станок не работает.","Dəzgah işləmir.","Makine çalışmıyor.","Die Maschine funktioniert nicht.","MACHINE");
        add(phrases,"Check the machine.","Проверь станок.","Dəzgahı yoxla.","Makineyi kontrol et.","Überprüfe die Maschine.","MACHINE");
        add(phrases,"Check the sensor.","Проверь датчик.","Sensoru yoxla.","Sensörü kontrol et.","Überprüfe den Sensor.","MACHINE");
        add(phrases,"The sensor is not working.","Датчик не работает.","Sensor işləmir.","Sensör çalışmıyor.","Der Sensor funktioniert nicht.","MACHINE");
        add(phrases,"There is an error.","Есть ошибка.","Səhv var.","Bir hata var.","Es gibt einen Fehler.","MACHINE");
        add(phrases,"Check the error code.","Проверь код ошибки.","Səhv kodunu yoxla.","Hata kodunu kontrol et.","Überprüfe den Fehlercode.","MACHINE");
        add(phrases,"The motor is hot.","Двигатель горячий.","Mühərrik istidir.","Motor sıcak.","Der Motor ist heiß.","MACHINE");
        add(phrases,"The machine is making noise.","Станок издаёт шум.","Dəzgah səs-küy yaradır.","Makine gürültü yapıyor.","Die Maschine macht Geräusche.","MACHINE");
        add(phrases,"There is vibration.","Есть вибрация.","Vibrasiya var.","Titreşim var.","Es gibt Vibrationen.","MACHINE");

        add(phrases,"The machine is overheating.","Станок перегревается.","Dəzgah həddindən artıq qızır.","Makine aşırı ısınıyor.","Die Maschine überhitzt.","MACHINE");
        add(phrases,"Check the pressure.","Проверь давление.","Təzyiqi yoxla.","Basıncı kontrol et.","Überprüfe den Druck.","MACHINE");
        add(phrases,"Check the power supply.","Проверь электропитание.","Elektrik təchizatını yoxla.","Güç kaynağını kontrol et.","Überprüfe die Stromversorgung.","MACHINE");
        add(phrases,"Check the temperature.","Проверь температуру.","Temperaturu yoxla.","Sıcaklığı kontrol et.","Überprüfe die Temperatur.","MACHINE");
        add(phrases,"The machine is ready.","Станок готов.","Dəzgah hazırdır.","Makine hazır.","Die Maschine ist bereit.","MACHINE");
        add(phrases,"The machine stopped suddenly.","Станок внезапно остановился.","Dəzgah qəfil dayandı.","Makine aniden durdu.","Die Maschine ist plötzlich stehen geblieben.","MACHINE");
        add(phrases,"Check the control panel.","Проверь панель управления.","İdarəetmə panelini yoxla.","Kontrol panelini kontrol et.","Überprüfe das Bedienfeld.","MACHINE");
        add(phrases,"The button is not working.","Кнопка не работает.","Düymə işləmir.","Düğme çalışmıyor.","Die Taste funktioniert nicht.","MACHINE");
        add(phrases,"Check the cable.","Проверь кабель.","Kabeli yoxla.","Kabloyu kontrol et.","Überprüfe das Kabel.","MACHINE");
        add(phrases,"The cable is damaged.","Кабель повреждён.","Kabel zədələnib.","Kablo hasarlı.","Das Kabel ist beschädigt.","MACHINE");
        add(phrases,"Check the connection.","Проверь соединение.","Birləşməni yoxla.","Bağlantıyı kontrol et.","Überprüfe die Verbindung.","MACHINE");

        // =====================================================
        // CNC
        // =====================================================

        add(phrases,"Check the CNC program.","Проверь программу CNC.","CNC proqramını yoxla.","CNC programını kontrol et.","Überprüfe das CNC-Programm.","CNC");
        add(phrases,"Start the CNC program.","Запусти программу CNC.","CNC proqramını işə sal.","CNC programını başlat.","Starte das CNC-Programm.","CNC");
        add(phrases,"Stop the CNC program.","Останови программу CNC.","CNC proqramını dayandır.","CNC programını durdur.","Stoppe das CNC-Programm.","CNC");
        add(phrases,"Check the coordinates.","Проверь координаты.","Koordinatları yoxla.","Koordinatları kontrol et.","Überprüfe die Koordinaten.","CNC");
        add(phrases,"Check the zero point.","Проверь нулевую точку.","Sıfır nöqtəsini yoxla.","Sıfır noktasını kontrol et.","Überprüfe den Nullpunkt.","CNC");
        add(phrases,"Check the tool number.","Проверь номер инструмента.","Alət nömrəsini yoxla.","Takım numarasını kontrol et.","Überprüfe die Werkzeugnummer.","CNC");
        add(phrases,"Change the tool.","Замени инструмент.","Aləti dəyiş.","Takımı değiştir.","Wechsle das Werkzeug.","CNC");
        add(phrases,"The tool is broken.","Инструмент сломан.","Alət sınıb.","Takım kırılmış.","Das Werkzeug ist gebrochen.","CNC");
        add(phrases,"Check the feed rate.","Проверь скорость подачи.","Veriş sürətini yoxla.","İlerleme hızını kontrol et.","Überprüfe den Vorschub.","CNC");
        add(phrases,"The cycle is finished.","Цикл закончен.","Tsikl bitib.","Çevrim tamamlandı.","Der Zyklus ist beendet.","CNC");

        add(phrases,"Load the CNC program.","Загрузи программу CNC.","CNC proqramını yüklə.","CNC programını yükle.","Lade das CNC-Programm.","CNC");
        add(phrases,"Set the zero point.","Установи нулевую точку.","Sıfır nöqtəsini təyin et.","Sıfır noktasını ayarla.","Stelle den Nullpunkt ein.","CNC");
        add(phrases,"The tool is worn.","Инструмент изношен.","Alət aşınıb.","Takım aşınmış.","Das Werkzeug ist verschlissen.","CNC");
        add(phrases,"Check the spindle speed.","Проверь обороты шпинделя.","Şpindelin dövr sayını yoxla.","İş mili devrini kontrol et.","Überprüfe die Spindeldrehzahl.","CNC");
        add(phrases,"Start the CNC cycle.","Запусти цикл CNC.","CNC tsiklini işə sal.","CNC çevrimini başlat.","Starte den CNC-Zyklus.","CNC");
        add(phrases,"Stop the CNC cycle.","Останови цикл CNC.","CNC tsiklini dayandır.","CNC çevrimini durdur.","Stoppe den CNC-Zyklus.","CNC");
        add(phrases,"Check the program number.","Проверь номер программы.","Proqram nömrəsini yoxla.","Program numarasını kontrol et.","Überprüfe die Programmnummer.","CNC");
        add(phrases,"There is a CNC alarm.","Есть аварийный сигнал CNC.","CNC siqnalizasiyası var.","CNC alarmı var.","Es gibt einen CNC-Alarm.","CNC");
        add(phrases,"Reset the alarm.","Сбрось аварийный сигнал.","Siqnalizasiyanı sıfırla.","Alarmı sıfırla.","Setze den Alarm zurück.","CNC");
        add(phrases,"Check the coolant.","Проверь охлаждающую жидкость.","Soyuducu mayeni yoxla.","Soğutma sıvısını kontrol et.","Überprüfe die Kühlflüssigkeit.","CNC");
        add(phrases,"The coolant level is low.","Уровень охлаждающей жидкости низкий.","Soyuducu mayenin səviyyəsi aşağıdır.","Soğutma sıvısı seviyesi düşük.","Der Kühlmittelstand ist niedrig.","CNC");
        add(phrases,"Measure the finished part.","Измерь готовую деталь.","Hazır detalı ölç.","Bitmiş parçayı ölç.","Miss das fertige Teil.","CNC");

        // =====================================================
        // STAMPING
        // =====================================================

        add(phrases,"The stamping machine is ready.","Штамповочная машина готова.","Ştamplama maşını hazırdır.","Pres makinesi hazır.","Die Stanzmaschine ist bereit.","STAMPING");
        add(phrases,"Check the die.","Проверь матрицу.","Matrisi yoxla.","Kalıbı kontrol et.","Überprüfe die Matrize.","STAMPING");
        add(phrases,"Check the punch.","Проверь пуансон.","Puansonu yoxla.","Punçu kontrol et.","Überprüfe den Stempel.","STAMPING");
        add(phrases,"The die is damaged.","Матрица повреждена.","Matris zədələnib.","K