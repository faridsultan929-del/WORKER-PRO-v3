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

        // =========================
        // WORK
        // =========================

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
        add(phrases,"I need the work instructions.","Мне нужны рабочие инструкции.","Mənə iş təlimatları lazımdır.","Çalışma talimatlarına ihtiyacım var.","Ich brauche die Arbeitsanweisungen.","WORK");
        add(phrases,"Where can I find the instructions?","Где я могу найти инструкции?","Təlimatları harada tapa bilərəm?","Talimatları nerede bulabilirim?","Wo finde ich die Anweisungen?","WORK");
        add(phrases,"I am following the instructions.","Я следую инструкциям.","Təlimatlara əməl edirəm.","Talimatlara uyuyorum.","Ich befolge die Anweisungen.","WORK");
        add(phrases,"I have checked everything.","Я всё проверил.","Hər şeyi yoxlamışam.","Her şeyi kontrol ettim.","Ich habe alles überprüft.","WORK");
        add(phrases,"Everything is ready.","Всё готово.","Hər şey hazırdır.","Her şey hazır.","Alles ist bereit.","WORK");
        add(phrases,"I am waiting for the next task.","Я жду следующего задания.","Növbəti tapşırığı gözləyirəm.","Bir sonraki görevi bekliyorum.","Ich warte auf die nächste Aufgabe.","WORK");
        add(phrases,"Can I start the machine?","Могу я запустить станок?","Dəzgahı işə sala bilərəm?","Makineyi çalıştırabilir miyim?","Kann ich die Maschine starten?","WORK");
        add(phrases,"Can I start the job?","Могу я начать работу?","İşə başlaya bilərəm?","İşe başlayabilir miyim?","Kann ich mit der Arbeit beginnen?","WORK");
        add(phrases,"Please give me the drawing.","Пожалуйста, дайте мне чертёж.","Zəhmət olmasa çertyoju verin.","Lütfen teknik resmi verin.","Bitte geben Sie mir die Zeichnung.","WORK");
        add(phrases,"I need the drawing number.","Мне нужен номер чертежа.","Mənə çertyoj nömrəsi lazımdır.","Teknik resim numarasına ihtiyacım var.","Ich brauche die Zeichnungsnummer.","WORK");
        add(phrases,"I need the part number.","Мне нужен номер детали.","Mənə detal nömrəsi lazımdır.","Parça numarasına ihtiyacım var.","Ich brauche die Teilenummer.","WORK");
        add(phrases,"Please repeat the task.","Пожалуйста, повторите задание.","Zəhmət olmasa tapşırığı təkrarlayın.","Lütfen görevi tekrar edin.","Bitte wiederholen Sie die Aufgabe.","WORK");
        add(phrases,"I will finish it today.","Я закончу это сегодня.","Bunu bu gün bitirəcəyəm.","Bunu bugün bitireceğim.","Ich werde es heute fertigstellen.","WORK");
        add(phrases,"I have a question.","У меня есть вопрос.","Mənim sualım var.","Bir sorum var.","Ich habe eine Frage.","WORK");
        add(phrases,"Please wait a moment.","Пожалуйста, подождите минуту.","Zəhmət olmasa bir dəqiqə gözləyin.","Lütfen bir dakika bekleyin.","Bitte warten Sie einen Moment.","WORK");
        add(phrases,"The material is ready.","Материал готов.","Material hazırdır.","Malzeme hazır.","Das Material ist bereit.","WORK");
        add(phrases,"We can continue the work.","Мы можем продолжить работу.","İşi davam etdirə bilərik.","Çalışmaya devam edebiliriz.","Wir können die Arbeit fortsetzen.","WORK");

        // =========================
        // BOSS
        // =========================

        add(phrases,"Good morning, boss.","Доброе утро, начальник.","Sabahınız xeyir, rəis.","Günaydın, amirim.","Guten Morgen, Chef.","BOSS");
        add(phrases,"What should I do next?","Что мне делать дальше?","Sonra nə etməliyəm?","Sonra ne yapmalıyım?","Was soll ich als Nächstes tun?","BOSS");
        add(phrases,"Is this correct?","Это правильно?","Bu düzgündür?","Bu doğru mu?","Ist das richtig?","BOSS");
        add(phrases,"Please check this part.","Пожалуйста, проверьте эту деталь.","Zəhmət olmasa bu detalı yoxlayın.","Lütfen bu parçayı kontrol edin.","Bitte überprüfen Sie dieses Teil.","BOSS");
        add(phrases,"The machine has a problem.","У станка проблема.","Dəzgahda problem var.","Makinede bir sorun var.","Die Maschine hat ein Problem.","BOSS");
        add(phrases,"The machine stopped.","Станок остановился.","Dəzgah dayandı.","Makine durdu.","Die Maschine ist stehen geblieben.","BOSS");
        add(phrases,"We need maintenance.","Нам нужно техническое обслуживание.","Bizə texniki xidmət lazımdır.","Bakım yapmamız gerekiyor.","Wir brauchen eine Wartung.","BOSS");
        add(phrases,"The tool is worn.","Инструмент изношен.","Alət yeyilib.","Takım aşınmış.","Das Werkzeug ist verschlissen.","BOSS");
        add(phrases,"The part is defective.","Деталь бракованная.","Detal qüsurludur.","Parça hatalı.","Das Teil ist fehlerhaft.","BOSS");
        add(phrases,"The measurement is not correct.","Размер неправильный.","Ölçü düzgün deyil.","Ölçüm doğru değil.","Das Maß ist nicht korrekt.","BOSS");
        add(phrases,"I found a defect.","Я нашёл дефект.","Qüsur tapmışam.","Bir kusur buldum.","Ich habe einen Fehler gefunden.","BOSS");
        add(phrases,"We need to stop the machine.","Нам нужно остановить станок.","Dəzgahı dayandırmalıyıq.","Makineyi durdurmamız gerekiyor.","Wir müssen die Maschine stoppen.","BOSS");
        add(phrases,"Please come here.","Пожалуйста, подойдите сюда.","Zəhmət olmasa bura gəlin.","Lütfen buraya gelin.","Bitte kommen Sie hierher.","BOSS");
        add(phrases,"I need your advice.","Мне нужен ваш совет.","Mənə sizin məsləhətiniz lazımdır.","Tavsiyenize ihtiyacım var.","Ich brauche Ihren Rat.","BOSS");
        add(phrases,"Should I change the tool?","Мне заменить инструмент?","Aləti dəyişməliyəm?","Takımı değiştirmeli miyim?","Soll ich das Werkzeug wechseln?","BOSS");
        add(phrases,"Should I stop the machine?","Мне остановить станок?","Dəzgahı dayandırım?","Makineyi durdurmalı mıyım?","Soll ich die Maschine stoppen?","BOSS");
        add(phrases,"The job is urgent.","Работа срочная.","İş təcilidir.","İş acil.","Die Arbeit ist dringend.","BOSS");
        add(phrases,"I need permission.","Мне нужно разрешение.","Mənə icazə lazımdır.","İzne ihtiyacım var.","Ich brauche eine Genehmigung.","BOSS");

        // =========================
        // MACHINE
        // =========================

        add(phrases,"Start the machine.","Запустите станок.","Dəzgahı işə salın.","Makineyi çalıştırın.","Starten Sie die Maschine.","MACHINE");
        add(phrases,"Stop the machine.","Остановите станок.","Dəzgahı dayandırın.","Makineyi durdurun.","Stoppen Sie die Maschine.","MACHINE");
        add(phrases,"The machine is running.","Станок работает.","Dəzgah işləyir.","Makine çalışıyor.","Die Maschine läuft.","MACHINE");
        add(phrases,"The machine is not working.","Станок не работает.","Dəzgah işləmir.","Makine çalışmıyor.","Die Maschine funktioniert nicht.","MACHINE");
        add(phrases,"Check the machine.","Проверьте станок.","Dəzgahı yoxlayın.","Makineyi kontrol edin.","Überprüfen Sie die Maschine.","MACHINE");
        add(phrases,"Check the sensor.","Проверьте датчик.","Sensoru yoxlayın.","Sensörü kontrol edin.","Überprüfen Sie den Sensor.","MACHINE");
        add(phrases,"The sensor is not working.","Датчик не работает.","Sensor işləmir.","Sensör çalışmıyor.","Der Sensor funktioniert nicht.","MACHINE");
        add(phrases,"There is an error.","Есть ошибка.","Xəta var.","Bir hata var.","Es gibt einen Fehler.","MACHINE");
        add(phrases,"Check the error code.","Проверьте код ошибки.","Xəta kodunu yoxlayın.","Hata kodunu kontrol edin.","Überprüfen Sie den Fehlercode.","MACHINE");
        add(phrases,"The motor is hot.","Двигатель горячий.","Mühərrik istidir.","Motor sıcak.","Der Motor ist heiß.","MACHINE");
        add(phrases,"The machine is making noise.","Станок издаёт шум.","Dəzgah səs çıxarır.","Makine ses çıkarıyor.","Die Maschine macht Geräusche.","MACHINE");
        add(phrases,"There is vibration.","Есть вибрация.","Titrəmə var.","Titreşim var.","Es gibt Vibrationen.","MACHINE");
        add(phrases,"Check the power supply.","Проверьте электропитание.","Elektrik təchizatını yoxlayın.","Güç kaynağını kontrol edin.","Überprüfen Sie die Stromversorgung.","MACHINE");
        add(phrases,"The machine is overheating.","Станок перегревается.","Dəzgah həddindən artıq qızır.","Makine aşırı ısınıyor.","Die Maschine überhitzt.","MACHINE");
        add(phrases,"The machine is too slow.","Станок работает слишком медленно.","Dəzgah çox yavaş işləyir.","Makine çok yavaş çalışıyor.","Die Maschine ist zu langsam.","MACHINE");
        add(phrases,"The machine is too fast.","Станок работает слишком быстро.","Dəzgah çox sürətli işləyir.","Makine çok hızlı çalışıyor.","Die Maschine ist zu schnell.","MACHINE");
        add(phrases,"Check the pressure.","Проверьте давление.","Təzyiqi yoxlayın.","Basıncı kontrol edin.","Überprüfen Sie den Druck.","MACHINE");
        add(phrases,"Check the temperature.","Проверьте температуру.","Temperaturu yoxlayın.","Sıcaklığı kontrol edin.","Überprüfen Sie die Temperatur.","MACHINE");
        add(phrases,"The machine is ready.","Станок готов.","Dəzgah hazırdır.","Makine hazır.","Die Maschine ist bereit.","MACHINE");

        // =========================
        // CNC
        // =========================

        add(phrases,"Check the CNC program.","Проверьте программу ЧПУ.","CNC proqramını yoxlayın.","CNC programını kontrol edin.","Überprüfen Sie das CNC-Programm.","CNC");
        add(phrases,"Start the CNC program.","Запустите программу ЧПУ.","CNC proqramını işə salın.","CNC programını başlatın.","Starten Sie das CNC-Programm.","CNC");
        add(phrases,"Stop the CNC program.","Остановите программу ЧПУ.","CNC proqramını dayandırın.","CNC programını durdurun.","Stoppen Sie das CNC-Programm.","CNC");
        add(phrases,"Check the coordinates.","Проверьте координаты.","Koordinatları yoxlayın.","Koordinatları kontrol edin.","Überprüfen Sie die Koordinaten.","CNC");
        add(phrases,"Check the zero point.","Проверьте нулевую точку.","Sıfır nöqtəsini yoxlayın.","Sıfır noktasını kontrol edin.","Überprüfen Sie den Nullpunkt.","CNC");
        add(phrases,"Check the tool number.","Проверьте номер инструмента.","Alət nömrəsini yoxlayın.","Takım numarasını kontrol edin.","Überprüfen Sie die Werkzeugnummer.","CNC");
        add(phrases,"Change the tool.","Замените инструмент.","Aləti dəyişin.","Takımı değiştirin.","Wechseln Sie das Werkzeug.","CNC");
        add(phrases,"The tool is broken.","Инструмент сломан.","Alət qırılıb.","Takım kırıldı.","Das Werkzeug ist gebrochen.","CNC");
        add(phrases,"Check the feed rate.","Проверьте скорость подачи.","Veriş sürətini yoxlayın.","İlerleme hızını kontrol edin.","Überprüfen Sie den Vorschub.","CNC");
        add(phrases,"The cycle is finished.","Цикл завершён.","Sikl tamamlanıb.","Çevrim tamamlandı.","Der Zyklus ist beendet.","CNC");
        add(phrases,"Check the spindle speed.","Проверьте скорость шпинделя.","Şpindel sürətini yoxlayın.","İş mili devrini kontrol edin.","Überprüfen Sie die Spindeldrehzahl.","CNC");
        add(phrases,"The spindle is running.","Шпиндель работает.","Şpindel işləyir.","İş mili çalışıyor.","Die Spindel läuft.","CNC");
        add(phrases,"The spindle is stopped.","Шпиндель остановлен.","Şpindel dayanıb.","İş mili durdu.","Die Spindel ist gestoppt.","CNC");
        add(phrases,"Check the program number.","Проверьте номер программы.","Proqram nömrəsini yoxlayın.","Program numarasını kontrol edin.","Überprüfen Sie die Programmnummer.","CNC");
        add(phrases,"Load the program.","Загрузите программу.","Proqramı yükləyin.","Programı yükleyin.","Laden Sie das Programm.","CNC");
        add(phrases,"Save the program.","Сохраните программу.","Proqramı yadda saxlayın.","Programı kaydedin.","Speichern