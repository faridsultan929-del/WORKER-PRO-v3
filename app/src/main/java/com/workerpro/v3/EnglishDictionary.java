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
        words.add(new Word("Alarm", "Сигнал тревоги", "Siqnal"));
        words.add(new Word("Alignment", "Центровка", "Mərkəzləşdirmə"));
        words.add(new Word("Allen Key", "Шестигранный ключ", "Altıbucaqlı açar"));
        words.add(new Word("Aluminum", "Алюминий", "Alüminium"));
        words.add(new Word("Anode", "Анод", "Anod"));
        words.add(new Word("Assembly", "Сборка", "Yığma"));
        words.add(new Word("Assembly Line", "Сборочная линия", "Yığım xətti"));
        words.add(new Word("Automation", "Автоматизация", "Avtomatlaşdırma"));
        words.add(new Word("Automatic", "Автоматический", "Avtomatik"));
        words.add(new Word("Axis", "Ось", "Ox"));

        // ================= B =================
        words.add(new Word("Backlash", "Люфт", "Boşluq"));
        words.add(new Word("Balance", "Баланс", "Balans"));
        words.add(new Word("Bearing", "Подшипник", "Yastıqça"));
        words.add(new Word("Belt", "Ремень", "Kəmər"));
        words.add(new Word("Bench Grinder", "Настольный шлифовальный станок", "Stolüstü daşlama dəzgahı"));
        words.add(new Word("Bending", "Гибка", "Bükmə"));
        words.add(new Word("Blade", "Лезвие", "Bıçaq"));
        words.add(new Word("Bolt", "Болт", "Bolt"));
        words.add(new Word("Bore", "Расточка", "Deşik"));
        words.add(new Word("Boring", "Растачивание", "Rastalama"));
        words.add(new Word("Brake", "Тормоз", "Əyləc"));
        words.add(new Word("Brush", "Щётка", "Fırça"));
        words.add(new Word("Bushing", "Втулка", "Втulka"));
        words.add(new Word("Button", "Кнопка", "Düymə"));
        words.add(new Word("Burr", "Заусенец", "Tikan"));

        // ================= C =================
        words.add(new Word("Cable", "Кабель", "Kabel"));
        words.add(new Word("Caliper", "Штангенциркуль", "Ştangensirkul"));
        words.add(new Word("Capacity", "Мощность / вместимость", "Tutum"));
        words.add(new Word("Chamfer", "Фаска", "Faska"));
        words.add(new Word("Chain", "Цепь", "Zəncir"));
        words.add(new Word("Chisel", "Зубило", "Dəmir kəski"));
        words.add(new Word("Chuck", "Патрон", "Patron"));
        words.add(new Word("Circular Saw", "Циркулярная пила", "Dairəvi mişar"));
        words.add(new Word("Clamp", "Зажим", "Sıxac"));
        words.add(new Word("Cleaning", "Очистка", "Təmizləmə"));
        words.add(new Word("CNC Control", "Управление ЧПУ", "CNC idarəetməsi"));
        words.add(new Word("CNC Machine", "Станок с ЧПУ", "CNC dəzgahı"));
        words.add(new Word("CNC Program", "Программа ЧПУ", "CNC proqramı"));
        words.add(new Word("CNC Programmer", "Программист ЧПУ", "CNC proqramçısı"));
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

        // ================= D =================
        words.add(new Word("Data", "Данные", "Məlumat"));
        words.add(new Word("Deburring", "Удаление заусенцев", "Tikanların təmizlənməsi"));
        words.add(new Word("Deburring Tool", "Инструмент для удаления заусенцев", "Tikan təmizləmə aləti"));
        words.add(new Word("Defect", "Дефект", "Qüsur"));
        words.add(new Word("Deflection", "Отклонение", "Əyilmə"));
        words.add(new Word("Depth", "Глубина", "Dərinlik"));
        words.add(new Word("Depth Gauge", "Глубиномер", "Dərinlik ölçən"));
        words.add(new Word("Diameter", "Диаметр", "Diametr"));
        words.add(new Word("Die", "Матрица", "Matris"));
        words.add(new Word("Die Alignment", "Центровка матрицы", "Matrisin mərkəzləşdirilməsi"));
        words.add(new Word("Die Holder", "Держатель матрицы", "Matris tutacağı"));
        words.add(new Word("Digital Gauge", "Цифровой измеритель", "Rəqəmsal ölçü cihazı"));
        words.add(new Word("Diamond Tool", "Алмазный инструмент", "Almaz aləti"));
        words.add(new Word("Drill", "Сверло", "Burğu"));
        words.add(new Word("Drill Bit", "Сверлильный инструмент", "Burğu ucu"));
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
        words.add(new Word("Error", "Ошибка", "Səhv"));
        words.add(new Word("Extension Cord", "Удлинитель", "Uzatma kabeli"));

        // ================= F =================
        words.add(new Word("Face Mill", "Торцевая фреза", "Alın frezi"));
        words.add(new Word("Factory", "Завод", "Zavod"));
        words.add(new Word("Feed", "Подача", "Veriş"));
        words.add(new Word("Feed Rate", "Скорость подачи", "Veriş sürəti"));
        words.add(new Word("File", "Напильник", "Rəndə"));
        words.add(new Word("Filter", "Фильтр", "Filtr"));
        words.add(new Word("Finishing", "Чистовая обработка", "Təmiz emal"));
        words.add(new Word("Fixture", "Приспособление", "Qurğu"));
        words.add(new Word("Flange", "Фланец", "Flanş"));
        words.add(new Word("Force", "Сила", "Qüvvə"));
        words.add(new Word("Forklift", "Погрузчик", "Yükləyici"));
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
        words.add(new Word("Guard", "Защитное ограждение", "Qoruyucu mühafizə"));

        // ================= H =================
        words.add(new Word("Hacksaw", "Ножовка", "Dəmir mişarı"));
        words.add(new Word("Hammer", "Молоток", "Çəkic"));
        words.add(new Word("Hand Drill", "Ручная дрель", "Əl dreli"));
        words.add(new Word("Hand Tool", "Ручной инструмент", "Əl aləti"));
        words.add(new Word("Hardness", "Твёрдость", "Sərtlik"));
        words.add(new Word("Hazard", "Опасность", "Təhlükə"));
        words.add(new Word("Heat Treatment", "Термическая обработка", "İstilik emalı"));
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
        words.add(new Word("Jaw", "Губка", "Sıxac çənəsi"));
        words.add(new Word("Job", "Работа / задание", "İş / tapşırıq"));
        words.add(new Word("Joint", "Соединение", "Birləşmə"));

        // ================= K =================
        words.add(new Word("Key", "Шпонка", "Şponka"));
        words.add(new Word("Keyway", "Шпоночный паз", "Şponka yuvası"));
        words.add(new Word("Knife", "Нож", "Bıçaq"));
        words.add(new Word("Knurling", "Накатка", "Naxışlama"));

        // ================= L =================
        words.add(new Word("Lathe", "Токарный станок", "Torna dəzgahı"));
        words.add(new Word("Lathe Tool", "Токарный инструмент", "Torna aləti"));
        words.add(new Word("Length", "Длина", "Uzunluq"));
        words.add(new Word("Level", "Уровень", "Səviyyə"));
        words.add(new Word("Limit Switch", "Концевой выключатель", "Son açarı"));
        words.add(new Word("Lock Nut", "Стопорная гайка", "Kilid qozası"));
        words.add(new Word("Lubricant", "Смазка", "Sürtkü"));
        words.add(new Word("Lubrication", "Смазка / смазывание", "Yağlama"));

        // ================= M =================
        words.add(new Word("Machine", "Станок / машина", "Dəzgah / maşın"));
        words.add(new Word("Machine Bed", "Станина", "Dəzgah yatağı"));
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
        words.add(new Word("Milling Cutter", "Фреза", "Frez"));
        words.add(new Word("Motor", "Двигатель", "Mühərrik"));

        // ================= N =================
        words.add(new Word("Needle Valve", "Игольчатый клапан", "İynə klapanı"));
        words.add(new Word("Nipple", "Ниппель", "Nipel"));
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
        words.add(new Word("Power Supply", "Источник питания", "Qida mənbəyi"));
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
        words.add(new Word("Quality Inspector", "Инспектор качества", "Keyfiyyət müfəttişi"));
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
        words.add(new Word("Rejected Part", "Бракованная деталь", "Yararsız detal"));
        words.add(new Word("Risk", "Риск", "Risk"));
        words.add(new Word("Robot", "Робот", "Robot"));
        words.add(new Word("Ruler", "Линейка", "Xətkeş"));
        words.add(new Word("Runout", "Биение", "Vurma"));

        // ================= S =================
        words.add(new Word("Safety", "Безопасность", "Təhlükəsizlik"));
        words.add(new Word("Safety Glasses", "Защитные очки", "Qoruyucu eynək"));
        words.add(new Word("Safety Shoes", "Защитная обувь", "Qoruyucu ayaqqabı"));
        words.add(new Word("Safety Rule", "Правило безопасности", "Təhlükəsizlik qaydası"));
        words.add(new Word("Safety Training", "Обучение безопасности", "Təhlükəsizlik təlimi"));
        words.add(new Word("Sensor", "Датчик", "Sensor"));
        words.add(new Word("Setting", "Настройка", "Parametrləmə"));
        words.add(new Word("Sheet Metal", "Листовой металл", "Sac metal"));
        words.add(new Word("Socket Wrench", "Торцевой ключ", "Başlıqlı açar"));
        words.add(new Word("Spindle", "Шпиндель", "Şpindel"));
        words.add(new Word("Speed", "Скорость", "Sürət"));
        words.add(new Word("Spanner", "Гаечный ключ", "Açar"));
        words.add(new Word("Spring", "Пружина", "Yay"));
        words.add(new Word("Steel", "Сталь", "Polad"));
        words.add(new Word("Stop Button", "Кнопка остановки", "Dayandırma düyməsi"));
        words.add(new Word("Surface Finish", "Качество поверхности", "Səth keyfiyyəti"));
        words.add(new Word("Switch", "Переключатель", "Açar"));
        words.add(new Word("System", "Система", "Sistem"));

        // ================= T =================
        words.add(new Word("Tap", "Метчик", "Metçik"));
        words.add(new Word("Tap Wrench", "Вороток для метчика", "Metçik dəstəyi"));
        words.add(new Word("Task", "Задание", "Tapşırıq"));
        words.add(new Word("Technician", "Техник", "Texnik"));
        words.add(new Word("Temperature", "Температура", "Temperatur"));
        words.add(new Word("Thickness", "Толщина", "Qalınlıq"));
        words.add(new Word("Thread", "Резьба", "Yiv"));
        words.add(new Word("Thread Gauge", "Резьбовой калибр", "Yiv ölçən"));
        words.add(new Word("Tool", "Инструмент", "Alət"));
        words.add(new Word("Tool Change", "Замена инструмента", "Alətin dəyişdirilməsi"));
        words.add(new Word("Tool Holder", "Держатель инструмента", "Alət tutacağı"));
        words.add(new Word("Tool Life", "Срок службы инструмента", "Alətin xidmət müddəti"));
        words.add(new Word("Torque", "Крутящий момент", "Fırlanma momenti"));
        words.add(new Word("Torque Wrench", "Динамометрический ключ", "Dinamometrik açar"));
        words.add(new Word("Training", "Обучение", "Təlim"));
        words.add(new Word("Turning", "Токарная обработка", "Torna emalı"));

        // ================= U =================
        words.add(new Word("Unclamp", "Освободить зажим", "Sıxacı açmaq"));
        words.add(new Word("Unclamping", "Разжим", "Sıxacın açılması"));
        words.add(new Word("Uniformity", "Однородность", "Vahidlik"));
        words.add(new Word("Unit", "Единица", "Vahid"));
        words.add(new Word("Urgent", "Срочный", "Təcili"));

        // ================= V =================
        words.add(new Word("Valve", "Клапан", "Klapan"));
        words.add(new Word("Vernier Caliper", "Штангенциркуль", "Ştangensirkul"));
        words.add(new Word("Vibration", "Вибрация", "Vibrasiya"));
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
        words.add(new Word("Worker", "Рабочий", "İşçi"));
        words.add(new Word("Work Bench", "Верстак", "İş dəzgahı"));
        words.add(new Word("Workpiece", "Заготовка / деталь", "İş parçası"));
        words.add(new Word("Workplace", "Рабочее место", "İş yeri"));
        words.add(new Word("Workshop", "Цех", "Sex"));
        words.add(new Word("Wrench", "Гаечный ключ", "Açar"));

        // ================= X =================
        words.add(new Word("X-Axis", "Ось X", "X oxu"));
        words.add(new Word("X-Axis Limit", "Концевой предел оси X", "X oxunun son həddi"));

        // ================= Y =================
        words.add(new Word("Y-Axis", "Ось Y", "Y oxu"));
        words.add(new Word("Y-Axis Limit", "Концевой предел оси Y", "Y oxunun son həddi"));

        // ================= Z =================
        words.add(new Word("Z-Axis", "Ось Z", "Z oxu"));
        words.add(new Word("Z-Axis Limit", "Концевой предел оси Z", "Z oxunun son həddi"));
        words.add(new Word("Zero Point", "Нулевая точка", "Sıfır nöqtəsi"));

        // ================= FIRE SAFETY =================
        words.add(new Word("Water Extinguisher", "Водный огнетушитель", "Su ilə yanğınsöndürən"));
        words.add(new Word("Foam Extinguisher", "Пенный огнетушитель", "Köpüklü yanğınsöndürən"));
        words.add(new Word("Dry Powder Extinguisher", "Порошковый огнетушитель", "Tozlu yanğınsöndürən"));
        words.add(new Word("Carbon Dioxide Extinguisher", "Углекислотный огнетушитель", "Karbon qazlı yanğınsöndürən"));
        words.add(new Word("CO2 Extinguisher", "CO2-огнетушитель", "CO2 yanğınsöndürən"));
        words.add(new Word("Wet Chemical Extinguisher", "Огнетушитель с химическим раствором", "Yaş kimyəvi yanğınsöndürən"));
        words.add(new Word("Clean Agent Extinguisher", "Огнетушитель с чистым агентом", "Təmiz agentli yanğınsöndürən"));
        words.add(new Word("Fire Extinguisher Class", "Класс огнетушителя", "Yanğınsöndürən sinfi"));
        words.add(new Word("Class A Fire", "Пожар класса A", "A sinfi yanğın"));
        words.add(new Word("Class B Fire", "Пожар класса B", "B sinfi yanğın"));
        words.add(new Word("Class C Fire", "Пожар класса C", "C sinfi yanğın"));
        words.add(new Word("Class D Fire", "Пожар класса D", "D sinfi yanğın"));
        words.add(new Word("Class F Fire", "Пожар класса F", "F sinfi yanğın"));
        words.add(new Word("Electrical Fire", "Электрический пожар", "Elektrik yanğını"));
        words.add(new Word("Metal Fire", "Пожар металлов", "Metal yanğını"));
        words.add(new Word("Oil Fire", "Пожар масла", "Yağ yanğını"));
        words.add(new Word("Gas Fire", "Пожар газа", "Qaz yanğını"));
        words.add(new Word("Fire Blanket", "Противопожарное покрывало", "Yanğın örtüyü"));
        words.add(new Word("Fire Bucket", "Противопожарное ведро", "Yanğın vedrəsi"));
        words.add(new Word("Fire Pump", "Пожарный насос", "Yanğın nasosu"));
        words.add(new Word("Fire Hydrant", "Пожарный гидрант", "Yanğın hidrantı"));
        words.add(new Word("Fire Cabinet", "Пожарный шкаф", "Yanğın şkafı"));
        words.add(new Word("Fire Hose", "Пожарный шланг", "Yanğın şlanqı"));
        words.add(new Word("Fire Nozzle", "Пожарный ствол", "Yanğın lüləsi"));
        words.add(new Word("Fire Detector", "Пожарный датчик", "Yanğın detektoru"));
        words.add(new Word("Heat Detector", "Тепловой датчик", "İstilik detektoru"));
        words.add(new Word("Fire Alarm", "Пожарная сигнализация", "Yanğın siqnalizasiyası"));
        words.add(new Word("Fire Alarm Panel", "Панель пожарной сигнализации", "Yanğın siqnalizasiya paneli"));
        words.add(new Word("Fire Door", "Противопожарная дверь", "Yanğın qapısı"));
        words.add(new Word("Fire Safety", "Пожарная безопасность", "Yanğın təhlükəsizliyi"));
        words.add(new Word("Fire Prevention", "Предотвращение пожара