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
        words.add(new Word("Alignment", "Центровка", "Mərkəzləmə"));
        words.add(new Word("Allen Key", "Шестигранный ключ", "Altıbucaqlı açar"));
        words.add(new Word("Aluminum", "Алюминий", "Alüminium"));
        words.add(new Word("Anode", "Анод", "Anod"));
        words.add(new Word("Anvil", "Наковальня", "Örs"));
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
        words.add(new Word("Bore", "Отверстие", "Dəlik"));
        words.add(new Word("Boring", "Расточка", "Burğu ilə genişləndirmə"));
        words.add(new Word("Brake", "Тормоз", "Əyləc"));
        words.add(new Word("Brush", "Щётка", "Fırça"));
        words.add(new Word("Bushing", "Втулка", "Giliz"));
        words.add(new Word("Button", "Кнопка", "Düymə"));
        words.add(new Word("Burr", "Заусенец", "Qrat"));

        // ================= C =================
        words.add(new Word("Cable", "Кабель", "Kabel"));
        words.add(new Word("Caliper", "Штангенциркуль", "Ştangensirkul"));
        words.add(new Word("Capacity", "Вместимость / мощность", "Tutum"));
        words.add(new Word("Chamfer", "Фаска", "Faska"));
        words.add(new Word("Chain", "Цепь", "Zəncir"));
        words.add(new Word("Chisel", "Зубило", "Kəski"));
        words.add(new Word("Chuck", "Патрон", "Patron"));
        words.add(new Word("Circular Saw", "Дисковая пила", "Dairəvi mişar"));
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
        words.add(new Word("Cutter", "Резец / фреза", "Kəsici"));
        words.add(new Word("Cutting", "Резка", "Kəsmə"));
        words.add(new Word("Cutting Insert", "Режущая пластина", "Kəsici lövhə"));
        words.add(new Word("Cutting Speed", "Скорость резания", "Kəsmə sürəti"));
        words.add(new Word("Cutting Tool", "Режущий инструмент", "Kəsici alət"));
        words.add(new Word("Cycle", "Цикл", "Tsikl"));

        // ================= D =================
        words.add(new Word("Data", "Данные", "Məlumat"));
        words.add(new Word("Deburring", "Удаление заусенцев", "Qratların təmizlənməsi"));
        words.add(new Word("Deburring Tool", "Инструмент для удаления заусенцев", "Qrat təmizləmə aləti"));
        words.add(new Word("Defect", "Дефект", "Qüsur"));
        words.add(new Word("Deflection", "Прогиб / отклонение", "Əyilmə"));
        words.add(new Word("Depth", "Глубина", "Dərinlik"));
        words.add(new Word("Depth Gauge", "Глубиномер", "Dərinlik ölçən"));
        words.add(new Word("Diameter", "Диаметр", "Diametr"));
        words.add(new Word("Die", "Матрица", "Matris"));
        words.add(new Word("Die Alignment", "Центровка матрицы", "Matrisin mərkəzlənməsi"));
        words.add(new Word("Die Holder", "Держатель матрицы", "Matris tutacağı"));
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
        words.add(new Word("End Mill", "Концевая фреза", "Uc frez"));
        words.add(new Word("Energy", "Энергия", "Enerji"));
        words.add(new Word("Equipment", "Оборудование", "Avadanlıq"));
        words.add(new Word("Error", "Ошибка", "Səhv"));
        words.add(new Word("Extension Cord", "Удлинитель", "Uzatma kabeli"));

        // ================= F =================
        words.add(new Word("Face Mill", "Торцевая фреза", "Üz frezi"));
        words.add(new Word("Factory", "Завод", "Zavod"));
        words.add(new Word("Feed", "Подача", "Veriş"));
        words.add(new Word("Feed Rate", "Скорость подачи", "Veriş sürəti"));
        words.add(new Word("File", "Напильник", "Ələk"));
        words.add(new Word("Filter", "Фильтр", "Filtr"));
        words.add(new Word("Finishing", "Чистовая обработка", "Təmiz emal"));
        words.add(new Word("Fixture", "Приспособление", "Qurğu"));
        words.add(new Word("Flange", "Фланец", "Flanş"));
        words.add(new Word("Force", "Сила", "Qüvvə"));
        words.add(new Word("Forklift", "Погрузчик", "Forklift"));
        words.add(new Word("Furnace", "Печь", "Soba"));

        // ================= G =================
        words.add(new Word("Galvanic Process", "Гальванический процесс", "Qalvanik proses"));
        words.add(new Word("Gas", "Газ", "Qaz"));
        words.add(new Word("Gauge", "Измерительный прибор", "Ölçü cihazı"));
        words.add(new Word("Gear", "Шестерня", "Dişli"));
        words.add(new Word("Gearbox", "Редуктор / коробка передач", "Sürət qutusu"));
        words.add(new Word("Gloves", "Перчатки", "Əlcəklər"));
        words.add(new Word("Grinding", "Шлифование", "Daşlama"));
        words.add(new Word("Grinding Wheel", "Шлифовальный круг", "Daşlama dairəsi"));
        words.add(new Word("Grounding", "Заземление", "Torpaqlama"));
        words.add(new Word("Guard", "Защитное ограждение", "Qoruyucu hasar"));

        // ================= H =================
        words.add(new Word("Hacksaw", "Ножовка", "Dəmir mişarı"));
        words.add(new Word("Hammer", "Молоток", "Çəkic"));
        words.add(new Word("Hand Drill", "Ручная дрель", "Əl burğusu"));
        words.add(new Word("Hand Tool", "Ручной инструмент", "Əl aləti"));
        words.add(new Word("Hardness", "Твёрдость", "Sərtlik"));
        words.add(new Word("Hazard", "Опасность", "Təhlükə"));
        words.add(new Word("Heat Treatment", "Термическая обработка", "İstilik emalı"));
        words.add(new Word("Heating Element", "Нагревательный элемент", "Qızdırıcı element"));
        words.add(new Word("Helmet", "Каска", "Dəbilqə"));
        words.add(new Word("Height", "Высота", "Hündürlük"));
        words.add(new Word("Hydraulic", "Гидравлический", "Hidravlik"));
        words.add(new Word("Hydraulic Cylinder", "Гидроцилиндр", "Hidravlik silindr"));
        words.add(new Word("Hydraulic Oil", "Гидравлическое масло", "Hidravlik yağ"));
        words.add(new Word("Hydraulic Pressure", "Гидравлическое давление", "Hidravlik təzyiq"));

        // ================= I =================
        words.add(new Word("Impact Wrench", "Ударный гайковёрт", "Zərbəli qayka açarı"));
        words.add(new Word("Indicator", "Индикатор", "İndikator"));
        words.add(new Word("Inspection", "Проверка", "Yoxlama"));
        words.add(new Word("Inspection Report", "Отчёт о проверке", "Yoxlama hesabatı"));
        words.add(new Word("Insulation", "Изоляция", "İzolyasiya"));
        words.add(new Word("Internal Thread", "Внутренняя резьба", "Daxili yiv"));
        words.add(new Word("Iron", "Железо", "Dəmir"));

        // ================= J =================
        words.add(new Word("Jig", "Кондуктор", "Konduktor"));
        words.add(new Word("Jaw", "Губка патрона", "Patron çənəsi"));
        words.add(new Word("Job", "Работа / задание", "İş"));
        words.add(new Word("Joint", "Соединение", "Birləşmə"));

        // ================= K =================
        words.add(new Word("Key", "Шпонка / ключ", "Şponka / açar"));
        words.add(new Word("Keyway", "Шпоночный паз", "Şponka yuvası"));
        words.add(new Word("Knife", "Нож", "Bıçaq"));
        words.add(new Word("Knurling", "Накатка", "Rifləmə"));

        // ================= L =================
        words.add(new Word("Lathe", "Токарный станок", "Torna dəzgahı"));
        words.add(new Word("Lathe Tool", "Токарный резец", "Torna aləti"));
        words.add(new Word("Length", "Длина", "Uzunluq"));
        words.add(new Word("Level", "Уровень", "Səviyyə"));
        words.add(new Word("Limit Switch", "Концевой выключатель", "Son açarı"));
        words.add(new Word("Lock Nut", "Стопорная гайка", "Kilid qaykası"));
        words.add(new Word("Lubricant", "Смазка", "Sürtkü"));
        words.add(new Word("Lubrication", "Смазывание", "Yağlama"));

        // ================= M =================
        words.add(new Word("Machine", "Станок / машина", "Dəzgah"));
        words.add(new Word("Machine Bed", "Станина", "Dəzgah yatağı"));
        words.add(new Word("Machine Guard", "Защитное ограждение станка", "Dəzgah qoruyucusu"));
        words.add(new Word("Machine Table", "Стол станка", "Dəzgah masası"));
        words.add(new Word("Machine Vice", "Машинные тиски", "Dəzgah məngənəsi"));
        words.add(new Word("Maintenance", "Техническое обслуживание", "Texniki xidmət"));
        words.add(new Word("Manual", "Руководство / ручной", "Təlimat / əl ilə"));
        words.add(new Word("Material", "Материал", "Material"));
        words.add(new Word("Material Grade", "Марка материала", "Material markası"));
        words.add(new Word("Measure", "Измерять", "Ölçmək"));
        words.add(new Word("Measurement", "Измерение", "Ölçmə"));
        words.add(new Word("Measuring Tool", "Измерительный инструмент", "Ölçü aləti"));
        words.add(new Word("Metal", "Металл", "Metal"));
        words.add(new Word("Micrometer", "Микрометр", "Mikrometr"));
        words.add(new Word("Milling", "Фрезерование", "Frezləmə"));
        words.add(new Word("Milling Cutter", "Фреза", "Frez"));
        words.add(new Word("Motor", "Двигатель", "Mühərrik"));

        // ================= N =================
        words.add(new Word("Needle Valve", "Игольчатый клапан", "İynə klapanı"));
        words.add(new Word("Nipple", "Ниппель", "Nipelin"));
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
        words.add(new Word("Output", "Выход / выпуск", "Çıxış / istehsal"));
        words.add(new Word("Overheat", "Перегрев", "Həddindən artıq qızma"));
        words.add(new Word("Overload", "Перегрузка", "Həddindən artıq yüklənmə"));
        words.add(new Word("Outside Diameter", "Наружный диаметр", "Xarici diametr"));

        // ================= P =================
        words.add(new Word("Part", "Деталь", "Detal"));
        words.add(new Word("Part Number", "Номер детали", "Detal nömrəsi"));
        words.add(new Word("Pliers", "Плоскогубцы", "Kəlbətin"));
        words.add(new Word("Power Supply", "Источник питания", "Qida mənbəyi"));
        words.add(new Word("PPE", "Средства индивидуальной защиты", "Fərdi mühafizə vasitələri"));
        words.add(new Word("Press", "Пресс", "Pres"));
        words.add(new Word("Pressure", "Давление", "Təzyiq"));
        words.add(new Word("Pressure Gauge", "Манометр", "Təzyiq ölçən"));
        words.add(new Word("Production", "Производство", "İstehsal"));
        words.add(new Word("Product", "Продукт / изделие", "Məhsul"));
        words.add(new Word("Process", "Процесс", "Proses"));
        words.add(new Word("Punch", "Пуансон / пробойник", "Puanson"));
        words.add(new Word("Punch Press", "Пресс-штамп", "Ştamplama presi"));

        // ================= Q =================
        words.add(new Word("Quality", "Качество", "Keyfiyyət"));
        words.add(new Word("Quality Control", "Контроль качества", "Keyfiyyətə nəzarət"));
        words.add(new Word("Quality Check", "Проверка качества", "Keyfiyyət yoxlaması"));
        words.add(new Word("Quality Inspector", "Инспектор качества", "Keyfiyyət müfəttişi"));
        words.add(new Word("Quality Standard", "Стандарт качества", "Keyfiyyət standartı"));
        words.add(new Word("Quenching", "Закалка", "Sərtləşdirmə"));

        // ================= R =================
        words.add(new Word("Raw Material", "Сырьё", "Xammal"));
        words.add(new Word("Reamer", "Развёртка", "Rayber"));
        words.add(new Word("Reference Point", "Точка отсчёта", "İstinad nöqtəsi"));
        words.add(new Word("Relay", "Реле", "Rele"));
        words.add(new Word("Repair", "Ремонт", "Təmir"));
        words.add(new Word("Replace", "Заменять", "Dəyişmək"));
        words.add(new Word("Replacement Part", "Запасная деталь", "Ehtiyat detal"));
        words.add(new Word("Report", "Отчёт", "Hesabat"));
        words.add(new Word("Rejected Part", "Бракованная деталь", "Rədd edilmiş detal"));
        words.add(new Word("Risk", "Риск", "Risk"));
        words.add(new Word("Robot", "Робот", "Robot"));
        words.add(new Word("Ruler", "Линейка", "Xətkeş"));
        words.add(new Word("Runout", "Биение", "Radial sapma"));

        // ================= S =================
        words.add(new Word("Safety", "Безопасность", "Təhlükəsizlik"));
        words.add(new Word("Safety Glasses", "Защитные очки", "Qoruyucu eynək"));
        words.add(new Word("Safety Shoes", "Защитная обувь", "Qoruyucu ayaqqabı"));
        words.add(new Word("Safety Rule", "Правило безопасности", "Təhlükəsizlik qaydası"));
        words.add(new Word("Safety Training", "Обучение по безопасности", "Təhlükəsizlik təlimi"));
        words.add(new Word("Sensor", "Датчик", "Sensor"));
        words.add(new Word("Setting", "Настройка", "Tənzimləmə"));
        words.add(new Word("Sheet Metal", "Листовой металл", "Sac metal"));
        words.add(new Word("Socket Wrench", "Торцевой ключ", "Başlıqlı açar"));
        words.add(new Word("Spindle", "Шпиндель", "Şpindel"));
        words.add(new Word("Speed", "Скорость", "Sürət"));
        words.add(new Word("Spanner", "Гаечный ключ", "Açar"));
        words.add(new Word("Spring", "Пружина", "Yay"));
        words.add(new Word("Steel", "Сталь", "Polad"));
        words.add(new Word("Stop Button", "Кнопка остановки", "Dayandırma düyməsi"));
        words.add(new Word("Surface Finish", "Качество поверхности", "Səth keyfiyyəti"));
        words.add(new Word("Switch", "Выключатель / переключатель", "Açar"));
        words.add(new Word("System", "Система", "Sistem"));

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
        words.add(new Word("Tool Change", "Смена инструмента", "Alətin dəyişdirilməsi"));
        words.add(new Word("Tool Holder", "Держатель инструмента", "Alət tutacağı"));
        words.add(new Word("Tool Life", "Стойкость инструмента", "Alətin xidmət müddəti"));
        words.add(new Word("Torque", "Крутящий момент", "Fırlanma momenti"));
        words.add(new Word("Torque Wrench", "Динамометрический ключ", "Tork açarı"));
        words.add(new Word("Training", "Обучение", "Təlim"));
        words.add(new Word("Turning", "Точение", "Tornalama"));

        // ================= U =================
        words.add(new Word("Unclamp", "Разжимать", "Boşaltmaq"));
        words.add(new Word("Unclamping", "Разжим", "Boşaltma"));
        words.add(new Word("Uniformity", "Однородность", "Bərabərlik"));
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
        words.add(new Word("Wire", "Провод", "Naqil"));
        words.add(new Word("Worker", "Рабочий", "İşçi"));
        words.add(new Word("Work Bench", "Верстак", "İş dəzgahı"));
        words.add(new Word("Workpiece", "Заготовка / деталь", "İş parçası"));
        words.add(new Word("Workplace", "Рабочее место", "İş yeri"));
        words.add(new Word("Workshop", "Цех / мастерская", "Sex / emalatxana"));
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

        // ================= CNC =================
        words.add(new Word("Coordinate", "Координата", "Koordinat"));
        words.add(new Word("Coordinate System", "Система координат", "Koordinat sistemi"));
        words.add(new Word("Machine Coordinate", "Координата станка", "Dəzgah koordinatı"));
        words.add(new Word("Work Coordinate", "Рабочая координата", "İş koordinatı"));
        words.add(new Word("Machine Zero", "Ноль станка", "Dəzgah sıfırı"));
        words.add(new Word("Work Zero", "Рабочий ноль", "İş sıfırı"));
        words.add(new Word("Program Number", "Номер программы", "Proqram nömrəsi"));
        words.add(new Word("Program Block", "Блок программы", "Proqram bloku"));
        words.add(new Word("Program Stop", "Остановка программы", "Proqramın dayandırılması"));
        words.add(new Word("Program Start", "Запуск программы", "Proqramın işə salınması"));
        words.add(new Word("Machine Cycle", "Цикл станка", "Dəzgah tsikli"));
        words.add(new Word("Cycle Time", "Время цикла", "Tsikl vaxtı"));
        words.add(new Word("Tool Length", "Длина инструмента", "Alətin uzunluğu"));
        words.add(new Word("Tool Diameter", "Диаметр инструмента", "Alətin diametri"));
        words.add(new Word("Tool Number", "Номер инструмента", "Alət nömrəsi"));
        words.add(new Word("Tool Magazine", "Магазин инструментов", "Alət magazini"));
        words.add(new Word("Tool Measurement", "Измерение инструмента", "Alətin ölçülməsi"));
        words.add(new Word("Tool Compensation", "Компенсация инструмента", "Alət kompensasiyası"));
        words.add(new Word("Tool Wear Compensation", "Компенсация износа инструмента", "Alət aşınması kompensasiyası"));
        words.add(new Word("Spindle Speed", "Скорость шпинделя", "Şpindel sürəti"));
        words.add(new Word("Spindle Motor", "Двигатель шпинделя", "Şpindel mühərriki"));
        words.add(new Word("Spindle Load", "Нагрузка шпинделя", "Şpindel yükü"));
        words.add(new Word("Spindle Direction", "Направление вращения шпинделя", "Şpindel fırlanma istiqaməti"));
        words.add(new Word("Rapid Movement", "Быстрое перемещение", "Sürətli hərəkət"));
        words.add(new Word("Rapid Feed", "Быстрая подача", "Sürətli veriş"));
        words.add(new Word("Feed Override", "Коррекция подачи", "Veriş korreksiyası"));
        words.add(new Word("Spindle Override", "Коррекция скорости шпинделя", "Şpindel sürət korreksiyası"));
        words.add(new Word("Machine Alarm", "Аварийный сигнал станка", "Dəzgah siqnalı"));
        words.add(new Word("Alarm Code", "Код аварии", "Siqnal kodu"));
        words.add(new Word("Error Code", "Код ошибки", "Səhv kodu"));
        words.add(new Word("Parameter", "Параметр", "Parametr"));
        words.add(new Word("Machine Parameter", "Параметр станка", "Dəzgah parametri"));
        words.add(new Word("Control Unit", "Блок управления", "İdarəetmə bloku"));
        words.add(new Word("Control Screen", "Экран управления", "İdarəetmə ekranı"));
        words.add(new Word("Manual Mode", "Ручной режим", "Əl rejimi"));
        words.add(new Word("Automatic Mode", "Автоматический режим", "Avtomatik rejim"));
        words.add(new Word("Jog Mode", "Режим ручного перемещения", "Əl ilə hərəkət rejimi"));
        words.add(new Word("Single Block", "Покадровый режим", "Tək blok rejimi"));
        words.add(new Word("Dry Run", "Холостой прогон", "Boş gediş"));
        words.add(new Word("Simulation", "Симуляция", "Simulyasiya"));
        words.add(new Word("Feed Hold", "Остановка подачи", "Verişin saxlanması"));
        words.add(new Word("Reset", "Сброс", "Sıfırlama"));
        words.add(new Word("Machine Reset", "Сброс станка", "Dəzgahın sıfırlanması"));
        words.add(new Word("Reference Return", "Возврат в исходную точку", "İstinad nöqtəsinə qayıdış"));
        words.add(new Word("Home Position", "Домашняя позиция", "Başlanğıc mövqeyi"));
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
        words.add(new Word("Machining Time", "Время обработки", "Emal vaxtı"));
        words.add(new Word("Cutting Depth", "Глубина резания", "Kəsmə dərinliyi"));
        words.add(new Word("Cutting Width", "Ширина резания", "Kəsmə eni"));
        words.add(new Word("Chip", "Стружка", "Yonqar"));
        words.add(new Word("Chip Removal", "Удаление стружки", "Yonqarın çıxarılması"));
        words.add(new Word("Chip Conveyor", "Конвейер для стружки", "Yonqar konveyeri"));
        words.add(new Word("Chip Breaker", "Стружколом", "Yonqar qırıcı"));
        words.add(new Word("Coolant Pump", "Насос охлаждающей жидкости", "Soyuducu maye nasosu"));
        words.add(new Word("Coolant Tank", "Бак охлаждающей жидкости", "Soyuducu maye çəni"));
        words.add(new Word("Coolant Flow", "Поток охлаждающей жидкости", "Soyuducu maye axını"));
        words.add(new Word("Coolant Pressure", "Давление охлаждающей жидкости", "Soyuducu maye təzyiqi"));

        // ================= STAMPING =================
        words.add(new Word("Stamping", "Штамповка", "Ştamplama"));
        words.add(new Word("Stamping Machine", "Штамповочная машина", "Ştamplama maşını"));
        words.add(new Word("Stamping Press", "Штамповочный пресс", "Ştamplama presi"));
        words.add(new Word("Stamping Die", "Штамповочная матрица", "Ştamplama matrisi"));
        words.add(new Word("Press Brake", "Листогибочный пресс", "List əyən pres"));
        words.add(new Word("Hydraulic Press", "Гидравлический пресс", "Hidravlik pres"));
        words.add(new Word("Mechanical Press", "Механический пресс", "Mexaniki pres"));
        words.add(new Word("Press Force", "Усилие пресса", "Pres qüvvəsi"));
        words.add(new Word("Press Capacity", "Мощность пресса", "Pres gücü"));
        words.add(new Word("Press Stroke", "Ход пресса", "Pres gedişi"));
        words.add(new Word("Press Speed", "Скорость пресса", "Pres sürəti"));
        words.add(new Word("Press Table", "Стол пресса", "Pres masası"));
        words.add(new Word("Press Ram", "Ползун пресса", "Pres sürgüsü"));
        words.add(new Word("Press Frame", "Рама пресса", "Pres çərçivəsi"));
        words.add(new Word("Press Bed", "Станина пресса", "Pres yatağı"));
        words.add(new Word("Die Set", "Комплект штампа", "Ştamp dəsti"));
        words.add(new Word("Upper Die", "Верхняя матрица", "Üst matris"));
        words.add(new Word("Lower Die", "Нижняя матрица", "Alt matris"));
        words.add(new Word("Punch Holder", "Держатель пуансона", "Puanson tutacağı"));
        words.add(new Word("Guide Pin", "Направляющий штифт", "Yönləndirici ştift"));
        words.add(new Word("Guide Bush", "Направляющая втулка", "Yönləndirici giliz"));
        words.add(new Word("Stripper Plate", "Съёмная плита", "Sökücü lövhə"));
        words.add(new Word("Backing Plate", "Опорная плита", "Dayaq lövhəsi"));
        words.add(new Word("Pressure Plate", "Прижимная плита", "Sıxıcı lövhə"));
        words.add(new Word("Blank", "Заготовка", "Pəstah"));
        words.add(new Word("Blanking", "Вырубка", "Kəsmə əməliyyatı"));
        words.add(new Word("Blank Holder", "Прижим заготовки", "Pəstah sıxıcısı"));
        words.add(new Word("Blank Thickness", "Толщина заготовки", "Pəstah qalınlığı"));
        words.add(new Word("Bending Operation", "Операция гибки", "Bükmə əməliyyatı"));
        words.add(new Word("Bending Force", "Усилие гибки", "Bükmə qüvvəsi"));
        words.add(new Word("Bending Angle", "Угол гибки", "Bükmə bucağı"));
        words.add(new Word("Bending Radius", "Радиус гибки", "Bükmə radiusu"));
        words.add(new Word("Deep Drawing", "Глубокая вытяжка", "Dərin dartma"));
        words.add(new Word("Drawing Operation", "Операция вытяжки", "Dartma əməliyyatı"));
        words.add(new Word("Drawing Die", "Матрица для вытяжки", "Dartma matrisi"));
        words.add(new Word("Drawing Punch", "Пуансон для вытяжки", "Dartma puansonu"));
        words.add(new Word("Forming", "Формовка", "Formalaşdırma"));
        words.add(new Word("Forming Tool", "Формовочный инструмент", "Formalaşdırma aləti"));
        words.add(new Word("Forming Force", "Усилие формовки", "Formalaşdırma qüvvəsi"));
        words.add(new Word("Piercing", "Пробивка отверстий", "Deşmə"));
        words.add(new Word("Piercing Tool", "Инструмент для пробивки", "Deşmə aləti"));
        words.add(new Word("Shearing", "Резка", "Kəsmə"));
        words.add(new Word("Shear Force", "Сила среза", "Kəsmə qüvvəsi"));
        words.add(new Word("Shear Blade", "Режущее лезвие", "Kəsici bıçaq"));
        words.add(new Word("Metal Sheet", "Металлический лист", "Metal təbəqə"));
        words.add(new Word("Sheet Thickness", "Толщина листа", "Sac qalınlığı"));
        words.add(new Word("Sheet Width", "Ширина листа", "Sac eni"));
        words.add(new Word("Sheet Length", "Длина листа", "Sac uzunluğu"));
        words.add(new Word("Sheet Edge", "Кромка листа", "Sac kənarı"));
        words.add(new Word("Coil", "Рулон металла", "Metal rulonu"));
        words.add(new Word("Metal Strip", "Металлическая полоса", "Metal zolaq"));
        words.add(new Word("Strip Width", "Ширина полосы", "Zolaq eni"));
        words.add(new Word("Strip Thickness", "Толщина полосы", "Zolaq qalınlığı"));
        words.add(new Word("Strip Feeder", "Подающее устройство", "Verici qurğu"));
        words.add(new Word("Feeding System", "Система подачи", "Veriş sistemi"));
        words.add(new Word("Feed Length", "Длина подачи", "Veriş uzunluğu"));
        words.add(new Word("Feed Pitch", "Шаг подачи", "Veriş addımı"));
        words.add(new Word("Die Clearance", "Зазор матрицы", "Matris boşluğu"));
        words.add(new Word("Punch Clearance", "Зазор пуансона", "Puanson boşluğu"));
        words.add(new Word("Die Life", "Срок службы матрицы", "Matrisin xidmət müddəti"));
        words.add(new Word("Punch Life", "Срок службы пуансона", "Puansonun xidmət müddəti"));
        words.add(new Word("Die Maintenance", "Обслуживание матрицы", "Matrisə texniki xidmət"));
        words.add(new Word("Die Repair", "Ремонт матрицы", "Matrisin təmiri"));
        words.add(new Word("Die Inspection", "Проверка матрицы", "Matrisin yoxlanılması"));
        words.add(new Word("Stamping Cycle", "Цикл штамповки", "Ştamplama tsikli"));
        words.add(new Word("Stamping Force", "Усилие штамповки", "Ştamplama qüvvəsi"));
        words.add(new Word("Stamping Speed", "Скорость штамповки", "Ştamplama sürəti"));
        words.add(new Word("Stamping Defect", "Дефект штамповки", "Ştamplama qüsuru"));
        words.add(new Word("Crack", "Трещина", "Çat"));
        words.add(new Word("Wrinkle", "Морщина / складка", "Qırış"));
        words.add(new Word("Scratch", "Царапина", "Cızıq"));
        words.add(new Word("Dent", "Вмятина", "Əzik"));
        words.add(new Word("Deformation", "Деформация", "Deformasiya"));
        words.add(new Word("Burr Height", "Высота заусенца", "Qrat hündürlüyü"));
        words.add(new Word("Part Ejection", "Выброс детали", "Detalın çıxarılması"));
        words.add(new Word("Ejection Pin", "Выталкивающий штифт", "Çıxarıcı ştift"));
        words.add(new Word("Ejector Plate", "Выталкивающая плита", "Çıxarıcı lövhə"));
        words.add(new Word("Scrap", "Отходы / брак", "Tullantı / qüsurlu məhsul"));
        words.add(new Word("Scrap Rate", "Процент отходов", "Tullantı faizi"));
        words.add(new Word("Scrap Container", "Контейнер для отходов", "Tullantı qabı"));
        words.add(new Word("Finished Part", "Готовая деталь", "Hazır detal"));

        return words;
    }
}