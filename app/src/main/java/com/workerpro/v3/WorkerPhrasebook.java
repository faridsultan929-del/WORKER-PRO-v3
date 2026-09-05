package com.workerpro.v3;

import java.util.ArrayList;
import java.util.List;

public class WorkerPhrasebook {

    public static class Phrase {
        public String english;
        public String russian;
        public String azerbaijani;
        public String category;

        public Phrase(
                String english,
                String russian,
                String azerbaijani,
                String category) {

            this.english = english;
            this.russian = russian;
            this.azerbaijani = azerbaijani;
            this.category = category;
        }
    }

    public static List<Phrase> getPhrases() {

        List<Phrase> phrases = new ArrayList<>();

        // ================= BASIC WORK =================

        add(phrases, "Good morning.", "Доброе утро.", "Sabahınız xeyir.", "WORK");
        add(phrases, "Good afternoon.", "Добрый день.", "Günortanız xeyir.", "WORK");
        add(phrases, "How are you?", "Как вы?", "Necəsiniz?", "WORK");
        add(phrases, "I am ready.", "Я готов.", "Mən hazıram.", "WORK");
        add(phrases, "Let's start work.", "Давайте начнём работу.", "Gəlin işə başlayaq.", "WORK");
        add(phrases, "What is my task?", "Какое у меня задание?", "Mənim tapşırığım nədir?", "WORK");
        add(phrases, "What should I do?", "Что мне делать?", "Mən nə etməliyəm?", "WORK");
        add(phrases, "Please show me.", "Пожалуйста, покажите мне.", "Zəhmət olmasa, mənə göstərin.", "WORK");
        add(phrases, "I understand.", "Я понимаю.", "Mən başa düşürəm.", "WORK");
        add(phrases, "I don't understand.", "Я не понимаю.", "Mən başa düşmürəm.", "WORK");
        add(phrases, "Please repeat.", "Пожалуйста, повторите.", "Zəhmət olmasa, təkrar edin.", "WORK");
        add(phrases, "Speak slowly, please.", "Говорите медленнее, пожалуйста.", "Zəhmət olmasa, yavaş danışın.", "WORK");
        add(phrases, "Can you help me?", "Можете мне помочь?", "Mənə kömək edə bilərsiniz?", "WORK");
        add(phrases, "I need help.", "Мне нужна помощь.", "Mənə kömək lazımdır.", "WORK");
        add(phrases, "Wait a moment.", "Подождите минуту.", "Bir dəqiqə gözləyin.", "WORK");
        add(phrases, "Everything is ready.", "Всё готово.", "Hər şey hazırdır.", "WORK");
        add(phrases, "The job is finished.", "Работа закончена.", "İş bitib.", "WORK");
        add(phrases, "I have finished the job.", "Я закончил работу.", "Mən işi bitirmişəm.", "WORK");
        add(phrases, "Thank you.", "Спасибо.", "Təşəkkür edirəm.", "WORK");
        add(phrases, "You're welcome.", "Пожалуйста.", "Buyurun.", "WORK");

        // ================= BOSS AND WORKER =================

        add(phrases, "What do you want me to do?", "Что вы хотите, чтобы я сделал?", "Mənim nə etməyimi istəyirsiniz?", "BOSS");
        add(phrases, "I will do it.", "Я это сделаю.", "Mən bunu edəcəyəm.", "BOSS");
        add(phrases, "I will check it.", "Я это проверю.", "Mən bunu yoxlayacağam.", "BOSS");
        add(phrases, "I will fix it.", "Я это исправлю.", "Mən bunu düzəldəcəyəm.", "BOSS");
        add(phrases, "The work is almost finished.", "Работа почти закончена.", "İş demək olar ki, bitib.", "BOSS");
        add(phrases, "I need more time.", "Мне нужно больше времени.", "Mənə daha çox vaxt lazımdır.", "BOSS");
        add(phrases, "There is a problem.", "Есть проблема.", "Problem var.", "BOSS");
        add(phrases, "I found the problem.", "Я нашёл проблему.", "Mən problemi tapdım.", "BOSS");
        add(phrases, "The problem is fixed.", "Проблема исправлена.", "Problem düzəldilib.", "BOSS");
        add(phrases, "Please check my work.", "Пожалуйста, проверьте мою работу.", "Zəhmət olmasa, işimi yoxlayın.", "BOSS");

        // ================= MACHINE =================

        add(phrases, "The machine is ready.", "Станок готов.", "Dəzgah hazırdır.", "MACHINE");
        add(phrases, "The machine is running.", "Станок работает.", "Dəzgah işləyir.", "MACHINE");
        add(phrases, "The machine has stopped.", "Станок остановился.", "Dəzgah dayanıb.", "MACHINE");
        add(phrases, "The machine is not working.", "Станок не работает.", "Dəzgah işləmir.", "MACHINE");
        add(phrases, "Start the machine.", "Запустите станок.", "Dəzgahı işə salın.", "MACHINE");
        add(phrases, "Stop the machine.", "Остановите станок.", "Dəzgahı dayandırın.", "MACHINE");
        add(phrases, "Reset the machine.", "Сбросьте станок.", "Dəzgahı sıfırlayın.", "MACHINE");
        add(phrases, "Check the machine.", "Проверьте станок.", "Dəzgahı yoxlayın.", "MACHINE");
        add(phrases, "Check the control panel.", "Проверьте панель управления.", "İdarəetmə panelini yoxlayın.", "MACHINE");
        add(phrases, "There is an alarm.", "Есть аварийный сигнал.", "Siqnal var.", "MACHINE");
        add(phrases, "Check the alarm.", "Проверьте сигнал.", "Siqnalı yoxlayın.", "MACHINE");
        add(phrases, "Check the error code.", "Проверьте код ошибки.", "Səhv kodunu yoxlayın.", "MACHINE");
        add(phrases, "The machine is overheating.", "Станок перегревается.", "Dəzgah həddindən artıq qızır.", "MACHINE");
        add(phrases, "The machine is making noise.", "Станок издаёт шум.", "Dəzgah səs-küy yaradır.", "MACHINE");
        add(phrases, "There is vibration.", "Есть вибрация.", "Vibrasiya var.", "MACHINE");

        // ================= CNC =================

        add(phrases, "Check the CNC program.", "Проверьте программу ЧПУ.", "CNC proqramını yoxlayın.", "CNC");
        add(phrases, "The program is running.", "Программа выполняется.", "Proqram işləyir.", "CNC");
        add(phrases, "The program has stopped.", "Программа остановилась.", "Proqram dayanıb.", "CNC");
        add(phrases, "Check the program number.", "Проверьте номер программы.", "Proqram nömrəsini yoxlayın.", "CNC");
        add(phrases, "Check the coordinates.", "Проверьте координаты.", "Koordinatları yoxlayın.", "CNC");
        add(phrases, "Set the zero point.", "Установите нулевую точку.", "Sıfır nöqtəsini təyin edin.", "CNC");
        add(phrases, "Return to the home position.", "Вернитесь в исходную позицию.", "Başlanğıc mövqeyinə qayıdın.", "CNC");
        add(phrases, "Check the tool length.", "Проверьте длину инструмента.", "Alətin uzunluğunu yoxlayın.", "CNC");
        add(phrases, "Check the tool diameter.", "Проверьте диаметр инструмента.", "Alətin diametrini yoxlayın.", "CNC");
        add(phrases, "Change the tool.", "Замените инструмент.", "Aləti dəyişin.", "CNC");
        add(phrases, "The tool is worn.", "Инструмент изношен.", "Alət köhnəlib.", "CNC");
        add(phrases, "The spindle speed is too high.", "Скорость шпинделя слишком высокая.", "Şpindel sürəti çox yüksəkdir.", "CNC");
        add(phrases, "Reduce the feed rate.", "Уменьшите скорость подачи.", "Veriş sürətini azaldın.", "CNC");
        add(phrases, "Press feed hold.", "Нажмите остановку подачи.", "Verişin saxlanması düyməsini basın.", "CNC");
        add(phrases, "Run the program in dry run.", "Запустите программу в холостом режиме.", "Proqramı boş gediş rejimində işə salın.", "CNC");

        // ================= STAMPING =================

        add(phrases, "The stamping machine is ready.", "Штамповочная машина готова.", "Ştamplama maşını hazırdır.", "STAMPING");
        add(phrases, "Check the stamping die.", "Проверьте штамповочную матрицу.", "Ştamplama matrisini yoxlayın.", "STAMPING");
        add(phrases, "Check the punch.", "Проверьте пуансон.", "Puansonu yoxlayın.", "STAMPING");
        add(phrases, "Check the upper die.", "Проверьте верхнюю матрицу.", "Üst matrisi yoxlayın.", "STAMPING");
        add(phrases, "Check the lower die.", "Проверьте нижнюю матрицу.", "Alt matrisi yoxlayın.", "STAMPING");
        add(phrases, "Check the press force.", "Проверьте усилие пресса.", "Pres qüvvəsini yoxlayın.", "STAMPING");
        add(phrases, "The press force is too high.", "Усилие пресса слишком высокое.", "Pres qüvvəsi çox yüksəkdir.", "STAMPING");
        add(phrases, "Check the sheet thickness.", "Проверьте толщину листа.", "Sac qalınlığını yoxlayın.", "STAMPING");
        add(phrases, "Check the feed length.", "Проверьте длину подачи.", "Veriş uzunluğunu yoxlayın.", "STAMPING");
        add(phrases, "Check the feed pitch.", "Проверьте шаг подачи.", "Veriş addımını yoxlayın.", "STAMPING");
        add(phrases, "The part has a defect.", "Деталь имеет дефект.", "Detalda qüsur var.", "STAMPING");
        add(phrases, "The part is rejected.", "Деталь забракована.", "Detal rədd edilib.", "STAMPING");
        add(phrases, "Remove the burr.", "Удалите заусенец.", "Qratı təmizləyin.", "STAMPING");
        add(phrases, "Check the stamping cycle.", "Проверьте цикл штамповки.", "Ştamplama tsiklini yoxlayın.", "STAMPING");
        add(phrases, "Stop the press.", "Остановите пресс.", "Presi dayandırın.", "STAMPING");

        // ================= QUALITY =================

        add(phrases, "Check the quality.", "Проверьте качество.", "Keyfiyyəti yoxlayın.", "QUALITY");
        add(phrases, "Measure the part.", "Измерьте деталь.", "Detalın ölçüsünü yoxlayın.", "QUALITY");
        add(phrases, "Check the diameter.", "Проверьте диаметр.", "Diametri yoxlayın.", "QUALITY");
        add(phrases, "Check the thickness.", "Проверьте толщину.", "Qalınlığı yoxlayın.", "QUALITY");
        add(phrases, "Check the length.", "Проверьте длину.", "Uzunluğu yoxlayın.", "QUALITY");
        add(phrases, "Check the width.", "Проверьте ширину.", "Eni yoxlayın.", "QUALITY");
        add(phrases, "The measurement is correct.", "Измерение правильное.", "Ölçü düzgündür.", "QUALITY");
        add(phrases, "The measurement is not correct.", "Измерение неправильное.", "Ölçü düzgün deyil.", "QUALITY");
        add(phrases, "The part meets the standard.", "Деталь соответствует стандарту.", "Detal standarta uyğundur.", "QUALITY");
        add(phrases, "The part does not meet the standard.", "Деталь не соответствует стандарту.", "Detal standarta uyğun deyil.", "QUALITY");
        add(phrases, "This part is good.", "Эта деталь хорошая.", "Bu detal yaxşıdır.", "QUALITY");
        add(phrases, "This part is defective.", "Эта деталь бракованная.", "Bu detal qüsurludur.", "QUALITY");

        // ================= SAFETY =================

        add(phrases, "Safety comes first.", "Безопасность прежде всего.", "Təhlükəsizlik hər şeydən vacibdir.", "SAFETY");
        add(phrases, "Be careful.", "Будьте осторожны.", "Ehtiyatlı olun.", "SAFETY");
        add(phrases, "Wear your PPE.", "Наденьте СИЗ.", "Fərdi mühafizə vasitələrinizi geyinin.", "SAFETY");
        add(phrases, "Wear your safety glasses.", "Наденьте защитные очки.", "Qoruyucu eynəyinizi taxın.", "SAFETY");
        add(phrases, "Wear your safety shoes.", "Наденьте защитную обувь.", "Qoruyucu ayaqqabınızı geyinin.", "SAFETY");
        add(phrases, "Wear your helmet.", "Наденьте каску.", "Dəbilqənizi taxın.", "SAFETY");
        add(phrases, "Do not touch the machine.", "Не трогайте станок.", "Dəzgaha toxunmayın.", "SAFETY");
        add(phrases, "Keep away from the machine.", "Держитесь подальше от станка.", "Dəzgahdan uzaq durun.", "SAFETY");
        add(phrases, "There is a danger here.", "Здесь опасно.", "Burada təhlükəlidir.", "SAFETY");
        add(phrases, "Stop work immediately.", "Немедленно прекратите работу.", "İşi dərhal dayandırın.", "SAFETY");
        add(phrases, "Press the emergency stop.", "Нажмите аварийную остановку.", "Fövqəladə dayandırma düyməsini basın.", "SAFETY");
        add(phrases, "Do not enter this area.", "Не входите в эту зону.", "Bu əraziyə daxil olmayın.", "SAFETY");
        add(phrases, "The floor is wet.", "Пол мокрый.", "Döşəmə yaşdır.", "SAFETY");
        add(phrases, "There is oil on the floor.", "На полу масло.", "Döşəmədə yağ var.", "SAFETY");
        add(phrases, "Clean the workplace.", "Уберите рабочее место.", "İş yerini təmizləyin.", "SAFETY");

        // ================= FIRE =================

        add(phrases, "There is a fire.", "Пожар.", "Yanğın var.", "FIRE");
        add(phrases, "Call the fire department.", "Вызовите пожарных.", "Yanğınsöndürənləri çağırın.", "FIRE");
        add(phrases, "Use the fire extinguisher.", "Используйте огнетушитель.", "Yanğınsöndürəndən istifadə edin.", "FIRE");
        add(phrases, "Evacuate the building.", "Эвакуируйтесь из здания.", "Binadan təxliyə olun.", "FIRE");
        add(phrases, "Go to the muster point.", "Идите к месту сбора.", "Toplanış yerinə gedin.", "FIRE");
        add(phrases, "Do not use the elevator.", "Не используйте лифт.", "Liftdən istifadə etməyin.", "FIRE");
        add(phrases, "Keep the exit clear.", "Не загромождайте выход.", "Çıxışı bağlamayın.", "FIRE");
        add(phrases, "The fire alarm is active.", "Пожарная сигнализация активна.", "Yanğın siqnalizasiyası aktivdir.", "FIRE");
        add(phrases, "Check the fire extinguisher.", "Проверьте огнетушитель.", "Yanğınsöndürəni yoxlayın.", "FIRE");
        add(phrases, "There is smoke.", "Есть дым.", "Tüstü var.", "FIRE");

        // ================= WELDING =================

        add(phrases, "Check the welding machine.", "Проверьте сварочный аппарат.", "Qaynaq aparatını yoxlayın.", "WELDING");
        add(phrases, "Check the welding cable.", "Проверьте сварочный кабель.", "Qaynaq kabelini yoxlayın.", "WELDING");
        add(phrases, "Wear welding gloves.", "Наденьте сварочные перчатки.", "Qaynaq əlcəklərini geyinin.", "WELDING");
        add(phrases, "Wear a welding helmet.", "Наденьте сварочную маску.", "Qaynaq maskasını taxın.", "WELDING");
        add(phrases, "Check the electrode.", "Проверьте электрод.", "Elektrodu yoxlayın.", "WELDING");
        add(phrases, "The weld is good.", "Сварной шов хороший.", "Qaynaq tikişi yaxşıdır.", "WELDING");
        add(phrases, "The weld has a defect.", "Сварной шов имеет дефект.", "Qaynaq tikişində qüsur var.", "WELDING");
        add(phrases, "Stop welding.", "Прекратите сварку.", "Qaynağı dayandırın.", "WELDING");

        // ================= GALVANIC =================

        add(phrases, "Check the bath temperature.", "Проверьте температуру ванны.", "Vannanın temperaturunu yoxlayın.", "GALVANIC");
        add(phrases, "Check the pH value.", "Проверьте значение pH.", "pH dəyərini yoxlayın.", "GALVANIC");
        add(phrases, "Check the electrolyte level.", "Проверьте уровень электролита.", "Elektrolit səviyyəsini yoxlayın.", "GALVANIC");
        add(phrases, "Check the plating thickness.", "Проверьте толщину покрытия.", "Kaplama qalınlığını yoxlayın.", "GALVANIC");
        add(phrases, "The coating is uneven.", "Покрытие неравномерное.", "Örtük qeyri-bərabərdir.", "GALVANIC");
        add(phrases, "The coating is damaged.", "Покрытие повреждено.", "Örtük zədələnib.", "GALVANIC");
        add(phrases, "The coating is peeling.", "Покрытие отслаивается.", "Örtük soyulur.", "GALVANIC");
        add(phrases, "Check the chemical solution.", "Проверьте химический раствор.", "Kimyəvi məhlulu yoxlayın.", "GALVANIC");

        // ================= MAINTENANCE =================

        add(phrases, "The machine needs maintenance.", "Станку требуется обслуживание.", "Dəzgaha texniki xidmət lazımdır.", "MAINTENANCE");
        add(phrases, "Check the oil level.", "Проверьте уровень масла.", "Yağ səviyyəsini yoxlayın.", "MAINTENANCE");
        add(phrases, "Add oil.", "Добавьте масло.", "Yağ əlavə edin.", "MAINTENANCE");
        add(phrases, "Replace the filter.", "Замените фильтр.", "Filtri dəyişin.", "MAINTENANCE");
        add(phrases, "The bearing is damaged.", "Подшипник повреждён.", "Yastıqça zədələnib.", "MAINTENANCE");
        add(phrases, "The motor is noisy.", "Двигатель шумит.", "Mühərrik səs-küylüdür.", "MAINTENANCE");
        add(phrases, "The cable is damaged.", "Кабель повреждён.", "Kabel zədələnib.", "MAINTENANCE");
        add(phrases, "The sensor is not working.", "Датчик не работает.", "Sensor işləmir.", "MAINTENANCE");

        // ================= EMERGENCY =================

        add(phrases, "Stop!", "Стоп!", "Dayan!", "EMERGENCY");
        add(phrases, "Emergency!", "Аварийная ситуация!", "Fövqəladə vəziyyət!", "EMERGENCY");
        add(phrases, "Call for help!", "Позовите на помощь!", "Kömək çağırın!", "EMERGENCY");
        add(phrases, "Someone is injured.", "Кто-то получил травму.", "Kimsə xəsarət alıb.", "EMERGENCY");
        add(phrases, "Do not move.", "Не двигайтесь.", "Hərəkət etməyin.", "EMERGENCY");
        add(phrases, "Stay here.", "Оставайтесь здесь.", "Burada qalın.", "EMERGENCY");
        add(phrases, "Move to a safe area.", "Перейдите в безопасную зону.", "Təhlükəsiz əraziyə keçin.", "EMERGENCY");
        add(phrases, "Turn off the power.", "Отключите питание.", "Elektrik enerjisini söndürün.", "EMERGENCY");

        return phrases;
    }

    private static void add(
            List<Phrase> list,
            String english,
            String russian,
            String azerbaijani,
            String category) {

        list.add(
                new Phrase(
                        english,
                        russian,
                        azerbaijani,
                        category
                )
        );
    }
}