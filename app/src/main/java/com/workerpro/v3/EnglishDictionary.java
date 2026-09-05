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
        add(words, "Corner Radius Cutter", "Фреза с радиусом угла", "K
    return words;
}

}