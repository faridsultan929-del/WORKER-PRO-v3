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

        // =====================================================
        // WORK
        // =====================================================

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

        // =====================================================
        // MACHINE
        // =====================================================

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

        // =====================================================
        // CNC
        // =====================================================

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

        // =====================================================
        // CNC EXTENDED
        // =====================================================

        add(words, "G-Code", "G-код", "G-kod", "CNC");
        add(words, "M-Code", "M-код", "M-kod", "CNC");
        add(words, "Tool Offset", "Коррекция инструмента", "Alət korreksiyası", "CNC");
        add(words, "Work Offset", "Рабочая коррекция", "İş korreksiyası", "CNC");
        add(words, "Tool Length Offset", "Коррекция длины инструмента", "Alət uzunluğu korreksiyası", "CNC");
        add(words, "Tool Radius Compensation", "Коррекция радиуса инструмента", "Alət radiusunun kompensasiyası", "CNC");
        add(words, "Cutter Compensation", "Коррекция фрезы", "Freze kompensasiyası", "CNC");
        add(words, "Tool Life", "Срок службы инструмента", "Alətin xidmət müddəti", "CNC");
        add(words, "Tool Wear", "Износ инструмента", "Alətin aşınması", "CNC");
        add(words, "Tool Wear Compensation", "Компенсация износа инструмента", "Alət aşınmasının kompensasiyası", "CNC");
        add(words, "Tool Presetter", "Устройство настройки инструмента", "Alət sazlama cihazı", "CNC");
        add(words, "Tool Setter", "Настройщик инструмента", "Alət sazlayıcısı", "CNC");
        add(words, "Tool Probe", "Щуп инструмента", "Alət probu", "CNC");
        add(words, "Workpiece Probe", "Щуп детали", "Detal probu", "CNC");
        add(words, "Touch Probe", "Контактный щуп", "Toxunma probu", "CNC");
        add(words, "Probe Calibration", "Калибровка щупа", "Probun kalibrlənməsi", "CNC");
        add(words, "Machine Origin", "Начало координат станка", "Dəzgah koordinat başlanğıcı", "CNC");
        add(words, "Work Origin", "Начало координат детали", "Detal koordinat başlanğıcı", "CNC");
        add(words, "Absolute Position", "Абсолютная позиция", "Mütləq mövqe", "CNC");
        add(words, "Incremental Position", "Относительная позиция", "Nisbi mövqe", "CNC");
        add(words, "Absolute Programming", "Абсолютное программирование", "Mütləq proqramlaşdırma", "CNC");
        add(words, "Incremental Programming", "Относительное программирование", "Nisbi proqramlaşdırma", "CNC");
        add(words, "Positioning", "Позиционирование", "Mövqeləndirmə", "CNC");
        add(words, "Interpolation", "Интерполяция", "İnterpolyasiya", "CNC");
        add(words, "Linear Interpolation", "Линейная интерполяция", "Xətti interpolyasiya", "CNC");
        add(words, "Circular Interpolation", "Круговая интерполяция", "Dairəvi interpolyasiya", "CNC");
        add(words, "Clockwise", "По часовой стрелке", "Saat əqrəbi istiqamətində", "CNC");
        add(words, "Counterclockwise", "Против часовой стрелки", "Saat əqrəbinin əksinə", "CNC");
        add(words, "Spindle Direction", "Направление вращения шпинделя", "Şpindelin fırlanma istiqaməti", "CNC");
        add(words, "Spindle Start", "Запуск шпинделя", "Şpindelin işə salınması", "CNC");
        add(words, "Spindle Stop", "Остановка шпинделя", "Şpindelin dayandırılması", "CNC");
        add(words, "Spindle Speed Override", "Коррекция скорости шпинделя", "Şpindel sürətinin korreksiyası", "CNC");
        add(words, "Feed Override", "Коррекция подачи", "Veriş korreksiyası", "CNC");
        add(words, "Rapid Override", "Коррекция быстрого хода", "Sürətli gediş korreksiyası", "CNC");
        add(words, "Feed Hold Button", "Кнопка остановки подачи", "Verişi saxlama düyməsi", "CNC");
        add(words, "Cycle Start Button", "Кнопка запуска цикла", "Tsikl başlatma düyməsi", "CNC");
        add(words, "Reset Button", "Кнопка сброса", "Sıfırlama düyməsi", "CNC");
        add(words, "Emergency Stop Button", "Кнопка аварийной остановки", "Fövqəladə dayandırma düyməsi", "CNC");
        add(words, "Jog Mode", "Режим ручного перемещения", "Əl ilə hərəkət rejimi", "CNC");
        add(words, "Jog Wheel", "Маховик ручного перемещения", "Əl ilə hərəkət çarxı", "CNC");
        add(words, "Manual Mode", "Ручной режим", "Əl rejimi", "CNC");
        add(words, "Automatic Mode", "Автоматический режим", "Avtomatik rejim", "CNC");
        add(words, "Edit Mode", "Режим редактирования", "Redaktə rejimi", "CNC");
        add(words, "Memory Mode", "Режим памяти", "Yaddaş rejimi", "CNC");
        add(words, "Machine Lock", "Блокировка станка", "Dəzgah kilidi", "CNC");
        add(words, "Program Lock", "Блокировка программы", "Proqram kilidi", "CNC");
        add(words, "Parameter", "Параметр", "Parametr", "CNC");
        add(words, "Parameter Setting", "Настройка параметров", "Parametrlərin sazlanması", "CNC");
        add(words, "Machine Parameter", "Параметр станка", "Dəzgah parametri", "CNC");
        add(words, "Offset Setting", "Настройка коррекции", "Korreksiyanın sazlanması", "CNC");
        add(words, "Program Editing", "Редактирование программы", "Proqramın redaktəsi", "CNC");
        add(words, "Program Backup", "Резервная копия программы", "Proqramın ehtiyat nüsxəsi", "CNC");
        add(words, "Program Transfer", "Передача программы", "Proqramın ötürülməsi", "CNC");
        add(words, "USB Transfer", "Передача через USB", "USB vasitəsilə ötürmə", "CNC");
        add(words, "Memory Card", "Карта памяти", "Yaddaş kartı", "CNC");
        add(words, "Program File", "Файл программы", "Proqram faylı", "CNC");
        add(words, "Program Name", "Имя программы", "Proqram adı", "CNC");
        add(words, "Program Comment", "Комментарий программы", "Proqram şərhi", "CNC");
        add(words, "Sequence Number", "Номер последовательности", "Ardıcıllıq nömrəsi", "CNC");
        add(words, "Block Number", "Номер блока", "Blok nömrəsi", "CNC");
        add(words, "Block Skip", "Пропуск блока", "Blokun buraxılması", "CNC");
        add(words, "Optional Stop", "Опциональная остановка", "Seçimli dayandırma", "CNC");
        add(words, "Machine Cycle", "Цикл станка", "Dəzgah tsikli", "CNC");
        add(words, "Fixed Cycle", "Фиксированный цикл", "Sabit tsikl", "CNC");
        add(words, "Drilling Cycle", "Цикл сверления", "Burğulama tsikli", "CNC");
        add(words, "Tapping Cycle", "Цикл нарезания резьбы", "Yiv açma tsikli", "CNC");
        add(words, "Boring Cycle", "Цикл расточки", "Burma tsikli", "CNC");
        add(words, "Peck Drilling", "Прерывистое сверление", "Fasiləli burğulama", "CNC");
        add(words, "Thread Milling", "Фрезерование резьбы", "Yivin frezlənməsi", "CNC");
        add(words, "Thread Cutting", "Нарезание резьбы", "Yiv açma", "CNC");
        add(words, "Tapping", "Нарезание внутренней резьбы", "Daxili yiv açma", "CNC");
        add(words, "Boring", "Расточка", "Burma", "CNC");
        add(words, "Reaming", "Развёртывание", "Rayberləmə", "CNC");
        add(words, "Drilling", "Сверление", "Burğulama", "CNC");
        add(words, "Milling", "Фрезерование", "Frezləmə", "CNC");
        add(words, "Turning", "Токарная обработка", "Torna emalı", "CNC");
        add(words, "Facing", "Торцевание", "Üz emalı", "CNC");
        add(words, "Grooving", "Прорезание канавки", "Yiv açma", "CNC");
        add(words, "Threading", "Нарезание резьбы", "Yiv açma", "CNC");
        add(words, "Chamfering", "Снятие фаски", "Faska açma", "CNC");
        add(words, "Contour Milling", "Контурное фрезерование", "Kontur frezləmə", "CNC");
        add(words, "Pocket Milling", "Фрезерование кармана", "Cib frezləməsi", "CNC");
        add(words, "Slot Milling", "Фрезерование паза", "Yiv frezləməsi", "CNC");
        add(words, "Step Milling", "Ступенчатое фрезерование", "Pilləli frezləmə", "CNC");
        add(words, "Roughing", "Черновая обработка", "Qaba emal", "CNC");
        add(words, "Finishing", "Чистовая обработка", "Təmiz emal", "CNC");
        add(words, "Semi-Finishing", "Получистовая обработка", "Yarımçıq təmiz emal", "CNC");
        add(words, "Surface Milling", "Обработка поверхности фрезой", "Səthin frezlənməsi", "CNC");
        add(words, "Cutting Tool Wear", "Износ режущего инструмента", "Kəsici alətin aşınması", "CNC");
        add(words, "Cutting Edge", "Режущая кромка", "Kəsici kənar", "CNC");
        add(words, "Insert", "Сменная пластина", "Dəyişən lövhə", "CNC");
        add(words, "Carbide Insert", "Твердосплавная пластина", "Sərt ərintili lövhə", "CNC");
        add(words, "Indexable Insert", "Сменная режущая пластина", "Dəyişən kəsici lövhə", "CNC");
        add(words, "End Mill", "Концевая фреза", "Son frez", "CNC");
        add(words, "Ball Nose Cutter", "Сферическая фреза", "Sferik frez", "CNC");
        add(words, "Corner Radius Cutter", "Фреза с радиусом угла", "Künc radiuslu frez", "CNC");
        add(words, "Face Mill Cutter", "Торцевая фреза", "Üz frezi", "CNC");
        add(words, "Slot Cutter", "Фреза для пазов", "Yiv frezi", "CNC");
        add(words, "Drill Diameter", "Диаметр сверла", "Burğunun diametri", "CNC");
        add(words, "Hole Diameter", "Диаметр отверстия", "Deşiyin diametri", "CNC");
        add(words, "Hole Depth", "Глубина отверстия", "Deşiyin dərinliyi", "CNC");
        add(words, "Hole Position", "Положение отверстия", "Deşiyin mövqeyi", "CNC");
        add(words, "Center Drill", "Центровочное сверло", "Mərkəz burğusu", "CNC");
        add(words, "Countersink", "Зенкер", "Zenker", "CNC");
        add(words, "Counterbore", "Цековка", "Səth genişləndirməsi", "CNC");
        add(words, "Workpiece", "Заготовка / деталь", "Pəstah / detal", "CNC");
        add(words, "Workholding", "Закрепление детали", "Detalın bərkidilməsi", "CNC");
        add(words, "Clamping", "Зажим", "Sıxma", "CNC");
        add(words, "Clamping Force", "Сила зажима", "Sıxma qüvvəsi", "CNC");
        add(words, "Chuck", "Патрон", "Patron", "CNC");
        add(words, "Three-Jaw Chuck", "Трёхкулачковый патрон", "Üççənəli patron", "CNC");
        add(words, "Four-Jaw Chuck", "Четырёхкулачковый патрон", "Dördçənəli patron", "CNC");
        add(words, "Collet", "Цанга", "Sıxac patronu", "CNC");
        add(words, "Collet Chuck", "Цанговый патрон", "Sıxac patronu", "CNC");
        add(words, "Soft Jaw", "Мягкие кулачки", "Yumşaq çənələr", "CNC");
        add(words, "Hard Jaw", "Жёсткие кулачки", "Sərt çənələr", "CNC");
        add(words, "Fixture Plate", "Монтажная плита", "Bərkitmə lövhəsi", "CNC");
        add(words, "Workholding Fixture", "Приспособление для крепления детали", "Detal bərkitmə qurğusu", "CNC");
        add(words, "Cutting Fluid", "СОЖ / режущая жидкость", "Kəsici maye", "CNC");
        add(words, "Coolant", "Охлаждающая жидкость", "Soyuducu maye", "CNC");
        add(words, "Coolant Pressure", "Давление охлаждающей жидкости", "Soyuducu maye təzyiqi", "CNC");
        add(words, "Coolant Flow", "Поток охлаждающей жидкости", "Soyuducu maye axını", "CNC");
        add(words, "Through-Spindle Coolant", "Подача СОЖ через шпиндель", "Şpindeldən soyuducu maye verilişi", "CNC");
        add(words, "Air Blast", "Воздушное охлаждение", "Hava üfürülməsi", "CNC");
        add(words, "Chip", "Стружка", "Yonqar", "CNC");
        add(words, "Chip Removal", "Удаление стружки", "Yonqarın çıxarılması", "CNC");
        add(words, "Chip Conveyor", "Конвейер для стружки", "Yonqar konveyeri", "CNC");
        add(words, "Chip Load", "Нагрузка на зуб", "Dişə düşən yük", "CNC");
        add(words, "Chip Thickness", "Толщина стружки", "Yonqar qalınlığı", "CNC");
        add(words, "Cutting Force", "Сила резания", "Kəsmə qüvvəsi", "CNC");
        add(words, "Cutting Torque", "Крутящий момент резания", "Kəsmə fırlanma momenti", "CNC");
        add(words, "Cutting Temperature", "Температура резания", "Kəsmə temperaturu", "CNC");
        add(words, "Surface Speed", "Скорость поверхности", "Səth sürəti", "CNC");
        add(words, "Feed Per Tooth", "Подача на зуб", "Diş başına veriş", "CNC");
        add(words, "Feed Per Revolution", "Подача на оборот", "Dövr başına veriş", "CNC");
        add(words, "Depth of Cut", "Глубина резания", "Kəsmə dərinliyi", "CNC");
        add(words, "Step Over", "Шаг поперечной подачи", "Eninə veriş addımı", "CNC");
        add(words, "Step Down", "Шаг по глубине", "Dərinlik addımı", "CNC");
        add(words, "Material Removal Rate", "Скорость съёма материала", "Materialın çıxarılma sürəti", "CNC");
        add(words, "Machining Time", "Время обработки", "Emal vaxtı", "CNC");
        add(words, "Machine Accuracy", "Точность станка", "Dəzgah dəqiqliyi", "CNC");
        add(words, "Machine Repeatability", "Повторяемость станка", "Dəzgahın təkrarlanma qabiliyyəti", "CNC");
        add(words, "Backlash", "Люфт", "Boşluq", "CNC");
        add(words, "Axis Alignment", "Выравнивание осей", "Oxların hizalanması", "CNC");
        add(words, "Axis Calibration", "Калибровка осей", "Oxların kalibrlənməsi", "CNC");
        add(words, "Servo Motor", "Сервомотор", "Servo mühərrik", "CNC");
        add(words, "Servo Drive", "Сервопривод", "Servo ötürücü", "CNC");
        add(words, "Encoder", "Энкодер", "Enkoder", "CNC");
        add(words, "Linear Scale", "Линейная шкала", "Xətti şkala", "CNC");
        add(words, "Ball Screw", "Шарико-винтовая передача", "Kürəcikli vint ötürməsi", "CNC");
        add(words, "Linear Guide", "Линейная направляющая", "Xətti istiqamətləndirici", "CNC");
        add(words, "Guide Rail", "Направляющая рейка", "İstiqamətləndirici rels", "CNC");
        add(words, "Axis Limit", "Ограничение оси", "Ox limiti", "CNC");
        add(words, "Overtravel", "Выход за пределы хода", "Hərəkət həddinin aşılması", "CNC");
        add(words, "Servo Alarm", "Авария сервопривода", "Servo siqnalı", "CNC");
        add(words, "Spindle Alarm", "Авария шпинделя", "Şpindel siqnalı", "CNC");
        add(words, "Overload Alarm", "Сигнал перегрузки", "Həddindən artıq yüklənmə siqnalı", "CNC");
        add(words, "Communication Error", "Ошибка связи", "Rabitə xətası", "CNC");
        add(words, "Low Oil Alarm", "Сигнал низкого уровня масла", "Aşağı yağ səviyyəsi siqnalı", "CNC");
        add(words, "Coolant Alarm", "Авария системы охлаждения", "Soyutma sistemi siqnalı", "CNC");

        // =====================================================
        // STAMPING
        // =====================================================

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

        // =====================================================
        // FURNACE
        // =====================================================

        add(words, "Furnace", "Печь", "Soba", "FURNACE");
        add(words, "Heating Element", "Нагревательный элемент", "Qızdırıcı element", "FURNACE");
        add(words, "Heating", "Нагрев", "Qızdırma", "FURNACE");
        add(words, "Temperature", "Температура", "Temperatur", "FURNACE");
        add(words, "Heat Treatment", "Термическая обработка", "İstilik emalı", "FURNACE");
        add(words, "Overheat", "Перегрев", "Həddindən artıq qızma", "FURNACE");
        add(words, "Quenching", "Закалка", "Sərtləşdirmə", "FURNACE");
        add(words, "Heat Detector", "Тепловой датчик", "İstilik detektoru", "FURNACE");

        // =====================================================
        // FIRE
        // =====================================================

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

        // =====================================================
        // SAFETY
        // =====================================================

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

        // =====================================================
        // WELDING
        // =====================================================

        add(words, "Welding", "Сварка", "Qaynaq", "WELDING");
        add(words, "Welder", "Сварщик", "Qaynaqçı", "WELDING");
        add(words, "Welding Machine", "Сварочный аппарат", "Qaynaq aparatı", "WELDING");
        add(words, "Welding Cable", "Сварочный кабель", "Qaynaq kabeli", "WELDING");
        add(words, "Welding Torch", "Сварочная горелка", "Qaynaq məşəli", "WELDING");
        add(words, "Electrode", "Электрод", "Elektrod", "WELDING");
        add(words, "Wire", "Провод / сварочная проволока", "Naqil", "WELDING");
        add(words, "Welding Joint", "Сварное соединение", "Qaynaq birləşməsi", "WELDING");
        add(words, "Welding Defect", "Дефект сварки", "Qaynaq qüsuru", "WELDING");

        // =====================================================
        // GALVANIC
        // =====================================================

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

        // =====================================================
        // MAINTENANCE
        // =====================================================

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

        // =====================================================
        // QUALITY
        // =====================================================

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

        // =====================================================
        // MEASUREMENT
        // =====================================================

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

        // =====================================================
        // TOOLS
        // =====================================================

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