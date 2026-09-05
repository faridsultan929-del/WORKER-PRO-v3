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

        // ================= A =================
        words.add(new Word("Abrasion", "Истирание", "Aşınma"));
        words.add(new Word("Accuracy", "Точность", "Dəqiqlik"));
        words.add(new Word("Adjust", "Регулировать", "Tənzimləmək"));
        words.add(new Word("Adjustment", "Регулировка", "Tənzimləmə"));
        words.add(new Word("Alarm", "Аварийный сигнал", "Siqnal"));
        words.add(new Word("Alignment", "Выравнивание", "Mərkəzləmə"));
        words.add(new Word("Allen Key", "Шестигранный ключ", "Altıbucaqlı açar"));
        words.add(new Word("Aluminum", "Алюминий", "Alüminium"));
        words.add(new Word("Anode", "Анод", "Anod"));
        words.add(new Word("Anvil", "Наковальня", "Zindan"));
        words.add(new Word("Assembly", "Сборка", "Yığma"));
        words.add(new Word("Assembly Line", "Сборочная линия", "Yığma xətti"));
        words.add(new Word("Automation", "Автоматизация", "Avtomatlaşdırma"));
        words.add(new Word("Automatic", "Автоматический", "Avtomatik"));
        words.add(new Word("Axis", "Ось", "Ox"));

        // ================= B =================
        words.add(new Word("Backlash", "Люфт", "Boşluq"));
        words.add(new Word("Balance", "Балансировка", "Balans"));
        words.add(new Word("Bearing", "Подшипник", "Yastıqça"));
        words.add(new Word("Belt", "Ремень", "Kəmər"));
        words.add(new Word("Bench Grinder", "Настольный шлифовальный станок", "Stolüstü daşlama dəzgahı"));
        words.add(new Word("Bending", "Гибка", "Əymə"));
        words.add(new Word("Blade", "Лезвие", "Bıçaq"));
        words.add(new Word("Bolt", "Болт", "Bolt"));
        words.add(new Word("Bore", "Расточное отверстие", "Böyük dəlik"));
        words.add(new Word("Boring", "Растачивание", "Böyütmə"));
        words.add(new Word("Brake", "Тормоз", "Əyləc"));
        words.add(new Word("Brush", "Щётка", "Fırça"));
        words.add(new Word("Bushing", "Втулка", "Vtulka"));
        words.add(new Word("Button", "Кнопка", "Düymə"));
        words.add(new Word("Burr", "Заусенец", "Qabarıq kənar"));

        // ================= C =================
        words.add(new Word("Cable", "Кабель", "Kabel"));
        words.add(new Word("Caliper", "Штангенциркуль", "Ştangensirkul"));
        words.add(new Word("Capacity", "Мощность / вместимость", "Tutum"));
        words.add(new Word("Chamfer", "Фаска", "Faska"));
        words.add(new Word("Chain", "Цепь", "Zəncir"));
        words.add(new Word("Chisel", "Зубило", "Mişaraltı"));
        words.add(new Word("Chuck", "Патрон", "Patron"));
        words.add(new Word("Circular Saw", "Циркулярная пила", "Diskli mişar"));
        words.add(new Word("Clamp", "Зажим", "Sıxac"));
        words.add(new Word("Cleaning", "Очистка", "Təmizləmə"));
        words.add(new Word("CNC Control", "Система управления ЧПУ", "CNC idarəetməsi"));
        words.add(new Word("CNC Machine", "Станок с ЧПУ", "CNC dəzgahı"));
        words.add(new Word("CNC Program", "Программа ЧПУ", "CNC proqramı"));
        words.add(new Word("CNC Programmer", "Программист ЧПУ", "CNC proqramçısı"));
        words.add(new Word("Collet", "Цанга", "Sıxac patronu"));
        words.add(new Word("Combination Wrench", "Комбинированный ключ", "Kombinə edilmiş açar"));
        words.add(new Word("Control", "Управление", "İdarəetmə"));
        words.add(new Word("Control Panel", "Панель управления", "İdarəetmə paneli"));
        words.add(new Word("Coolant", "Охлаждающая жидкость", "Soyuducu maye"));
        words.add(new Word("Copper", "Медь", "Mis"));
        words.add(new Word("Countersink", "Зенковка", "Zenker"));
        words.add(new Word("Crimping Tool", "Обжимной инструмент", "Sıxma aləti"));
        words.add(new Word("Cutter", "Резак / фреза", "Kəsici"));
        words.add(new Word("Cutting", "Резка", "Kəsmə"));
        words.add(new Word("Cutting Insert", "Режущая пластина", "Kəsici lövhə"));
        words.add(new Word("Cutting Speed", "Скорость резания", "Kəsmə sürəti"));
        words.add(new Word("Cutting Tool", "Режущий инструмент", "Kəsici alət"));
        words.add(new Word("Cycle", "Цикл", "Dövr"));

        // ================= CNC =================
        words.add(new Word("Coordinate", "Координата", "Koordinat"));
        words.add(new Word("Coordinate System", "Система координат", "Koordinat sistemi"));
        words.add(new Word("Machine Coordinate", "Координаты станка", "Dəzgah koordinatı"));
        words.add(new Word("Work Coordinate", "Рабочие координаты", "İş koordinatı"));
        words.add(new Word("Machine Zero", "Ноль станка", "Dəzgah sıfırı"));
        words.add(new Word("Work Zero", "Рабочий ноль", "İş sıfırı"));
        words.add(new Word("Program Number", "Номер программы", "Proqram nömrəsi"));
        words.add(new Word("Program Block", "Блок программы", "Proqram bloku"));
        words.add(new Word("Program Stop", "Остановка программы", "Proqramın dayanması"));
        words.add(new Word("Program Start", "Запуск программы", "Proqramın işə salınması"));
        words.add(new Word("Machine Cycle", "Цикл станка", "Dəzgah dövrü"));
        words.add(new Word("Cycle Time", "Время цикла", "Dövr vaxtı"));
        words.add(new Word("Tool Length", "Длина инструмента", "Alətin uzunluğu"));
        words.add(new Word("Tool Diameter", "Диаметр инструмента", "Alətin diametri"));
        words.add(new Word("Tool Change Position", "Позиция смены инструмента", "Alət dəyişmə mövqeyi"));
        words.add(new Word("Tool Number", "Номер инструмента", "Alət nömrəsi"));
        words.add(new Word("Tool Magazine", "Магазин инструментов", "Alət magazini"));
        words.add(new Word("Tool Pocket", "Ячейка инструмента", "Alət yuvası"));
        words.add(new Word("Tool Measurement", "Измерение инструмента", "Alətin ölçülməsi"));
        words.add(new Word("Tool Compensation", "Компенсация инструмента", "Alət kompensasiyası"));
        words.add(new Word("Tool Wear Compensation", "Компенсация износа инструмента", "Alət aşınması kompensasiyası"));
        words.add(new Word("Spindle Speed", "Скорость шпинделя", "Şpindel sürəti"));
        words.add(new Word("Spindle Motor", "Двигатель шпинделя", "Şpindel mühərriki"));
        words.add(new Word("Spindle Load", "Нагрузка шпинделя", "Şpindel yükü"));
        words.add(new Word("Spindle Direction", "Направление вращения шпинделя", "Şpindelin fırlanma istiqaməti"));
        words.add(new Word("Rapid Movement", "Быстрое перемещение", "Sürətli hərəkət"));
        words.add(new Word("Rapid Feed", "Быстрая подача", "Sürətli veriş"));
        words.add(new Word("Feed Override", "Коррекция подачи", "Veriş korreksiyası"));
        words.add(new Word("Spindle Override", "Коррекция шпинделя", "Şpindel korreksiyası"));
        words.add(new Word("Machine Alarm", "Аварийный сигнал станка", "Dəzgah siqnalı"));
        words.add(new Word("Alarm Code", "Код аварии", "Siqnal kodu"));
        words.add(new Word("Error Code", "Код ошибки", "Xəta kodu"));
        words.add(new Word("Parameter", "Параметр", "Parametr"));
        words.add(new Word("Machine Parameter", "Параметр станка", "Dəzgah parametri"));
        words.add(new Word("Control Unit", "Блок управления", "İdarəetmə bloku"));
        words.add(new Word("Control Screen", "Экран управления", "İdarəetmə ekranı"));
        words.add(new Word("Control Button", "Кнопка управления", "İdarəetmə düyməsi"));
        words.add(new Word("Memory Mode", "Режим памяти", "Yaddaş rejimi"));
        words.add(new Word("Manual Mode", "Ручной режим", "Əl rejimi"));
        words.add(new Word("Automatic Mode", "Автоматический режим", "Avtomatik rejim"));
        words.add(new Word("Jog Mode", "Режим ручного перемещения", "Əl ilə hərəkət rejimi"));
        words.add(new Word("Single Block", "Покадровый режим", "Tək blok rejimi"));
        words.add(new Word("Dry Run", "Сухой прогон", "Quru sınaq"));
        words.add(new Word("Simulation", "Симуляция", "Simulyasiya"));
        words.add(new Word("Feed Hold", "Остановка подачи", "Verişin dayandırılması"));
        words.add(new Word("Reset", "Сброс", "Sıfırlama"));
        words.add(new Word("Machine Reset", "Сброс станка", "Dəzgahın sıfırlanması"));
        words.add(new Word("Reference Return", "Возврат в исходную точку", "İstinad nöqtəsinə qayıdış"));
        words.add(new Word("Home Position", "Исходная позиция", "Başlanğıc mövqeyi"));
        words.add(new Word("Work Offset", "Рабочая коррекция", "İş korreksiyası"));
        words.add(new Word("Zero Offset", "Коррекция нуля", "Sıfır korreksiyası"));
        words.add(new Word("Machine Setup", "Настройка станка", "Dəzgahın sazlanması"));
        words.add(new Word("Setup Sheet", "Лист настройки", "Sazlama vərəqi"));
        words.add(new Word("Setup Time", "Время настройки", "Sazlama vaxtı"));
        words.add(new Word("Machining", "Механическая обработка", "Mexaniki emal"));
        words.add(new Word("Machining Center", "Обрабатывающий центр", "Emal mərkəzi"));
        words.add(new Word("Vertical Machining Center", "Вертикальный обрабатывающий центр", "Şaquli emal mərkəzi"));
        words.add(new Word("Horizontal Machining Center", "Горизонтальный обрабатывающий центр", "Üfüqi emal mərkəzi"));
        words.add(new Word("Turning Center", "Токарный обрабатывающий центр", "Torna emal mərkəzi"));
        words.add(new Word("Machine Tool", "Металлорежущий станок", "Metal emal dəzgahı"));
        words.add(new Word("Machining Time", "Время обработки", "Emal vaxtı"));
        words.add(new Word("Cutting Depth", "Глубина резания", "Kəsmə dərinliyi"));
        words.add(new Word("Cutting Width", "Ширина резания", "Kəsmə eni"));
        words.add(new Word("Cutting Force", "Сила резания", "Kəsmə qüvvəsi"));
        words.add(new Word("Cutting Fluid", "Смазочно-охлаждающая жидкость", "Kəsici soyuducu maye"));
        words.add(new Word("Chip", "Стружка", "Yonqar"));
        words.add(new Word("Chip Removal", "Удаление стружки", "Yonqarın çıxarılması"));
        words.add(new Word("Chip Conveyor", "Конвейер для стружки", "Yonqar konveyeri"));
        words.add(new Word("Chip Breaker", "Стружколом", "Yonqarqıran"));
        words.add(new Word("Coolant Pump", "Насос охлаждающей жидкости", "Soyuducu maye nasosu"));
        words.add(new Word("Coolant Tank", "Бак охлаждающей жидкости", "Soyuducu maye çəni"));
        words.add(new Word("Coolant Flow", "Поток охлаждающей жидкости", "Soyuducu maye axını"));
        words.add(new Word("Coolant Pressure", "Давление охлаждающей жидкости", "Soyuducu maye təzyiqi"));

        // ================= D =================
        words.add(new Word("Data", "Данные", "Məlumat"));
        words.add(new Word("Deburring", "Удаление заусенцев", "Qabarıqların təmizlənməsi"));
        words.add(new Word("Deburring Tool", "Инструмент для удаления заусенцев", "Qabarıq təmizləmə aləti"));
        words.add(new Word("Defect", "Дефект", "Qüsur"));
        words.add(new Word("Deflection", "Отклонение", "Yayınma"));
        words.add(new Word("Depth", "Глубина", "Dərinlik"));
        words.add(new Word("Depth Gauge", "Глубиномер", "Dərinlik ölçən"));
        words.add(new Word("Diameter", "Диаметр", "Diametr"));
        words.add(new Word("Die", "Штамп / матрица", "Ştamp"));
        words.add(new Word("Die Holder", "Держатель штампа", "Ştamp tutacağı"));
        words.add(new Word("Digital Gauge", "Цифровой измеритель", "Rəqəmsal ölçü cihazı"));
        words.add(new Word("Diamond Tool", "Алмазный инструмент", "Almaz aləti"));
        words.add(new Word("Drill", "Сверло", "Burğu"));
        words.add(new Word("Drill Bit", "Сверло", "Burğu ucu"));
        words.add(new Word("Drill Chuck", "Сверлильный патрон", "Burğu patronu"));
        words.add(new Word("Drill Press", "Сверлильный станок", "Burğu dəzgahı"));
        words.add(new Word("Drive", "Привод", "Ötürücü"));
        words.add(new Word("Drawing", "Чертёж", "Çertyoj"));
        words.add(new Word("Dust Collector", "Пылесборник", "Toz toplayıcı"));

        // ================= E =================
        words.add(new Word("Edge", "Кромка", "Kənar"));
        words.add(new Word("Electrical Panel", "Электрическая панель", "Elektrik paneli"));
        words.add(new Word("Electricity", "Электричество", "Elektrik"));
        words.add(new Word("Electrode", "Электрод", "Elektrod"));
        words.add(new Word("Electroplating", "Гальваническое покрытие", "Elektrokaplama"));
        words.add(new Word("Emergency", "Аварийная ситуация", "Fövqəladə vəziyyət"));
        words.add(new Word("Emergency Exit", "Аварийный выход", "Fövqəladə çıxış"));
        words.add(new Word("Emergency Stop", "Аварийная остановка", "Fövqəladə dayandırma"));
        words.add(new Word("End Mill", "Концевая фреза", "Son frez"));
        words.add(new Word("Energy", "Энергия", "Enerji"));
        words.add(new Word("Equipment", "Оборудование", "Avadanlıq"));
        words.add(new Word("Error", "Ошибка", "Xəta"));
        words.add(new Word("Extension Cord", "Удлинитель", "Uzatma kabeli"));

        // ================= F =================
        words.add(new Word("Face Mill", "Торцевая фреза", "Üz frezi"));
        words.add(new Word("Factory", "Завод", "Zavod"));
        words.add(new Word("Feed", "Подача", "Veriş"));
        words.add(new Word("Feed Rate", "Скорость подачи", "Veriş sürəti"));
        words.add(new Word("File", "Напильник", "Yeyə"));
        words.add(new Word("Filter", "Фильтр", "Filtr"));
        words.add(new Word("Finishing", "Чистовая обработка", "Son emal"));
        words.add(new Word("Fixture", "Приспособление", "Tərtibat"));
        words.add(new Word("Flange", "Фланец", "Flanş"));
        words.add(new Word("Force", "Сила", "Qüvvə"));
        words.add(new Word("Forklift", "Погрузчик", "Forklift"));
        words.add(new Word("Furnace", "Печь", "Soba"));

        // ================= G =================
        words.add(new Word("Galvanic Process", "Гальванический процесс", "Qalvanik proses"));
        words.add(new Word("Gas", "Газ", "Qaz"));
        words.add(new Word("Gauge", "Измерительный прибор", "Ölçü cihazı"));
        words.add(new Word("Gear", "Шестерня", "Dişli"));
        words.add(new Word("Gearbox", "Редуктор", "Reduktor"));
        words.add(new Word("Gloves", "Перчатки", "Əlcəklər"));
        words.add(new Word("Grinding", "Шлифование", "Daşlama"));
        words.add(new Word("Grinding Wheel", "Шлифовальный круг", "Daşlama dairəsi"));
        words.add(new Word("Grounding", "Заземление", "Torpaqlama"));
        words.add(new Word("Guard", "Защитное ограждение", "Qoruyucu hasar"));

        // ================= H =================
        words.add(new Word("Hacksaw", "Ножовка", "Dəmir mişarı"));
        words.add(new Word("Hammer", "Молоток", "Çəkic"));
        words.add(new Word("Hand Drill", "Ручная дрель", "Əl dreli"));
        words.add(new Word("Hand Tool", "Ручной инструмент", "Əl aləti"));
        words.add(new Word("Hardness", "Твёрдость", "Sərtlik"));
        words.add(new Word("Hazard", "Опасность", "Təhlükə"));
        words.add(new Word("Heat Treatment", "Термообработка", "İstilik emalı"));
        words.add(new Word("Heating Element", "Нагревательный элемент", "Qızdırıcı element"));
        words.add(new Word("Helmet", "Каска", "Dəbilqə"));
        words.add(new Word("Height", "Высота", "Hündürlük"));
        words.add(new Word("Hydraulic", "Гидравлический", "Hidravlik"));
        words.add(new Word("Hydraulic Cylinder", "Гидравлический цилиндр", "Hidravlik silindr"));
        words.add(new Word("Hydraulic Oil", "Гидравлическое масло", "Hidravlik yağ"));
        words.add(new Word("Hydraulic Pressure", "Гидравлическое давление", "Hidravlik təzyiq"));

        // ================= I =================
        words.add(new Word("Impact Wrench", "Ударный гайковёрт", "Zərbəli açar"));
        words.add(new Word("Indicator", "Индикатор", "İndikator"));
        words.add(new Word("Inspection", "Проверка", "Yoxlama"));
        words.add(new Word("Inspection Report", "Отчёт о проверке", "Yoxlama hesabatı"));
        words.add(new Word("Insulation", "Изоляция", "İzolyasiya"));
        words.add(new Word("Internal Thread", "Внутренняя резьба", "Daxili yiv"));
        words.add(new Word("Iron", "Железо", "Dəmir"));

        // ================= J =================
        words.add(new Word("Jig", "Кондуктор", "Konduktor"));
        words.add(new Word("Jaw", "Кулачок", "Çənə"));
        words.add(new Word("Job", "Работа / задание", "İş / tapşırıq"));
        words.add(new Word("Joint", "Соединение", "Birləşmə"));

        // ================= K =================
        words.add(new Word("Key", "Шпонка / ключ", "Şponka / açar"));
        words.add(new Word("Keyway", "Шпоночный паз", "Şponka yuvası"));
        words.add(new Word("Knife", "Нож", "Bıçaq"));
        words.add(new Word("Knurling", "Накатка", "Naxışlama"));

        // ================= L =================
        words.add(new Word("Lathe", "Токарный станок", "Torna dəzgahı"));
        words.add(new Word("Lathe Tool", "Токарный инструмент", "Torna aləti"));
        words.add(new Word("Length", "Длина", "Uzunluq"));
        words.add(new Word("Level", "Уровень", "Səviyyə"));
        words.add(new Word("Limit Switch", "Концевой выключатель", "Son açarı"));
        words.add(new Word("Lock Nut", "Контргайка", "Kontrqayka"));
        words.add(new Word("Lubricant", "Смазка", "Sürtkü"));
        words.add(new Word("Lubrication", "Смазка / смазывание", "Yağlama"));

        // ================= M =================
        words.add(new Word("Machine", "Станок / машина", "Dəzgah / maşın"));
        words.add(new Word("Machine Bed", "Станина станка", "Dəzgah gövdəsi"));
        words.add(new Word("Machine Guard", "Защитное ограждение станка", "Dəzgah qoruyucusu"));
        words.add(new Word("Machine Table", "Стол станка", "Dəzgah masası"));
        words.add(new Word("Machine Vice", "Тиски станка", "Dəzgah məngənəsi"));
        words.add(new Word("Maintenance", "Техническое обслуживание", "Texniki xidmət"));
        words.add(new Word("Manual", "Ручной / руководство", "Əl ilə / təlimat"));
        words.add(new Word("Material", "Материал", "Material"));
        words.add(new Word("Material Grade", "Марка материала", "Material markası"));
        words.add(new Word("Measure", "Измерять", "Ölçmək"));
        words.add(new Word("Measurement", "Измерение", "Ölçmə"));
        words.add(new Word("Measuring Tool", "Измерительный инструмент", "Ölçü aləti"));
        words.add(new Word("Metal", "Металл", "Metal"));
        words.add(new Word("Micrometer", "Микрометр", "Mikrometr"));
        words.add(new Word("Milling", "Фрезерование", "Frezerləmə"));
        words.add(new Word("Milling Cutter", "Фреза", "Freze"));
        words.add(new Word("Motor", "Двигатель", "Mühərrik"));

        // ================= N =================
        words.add(new Word("Needle Valve", "Игольчатый клапан", "İynə klapanı"));
        words.add(new Word("Nipple", "Ниппель", "Nippel"));
        words.add(new Word("Noise", "Шум", "Səs-küy"));
        words.add(new Word("Nozzle", "Сопло", "Ucluq"));
        words.add(new Word("Nominal Diameter", "Номинальный диаметр", "Nominal diametr"));
        words.add(new Word("Nut", "Гайка", "Qayka"));

        // ================= O =================
        words.add(new Word("Oil", "Масло", "Yağ"));
        words.add(new Word("Oil Filter", "Масляный фильтр", "Yağ filtri"));
        words.add(new Word("Operation", "Операция", "Əməliyyat"));
        words.add(new Word("Operator", "Оператор", "Operator"));
        words.add(new Word("Operator Manual", "Руководство оператора", "Operator təlimatı"));
        words.add(new Word("Output", "Выход / результат", "Çıxış"));
        words.add(new Word("Overheat", "Перегрев", "Həddindən artıq qızma"));
        words.add(new Word("Overload", "Перегрузка", "Həddindən artıq yük"));
        words.add(new Word("Outside Diameter", "Наружный диаметр", "Xarici diametr"));

        // ================= P =================
        words.add(new Word("Part", "Деталь", "Detal"));
        words.add(new Word("Part Number", "Номер детали", "Detal nömrəsi"));
        words.add(new Word("Pliers", "Плоскогубцы", "Kəlbətin"));
        words.add(new Word("Power Supply", "Источник питания", "Enerji təchizatı"));
        words.add(new Word("PPE", "Средства индивидуальной защиты", "Fərdi mühafizə vasitələri"));
        words.add(new Word("Press", "Пресс", "Pres"));
        words.add(new Word("Pressure", "Давление", "Təzyiq"));
        words.add(new Word("Pressure Gauge", "Манометр", "Manometr"));
        words.add(new Word("Production", "Производство", "İstehsalat"));
        words.add(new Word("Product", "Изделие / продукт", "Məhsul"));
        words.add(new Word("Process", "Процесс", "Proses"));
        words.add(new Word("Punch", "Пуансон", "Puanson"));
        words.add(new Word("Punch Press", "Пресс для штамповки", "Ştamplama presi"));

        // ================= Q =================
        words.add(new Word("Quality", "Качество", "Keyfiyyət"));
        words.add(new Word("Quality Control", "Контроль качества", "Keyfiyyətə nəzarət"));
        words.add(new Word("Quality Check", "Проверка качества", "Keyfiyyət yoxlaması"));
        words.add(new Word("Quality Inspector", "Инспектор по качеству", "Keyfiyyət müfəttişi"));
        words.add(new Word("Quality Standard", "Стандарт качества", "Keyfiyyət standartı"));
        words.add(new Word("Quenching", "Закалка", "Tablama"));

        // ================= R =================
        words.add(new Word("Raw Material", "Сырьё", "Xammal"));
        words.add(new Word("Reamer", "Развёртка", "Rayber"));
        words.add(new Word("Reference Point", "Исходная точка", "İstinad nöqtəsi"));
        words.add(new Word("Relay", "Реле", "Rele"));
        words.add(new Word("Repair", "Ремонт", "Təmir"));
        words.add(new Word("Replace", "Заменить", "Dəyişdirmək"));
        words.add(new Word("Replacement Part", "Запасная деталь", "Ehtiyat detal"));
        words.add(new Word("Report", "Отчёт", "Hesabat"));
        words.add(new Word("Rejected Part", "Бракованная деталь", "Rədd edilmiş detal"));
        words.add(new Word("Risk", "Риск", "Risk"));
        words.add(new Word("Robot", "Робот", "Robot"));
        words.add(new Word("Ruler", "Линейка", "Xətkeş"));
        words.add(new Word("Runout", "Биение", "Yırğalanma"));

        // ================= S =================
        words.add(new Word("Safety", "Безопасность", "Təhlükəsizlik"));
        words.add(new Word("Safety Glasses", "Защитные очки", "Qoruyucu eynək"));
        words.add(new Word("Safety Shoes", "Защитная обувь", "Qoruyucu ayaqqabı"));
        words.add(new Word("Safety Rule", "Правило безопасности", "Təhlükəsizlik qaydası"));
        words.add(new Word("Safety Training", "Обучение безопасности", "Təhlükəsizlik təlimi"));
        words.add(new Word("Sensor", "Датчик", "Sensor"));
        words.add(new Word("Setting", "Настройка", "Sazlama"));
        words.add(new Word("Sheet Metal", "Листовой металл", "Sac metal"));
        words.add(new Word("Socket Wrench", "Торцевой ключ", "Başlıq açarı"));
        words.add(new Word("Spindle", "Шпиндель", "Şpindel"));
        words.add(new Word("Speed", "Скорость", "Sürət"));
        words.add(new Word("Spanner", "Гаечный ключ", "Açar"));
        words.add(new Word("Spring", "Пружина", "Yay"));
        words.add(new Word("Steel", "Сталь", "Polad"));
        words.add(new Word("Stop Button", "Кнопка остановки", "Dayandırma düyməsi"));
        words.add(new Word("Surface Finish", "Качество поверхности", "Səthin keyfiyyəti"));
        words.add(new Word("Switch", "Выключатель", "Açar"));
        words.add(new Word("System", "Система", "Sistem"));

        // ================= STAMPING =================
        words.add(new Word("Stamping", "Штамповка", "Ştamplama"));
        words.add(new Word("Stamping Machine", "Штамповочная машина", "Ştamplama maşını"));
        words.add(new Word("Stamping Press", "Штамповочный пресс", "Ştamplama presi"));
        words.add(new Word("Stamping Die", "Штамповочный штамп", "Ştamplama ştampı"));
        words.add(new Word("Press Brake", "Листогибочный пресс", "Əymə presi"));
        words.add(new Word("Hydraulic Press", "Гидравлический пресс", "Hidravlik pres"));
        words.add(new Word("Mechanical Press", "Механический пресс", "Mexaniki pres"));
        words.add(new Word("Press Force", "Усилие пресса", "Pres qüvvəsi"));
        words.add(new Word("Press Capacity", "Мощность пресса", "Pres gücü"));
        words.add(new Word("Press Stroke", "Ход пресса", "Pres gedişi"));
        words.add(new Word("Press Speed", "Скорость пресса", "Pres sürəti"));
        words.add(new Word("Press Table", "Стол пресса", "Pres masası"));
        words.add(new Word("Press Ram", "Ползун пресса", "Pres sürgüsü"));
        words.add(new Word("Press Frame", "Рама пресса", "Pres çərçivəsi"));
        words.add(new Word("Press Bed", "Станина пресса", "Pres gövdəsi"));
        words.add(new Word("Die Set", "Штамповый комплект", "Ştamp dəsti"));
        words.add(new Word("Upper Die", "Верхний штамп", "Üst ştamp"));
        words.add(new Word("Lower Die", "Нижний штамп", "Alt ştamp"));
        words.add(new Word("Punch Holder", "Держатель пуансона", "Puanson tutacağı"));
        words.add(new Word("Guide Pin", "Направляющий штифт", "Yönləndirici sancaq"));
        words.add(new Word("Guide Bush", "Направляющая втулка", "Yönləndirici vtulka"));
        words.add(new Word("Stripper Plate", "Съёмная плита", "Soyucu lövhə"));
        words.add(new Word("Backing Plate", "Опорная плита", "Dayaq lövhəsi"));
        words.add(new Word("Pressure Plate", "Прижимная плита", "Sıxıcı lövhə"));
        words.add(new Word("Blank", "Заготовка", "Pəstah"));
        words.add(new Word("Blanking", "Вырубка", "Kəsmə əməliyyatı"));
        words.add(new Word("Blank Holder", "Прижим заготовки", "Pəstah sıxıcısı"));
        words.add(new Word("Blank Diameter", "Диаметр заготовки", "Pəstah diametri"));
        words.add(new Word("Blank Thickness", "Толщина заготовки", "Pəstah qalınlığı"));
        words.add(new Word("Bending Operation", "Операция гибки", "Əymə əməliyyatı"));
        words.add(new Word("Bending Force", "Усилие гибки", "Əymə qüvvəsi"));
        words.add(new Word("Bending Angle", "Угол гибки", "Əymə bucağı"));
        words.add(new Word("Bending Radius", "Радиус гибки", "Əymə radiusu"));
        words.add(new Word("Deep Drawing", "Глубокая вытяжка", "Dərin dartma"));
        words.add(new Word("Drawing Die", "Вытяжной штамп", "Dartma ştampı"));
        words.add(new Word("Drawing Punch", "Вытяжной пуансон", "Dartma puansonu"));
        words.add(new Word("Forming", "Формовка", "Formalaşdırma"));
        words.add(new Word("Forming Tool", "Формовочный инструмент", "Formalaşdırma aləti"));
        words.add(new Word("Piercing", "Пробивка отверстия", "Deşmə"));
        words.add(new Word("Shearing", "Резка ножницами", "Qayçı ilə kəsmə"));
        words.add(new Word("Shear Force", "Сила среза", "Kəsmə qüvvəsi"));
        words.add(new Word("Shear Blade", "Режущий нож", "Kəsici bıçaq"));
        words.add(new Word("Metal Sheet", "Металлический лист", "Metal vərəq"));
        words.add(new Word("Sheet Thickness", "Толщина листа", "Vərəq qalınlığı"));
        words.add(new Word("Sheet Width", "Ширина листа", "Vərəq eni"));
        words.add(new Word("Sheet Length", "Длина листа", "Vərəq uzunluğu"));
        words.add(new Word("Sheet Edge", "Кромка листа", "Vərəq kənarı"));
        words.add(new Word("Coil", "Рулон металла", "Metal rulonu"));
        words.add(new Word("Metal Strip", "Металлическая полоса", "Metal zolağı"));
        words.add(new Word("Strip Width", "Ширина полосы", "Zolaq eni"));
        words.add(new Word("Strip Thickness", "Толщина полосы", "Zolaq qalınlığı"));
        words.add(new Word("Strip Feeder", "Подающее устройство", "Zolaq verici"));
        words.add(new Word("Feeding System", "Система подачи", "Veriş sistemi"));
        words.add(new Word("Feed Length", "Длина подачи", "Veriş uzunluğu"));
        words.add(new Word("Feed Pitch", "Шаг подачи", "Veriş addımı"));
        words.add(new Word("Die Clearance", "Зазор штампа", "Ştamp boşluğu"));
        words.add(new Word("Punch Clearance", "Зазор пуансона", "Puanson boşluğu"));
        words.add(new Word("Die Life", "Срок службы штампа", "Ştampın xidmət müddəti"));
        words.add(new Word("Die Maintenance", "Обслуживание штампа", "Ştampın texniki xidməti"));
        words.add(new Word("Die Repair", "Ремонт штампа", "Ştampın təmiri"));
        words.add(new Word("Die Alignment", "Центровка штампа", "Ştampın mərkəzlənməsi"));
        words.add(new Word("Die Inspection", "Проверка штампа", "Ştampın yoxlanılması"));
        words.add(new Word("Stamping Cycle", "Цикл штамповки", "Ştamplama dövrü"));
        words.add(new Word("Stamping Force", "Усилие штамповки", "Ştamplama qüvvəsi"));
        words.add(new Word("Stamping Speed", "Скорость штамповки", "Ştamplama sürəti"));
        words.add(new Word("Stamping Defect", "Дефект штамповки", "Ştamplama qüsuru"));
        words.add(new Word("Crack", "Трещина", "Çat"));
        words.add(new Word("Wrinkle", "Морщина / складка", "Qırış"));
        words.add(new Word("Scratch", "Царапина", "Cızıq"));
        words.add(new Word("Dent", "Вмятина", "Əzik"));
        words.add(new Word("Deformation", "Деформация", "Deformasiya"));
        words.add(new Word("Burr Height", "Высота заусенца", "Qabarıq hündürlüyü"));
        words.add(new Word("Part Ejection", "Выталкивание детали", "Detalın çıxarılması"));
        words.add(new Word("Ejection Pin", "Выталкивающий штифт", "Çıxarıcı sancaq"));
        words.add(new Word("Ejector Plate", "Выталкивающая плита", "Çıxarıcı lövhə"));
        words.add(new Word("Scrap", "Отходы / брак", "Tullantı"));
        words.add(new Word("Scrap Rate", "Процент брака", "Tullantı faizi"));
        words.add(new Word("Finished Part", "Готовая деталь", "Hazır detal"));

        // ================= T =================
        words.add(new Word("Tap", "Метчик", "Metçik"));
        words.add(new Word("Tap Wrench", "Вороток для метчика", "Metçik tutacağı"));
        words.add(new Word("Task", "Задание", "Tapşırıq"));
        words.add(new Word("Technician", "Техник", "Texnik"));
        words.add(new Word("Temperature", "Температура", "Temperatur"));
        words.add(new Word("Thickness", "Толщина", "Qalınlıq"));
        words.add(new Word("Thread", "Резьба", "Yiv"));
        words.add(new Word("Thread Gauge", "Резьбомер", "Yiv ölçən"));
        words.add(new Word("Tool", "Инструмент", "Alət"));
        words.add(new Word("Tool Change", "Смена инструмента", "Alət dəyişməsi"));
        words.add(new Word("Tool Holder", "Держатель инструмента", "Alət tutacağı"));
        words.add(new Word("Tool Life", "Срок службы инструмента", "Alətin xidmət müddəti"));
        words.add(new Word("Torque", "Крутящий момент", "Fırlanma momenti"));
        words.add(new Word("Torque Wrench", "Динамометрический ключ", "Dinamometrik açar"));
        words.add(new Word("Training", "Обучение", "Təlim"));
        words.add(new Word("Turning", "Точение", "Torna emalı"));

        // ================= U =================
        words.add(new Word("Unclamp", "Разжать", "Sıxacı açmaq"));
        words.add(new Word("Unclamping", "Разжим", "Sıxacın açılması"));
        words.add(new Word("Uniformity", "Однородность", "Bərabərlik"));
        words.add(new Word("Unit", "Единица", "Vahid"));
        words.add(new Word("Urgent", "Срочный", "Təcili"));

        // ================= V =================
        words.add(new Word("Valve", "Клапан", "Klapan"));
        words.add(new Word("Vernier Caliper", "Штангенциркуль", "Ştangensirkul"));
        words.add(new Word("Vibration", "Вибрация", "Titrəmə"));
        words.add(new Word("Vice", "Тиски", "Məngənə"));
        words.add(new Word("Voltage", "Напряжение", "Gərginlik"));

        // ================= W =================
        words.add(new Word("Washer", "Шайба", "Şayba"));
        words.add(new Word("Wear", "Износ", "Aşınma"));
        words.add(new Word("Welding", "Сварка", "Qaynaq"));
        words.add(new Word("Welding Cable", "Сварочный кабель", "Qaynaq kabeli"));
        words.add(new Word("Welding Machine", "Сварочный аппарат", "Qaynaq aparatı"));
        words.add(new Word("Welding Torch", "Сварочная горелка", "Qaynaq məşəli"));
        words.add(new Word("Welder", "Сварщик", "Qaynaqçı"));
        words.add(new Word("Width", "Ширина", "En"));
        words.add(new Word("Wire", "Провод / проволока", "Tel"));
        words.add(new Word("Worker", "Рабочий", "Fəhlə"));
        words.add(new Word("Work Bench", "Верстак", "İş dəzgahı"));
        words.add(new Word("Workpiece", "Заготовка / деталь", "İş parçası"));
        words.add(new Word("Workplace", "Рабочее место", "İş yeri"));
        words.add(new Word("Workshop", "Цех", "Sex"));
        words.add(new Word("Wrench", "Гаечный ключ", "Açar"));

        // ================= X =================
        words.add(new Word("X-Axis", "Ось X", "X oxu"));
        words.add(new Word("X-Axis Limit", "Концевой выключатель оси X", "X oxunun son açarı"));

        // ================= Y =================
        words.add(new Word("Y-Axis", "Ось Y", "Y oxu"));
        words.add(new Word("Y-Axis Limit", "Концевой выключатель оси Y", "Y oxunun son açarı"));

        // ================= Z =================
        words.add(new Word("Z-Axis", "Ось Z", "Z oxu"));
        words.add(new Word("Z-Axis Limit", "Концевой выключатель оси Z", "Z oxunun son açarı"));
        words.add(new Word("Zero Point", "Нулевая точка", "Sıfır nöqtəsi"));

        // ================= WELDING =================
        words.add(new Word("Arc Welding", "Дуговая сварка", "Qövs qaynağı"));
        words.add(new Word("Welding Current", "Сварочный ток", "Qaynaq cərəyanı"));
        words.add(new Word("Welding Voltage", "Сварочное напряжение", "Qaynaq gərginliyi"));
        words.add(new Word("Welding Rod", "Сварочный пруток", "Qaynaq çubuğu"));
        words.add(new Word("Electrode Holder", "Держатель электрода", "Elektrod tutacağı"));
        words.add(new Word("Weld Bead", "Сварочный шов", "Qaynaq tikişi"));
        words.add(new Word("Weld Joint", "Сварное соединение", "Qaynaq birləşməsi"));
        words.add(new Word("Butt Joint", "Стыковое соединение", "Alın birləşməsi"));
        words.add(new Word("Lap Joint", "Нахлёсточное соединение", "Üst-üstə birləşmə"));
        words.add(new Word("Fillet Weld", "Угловой сварной шов", "Künc qaynaq tikişi"));
        words.add(new Word("Groove Weld", "Сварка в разделку", "Yivli qaynaq"));
        words.add(new Word("Tack Weld", "Прихваточный шов", "Tutucu qaynaq"));
        words.add(new Word("Weld Root", "Корень шва", "Tikiş kökü"));
        words.add(new Word("Weld Face", "Лицевая сторона шва", "Tikiş üzü"));
        words.add(new Word("Weld Toe", "Край сварного шва", "Qaynaq tikişinin kənarı"));
        words.add(new Word("Weld Crack", "Трещина сварного шва", "Qaynaq tikişində çat"));
        words.add(new Word("Weld Porosity", "Пористость шва", "Tikiş məsaməliliyi"));
        words.add(new Word("Weld Spatter", "Брызги металла", "Metal sıçraması"));
        words.add(new Word("Weld Defect", "Дефект сварки", "Qaynaq qüsuru"));
        words.add(new Word("Weld Inspection", "Проверка сварного шва", "Qaynaq tikişinin yoxlanılması"));
        words.add(new Word("Welding Position", "Положение сварки", "Qaynaq mövqeyi"));
        words.add(new Word("Welding Speed", "Скорость сварки", "Qaynaq sürəti"));
        words.add(new Word("Welding Gas", "Сварочный газ", "Qaynaq qazı"));
        words.add(new Word("Gas Cylinder", "Газовый баллон", "Qaz balonu"));
        words.add(new Word("Gas Regulator", "Газовый редуктор", "Qaz reduktoru"));
        words.add(new Word("Gas Pressure", "Давление газа", "Qaz təzyiqi"));
        words.add(new Word("Gas Hose", "Газовый шланг", "Qaz şlanqı"));
        words.add(new Word("Welding Mask", "Сварочная маска", "Qaynaq maskası"));
        words.add(new Word("Welding Helmet", "Сварочная каска", "Qaynaq dəbilqəsi"));
        words.add(new Word("Welding Gloves", "Сварочные перчатки", "Qaynaq əlcəkləri"));
        words.add(new Word("Welding Apron", "Сварочный фартук", "Qaynaq önlüyü"));
        words.add(new Word("Welding Screen", "Сварочный экран", "Qaynaq ekranı"));
        words.add