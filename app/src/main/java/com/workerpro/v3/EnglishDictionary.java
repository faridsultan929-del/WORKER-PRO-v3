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

        words.add(new Word("Abrasion", "Истирание", "Aşınma"));
        words.add(new Word("Accuracy", "Точность", "Dəqiqlik"));
        words.add(new Word("Accident", "Несчастный случай", "Qəza"));
        words.add(new Word("Adjust", "Регулировать", "Tənzimləmək"));
        words.add(new Word("Adjustment", "Регулировка", "Tənzimləmə"));
        words.add(new Word("Air Compressor", "Воздушный компрессор", "Hava kompressoru"));
        words.add(new Word("Air Filter", "Воздушный фильтр", "Hava filtri"));
        words.add(new Word("Air Pressure", "Давление воздуха", "Hava təzyiqi"));
        words.add(new Word("Alarm", "Сигнализация", "Siqnal"));
        words.add(new Word("Alignment", "Выравнивание", "Mərkəzləmə"));
        words.add(new Word("Aluminum", "Алюминий", "Alüminium"));
        words.add(new Word("Assembly", "Сборка", "Yığma"));
        words.add(new Word("Automation", "Автоматизация", "Avtomatlaşdırma"));
        words.add(new Word("Axis", "Ось", "Ox"));

        words.add(new Word("Backlash", "Люфт", "Boşluq"));
        words.add(new Word("Bearing", "Подшипник", "Yastıqça"));
        words.add(new Word("Belt", "Ремень", "Kəmər"));
        words.add(new Word("Bending", "Гибка", "Əymə"));
        words.add(new Word("Bolt", "Болт", "Bolt"));
        words.add(new Word("Bore", "Отверстие", "Deşik"));
        words.add(new Word("Boring", "Растачивание", "Daxili yonma"));
        words.add(new Word("Brake", "Тормоз", "Əyləc"));
        words.add(new Word("Brass", "Латунь", "Latun"));
        words.add(new Word("Bronze", "Бронза", "Bürünc"));
        words.add(new Word("Brush", "Щётка", "Fırça"));
        words.add(new Word("Burr", "Заусенец", "Tiliş"));

        words.add(new Word("Cable", "Кабель", "Kabel"));
        words.add(new Word("Calibration", "Калибровка", "Kalibrləmə"));
        words.add(new Word("Caliper", "Штангенциркуль", "Ştangenpərgar"));
        words.add(new Word("Cast Iron", "Чугун", "Çuqun"));
        words.add(new Word("Chamfer", "Фаска", "Faska"));
        words.add(new Word("Chain", "Цепь", "Zəncir"));
        words.add(new Word("Chuck", "Патрон", "Patron"));
        words.add(new Word("Circuit", "Электрическая цепь", "Elektrik dövrəsi"));
        words.add(new Word("Clamp", "Зажим", "Sıxac"));
        words.add(new Word("CNC Control", "Управление ЧПУ", "CNC idarəetməsi"));
        words.add(new Word("CNC Machine", "Станок с ЧПУ", "CNC dəzgahı"));
        words.add(new Word("CNC Program", "Программа ЧПУ", "CNC proqramı"));
        words.add(new Word("Compressed Air", "Сжатый воздух", "Sıxılmış hava"));
        words.add(new Word("Control Panel", "Панель управления", "İdarəetmə paneli"));
        words.add(new Word("Copper", "Медь", "Mis"));
        words.add(new Word("Crack", "Трещина", "Çat"));
        words.add(new Word("Cutting", "Резка", "Kəsmə"));
        words.add(new Word("Cutting Speed", "Скорость резания", "Kəsmə sürəti"));
        words.add(new Word("Cutting Tool", "Режущий инструмент", "Kəsici alət"));
        words.add(new Word("Cycle Time", "Время цикла", "Dövr vaxtı"));

        words.add(new Word("Data", "Данные", "Məlumat"));
        words.add(new Word("Deburring", "Удаление заусенцев", "Tilişlərin təmizlənməsi"));
        words.add(new Word("Defect", "Дефект", "Qüsur"));
        words.add(new Word("Depth", "Глубина", "Dərinlik"));
        words.add(new Word("Depth Gauge", "Глубиномер", "Dərinlik ölçən"));
        words.add(new Word("Diameter", "Диаметр", "Diametr"));
        words.add(new Word("Die", "Штамп", "Ştamp"));
        words.add(new Word("Die Clearance", "Зазор штампа", "Ştamp boşluğu"));
        words.add(new Word("Drill", "Дрель / сверло", "Drel / burğu"));
        words.add(new Word("Drill Bit", "Сверло", "Burğu"));
        words.add(new Word("Drill Press", "Сверлильный станок", "Burğu dəzgahı"));
        words.add(new Word("Drilling", "Сверление", "Burğulama"));
        words.add(new Word("Drive", "Привод", "Ötürücü"));

        words.add(new Word("Edge", "Кромка", "Kənar"));
        words.add(new Word("Electrical Cabinet", "Электрический шкаф", "Elektrik şkafı"));
        words.add(new Word("Electrical Cable", "Электрический кабель", "Elektrik kabeli"));
        words.add(new Word("Electrical Fault", "Электрическая неисправность", "Elektrik nasazlığı"));
        words.add(new Word("Electricity", "Электричество", "Elektrik"));
        words.add(new Word("Electrode", "Электрод", "Elektrod"));
        words.add(new Word("Electrolyte", "Электролит", "Elektrolit"));
        words.add(new Word("Electroplating", "Гальваническое покрытие", "Elektrokaplama"));
        words.add(new Word("Emergency Exit", "Аварийный выход", "Təcili çıxış"));
        words.add(new Word("Emergency Stop", "Аварийная остановка", "Təcili dayandırma"));
        words.add(new Word("Equipment", "Оборудование", "Avadanlıq"));
        words.add(new Word("Error", "Ошибка", "Səhv"));
        words.add(new Word("Evacuation", "Эвакуация", "Təxliyə"));

        words.add(new Word("Face Mill", "Торцевая фреза", "Üz frezi"));
        words.add(new Word("Factory", "Завод", "Zavod"));
        words.add(new Word("Feed Rate", "Скорость подачи", "Veriş sürəti"));
        words.add(new Word("Filter", "Фильтр", "Filtr"));
        words.add(new Word("Fire Alarm Panel", "Панель пожарной сигнализации", "Yanğın siqnalizasiya paneli"));
        words.add(new Word("Fire Extinguisher", "Огнетушитель", "Yanğınsöndürən"));
        words.add(new Word("Fire Safety", "Пожарная безопасность", "Yanğın təhlükəsizliyi"));
        words.add(new Word("First Aid", "Первая помощь", "İlk yardım"));
        words.add(new Word("First Aid Kit", "Аптечка", "İlk yardım çantası"));
        words.add(new Word("Flammable Gas", "Легковоспламеняющийся газ", "Tez alışan qaz"));
        words.add(new Word("Flammable Liquid", "Легковоспламеняющаяся жидкость", "Tez alışan maye"));
        words.add(new Word("Force", "Сила", "Qüvvə"));
        words.add(new Word("Forklift", "Погрузчик", "Yükləyici"));
        words.add(new Word("Frequency", "Частота", "Tezlik"));
        words.add(new Word("Furnace", "Печь", "Soba"));
        words.add(new Word("Furnace Temperature", "Температура печи", "Soba temperaturu"));

        words.add(new Word("Galvanic Process", "Гальванический процесс", "Qalvanik proses"));
        words.add(new Word("Gas", "Газ", "Qaz"));
        words.add(new Word("Gas Cylinder", "Газовый баллон", "Qaz balonu"));
        words.add(new Word("Gas Leak", "Утечка газа", "Qaz sızması"));
        words.add(new Word("Gas Pressure", "Давление газа", "Qaz təzyiqi"));
        words.add(new Word("Gas Regulator", "Газовый регулятор", "Qaz tənzimləyicisi"));
        words.add(new Word("Gauge", "Калибр", "Kalibr"));
        words.add(new Word("Gear", "Шестерня", "Dişli"));
        words.add(new Word("Gearbox", "Коробка передач", "Sürətlər qutusu"));
        words.add(new Word("Gloves", "Перчатки", "Əlcəklər"));
        words.add(new Word("Grinding", "Шлифование", "Daşlama"));
        words.add(new Word("Grinding Wheel", "Шлифовальный круг", "Daşlama dairəsi"));
        words.add(new Word("Ground Cable", "Заземляющий кабель", "Torpaqlama kabeli"));
        words.add(new Word("Ground Wire", "Заземляющий провод", "Torpaqlama naqili"));
        words.add(new Word("Guard", "Защитное ограждение", "Qoruyucu örtük"));

        words.add(new Word("Hacksaw", "Ножовка", "Mişar"));
        words.add(new Word("Hammer", "Молоток", "Çəkic"));
        words.add(new Word("Hand Drill", "Ручная дрель", "Əl dreli"));
        words.add(new Word("Hand Tool", "Ручной инструмент", "Əl aləti"));
        words.add(new Word("Hardening", "Закалка", "Bərkitmə"));
        words.add(new Word("Hardness", "Твёрдость", "Sərtlik"));
        words.add(new Word("Hazard", "Опасность", "Təhlükə"));
        words.add(new Word("Heat Treatment", "Термообработка", "İstilik emalı"));
        words.add(new Word("Heat Treatment Furnace", "Печь термообработки", "İstilik emalı sobası"));
        words.add(new Word("Heat Source", "Источник тепла", "İstilik mənbəyi"));
        words.add(new Word("Heating", "Нагрев", "Qızdırma"));
        words.add(new Word("Heating Element", "Нагревательный элемент", "Qızdırıcı element"));
        words.add(new Word("Helmet", "Каска", "Dəbilqə"));
        words.add(new Word("Hex Key", "Шестигранный ключ", "Altıbucaqlı açar"));
        words.add(new Word("Hydraulic Cylinder", "Гидравлический цилиндр", "Hidravlik silindr"));
        words.add(new Word("Hydraulic Oil", "Гидравлическое масло", "Hidravlik yağ"));
        words.add(new Word("Hydraulic Pressure", "Гидравлическое давление", "Hidravlik təzyiq"));
        words.add(new Word("Hydraulic Pump", "Гидравлический насос", "Hidravlik nasos"));

        words.add(new Word("Impact Wrench", "Ударный гайковёрт", "Zərbəli qayka açarı"));
        words.add(new Word("Inductive Sensor", "Индуктивный датчик", "İnduktiv sensor"));
        words.add(new Word("Indicator", "Индикатор", "İndikator"));
        words.add(new Word("Inspection", "Проверка", "Yoxlama"));
        words.add(new Word("Inspection Report", "Отчёт о проверке", "Yoxlama hesabatı"));
        words.add(new Word("Insulation", "Изоляция", "İzolyasiya"));
        words.add(new Word("Internal Thread", "Внутренняя резьба", "Daxili yiv"));
        words.add(new Word("Iron", "Железо", "Dəmir"));

        words.add(new Word("Jig", "Кондуктор", "Konduktor"));
        words.add(new Word("Jaw", "Кулачок", "Sıxac çənəsi"));
        words.add(new Word("Joint", "Соединение", "Birləşmə"));

        words.add(new Word("Key", "Шпонка", "Şponka"));
        words.add(new Word("Keyway", "Шпоночный паз", "Şponka yuvası"));
        words.add(new Word("Knurling", "Накатка", "Naxış açma"));

        words.add(new Word("Lathe", "Токарный станок", "Torna dəzgahı"));
        words.add(new Word("Lathe Tool", "Токарный резец", "Torna aləti"));
        words.add(new Word("Length", "Длина", "Uzunluq"));
        words.add(new Word("Limit Switch", "Концевой выключатель", "Son açar"));
        words.add(new Word("Lock Nut", "Контргайка", "Kontrqayka"));
        words.add(new Word("Lubricant", "Смазка", "Yağlayıcı"));
        words.add(new Word("Lubrication", "Смазывание", "Yağlama"));

        words.add(new Word("Machine", "Станок / машина", "Dəzgah / maşın"));
        words.add(new Word("Machine Alarm", "Авария станка", "Dəzgah siqnalı"));
        words.add(new Word("Machine Bed", "Станина станка", "Dəzgah yatağı"));
        words.add(new Word("Machine Guard", "Защитное ограждение станка", "Dəzgah qoruyucusu"));
        words.add(new Word("Machine Maintenance", "Обслуживание станка", "Dəzgahın texniki xidməti"));
        words.add(new Word("Machine Repair", "Ремонт станка", "Dəzgahın təmiri"));
        words.add(new Word("Machine Setup", "Настройка станка", "Dəzgahın sazlanması"));
        words.add(new Word("Magnetic Sensor", "Магнитный датчик", "Maqnit sensoru"));
        words.add(new Word("Maintenance", "Техническое обслуживание", "Texniki xidmət"));
        words.add(new Word("Material", "Материал", "Material"));
        words.add(new Word("Material Grade", "Марка материала", "Material markası"));
        words.add(new Word("Measurement", "Измерение", "Ölçmə"));
        words.add(new Word("Measuring Tool", "Измерительный инструмент", "Ölçü aləti"));
        words.add(new Word("Metal", "Металл", "Metal"));
        words.add(new Word("Micrometer", "Микрометр", "Mikrometr"));
        words.add(new Word("MIG Welding", "MIG-сварка", "MIG qaynağı"));
        words.add(new Word("Milling", "Фрезерование", "Frezerləmə"));
        words.add(new Word("Milling Cutter", "Фреза", "Frez"));
        words.add(new Word("Motor", "Двигатель", "Mühərrik"));

        words.add(new Word("Needle Valve", "Игольчатый клапан", "İynə klapanı"));
        words.add(new Word("Nickel", "Никель", "Nikel"));
        words.add(new Word("Nickel Plating", "Никелирование", "Nikel kaplama"));
        words.add(new Word("Noise", "Шум", "Səs-küy"));
        words.add(new Word("Nominal Diameter", "Номинальный диаметр", "Nominal diametr"));
        words.add(new Word("Nominal Size", "Номинальный размер", "Nominal ölçü"));
        words.add(new Word("Nut", "Гайка", "Qayka"));

        words.add(new Word("Offset", "Коррекция / смещение", "Korreksiya / sürüşmə"));
        words.add(new Word("Oil", "Масло", "Yağ"));
        words.add(new Word("Oil Filter", "Масляный фильтр", "Yağ filtri"));
        words.add(new Word("Oil Leak", "Утечка масла", "Yağ sızması"));
        words.add(new Word("Operation", "Операция", "Əməliyyat"));
        words.add(new Word("Operator", "Оператор", "Operator"));
        words.add(new Word("Overheat", "Перегрев", "Həddindən artıq qızma"));
        words.add(new Word("Overload", "Перегрузка", "Həddindən artıq yük"));

        words.add(new Word("Parallel", "Параллельный", "Paralel"));
        words.add(new Word("Part", "Деталь", "Detal"));
        words.add(new Word("Part Number", "Номер детали", "Detal nömrəsi"));
        words.add(new Word("Pneumatic Cylinder", "Пневматический цилиндр", "Pnevmatik silindr"));
        words.add(new Word("Pneumatic System", "Пневматическая система", "Pnevmatik sistem"));
        words.add(new Word("Power Supply", "Источник питания", "Qida mənbəyi"));
        words.add(new Word("PPE", "Средства индивидуальной защиты", "Fərdi mühafizə vasitələri"));
        words.add(new Word("Press", "Пресс", "Pres"));
        words.add(new Word("Press Brake", "Листогибочный пресс", "List əyən pres"));
        words.add(new Word("Press Force", "Усилие пресса", "Pres qüvvəsi"));
        words.add(new Word("Pressure", "Давление", "Təzyiq"));
        words.add(new Word("Pressure Gauge", "Манометр", "Manometr"));
        words.add(new Word("Production", "Производство", "İstehsalat"));
        words.add(new Word("Production Line", "Производственная линия", "İstehsal xətti"));
        words.add(new Word("Production Plan", "Производственный план", "İstehsal planı"));
        words.add(new Word("Punch", "Пуансон", "Puanson"));
        words.add(new Word("Punch Press", "Пробивной пресс", "Deşmə presi"));
        words.add(new Word("Pump", "Насос", "Nasos"));

        words.add(new Word("Quality", "Качество", "Keyfiyyət"));
        words.add(new Word("Quality Check", "Проверка качества", "Keyfiyyət yoxlaması"));
        words.add(new Word("Quality Control", "Контроль качества", "Keyfiyyətə nəzarət"));
        words.add(new Word("Quality Inspector", "Инспектор по качеству", "Keyfiyyət müfəttişi"));
        words.add(new Word("Quality Standard", "Стандарт качества", "Keyfiyyət standartı"));

        words.add(new Word("Raw Material", "Сырьё", "Xammal"));
        words.add(new Word("Reamer", "Развёртка", "Rayber"));
        words.add(new Word("Reference Point", "Исходная точка", "İstinad nöqtəsi"));
        words.add(new Word("Relay", "Реле", "Rele"));
        words.add(new Word("Repair", "Ремонт", "Təmir"));
        words.add(new Word("Rejected Part", "Бракованная деталь", "Rədd edilmiş detal"));
        words.add(new Word("Report", "Отчёт", "Hesabat"));
        words.add(new Word("Reset", "Сброс", "Sıfırlama"));
        words.add(new Word("Risk", "Риск", "Risk"));
        words.add(new Word("Robot", "Робот", "Robot"));
        words.add(new Word("Runout", "Радиальное биение", "Yırğalanma"));

        words.add(new Word("Safety", "Безопасность", "Təhlükəsizlik"));
        words.add(new Word("Safety Glasses", "Защитные очки", "Qoruyucu eynək"));
        words.add(new Word("Safety Shoes", "Защитная обувь", "Təhlükəsizlik ayaqqabısı"));
        words.add(new Word("Safety Sign", "Знак безопасности", "Təhlükəsizlik nişanı"));
        words.add(new Word("Safety Training", "Обучение безопасности", "Təhlükəsizlik təlimi"));
        words.add(new Word("Saw", "Пила", "Mişar"));
        words.add(new Word("Screw", "Винт", "Vint"));
        words.add(new Word("Screwdriver", "Отвёртка", "Vintaçan"));
        words.add(new Word("Sensor", "Датчик", "Sensor"));
        words.add(new Word("Sheet Metal", "Листовой металл", "Sac metal"));
        words.add(new Word("Shift", "Смена", "Növbə"));
        words.add(new Word("Shut Down", "Выключить / остановить", "Söndürmək / dayandırmaq"));
        words.add(new Word("Socket Wrench", "Торцевой ключ", "Başlıq açarı"));
        words.add(new Word("Spindle", "Шпиндель", "Şpindel"));
        words.add(new Word("Spindle Speed", "Скорость шпинделя", "Şpindel sürəti"));
        words.add(new Word("Steel", "Сталь", "Polad"));
        words.add(new Word("Stop Button", "Кнопка остановки", "Dayandırma düyməsi"));
        words.add(new Word("Surface Finish", "Качество поверхности", "Səthin keyfiyyəti"));
        words.add(new Word("Switch", "Выключатель", "Açar"));

        words.add(new Word("Tap", "Метчик", "Metçik"));
        words.add(new Word("Task", "Задание", "Tapşırıq"));
        words.add(new Word("Technician", "Техник", "Texnik"));
        words.add(new Word("Temperature", "Температура", "Temperatur"));
        words.add(new Word("Thermocouple", "Термопара", "Termocüt"));
        words.add(new Word("Thread", "Резьба", "Yiv"));
        words.add(new Word("Thread Gauge", "Резьбовой калибр", "Yiv kalibri"));
        words.add(new Word("Thread Pitch", "Шаг резьбы", "Yiv addımı"));
        words.add(new Word("Tool", "Инструмент", "Alət"));
        words.add(new Word("Tool Holder", "Держатель инструмента", "Alət tutacağı"));
        words.add(new Word("Tool Life", "Срок службы инструмента", "Alətin xidmət müddəti"));
        words.add(new Word("Torque", "Крутящий момент", "Fırlanma momenti"));
        words.add(new Word("Torque Wrench", "Динамометрический ключ", "Moment açarı"));
        words.add(new Word("Training", "Обучение", "Təlim"));
        words.add(new Word("Turning", "Токарная обработка", "Torna emalı"));

        words.add(new Word("Unclamp", "Разжать", "Sıxacı açmaq"));
        words.add(new Word("Unit", "Единица", "Vahid"));
        words.add(new Word("Urgent", "Срочно", "Təcili"));

        words.add(new Word("Valve", "Клапан", "Klapan"));
        words.add(new Word("Vernier Caliper", "Штангенциркуль", "Ştangenpərgar"));
        words.add(new Word("Vibration", "Вибрация", "Vibrasiya"));
        words.add(new Word("Vibration Sensor", "Датчик вибрации", "Vibrasiya sensoru"));
        words.add(new Word("Voltage", "Напряжение", "Gərginlik"));
        words.add(new Word("Voltmeter", "Вольтметр", "Voltmetr"));

        words.add(new Word("Washer", "Шайба", "Şayba"));
        words.add(new Word("Water", "Вода", "Su"));
        words.add(new Word("Wear", "Износ", "Aşınma"));
        words.add(new Word("Welding", "Сварка", "Qaynaq"));
        words.add(new Word("Welding Cable", "Сварочный кабель", "Qaynaq kabeli"));
        words.add(new Word("Welding Helmet", "Сварочная маска", "Qaynaq dəbilqəsi"));
        words.add(new Word("Welding Machine", "Сварочный аппарат", "Qaynaq aparatı"));
        words.add(new Word("Welding Rod", "Сварочный электрод", "Qaynaq elektrodu"));
        words.add(new Word("Width", "Ширина", "En"));
        words.add(new Word("Wire", "Провод", "Naqil"));
        words.add(new Word("Wire Brush", "Проволочная щётка", "Tel fırça"));
        words.add(new Word("Worker", "Рабочий", "İşçi"));
        words.add(new Word("Work Bench", "Верстак", "İş masası"));
        words.add(new Word("Workpiece", "Заготовка / деталь", "İş parçası"));
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

        return words;
    }
}