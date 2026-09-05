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
        phrases.add(new Phrase(
                "Good morning.",
                "Доброе утро.",
                "Sabahınız xeyir."
        ));

        phrases.add(new Phrase(
                "Let's start work.",
                "Давайте начнём работу.",
                "Gəlin işə başlayaq."
        ));

        phrases.add(new Phrase(
                "I am ready to work.",
                "Я готов работать.",
                "Mən işləməyə hazıram."
        ));

        phrases.add(new Phrase(
                "What is my task?",
                "Какое у меня задание?",
                "Mənim tapşırığım nədir?"
        ));

        phrases.add(new Phrase(
                "What should I do?",
                "Что я должен делать?",
                "Mən nə etməliyəm?"
        ));

        phrases.add(new Phrase(
                "Please show me.",
                "Пожалуйста, покажите мне.",
                "Zəhmət olmasa, mənə göstərin."
        ));

        phrases.add(new Phrase(
                "I understand.",
                "Я понимаю.",
                "Mən başa düşürəm."
        ));

        phrases.add(new Phrase(
                "I don't understand.",
                "Я не понимаю.",
                "Mən başa düşmürəm."
        ));

        phrases.add(new Phrase(
                "Please repeat.",
                "Пожалуйста, повторите.",
                "Zəhmət olmasa, təkrar edin."
        ));

        phrases.add(new Phrase(
                "Speak slowly, please.",
                "Говорите медленнее, пожалуйста.",
                "Zəhmət olmasa, yavaş danışın."
        ));

        // ================= SAFETY =================
        phrases.add(new Phrase(
                "Safety comes first.",
                "Безопасность прежде всего.",
                "Təhlükəsizlik hər şeydən vacibdir."
        ));

        phrases.add(new Phrase(
                "Wear your PPE.",
                "Наденьте средства индивидуальной защиты.",
                "Fərdi mühafizə vasitələrinizi geyinin."
        ));

        phrases.add(new Phrase(
                "Wear your safety glasses.",
                "Наденьте защитные очки.",
                "Qoruyucu eynəyinizi taxın."
        ));

        phrases.add(new Phrase(
                "Wear your safety shoes.",
                "Наденьте защитную обувь.",
                "Qoruyucu ayaqqabınızı geyinin."
        ));

        phrases.add(new Phrase(
                "Stop the machine.",
                "Остановите станок.",
                "Dəzgahı dayandırın."
        ));

        phrases.add(new Phrase(
                "Press the emergency stop.",
                "Нажмите аварийную остановку.",
                "Fövqəladə dayandırma düyməsini basın."
        ));

        phrases.add(new Phrase(
                "There is a danger here.",
                "Здесь есть опасность.",
                "Burada təhlükə var."
        ));

        phrases.add(new Phrase(
                "Be careful.",
                "Будьте осторожны.",
                "Ehtiyatlı olun."
        ));

        phrases.add(new Phrase(
                "Keep away from the machine.",
                "Держитесь подальше от станка.",
                "Dəzgahdan uzaq durun."
        ));

        phrases.add(new Phrase(
                "Do not touch the machine.",
                "Не трогайте станок.",
                "Dəzgaha toxunmayın."
        ));

        // ================= MACHINE =================
        phrases.add(new Phrase(
                "The machine is ready.",
                "Станок готов.",
                "Dəzgah hazırdır."
        ));

        phrases.add(new Phrase(
                "The machine is not working.",
                "Станок не работает.",
                "Dəzgah işləmir."
        ));

        phrases.add(new Phrase(
                "The machine has stopped.",
                "Станок остановился.",
                "Dəzgah dayanıb."
        ));

        phrases.add(new Phrase(
                "There is an alarm.",
                "Есть аварийный сигнал.",
                "Siqnal var."
        ));

        phrases.add(new Phrase(
                "Check the alarm.",
                "Проверьте аварийный сигнал.",
                "Siqnalı yoxlayın."
        ));

        phrases.add(new Phrase(
                "Check the machine.",
                "Проверьте станок.",
                "Dəzgahı yoxlayın."
        ));

        phrases.add(new Phrase(
                "Check the tool.",
                "Проверьте инструмент.",
                "Aləti yoxlayın."
        ));

        phrases.add(new Phrase(
                "Change the tool.",
                "Замените инструмент.",
                "Aləti dəyişin."
        ));

        phrases.add(new Phrase(
                "The tool is worn.",
                "Инструмент изношен.",
                "Alət köhnəlib."
        ));

        phrases.add(new Phrase(
                "The machine is overheating.",
                "Станок перегревается.",
                "Dəzgah həddindən artıq qızır."
        ));

        // ================= CNC =================
        phrases.add(new Phrase(
                "Check the CNC program.",
                "Проверьте программу ЧПУ.",
                "CNC proqramını yoxlayın."
        ));

        phrases.add(new Phrase(
                "The program is running.",
                "Программа выполняется.",
                "Proqram işləyir."
        ));

        phrases.add(new Phrase(
                "The program has stopped.",
                "Программа остановилась.",
                "Proqram dayanıb."
        ));

        phrases.add(new Phrase(
                "Check the program number.",
                "Проверьте номер программы.",
                "Proqram nömrəsini yoxlayın."
        ));

        phrases.add(new Phrase(
                "Check the coordinates.",
                "Проверьте координаты.",
                "Koordinatları yoxlayın."
        ));

        phrases.add(new Phrase(
                "Set the zero point.",
                "Установите нулевую точку.",
                "Sıfır nöqtəsini təyin edin."
        ));

        phrases.add(new Phrase(
                "Return to the home position.",
                "Вернитесь в исходную позицию.",
                "Başlanğıc mövqeyinə qayıdın."
        ));

        phrases.add(new Phrase(
                "Check the tool length.",
                "Проверьте длину инструмента.",
                "Alətin uzunluğunu yoxlayın."
        ));

        phrases.add(new Phrase(
                "Check the tool diameter.",
                "Проверьте диаметр инструмента.",
                "Alətin diametrini yoxlayın."
        ));

        phrases.add(new Phrase(
                "The spindle speed is too high.",
                "Скорость шпинделя слишком высокая.",
                "Şpindel sürəti çox yüksəkdir."
        ));

        // ================= STAMPING =================
        phrases.add(new Phrase(
                "The stamping machine is ready.",
                "Штамповочная машина готова.",
                "Ştamplama maşını hazırdır."
        ));

        phrases.add(new Phrase(
                "Check the stamping die.",
                "Проверьте штамповочную матрицу.",
                "Ştamplama matrisini yoxlayın."
        ));

        phrases.add(new Phrase(
                "Check the punch.",
                "Проверьте пуансон.",
                "Puansonu yoxlayın."
        ));

        phrases.add(new Phrase(
                "The press force is too high.",
                "Усилие пресса слишком высокое.",
                "Pres qüvvəsi çox yüksəkdir."
        ));

        phrases.add(new Phrase(
                "Check the sheet thickness.",
                "Проверьте толщину листа.",
                "Sac qalınlığını yoxlayın."
        ));

        phrases.add(new Phrase(
                "The part has a defect.",
                "Деталь имеет дефект.",
                "Detalda qüsur var."
        ));

        phrases.add(new Phrase(
                "The part is rejected.",
                "Деталь забракована.",
                "Detal rədd edilib."
        ));

        phrases.add(new Phrase(
                "Remove the burr.",
                "Удалите заусенец.",
                "Qratı təmizləyin."
        ));

        // ================= QUALITY =================
        phrases.add(new Phrase(
                "Check the quality.",
                "Проверьте качество.",
                "Keyfiyyəti yoxlayın."
        ));

        phrases.add(new Phrase(
                "Measure the part.",
                "Измерьте деталь.",
                "Detalın ölçüsünü yoxlayın."
        ));

        phrases.add(new Phrase(
                "Check the diameter.",
                "Проверьте диаметр.",
                "Diametri yoxlayın."
        ));

        phrases.add(new Phrase(
                "Check the thickness.",
                "Проверьте толщину.",
                "Qalınlığı yoxlayın."
        ));

        phrases.add(new Phrase(
                "The measurement is correct.",
                "Измерение правильное.",
                "Ölçü düzgündür."
        ));

        phrases.add(new Phrase(
                "The measurement is not correct.",
                "Измерение неправильное.",
                "Ölçü düzgün deyil."
        ));

        phrases.add(new Phrase(
                "The part meets the standard.",
                "Деталь соответствует стандарту.",
                "Detal standarta uyğundur."
        ));

        // ================= MAINTENANCE =================
        phrases.add(new Phrase(
                "The machine needs maintenance.",
                "Станку требуется техническое обслуживание.",
                "Dəzgaha texniki xidmət lazımdır."
        ));

        phrases.add(new Phrase(
                "Check the oil level.",
                "Проверьте уровень масла.",
                "Yağ səviyyəsini yoxlayın."
        ));

        phrases.add(new Phrase(
                "Add oil.",
                "Добавьте масло.",
                "Yağ əlavə edin."
        ));

        phrases.add(new Phrase(
                "Replace the filter.",
                "Замените фильтр.",
                "Filtri dəyişin."
        ));

        phrases.add(new Phrase(
                "The bearing is damaged.",
                "Подшипник повреждён.",
                "Yastıqça zədələnib."
        ));

        phrases.add(new Phrase(
                "The motor is noisy.",
                "Двигатель шумит.",
                "Mühərrik səs-küylüdür."
        ));

        // ================= FIRE SAFETY =================
        phrases.add(new Phrase(
                "There is a fire.",
                "Пожар.",
                "Yanğın var."
        ));

        phrases.add(new Phrase(
                "Call the fire department.",
                "Вызовите пожарных.",
                "Yanğınsöndürənləri çağırın."
        ));

        phrases.add(new Phrase(
                "Use the fire extinguisher.",
                "Используйте огнетушитель.",
                "Yanğınsöndürəndən istifadə edin."
        ));

        phrases.add(new Phrase(
                "Evacuate the building.",
                "Эвакуируйтесь из здания.",
                "Binadan təxliyə olun."
        ));

        phrases.add(new Phrase(
                "Go to the muster point.",
                "Идите к месту сбора.",
                "Toplanış yerinə gedin."
        ));

        phrases.add(new Phrase(
                "Do not use the elevator.",
                "Не используйте лифт.",
                "Liftdən istifadə etməyin."
        ));

        // ================= GALVANIC =================
        phrases.add(new Phrase(
                "Check the bath temperature.",
                "Проверьте температуру ванны.",
                "Vannanın temperaturunu yoxlayın."
        ));

        phrases.add(new Phrase(
                "Check the pH value.",
                "Проверьте значение pH.",
                "pH dəyərini yoxlayın."
        ));

        phrases.add(new Phrase(
                "Check the electrolyte level.",
                "Проверьте уровень электролита.",
                "Elektrolit səviyyəsini yoxlayın."
        ));

        phrases.add(new Phrase(
                "The coating is uneven.",
                "Покрытие неравномерное.",
                "Örtük qeyri-bərabərdir."
        ));

        phrases.add(new Phrase(
                "The coating is damaged.",
                "Покрытие повреждено.",
                "Örtük zədələnib."
        ));

        // ================= COMMUNICATION =================
        phrases.add(new Phrase(
                "Can you help me?",
                "Можете мне помочь?",
                "Mənə kömək edə bilərsiniz?"
        ));

        phrases.add(new Phrase(
                "I need help.",
                "Мне нужна помощь.",
                "Mənə kömək lazımdır."
        ));

        phrases.add(new Phrase(
                "Please wait.",
                "Пожалуйста, подождите.",
                "Zəhmət olmasa, gözləyin."
        ));

        phrases.add(new Phrase(
                "Wait a moment.",
                "Подождите минуту.",
                "Bir dəqiqə gözləyin."
        ));

        phrases.add(new Phrase(
                "I have finished the job.",
                "Я закончил работу.",
                "İşi bitirmişəm."
        ));

        phrases.add(new Phrase(
                "The job is finished.",
                "Работа закончена.",
                "İş bitib."
        ));

        phrases.add(new Phrase(
                "Everything is ready.",
                "Всё готово.",
                "Hər şey hazırdır."
        ));

        phrases.add(new Phrase(
                "Thank you.",
                "Спасибо.",
                "Təşəkkür edirəm."
        ));

        // ================= END =================
        return phrases;
    }
}