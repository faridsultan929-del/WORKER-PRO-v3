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
        words.add(new Word("Accident", "Несчастный случай", "Qəza"));
        words.add(new Word("Accident Report", "Отчёт о несчастном случае", "Qəza hesabatı"));
        words.add(new Word("Acceptance Criteria", "Критерии приёмки", "Qəbul meyarları"));
        words.add(new Word("Acceptance Test", "Приёмочное испытание", "Qəbul testi"));
        words.add(new Word("Adjust", "Регулировать", "Tənzimləmək"));
        words.add(new Word("Adjustment", "Регулировка", "Tənzimləmə"));
        words.add(new Word("Adjustable Wrench", "Разводной ключ", "Tənzimlənən açar"));
        words.add(new Word("Air Compressor", "Воздушный компрессор", "Hava kompressoru"));
        words.add(new Word("Air Filter", "Воздушный фильтр", "Hava filtri"));
        words.add(new Word("Air Flow", "Поток воздуха", "Hava axını"));
        words.add(new Word("Air Hose", "Воздушный шланг", "Hava şlanqı"));
        words.add(new Word("Air Line", "Воздушная линия", "Hava xətti"));
        words.add(new Word("Air Pressure", "Давление воздуха", "Hava təzyiqi"));
        words.add(new Word("Air Regulator", "Регулятор воздуха", "Hava tənzimləyicisi"));
        words.add(new Word("Air Valve", "Воздушный клапан", "Hava klapanı"));
        words.add(new Word("Alarm", "Сигнализация", "Siqnal"));
        words.add(new Word("Alarm Code", "Код аварии", "Siqnal kodu"));
        words.add(new Word("Alignment", "Выравнивание", "Mərkəzləmə"));
        words.add(new Word("Alignment Check", "Проверка выравнивания", "Mərkəzləmə yoxlaması"));
        words.add(new Word("Allen Key", "Шестигранный ключ", "Altıbucaqlı açar"));
        words.add(new Word("Alloy", "Сплав", "Ərinti"));
        words.add(new Word("Aluminum", "Алюминий", "Alüminium"));
        words.add(new Word("Aluminum Alloy", "Алюминиевый сплав", "Alüminium ərintisi"));
        words.add(new Word("Ammeter", "Амперметр", "Ampermetr"));
        words.add(new Word("Angle Gauge", "Угломер", "Bucaq ölçən"));
        words.add(new Word("Anode", "Анод", "Anod"));
        words.add(new Word("Anode Distance", "Расстояние до анода", "Anoda qədər məsafə"));
        words.add(new Word("Anodizing", "Анодирование", "Anodlaşdırma"));
        words.add(new Word("Anodizing Bath", "Ванна анодирования", "Anodlaşdırma vannası"));
        words.add(new Word("Anvil", "Наковальня", "Zindan"));
        words.add(new Word("Analog Input", "Аналоговый вход", "Analoq giriş"));
        words.add(new Word("Analog Output", "Аналоговый выход", "Analoq çıxış"));
        words.add(new Word("Analog Signal", "Аналоговый сигнал", "Analoq siqnal"));
        words.add(new Word("Assembly", "Сборка", "Yığma"));
        words.add(new Word("Assembly Line", "Сборочная линия", "Yığma xətti"));
        words.add(new Word("Automation", "Автоматизация", "Avtomatlaşdırma"));
        words.add(new Word("Automatic", "Автоматический", "Avtomatik"));
        words.add(new Word("Automatic Control", "Автоматическое управление", "Avtomatik idarəetmə"));
        words.add(new Word("Automatic Feeding", "Автоматическая подача", "Avtomatik veriş"));
        words.add(new Word("Axis", "Ось", "Ox"));

        // ================= B =================

        words.add(new Word("Backlash", "Люфт", "Boşluq"));
        words.add(new Word("Ball Bearing", "Шариковый подшипник", "Kürəli yastıqça"));
        words.add(new Word("Ball Nose Cutter", "Сферическая фреза", "Kürə uclu frez"));
        words.add(new Word("Bar Stock", "Прутковый материал", "Çubuq material"));
        words.add(new Word("Batch", "Партия", "Partiya"));
        words.add(new Word("Batch Number", "Номер партии", "Partiya nömrəsi"));
        words.add(new Word("Batch Size", "Размер партии", "Partiya ölçüsü"));
        words.add(new Word("Bearing", "Подшипник", "Yastıqça"));
        words.add(new Word("Bearing Damage", "Повреждение подшипника", "Yastıqçanın zədələnməsi"));
        words.add(new Word("Bearing Failure", "Отказ подшипника", "Yastıqçanın sıradan çıxması"));
        words.add(new Word("Bearing Grease", "Смазка подшипника", "Yastıqça yağı"));
        words.add(new Word("Bearing Housing", "Корпус подшипника", "Yastıqça gövdəsi"));
        words.add(new Word("Bearing Lubrication", "Смазка подшипника", "Yastıqçanın yağlanması"));
        words.add(new Word("Bearing Replacement", "Замена подшипника", "Yastıqçanın dəyişdirilməsi"));
        words.add(new Word("Bearing Wear", "Износ подшипника", "Yastıqçanın aşınması"));
        words.add(new Word("Belt", "Ремень", "Kəmər"));
        words.add(new Word("Belt Drive", "Ременная передача", "Kəmər ötürməsi"));
        words.add(new Word("Belt Replacement", "Замена ремня", "Kəmərin dəyişdirilməsi"));
        words.add(new Word("Belt Tension", "Натяжение ремня", "Kəmər gərginliyi"));
        words.add(new Word("Bending", "Гибка", "Əymə"));
        words.add(new Word("Bending Angle", "Угол гибки", "Əymə bucağı"));
        words.add(new Word("Bending Force", "Усилие гибки", "Əymə qüvvəsi"));
        words.add(new Word("Bending Radius", "Радиус гибки", "Əymə radiusu"));
        words.add(new Word("Blade", "Лезвие", "Bıçaq"));
        words.add(new Word("Blank", "Заготовка", "Pəstah"));
        words.add(new Word("Blank Diameter", "Диаметр заготовки", "Pəstah diametri"));
        words.add(new Word("Blank Holder", "Прижим заготовки", "Pəstah sıxıcısı"));
        words.add(new Word("Blanking", "Вырубка", "Kəsmə əməliyyatı"));
        words.add(new Word("Bolt", "Болт", "Bolt"));
        words.add(new Word("Bolt Head", "Головка болта", "Bolt başlığı"));
        words.add(new Word("Bolt Length", "Длина болта", "Bolt uzunluğu"));
        words.add(new Word("Bolt Size", "Размер болта", "Bolt ölçüsü"));
        words.add(new Word("Bolt Tightening", "Затяжка болта", "Boltun sıxılması"));
        words.add(new Word("Bore", "Отверстие", "Deşik"));
        words.add(new Word("Bore Diameter", "Диаметр отверстия", "Deşiyin diametri"));
        words.add(new Word("Boring", "Растачивание", "Daxili yonma"));
        words.add(new Word("Boring Bar", "Расточной резец", "Daxili yonma çubuğu"));
        words.add(new Word("Brake", "Тормоз", "Əyləc"));
        words.add(new Word("Brass", "Латунь", "Latun"));
        words.add(new Word("Bronze", "Бронза", "Bürünc"));
        words.add(new Word("Brush", "Щётка", "Fırça"));
        words.add(new Word("Bushing", "Втулка", "Oymaq"));
        words.add(new Word("Button", "Кнопка", "Düymə"));
        words.add(new Word("Burr", "Заусенец", "Tiliş"));

        // ================= C =================

        words.add(new Word("Cable", "Кабель", "Kabel"));
        words.add(new Word("Cable Gland", "Кабельный ввод", "Kabel keçidi"));
        words.add(new Word("Cable Tray", "Кабельный лоток", "Kabel kanalı"));
        words.add(new Word("Calibration", "Калибровка", "Kalibrləmə"));
        words.add(new Word("Calibration Certificate", "Сертификат калибровки", "Kalibrləmə sertifikatı"));
        words.add(new Word("Calibration Date", "Дата калибровки", "Kalibrləmə tarixi"));
        words.add(new Word("Calibration Standard", "Эталон калибровки", "Kalibrləmə standartı"));
        words.add(new Word("Caliper", "Штангенциркуль", "Ştangenpərgar"));
        words.add(new Word("Capacity", "Мощность / вместимость", "Tutum"));
        words.add(new Word("Cast Iron", "Чугун", "Çuqun"));
        words.add(new Word("Chamfer", "Фаска", "Faska"));
        words.add(new Word("Chamfer Mill", "Фреза для фаски", "Faska frezi"));
        words.add(new Word("Chamfering", "Снятие фаски", "Faskalama"));
        words.add(new Word("Chain", "Цепь", "Zəncir"));
        words.add(new Word("Chain Drive", "Цепная передача", "Zəncir ötürməsi"));
        words.add(new Word("Chemical Bath", "Химическая ванна", "Kimyəvi vanna"));
        words.add(new Word("Chemical Cleaning", "Химическая очистка", "Kimyəvi təmizləmə"));
        words.add(new Word("Chemical Concentration", "Концентрация химического вещества", "Kimyəvi maddənin konsentrasiyası"));
        words.add(new Word("Chemical Container", "Контейнер для химикатов", "Kimyəvi maddə qabı"));
        words.add(new Word("Chemical Dosing", "Дозирование химикатов", "Kimyəvi maddələrin dozalanması"));
        words.add(new Word("Chemical Label", "Этикетка химиката", "Kimyəvi maddə etiketi"));
        words.add(new Word("Chemical Spill", "Разлив химического вещества", "Kimyəvi maddə dağılması"));
        words.add(new Word("Chemical Storage", "Хранение химикатов", "Kimyəvi maddələrin saxlanması"));
        words.add(new Word("Chemical Waste", "Химические отходы", "Kimyəvi tullantı"));
        words.add(new Word("Chisel", "Зубило", "Kəski"));
        words.add(new Word("Chuck", "Патрон", "Patron"));
        words.add(new Word("Circuit", "Электрическая цепь", "Elektrik dövrəsi"));
        words.add(new Word("Circuit Breaker", "Автоматический выключатель", "Avtomatik açar"));
        words.add(new Word("Circular Saw", "Циркулярная пила", "Diskli mişar"));
        words.add(new Word("Clamp", "Зажим", "Sıxac"));
        words.add(new Word("Cleaning", "Очистка", "Təmizləmə"));
        words.add(new Word("CNC Control", "Управление ЧПУ", "CNC idarəetməsi"));
        words.add(new Word("CNC Machine", "Станок с ЧПУ", "CNC dəzgahı"));
        words.add(new Word("CNC Program", "Программа ЧПУ", "CNC proqramı"));
        words.add(new Word("CNC Programmer", "Программист ЧПУ", "CNC proqramçısı"));
        words.add(new Word("Coating Adhesion", "Адгезия покрытия", "Örtüyün yapışması"));
        words.add(new Word("Coating Defect", "Дефект покрытия", "Örtük qüsuru"));
        words.add(new Word("Coating Thickness", "Толщина покрытия", "Örtük qalınlığı"));
        words.add(new Word("Coating Uniformity", "Равномерность покрытия", "Örtüyün vahidliyi"));
        words.add(new Word("Cold Rinse", "Холодная промывка", "Soyuq yuma"));
        words.add(new Word("Collet", "Цанга", "Sıxıcı patron"));
        words.add(new Word("Combination Wrench", "Комбинированный ключ", "Kombinə edilmiş açar"));
        words.add(new Word("Compressed Air", "Сжатый воздух", "Sıxılmış hava"));
        words.add(new Word("Control", "Управление", "İdarəetmə"));
        words.add(new Word("Control Cabinet", "Шкаф управления", "İdarəetmə şkafı"));
        words.add(new Word("Control Module", "Модуль управления", "İdarəetmə modulu"));
        words.add(new Word("Control Panel", "Панель управления", "İdarəetmə paneli"));
        words.add(new Word("Control System", "Система управления", "İdarəetmə sistemi"));
        words.add(new Word("Copper", "Медь", "Mis"));
        words.add(new Word("Copper Alloy", "Медный сплав", "Mis ərintisi"));
        words.add(new Word("Copper Plating", "Меднение", "Mis kaplama"));
        words.add(new Word("Countersink", "Зенковка", "Zenker"));
        words.add(new Word("Crack", "Трещина", "Çat"));
        words.add(new Word("Crimping Tool", "Обжимной инструмент", "Sıxma aləti"));
        words.add(new Word("Cutter", "Резак", "Kəsici"));
        words.add(new Word("Cutting", "Резка", "Kəsmə"));
        words.add(new Word("Cutting Disc", "Отрезной диск", "Kəsici disk"));
        words.add(new Word("Cutting Edge", "Режущая кромка", "Kəsici kənar"));
        words.add(new Word("Cutting Force", "Сила резания", "Kəsmə qüvvəsi"));
        words.add(new Word("Cutting Fluid", "Смазочно-охлаждающая жидкость", "Kəsici maye"));
        words.add(new Word("Cutting Insert", "Режущая пластина", "Kəsici lövhə"));
        words.add(new Word("Cutting Parameter", "Параметр резания", "Kəsmə parametri"));
        words.add(new Word("Cutting Speed", "Скорость резания", "Kəsmə sürəti"));
        words.add(new Word("Cutting Tool", "Режущий инструмент", "Kəsici alət"));
        words.add(new Word("Cycle", "Цикл", "Dövr"));
        words.add(new Word("Cycle Time", "Время цикла", "Dövr vaxtı"));

        // ================= D =================

        words.add(new Word("Data", "Данные", "Məlumat"));
        words.add(new Word("Deburring", "Удаление заусенцев", "Tilişlərin təmizlənməsi"));
        words.add(new Word("Deburring Tool", "Инструмент для снятия заусенцев", "Tiliş təmizləmə aləti"));
        words.add(new Word("Defect", "Дефект", "Qüsur"));
        words.add(new Word("Defect Analysis", "Анализ дефекта", "Qüsur analizi"));
        words.add(new Word("Defect Cause", "Причина дефекта", "Qüsurun səbəbi"));
        words.add(new Word("Defect Rate", "Процент дефектов", "Qüsur faizi"));
        words.add(new Word("Defective Part", "Дефектная деталь", "Qüsurlu detal"));
        words.add(new Word("Deflection", "Отклонение", "Əyilmə"));
        words.add(new Word("Depth", "Глубина", "Dərinlik"));
        words.add(new Word("Depth Gauge", "Глубиномер", "Dərinlik ölçən"));
        words.add(new Word("Depth of Cut", "Глубина резания", "Kəsmə dərinliyi"));
        words.add(new Word("Diameter", "Диаметр", "Diametr"));
        words.add(new Word("Die", "Плашка / штамп", "Yiv açan alət / ştamp"));
        words.add(new Word("Die Clearance", "Зазор штампа", "Ştamp boşluğu"));
        words.add(new Word("Die Holder", "Держатель плашки", "Plaşka tutacağı"));
        words.add(new Word("Die Inspection", "Проверка штампа", "Ştampın yoxlanılması"));
        words.add(new Word("Die Life", "Срок службы штампа", "Ştampın xidmət müddəti"));
        words.add(new Word("Die Maintenance", "Обслуживание штампа", "Ştampın texniki xidməti"));
        words.add(new Word("Die Repair", "Ремонт штампа", "Ştampın təmiri"));
        words.add(new Word("Die Set", "Штамповый комплект", "Ştamp dəsti"));
        words.add(new Word("Digital Caliper", "Цифровой штангенциркуль", "Rəqəmsal ştangenpərgar"));
        words.add(new Word("Digital Gauge", "Цифровой калибр", "Rəqəmsal kalibr"));
        words.add(new Word("Digital Input", "Цифровой вход", "Rəqəmsal giriş"));
        words.add(new Word("Digital Output", "Цифровой выход", "Rəqəmsal çıxış"));
        words.add(new Word("Digital Signal", "Цифровой сигнал", "Rəqəmsal siqnal"));
        words.add(new Word("Dimension", "Размер", "Ölçü"));
        words.add(new Word("Dimension Tolerance", "Допуск размера", "Ölçü toleransı"));
        words.add(new Word("Drill", "Дрель / сверло", "Drel / burğu"));
        words.add(new Word("Drill Bit", "Сверло", "Burğu"));
        words.add(new Word("Drill Chuck", "Сверлильный патрон", "Burğu patronu"));
        words.add(new Word("Drill Diameter", "Диаметр сверла", "Burğunun diametri"));
        words.add(new Word("Drill Holder", "Держатель сверла", "Burğu tutacağı"));
        words.add(new Word("Drill Press", "Сверлильный станок", "Burğu dəzgahı"));
        words.add(new Word("Drilling", "Сверление", "Burğulama"));
        words.add(new Word("Drilling Depth", "Глубина сверления", "Burğulama dərinliyi"));
        words.add(new Word("Drilling Operation", "Операция сверления", "Burğulama əməliyyatı"));
        words.add(new Word("Drive", "Привод", "Ötürücü"));
        words.add(new Word("Drive Belt", "Приводной ремень", "Ötürücü kəmər"));
        words.add(new Word("Drive Shaft", "Приводной вал", "Ötürücü val"));
        words.add(new Word("Dust Collector", "Пылесборник", "Toz toplayıcı"));

        // ================= E =================

        words.add(new Word("Edge", "Кромка", "Kənar"));
        words.add(new Word("Electrical Cabinet", "Электрический шкаф", "Elektrik şkafı"));
        words.add(new Word("Electrical Cable", "Электрический кабель", "Elektrik kabeli"));
        words.add(new Word("Electrical Connection", "Электрическое соединение", "Elektrik birləşməsi"));
        words.add(new Word("Electrical Fault", "Электрическая неисправность", "Elektrik nasazlığı"));
        words.add(new Word("Electrical Inspection", "Проверка электрики", "Elektrik yoxlaması"));
        words.add(new Word("Electrical Isolation", "Электрическая изоляция", "Elektrik izolyasiyası"));
        words.add(new Word("Electrical Panel", "Электрический щит", "Elektrik paneli"));
        words.add(new Word("Electrical Safety", "Электробезопасность", "Elektrik təhlükəsizliyi"));
        words.add(new Word("Electrical Shock", "Удар электрическим током", "Elektrik cərəyanı vurması"));
        words.add(new Word("Electricity", "Электричество", "Elektrik"));
        words.add(new Word("Electrode", "Электрод", "Elektrod"));
        words.add(new Word("Electrolyte", "Электролит", "Elektrolit"));
        words.add(new Word("Electrolyte Solution", "Раствор электролита", "Elektrolit məhlulu"));
        words.add(new Word("Electroplating", "Гальваническое покрытие", "Elektrokaplama"));
        words.add(new Word("Emergency", "Аварийная ситуация", "Fövqəladə vəziyyət"));
        words.add(new Word("Emergency Alarm", "Аварийная сигнализация", "Fövqəladə siqnalizasiya"));
        words.add(new Word("Emergency Door", "Аварийная дверь", "Fövqəladə qapı"));
        words.add(new Word("Emergency Exit", "Аварийный выход", "Təcili çıxış"));
        words.add(new Word("Emergency Light", "Аварийный светильник", "Fövqəladə işıq"));
        words.add(new Word("Emergency Lighting", "Аварийное освещение", "Fövqəladə işıqlandırma"));
        words.add(new Word("Emergency Procedure", "Аварийная процедура", "Fövqəladə prosedur"));
        words.add(new Word("Emergency Response", "Действия при аварии", "Fövqəladə vəziyyətə cavab"));
        words.add(new Word("Emergency Stop", "Аварийная остановка", "Təcili dayandırma"));
        words.add(new Word("Energy", "Энергия", "Enerji"));
        words.add(new Word("Engraving", "Гравировка", "Oyma"));
        words.add(new Word("Equipment", "Оборудование", "Avadanlıq"));
        words.add(new Word("Error", "Ошибка", "Səhv"));
        words.add(new Word("Error Code", "Код ошибки", "Səhv kodu"));
        words.add(new Word("Evacuation", "Эвакуация", "Təxliyə"));
        words.add(new Word("Evacuation Drill", "Тренировка эвакуации", "Təxliyə təlimi"));
        words.add(new Word("Evacuation Route", "Маршрут эвакуации", "Təxliyə marşrutu"));
        words.add(new Word("Extension Cord", "Удлинитель", "Uzatma kabeli"));

        // ================= F =================

        words.add(new Word("Face Mill", "Торцевая фреза", "Üz frezi"));
        words.add(new Word("Face Shield", "Защитный щиток", "Üz sipəri"));
        words.add(new Word("Factory", "Завод", "Zavod"));
        words.add(new Word("Feed", "Подача", "Veriş"));
        words.add(new Word("Feed Hold", "Пауза подачи", "Verişin saxlanması"));
        words.add(new Word("Feed Override", "Коррекция подачи", "Veriş korreksiyası"));
        words.add(new Word("Feed Rate", "Скорость подачи", "Veriş sürəti"));
        words.add(new Word("Feed Strip", "Подающая полоса", "Veriş zolağı"));
        words.add(new Word("Filter", "Фильтр", "Filtr"));
        words.add(new Word("Filter Change", "Замена фильтра", "Filtrin dəyişdirilməsi"));
        words.add(new Word("Filter Element", "Фильтрующий элемент", "Filtr elementi"));
        words.add(new Word("Finishing", "Чистовая обработка", "Son emal"));
        words.add(new Word("Fire Alarm Panel", "Панель пожарной сигнализации", "Yanğın siqnalizasiya paneli"));
        words.add(new Word("Fire Blanket", "Противопожарное покрывало", "Yanğın örtüyü"));
        words.add(new Word("Fire Bucket", "Противопожарное ведро", "Yanğın vedrəsi"));
        words.add(new Word("Fire Cabinet", "Пожарный шкаф", "Yanğın şkafı"));
        words.add(new Word("Fire Control Panel", "Панель управления пожаром", "Yanğın idarəetmə paneli"));
        words.add(new Word("Fire Detector", "Пожарный датчик", "Yanğın detektoru"));
        words.add(new Word("Fire Door", "Противопожарная дверь", "Yanğın qapısı"));
        words.add(new Word("Fire Extinguisher Class", "Класс огнетушителя", "Yanğınsöndürən sinfi"));
        words.add(new Word("Fire Hose Reel", "Катушка пожарного шланга", "Yanğın şlanqı çarxı"));
        words.add(new Word("Fire Hydrant", "Пожарный гидрант", "Yanğın hidrantı"));
        words.add(new Word("Fire Inspection", "Пожарная проверка", "Yanğın yoxlaması"));
        words.add(new Word("Fire Prevention", "Предотвращение пожара", "Yanğının qarşısının alınması"));
        words.add(new Word("Fire Pump", "Пожарный насос", "Yanğın nasosu"));
        words.add(new Word("Fire Safety", "Пожарная безопасность", "Yanğın təhlükəsizliyi"));
        words.add(new Word("Fire Sprinkler", "Пожарный спринклер", "Yanğın sprinkler başlığı"));
        words.add(new Word("Fire Suppression System", "Система пожаротушения", "Yanğınsöndürmə sistemi"));
        words.add(new Word("Fire Training", "Пожарное обучение", "Yanğın təlimi"));
        words.add(new Word("Fire Watch", "Пожарное наблюдение", "Yanğın nəzarəti"));
        words.add(new Word("Fire Watcher", "Ответственный за пожарное наблюдение", "Yanğın nəzarətçisi"));
        words.add(new Word("First Aid", "Первая помощь", "İlk yardım"));
        words.add(new Word("First Aid Kit", "Аптечка", "İlk yardım çantası"));
        words.add(new Word("Fixture", "Приспособление", "Qurğu"));
        words.add(new Word("Flammable Gas", "Легковоспламеняющийся газ", "Tez alışan qaz"));
        words.add(new Word("Flammable Liquid", "Легковоспламеняющаяся жидкость", "Tez alışan maye"));
        words.add(new Word("Flange", "Фланец", "Flanş"));
        words.add(new Word("Foam Extinguisher", "Пенный огнетушитель", "Köpüklü yanğınsöndürən"));
        words.add(new Word("Force", "Сила", "Qüvvə"));
        words.add(new Word("Forklift", "Погрузчик", "Yükləyici"));
        words.add(new Word("Forklift Inspection", "Проверка погрузчика", "Yükləyicinin yoxlanılması"));
        words.add(new Word("Forklift Operator", "Водитель погрузчика", "Yükləyici operatoru"));
        words.add(new Word("Frame", "Рама", "Çərçivə"));
        words.add(new Word("Frequency", "Частота", "Tezlik"));
        words.add(new Word("Frequency Converter", "Преобразователь частоты", "Tezlik çeviricisi"));
        words.add(new Word("Furnace", "Печь", "Soba"));
        words.add(new Word("Furnace Chamber", "Камера печи", "Soba kamerası"));
        words.add(new Word("Furnace Door", "Дверь печи", "Soba qapısı"));
        words.add(new Word("Furnace Temperature", "Температура печи", "Soba temperaturu"));

        // ================= G =================

        words.add(new Word("Galvanic Process", "Гальванический процесс", "Qalvanik proses"));
        words.add(new Word("Gas", "Газ", "Qaz"));
       