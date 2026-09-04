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

        // =====================================================
        // 🏭 ПРОИЗВОДСТВО
        // =====================================================

        words.add(new Word("Abrasion", "Истирание", "Aşınma"));
        words.add(new Word("Accuracy", "Точность", "Dəqiqlik"));
        words.add(new Word("Adjust", "Регулировать", "Tənzimləmək"));
        words.add(new Word("Adjustment", "Регулировка", "Tənzimləmə"));
        words.add(new Word("Alarm", "Сигнализация", "Siqnal"));
        words.add(new Word("Allen Key", "Шестигранный ключ", "Altıbucaqlı açar"));
        words.add(new Word("Aluminum", "Алюминий", "Alüminium"));
        words.add(new Word("Anvil", "Наковальня", "Zindan"));
        words.add(new Word("Assembly", "Сборка", "Yığma"));
        words.add(new Word("Assembly Line", "Сборочная линия", "Yığma xətti"));
        words.add(new Word("Automation", "Автоматизация", "Avtomatlaşdırma"));
        words.add(new Word("Automatic", "Автоматический", "Avtomatik"));
        words.add(new Word("Axis", "Ось", "Ox"));

        words.add(new Word("Backlash", "Люфт", "Boşluq"));
        words.add(new Word("Bearing", "Подшипник", "Yastıqça"));
        words.add(new Word("Belt", "Ремень", "Kəmər"));
        words.add(new Word("Bench Grinder", "Настольный шлифовальный станок", "Stolüstü daşlama dəzgahı"));
        words.add(new Word("Bending", "Гибка", "Əymə"));
        words.add(new Word("Blade", "Лезвие", "Bıçaq"));
        words.add(new Word("Bolt", "Болт", "Bolt"));
        words.add(new Word("Bore", "Отверстие", "Deşik"));
        words.add(new Word("Boring", "Растачивание", "Burma"));
        words.add(new Word("Brake", "Тормоз", "Əyləc"));
        words.add(new Word("Brush", "Щётка", "Fırça"));
        words.add(new Word("Bushing", "Втулка", "Oymaq"));
        words.add(new Word("Button", "Кнопка", "Düymə"));
        words.add(new Word("Burr", "Заусенец", "Tiliş"));

        words.add(new Word("Cable", "Кабель", "Kabel"));
        words.add(new Word("Caliper", "Штангенциркуль", "Ştangenpərgar"));
        words.add(new Word("Capacity", "Мощность / вместимость", "Tutum"));
        words.add(new Word("Chamfer", "Фаска", "Faska"));
        words.add(new Word("Chain", "Цепь", "Zəncir"));
        words.add(new Word("Chisel", "Зубило", "Kəski"));
        words.add(new Word("Chuck", "Патрон", "Patron"));
        words.add(new Word("Circular Saw", "Циркулярная пила", "Diskli mişar"));
        words.add(new Word("Clamp", "Зажим", "Sıxac"));
        words.add(new Word("Cleaning", "Очистка", "Təmizləmə"));
        words.add(new Word("CNC Machine", "Станок с ЧПУ", "CNC dəzgahı"));
        words.add(new Word("Collet", "Цанга", "Sıxıcı patron"));
        words.add(new Word("Combination Wrench", "Комбинированный ключ", "Kombinə edilmiş açar"));
        words.add(new Word("Control", "Управление", "İdarəetmə"));
        words.add(new Word("Control Panel", "Панель управления", "İdarəetmə paneli"));
        words.add(new Word("Coolant", "Охлаждающая жидкость", "Soyuducu maye"));
        words.add(new Word("Copper", "Медь", "Mis"));
        words.add(new Word("Countersink", "Зенковка", "Zenker"));
        words.add(new Word("Crimping Tool", "Обжимной инструмент", "Sıxma aləti"));
        words.add(new Word("Cutter", "Резак", "Kəsici"));
        words.add(new Word("Cutting", "Резка", "Kəsmə"));
        words.add(new Word("Cutting Insert", "Режущая пластина", "Kəsici lövhə"));
        words.add(new Word("Cutting Speed", "Скорость резания", "Kəsmə sürəti"));
        words.add(new Word("Cutting Tool", "Режущий инструмент", "Kəsici alət"));
        words.add(new Word("Cycle", "Цикл", "Dövr"));

        words.add(new Word("Data", "Данные", "Məlumat"));
        words.add(new Word("Deburring Tool", "Инструмент для снятия заусенцев", "Tiliş təmizləmə aləti"));
        words.add(new Word("Defect", "Дефект", "Qüsur"));
        words.add(new Word("Depth", "Глубина", "Dərinlik"));
        words.add(new Word("Depth Gauge", "Глубиномер", "Dərinlik ölçən"));
        words.add(new Word("Diameter", "Диаметр", "Diametr"));
        words.add(new Word("Die", "Плашка", "Yiv açan alət"));
        words.add(new Word("Die Holder", "Держатель плашки", "Plaşka tutacağı"));
        words.add(new Word("Diamond Tool", "Алмазный инструмент", "Almaz aləti"));
        words.add(new Word("Drill", "Дрель", "Drel"));
        words.add(new Word("Drill Bit", "Сверло", "Burğu"));
        words.add(new Word("Drill Chuck", "Сверлильный патрон", "Burğu patronu"));
        words.add(new Word("Drill Press", "Сверлильный станок", "Burğu dəzgahı"));
        words.add(new Word("Drive", "Привод", "Ötürücü"));
        words.add(new Word("Drawing", "Чертёж", "Çertyoj"));
        words.add(new Word("Dust Collector", "Пылесборник", "Toz toplayıcı"));

        words.add(new Word("Edge", "Кромка", "Kənar"));
        words.add(new Word("Electricity", "Электричество", "Elektrik"));
        words.add(new Word("Emergency", "Аварийная ситуация", "Fövqəladə vəziyyət"));
        words.add(new Word("Emergency Stop", "Аварийная остановка", "Təcili dayandırma"));
        words.add(new Word("End Mill", "Концевая фреза", "Son frez"));
        words.add(new Word("End Stop", "Концевой упор", "Son dayaq"));
        words.add(new Word("Energy", "Энергия", "Enerji"));
        words.add(new Word("Engraving", "Гравировка", "Oyma"));
        words.add(new Word("Equipment", "Оборудование", "Avadanlıq"));
        words.add(new Word("Error", "Ошибка", "Səhv"));
        words.add(new Word("Extension Cord", "Удлинитель", "Uzatma kabeli"));

        words.add(new Word("Face Mill", "Торцевая фреза", "Üz frezi"));
        words.add(new Word("Factory", "Завод", "Zavod"));
        words.add(new Word("Feed", "Подача", "Veriş"));
        words.add(new Word("Feed Rate", "Скорость подачи", "Veriş sürəti"));
        words.add(new Word("File", "Напильник", "Əhəng"));
        words.add(new Word("Filter", "Фильтр", "Filtr"));
        words.add(new Word("Finishing", "Чистовая обработка", "Son emal"));
        words.add(new Word("Fixture", "Приспособление", "Qurğu"));
        words.add(new Word("Flat File", "Плоский напильник", "Yastı əhəng"));
        words.add(new Word("Flange", "Фланец", "Flanş"));
        words.add(new Word("Force", "Сила", "Qüvvə"));
        words.add(new Word("Forklift", "Погрузчик", "Yükləyici"));
        words.add(new Word("Frame", "Рама", "Çərçivə"));
        words.add(new Word("Frequency", "Частота", "Tezlik"));
        words.add(new Word("Furnace", "Печь", "Soba"));

        words.add(new Word("Gas", "Газ", "Qaz"));
        words.add(new Word("Gauge", "Калибр", "Kalibr"));
        words.add(new Word("Gear", "Шестерня", "Dişli"));
        words.add(new Word("Gearbox", "Коробка передач", "Sürətlər qutusu"));
        words.add(new Word("Gloves", "Перчатки", "Əlcəklər"));
        words.add(new Word("Grinding", "Шлифование", "Daşlama"));
        words.add(new Word("Grinding Tool", "Шлифовальный инструмент", "Daşlama aləti"));
        words.add(new Word("Grinding Wheel", "Шлифовальный круг", "Daşlama dairəsi"));
        words.add(new Word("Guide", "Направляющая", "İstiqamətləndirici"));
        words.add(new Word("Guard", "Защитное ограждение", "Qoruyucu örtük"));

        words.add(new Word("Hacksaw", "Ножовка", "Mişar"));
        words.add(new Word("Hammer", "Молоток", "Çəkic"));
        words.add(new Word("Hand Drill", "Ручная дрель", "Əl dreli"));
        words.add(new Word("Hand Tool", "Ручной инструмент", "Əl aləti"));
        words.add(new Word("Handwheel", "Маховик", "Əl çarxı"));
        words.add(new Word("Handle", "Ручка", "Dəstək"));
        words.add(new Word("Hazard", "Опасность", "Təhlükə"));
        words.add(new Word("Heat Treatment", "Термообработка", "İstilik emalı"));
        words.add(new Word("Helmet", "Каска", "Dəbilqə"));
        words.add(new Word("Height", "Высота", "Hündürlük"));
        words.add(new Word("Hex Key", "Шестигранный ключ", "Altıbucaqlı açar"));
        words.add(new Word("Hose", "Шланг", "Şlanq"));
        words.add(new Word("Hydraulic", "Гидравлический", "Hidravlik"));

        words.add(new Word("Impact Wrench", "Ударный гайковёрт", "Zərbəli açar"));
        words.add(new Word("Inspection", "Проверка", "Yoxlama"));
        words.add(new Word("Inspection Report", "Отчёт проверки", "Yoxlama hesabatı"));
        words.add(new Word("Insulation", "Изоляция", "İzolyasiya"));
        words.add(new Word("Iron", "Железо", "Dəmir"));

        words.add(new Word("Jaw", "Губка патрона", "Patron çənəsi"));
        words.add(new Word("Jaw Chuck", "Кулачковый патрон", "Çənəli patron"));
        words.add(new Word("Jig", "Кондуктор", "Konduktor"));
        words.add(new Word("Job", "Работа / задание", "İş / tapşırıq"));
        words.add(new Word("Joint", "Соединение", "Birləşmə"));

        words.add(new Word("Key", "Шпонка / ключ", "Şponka / açar"));
        words.add(new Word("Keyway", "Шпоночный паз", "Şponka yuvası"));
        words.add(new Word("Knife", "Нож", "Bıçaq"));
        words.add(new Word("Knurling", "Накатка", "Naxışlama"));

        words.add(new Word("Lathe", "Токарный станок", "Torna dəzgahı"));
        words.add(new Word("Lathe Tool", "Токарный инструмент", "Torna aləti"));
        words.add(new Word("Lead Screw", "Ходовой винт", "Gediş vinti"));
        words.add(new Word("Length", "Длина", "Uzunluq"));
        words.add(new Word("Level", "Уровень", "Səviyyə"));
        words.add(new Word("Limit", "Предел / ограничение", "Hədd"));
        words.add(new Word("Lock Nut", "Контргайка", "Kontrqayka"));
        words.add(new Word("Locking Pliers", "Зажимные клещи", "Sıxıcı kəlbətin"));
        words.add(new Word("Lubricant", "Смазка", "Sürtkü"));
        words.add(new Word("Lubrication", "Смазка", "Yağlama"));

        words.add(new Word("Machine", "Станок / машина", "Dəzgah / maşın"));
        words.add(new Word("Machine Bed", "Станина станка", "Dəzgah gövdəsi"));
        words.add(new Word("Machine Guard", "Защитное ограждение станка", "Dəzgah qoruyucusu"));
        words.add(new Word("Machine Table", "Стол станка", "Dəzgah masası"));
        words.add(new Word("Machine Vice", "Тиски станка", "Dəzgah məngənəsi"));
        words.add(new Word("Maintenance", "Техническое обслуживание", "Texniki xidmət"));
        words.add(new Word("Mandrel", "Оправка", "Mandrel"));
        words.add(new Word("Manual", "Руководство / ручной", "Təlimat / əl ilə"));
        words.add(new Word("Material", "Материал", "Material"));
        words.add(new Word("Measure", "Измерять", "Ölçmək"));
        words.add(new Word("Measurement", "Измерение", "Ölçmə"));
        words.add(new Word("Measuring Tape", "Рулетка", "Ölçü lenti"));
        words.add(new Word("Measuring Tool", "Измерительный инструмент", "Ölçü aləti"));
        words.add(new Word("Metal", "Металл", "Metal"));
        words.add(new Word("Micrometer", "Микрометр", "Mikrometr"));
        words.add(new Word("Mill", "Фрезерный станок", "Frezer dəzgahı"));
        words.add(new Word("Milling Cutter", "Фреза", "Freza"));
        words.add(new Word("Milling Head", "Фрезерная головка", "Frezer başlığı"));
        words.add(new Word("Morse Taper", "Конус Морзе", "Mors konusu"));
        words.add(new Word("Motor", "Двигатель", "Mühərrik"));

        words.add(new Word("Nipple", "Ниппель", "Nipel"));
        words.add(new Word("Nozzle", "Сопло", "Ucluq"));
        words.add(new Word("Nominal Size", "Номинальный размер", "Nominal ölçü"));
        words.add(new Word("Nut", "Гайка", "Qayka"));

        words.add(new Word("Offset", "Смещение / коррекция", "Ofset"));
        words.add(new Word("Oil", "Масло", "Yağ"));
        words.add(new Word("Oil Filter", "Масляный фильтр", "Yağ filtri"));
        words.add(new Word("Open-End Wrench", "Рожковый ключ", "Ağız açar"));
        words.add(new Word("Operation", "Операция", "Əməliyyat"));
        words.add(new Word("Operator", "Оператор", "Operator"));
        words.add(new Word("Operator Manual", "Руководство оператора", "Operator təlimatı"));
        words.add(new Word("Output", "Выход / результат", "Çıxış"));
        words.add(new Word("Overheat", "Перегрев", "Həddindən artıq qızma"));
        words.add(new Word("Overload", "Перегрузка", "Həddindən artıq yüklənmə"));

        words.add(new Word("Parallel", "Параллельный", "Paralel"));
        words.add(new Word("Part", "Деталь", "Detal"));
        words.add(new Word("Phillips Screwdriver", "Крестовая отвёртка", "Xaçvari vintaçan"));
        words.add(new Word("Pilot Hole", "Направляющее отверстие", "İstiqamətləndirici deşik"));
        words.add(new Word("Pipe Wrench", "Трубный ключ", "Boru açarı"));
        words.add(new Word("Pliers", "Плоскогубцы", "Kəlbətin"));
        words.add(new Word("Power Supply", "Источник питания", "Enerji mənbəyi"));
        words.add(new Word("PPE", "Средства индивидуальной защиты", "Fərdi mühafizə vasitələri"));
        words.add(new Word("Press", "Пресс", "Pres"));
        words.add(new Word("Pressure", "Давление", "Təzyiq"));
        words.add(new Word("Production", "Производство", "İstehsal"));
        words.add(new Word("Product", "Изделие / продукт", "Məhsul"));
        words.add(new Word("Process", "Процесс", "Proses"));
        words.add(new Word("Punch", "Пробойник", "Zərbə aləti"));
        words.add(new Word("Pump", "Насос", "Nasos"));

        words.add(new Word("Quality", "Качество", "Keyfiyyət"));
        words.add(new Word("Quality Control", "Контроль качества", "Keyfiyyətə nəzarət"));

        words.add(new Word("Raw Material", "Сырьё", "Xammal"));
        words.add(new Word("Reamer", "Развёртка", "Rayber"));
        words.add(new Word("Reference Point", "Исходная точка", "İstinad nöqtəsi"));
        words.add(new Word("Repair", "Ремонт", "Təmir"));
        words.add(new Word("Replace", "Заменять", "Əvəz etmək"));
        words.add(new Word("Report", "Отчёт", "Hesabat"));
        words.add(new Word("Risk", "Риск", "Risk"));
        words.add(new Word("Robot", "Робот", "Robot"));
        words.add(new Word("Rotary Table", "Поворотный стол", "Fırlanan masa"));
        words.add(new Word("Ruler", "Линейка", "Xətkeş"));
        words.add(new Word("Runout", "Радиальное биение", "Radial qaçma"));

        words.add(new Word("Safety", "Безопасность", "Təhlükəsizlik"));
        words.add(new Word("Sanding Disc", "Шлифовальный диск", "Zımpara diski"));
        words.add(new Word("Saw", "Пила", "Mişar"));
        words.add(new Word("Screw", "Винт", "Vint"));
        words.add(new Word("Screw Extractor", "Экстрактор винтов", "Vint çıxarıcı"));
        words.add(new Word("Screwdriver", "Отвёртка", "Vintaçan"));
        words.add(new Word("Sensor", "Датчик", "Sensor"));
        words.add(new Word("Setting", "Настройка", "Tənzimləmə"));
        words.add(new Word("Sheet", "Лист металла", "Metal vərəq"));
        words.add(new Word("Shank", "Хвостовик", "Quyruq hissə"));
        words.add(new Word("Shift", "Смена", "Növbə"));
        words.add(new Word("Shut Down", "Остановить / выключить", "Söndürmək"));
        words.add(new Word("Socket", "Торцевая головка", "Başlıq"));
        words.add(new Word("Socket Wrench", "Торцевой ключ", "Başlıq açarı"));
        words.add(new Word("Spacer", "Распорная втулка", "Ara halqa"));
        words.add(new Word("Spanner", "Гаечный ключ", "Açar"));
        words.add(new Word("Speed", "Скорость", "Sürət"));
        words.add(new Word("Spindle", "Шпиндель", "Şpindel"));
        words.add(new Word("Spirit Level", "Строительный уровень", "Su tərəzisi"));
        words.add(new Word("Spring", "Пружина", "Yay"));
        words.add(new Word("Spring Clamp", "Пружинный зажим", "Yaylı sıxac"));
        words.add(new Word("Standard", "Стандарт", "Standart"));
        words.add(new Word("Steel", "Сталь", "Polad"));
        words.add(new Word("Stop Button", "Кнопка остановки", "Dayandırma düyməsi"));
        words.add(new Word("Surface Finish", "Чистота поверхности", "Səthin təmizliyi"));
        words.add(new Word("Switch", "Выключатель / переключатель", "Açar / dəyişdirici"));
        words.add(new Word("System", "Система", "Sistem"));

        words.add(new Word("Tap", "Метчик", "Metçik"));
        words.add(new Word("Tap Wrench", "Вороток для метчика", "Metçik açarı"));
        words.add(new Word("Task", "Задание", "Tapşırıq"));
        words.add(new Word("Technician", "Техник", "Texnik"));
        words.add(new Word("Temperature", "Температура", "Temperatur"));
        words.add(new Word("Thickness", "Толщина", "Qalınlıq"));
        words.add(new Word("Thread", "Резьба", "Yiv"));
        words.add(new Word("Thread Gauge", "Резьбовой калибр", "Yiv kalibri"));
        words.add(new Word("Tool", "Инструмент", "Alət"));
        words.add(new Word("Tool Cabinet", "Инструментальный шкаф", "Alət şkafı"));
        words.add(new Word("Tool Change", "Смена инструмента", "Alətin dəyişdirilməsi"));
        words.add(new Word("Tool Holder", "Держатель инструмента", "Alət tutacağı"));
        words.add(new Word("Tool Life", "Срок службы инструмента", "Alətin xidmət müddəti"));
        words.add(new Word("Tool Offset", "Коррекция инструмента", "Alət korreksiyası"));
        words.add(new Word("Tool Rack", "Стойка для инструментов", "Alət rəfi"));
        words.add(new Word("Tool Steel", "Инструментальная сталь", "Alət poladı"));
        words.add(new Word("Toolbox", "Ящик для инструментов", "Alət qutusu"));
        words.add(new Word("Torque", "Крутящий момент", "Fırlanma momenti"));
        words.add(new Word("Torque Wrench", "Динамометрический ключ", "Tork açarı"));
        words.add(new Word("Training", "Обучение", "Təlim"));
        words.add(new Word("Turning", "Токарная обработка", "Torna emalı"));

        words.add(new Word("Unclamp", "Разжать", "Sıxmanı açmaq"));
        words.add(new Word("Unclamping", "Разжим", "Sıxmanın açılması"));
        words.add(new Word("Uniformity", "Однородность", "Bircinslilik"));
        words.add(new Word("Unit", "Единица", "Vahid"));
        words.add(new Word("Urgent", "Срочный", "Təcili"));

        words.add(new Word("Valve", "Клапан", "Klapan"));
        words.add(new Word("Vernier Caliper", "Штангенциркуль с нониусом", "Noniuslu ştangenpərgar"));
        words.add(new Word("Vibration", "Вибрация", "Vibrasiya"));
        words.add(new Word("Vibration Damper", "Гаситель вибрации", "Vibrasiya söndürücü"));
        words.add(new Word("Vice", "Тиски", "Məngənə"));
        words.add(new Word("Vise Jaw", "Губка тисков", "Məngənə çənəsi"));
        words.add(new Word("Voltage", "Напряжение", "Gərginlik"));

        words.add(new Word("Washer", "Шайба", "Şayba"));
        words.add(new Word("Water", "Вода", "Su"));
        words.add(new Word("Wear", "Износ", "Aşınma"));
        words.add(new Word("Wear Rate", "Скорость износа", "Aşınma sürəti"));
        words.add(new Word("Welding", "Сварка", "Qaynaq"));
        words.add(new Word("Welding Clamp", "Сварочный зажим", "Qaynaq sıxacı"));
        words.add(new Word("Welder", "Сварщик", "Qaynaqçı"));
        words.add(new Word("Width", "Ширина", "En"));
        words.add(new Word("Wire", "Провод", "Tel"));
        words.add(new Word("Wire Brush", "Проволочная щётка", "Tel fırçası"));
        words.add(new Word("Worker", "Рабочий", "İşçi"));
        words.add(new Word("Work Bench", "Рабочий верстак", "İş dəzgahı"));
        words.add(new Word("Work Clamp", "Рабочий зажим", "İş sıxacı"));
        words.add(new Word("Work Fixture", "Рабочее приспособление", "İş qurğusu"));
        words.add(new Word("Workholding Fixture", "Приспособление для закрепления детали", "Detal bərkitmə qurğusu"));
        words.add(new Word("Workpiece", "Обрабатываемая деталь", "Emal olunan detal"));
        words.add(new Word("Workplace", "Рабочее место", "İş yeri"));
        words.add(new Word("Workshop", "Цех / мастерская", "Sex / emalatxana"));
        words.add(new Word("Wrench", "Гаечный ключ", "Açar"));

        words.add(new Word("X-Axis", "Ось X", "X oxu"));
        words.add(new Word("X-Axis Limit", "Ограничитель оси X", "X oxunun məhdudlaşdırıcısı"));

        words.add(new Word("Y-Axis", "Ось Y", "Y oxu"));
        words.add(new Word("Y-Axis Limit", "Ограничитель оси Y", "Y oxunun məhdudlaşdırıcısı"));

        words.add(new Word("Z-Axis", "Ось Z", "Z oxu"));
        words.add(new Word("Z-Axis Limit", "Ограничитель оси Z", "Z oxunun məhdudlaşdırıcısı"));
        words.add(new Word("Zero Point", "Нулевая точка", "Sıfır nöqtəsi"));


        // =====================================================
        // 🆕 ДОПОЛНИТЕЛЬНЫЕ СЛОВА 401–500
        // =====================================================

        // ---------- Производство ----------
        words.add(new Word("Accident", "Несчастный случай", "Qəza"));
        words.add(new Word("Batch", "Партия", "Partiya"));
        words.add(new Word("Batch Number", "Номер партии", "Partiya nömrəsi"));
        words.add(new Word("Finished Product", "Готовое изделие", "Hazır məhsul"));
        words.add(new Word("Production Area", "Производственная зона", "İstehsalat sahəsi"));
        words.add(new Word("Production Plan", "План производства", "İstehsal planı"));
        words.add(new Word("Production Rate", "Темп производства", "İstehsal tempi"));
        words.add(new Word("Production Schedule", "График производства", "İstehsal cədvəli"));
        words.add(new Word("Production Worker", "Производственный рабочий", "İstehsalat işçisi"));
        words.add(new Word("Workstation", "Рабочая станция", "İş stansiyası"));

        // ---------- Охрана труда ----------
        words.add(new Word("Accident Report", "Отчёт о несчастном случае", "Qəza hesabatı"));
        words.add(new Word("Danger", "Опасность", "Təhlükə"));
        words.add(new Word("Emergency Exit", "Аварийный выход", "Təcili çıxış"));
        words.add(new Word("First Aid", "Первая помощь", "İlk yardım"));
        words.add(new Word("First Aid Kit", "Аптечка", "İlk yardım çantası"));
        words.add(new Word("Hearing Protection", "Защита слуха", "Eşitmə mühafizəsi"));
        words.add(new Word("Safety Glasses", "Защитные очки", "Qoruyucu eynək"));
        words.add(new Word("Safety Shoes", "Защитная обувь", "Qoruyucu ayaqqabı"));
        words.add(new Word("Warning Sign", "Предупреждающий знак", "Xəbərdarlıq nişanı"));

        // ---------- Сварка ----------
        words.add(new Word("Weld Bead", "Сварной шов", "Qaynaq tikişi"));
        words.add(new Word("Weld Crack", "Трещина сварного шва", "Qaynaq tikişində çat"));
        words.add(new Word("Weld Joint", "Сварное соединение", "Qaynaq birləşməsi"));
        words.add(new Word("Welding Cable", "Сварочный кабель", "Qaynaq kabeli"));
        words.add(new Word("Welding Current", "Сварочный ток", "Qaynaq cərəyanı"));
        words.add(new Word("Welding Helmet", "Сварочная маска", "Qaynaq maskası"));
        words.add(new Word("Welding Machine", "Сварочный аппарат", "Qaynaq aparatı"));
        words.add(new Word("Welding Rod", "Сварочный пруток", "Qaynaq çubuğu"));
        words.add(new Word("Welding Torch", "Сварочная горелка", "Qaynaq məşəli"));

        // ---------- CNC ----------
        words.add(new Word("CNC Control", "Управление ЧПУ", "CNC idarəetməsi"));
        words.add(new Word("CNC Program", "Программа ЧПУ", "CNC proqramı"));
        words.add(new Word("CNC Programmer", "Программист ЧПУ", "CNC proqramçısı"));
        words.add(new Word("Machine Coordinate", "Координата станка", "Dəzgah koordinatı"));
        words.add(new Word("Machine Cycle Time", "Время цикла станка", "Dəzgah dövrünün vaxtı"));
        words.add(new Word("Machine Zero", "Ноль станка", "Dəzgah sıfırı"));
        words.add(new Word("Program Number", "Номер программы", "Proqram nömrəsi"));
        words.add(new Word("Tool Length", "Длина инструмента", "Alətin uzunluğu"));
        words.add(new Word("Work Coordinate", "Рабочая координата", "İş koordinatı"));

        // ---------- Штамповка ----------
        words.add(new Word("Blank", "Заготовка", "Pəstah"));
        words.add(new Word("Blanking", "Вырубка", "Kəsmə əməliyyatı"));
        words.add(new Word("Deep Drawing", "Глубокая вытяжка", "Dərin dartma"));
        words.add(new Word("Die Set", "Штамповый комплект", "Ştamp dəsti"));
        words.add(new Word("Forming", "Формовка", "Formalaşdırma"));
        words.add(new Word("Punching", "Пробивка", "Deşmə"));
        words.add(new Word("Sheet Metal", "Листовой металл", "Sac metal"));
        words.add(new Word("Stamping Die", "Штамп", "Ştamp"));
        words.add(new Word("Stamping Machine", "Штамповочный станок", "Ştamplama dəzgahı"));
        words.add(new Word("Stamping Press", "Штамповочный пресс", "Ştamplama presi"));

        // ---------- Измерения ----------
        words.add(new Word("Angle Gauge", "Угломер", "Bucaq ölçən"));
        words.add(new Word("Digital Caliper", "Цифровой штангенциркуль", "Rəqəmsal ştangenpərgar"));
        words.add(new Word("Dimension", "Размер", "Ölçü"));
        words.add(new Word("Dimension Tolerance", "Допуск размера", "Ölçü toleransı"));
        words.add(new Word("Inside Diameter", "Внутренний диаметр", "Daxili diametr"));
        words.add(new Word("Measurement Accuracy", "Точность измерения", "Ölçmə dəqiqliyi"));
        words.add(new Word("Measurement Error", "Ошибка измерения", "Ölçmə xətası"));
        words.add(new Word("Outside Diameter", "Наружный диаметр", "Xarici diametr"));
        words.add(new Word("Tolerance Range", "Диапазон допуска", "Tolerans diapazonu"));
        words.add(new Word("Zero Calibration", "Калибровка нуля", "Sıfır kalibrləməsi"));

        // ---------- Контроль качества ----------
        words.add(new Word("Acceptance Criteria", "Критерии приёмки", "Qəbul meyarları"));
        words.add(new Word("Inspection Record", "Запись проверки", "Yoxlama qeydi"));
        words.add(new Word("Quality Check", "Проверка качества", "Keyfiyyət yoxlaması"));
        words.add(new Word("Quality Inspector", "Контролёр качества", "Keyfiyyət nəzarətçisi"));
        words.add(new Word("Quality Standard", "Стандарт качества", "Keyfiyyət standartı"));
        words.add(new Word("Rejected Part", "Забракованная деталь", "Rədd edilmiş detal"));
        words.add(new Word("Sample", "Образец", "Nümunə"));
        words.add(new Word("Sampling", "Выборочный контроль", "Seçmə nəzarət"));
        words.add(new Word("Tolerance", "Допуск", "Tolerans"));
        words.add(new Word("Visual Check", "Визуальная проверка", "Vizual yoxlama"));

        // ---------- Электрика и датчики ----------
        words.add(new Word("Circuit", "Электрическая цепь", "Elektrik dövrəsi"));
        words.add(new Word("Circuit Breaker", "Автоматический выключатель", "Avtomatik açar"));
        words.add(new Word("Electrical Panel", "Электрический шкаф", "Elektrik paneli"));
        words.add(new Word("Electrical Safety", "Электробезопасность", "Elektrik təhlükəsizliyi"));
        words.add(new Word("Magnetic Sensor", "Магнитный датчик", "Maqnit sensoru"));
        words.add(new Word("Proximity Sensor", "Датчик приближения", "Yaxınlıq sensoru"));
        words.add(new Word("Relay", "Реле", "Rele"));
        words.add(new Word("Terminal", "Клемма", "Klemma"));
        words.add(new Word("Transformer", "Трансформатор", "Transformator"));

        // ---------- Материалы ----------
        words.add(new Word("Alloy", "Сплав", "Ərinti"));
        words.add(new Word("Brass", "Латунь", "Latun"));
        words.add(new Word("Cast Iron", "Чугун", "Çuqun"));
        words.add(new Word("Hardness", "Твёрдость", "Sərtlik"));
        words.add(new Word("Stainless Steel", "Нержавеющая сталь", "Paslanmayan polad"));
        words.add(new Word("Tensile Strength", "Предел прочности при растяжении", "Dartılma möhkəmliyi"));
        words.add(new Word("Yield Strength", "Предел текучести", "Axma həddi"));

        // ---------- Термообработка ----------
        words.add(new Word("Cooling Rate", "Скорость охлаждения", "Soyuma sürəti"));
        words.add(new Word("Furnace Temperature", "Температура печи", "Soba temperaturu"));
        words.add(new Word("Heating Rate", "Скорость нагрева", "Qızdırma sürəti"));
        words.add(new Word("Quenching", "Закалка", "Sürətli soyutma"));
        words.add(new Word("Tempering", "Отпуск", "Tablama"));
        words.add(new Word("Thermal Expansion", "Тепловое расширение", "İstilik genişlənməsi"));
        words.add(new Word("Thermocouple", "Термопара", "Termocüt"));

        return words;
    }
}