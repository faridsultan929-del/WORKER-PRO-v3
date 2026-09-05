package com.workerpro.v3;

import java.util.ArrayList;
import java.util.List;

public class WorkerPhrasebook {

    public static class Phrase {
        public String english;
        public String russian;
        public String azerbaijani;

        public Phrase(String english, String russian, String azerbaijani) {
            this.english = english;
            this.russian = russian;
            this.azerbaijani = azerbaijani;
        }
    }

    public static List<Phrase> getPhrases() {
        List<Phrase> phrases = new ArrayList<>();

        // ================= BASIC WORK =================

        phrases.add(new Phrase("Good morning.", "Доброе утро.", "Sabahınız xeyir."));
        phrases.add(new Phrase("Good afternoon.", "Добрый день.", "Günortanız xeyir."));
        phrases.add(new Phrase("How are you?", "Как вы?", "Necəsiniz?"));
        phrases.add(new Phrase("I am ready.", "Я готов.", "Mən hazıram."));
        phrases.add(new Phrase("Let's start work.", "Давайте начнём работу.", "Gəlin işə başlayaq."));
        phrases.add(new Phrase("What is my task?", "Какое у меня задание?", "Mənim tapşırığım nədir?"));
        phrases.add(new Phrase("What should I do?", "Что мне делать?", "Mən nə etməliyəm?"));
        phrases.add(new Phrase("Please show me.", "Пожалуйста, покажите мне.", "Zəhmət olmasa, mənə göstərin."));
        phrases.add(new Phrase("I understand.", "Я понимаю.", "Mən başa düşürəm."));
        phrases.add(new Phrase("I don't understand.", "Я не понимаю.", "Mən başa düşmürəm."));
        phrases.add(new Phrase("Please repeat.", "Пожалуйста, повторите.", "Zəhmət olmasa, təkrar edin."));
        phrases.add(new Phrase("Speak slowly, please.", "Говорите медленнее, пожалуйста.", "Zəhmət olmasa, yavaş danışın."));
        phrases.add(new Phrase("Can you help me?", "Можете мне помочь?", "Mənə kömək edə bilərsiniz?"));
        phrases.add(new Phrase("I need help.", "Мне нужна помощь.", "Mənə kömək lazımdır."));
        phrases.add(new Phrase("Wait a moment.", "Подождите минуту.", "Bir dəqiqə gözləyin."));
        phrases.add(new Phrase("Everything is ready.", "Всё готово.", "Hər şey hazırdır."));
        phrases.add(new Phrase("The job is finished.", "Работа закончена.", "İş bitib."));
        phrases.add(new Phrase("I have finished the job.", "Я закончил работу.", "Mən işi bitirmişəm."));
        phrases.add(new Phrase("Thank you.", "Спасибо.", "Təşəkkür edirəm."));
        phrases.add(new Phrase("You're welcome.", "Пожалуйста.", "Buyurun."));

        // ================= BOSS AND WORKER =================

        phrases.add(new Phrase("What do you want me to do?", "Что вы хотите, чтобы я сделал?", "Mənim nə etməyimi istəyirsiniz?"));
        phrases.add(new Phrase("I will do it.", "Я это сделаю.", "Mən bunu edəcəyəm."));
        phrases.add(new Phrase("I will check it.", "Я это проверю.", "Mən bunu yoxlayacağam."));
        phrases.add(new Phrase("I will fix it.", "Я это исправлю.", "Mən bunu düzəldəcəyəm."));
        phrases.add(new Phrase("The work is almost finished.", "Работа почти закончена.", "İş demək olar ki, bitib."));
        phrases.add(new Phrase("I need more time.", "Мне нужно больше времени.", "Mənə daha çox vaxt lazımdır."));
        phrases.add(new Phrase("There is a problem.", "Есть проблема.", "Problem var."));
        phrases.add(new Phrase("I found the problem.", "Я нашёл проблему.", "Mən problemi tapdım."));
        phrases.add(new Phrase("The problem is fixed.", "Проблема исправлена.", "Problem düzəldilib."));
        phrases.add(new Phrase("Please check my work.", "Пожалуйста, проверьте мою работу.", "Zəhmət olmasa, işimi yoxlayın."));

        // ================= MACHINE =================

        phrases.add(new Phrase("The machine is ready.", "Станок готов.", "Dəzgah hazırdır."));
        phrases.add(new Phrase("The machine is running.", "Станок работает.", "Dəzgah işləyir."));
        phrases.add(new Phrase("The machine has stopped.", "Станок остановился.", "Dəzgah dayanıb."));
        phrases.add(new Phrase("The machine is not working.", "Станок не работает.", "Dəzgah işləmir."));
        phrases.add(new Phrase("Start the machine.", "Запустите станок.", "Dəzgahı işə salın."));
        phrases.add(new Phrase("Stop the machine.", "Остановите станок.", "Dəzgahı dayandırın."));
        phrases.add(new Phrase("Reset the machine.", "Сбросьте станок.", "Dəzgahı sıfırlayın."));
        phrases.add(new Phrase("Check the machine.", "Проверьте станок.", "Dəzgahı yoxlayın."));
        phrases.add(new Phrase("Check the control panel.", "Проверьте панель управления.", "İdarəetmə panelini yoxlayın."));
        phrases.add(new Phrase("There is an alarm.", "Есть аварийный сигнал.", "Siqnal var."));
        phrases.add(new Phrase("Check the alarm.", "Проверьте сигнал.", "Siqnalı yoxlayın."));
        phrases.add(new Phrase("Check the error code.", "Проверьте код ошибки.", "Səhv kodunu yoxlayın."));
        phrases.add(new Phrase("The machine is overheating.", "Станок перегревается.", "Dəzgah həddindən artıq qızır."));
        phrases.add(new Phrase("The machine is making noise.", "Станок издаёт шум.", "Dəzgah səs-küy yaradır."));
        phrases.add(new Phrase("There is vibration.", "Есть вибрация.", "Vibrasiya var."));

        // ================= CNC =================

        phrases.add(new Phrase("Check the CNC program.", "Проверьте программу ЧПУ.", "CNC proqramını yoxlayın."));
        phrases.add(new Phrase("The program is running.", "Программа выполняется.", "Proqram işləyir."));
        phrases.add(new Phrase("The program has stopped.", "Программа остановилась.", "Proqram dayanıb."));
        phrases.add(new Phrase("Check the program number.", "Проверьте номер программы.", "Proqram nömrəsini yoxlayın."));
        phrases.add(new Phrase("Check the coordinates.", "Проверьте координаты.", "Koordinatları yoxlayın."));
        phrases.add(new Phrase("Set the zero point.", "Установите нулевую точку.", "Sıfır nöqtəsini təyin edin."));
        phrases.add(new Phrase("Return to the home position.", "Вернитесь в исходную позицию.", "Başlanğıc mövqeyinə qayıdın."));
        phrases.add(new Phrase("Check the tool length.", "Проверьте длину инструмента.", "Alətin uzunluğunu yoxlayın."));
        phrases.add(new Phrase("Check the tool diameter.", "Проверьте диаметр инструмента.", "Alətin diametrini yoxlayın."));
        phrases.add(new Phrase("Change the tool.", "Замените инструмент.", "Aləti dəyişin."));
        phrases.add(new Phrase("The tool is worn.", "Инструмент изношен.", "Alət köhnəlib."));
        phrases.add(new Phrase("The spindle speed is too high.", "Скорость шпинделя слишком высокая.", "Şpindel sürəti çox yüksəkdir."));
        phrases.add(new Phrase("Reduce the feed rate.", "Уменьшите скорость подачи.", "Veriş sürətini azaldın."));
        phrases.add(new Phrase("Press feed hold.", "Нажмите остановку подачи.", "Verişin saxlanması düyməsini basın."));
        phrases.add(new Phrase("Run the program in dry run.", "Запустите программу в холостом режиме.", "Proqramı boş gediş rejimində işə salın."));

        // ================= STAMPING =================

        phrases.add(new Phrase("The stamping machine is ready.", "Штамповочная машина готова.", "Ştamplama maşını hazırdır."));
        phrases.add(new Phrase("Check the stamping die.", "Проверьте штамповочную матрицу.", "Ştamplama matrisini yoxlayın."));
        phrases.add(new Phrase("Check the punch.", "Проверьте пуансон.", "Puansonu yoxlayın."));
        phrases.add(new Phrase("Check the upper die.", "Проверьте верхнюю матрицу.", "Üst matrisi yoxlayın."));
        phrases.add(new Phrase("Check the lower die.", "Проверьте нижнюю матрицу.", "Alt matrisi yoxlayın."));
        phrases.add(new Phrase("Check the press force.", "Проверьте усилие пресса.", "Pres qüvvəsini yoxlayın."));
        phrases.add(new Phrase("The press force is too high.", "Усилие пресса слишком высокое.", "Pres qüvvəsi çox yüksəkdir."));
        phrases.add(new Phrase("Check the sheet thickness.", "Проверьте толщину листа.", "Sac qalınlığını yoxlayın."));
        phrases.add(new Phrase("Check the feed length.", "Проверьте длину подачи.", "Veriş uzunluğunu yoxlayın."));
        phrases.add(new Phrase("Check the feed pitch.", "Проверьте шаг подачи.", "Veriş addımını yoxlayın."));
        phrases.add(new Phrase("The part has a defect.", "Деталь имеет дефект.", "Detalda qüsur var."));
        phrases.add(new Phrase("The part is rejected.", "Деталь забракована.", "Detal rədd edilib."));
        phrases.add(new Phrase("Remove the burr.", "Удалите заусенец.", "Qratı təmizləyin."));
        phrases.add(new Phrase("Check the stamping cycle.", "Проверьте цикл штамповки.", "Ştamplama tsiklini yoxlayın."));
        phrases.add(new Phrase("Stop the press.", "Остановите пресс.", "Presi dayandırın."));

        // ================= QUALITY =================

        phrases.add(new Phrase("Check the quality.", "Проверьте качество.", "Keyfiyyəti yoxlayın."));
        phrases.add(new Phrase("Measure the part.", "Измерьте деталь.", "Detalın ölçüsünü yoxlayın."));
        phrases.add(new Phrase("Check the diameter.", "Проверьте диаметр.", "Diametri yoxlayın."));
        phrases.add(new Phrase("Check the thickness.", "Проверьте толщину.", "Qalınlığı yoxlayın."));
        phrases.add(new Phrase("Check the length.", "Проверьте длину.", "Uzunluğu yoxlayın."));
        phrases.add(new Phrase("Check the width.", "Проверьте ширину.", "Eni yoxlayın."));
        phrases.add(new Phrase("The measurement is correct.", "Измерение правильное.", "Ölçü düzgündür."));
        phrases.add(new Phrase("The measurement is not correct.", "Измерение неправильное.", "Ölçü düzgün deyil."));
        phrases.add(new Phrase("The part meets the standard.", "Деталь соответствует стандарту.", "Detal standarta uyğundur."));
        phrases.add(new Phrase("The part does not meet the standard.", "Деталь не соответствует стандарту.", "Detal standarta uyğun deyil."));
        phrases.add(new Phrase("This part is good.", "Эта деталь хорошая.", "Bu detal yaxşıdır."));
        phrases.add(new Phrase("This part is defective.", "Эта деталь бракованная.", "Bu detal qüsurludur."));

        // ================= SAFETY =================

        phrases.add(new Phrase("Safety comes first.", "Безопасность прежде всего.", "Təhlükəsizlik hər şeydən vacibdir."));
        phrases.add(new Phrase("Be careful.", "Будьте осторожны.", "Ehtiyatlı olun."));
        phrases.add(new Phrase("Wear your PPE.", "Наденьте СИЗ.", "Fərdi mühafizə vasitələrinizi geyinin."));
        phrases.add(new Phrase("Wear your safety glasses.", "Наденьте защитные очки.", "Qoruyucu eynəyinizi taxın."));
        phrases.add(new Phrase("Wear your safety shoes.", "Наденьте защитную обувь.", "Qoruyucu ayaqqabınızı geyinin."));
        phrases.add(new Phrase("Wear your helmet.", "Наденьте каску.", "Dəbilqənizi taxın."));
        phrases.add(new Phrase("Do not touch the machine.", "Не трогайте станок.", "Dəzgaha toxunmayın."));
        phrases.add(new Phrase("Keep away from the machine.", "Держитесь подальше от станка.", "Dəzgahdan uzaq durun."));
        phrases.add(new Phrase("There is a danger here.", "Здесь опасно.", "Burada təhlükəlidir."));
        phrases.add(new Phrase("Stop work immediately.", "Немедленно прекратите работу.", "İşi dərhal dayandırın."));
        phrases.add(new Phrase("Press the emergency stop.", "Нажмите аварийную остановку.", "Fövqəladə dayandırma düyməsini basın."));
        phrases.add(new Phrase("Do not enter this area.", "Не входите в эту зону.", "Bu əraziyə daxil olmayın."));
        phrases.add(new Phrase("The floor is wet.", "Пол мокрый.", "Döşəmə yaşdır."));
        phrases.add(new Phrase("There is oil on the floor.", "На полу масло.", "Döşəmədə yağ var."));
        phrases.add(new Phrase("Clean the workplace.", "Уберите рабочее место.", "İş yerini təmizləyin."));

        // ================= FIRE =================

        phrases.add(new Phrase("There is a fire.", "Пожар.", "Yanğın var."));
        phrases.add(new Phrase("Call the fire department.", "Вызовите пожарных.", "Yanğınsöndürənləri çağırın."));
        phrases.add(new Phrase("Use the fire extinguisher.", "Используйте огнетушитель.", "Yanğınsöndürəndən istifadə edin."));
        phrases.add(new Phrase("Evacuate the building.", "Эвакуируйтесь из здания.", "Binadan təxliyə olun."));
        phrases.add(new Phrase("Go to the muster point.", "Идите к месту сбора.", "Toplanış yerinə gedin."));
        phrases.add(new Phrase("Do not use the elevator.", "Не используйте лифт.", "Liftdən istifadə etməyin."));
        phrases.add(new Phrase("Keep the exit clear.", "Не загромождайте выход.", "Çıxışı bağlamayın."));
        phrases.add(new Phrase("The fire alarm is active.", "Пожарная сигнализация активна.", "Yanğın siqnalizasiyası aktivdir."));
        phrases.add(new Phrase("Check the fire extinguisher.", "Проверьте огнетушитель.", "Yanğınsöndürəni yoxlayın."));
        phrases.add(new Phrase("There is smoke.", "Есть дым.", "Tüstü var."));

        // ================= WELDING =================

        phrases.add(new Phrase("Check the welding machine.", "Проверьте сварочный аппарат.", "Qaynaq aparatını yoxlayın."));
        phrases.add(new Phrase("Check the welding cable.", "Проверьте сварочный кабель.", "Qaynaq kabelini yoxlayın."));
        phrases.add(new Phrase("Wear welding gloves.", "Наденьте сварочные перчатки.", "Qaynaq əlcəklərini geyinin."));
        phrases.add(new Phrase("Wear a welding helmet.", "Наденьте сварочную маску.", "Qaynaq maskasını taxın."));
        phrases.add(new Phrase("Check the electrode.", "Проверьте электрод.", "Elektrodu yoxlayın."));
        phrases.add(new Phrase("The weld is good.", "Сварной шов хороший.", "Qaynaq tikişi yaxşıdır."));
        phrases.add(new Phrase("The weld has a defect.", "Сварной шов имеет дефект.", "Qaynaq tikişində qüsur var."));
        phrases.add(new Phrase("Stop welding.", "Прекратите сварку.", "Qaynağı dayandırın."));

        // ================= GALVANIC =================

        phrases.add(new Phrase("Check the bath temperature.", "Проверьте температуру ванны.", "Vannanın temperaturunu yoxlayın."));
        phrases.add(new Phrase("Check the pH value.", "Проверьте значение pH.", "pH dəyərini yoxlayın."));
        phrases.add(new Phrase("Check the electrolyte level.", "Проверьте уровень электролита.", "Elektrolit səviyyəsini yoxlayın."));
        phrases.add(new Phrase("Check the plating thickness.", "Проверьте толщину покрытия.", "Kaplama qalınlığını yoxlayın."));
        phrases.add(new Phrase("The coating is uneven.", "Покрытие неравномерное.", "Örtük qeyri-bərabərdir."));
        phrases.add(new Phrase("The coating is damaged.", "Покрытие повреждено.", "Örtük zədələnib."));
        phrases.add(new Phrase("The coating is peeling.", "Покрытие отслаивается.", "Örtük soyulur."));
        phrases.add(new Phrase("Check the chemical solution.", "Проверьте химический раствор.", "Kimyəvi məhlulu yoxlayın."));

        // ================= MAINTENANCE =================

        phrases.add(new Phrase("The machine needs maintenance.", "Станку требуется обслуживание.", "Dəzgaha texniki xidmət lazımdır."));
        phrases.add(new Phrase("Check the oil level.", "Проверьте уровень масла.", "Yağ səviyyəsini yoxlayın."));
        phrases.add(new Phrase("Add oil.", "Добавьте масло.", "Yağ əlavə edin."));
        phrases.add(new Phrase("Replace the filter.", "Замените фильтр.", "Filtri dəyişin."));
        phrases.add(new Phrase("The bearing is damaged.", "Подшипник повреждён.", "Yastıqça zədələnib."));
        phrases.add(new Phrase("The motor is noisy.", "Двигатель шумит.", "Mühərrik səs-küylüdür."));
        phrases.add(new Phrase("The cable is damaged.", "Кабель повреждён.", "Kabel zədələnib."));
        phrases.add(new Phrase("The sensor is not working.", "Датчик не работает.", "Sensor işləmir."));

        // ================= EMERGENCY =================

        phrases.add(new Phrase("Stop!", "Стоп!", "Dayan!"));
        phrases.add(new Phrase("Emergency!", "Аварийная ситуация!", "Fövqəladə vəziyyət!"));
        phrases.add(new Phrase("Call for help!", "Позовите на помощь!", "Kömək çağırın!"));
        phrases.add(new Phrase("Someone is injured.", "Кто-то получил травму.", "Kimsə xəsarət alıb."));
        phrases.add(new Phrase("Do not move.", "Не двигайтесь.", "Hərəkət etməyin."));
        phrases.add(new Phrase("Stay here.", "Оставайтесь здесь.", "Burada qalın."));
        phrases.add(new Phrase("Move to a safe area.", "Перейдите в безопасную зону.", "Təhlükəsiz əraziyə keçin."));
        phrases.add(new Phrase("Turn off the power.", "Отключите питание.", "Elektrik enerjisini söndürün."));

        return phrases;
    }
}