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
        add(phrases,"Save the program.","Сохраните программу.","Proqramı yadda saxlayın.","Programı kaydedin.","Speichern Sie das Programm.","CNC");
        add(phrases,"Check the offset.","Проверьте коррекцию.","Korreksiyanı yoxlayın.","Ofseti kontrol edin.","Überprüfen Sie den Offset.","CNC");
        add(phrases,"The tool offset is wrong.","Коррекция инструмента неправильная.","Alət korreksiyası yanlışdır.","Takım ofseti yanlış.","Der Werkzeugoffset ist falsch.","CNC");

        // =========================
        // STAMPING
        // =========================

        add(phrases,"The stamping machine is ready.","Пресс готов.","Ştamplama dəzgahı hazırdır.","Pres makinesi hazır.","Die Stanzmaschine ist bereit.","STAMPING");
        add(phrases,"Check the die.","Проверьте матрицу.","Matrisi yoxlayın.","Kalıbı kontrol edin.","Überprüfen Sie die Matrize.","STAMPING");
        add(phrases,"Check the punch.","Проверьте пуансон.","Puansonu yoxlayın.","Zımbayı kontrol edin.","Überprüfen Sie den Stempel.","STAMPING");
        add(phrases,"The die is damaged.","Матрица повреждена.","Matris zədələnib.","Kalıp hasarlı.","Die Matrize ist beschädigt.","STAMPING");
        add(phrases,"The punch is worn.","Пуансон изношен.","Puanson yeyilib.","Zımba aşınmış.","Der Stempel ist verschlissen.","STAMPING");
        add(phrases,"Check the blank thickness.","Проверьте толщину заготовки.","Pəstahın qalınlığını yoxlayın.","Sac kalınlığını kontrol edin.","Überprüfen Sie die Materialdicke.","STAMPING");
        add(phrases,"The stamping force is too high.","Усилие штамповки слишком высокое.","Ştamplama qüvvəsi çox yüksəkdir.","Pres kuvveti çok yüksek.","Die Stanzkraft ist zu hoch.","STAMPING");
        add(phrases,"The part has a defect.","Деталь имеет дефект.","Detalın qüsuru var.","Parçada kusur var.","Das Teil hat einen Fehler.","STAMPING");
        add(phrases,"Stop the press.","Остановите пресс.","Presi dayandırın.","Presi durdurun.","Stoppen Sie die Presse.","STAMPING");
        add(phrases,"Check the finished part.","Проверьте готовую деталь.","Hazır detalı yoxlayın.","Bitmiş parçayı kontrol edin.","Überprüfen Sie das fertige Teil.","STAMPING");
        add(phrases,"Check the sheet.","Проверьте лист.","Vərəqi yoxlayın.","Sac levhayı kontrol edin.","Überprüfen Sie das Blech.","STAMPING");
        add(phrases,"The sheet is damaged.","Лист повреждён.","Vərəq zədələnib.","Sac levha hasarlı.","Das Blech ist beschädigt.","STAMPING");
        add(phrases,"The material is too thin.","Материал слишком тонкий.","Material çox nazikdir.","Malzeme çok ince.","Das Material ist zu dünn.","STAMPING");
        add(phrases,"The material is too thick.","Материал слишком толстый.","Material çox qalındır.","Malzeme çok kalın.","Das Material ist zu dick.","STAMPING");
        add(phrases,"Check the press pressure.","Проверьте давление пресса.","Pres təzyiqini yoxlayın.","Pres basıncını kontrol edin.","Überprüfen Sie den Pressdruck.","STAMPING");
        add(phrases,"The punch is damaged.","Пуансон повреждён.","Puanson zədələnib.","Zımba hasarlı.","Der Stempel ist beschädigt.","STAMPING");

        // =========================
        // QUALITY
        // =========================

        add(phrases,"Check the quality.","Проверьте качество.","Keyfiyyəti yoxlayın.","Kaliteyi kontrol edin.","Überprüfen Sie die Qualität.","QUALITY");
        add(phrases,"The quality is good.","Качество хорошее.","Keyfiyyət yaxşıdır.","Kalite iyi.","Die Qualität ist gut.","QUALITY");
        add(phrases,"The quality is not good.","Качество плохое.","Keyfiyyət yaxşı deyil.","Kalite iyi değil.","Die Qualität ist nicht gut.","QUALITY");
        add(phrases,"I found a crack.","Я нашёл трещину.","Çat tapmışam.","Bir çatlak buldum.","Ich habe einen Riss gefunden.","QUALITY");
        add(phrases,"There is a burr.","Есть заусенец.","Qrat var.","Çapak var.","Es gibt einen Grat.","QUALITY");
        add(phrases,"The dimension is correct.","Размер правильный.","Ölçü düzgündür.","Ölçü doğru.","Das Maß ist korrekt.","QUALITY");
        add(phrases,"The dimension is not correct.","Размер неправильный.","Ölçü düzgün deyil.","Ölçü doğru değil.","Das Maß ist nicht korrekt.","QUALITY");
        add(phrases,"Check the tolerance.","Проверьте допуск.","Toleransı yoxlayın.","Toleransı kontrol edin.","Überprüfen Sie die Toleranz.","QUALITY");
        add(phrases,"This part is rejected.","Эта деталь забракована.","Bu detal yararsızdır.","Bu parça reddedildi.","Dieses Teil ist abgelehnt.","QUALITY");
        add(phrases,"The inspection is complete.","Проверка завершена.","Yoxlama tamamlanıb.","Kontrol tamamlandı.","Die Prüfung ist abgeschlossen.","QUALITY");
        add(phrases,"Measure the part.","Измерьте деталь.","Detalı ölçün.","Parçayı ölçün.","Messen Sie das Teil.","QUALITY");
        add(phrases,"Check the diameter.","Проверьте диаметр.","Diametri yoxlayın.","Çapı kontrol edin.","Überprüfen Sie den Durchmesser.","QUALITY");
        add(phrases,"Check the length.","Проверьте длину.","Uzunluğu yoxlayın.","Uzunluğu kontrol edin.","Überprüfen Sie die Länge.","QUALITY");
        add(phrases,"Check the width.","Проверьте ширину.","Eni yoxlayın.","Genişliği kontrol edin.","Überprüfen Sie die Breite.","QUALITY");
        add(phrases,"The surface is good.","Поверхность хорошая.","Səth yaxşıdır.","Yüzey iyi.","Die Oberfläche ist gut.","QUALITY");
        add(phrases,"The surface is damaged.","Поверхность повреждена.","Səth zədələnib.","Yüzey hasarlı.","Die Oberfläche ist beschädigt.","QUALITY");

        // =========================
        // SAFETY
        // =========================

        add(phrases,"Safety first.","Безопасность прежде всего.","Təhlükəsizlik hər şeydən əvvəl.","Önce güvenlik.","Sicherheit zuerst.","SAFETY");
        add(phrases,"Wear your safety glasses.","Носите защитные очки.","Qoruyucu eynək taxın.","Koruyucu gözlük takın.","Tragen Sie Ihre Schutzbrille.","SAFETY");
        add(phrases,"Wear your gloves.","Наденьте перчатки.","Əlcəklərinizi taxın.","Eldivenlerinizi takın.","Tragen Sie Ihre Handschuhe.","SAFETY");
        add(phrases,"Wear your safety shoes.","Носите защитную обувь.","Qoruyucu ayaqqabı geyinin.","İş güvenliği ayakkabılarınızı giyin.","Tragen Sie Ihre Sicherheitsschuhe.","SAFETY");
        add(phrases,"Wear your helmet.","Наденьте каску.","Dəbilqənizi taxın.","Kaskınızı takın.","Tragen Sie Ihren Helm.","SAFETY");
        add(phrases,"Be careful.","Будьте осторожны.","Ehtiyatlı olun.","Dikkatli olun.","Seien Sie vorsichtig.","SAFETY");
        add(phrases,"This is dangerous.","Это опасно.","Bu təhlükəlidir.","Bu tehlikeli.","Das ist gefährlich.","SAFETY");
        add(phrases,"Do not touch the machine.","Не трогайте станок.","Dəzgaha toxunmayın.","Makineye dokunmayın.","Berühren Sie die Maschine nicht.","SAFETY");
        add(phrases,"Stop work immediately.","Немедленно прекратите работу.","Dərhal işi dayandırın.","Çalışmayı hemen durdurun.","Stellen Sie die Arbeit sofort ein.","SAFETY");
        add(phrases,"Follow the safety rules.","Соблюдайте правила безопасности.","Təhlükəsizlik qaydalarına əməl edin.","Güvenlik kurallarına uyun.","Befolgen Sie die Sicherheitsregeln.","SAFETY");
        add(phrases,"Keep the workplace clean.","Держите рабочее место чистым.","İş yerini təmiz saxlayın.","Çalışma alanını temiz tutun.","Halten Sie den Arbeitsplatz sauber.","SAFETY");
        add(phrases,"Use the correct tool.","Используйте правильный инструмент.","Düzgün alətdən istifadə edin.","Doğru takımı kullanın.","Verwenden Sie das richtige Werkzeug.","SAFETY");
        add(phrases,"Do not remove the guard.","Не снимайте защиту.","Mühafizəni çıxarmayın.","Koruyucuyu çıkarmayın.","Entfernen Sie die Schutzvorrichtung nicht.","SAFETY");

        // =========================
        // FIRE
        // =========================

        add(phrases,"There is a fire.","Пожар.","Yanğın var.","Yangın var.","Es brennt.","FIRE");
        add(phrases,"Call the fire department.","Позвоните в пожарную службу.","Yanğınsöndürmə xidmətinə zəng edin.","İtfaiyeyi arayın.","Rufen Sie die Feuerwehr.","FIRE");
        add(phrases,"Use the fire extinguisher.","Используйте огнетушитель.","Yanğınsöndürəndən istifadə edin.","Yangın söndürücüyü kullanın.","Benutzen Sie den Feuerlöscher.","FIRE");
        add(phrases,"Where is the fire extinguisher?","Где огнетушитель?","Yanğınsöndürən haradadır?","Yangın söndürücü nerede?","Wo ist der Feuerlöscher?","FIRE");
        add(phrases,"Where is the emergency exit?","Где аварийный выход?","Təcili çıxış haradadır?","Acil çıkış nerede?","Wo ist der Notausgang?","FIRE");
        add(phrases,"Go to the muster point.","Идите к месту сбора.","Toplanış məntəqəsinə gedin.","Toplanma noktasına gidin.","Gehen Sie zum Sammelpunkt.","FIRE");
        add(phrases,"Do not use water on an electrical fire.","Не используйте воду при электрическом пожаре.","Elektrik yanğınında sudan istifadə etməyin.","Elektrik yangınında su kullanmayın.","Verwenden Sie bei einem Elektrobrand kein Wasser.","FIRE");
        add(phrases,"There is smoke.","Есть дым.","Tüstü var.","Duman var.","Es gibt Rauch.","FIRE");

        // =========================
        // WELDING
        // =========================

        add(phrases,"The welding machine is ready.","Сварочный аппарат готов.","Qaynaq aparatı hazırdır.","Kaynak makinesi hazır.","Das Schweißgerät ist bereit.","WELDING");
        add(phrases,"Check the welding cable.","Проверьте сварочный кабель.","Qaynaq kabelini yoxlayın.","Kaynak kablosunu kontrol edin.","Überprüfen Sie das Schweißkabel.","WELDING");
        add(phrases,"Check the electrode.","Проверьте электрод.","Elektrodu yoxlayın.","Elektrodu kontrol edin.","Überprüfen Sie die Elektrode.","WELDING");
        add(phrases,"The weld is good.","Сварной шов хороший.","Qaynaq tikişi yaxşıdır.","Kaynak iyi.","Die Schweißnaht ist gut.","WELDING");
        add(phrases,"The weld has a defect.","Сварной шов имеет дефект.","Qaynaq tikişində qüsur var.","Kaynakta kusur var.","Die Schweißnaht hat einen Fehler.","WELDING");
        add(phrases,"Wear a welding mask.","Наденьте сварочную маску.","Qaynaq maskası taxın.","Kaynak maskesi takın.","Tragen Sie eine Schweißmaske.","WELDING");

        // =========================
        // GALVANIC
        // =========================

        add(phrases,"Check the bath temperature.","Проверьте температуру ванны.","Vannanın temperaturunu yoxlayın.","Banyo sıcaklığını kontrol edin.","Überprüfen Sie die Badtemperatur.","GALVANIC");
        add(phrases,"Check the bath level.","Проверьте уровень ванны.","Vannanın səviyyəsini yoxlayın.","Banyo seviyesini kontrol edin.","Überprüfen Sie den Badstand.","GALVANIC");
        add(phrases,"Check the pH value.","Проверьте значение pH.","pH dəyərini yoxlayın.","pH değerini kontrol edin.","Überprüfen Sie den pH-Wert.","GALVANIC");
        add(phrases,"The coating is too thin.","Покрытие слишком тонкое.","Örtük çox nazikdir.","Kaplama çok ince.","Die Beschichtung ist zu dünn.","GALVANIC");
        add(phrases,"The coating is damaged.","Покрытие повреждено.","Örtük zədələnib.","Kaplama hasarlı.","Die Beschichtung ist beschädigt.","GALVANIC");
        add(phrases,"There is a chemical spill.","Есть разлив химиката.","Kimyəvi maddə tökülüb.","Kimyasal dökülmesi var.","Es gibt eine Chemikalienverschüttung.","GALVANIC");
        add(phrases,"Use the eye wash station.","Используйте станцию промывки глаз.","Göz yuma məntəqəsindən istifadə edin.","Göz yıkama istasyonunu kullanın.","Benutzen Sie die Augenspülstation.","GALVANIC");

        // =========================
        // MAINTENANCE
        // =========================

        add(phrases,"The machine needs maintenance.","Станку требуется обслуживание.","Dəzgaha texniki xidmət lazımdır.","Makinenin bakıma ihtiyacı var.","Die Maschine benötigt Wartung.","MAINTENANCE");
        add(phrases,"The machine needs repair.","Станку нужен ремонт.","Dəzgahın təmirə ehtiyacı var.","Makinenin tamire ihtiyacı var.","Die Maschine muss repariert werden.","MAINTENANCE");
        add(phrases,"Check the oil level.","Проверьте уровень масла.","Yağ səviyyəsini yoxlayın.","Yağ seviyesini kontrol edin.","Überprüfen Sie den Ölstand.","MAINTENANCE");
        add(phrases,"Add lubricant.","Добавьте смазку.","Sürtkü əlavə edin.","Yağlayıcı ekleyin.","Fügen Sie Schmiermittel hinzu.","MAINTENANCE");
        add(phrases,"Replace the filter.","Замените фильтр.","Filtri dəyişin.","Filtreyi değiştirin.","Ersetzen Sie den Filter.","MAINTENANCE");
        add(phrases,"The bearing is worn.","Подшипник изношен.","Yastıqça yeyilib.","Rulman aşınmış.","Das Lager ist verschlissen.","MAINTENANCE");
        add(phrases,"The belt is damaged.","Ремень повреждён.","Kəmər zədələnib.","Kayış hasarlı.","Der Riemen ist beschädigt.","MAINTENANCE");

        // =========================
        // EMERGENCY
        // =========================

        add(phrases,"Emergency!","Авария!","Təcili vəziyyət!","Acil durum!","Notfall!","EMERGENCY");
        add(phrases,"Stop the machine immediately!","Немедленно остановите станок!","Dəzgahı dərhal dayandırın!","Makineyi hemen durdurun!","Stoppen Sie die Maschine sofort!","EMERGENCY");
        add(phrases,"Press the emergency stop button.","Нажмите кнопку аварийной остановки.","Təcili dayandırma düyməsini basın.","Acil durdurma düğmesine basın.","Drücken Sie den Not-Aus-Taster.","EMERGENCY");
        add(phrases,"Call for help!","Зовите на помощь!","Kömək çağırın!","Yardım çağırın!","Rufen Sie um Hilfe!","EMERGENCY");
        add(phrases,"Someone is injured.","Кто-то получил травму.","Kimsə xəsarət alıb.","Birisi yaralandı.","Jemand ist verletzt.","EMERGENCY");
        add(phrases,"Do not move the injured person.","Не перемещайте пострадавшего.","Xəsarət alan şəxsi tərpətməyin.","Yaralı kişiyi hareket ettirmeyin.","Bewegen Sie die verletzte Person nicht.","EMERGENCY");
        add(phrases,"Leave the area.","Покиньте территорию.","Ərazini tərk edin.","Alanı terk edin.","Verlassen Sie den Bereich.","EMERGENCY");
        add(phrases,"Follow the emergency route.","Следуйте аварийному маршруту.","Təcili çıxış marşrutu ilə gedin.","Acil durum güzergahını takip edin.","Folgen Sie dem Fluchtweg.","EMERGENCY");

        // =====================================================
        // 200 NEW PHRASES
        // =====================================================

        // =========================
        // WORK - 30
        // =========================

        add(phrases,"I am on my shift.","Я на своей смене.","Mən növbədəyəm.","Vardiyadayım.","Ich bin in meiner Schicht.","WORK");
        add(phrases,"The shift starts now.","Смена начинается сейчас.","Növbə indi başlayır.","Vardiya şimdi başlıyor.","Die Schicht beginnt jetzt.","WORK");
        add(phrases,"I am ready for the next task.","Я готов к следующему заданию.","Növbəti tapşırığa hazıram.","Bir sonraki göreve hazırım.","Ich bin bereit für die nächste Aufgabe.","WORK");
        add(phrases,"My task is clear.","Моё задание понятно.","Tapşırığım aydındır.","Görevim açık.","Meine Aufgabe ist klar.","WORK");
        add(phrases,"I need the correct material.","Мне нужен правильный материал.","Mənə düzgün material lazımdır.","Doğru malzemeye ihtiyacım var.","Ich brauche das richtige Material.","WORK");
        add(phrases,"Please show me the work order.","Пожалуйста, покажите мне рабочее задание.","Zəhmət olmasa iş tapşırığını göstərin.","Lütfen iş emrini gösterin.","Bitte zeigen Sie mir den Arbeitsauftrag.","WORK");
        add(phrases,"Where is the work order?","Где рабочее задание?","İş tapşırığı haradadır?","İş emri nerede?","Wo ist der Arbeitsauftrag?","WORK");
        add(phrases,"I will check the workplace.","Я проверю рабочее место.","İş yerini yoxlayacağam.","Çalışma yerini kontrol edeceğim.","Ich werde den Arbeitsplatz überprüfen.","WORK");
        add(phrases,"The workplace is clean.","Рабочее место чистое.","İş yeri təmizdir.","Çalışma alanı temiz.","Der Arbeitsplatz ist sauber.","WORK");
        add(phrases,"I need a new instruction.","Мне нужна новая инструкция.","Mənə yeni təlimat lazımdır.","Yeni bir talimata ihtiyacım var.","Ich brauche eine neue Anweisung.","WORK");
        add(phrases,"Please explain this step.","Пожалуйста, объясните этот шаг.","Zəhmət olmasa bu addımı izah edin.","Lütfen bu adımı açıklayın.","Bitte erklären Sie diesen Schritt.","WORK");
        add(phrases,"I have completed this operation.","Я завершил эту операцию.","Bu əməliyyatı tamamlamışam.","Bu işlemi tamamladım.","Ich habe diesen Vorgang abgeschlossen.","WORK");
        add(phrases,"I am checking the result.","Я проверяю результат.","Nəticəni yoxlayıram.","Sonucu kontrol ediyorum.","Ich überprüfe das Ergebnis.","WORK");
        add(phrases,"The material is missing.","Материала нет.","Material yoxdur.","Malzeme eksik.","Das Material fehlt.","WORK");
        add(phrases,"We need more material.","Нам нужно больше материала.","Bizə daha çox material lazımdır.","Daha fazla malzemeye ihtiyacımız var.","Wir brauchen mehr Material.","WORK");
        add(phrases,"The job is almost finished.","Работа почти закончена.","İş demək olar ki, bitib.","İş neredeyse bitti.","Die Arbeit ist fast fertig.","WORK");
        add(phrases,"I need a short break.","Мне нужен короткий перерыв.","Mənə qısa fasilə lazımdır.","Kısa bir molaya ihtiyacım var.","Ich brauche eine kurze Pause.","WORK");
        add(phrases,"I am back from my break.","Я вернулся с перерыва.","Fasilədən qayıtmışam.","Moladan döndüm.","Ich bin aus meiner Pause zurück.","WORK");
        add(phrases,"I will continue working.","Я продолжу работать.","İşləməyə davam edəcəyəm.","Çalışmaya devam edeceğim.","Ich werde weiterarbeiten.","WORK");
        add(phrases,"Please bring the material.","Пожалуйста, принесите материал.","Zəhmət olmasa materialı gətirin.","Lütfen malzemeyi getirin.","Bitte bringen Sie das Material.","WORK");
        add(phrases,"The material has arrived.","Материал прибыл.","Material gəlib.","Malzeme geldi.","Das Material ist angekommen.","WORK");
        add(phrases,"I need more information.","Мне нужна дополнительная информация.","Mənə daha çox məlumat lazımdır.","Daha fazla bilgiye ihtiyacım var.","Ich brauche mehr Informationen.","WORK");
        add(phrases,"Please write it down.","Пожалуйста, запишите это.","Zəhmət olmasa bunu yazın.","Lütfen bunu yazın.","Bitte schreiben Sie es auf.","WORK");
        add(phrases,"I will check it again.","Я проверю это ещё раз.","Bunu yenidən yoxlayacağam.","Bunu tekrar kontrol edeceğim.","Ich werde es noch einmal überprüfen.","WORK");
        add(phrases,"The task is completed.","Задание выполнено.","Tapşırıq yerinə yetirilib.","Görev tamamlandı.","Die Aufgabe ist erledigt.","WORK");
        add(phrases,"I am ready for inspection.","Я готов к проверке.","Yoxlamaya hazıram.","Kontrole hazırım.","Ich bin bereit für die Prüfung.","WORK");
        add(phrases,"Please check the workplace.","Пожалуйста, проверьте рабочее место.","Zəhmət olmasa iş yerini yoxlayın.","Lütfen çalışma alanını kontrol edin.","Bitte überprüfen Sie den Arbeitsplatz.","WORK");
        add(phrases,"I need a clean tool.","Мне нужен чистый инструмент.","Mənə təmiz alət lazımdır.","Temiz bir takıma ihtiyacım var.","Ich brauche ein sauberes Werkzeug.","WORK");
        add(phrases,"We can start now.","Мы можем начать сейчас.","İndi başlaya bilərik.","Şimdi başlayabiliriz.","Wir können jetzt anfangen.","WORK");
        add(phrases,"The next operation is ready.","Следующая операция готова.","Növbəti əməliyyat hazırdır.","Sonraki işlem hazır.","Der nächste Vorgang ist bereit.","WORK");

        // =========================
        // BOSS - 20
        // =========================

        add(phrases,"Can I ask a question?","Можно задать вопрос?","Sual verə bilərəm?","Bir soru sorabilir miyim?","Darf ich eine Frage stellen?","BOSS");
        add(phrases,"Please approve this job.","Пожалуйста, одобрите эту работу.","Zəhmət olmasa bu işi təsdiqləyin.","Lütfen bu işi onaylayın.","Bitte genehmigen Sie diese Arbeit.","BOSS");
        add(phrases,"Please check the drawing.","Пожалуйста, проверьте чертёж.","Zəhmət olmasa çertyoju yoxlayın.","Lütfen teknik resmi kontrol edin.","Bitte überprüfen Sie die Zeichnung.","BOSS");
        add(phrases,"Please check the settings.","Пожалуйста, проверьте настройки.","Zəhmət olmasa parametrləri yoxlayın.","Lütfen ayarları kontrol edin.","Bitte überprüfen Sie die Einstellungen.","BOSS");
        add(phrases,"I have finished this batch.","Я закончил эту партию.","Bu partiyanı bitirmişəm.","Bu partiyi bitirdim.","Ich habe diese Charge fertiggestellt.","BOSS");
        add(phrases,"The batch is ready.","Партия готова.","Partiya hazırdır.","Parti hazır.","Die Charge ist bereit.","BOSS");
        add(phrases,"Should I continue?","Мне продолжать?","Davam edim?","Devam edeyim mi?","Soll ich weitermachen?","BOSS");
        add(phrases,"Which operation is next?","Какая следующая операция?","Növbəti əməliyyat hansıdır?","Sonraki işlem hangisi?","Welcher Vorgang kommt als Nächstes?","BOSS");
        add(phrases,"Which material should I use?","Какой материал мне использовать?","Hansı materialdan istifadə etməliyəm?","Hangi malzemeyi kullanmalıyım?","Welches Material soll ich verwenden?","BOSS");
        add(phrases,"Do you need this urgently?","Вам это нужно срочно?","Buna təcili ehtiyacınız var?","Buna acilen ihtiyacınız var mı?","Brauchen Sie das dringend?","BOSS");
        add(phrases,"I need your confirmation.","Мне нужно ваше подтверждение.","Mənə sizin təsdiqiniz lazımdır.","Onayınıza ihtiyacım var.","Ich brauche Ihre Bestätigung.","BOSS");
        add(phrases,"Please sign the document.","Пожалуйста, подпишите документ.","Zəhmət olmasa sənədi imzalayın.","Lütfen belgeyi imzalayın.","Bitte unterschreiben Sie das Dokument.","BOSS");
        add(phrases,"The result is ready.","Результат готов.","Nəticə hazırdır.","Sonuç hazır.","Das Ergebnis ist fertig.","BOSS");
        add(phrases,"I found a problem.","Я нашёл проблему.","Problem tapmışam.","Bir sorun buldum.","Ich habe ein Problem gefunden.","BOSS");
        add(phrases,"I have stopped the machine.","Я остановил станок.","Dəzgahı dayandırmışam.","Makineyi durdurdum.","Ich habe die Maschine gestoppt.","BOSS");
        add(phrases,"Should I call maintenance?","Мне вызвать обслуживание?","Texniki xidməti çağırım?","Bakımı çağırmalı mıyım?","Soll ich die Instandhaltung rufen?","BOSS");
        add(phrases,"Can you check this measurement?","Можете проверить этот размер?","Bu ölçünü yoxlaya bilərsiniz?","Bu ölçümü kontrol edebilir misiniz?","Können Sie dieses Maß überprüfen?","BOSS");
        add(phrases,"Can I change the setup?","Могу я изменить настройку?","Quraşdırmanı dəyişə bilərəm?","Ayarı değiştirebilir miyim?","Kann ich die Einstellung ändern?","BOSS");
        add(phrases,"Please tell me the priority.","Пожалуйста, скажите мне приоритет.","Zəhmət olmasa prioriteti deyin.","Lütfen önceliği söyleyin.","Bitte sagen Sie mir die Priorität.","BOSS");
        add(phrases,"I will follow your instructions.","Я буду следовать вашим инструкциям.","Sizin təlimatlarınıza əməl edəcəyəm.","Talimatlarınıza uyacağım.","Ich werde Ihre Anweisungen befolgen.","BOSS");

        // =========================
        // MACHINE - 20
        // =========================

        add(phrases,"Turn on the main power.","Включите основное питание.","Əsas enerjini qoşun.","Ana gücü açın.","Schalten Sie die Hauptstromversorgung ein.","MACHINE");
        add(phrases,"Turn off the main power.","Выключите основное питание.","Əsas enerjini söndürün.","Ana gücü kapatın.","Schalten Sie die Hauptstromversorgung aus.","MACHINE");
        add(phrases,"Check the control panel.","Проверьте панель управления.","İdarəetmə panelini yoxlayın.","Kontrol panelini kontrol edin.","Überprüfen Sie das Bedienfeld.","MACHINE");
        add(phrases,"The control panel is on.","Панель управления включена.","İdarəetmə paneli açıqdır.","Kontrol paneli açık.","Das Bedienfeld ist eingeschaltet.","MACHINE");
        add(phrases,"The machine is in automatic mode.","Станок в автоматическом режиме.","Dəzgah avtomatik rejimdədir.","Makine otomatik modda.","Die Maschine ist im Automatikbetrieb.","MACHINE");
        add(phrases,"The machine is in manual mode.","Станок в ручном режиме.","Dəzgah əl rejimindədir.","Makine manuel modda.","Die Maschine ist im Handbetrieb.","MACHINE");
        add(phrases,"Check the safety switch.","Проверьте защитный выключатель.","Təhlükəsizlik açarını yoxlayın.","Güvenlik şalterini kontrol edin.","Überprüfen Sie den Sicherheitsschalter.","MACHINE");
        add(phrases,"The safety switch is open.","Защитный выключатель разомкнут.","Təhlükəsizlik açarı açıqdır.","Güvenlik şalteri açık.","Der Sicherheitsschalter ist geöffnet.","MACHINE");
        add(phrases,"Close the safety switch.","Закройте защитный выключатель.","Təhlükəsizlik açarını bağlayın.","Güvenlik şalterini kapatın.","Schließen Sie den Sicherheitsschalter.","MACHINE");
        add(phrases,"Check the hydraulic system.","Проверьте гидравлическую систему.","Hidravlik sistemi yoxlayın.","Hidrolik sistemi kontrol edin.","Überprüfen Sie das Hydrauliksystem.","MACHINE");
        add(phrases,"The hydraulic pressure is low.","Гидравлическое давление низкое.","Hidravlik təzyiq aşağıdır.","Hidrolik basınç düşük.","Der Hydraulikdruck ist niedrig.","MACHINE");
        add(phrases,"The hydraulic pressure is high.","Гидравлическое давление высокое.","Hidravlik təzyiq yüksəkdir.","Hidrolik basınç yüksek.","Der Hydraulikdruck ist hoch.","MACHINE");
        add(phrases,"Check the coolant level.","Проверьте уровень охлаждающей жидкости.","Soyuducu mayenin səviyyəsini yoxlayın.","Soğutma sıvısı seviyesini kontrol edin.","Überprüfen Sie den Kühlmittelstand.","MACHINE");
        add(phrases,"The coolant level is low.","Уровень охлаждающей жидкости низкий.","Soyuducu mayenin səviyyəsi aşağıdır.","Soğutma sıvısı seviyesi düşük.","Der Kühlmittelstand ist niedrig.","MACHINE");
        add(phrases,"Add coolant.","Добавьте охлаждающую жидкость.","Soyuducu maye əlavə edin.","Soğutma sıvısı ekleyin.","Füllen Sie Kühlmittel nach.","MACHINE");
        add(phrases,"The machine needs lubrication.","Станку нужна смазка.","Dəzgaha yağlama lazımdır.","Makinenin yağlanması gerekiyor.","Die Maschine braucht Schmierung.","MACHINE");
        add(phrases,"Check the alarm light.","Проверьте сигнальную лампу.","Siqnal lampasını yoxlayın.","Alarm lambasını kontrol edin.","Überprüfen Sie die Warnleuchte.","MACHINE");
        add(phrases,"The alarm light is on.","Сигнальная лампа горит.","Siqnal lampası yanır.","Alarm lambası yanıyor.","Die Warnleuchte ist an.","MACHINE");
        add(phrases,"Reset the machine.","Сбросьте станок.","Dəzgahı sıfırlayın.","Makineyi sıfırlayın.","Setzen Sie die Maschine zurück.","MACHINE");
        add(phrases,"The machine is ready for production.","Станок готов к производству.","Dəzgah istehsala hazırdır.","Makine üretime hazır.","Die Maschine ist für die Produktion bereit.","MACHINE");

        // =========================
        // CNC - 20
        // =========================

        add(phrases,"Open the CNC program.","Откройте программу ЧПУ.","CNC proqramını açın.","CNC programını açın.","Öffnen Sie das CNC-Programm.","CNC");
        add(phrases,"Select the correct program.","Выберите правильную программу.","Düzgün proqramı seçin.","Doğru programı seçin.","Wählen Sie das richtige Programm.","CNC");
        add(phrases,"Check the program version.","Проверьте версию программы.","Proqramın versiyasını yoxlayın.","Program sürümünü kontrol edin.","Überprüfen Sie die Programmversion.","CNC");
        add(phrases,"Check the tool length.","Проверьте длину инструмента.","Alətin uzunluğunu yoxlayın.","Takım uzunluğunu kontrol edin.","Überprüfen Sie die Werkzeuglänge.","CNC");
        add(phrases,"Measure the tool length.","Измерьте длину инструмента.","Alətin uzunluğunu ölçün.","Takım uzunluğunu ölçün.","Messen Sie die Werkzeuglänge.","CNC");
        add(phrases,"Check the work offset.","Проверьте рабочую коррекцию.","İş korreksiyasını yoxlayın.","İş ofsetini kontrol edin.","Überprüfen Sie den Werkstückoffset.","CNC");
        add(phrases,"Set the work offset.","Установите рабочую коррекцию.","İş korreksiyasını təyin edin.","İş ofsetini ayarlayın.","Stellen Sie den Werkstückoffset ein.","CNC");
        add(phrases,"Check the cutting depth.","Проверьте глубину резания.","Kəsmə dərinliyini yoxlayın.","Kesme derinliğini kontrol edin.","Überprüfen Sie die Schnitttiefe.","CNC");
        add(phrases,"Set the cutting depth.","Установите глубину резания.","Kəsmə dərinliyini təyin edin.","Kesme derinliğini ayarlayın.","Stellen Sie die Schnitttiefe ein.","CNC");
        add(phrases,"Check the cutting speed.","Проверьте скорость резания.","Kəsmə sürətini yoxlayın.","Kesme hızını kontrol edin.","Überprüfen Sie die Schnittgeschwindigkeit.","CNC");
        add(phrases,"Reduce the cutting speed.","Уменьшите скорость резания.","Kəsmə sürətini azaldın.","Kesme hızını azaltın.","Reduzieren Sie die Schnittgeschwindigkeit.","CNC");
        add(phrases,"Increase the feed rate.","Увеличьте скорость подачи.","Veriş sürətini artırın.","İlerleme hızını artırın.","Erhöhen Sie den Vorschub.","CNC");
        add(phrases,"Reduce the feed rate.","Уменьшите скорость подачи.","Veriş sürətini azaldın.","İlerleme hızını azaltın.","Reduzieren Sie den Vorschub.","CNC");
        add(phrases,"Check the spindle direction.","Проверьте направление шпинделя.","Şpindelin istiqamətini yoxlayın.","İş mili yönünü kontrol edin.","Überprüfen Sie die Spindelrichtung.","CNC");
        add(phrases,"Check the coolant flow.","Проверьте поток охлаждающей жидкости.","Soyuducu mayenin axınını yoxlayın.","Soğutma sıvısı akışını kontrol edin.","Überprüfen Sie den Kühlmittelfluss.","CNC");
        add(phrases,"Start the machining cycle.","Запустите цикл обработки.","Emal siklini işə salın.","İşleme çevrimini başlatın.","Starten Sie den Bearbeitungszyklus.","CNC");
        add(phrases,"Stop the machining cycle.","Остановите цикл обработки.","Emal siklini dayandırın.","İşleme çevrimini durdurun.","Stoppen Sie den Bearbeitungszyklus.","CNC");
        add(phrases,"The CNC alarm is active.","Авария ЧПУ активна.","CNC alarmı aktivdir.","CNC alarmı aktif.","Der CNC-Alarm ist aktiv.","CNC");
        add(phrases,"Check the machine coordinates.","Проверьте координаты станка.","Dəzgah koordinatlarını yoxlayın.","Makine koordinatlarını kontrol edin.","Überprüfen Sie die Maschinenkoordinaten.","CNC");
        add(phrases,"Save the new settings.","Сохраните новые настройки.","Yeni parametrləri yadda saxlayın.","Yeni ayarları kaydedin.","Speichern Sie die neuen Einstellungen.","CNC");

        // =========================
        // STAMPING - 20
        // =========================

        add(phrases,"Check the press before starting.","Проверьте пресс перед запуском.","Presi işə salmazdan əvvəl yoxlayın.","Presi çalıştırmadan önce kontrol edin.","Überprüfen Sie die Presse vor dem Start.","STAMPING");
        add(phrases,"Check the die alignment.","Проверьте выравнивание матрицы.","Matrisin düzülüşünü yoxlayın.","Kalıp hizalamasını kontrol edin.","Überprüfen Sie die Ausrichtung der Matrize.","STAMPING");
        add(phrases,"Align the die correctly.","Правильно выровняйте матрицу.","Matrisi düzgün düzün.","Kalıbı doğru hizalayın.","Richten Sie die Matrize richtig aus.","STAMPING");
        add(phrases,"Check the upper die.","Проверьте верхнюю матрицу.","Üst matrisi yoxlayın.","Üst kalıbı kontrol edin.","Überprüfen Sie die obere Matrize.","STAMPING");
        add(phrases,"Check the lower die.","Проверьте нижнюю матрицу.","Alt matrisi yoxlayın.","Alt kalıbı kontrol edin.","Überprüfen Sie die untere Matrize.","STAMPING");
        add(phrases,"Check the die clearance.","Проверьте зазор матрицы.","Matris boşluğunu yoxlayın.","Kalıp boşluğunu kontrol edin.","Überprüfen Sie den Matrizenspalt.","STAMPING");
        add(phrases,"The die clearance is too small.","Зазор матрицы слишком маленький.","Matris boşluğu çox kiçikdir.","Kalıp boşluğu çok küçük.","Der Matrizenspalt ist zu klein.","STAMPING");
        add(phrases,"The die clearance is too large.","Зазор матрицы слишком большой.","Matris boşluğu çox böyükdür.","Kalıp boşluğu çok büyük.","Der Matrizenspalt ist zu groß.","STAMPING");
        add(phrases,"Check the press stroke.","Проверьте ход пресса.","Presin gedişini yoxlayın.","Pres strokunu kontrol edin.","Überprüfen Sie den Pressenhub.","STAMPING");
        add(phrases,"Set the press stroke.","Установите ход пресса.","Presin gedişini təyin edin.","Pres strokunu ayarlayın.","Stellen Sie den Pressenhub ein.","STAMPING");
        add(phrases,"Check the material position.","Проверьте положение материала.","Materialın vəziyyətini yoxlayın.","Malzeme konumunu kontrol edin.","Überprüfen Sie die Materialposition.","STAMPING");
        add(phrases,"Position the sheet correctly.","Правильно установите лист.","Vərəqi düzgün yerləşdirin.","Sac levhayı doğru yerleştirin.","Positionieren Sie das Blech richtig.","STAMPING");
        add(phrases,"The sheet is not aligned.","Лист не выровнен.","Vərəq düzgün düzülməyib.","Sac levha hizalanmamış.","Das Blech ist nicht ausgerichtet.","STAMPING");
        add(phrases,"Check the feeding system.","Проверьте систему подачи.","Qidalandırma sistemini yoxlayın.","Besleme sistemini kontrol edin.","Überprüfen Sie das Zuführsystem.","STAMPING");
        add(phrases,"The feeder is not working.","Подающее устройство не работает.","Verici qurğu işləmir.","Besleyici çalışmıyor.","Die Zuführeinrichtung funktioniert nicht.","STAMPING");
        add(phrases,"Check the safety guard.","Проверьте защитное ограждение.","Mühafizə örtüyünü yoxlayın.","Koruyucu muhafazayı kontrol edin.","Überprüfen Sie die Schutzvorrichtung.","STAMPING");
        add(phrases,"The press is making a strange noise.","Пресс издаёт странный шум.","Pres qəribə səs çıxarır.","Pres garip bir ses çıkarıyor.","Die Presse macht ein ungewöhnliches Geräusch.","STAMPING");
        add(phrases,"The stamping cycle is complete.","Цикл штамповки завершён.","Ştamplama sikli tamamlanıb.","Presleme çevrimi tamamlandı.","Der Stanzzyklus ist abgeschlossen.","STAMPING");
        add(phrases,"Remove the finished part.","Снимите готовую деталь.","Hazır detalı çıxarın.","Bitmiş parçayı çıkarın.","Entfernen Sie das fertige Teil.","STAMPING");
        add(phrases,"Inspect the stamped part.","Проверьте штампованную деталь.","Ştamplanmış detalı yoxlayın.","Preslenmiş parçayı kontrol edin.","Prüfen Sie das gestanzte Teil.","STAMPING");

        // =========================
        // QUALITY - 20
        // =========================

        add(phrases,"Check the part against the drawing.","Проверьте деталь по чертежу.","Detalı çertyoja görə yoxlayın.","Parçayı teknik resme göre kontrol edin.","Prüfen Sie das Teil anhand der Zeichnung.","QUALITY");
        add(phrases,"Compare the part with the sample.","Сравните деталь с образцом.","Detalı nümunə ilə müqayisə edin.","Parçayı numuneyle karşılaştırın.","Vergleichen Sie das Teil mit dem Muster.","QUALITY");
        add(phrases,"Record the measurement.","Запишите измерение.","Ölçünü qeyd edin.","Ölçümü kaydedin.","Notieren Sie das Maß.","QUALITY");
        add(phrases,"Write down the result.","Запишите результат.","Nəticəni yazın.","Sonucu yazın.","Schreiben Sie das Ergebnis auf.","QUALITY");
        add(phrases,"The measurement is within tolerance.","Размер находится в допуске.","Ölçü tolerantlıq daxilindədir.","Ölçüm tolerans dahilinde.","Das Maß liegt innerhalb der Toleranz.","QUALITY");
        add(phrases,"The measurement is outside tolerance.","Размер вне допуска.","Ölçü tolerantlıqdan kənardadır.","Ölçüm tolerans dışında.","Das Maß liegt außerhalb der Toleranz.","QUALITY");
        add(phrases,"Check the thickness.","Проверьте толщину.","Qalınlığı yoxlayın.","Kalınlığı kontrol edin.","Überprüfen Sie die Dicke.","QUALITY");
        add(phrases,"Check the hole diameter.","Проверьте диаметр отверстия.","Deşiyin diametrini yoxlayın.","Deliğin çapını kontrol edin.","Überprüfen Sie den Lochdurchmesser.","QUALITY");
        add(phrases,"Check the hole position.","Проверьте положение отверстия.","Deşiyin vəziyyətini yoxlayın.","Deliğin konumunu kontrol edin.","Überprüfen Sie die Lochposition.","QUALITY");
        add(phrases,"Check the angle.","Проверьте угол.","Bucağı yoxlayın.","Açıyı kontrol edin.","Überprüfen Sie den Winkel.","QUALITY");
        add(phrases,"Check the flatness.","Проверьте плоскостность.","Hamarlığı yoxlayın.","Düzlemselliği kontrol edin.","Überprüfen Sie die Ebenheit.","QUALITY");
        add(phrases,"Check the surface finish.","Проверьте качество поверхности.","Səthin işlənməsini yoxlayın.","Yüzey kalitesini kontrol edin.","Überprüfen Sie die Oberflächenqualität.","QUALITY");
        add(phrases,"There is a scratch.","Есть царапина.","Cızıq var.","Çizik var.","Es gibt einen Kratzer.","QUALITY");
        add(phrases,"There is a dent.","Есть вмятина.","Çökəklik var.","Çöküntü var.","Es gibt eine Delle.","QUALITY");
        add(phrases,"There is a deformation.","Есть деформация.","Deformasiya var.","Deformasyon var.","Es gibt eine Verformung.","QUALITY");
        add(phrases,"The edge is damaged.","Кромка повреждена.","Kənar zədələnib.","Kenar hasarlı.","Die Kante ist beschädigt.","QUALITY");
        add(phrases,"The part needs rework.","Деталь требует доработки.","Detal yenidən işlənməlidir.","Parçanın yeniden işlenmesi gerekiyor.","Das Teil muss nachgearbeitet werden.","QUALITY");
        add(phrases,"The part needs another inspection.","Деталь нужно проверить ещё раз.","Detalı yenidən yoxlamaq lazımdır.","Parçanın tekrar kontrol edilmesi gerekiyor.","Das Teil muss erneut geprüft werden.","QUALITY");
        add(phrases,"Separate the defective parts.","Отделите бракованные детали.","Qüsurlu detalları ayırın.","Hatalı parçaları ayırın.","Trennen Sie die fehlerhaften Teile.","QUALITY");
        add(phrases,"Mark the rejected part.","Пометьте забракованную деталь.","Yararsız detalı işarələyin.","Reddedilen parçayı işaretleyin.","Kennzeichnen Sie das abgelehnte Teil.","QUALITY");

        // =========================
        // SAFETY - 20
        // =========================

        add(phrases,"Keep your hands away from the machine.","Держите руки подальше от станка.","Əllərinizi dəzgahdan uzaq saxlayın.","Ellerinizi makineden uzak tutun.","Halten Sie Ihre Hände von der Maschine fern.","SAFETY");
        add(phrases,"Keep a safe distance.","Соблюдайте безопасную дистанцию.","Təhlükəsiz məsafə saxlayın.","Güvenli mesafeyi koruyun.","Halten Sie einen sicheren Abstand.","SAFETY");
        add(phrases,"Do not enter this area.","Не входите в эту зону.","Bu əraziyə girməyin.","Bu alana girmeyin.","Betreten Sie diesen Bereich nicht.","SAFETY");
        add(phrases,"Do not work without protection.","Не работайте без защиты.","Mühafizəsiz işləməyin.","Koruma olmadan çalışmayın.","Arbeiten Sie nicht ohne Schutz.","SAFETY");
        add(phrases,"Check your personal protective equipment.","Проверьте свои средства защиты.","Fərdi mühafizə vasitələrinizi yoxlayın.","Kişisel koruyucu ekipmanınızı kontrol edin.","Überprüfen Sie Ihre persönliche Schutzausrüstung.","SAFETY");
        add(phrases,"Use hearing protection.","Используйте защиту слуха.","Eşitmə qoruyucusundan istifadə edin.","Kulak koruyucusu kullanın.","Verwenden Sie Gehörschutz.","SAFETY");
        add(phrases,"Use the correct protective equipment.","Используйте правильные средства защиты.","Düzgün mühafizə vasitələrindən istifadə edin.","Doğru koruyucu ekipmanı kullanın.","Verwenden Sie die richtige Schutzausrüstung.","SAFETY");
        add(phrases,"Do not wear loose clothing.","Не носите свободную одежду.","Boş paltar geyinməyin.","Bol kıyafet giymeyin.","Tragen Sie keine lose Kleidung.","SAFETY");
        add(phrases,"Tie back long hair.","Уберите длинные волосы.","Uzun saçları yığın.","Uzun saçları toplayın.","Binden Sie lange Haare zusammen.","SAFETY");
        add(phrases,"Keep the floor dry.","Держите пол сухим.","Döşəməni quru saxlayın.","Zemini kuru tutun.","Halten Sie den Boden trocken.","SAFETY");
        add(phrases,"Clean the oil spill.","Уберите разлив масла.","Yağ töküntüsünü təmizləyin.","Yağ döküntüsünü temizleyin.","Beseitigen Sie die Ölverschüttung.","SAFETY");
        add(phrases,"Report unsafe conditions.","Сообщайте об опасных условиях.","Təhlükəli şərait barədə məlumat verin.","Güvensiz koşulları bildirin.","Melden Sie unsichere Bedingungen.","SAFETY");
        add(phrases,"Report the hazard immediately.","Немедленно сообщите об опасности.","Təhlükə barədə dərhal məlumat verin.","Tehlikeyi hemen bildirin.","Melden Sie die Gefahr sofort.","SAFETY");
        add(phrases,"Do not bypass the safety system.","Не обходите систему безопасности.","Təhlükəsizlik sistemini keçməyin.","Güvenlik sistemini devre dışı bırakmayın.","Umgehen Sie das Sicherheitssystem nicht.","SAFETY");
        add(phrases,"Do not remove the safety guard.","Не снимайте защитное ограждение.","Mühafizə örtüyünü çıxarmayın.","Koruyucu muhafazayı çıkarmayın.","Entfernen Sie die Schutzvorrichtung nicht.","SAFETY");
        add(phrases,"Wait until the machine stops.","Подождите, пока станок остановится.","Dəzgah dayanana qədər gözləyin.","Makine durana kadar bekleyin.","Warten Sie, bis die Maschine stoppt.","SAFETY");
        add(phrases,"Lock out the machine before maintenance.","Заблокируйте станок перед обслуживанием.","Texniki xidmətdən əvvəl dəzgahı bloklayın.","Bakım öncesi makineyi kilitleyin.","Sichern Sie die Maschine vor der Wartung.","SAFETY");
        add(phrases,"Keep the emergency exit clear.","Держите аварийный выход свободным.","Təcili çıxışı açıq saxlayın.","Acil çıkışı açık tutun.","Halten Sie den Notausgang frei.","SAFETY");
        add(phrases,"Know the emergency procedure.","Знайте порядок действий при аварии.","Təcili vəziyyət prosedurunu bilin.","Acil durum prosedürünü bilin.","Kennen Sie das Notfallverfahren.","SAFETY");
        add(phrases,"Follow the safety signs.","Следуйте знакам безопасности.","Təhlükəsizlik nişanlarına əməl edin.","Güvenlik işaretlerine uyun.","Befolgen Sie die Sicherheitszeichen.","SAFETY");

        // =========================
        // MAINTENANCE - 20
        // =========================

        add(phrases,"Check the hydraulic oil.","Проверьте гидравлическое масло.","Hidravlik yağı yoxlayın.","Hidrolik yağı kontrol edin.","Überprüfen Sie das Hydrauliköl.","MAINTENANCE");
        add(phrases,"Check the coolant system.","Проверьте систему охлаждения.","Soyutma sistemini yoxlayın.","Soğutma sistemini kontrol edin.","Überprüfen Sie das Kühlsystem.","MAINTENANCE");
        add(phrases,"Check the electrical cabinet.","Проверьте электрический шкаф.","Elektrik şkafını yoxlayın.","Elektrik panosunu kontrol edin.","Überprüfen Sie den Schaltschrank.","MAINTENANCE");
        add(phrases,"Check the cables.","Проверьте кабели.","Kabelləri yoxlayın.","Kabloları kontrol edin.","Überprüfen Sie die Kabel.","MAINTENANCE");
        add(phrases,"Check the connectors.","Проверьте разъёмы.","Birləşdiriciləri yoxlayın.","Konektörleri kontrol edin.","Überprüfen Sie die Steckverbinder.","MAINTENANCE");
        add(phrases,"Tighten the loose bolt.","Затяните ослабленный болт.","Boşalmış boltu sıxın.","Gevşek cıvatayı sıkın.","Ziehen Sie die lose Schraube fest.","MAINTENANCE");
        add(phrases,"Tighten the loose nut.","Затяните ослабленную гайку.","Boşalmış qozanı sıxın.","Gevşek somunu sıkın.","Ziehen Sie die lose Mutter fest.","MAINTENANCE");
        add(phrases,"Replace the damaged cable.","Замените повреждённый кабель.","Zədələnmiş kabeli dəyişin.","Hasarlı kabloyu değiştirin.","Ersetzen Sie das beschädigte Kabel.","MAINTENANCE");
        add(phrases,"Replace the worn belt.","Замените изношенный ремень.","Yeyilmiş kəməri dəyişin.","Aşınmış kayışı değiştirin.","Ersetzen Sie den verschlissenen Riemen.","MAINTENANCE");
        add(phrases,"Clean the filter.","Очистите фильтр.","Filtri təmizləyin.","Filtreyi temizleyin.","Reinigen Sie den Filter.","MAINTENANCE");
        add(phrases,"Clean the machine.","Очистите станок.","Dəzgahı təmizləyin.","Makineyi temizleyin.","Reinigen Sie die Maschine.","MAINTENANCE");
        add(phrases,"Clean the sensor.","Очистите датчик.","Sensoru təmizləyin.","Sensörü temizleyin.","Reinigen Sie den Sensor.","MAINTENANCE");
        add(phrases,"Check the pump.","Проверьте насос.","Nasosu yoxlayın.","Pompayı kontrol edin.","Überprüfen Sie die Pumpe.","MAINTENANCE");
        add(phrases,"The pump is not working.","Насос не работает.","Nasos işləmir.","Pompa çalışmıyor.","Die Pumpe funktioniert nicht.","MAINTENANCE");
        add(phrases,"Check the valve.","Проверьте клапан.","Klapanı yoxlayın.","Vanayı kontrol edin.","Überprüfen Sie das Ventil.","MAINTENANCE");
        add(phrases,"The valve is leaking.","Клапан протекает.","Klapan sızdırır.","Vana sızdırıyor.","Das Ventil ist undicht.","MAINTENANCE");
        add(phrases,"Check the pressure gauge.","Проверьте манометр.","Təzyiqölçəni yoxlayın.","Basınç göstergesini kontrol edin.","Überprüfen Sie das Manometer.","MAINTENANCE");
        add(phrases,"Check the cooling fan.","Проверьте вентилятор охлаждения.","Soyutma ventilyatorunu yoxlayın.","Soğutma fanını kontrol edin.","Überprüfen Sie den Kühllüfter.","MAINTENANCE");
        add(phrases,"The fan is not working.","Вентилятор не работает.","Ventilyator işləmir.","Fan çalışmıyor.","Der Lüfter funktioniert nicht.","MAINTENANCE");
        add(phrases,"Test the machine after repair.","Проверьте станок после ремонта.","Təmirdən sonra dəzgahı sınaqdan keçirin.","Onarımdan sonra makineyi test edin.","Testen Sie die Maschine nach der Reparatur.","MAINTENANCE");

        // =========================
        // WELDING - 10
        // =========================

        add(phrases,"Check the welding current.","Проверьте сварочный ток.","Qaynaq cərəyanını yoxlayın.","Kaynak akımını kontrol edin.","Überprüfen Sie den Schweißstrom.","WELDING");
        add(phrases,"Set the welding current.","Установите сварочный ток.","Qaynaq cərəyanını təyin edin.","Kaynak akımını ayarlayın.","Stellen Sie den Schweißstrom ein.","WELDING");
        add(phrases,"Check the welding voltage.","Проверьте сварочное напряжение.","Qaynaq gərginliyini yoxlayın.","Kaynak voltajını kontrol edin.","Überprüfen Sie die Schweißspannung.","WELDING");
        add(phrases,"Set the welding voltage.","Установите сварочное напряжение.","Qaynaq gərginliyini təyin edin.","Kaynak voltajını ayarlayın.","Stellen Sie die Schweißspannung ein.","WELDING");
        add(phrases,"Clean the welding surface.","Очистите сварочную поверхность.","Qaynaq səthini təmizləyin.","Kaynak yüzeyini temizleyin.","Reinigen Sie die Schweißfläche.","WELDING");
        add(phrases,"Prepare the joint for welding.","Подготовьте соединение к сварке.","Birləşməni qaynaq üçün hazırlayın.","Birleşimi kaynağa hazırlayın.","Bereiten Sie die Verbindung zum Schweißen vor.","WELDING");
        add(phrases,"Check the gas supply.","Проверьте подачу газа.","Qaz təchizatını yoxlayın.","Gaz beslemesini kontrol edin.","Überprüfen Sie die Gasversorgung.","WELDING");
        add(phrases,"The gas pressure is low.","Давление газа низкое.","Qaz təzyiqi aşağıdır.","Gaz basıncı düşük.","Der Gasdruck ist niedrig.","WELDING");
        add(phrases,"Protect the welding area.","Защитите сварочную зону.","Qaynaq sahəsini qoruyun.","Kaynak alanını koruyun.","Schützen Sie den Schweißbereich.","WELDING");
        add(phrases,"Inspect the weld after welding.","Проверьте сварной шов после сварки.","Qaynaqdan sonra tikişi yoxlayın.","Kaynak sonrası dikişi kontrol edin.","Prüfen Sie die Schweißnaht nach dem Schweißen.","WELDING");

        // =========================
        // GALVANIC - 10
        // =========================

        add(phrases,"Check the chemical concentration.","Проверьте концентрацию химического раствора.","Kimyəvi məhlulun konsentrasiyasını yoxlayın.","Kimyasal çözeltinin konsantrasyonunu kontrol edin.","Überprüfen Sie die Chemikalienkonzentration.","GALVANIC");
        add(phrases,"Measure the bath concentration.","Измерьте концентрацию ванны.","Vannanın konsentrasiyasını ölçün.","Banyo konsantrasyonunu ölçün.","Messen Sie die Badkonzentration.","GALVANIC");
        add(phrases,"Check the solution level.","Проверьте уровень раствора.","Məhlulun səviyyəsini yoxlayın.","Çözelti seviyesini kontrol edin.","Überprüfen Sie den Lösungsstand.","GALVANIC");
        add(phrases,"Check the anode condition.","Проверьте состояние анода.","Anodun vəziyyətini yoxlayın.","Anotun durumunu kontrol edin.","Überprüfen Sie den Zustand der Anode.","GALVANIC");
        add(phrases,"Check the cathode connection.","Проверьте соединение катода.","Katod bağlantısını yoxlayın.","Katot bağlantısını kontrol edin.","Überprüfen Sie den Kathodenanschluss.","GALVANIC");
        add(phrases,"Clean the contact area.","Очистите контактную зону.","Kontakt sahəsini təmizləyin.","Temas alanını temizleyin.","Reinigen Sie den Kontaktbereich.","GALVANIC");
        add(phrases,"Wear chemical-resistant gloves.","Наденьте химически стойкие перчатки.","Kimyəviyə davamlı əlcək taxın.","Kimyasala dayanıklı eldiven takın.","Tragen Sie chemikalienbeständige Handschuhe.","GALVANIC");
        add(phrases,"Wear chemical-resistant goggles.","Наденьте химически стойкие очки.","Kimyəviyə davamlı eynək taxın.","Kimyasala dayanıklı gözlük takın.","Tragen Sie chemikalienbeständige Schutzbrillen.","GALVANIC");
        add(phrases,"Record the bath parameters.","Запишите параметры ванны.","Vannanın parametrlərini qeyd edin.","Banyo parametrelerini kaydedin.","Notieren Sie die Badparameter.","GALVANIC");
        add(phrases,"Stop the process if the solution is abnormal.","Остановите процесс, если раствор ненормальный.","Məhlul normal deyilsə prosesi dayandırın.","Çözelti anormalse işlemi durdurun.","Stoppen Sie den Prozess, wenn die Lösung ungewöhnlich ist.","GALVANIC");

        // =========================
        // EMERGENCY - 10
        // =========================

        add(phrases,"Move away from the machine.","Отойдите от станка.","Dəzgahdan uzaqlaşın.","Makineden uzaklaşın.","Entfernen Sie sich von der Maschine.","EMERGENCY");
        add(phrases,"Switch off the power if it is safe.","Отключите питание, если это безопасно.","Təhlükəsizdirsə enerjini söndürün.","Güvenliyse gücü kapatın.","Schalten Sie die Stromversorgung aus, wenn es sicher ist.","EMERGENCY");
        add(phrases,"Raise the alarm.","Поднимите тревогу.","Həyəcan siqnalı verin.","Alarmı çalıştırın.","Lösen Sie den Alarm aus.","EMERGENCY");
        add(phrases,"Inform the supervisor immediately.","Немедленно сообщите руководителю.","Dərhal rəhbərə məlumat verin.","Amiri hemen bilgilendirin.","Informieren Sie den Vorgesetzten sofort.","EMERGENCY");
        add(phrases,"Call emergency services.","Позвоните в экстренные службы.","Təcili xidmətlərə zəng edin.","Acil servisleri arayın.","Rufen Sie den Rettungsdienst.","EMERGENCY");
        add(phrases,"Do not enter the dangerous area.","Не входите в опасную зону.","Təhlükəli əraziyə girməyin.","Tehlikeli alana girmeyin.","Betreten Sie den Gefahrenbereich nicht.","EMERGENCY");
        add(phrases,"Keep the emergency path clear.","Держите аварийный проход свободным.","Təcili keçidi açıq saxlayın.","Acil geçiş yolunu açık tutun.","Halten Sie den Fluchtweg frei.","EMERGENCY");
        add(phrases,"Help the injured person safely.","Безопасно помогите пострадавшему.","Xəsarət alan şəxsə təhlükəsiz kömək edin.","Yaralı kişiye güvenli şekilde yardım edin.","Helfen Sie der verletzten Person sicher.","EMERGENCY");
        add(phrases,"Wait for the emergency team.","Ждите аварийную бригаду.","Təcili yardım qrupunu gözləyin.","Acil durum ekibini bekleyin.","Warten Sie auf das Notfallteam.","EMERGENCY");
        add(phrases,"Follow the emergency instructions.","Следуйте аварийным инструкциям.","Təcili təlimatlara əməl edin.","Acil durum talimatlarına uyun.","Befolgen Sie die Notfallanweisungen.","EMERGENCY");

        return phrases;
    }
}