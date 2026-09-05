package com.workerpro.v3;

import java.util.ArrayList;
import java.util.List;

public class EnglishDictionary {

public static class Word {
    public String english;
    public String russian;
    public String azerbaijani;
    public String category;

    public Word(
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
        List<Word> words,
        String english,
        String russian,
        String azerbaijani,
        String category) {

    words.add(
            new Word(
                    english,
                    russian,
                    azerbaijani,
                    category
            )
    );
}

public static List<Word> getWords() {

    List<Word> words = new ArrayList<>();

    // ================= WORK =================

    add(words, "Factory", "Завод", "Zavod", "WORK");
    add(words, "Workshop", "Цех / мастерская", "Sex / emalatxana", "WORK");
    add(words, "Worker", "Рабочий", "İşçi", "WORK");
    add(words, "Operator", "Оператор", "Operator", "WORK");
    add(words, "Job", "Работа / задание", "İş", "WORK");
    add(words, "Task", "Задание", "Tapşırıq", "WORK");
    add(words, "Production", "Производство", "İstehsal", "WORK");
    add(words, "Product", "Изделие", "Məhsul", "WORK");
    add(words, "Process", "Процесс", "Proses", "WORK");
    add(words, "Operation", "Операция", "Əməliyyat", "WORK");
    add(words, "Assembly", "Сборка", "Yığma", "WORK");
    add(words, "Assembly Line", "Сборочная линия", "Yığım xətti", "WORK");
    add(words, "Material", "Материал", "Material", "WORK");
    add(words, "Raw Material", "Сырьё", "Xammal", "WORK");
    add(words, "Output", "Выпуск / производительность", "Çıxış / istehsal", "WORK");

    // ================= MACHINE =================

    add(words, "Machine", "Станок / машина", "Dəzgah", "MACHINE");
    add(words, "Machine Bed", "Станина", "Dəzgah yatağı", "MACHINE");
    add(words, "Machine Table", "Стол станка", "Dəzgah masası", "MACHINE");
    add(words, "Machine Guard", "Защитное ограждение станка", "Dəzgah qoruyucusu", "MACHINE");
    add(words, "Machine Setup", "Настройка станка", "Dəzgahın sazlanması", "MACHINE");
    add(words, "Machine Reset", "Сброс станка", "Dəzgahın sıfırlanması", "MACHINE");
    add(words, "Machine Zero", "Ноль станка", "Dəzgah sıfırı", "MACHINE");
    add(words, "Machine Vice", "Машинные тиски", "Dəzgah məngənəsi", "MACHINE");
    add(words, "Motor", "Двигатель", "Mühərrik", "MACHINE");
    add(words, "Drive", "Привод", "Ötürücü", "MACHINE");
    add(words, "Gear", "Шестерня", "Dişli", "MACHINE");
    add(words, "Gearbox", "Редуктор", "Reduktor", "MACHINE");
    add(words, "Bearing", "Подшипник", "Yastıqça", "MACHINE");
    add(words, "Belt", "Ремень", "Kəmər", "MACHINE");
    add(words, "Spindle", "Шпиндель", "Şpindel", "MACHINE");
    add(words, "Spindle Load", "Нагрузка шпинделя", "Şpindel yükü", "MACHINE");
    add(words, "Spindle Motor", "Двигатель шпинделя", "Şpindel mühərriki", "MACHINE");
    add(words, "Spindle Speed", "Скорость шпинделя", "Şpindel sürəti", "MACHINE");
    add(words, "Limit Switch", "Концевой выключатель", "Son açarı", "MACHINE");
    add(words, "Sensor", "Датчик", "Sensor", "MACHINE");
    add(words, "Button", "Кнопка", "Düymə", "MACHINE");
    add(words, "Control Panel", "Панель управления", "İdarəetmə paneli", "MACHINE");
    add(words, "Alarm", "Аварийный сигнал", "Siqnal", "MACHINE");
    add(words, "Error", "Ошибка", "Səhv", "MACHINE");
    add(words, "Error Code", "Код ошибки", "Səhv kodu", "MACHINE");

    // ================= CNC =================

    add(words, "CNC Machine", "Станок с ЧПУ", "CNC dəzgahı", "CNC");
    add(words, "CNC Control", "Управление ЧПУ", "CNC idarəetməsi", "CNC");
    add(words, "CNC Program", "Программа ЧПУ", "CNC proqramı", "CNC");
    add(words, "CNC Programmer", "Программист ЧПУ", "CNC proqramçısı", "CNC");
    add(words, "Program Number", "Номер программы", "Proqram nömrəsi", "CNC");
    add(words, "Program Block", "Блок программы", "Proqram bloku", "CNC");
    add(words, "Program Start", "Запуск программы", "Proqramın işə salınması", "CNC");
    add(words, "Program Stop", "Остановка программы", "Proqramın dayandırılması", "CNC");
    add(words, "Cycle", "Цикл", "Tsikl", "CNC");
    add(words, "Cycle Time", "Время цикла", "Tsikl vaxtı", "CNC");
    add(words, "Feed", "Подача", "Veriş", "CNC");
    add(words, "Feed Rate", "Скорость подачи", "Veriş sürəti", "CNC");
    add(words, "Feed Hold", "Остановка подачи", "Verişin saxlanması", "CNC");
    add(words, "Rapid Feed", "Быстрая подача", "Sürətli veriş", "CNC");
    add(words, "Rapid Movement", "Быстрое перемещение", "Sürətli hərəkət", "CNC");
    add(words, "Dry Run", "Холостой прогон", "Boş gediş", "CNC");
    add(words, "Single Block", "Покадровый режим", "Tək blok rejimi", "CNC");
    add(words, "Coordinate", "Координата", "Koordinat", "CNC");
    add(words, "Coordinate System", "Система координат", "Koordinat sistemi", "CNC");
    add(words, "Machine Coordinate", "Координата станка", "Dəzgah koordinatı", "CNC");
    add(words, "Work Coordinate", "Рабочая координата", "İş koordinatı", "CNC");
    add(words, "Work Zero", "Рабочий ноль", "İş sıfırı", "CNC");
    add(words, "Reference Point", "Точка отсчёта", "İstinad nöqtəsi", "CNC");
    add(words, "Reference Return", "Возврат в исходную точку", "İstinad nöqtəsinə qayıdış", "CNC");
    add(words, "X-Axis", "Ось X", "X oxu", "CNC");
    add(words, "Y-Axis", "Ось Y", "Y oxu", "CNC");
    add(words, "Z-Axis", "Ось Z", "Z oxu", "CNC");
    add(words, "Zero Offset", "Коррекция нуля", "Sıfır korreksiyası", "CNC");
    add(words, "Zero Point", "Нулевая точка", "Sıfır nöqtəsi", "CNC");
    add(words, "Tool Change", "Смена инструмента", "Alətin dəyişdirilməsi", "CNC");
    add(words, "Tool Compensation", "Компенсация инструмента", "Alət kompensasiyası", "CNC");
    add(words, "Tool Number", "Номер инструмента", "Alət nömrəsi", "CNC");
    add(words, "Tool Length", "Длина инструмента", "Alətin uzunluğu", "CNC");
    add(words, "Tool Diameter", "Диаметр инструмента", "Alətin diametri", "CNC");
    add(words, "Tool Holder", "Держатель инструмента", "Alət tutacağı", "CNC");
    add(words, "Tool Magazine", "Магазин инструментов", "Alət magazini", "CNC");
    add(words, "Cutting Speed", "Скорость резания", "Kəsmə sürəti", "CNC");
    add(words, "Cutting Depth", "Глубина резания", "Kəsmə dərinliyi", "CNC");

    // ================= STAMPING =================

    add(words, "Stamping", "Штамповка", "Ştamplama", "STAMPING");
    add(words, "Stamping Machine", "Штамповочная машина", "Ştamplama maşını", "STAMPING");
    add(words, "Stamping Press", "Штамповочный пресс", "Ştamplama presi", "STAMPING");
    add(words, "Stamping Die", "Штамповочная матрица", "Ştamplama matrisi", "STAMPING");
    add(words, "Stamping Cycle", "Цикл штамповки", "Ştamplama tsikli", "STAMPING");
    add(words, "Stamping Force", "Усилие штамповки", "Ştamplama qüvvəsi", "STAMPING");
    add(words, "Stamping Speed", "Скорость штамповки", "Ştamplama sürəti", "STAMPING");
    add(words, "Stamping Defect", "Дефект штамповки", "Ştamplama qüsuru", "STAMPING");
    add(words, "Punch", "Пуансон", "Puanson", "STAMPING");
    add(words, "Punch Clearance", "Зазор пуансона", "Puanson boşluğu", "STAMPING");
    add(words, "Punch Holder", "Держатель пуансона", "Puanson tutacağı", "STAMPING");
    add(words, "Punch Life", "Срок службы пуансона", "Puansonun xidmət müddəti", "STAMPING");
    add(words, "Die", "Матрица", "Matris", "STAMPING");
    add(words, "Die Clearance", "Зазор матрицы", "Matris boşluğu", "STAMPING");
    add(words, "Die Holder", "Держатель матрицы", "Matris tutacağı", "STAMPING");
    add(words, "Die Inspection", "Проверка матрицы", "Matrisin yoxlanılması", "STAMPING");
    add(words, "Die Life", "Срок службы матрицы", "Matrisin xidmət müddəti", "STAMPING");
    add(words, "Die Maintenance", "Обслуживание матрицы", "Matrisə texniki xidmət", "STAMPING");
    add(words, "Die Repair", "Ремонт матрицы", "Matrisin təmiri", "STAMPING");
    add(words, "Die Set", "Комплект штампа", "Ştamp dəsti", "STAMPING");
    add(words, "Blank", "Заготовка", "Pəstah", "STAMPING");
    add(words, "Blank Holder", "Прижим заготовки", "Pəstah sıxıcısı", "STAMPING");
    add(words, "Blank Thickness", "Толщина заготовки", "Pəstah qalınlığı", "STAMPING");
    add(words, "Bending Operation", "Операция гибки", "Bükmə əməliyyatı", "STAMPING");
    add(words, "Bending Force", "Усилие гибки", "Bükmə qüvvəsi", "STAMPING");
    add(words, "Bending Angle", "Угол гибки", "Bükmə bucağı", "STAMPING");
    add(words, "Bending Radius", "Радиус гибки", "Bükmə radiusu", "STAMPING");
    add(words, "Deep Drawing", "Глубокая вытяжка", "Dərin dartma", "STAMPING");
    add(words, "Piercing", "Пробивка отверстий", "Deşmə", "STAMPING");
    add(words, "Piercing Tool", "Инструмент для пробивки", "Deşmə aləti", "STAMPING");
    add(words, "Part Ejection", "Выброс детали", "Detalın çıxarılması", "STAMPING");
    add(words, "Ejection Pin", "Выталкивающий штифт", "Çıxarıcı ştift", "STAMPING");
    add(words, "Ejector Plate", "Выталкивающая плита", "Çıxarıcı lövhə", "STAMPING");
    add(words, "Finished Part", "Готовая деталь", "Hazır detal", "STAMPING");

    // ================= FURNACE =================

    add(words, "Furnace", "Печь", "Soba", "FURNACE");
    add(words, "Heating Element", "Нагревательный элемент", "Qızdırıcı element", "FURNACE");
    add(words, "Heating", "Нагрев", "Qızdırma", "FURNACE");
    add(words, "Temperature", "Температура", "Temperatur", "FURNACE");
    add(words, "Heat Treatment", "Термическая обработка", "İstilik emalı", "FURNACE");
    add(words, "Overheat", "Перегрев", "Həddindən artıq qızma", "FURNACE");
    add(words, "Quenching", "Закалка", "Sərtləşdirmə", "FURNACE");
    add(words, "Heat Detector", "Тепловой датчик", "İstilik detektoru", "FURNACE");

    // ================= FIRE =================

    add(words, "Fire Extinguisher", "Огнетушитель", "Yanğınsöndürən", "FIRE");
    add(words, "Water Extinguisher", "Водный огнетушитель", "Su ilə yanğınsöndürən", "FIRE");
    add(words, "Foam Extinguisher", "Пенный огнетушитель", "Köpüklü yanğınsöndürən", "FIRE");
    add(words, "Dry Powder Extinguisher", "Порошковый огнетушитель", "Tozlu yanğınsöndürən", "FIRE");
    add(words, "Carbon Dioxide Extinguisher", "Углекислотный огнетушитель", "Karbon qazlı yanğınsöndürən", "FIRE");
    add(words, "CO2 Extinguisher", "CO2-огнетушитель", "CO2 yanğınsöndürən", "FIRE");
    add(words, "Fire Alarm", "Пожарная сигнализация", "Yanğın siqnalizasiyası", "FIRE");
    add(words, "Fire Detector", "Пожарный датчик", "Yanğın detektoru", "FIRE");
    add(words, "Smoke Detector", "Дымовой датчик", "Tüstü detektoru", "FIRE");
    add(words, "Fire Hose", "Пожарный шланг", "Yanğın şlanqı", "FIRE");
    add(words, "Fire Hydrant", "Пожарный гидрант", "Yanğın hidrantı", "FIRE");
    add(words, "Fire Safety", "Пожарная безопасность", "Yanğın təhlükəsizliyi", "FIRE");
    add(words, "Fire Prevention", "Предотвращение пожара", "Yanğının qarşısının alınması", "FIRE");
    add(words, "Fire Drill", "Пожарная тренировка", "Yanğın təlimi", "FIRE");
    add(words, "Muster Point", "Место сбора", "Toplanış yeri", "FIRE");
    add(words, "Hot Work Permit", "Разрешение на огневые работы", "Qaynar iş icazəsi", "FIRE");
    add(words, "Flammable Liquid", "Легковоспламеняющаяся жидкость", "Tez alışan maye", "FIRE");
    add(words, "Flammable Gas", "Легковоспламеняющийся газ", "Tez alışan qaz", "FIRE");
    add(words, "Ignition Source", "Источник воспламенения", "Alışma mənbəyi", "FIRE");
    add(words, "Open Flame", "Открытое пламя", "Açıq alov", "FIRE");
    add(words, "Spark", "Искра", "Qığılcım", "FIRE");
    add(words, "Fire Triangle", "Треугольник огня", "Yanğın üçbucağı", "FIRE");
    add(words, "Fuel", "Топливо", "Yanacaq", "FIRE");
    add(words, "Oxygen", "Кислород", "Oksigen", "FIRE");
    add(words, "Smoke", "Дым", "Tüstü", "FIRE");
    add(words, "Flame", "Пламя", "Alov", "FIRE");

    // ================= SAFETY =================

    add(words, "Safety", "Безопасность", "Təhlükəsizlik", "SAFETY");
    add(words, "Safety Glasses", "Защитные очки", "Qoruyucu eynək", "SAFETY");
    add(words, "Safety Shoes", "Защитная обувь", "Qoruyucu ayaqqabı", "SAFETY");
    add(words, "Safety Rule", "Правило безопасности", "Təhlükəsizlik qaydası", "SAFETY");
    add(words, "Safety Training", "Обучение по безопасности", "Təhlükəsizlik təlimi", "SAFETY");
    add(words, "PPE", "Средства индивидуальной защиты", "Fərdi mühafizə vasitələri", "SAFETY");
    add(words, "Gloves", "Перчатки", "Əlcəklər", "SAFETY");
    add(words, "Helmet", "Каска", "Dəbilqə", "SAFETY");
    add(words, "Hazard", "Опасность", "Təhlükə", "SAFETY");
    add(words, "Risk", "Риск", "Risk", "SAFETY");
    add(words, "Emergency", "Аварийная ситуация", "Fövqəladə vəziyyət", "SAFETY");
    add(words, "Emergency Exit", "Аварийный выход", "Fövqəladə çıxış", "SAFETY");
    add(words, "Emergency Stop", "Аварийная остановка", "Fövqəladə dayandırma", "SAFETY");
    add(words, "Emergency Evacuation", "Аварийная эвакуация", "Fövqəladə təxliyə", "SAFETY");
    add(words, "Emergency Route", "Аварийный маршрут", "Fövqəladə marşrut", "SAFETY");
    add(words, "Grounding", "Заземление", "Torpaqlama", "SAFETY");
    add(words, "Insulation", "Изоляция", "İzolyasiya", "SAFETY");

    // ================= WELDING =================

    add(words, "Welding", "Сварка", "Qaynaq", "WELDING");
    add(words, "Welder", "Сварщик", "Qaynaqçı", "WELDING");
    add(words, "Welding Machine", "Сварочный аппарат", "Qaynaq aparatı", "WELDING");
    add(words, "Welding Cable", "Сварочный кабель", "Qaynaq kabeli", "WELDING");
    add(words, "Welding Torch", "Сварочная горелка", "Qaynaq məşəli", "WELDING");
    add(words, "Electrode", "Электрод", "Elektrod", "WELDING");
    add(words, "Wire", "Провод / сварочная проволока", "Naqil", "WELDING");
    add(words, "Welding Joint", "Сварное соединение", "Qaynaq birləşməsi", "WELDING");
    add(words, "Welding Defect", "Дефект сварки", "Qaynaq qüsuru", "WELDING");

    // ================= GALVANIC =================

    add(words, "Plating", "Нанесение покрытия", "Kaplama", "GALVANIC");
    add(words, "Metal Plating", "Покрытие металла", "Metal kaplama", "GALVANIC");
    add(words, "Surface Coating", "Поверхностное покрытие", "Səth örtüyü", "GALVANIC");
    add(words, "Protective Coating", "Защитное покрытие", "Qoruyucu örtük", "GALVANIC");
    add(words, "Zinc Plating", "Цинкование", "Sinkləmə", "GALVANIC");
    add(words, "Nickel Plating", "Никелирование", "Nikel kaplama", "GALVANIC");
    add(words, "Chrome Plating", "Хромирование", "Xromlama", "GALVANIC");
    add(words, "Copper Plating", "Меднение", "Mis kaplama", "GALVANIC");
    add(words, "Anodizing", "Анодирование", "Anodlaşdırma", "GALVANIC");
    add(words, "Anode", "Анод", "Anod", "GALVANIC");
    add(words, "Cathode", "Катод", "Katod", "GALVANIC");
    add(words, "Electrolyte", "Электролит", "Elektrolit", "GALVANIC");
    add(words, "Electric Current", "Электрический ток", "Elektrik cərəyanı", "GALVANIC");
    add(words, "Current Density", "Плотность тока", "Cərəyan sıxlığı", "GALVANIC");
    add(words, "Bath Temperature", "Температура ванны", "Vannanın temperaturu", "GALVANIC");
    add(words, "Bath Level", "Уровень раствора в ванне", "Vannada məhlul səviyyəsi", "GALVANIC");
    add(words, "Bath Concentration", "Концентрация раствора", "Məhlul konsentrasiyası", "GALVANIC");
    add(words, "pH Value", "Значение pH", "pH dəyəri", "GALVANIC");
    add(words, "Rinse Tank", "Промывочная ванна", "Yuma vannası", "GALVANIC");
    add(words, "Rinsing", "Промывка", "Yuma", "GALVANIC");
    add(words, "Degreasing", "Обезжиривание", "Yağdan təmizləmə", "GALVANIC");
    add(words, "Acid Cleaning", "Кислотная очистка", "Turşu ilə təmizləmə", "GALVANIC");
    add(words, "Alkaline Cleaning", "Щелочная очистка", "Qələvi ilə təmizləmə", "GALVANIC");
    add(words, "Passivation", "Пассивирование", "Passivləşdirmə", "GALVANIC");
    add(words, "Coating Thickness", "Толщина покрытия", "Örtük qalınlığı", "GALVANIC");
    add(words, "Coating Adhesion", "Адгезия покрытия", "Örtüyün yapışması", "GALVANIC");
    add(words, "Coating Defect", "Дефект покрытия", "Örtük qüsuru", "GALVANIC");
    add(words, "Peeling", "Отслаивание", "Soyulma", "GALVANIC");
    add(words, "Blistering", "Вспучивание покрытия", "Örtüyün qabarması", "GALVANIC");
    add(words, "Contamination", "Загрязнение", "Çirklənmə", "GALVANIC");
    add(words, "Ventilation", "Вентиляция", "Ventilyasiya", "GALVANIC");
    add(words, "Chemical Spill", "Разлив химического вещества", "Kimyəvi maddə dağılması", "GALVANIC");
    add(words, "Chemical Waste", "Химические отходы", "Kimyəvi tullantı", "GALVANIC");
    add(words, "Emergency Shower", "Аварийный душ", "Fövqəladə duş", "GALVANIC");
    add(words, "Eye Wash Station", "Станция промывания глаз", "Göz yuma stansiyası", "GALVANIC");

    // ================= MAINTENANCE =================

    add(words, "Maintenance", "Техническое обслуживание", "Texniki xidmət", "MAINTENANCE");
    add(words, "Repair", "Ремонт", "Təmir", "MAINTENANCE");
    add(words, "Lubricant", "Смазка", "Sürtkü", "MAINTENANCE");
    add(words, "Lubrication", "Смазывание", "Yağlama", "MAINTENANCE");
    add(words, "Oil", "Масло", "Yağ", "MAINTENANCE");
    add(words, "Oil Filter", "Масляный фильтр", "Yağ filtri", "MAINTENANCE");
    add(words, "Filter", "Фильтр", "Filtr", "MAINTENANCE");
    add(words, "Replacement Part", "Запасная деталь", "Ehtiyat detal", "MAINTENANCE");
    add(words, "Wear", "Износ", "Aşınma", "MAINTENANCE");
    add(words, "Vibration", "Вибрация", "Vibrasiya", "MAINTENANCE");
    add(words, "Noise", "Шум", "Səs-küy", "MAINTENANCE");
    add(words, "Overload", "Перегрузка", "Həddindən artıq yüklənmə", "MAINTENANCE");

    // ================= QUALITY =================

    add(words, "Quality", "Качество", "Keyfiyyət", "QUALITY");
    add(words, "Quality Check", "Проверка качества", "Keyfiyyət yoxlaması", "QUALITY");
    add(words, "Quality Control", "Контроль качества", "Keyfiyyətə nəzarət", "QUALITY");
    add(words, "Quality Inspector", "Инспектор качества", "Keyfiyyət müfəttişi", "QUALITY");
    add(words, "Quality Standard", "Стандарт качества", "Keyfiyyət standartı", "QUALITY");
    add(words, "Defect", "Дефект", "Qüsur", "QUALITY");
    add(words, "Rejected Part", "Бракованная деталь", "Rədd edilmiş detal", "QUALITY");
    add(words, "Scrap", "Отходы / брак", "Tullantı / qüsurlu məhsul", "QUALITY");
    add(words, "Scrap Rate", "Процент отходов", "Tullantı faizi", "QUALITY");
    add(words, "Inspection", "Проверка", "Yoxlama", "QUALITY");
    add(words, "Inspection Report", "Отчёт о проверке", "Yoxlama hesabatı", "QUALITY");
    add(words, "Accuracy", "Точность", "Dəqiqlik", "QUALITY");
    add(words, "Surface Finish", "Качество поверхности", "Səth keyfiyyəti", "QUALITY");
    add(words, "Crack", "Трещина", "Çat", "QUALITY");
    add(words, "Burr", "Заусенец", "Qrat", "QUALITY");
    add(words, "Burr Height", "Высота заусенца", "Qrat hündürlüyü", "QUALITY");

    // ================= MEASUREMENT =================

    add(words, "Measure", "Измерять", "Ölçmək", "MEASUREMENT");
    add(words, "Measurement", "Измерение", "Ölçmə", "MEASUREMENT");
    add(words, "Caliper", "Штангенциркуль", "Ştangensirkul", "MEASUREMENT");
    add(words, "Vernier Caliper", "Штангенциркуль", "Ştangensirkul", "MEASUREMENT");
    add(words, "Micrometer", "Микрометр", "Mikrometr", "MEASUREMENT");
    add(words, "Gauge", "Измерительный прибор", "Ölçü cihazı", "MEASUREMENT");
    add(words, "Depth Gauge", "Глубиномер", "Dərinlik ölçən", "MEASUREMENT");
    add(words, "Pressure Gauge", "Манометр", "Təzyiq ölçən", "MEASUREMENT");
    add(words, "Diameter", "Диаметр", "Diametr", "MEASUREMENT");
    add(words, "Nominal Diameter", "Номинальный диаметр", "Nominal diametr", "MEASUREMENT");
    add(words, "Outside Diameter", "Наружный диаметр", "Xarici diametr", "MEASUREMENT");
    add(words, "Length", "Длина", "Uzunluq", "MEASUREMENT");
    add(words, "Width", "Ширина", "En", "MEASUREMENT");
    add(words, "Thickness", "Толщина", "Qalınlıq", "MEASUREMENT");
    add(words, "Depth", "Глубина", "Dərinlik", "MEASUREMENT");
    add(words, "Tolerance", "Допуск", "Tolerans", "MEASUREMENT");

    // ================= TOOLS =================

    add(words, "Tool", "Инструмент", "Alət", "TOOLS");
    add(words, "Cutting Tool", "Режущий инструмент", "Kəsici alət", "TOOLS");
    add(words, "Cutter", "Резец / фреза", "Kəsici", "TOOLS");
    add(words, "Milling Cutter", "Фреза", "Frez", "TOOLS");
    add(words, "Face Mill", "Торцевая фреза", "Üz frezi", "TOOLS");
    add(words, "Drill", "Сверло", "Burğu", "TOOLS");
    add(words, "Drill Bit", "Сверло", "Burğu ucu", "TOOLS");
    add(words, "Reamer", "Развёртка", "Rayber", "TOOLS");
    add(words, "Tap", "Метчик", "Metçik", "TOOLS");
    add(words, "Tap Wrench", "Вороток для метчика", "Metçik tutacağı", "TOOLS");
    add(words, "Hammer", "Молоток", "Çəkic", "TOOLS");
    add(words, "Chisel", "Зубило", "Kəski", "TOOLS");
    add(words, "Pliers", "Плоскогубцы", "Kəlbətin", "TOOLS");
    add(words, "Wrench", "Гаечный ключ", "Açar", "TOOLS");
    add(words, "Allen Key", "Шестигранный ключ", "Altıbucaqlı açar", "TOOLS");
    add(words, "Combination Wrench", "Комбинированный ключ", "Kombinə edilmiş açar", "TOOLS");
    add(words, "Socket Wrench", "Торцевой ключ", "Başlıqlı açar", "TOOLS");
    add(words, "Torque Wrench", "Динамометрический ключ", "Tork açarı", "TOOLS");
    add(words, "Impact Wrench", "Ударный гайковёрт", "Zərbəli qayka açarı", "TOOLS");
    add(words, "Vice", "Тиски", "Məngənə", "TOOLS");
    add(words, "Jig", "Кондуктор", "Konduktor", "TOOLS");
    add(words, "Fixture", "Приспособление", "Qurğu", "TOOLS");

    return words;
}

}