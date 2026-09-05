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

    public static List<Phrase> getPhrases() {

        List<Phrase> phrases = new ArrayList<>();

        // ================= WORK =================

        add(phrases,
                "I am ready to start work.",
                "Я готов начать работу.",
                "İşə başlamağa hazıram.",
                "WORK");

        add(phrases,
                "I am starting my work.",
                "Я начинаю работу.",
                "İşə başlayıram.",
                "WORK");

        add(phrases,
                "What is my task today?",
                "Какое у меня сегодня задание?",
                "Bu gün mənim tapşırığım nədir?",
                "WORK");

        add(phrases,
                "What should I do?",
                "Что мне делать?",
                "Nə etməliyəm?",
                "WORK");

        add(phrases,
                "I have finished my task.",
                "Я закончил своё задание.",
                "Tapşırığımı bitirmişəm.",
                "WORK");

        add(phrases,
                "I need more time.",
                "Мне нужно больше времени.",
                "Mənə daha çox vaxt lazımdır.",
                "WORK");

        add(phrases,
                "The work is finished.",
                "Работа закончена.",
                "İş bitib.",
                "WORK");

        add(phrases,
                "Please check my work.",
                "Пожалуйста, проверьте мою работу.",
                "Zəhmət olmasa işimi yoxlayın.",
                "WORK");

        add(phrases,
                "I understand.",
                "Я понимаю.",
                "Başa düşürəm.",
                "WORK");

        add(phrases,
                "I don't understand.",
                "Я не понимаю.",
                "Başa düşmürəm.",
                "WORK");

        add(phrases,
                "Please explain again.",
                "Пожалуйста, объясните ещё раз.",
                "Zəhmət olmasa bir daha izah edin.",
                "WORK");

        add(phrases,
                "Can you show me?",
                "Можете мне показать?",
                "Mənə göstərə bilərsiniz?",
                "WORK");

        add(phrases,
                "I need help.",
                "Мне нужна помощь.",
                "Mənə kömək lazımdır.",
                "WORK");

        add(phrases,
                "I can do it.",
                "Я могу это сделать.",
                "Mən bunu edə bilərəm.",
                "WORK");

        add(phrases,
                "I cannot do it alone.",
                "Я не могу сделать это один.",
                "Mən bunu tək edə bilmirəm.",
                "WORK");

        // ================= BOSS =================

        add(phrases,
                "Good morning, boss.",
                "Доброе утро, начальник.",
                "Sabahınız xeyir, rəhbər.",
                "BOSS");

        add(phrases,
                "What should I do next?",
                "Что мне делать дальше?",
                "Sonra nə etməliyəm?",
                "BOSS");

        add(phrases,
                "Is this correct?",
                "Это правильно?",
                "Bu düzgündür?",
                "BOSS");

        add(phrases,
                "Please check this part.",
                "Пожалуйста, проверьте эту деталь.",
                "Zəhmət olmasa bu detalı yoxlayın.",
                "BOSS");

        add(phrases,
                "The machine has a problem.",
                "У станка проблема.",
                "Dəzgahda problem var.",
                "BOSS");

        add(phrases,
                "The machine stopped.",
                "Станок остановился.",
                "Dəzgah dayandı.",
                "BOSS");

        add(phrases,
                "We need maintenance.",
                "Нам нужно техническое обслуживание.",
                "Bizə texniki xidmət lazımdır.",
                "BOSS");

        add(phrases,
                "The tool is worn.",
                "Инструмент изношен.",
                "Alət aşınıb.",
                "BOSS");

        add(phrases,
                "The part is defective.",
                "Деталь бракованная.",
                "Detal qüsurludur.",
                "BOSS");

        add(phrases,
                "The measurement is not correct.",
                "Измерение неправильное.",
                "Ölçmə düzgün deyil.",
                "BOSS");

        add(phrases,
                "I found a defect.",
                "Я нашёл дефект.",
                "Qüsur tapdım.",
                "BOSS");

        add(phrases,
                "We need to stop the machine.",
                "Нужно остановить станок.",
                "Dəzgahı dayandırmaq lazımdır.",
                "BOSS");

        // ================= MACHINE =================

        add(phrases,
                "Start the machine.",
                "Запусти станок.",
                "Dəzgahı işə sal.",
                "MACHINE");

        add(phrases,
                "Stop the machine.",
                "Останови станок.",
                "Dəzgahı dayandır.",
                "MACHINE");

        add(phrases,
                "The machine is running.",
                "Станок работает.",
                "Dəzgah işləyir.",
                "MACHINE");

        add(phrases,
                "The machine is not working.",
                "Станок не работает.",
                "Dəzgah işləmir.",
                "MACHINE");

        add(phrases,
                "Check the machine.",
                "Проверь станок.",
                "Dəzgahı yoxla.",
                "MACHINE");

        add(phrases,
                "Check the sensor.",
                "Проверь датчик.",
                "Sensoru yoxla.",
                "MACHINE");

        add(phrases,
                "The sensor is not working.",
                "Датчик не работает.",
                "Sensor işləmir.",
                "MACHINE");

        add(phrases,
                "There is an error.",
                "Есть ошибка.",
                "Səhv var.",
                "MACHINE");

        add(phrases,
                "Check the error code.",
                "Проверь код ошибки.",
                "Səhv kodunu yoxla.",
                "MACHINE");

        add(phrases,
                "The motor is hot.",
                "Двигатель горячий.",
                "Mühərrik istidir.",
                "MACHINE");

        add(phrases,
                "The machine is making noise.",
                "Станок издаёт шум.",
                "Dəzgah səs-küy yaradır.",
                "MACHINE");

        add(phrases,
                "There is vibration.",
                "Есть вибрация.",
                "Vibrasiya var.",
                "MACHINE");

        // ================= CNC =================

        add(phrases,
                "Check the CNC program.",
                "Проверь программу CNC.",
                "CNC proqramını yoxla.",
                "CNC");

        add(phrases,
                "Start the CNC program.",
                "Запусти программу CNC.",
                "CNC proqramını işə sal.",
                "CNC");

        add(phrases,
                "Stop the CNC program.",
                "Останови программу CNC.",
                "CNC proqramını dayandır.",
                "CNC");

        add(phrases,
                "Check the coordinates.",
                "Проверь координаты.",
                "Koordinatları yoxla.",
                "CNC");

        add(phrases,
                "Check the zero point.",
                "Проверь нулевую точку.",
                "Sıfır nöqtəsini yoxla.",
                "CNC");

        add(phrases,
                "Check the tool number.",
                "Проверь номер инструмента.",
                "Alət nömrəsini yoxla.",
                "CNC");

        add(phrases,
                "Change the tool.",
                "Замени инструмент.",
                "Aləti dəyiş.",
                "CNC");

        add(phrases,
                "The tool is broken.",
                "Инструмент сломан.",
                "Alət sınıb.",
                "CNC");

        add(phrases,
                "Check the feed rate.",
                "Проверь скорость подачи.",
                "Veriş sürətini yoxla.",
                "CNC");

        add(phrases,
                "The cycle is finished.",
                "Цикл закончен.",
                "Tsikl bitib.",
                "CNC");

        // ================= STAMPING =================

        add(phrases,
                "The stamping machine is ready.",
                "Штамповочная машина готова.",
                "Ştamplama maşını hazırdır.",
                "STAMPING");

        add(phrases,
                "Check the die.",
                "Проверь матрицу.",
                "Matrisi yoxla.",
                "STAMPING");

        add(phrases,
                "Check the punch.",
                "Проверь пуансон.",
                "Puansonu yoxla.",
                "STAMPING");

        add(phrases,
                "The die is damaged.",
                "Матрица повреждена.",
                "Matris zədələnib.",
                "STAMPING");

        add(phrases,
                "The punch is worn.",
                "Пуансон изношен.",
                "Puanson aşınıb.",
                "STAMPING");

        add(phrases,
                "Check the blank thickness.",
                "Проверь толщину заготовки.",
                "Pəstah qalınlığını yoxla.",
                "STAMPING");

        add(phrases,
                "The stamping force is too high.",
                "Усилие штамповки слишком высокое.",
                "Ştamplama qüvvəsi çox yüksəkdir.",
                "STAMPING");

        add(phrases,
                "The part has a defect.",
                "На детали есть дефект.",
                "Detalda qüsur var.",
                "STAMPING");

        add(phrases,
                "Stop the press.",
                "Останови пресс.",
                "Presi dayandır.",
                "STAMPING");

        add(phrases,
                "Check the finished part.",
                "Проверь готовую деталь.",
                "Hazır detalı yoxla.",
                "STAMPING");

        // ================= QUALITY =================

        add(phrases,
                "Check the quality.",
                "Проверь качество.",
                "Keyfiyyəti yoxla.",
                "QUALITY");

        add(phrases,
                "The quality is good.",
                "Качество хорошее.",
                "Keyfiyyət yaxşıdır.",
                "QUALITY");

        add(phrases,
                "The quality is not good.",
                "Качество плохое.",
                "Keyfiyyət yaxşı deyil.",
                "QUALITY");

        add(phrases,
                "I found a crack.",
                "Я нашёл трещину.",
                "Çat tapdım.",
                "QUALITY");

        add(phrases,
                "There is a burr.",
                "Есть заусенец.",
                "Qrat var.",
                "QUALITY");

        add(phrases,
                "The dimension is correct.",
                "Размер правильный.",
                "Ölçü düzgündür.",
                "QUALITY");

        add(phrases,
                "The dimension is not correct.",
                "Размер неправильный.",
                "Ölçü düzgün deyil.",
                "QUALITY");

        add(phrases,
                "Check the tolerance.",
                "Проверь допуск.",
                "Toleransı yoxla.",
                "QUALITY");

        add(phrases,
                "This part is rejected.",
                "Эта деталь забракована.",
                "Bu detal rədd edilib.",
                "QUALITY");

        add(phrases,
                "The inspection is complete.",
                "Проверка завершена.",
                "Yoxlama tamamlandı.",
                "QUALITY");

        // ================= SAFETY =================

        add(phrases,
                "Safety first.",
                "Безопасность прежде всего.",
                "Təhlükəsizlik hər şeydən əvvəl.",
                "SAFETY");

        add(phrases,
                "Wear your safety glasses.",
                "Надень защитные очки.",
                "Qoruyucu eynəyini tax.",
                "SAFETY");

        add(phrases,
                "Wear your gloves.",
                "Надень перчатки.",
                "Əlcəklərini tax.",
                "SAFETY");

        add(phrases,
                "Wear your safety shoes.",
                "Надень защитную обувь.",
                "Qoruyucu ayaqqabını geyin.",
                "SAFETY");

        add(phrases,
                "Wear your helmet.",
                "Надень каску.",
                "Dəbilqəni tax.",
                "SAFETY");

        add(phrases,
                "Be careful.",
                "Будь осторожен.",
                "Ehtiyatlı ol.",
                "SAFETY");

        add(phrases,
                "This is dangerous.",
                "Это опасно.",
                "Bu təhlükəlidir.",
                "SAFETY");

        add(phrases,
                "Do not touch the machine.",
                "Не трогай станок.",
                "Dəzgaha toxunma.",
                "SAFETY");

        add(phrases,
                "Stop work immediately.",
                "Немедленно прекрати работу.",
                "Dərhal işi dayandır.",
                "SAFETY");

        add(phrases,
                "Follow the safety rules.",
                "Соблюдай правила безопасности.",
                "Təhlükəsizlik qaydalarına əməl et.",
                "SAFETY");

        // ================= FIRE =================

        add(phrases,
                "There is a fire.",
                "Пожар.",
                "Yanğın var.",
                "FIRE");

        add(phrases,
                "Call the fire department.",
                "Вызовите пожарную службу.",
                "Yanğınsöndürmə xidmətinə zəng edin.",
                "FIRE");

        add(phrases,
                "Use the fire extinguisher.",
                "Используй огнетушитель.",
                "Yanğınsöndürəndən istifadə et.",
                "FIRE");

        add(phrases,
                "Where is the fire extinguisher?",
                "Где огнетушитель?",
                "Yanğınsöndürən haradadır?",
                "FIRE");

        add(phrases,
                "Where is the emergency exit?",
                "Где аварийный выход?",
                "Fövqəladə çıxış haradadır?",
                "FIRE");

        add(phrases,
                "Go to the muster point.",
                "Идите к месту сбора.",
                "Toplanış yerinə gedin.",
                "FIRE");

        add(phrases,
                "Do not use water on an electrical fire.",
                "Не используй воду при электрическом пожаре.",
                "Elektrik yanğınında sudan istifadə etmə.",
                "FIRE");

        add(phrases,
                "There is smoke.",
                "Есть дым.",
                "Tüstü var.",
                "FIRE");

        // ================= WELDING =================

        add(phrases,
                "The welding machine is ready.",
                "Сварочный аппарат готов.",
                "Qaynaq aparatı hazırdır.",
                "WELDING");

        add(phrases,
                "Check the welding cable.",
                "Проверь сварочный кабель.",
                "Qaynaq kabelini yoxla.",
                "WELDING");

        add(phrases,
                "Check the electrode.",
                "Проверь электрод.",
                "Elektrodu yoxla.",
                "WELDING");

        add(phrases,
                "The weld is good.",
                "Сварка хорошая.",
                "Qaynaq yaxşıdır.",
                "WELDING");

        add(phrases,
                "The weld has a defect.",
                "В сварке есть дефект.",
                "Qaynaqda qüsur var.",
                "WELDING");

        add(phrases,
                "Wear a welding mask.",
                "Надень сварочную маску.",
                "Qaynaq maskasını tax.",
                "WELDING");

        // ================= GALVANIC =================

        add(phrases,
                "Check the bath temperature.",
                "Проверь температуру ванны.",
                "Vannanın temperaturunu yoxla.",
                "GALVANIC");

        add(phrases,
                "Check the bath level.",
                "Проверь уровень ванны.",
                "Vannanın səviyyəsini yoxla.",
                "GALVANIC");

        add(phrases,
                "Check the pH value.",
                "Проверь значение pH.",
                "pH dəyərini yoxla.",
                "GALVANIC");

        add(phrases,
                "The coating is too thin.",
                "Покрытие слишком тонкое.",
                "Örtük çox nazikdir.",
                "GALVANIC");

        add(phrases,
                "The coating is damaged.",
                "Покрытие повреждено.",
                "Örtük zədələnib.",
                "GALVANIC");

        add(phrases,
                "There is a chemical spill.",
                "Произошёл разлив химического вещества.",
                "Kimyəvi maddə dağılıb.",
                "GALVANIC");

        add(phrases,
                "Use the eye wash station.",
                "Используй станцию промывания глаз.",
                "Göz yuma stansiyasından istifadə et.",
                "GALVANIC");

        // ================= MAINTENANCE =================

        add(phrases,
                "The machine needs maintenance.",
                "Станку нужно обслуживание.",
                "Dəzgaha texniki xidmət lazımdır.",
                "MAINTENANCE");

        add(phrases,
                "The machine needs repair.",
                "Станку нужен ремонт.",
                "Dəzgaha təmir lazımdır.",
                "MAINTENANCE");

        add(phrases,
                "Check the oil level.",
                "Проверь уровень масла.",
                "Yağ səviyyəsini yoxla.",
                "MAINTENANCE");

        add(phrases,
                "Add lubricant.",
                "Добавь смазку.",
                "Sürtkü əlavə et.",
                "MAINTENANCE");

        add(phrases,
                "Replace the filter.",
                "Замени фильтр.",
                "Filtri dəyiş.",
                "MAINTENANCE");

        add(phrases,
                "The bearing is worn.",
                "Подшипник изношен.",
                "Yastıqça aşınıb.",
                "MAINTENANCE");

        add(phrases,
                "The belt is damaged.",
                "Ремень повреждён.",
                "Kəmər zədələnib.",
                "MAINTENANCE");

        // ================= EMERGENCY =================

        add(phrases,
                "Emergency!",
                "Авария!",
                "Fövqəladə vəziyyət!",
                "EMERGENCY");

        add(phrases,
                "Stop the machine immediately!",
                "Немедленно останови станок!",
                "Dəzgahı dərhal dayandır!",
                "EMERGENCY");

        add(phrases,
                "Press the emergency stop button.",
                "Нажми кнопку аварийной остановки.",
                "Fövqəladə dayandırma düyməsini bas.",
                "EMERGENCY");

        add(phrases,
                "Call for help!",
                "Позовите на помощь!",
                "Kömək çağırın!",
                "EMERGENCY");

        add(phrases,
                "Someone is injured.",
                "Кто-то получил травму.",
                "Kimsə xəsarət alıb.",
                "EMERGENCY");

        add(phrases,
                "Do not move the injured person.",
                "Не перемещайте пострадавшего.",
                "Xəsarət alan şəxsi hərəkət etdirməyin.",
                "EMERGENCY");

        add(phrases,
                "Leave the area.",
                "Покиньте эту зону.",
                "Bu ərazini tərk edin.",
                "EMERGENCY");

        add(phrases,
                "Follow the emergency route.",
                "Следуйте по аварийному маршруту.",
                "Fövqəladə marşrutla gedin.",
                "EMERGENCY");

        return phrases;
    }
}