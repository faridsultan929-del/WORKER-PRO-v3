package com.workerpro.v3;

import java.util.ArrayList;
import java.util.List;

public class EnglishDictionary {

    public static class Word {
        public String english;
        public String russian;
        public String azerbaijani;

        public Word(String english, String russian, String azerbaijani) {
            this.english = english;
            this.russian = russian;
            this.azerbaijani = azerbaijani;
        }
    }

    public static List<Word> getWords() {

        List<Word> words = new ArrayList<>();

        // A
        words.add(new Word("Adjust", "Регулировать", "Tənzimləmək"));
        words.add(new Word("Adjustment", "Регулировка", "Tənzimləmə"));
        words.add(new Word("Alarm", "Сигнал тревоги", "Siqnal"));
        words.add(new Word("Aluminum", "Алюминий", "Alüminium"));
        words.add(new Word("Assembly", "Сборка", "Yığma"));
        words.add(new Word("Automation", "Автоматизация", "Avtomatlaşdırma"));
        words.add(new Word("Automatic", "Автоматический", "Avtomatik"));
        words.add(new Word("Axis", "Ось", "Ox"));

        // B
        words.add(new Word("Bearing", "Подшипник", "Yastıqça"));
        words.add(new Word("Belt", "Ремень", "Kəmər"));
        words.add(new Word("Bench Grinder", "Настольный шлифовальный станок", "Masaüstü daşlama dəzgahı"));
        words.add(new Word("Blade", "Лезвие", "Bıçaq"));
        words.add(new Word("Bolt", "Болт", "Bolt"));
        words.add(new Word("Brake", "Тормоз", "Əyləc"));
        words.add(new Word("Brush", "Щётка", "Fırça"));
        words.add(new Word("Button", "Кнопка", "Düymə"));

        // C
        words.add(new Word("Cable", "Кабель", "Kabel"));
        words.add(new Word("Caliper", "Штангенциркуль", "Ştangenpərgar"));
        words.add(new Word("Capacity", "Производительность / вместимость", "Tutum"));
        words.add(new Word("Chisel", "Зубило", "Kəski"));
        words.add(new Word("Chuck", "Патрон", "Patron"));
        words.add(new Word("Circular Saw", "Циркулярная пила", "Diskli mişar"));
        words.add(new Word("Clamp", "Зажим", "Sıxac"));
        words.add(new Word("Cleaning", "Очистка", "Təmizləmə"));
        words.add(new Word("CNC Machine", "Станок с ЧПУ", "CNC dəzgahı"));
        words.add(new Word("Combination Wrench", "Комбинированный ключ", "Kombinə edilmiş açar"));
        words.add(new Word("Control", "Контроль", "Nəzarət"));
        words.add(new Word("Coolant", "Охлаждающая жидкость", "Soyuducu maye"));
        words.add(new Word("Copper", "Медь", "Mis"));
        words.add(new Word("Countersink", "Зенкер", "Zenker"));
        words.add(new Word("Crimping Tool", "Обжимной инструмент", "Sıxma aləti"));
        words.add(new Word("Cutting", "Резка", "Kəsmə"));
        words.add(new Word("Cutting Tool", "Режущий инструмент", "Kəsici alət"));
        words.add(new Word("Cycle", "Цикл", "Sikl"));

        // D
        words.add(new Word("Data", "Данные", "Məlumat"));
        words.add(new Word("Deburring Tool", "Инструмент для снятия заусенцев", "Qabarıqları təmizləmə aləti"));
        words.add(new Word("Defect", "Дефект", "Qüsur"));
        words.add(new Word("Diameter", "Диаметр", "Diametr"));
        words.add(new Word("Die", "Штамп", "Ştamp"));
        words.add(new Word("Die Holder", "Держатель плашки", "Plaşka tutacağı"));
        words.add(new Word("Diamond Tool", "Алмазный инструмент", "Almaz aləti"));
        words.add(new Word("Drill", "Сверло / дрель", "Burğu"));
        words.add(new Word("Drill Bit", "Сверло", "Burğu ucluğu"));
        words.add(new Word("Drill Chuck", "Патрон дрели", "Burğu patronu"));
        words.add(new Word("Drive", "Привод", "Ötürücü"));
        words.add(new Word("Drawing", "Чертёж", "Çertyoj"));

        // E
        words.add(new Word("Electricity", "Электричество", "Elektrik"));
        words.add(new Word("Emergency", "Аварийная ситуация", "Fövqəladə vəziyyət"));
        words.add(new Word("Emergency Stop", "Аварийная остановка", "Təcili dayandırma"));
        words.add(new Word("End Mill", "Концевая фреза", "Son freza"));
        words.add(new Word("Energy", "Энергия", "Enerji"));
        words.add(new Word("Equipment", "Оборудование", "Avadanlıq"));
        words.add(new Word("Error", "Ошибка", "Xəta"));

        // F
        words.add(new Word("Face Mill", "Торцевая фреза", "Alın frezası"));
        words.add(new Word("Factory", "Завод", "Zavod"));
        words.add(new Word("Feed", "Подача", "Verilmə"));
        words.add(new Word("File", "Напильник", "Yeyə"));
        words.add(new Word("Filter", "Фильтр", "Filtr"));
        words.add(new Word("Fixture", "Приспособление", "Qurğu"));
        words.add(new Word("Flat File", "Плоский напильник", "Yastı yeyə"));
        words.add(new Word("Force", "Сила", "Qüvvə"));
        words.add(new Word("Frame", "Рама / каркас", "Çərçivə"));
        words.add(new Word("Frequency", "Частота", "Tezlik"));
        words.add(new Word("Furnace", "Печь", "Soba"));

        // G
        words.add(new Word("Gas", "Газ", "Qaz"));
        words.add(new Word("Gauge", "Измерительный прибор", "Ölçü cihazı"));
        words.add(new Word("Gear", "Шестерня", "Dişli çarx"));
        words.add(new Word("Gearbox", "Редуктор", "Reduktor"));
        words.add(new Word("Gloves", "Перчатки", "Əlcəklər"));
        words.add(new Word("Grinding", "Шлифование", "Cilalama"));
        words.add(new Word("Grinding Tool", "Шлифовальный инструмент", "Cilalama aləti"));
        words.add(new Word("Grinding Wheel", "Шлифовальный круг", "Cilalama diski"));
        words.add(new Word("Guide", "Направляющая", "İstiqamətləndirici"));

        // H
        words.add(new Word("Hacksaw", "Ножовка по металлу", "Metal mişarı"));
        words.add(new Word("Hammer", "Молоток", "Çəkic"));
        words.add(new Word("Hand Drill", "Ручная дрель", "Əl burğusu"));
        words.add(new Word("Hand Tool", "Ручной инструмент", "Əl aləti"));
        words.add(new Word("Handle", "Ручка", "Dəstək"));
        words.add(new Word("Hazard", "Опасность", "Təhlükə"));
        words.add(new Word("Height", "Высота", "Hündürlük"));
        words.add(new Word("Helmet", "Каска", "Dəbilqə"));
        words.add(new Word("Hex Key", "Шестигранный ключ", "Altıüzlü açar"));
        words.add(new Word("Hose", "Шланг", "Şlanq"));
        words.add(new Word("Hydraulic", "Гидравлический", "Hidravlik"));

        // I
        words.add(new Word("Impact Wrench", "Ударный гайковёрт", "Zərbəli qayka açarı"));
        words.add(new Word("Inspection", "Проверка", "Yoxlama"));
        words.add(new Word("Instruction", "Инструкция", "Təlimat"));
        words.add(new Word("Insulation", "Изоляция", "İzolyasiya"));
        words.add(new Word("Iron", "Железо", "Dəmir"));

        // J
        words.add(new Word("Jig", "Кондуктор / приспособление", "Konduktor / qurğu"));
        words.add(new Word("Job", "Работа", "İş"));
        words.add(new Word("Joint", "Соединение", "Birləşmə"));

        // L
        words.add(new Word("Lathe Tool", "Токарный резец", "Torna kəsicisi"));
        words.add(new Word("Length", "Длина", "Uzunluq"));
        words.add(new Word("Level", "Уровень", "Səviyyə"));
        words.add(new Word("Limit", "Предел / ограничение", "Hədd"));
        words.add(new Word("Line", "Линия", "Xətt"));
        words.add(new Word("Locking Pliers", "Зажимные клещи", "Sıxıcı kəlbətin"));
        words.add(new Word("Lubricant", "Смазка", "Sürtkü"));
        words.add(new Word("Lubrication", "Смазывание", "Yağlama"));

        // M
        words.add(new Word("Machine", "Станок / машина", "Dəzgah / maşın"));
        words.add(new Word("Machine Vice", "Станочные тиски", "Dəzgah məngənəsi"));
        words.add(new Word("Maintenance", "Техническое обслуживание", "Texniki xidmət"));
        words.add(new Word("Manual", "Ручной / руководство", "Əl ilə / təlimat"));
        words.add(new Word("Material", "Материал", "Material"));
        words.add(new Word("Measure", "Измерять", "Ölçmək"));
        words.add(new Word("Measurement", "Измерение", "Ölçmə"));
        words.add(new Word("Measuring Tape", "Рулетка", "Ölçü lenti"));
        words.add(new Word("Measuring Tool", "Измерительный инструмент", "Ölçü aləti"));
        words.add(new Word("Metal", "Металл", "Metal"));
        words.add(new Word("Micrometer", "Микрометр", "Mikrometr"));
        words.add(new Word("Mill", "Фрезерный станок", "Frezer dəzgahı"));
        words.add(new Word("Milling Cutter", "Фреза", "Frezer kəsicisi"));
        words.add(new Word("Morse Taper", "Конус Морзе", "Mors konus"));
        words.add(new Word("Motor", "Двигатель", "Mühərrik"));

        // N
        words.add(new Word("Nozzle", "Сопло", "Ucluq"));
        words.add(new Word("Nut", "Гайка", "Qayka"));

        // O
        words.add(new Word("Oil", "Масло", "Yağ"));
        words.add(new Word("Open-End Wrench", "Рожковый ключ", "Ağız açarı"));
        words.add(new Word("Operation", "Операция", "Əməliyyat"));
        words.add(new Word("Operator", "Оператор", "Operator"));
        words.add(new Word("Output", "Выпуск продукции", "İstehsal"));
        words.add(new Word("Overheat", "Перегреваться", "Həddindən artıq qızmaq"));

        // P
        words.add(new Word("Part", "Деталь", "Detal"));
        words.add(new Word("Phillips Screwdriver", "Крестообразная отвёртка", "Xaçvari vintaçan"));
        words.add(new Word("Pipe Wrench", "Трубный ключ", "Boru açarı"));
        words.add(new Word("Pliers", "Плоскогубцы / клещи", "Kəlbətin"));
        words.add(new Word("PPE", "Средства индивидуальной защиты", "Fərdi mühafizə vasitələri"));
        words.add(new Word("Press", "Пресс", "Pres"));
        words.add(new Word("Pressure", "Давление", "Təzyiq"));
        words.add(new Word("Production", "Производство", "İstehsalat"));
        words.add(new Word("Product", "Изделие / продукт", "Məhsul"));
        words.add(new Word("Process", "Процесс", "Proses"));
        words.add(new Word("Pump", "Насос", "Nasos"));
        words.add(new Word("Punch", "Пробойник / кернер", "Zımbalama aləti"));

        // Q
        words.add(new Word("Quality", "Качество", "Keyfiyyət"));
        words.add(new Word("Quality Control", "Контроль качества", "Keyfiyyətə nəzarət"));

        // R
        words.add(new Word("Raw Material", "Сырьё", "Xammal"));
        words.add(new Word("Reamer", "Развёртка", "Rayber"));
        words.add(new Word("Repair", "Ремонт", "Təmir"));
        words.add(new Word("Replace", "Заменять", "Əvəz etmək"));
        words.add(new Word("Report", "Отчёт", "Hesabat"));
        words.add(new Word("Risk", "Риск", "Risk"));
        words.add(new Word("Robot", "Робот", "Robot"));
        words.add(new Word("Ruler", "Линейка", "Xətkeş"));

        // S
        words.add(new Word("Safety", "Безопасность", "Təhlükəsizlik"));
        words.add(new Word("Sanding Disc", "Шлифовальный диск", "Cilalama diski"));
        words.add(new Word("Saw", "Пила", "Mişar"));
        words.add(new Word("Screw", "Винт", "Vint"));
        words.add(new Word("Screw Extractor", "Экстрактор винтов", "Vint çıxarıcı"));
        words.add(new Word("Screwdriver", "Отвёртка", "Vintaçan"));
        words.add(new Word("Sensor", "Датчик", "Sensor"));
        words.add(new Word("Setting", "Настройка", "Parametr / sazlama"));
        words.add(new Word("Sheet", "Лист металла", "Metal təbəqə"));
        words.add(new Word("Shift", "Смена", "Növbə"));
        words.add(new Word("Socket", "Торцевая головка", "Başlıq"));
        words.add(new Word("Socket Wrench", "Торцевой ключ", "Başlıq açarı"));
        words.add(new Word("Spanner", "Гаечный ключ", "Açar"));
        words.add(new Word("Spirit Level", "Строительный уровень", "Tikinti səviyyəsi"));
        words.add(new Word("Speed", "Скорость", "Sürət"));
        words.add(new Word("Spring Clamp", "Пружинный зажим", "Yaylı sıxac"));
        words.add(new Word("Standard", "Стандарт", "Standart"));
        words.add(new Word("Steel", "Сталь", "Polad"));
        words.add(new Word("Switch", "Выключатель / переключатель", "Açar"));
        words.add(new Word("System", "Система", "Sistem"));

        // T
        words.add(new Word("Tap", "Метчик", "Metçik"));
        words.add(new Word("Tap Wrench", "Вороток для метчика", "Metçik tutacağı"));
        words.add(new Word("Task", "Задача", "Tapşırıq"));
        words.add(new Word("Technician", "Техник", "Texnik"));
        words.add(new Word("Temperature", "Температура", "Temperatur"));
        words.add(new Word("Thickness", "Толщина", "Qalınlıq"));
        words.add(new Word("Thread", "Резьба", "Yiv"));
        words.add(new Word("Thread Gauge", "Резьбомер", "Yiv ölçən"));
        words.add(new Word("Tool", "Инструмент", "Alət"));
        words.add(new Word("Tool Cabinet", "Инструментальный шкаф", "Alət şkafı"));
        words.add(new Word("Tool Holder", "Держатель инструмента", "Alət tutacağı"));
        words.add(new Word("Toolbox", "Ящик для инструментов", "Alət qutusu"));
        words.add(new Word("Tool Steel", "Инструментальная сталь", "Alət poladı"));
        words.add(new Word("Torque Wrench", "Динамометрический ключ", "Dinamometrik açar"));
        words.add(new Word("Training", "Обучение", "Təlim"));

        // U
        words.add(new Word("Unit", "Единица измерения", "Ölçü vahidi"));
        words.add(new Word("Urgent", "Срочный", "Təcili"));

        // V
        words.add(new Word("Valve", "Клапан", "Klapan"));
        words.add(new Word("Vernier Caliper", "Штангенциркуль", "Ştangenpərgar"));
        words.add(new Word("Vice", "Тиски", "Məngənə"));
        words.add(new Word("Voltage", "Напряжение", "Gərginlik"));

        // W
        words.add(new Word("Washer", "Шайба", "Şayba"));
        words.add(new Word("Water", "Вода", "Su"));
        words.add(new Word("Welding", "Сварка", "Qaynaq"));
        words.add(new Word("Welding Clamp", "Сварочный зажим", "Qaynaq sıxacı"));
        words.add(new Word("Welder", "Сварщик", "Qaynaqçı"));
        words.add(new Word("Width", "Ширина", "En"));
        words.add(new Word("Wire", "Провод / проволока", "Tel"));
        words.add(new Word("Wire Brush", "Проволочная щётка", "Tel fırça"));
        words.add(new Word("Worker", "Рабочий", "İşçi"));
        words.add(new Word("Workholding Fixture", "Приспособление для закрепления", "Bərkitmə qurğusu"));
        words.add(new Word("Workpiece", "Заготовка / рабочая деталь", "Pəstah"));
        words.add(new Word("Workplace", "Рабочее место", "İş yeri"));
        words.add(new Word("Workshop", "Цех", "Sex"));
        words.add(new Word("Wrench", "Гаечный ключ", "Açar"));

        // X
        words.add(new Word("X-Axis", "Ось X", "X oxu"));

        // Y
        words.add(new Word("Y-Axis", "Ось Y", "Y oxu"));

        // Z
        words.add(new Word("Z-Axis", "Ось Z", "Z oxu"));

        return words;
    }
}