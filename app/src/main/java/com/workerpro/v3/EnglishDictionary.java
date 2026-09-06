package com.workerpro.v3;

import java.util.ArrayList;
import java.util.List;

public class EnglishDictionary {

    public static class Word {
        public String english;
        public String russian;
        public String azerbaijani;
        public String turkish;
        public String german;
        public String category;

        // Старый конструктор — сохраняем совместимость
        public Word(
                String english,
                String russian,
                String azerbaijani,
                String category) {

            this(
                    english,
                    russian,
                    azerbaijani,
                    english,
                    english,
                    category
            );
        }

        // Новый конструктор для 5 языков
        public Word(
                String english,
                String russian,
                String azerbaijani,
                String turkish,
                String german,
                String category) {

            this.english = english;
            this.russian = russian;
            this.azerbaijani = azerbaijani;
            this.turkish = turkish;
            this.german = german;
            this.category = category;
        }
    }

    // Старый способ добавления слова
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

    // Новый способ добавления слова на 5 языках
    private static void add(
            List<Word> words,
            String english,
            String russian,
            String azerbaijani,
            String turkish,
            String german,
            String category) {

        words.add(
                new Word(
                        english,
                        russian,
                        azerbaijani,
                        turkish,
                        german,
                        category
                )
        );
    }

    public static List<Word> getWords() {

        List<Word> words = new ArrayList<>();

        // =====================================================
        // WORK
        // =====================================================

        add(words, "Factory", "Завод", "Zavod",
                "Fabrika", "Fabrik", "WORK");

        add(words, "Workshop", "Цех", "Sex",
                "Atölye", "Werkstatt", "WORK");

        add(words, "Worker", "Рабочий", "İşçi",
                "İşçi", "Arbeiter", "WORK");

        add(words, "Operator", "Оператор", "Operator",
                "Operatör", "Bediener", "WORK");

        add(words, "Job", "Работа", "İş",
                "İş", "Arbeit", "WORK");

        add(words, "Task", "Задача", "Tapşırıq",
                "Görev", "Aufgabe", "WORK");

        add(words, "Production", "Производство", "İstehsalat",
                "Üretim", "Produktion", "WORK");

        add(words, "Product", "Продукт", "Məhsul",
                "Ürün", "Produkt", "WORK");

        add(words, "Process", "Процесс", "Proses",
                "Süreç", "Prozess", "WORK");

        add(words, "Operation", "Операция", "Əməliyyat",
                "Operasyon", "Arbeitsgang", "WORK");

        add(words, "Assembly", "Сборка", "Yığma",
                "Montaj", "Montage", "WORK");

        add(words, "Assembly Line", "Сборочная линия", "Yığım xətti",
                "Montaj hattı", "Montagelinie", "WORK");

        add(words, "Material", "Материал", "Material",
                "Malzeme", "Material", "WORK");

        add(words, "Raw Material", "Сырьё", "Xammal",
                "Hammadde", "Rohmaterial", "WORK");

        add(words, "Output", "Выпуск продукции", "Məhsul buraxılışı",
                "Üretim çıktısı", "Ausstoß", "WORK");

        add(words, "Production Rate", "Производительность", "İstehsal sürəti",
                "Üretim hızı", "Produktionsrate", "WORK");

        add(words, "Production Plan", "План производства", "İstehsal planı",
                "Üretim planı", "Produktionsplan", "WORK");

        add(words, "Production Order", "Производственный заказ", "İstehsal sifarişi",
                "Üretim emri", "Produktionsauftrag", "WORK");

        add(words, "Shift", "Смена", "Növbə",
                "Vardiya", "Schicht", "WORK");

        add(words, "Day Shift", "Дневная смена", "Gündüz növbəsi",
                "Gündüz vardiyası", "Tagschicht", "WORK");

        add(words, "Night Shift", "Ночная смена", "Gecə növbəsi",
                "Gece vardiyası", "Nachtschicht", "WORK");

        add(words, "Shift Change", "Смена смены", "Növbə dəyişməsi",
                "Vardiya değişimi", "Schichtwechsel", "WORK");

        add(words, "Workstation", "Рабочее место", "İş yeri",
                "Çalışma istasyonu", "Arbeitsplatz", "WORK");

        add(words, "Work Area", "Рабочая зона", "İş sahəsi",
                "Çalışma alanı", "Arbeitsbereich", "WORK");

        add(words, "Production Area", "Производственная зона", "İstehsal sahəsi",
                "Üretim alanı", "Produktionsbereich", "WORK");

        add(words, "Work Instruction", "Рабочая инструкция", "İş təlimatı",
                "İş talimatı", "Arbeitsanweisung", "WORK");

        add(words, "Standard Operation", "Стандартная операция", "Standart əməliyyat",
                "Standart operasyon", "Standardarbeitsgang", "WORK");

        add(words, "Work Order", "Рабочий заказ", "İş sifarişi",
                "İş emri", "Arbeitsauftrag", "WORK");

        add(words, "Downtime", "Простой", "Boşdayanma",
                "Duruş süresi", "Stillstandszeit", "WORK");

        add(words, "Production Time", "Время производства", "İstehsal vaxtı",
                "Üretim süresi", "Produktionszeit", "WORK");

        add(words, "Break Time", "Время перерыва", "Fasilə vaxtı",
                "Mola süresi", "Pausenzeit", "WORK");

        add(words, "Shift Leader", "Начальник смены", "Növbə rəisi",
                "Vardiya amiri", "Schichtleiter", "WORK");

        add(words, "Supervisor", "Руководитель", "Nəzarətçi",
                "Süpervizör", "Vorgesetzter", "WORK");

        add(words, "Team Leader", "Бригадир", "Briqadir",
                "Ekip lideri", "Teamleiter", "WORK");


        // =====================================================
        // MACHINE
        // =====================================================

        add(words, "Machine", "Станок", "Dəzgah",
                "Makine", "Maschine", "MACHINE");

        add(words, "Machine Bed", "Станина станка", "Dəzgah yatağı",
                "Makine gövdesi", "Maschinenbett", "MACHINE");

        add(words, "Machine Table", "Стол станка", "Dəzgah masası",
                "Makine tablası", "Maschinentisch", "MACHINE");

        add(words, "Machine Guard", "Защитное ограждение", "Qoruyucu mühafizə",
                "Makine koruması", "Maschinenschutz", "MACHINE");

        add(words, "Machine Setup", "Настройка станка", "Dəzgahın sazlanması",
                "Makine ayarı", "Maschineneinrichtung", "MACHINE");

        add(words, "Machine Reset", "Сброс станка", "Dəzgahın sıfırlanması",
                "Makine sıfırlama", "Maschinen-Reset", "MACHINE");

        add(words, "Machine Zero", "Ноль станка", "Dəzgah sıfırı",
                "Makine sıfırı", "Maschinennullpunkt", "MACHINE");

        add(words, "Motor", "Двигатель", "Mühərrik",
                "Motor", "Motor", "MACHINE");

        add(words, "Drive", "Привод", "Ötürücü",
                "Tahrik", "Antrieb", "MACHINE");

        add(words, "Gear", "Шестерня", "Dişli çarx",
                "Dişli", "Zahnrad", "MACHINE");

        add(words, "Gearbox", "Коробка передач", "Reduktor",
                "Dişli kutusu", "Getriebe", "MACHINE");

        add(words, "Bearing", "Подшипник", "Yastıq",
                "Rulman", "Lager", "MACHINE");

        add(words, "Belt", "Ремень", "Kəmər",
                "Kayış", "Riemen", "MACHINE");

        add(words, "Spindle", "Шпиндель", "Şpindel",
                "İş mili", "Spindel", "MACHINE");

        add(words, "Spindle Load", "Нагрузка шпинделя", "Şpindel yükü",
                "İş mili yükü", "Spindellast", "MACHINE");

        add(words, "Spindle Motor", "Двигатель шпинделя", "Şpindel mühərriki",
                "İş mili motoru", "Spindelmotor", "MACHINE");

        add(words, "Spindle Speed", "Скорость шпинделя", "Şpindel sürəti",
                "İş mili devri", "Spindeldrehzahl", "MACHINE");

        add(words, "Limit Switch", "Концевой выключатель", "Son açar",
                "Limit anahtarı", "Endschalter", "MACHINE");

        add(words, "Sensor", "Датчик", "Sensor",
                "Sensör", "Sensor", "MACHINE");

        add(words, "Button", "Кнопка", "Düymə",
                "Düğme", "Taste", "MACHINE");

        add(words, "Control Panel", "Панель управления", "İdarəetmə paneli",
                "Kontrol paneli", "Bedienfeld", "MACHINE");

        add(words, "Alarm", "Аварийный сигнал", "Siqnal",
                "Alarm", "Alarm", "MACHINE");

        add(words, "Error", "Ошибка", "Xəta",
                "Hata", "Fehler", "MACHINE");

        add(words, "Error Code", "Код ошибки", "Xəta kodu",
                "Hata kodu", "Fehlercode", "MACHINE");

        add(words, "Machine Cover", "Крышка станка", "Dəzgah qapağı",
                "Makine kapağı", "Maschinenabdeckung", "MACHINE");

        add(words, "Machine Door", "Дверь станка", "Dəzgah qapısı",
                "Makine kapısı", "Maschinentür", "MACHINE");

        add(words, "Machine Cabinet", "Корпус станка", "Dəzgah şkafı",
                "Makine kabini", "Maschinengehäuse", "MACHINE");

        add(words, "Electrical Cabinet", "Электрический шкаф", "Elektrik şkafı",
                "Elektrik panosu", "Schaltschrank", "MACHINE");

        add(words, "Hydraulic System", "Гидравлическая система", "Hidravlik sistem",
                "Hidrolik sistem", "Hydrauliksystem", "MACHINE");

        add(words, "Hydraulic Pump", "Гидравлический насос", "Hidravlik nasos",
                "Hidrolik pompa", "Hydraulikpumpe", "MACHINE");

        add(words, "Hydraulic Pressure", "Гидравлическое давление", "Hidravlik təzyiq",
                "Hidrolik basınç", "Hydraulikdruck", "MACHINE");

        add(words, "Hydraulic Valve", "Гидравлический клапан", "Hidravlik klapan",
                "Hidrolik valf", "Hydraulikventil", "MACHINE");

        add(words, "Pneumatic System", "Пневматическая система", "Pnevmatik sistem",
                "Pnömatik sistem", "Pneumatiksystem", "MACHINE");

        add(words, "Air Pressure", "Давление воздуха", "Hava təzyiqi",
                "Hava basıncı", "Luftdruck", "MACHINE");

        add(words, "Air Filter", "Воздушный фильтр", "Hava filtri",
                "Hava filtresi", "Luftfilter", "MACHINE");

        add(words, "Solenoid Valve", "Соленоидный клапан", "Solenoid klapan",
                "Solenoid valf", "Magnetventil", "MACHINE");

        add(words, "Actuator", "Исполнительный механизм", "İcra mexanizmi",
                "Aktüatör", "Stellantrieb", "MACHINE");

        add(words, "Cylinder", "Цилиндр", "Silindr",
                "Silindir", "Zylinder", "MACHINE");

        add(words, "Piston", "Поршень", "Porşen",
                "Piston", "Kolben", "MACHINE");

        add(words, "Valve", "Клапан", "Klapan",
                "Valf", "Ventil", "MACHINE");

        add(words, "Pump", "Насос", "Nasos",
                "Pompa", "Pumpe", "MACHINE");

        add(words, "Pressure", "Давление", "Təzyiq",
                "Basınç", "Druck", "MACHINE");

        add(words, "Flow", "Поток", "Axın",
                "Akış", "Durchfluss", "MACHINE");

        add(words, "Temperature Sensor", "Датчик температуры", "Temperatur sensoru",
                "Sıcaklık sensörü", "Temperatursensor", "MACHINE");


        // =====================================================
        // CNC
        // =====================================================

        add(words, "CNC Machine", "Станок с ЧПУ", "CNC dəzgahı",
                "CNC makinesi", "CNC-Maschine", "CNC");

        add(words, "CNC Control", "Управление ЧПУ", "CNC idarəetməsi",
                "CNC kontrolü", "CNC-Steuerung", "CNC");

        add(words, "CNC Program", "Программа ЧПУ", "CNC proqramı",
                "CNC programı", "CNC-Programm", "CNC");

        add(words, "CNC Programmer", "Программист ЧПУ", "CNC proqramçısı",
                "CNC programcısı", "CNC-Programmierer", "CNC");

        add(words, "Program Number", "Номер программы", "Proqram nömrəsi",
                "Program numarası", "Programmnummer", "CNC");

        add(words, "Program Block", "Блок программы", "Proqram bloku",
                "Program bloğu", "Programmsatz", "CNC");

        add(words, "Program Start", "Запуск программы", "Proqramın başlanması",
                "Program başlatma", "Programmstart", "CNC");

        add(words, "Program Stop", "Остановка программы", "Proqramın dayandırılması",
                "Program durdurma", "Programmstopp", "CNC");

        add(words, "Cycle", "Цикл", "Sikl",
                "Çevrim", "Zyklus", "CNC");

        add(words, "Cycle Time", "Время цикла", "Sikl vaxtı",
                "Çevrim süresi", "Zykluszeit", "CNC");

        add(words, "Feed", "Подача", "Veriş",
                "İlerleme", "Vorschub", "CNC");

        add(words, "Feed Rate", "Скорость подачи", "Veriş sürəti",
                "İlerleme hızı", "Vorschubgeschwindigkeit", "CNC");

        add(words, "Feed Hold", "Остановка подачи", "Verişin saxlanması",
                "İlerleme durdurma", "Vorschubhalt", "CNC");

        add(words, "Rapid Feed", "Быстрая подача", "Sürətli veriş",
                "Hızlı ilerleme", "Eilgang", "CNC");

        add(words, "Rapid Movement", "Быстрое перемещение", "Sürətli hərəkət",
                "Hızlı hareket", "Schnellbewegung", "CNC");

        add(words, "Dry Run", "Пробный запуск", "Sınaq işə salınması",
                "Kuru çalışma", "Probelauf", "CNC");

        add(words, "Single Block", "Покадровый режим", "Tək blok",
                "Tek blok", "Einzelsatz", "CNC");

        add(words, "Coordinate", "Координата", "Koordinat",
                "Koordinat", "Koordinate", "CNC");

        add(words, "Coordinate System", "Система координат", "Koordinat sistemi",
                "Koordinat sistemi", "Koordinatensystem", "CNC");

        add(words, "Machine Coordinate", "Координата станка", "Dəzgah koordinatı",
                "Makine koordinatı", "Maschinenkoordinate", "CNC");

        add(words, "Work Coordinate", "Рабочая координата", "İş koordinatı",
                "İş koordinatı", "Arbeitskoordinate", "CNC");

        add(words, "Work Zero", "Рабочий ноль", "İş sıfırı",
                "İş sıfırı", "Werkstücknullpunkt", "CNC");

        add(words, "Reference Point", "Точка отсчёта", "İstinad nöqtəsi",
                "Referans noktası", "Referenzpunkt", "CNC");

        add(words, "Reference Return", "Возврат в исходную точку", "İstinad nöqtəsinə qayıdış",
                "Referans dönüşü", "Referenzrücklauf", "CNC");

        add(words, "X-Axis", "Ось X", "X oxu",
                "X ekseni", "X-Achse", "CNC");

        add(words, "Y-Axis", "Ось Y", "Y oxu",
                "Y ekseni", "Y-Achse", "CNC");

        add(words, "Z-Axis", "Ось Z", "Z oxu",
                "Z ekseni", "Z-Achse", "CNC");

        add(words, "Zero Offset", "Коррекция нуля", "Sıfır ofseti",
                "Sıfır ofseti", "Nullpunktverschiebung", "CNC");

        add(words, "Zero Point", "Нулевая точка", "Sıfır nöqtəsi",
                "Sıfır noktası", "Nullpunkt", "CNC");

        add(words, "Tool Change", "Смена инструмента", "Alətin dəyişdirilməsi",
                "Takım değişimi", "Werkzeugwechsel", "CNC");

        add(words, "Tool Compensation", "Коррекция инструмента", "Alət kompensasiyası",
                "Takım telafisi", "Werkzeugkorrektur", "CNC");

        add(words, "Tool Number", "Номер инструмента", "Alət nömrəsi",
                "Takım numarası", "Werkzeugnummer", "CNC");

        add(words, "Tool Length", "Длина инструмента", "Alətin uzunluğu",
                "Takım uzunluğu", "Werkzeuglänge", "CNC");

        add(words, "Tool Diameter", "Диаметр инструмента", "Alət diametri",
                "Takım çapı", "Werkzeugdurchmesser", "CNC");

        add(words, "Tool Holder", "Держатель инструмента", "Alət tutacağı",
                "Takım tutucu", "Werkzeughalter", "CNC");

        add(words, "Tool Magazine", "Магазин инструментов", "Alət magazini",
                "Takım magazini", "Werkzeugmagazin", "CNC");

        add(words, "Cutting Speed", "Скорость резания", "Kəsmə sürəti",
                "Kesme hızı", "Schnittgeschwindigkeit", "CNC");

        add(words, "Cutting Depth", "Глубина резания", "Kəsmə dərinliyi",
                "Kesme derinliği", "Schnitttiefe", "CNC");

        add(words, "G-Code", "G-код", "G-kod",
                "G-kodu", "G-Code", "CNC");

        add(words, "M-Code", "M-код", "M-kod",
                "M-kodu", "M-Code", "CNC");

        add(words, "Tool Offset", "Коррекция инструмента", "Alət ofseti",
                "Takım ofseti", "Werkzeugkorrektur", "CNC");

        add(words, "Work Offset", "Рабочая коррекция", "İş ofseti",
                "İş ofseti", "Arbeitskorrektur", "CNC");

        add(words, "Tool Life", "Срок службы инструмента", "Alətin xidmət müddəti",
                "Takım ömrü", "Werkzeugstandzeit", "CNC");

        add(words, "Tool Wear", "Износ инструмента", "Alətin aşınması",
                "Takım aşınması", "Werkzeugverschleiß", "CNC");

        add(words, "Tool Wear Compensation", "Компенсация износа инструмента",
                "Alət aşınmasının kompensasiyası",
                "Takım aşınma telafisi", "Verschleißkompensation", "CNC");

        add(words, "Tool Presetter", "Пресеттер инструмента", "Alət presetteri",
                "Takım ön ayarlayıcı", "Werkzeugvoreinstellgerät", "CNC");

        add(words, "Tool Setter", "Установщик инструмента", "Alət quraşdırıcısı",
                "Takım ayarlayıcı", "Werkzeugeinstellgerät", "CNC");

        add(words, "Tool Probe", "Щуп инструмента", "Alət probu",
                "Takım probu", "Werkzeugmesstaster", "CNC");

        add(words, "Workpiece Probe", "Щуп детали", "Detal probu",
                "Parça probu", "Werkstückmesstaster", "CNC");

        add(words, "Touch Probe", "Контактный щуп", "Toxunma probu",
                "Dokunmatik prob", "Taster", "CNC");

        add(words, "Probe Calibration", "Калибровка щупа", "Probun kalibrlənməsi",
                "Prob kalibrasyonu", "Tasterkalibrierung", "CNC");

        add(words, "Machine Origin", "Начало координат станка", "Dəzgah başlanğıcı",
                "Makine orijini", "Maschinenursprung", "CNC");

        add(words, "Work Origin", "Начало координат детали", "Detal başlanğıcı",
                "İş parçası orijini", "Werkstückursprung", "CNC");

        add(words, "Absolute Position", "Абсолютная позиция", "Mütləq mövqe",
                "Mutlak konum", "Absolute Position", "CNC");

        add(words, "Incremental Position", "Относительная позиция", "Nisbi mövqe",
                "Artımsal konum", "Inkrementelle Position", "CNC");

        add(words, "Positioning", "Позиционирование", "Mövqeləndirmə",
                "Konumlandırma", "Positionierung", "CNC");

        add(words, "Interpolation", "Интерполяция", "İnterpolyasiya",
                "Interpolasyon", "Interpolation", "CNC");

        add(words, "Linear Interpolation", "Линейная интерполяция", "Xətti interpolyasiya",
                "Doğrusal interpolasyon", "Lineare Interpolation", "CNC");

        add(words, "Circular Interpolation", "Круговая интерполяция", "Dairəvi interpolyasiya",
                "Dairesel interpolasyon", "Kreisinterpolation", "CNC");

        add(words, "Clockwise", "По часовой стрелке", "Saat istiqamətində",
                "Saat yönünde", "Im Uhrzeigersinn", "CNC");

        add(words, "Counterclockwise", "Против часовой стрелки", "Saatın əks istiqamətində",
                "Saat yönünün tersine", "Gegen den Uhrzeigersinn", "CNC");

        add(words, "Spindle Direction", "Направление шпинделя", "Şpindel istiqaməti",
                "İş mili yönü", "Spindeldrehrichtung", "CNC");

        add(words, "Spindle Start", "Запуск шпинделя", "Şpindelin işə salınması",
                "İş mili başlatma", "Spindelstart", "CNC");

        add(words, "Spindle Stop", "Остановка шпинделя", "Şpindelin dayandırılması",
                "İş mili durdurma", "Spindelstopp", "CNC");

        add(words, "Feed Override", "Коррекция подачи", "Veriş korreksiyası",
                "İlerleme düzeltmesi", "Vorschubkorrektur", "CNC");

        add(words, "Rapid Override", "Коррекция быстрого хода", "Sürətli gediş korreksiyası",
                "Hızlı hareket düzeltmesi", "Eilgangkorrektur", "CNC");

        add(words, "Feed Hold Button", "Кнопка остановки подачи", "Veriş dayandırma düyməsi",
                "İlerleme durdurma düğmesi", "Vorschubhalt-Taste", "CNC");

        add(words, "Cycle Start Button", "Кнопка запуска цикла", "Sikl başlatma düyməsi",
                "Çevrim başlatma düğmesi", "Zyklusstarttaste", "CNC");

        add(words, "Reset Button", "Кнопка сброса", "Sıfırlama düyməsi",
                "Sıfırlama düğmesi", "Reset-Taste", "CNC");

        add(words, "Emergency Stop Button", "Кнопка аварийной остановки", "Təcili dayandırma düyməsi",
                "Acil durdurma düğmesi", "Not-Aus-Taste", "CNC");

        add(words, "Jog Mode", "Ручной режим перемещения", "JOG rejimi",
                "JOG modu", "JOG-Modus", "CNC");

        add(words, "Jog Wheel", "Ручное колесо", "JOG çarxı",
                "JOG el çarxı", "Handrad", "CNC");

        add(words, "Manual Mode", "Ручной режим", "Əl rejimi",
                "Manuel mod", "Manueller Modus", "CNC");

        add(words, "Automatic Mode", "Автоматический режим", "Avtomatik rejim",
                "Otomatik mod", "Automatikmodus", "CNC");

        add(words, "Edit Mode", "Режим редактирования", "Redaktə rejimi",
                "Düzenleme modu", "Editiermodus", "CNC");

        add(words, "Memory Mode", "Режим памяти", "Yaddaş rejimi",
                "Hafıza modu", "Speichermodus", "CNC");

        add(words, "Machine Lock", "Блокировка станка", "Dəzgah kilidi",
                "Makine kilidi", "Maschinensperre", "CNC");

        add(words, "Program Lock", "Блокировка программы", "Proqram kilidi",
                "Program kilidi", "Programmsperre", "CNC");

        add(words, "Parameter", "Параметр", "Parametr",
                "Parametre", "Parameter", "CNC");

        add(words, "Parameter Setting", "Настройка параметров", "Parametrlərin sazlanması",
                "Parametre ayarı", "Parametereinstellung", "CNC");

        add(words, "Offset Setting", "Настройка коррекции", "Ofset sazlaması",
                "Ofset ayarı", "Korrektureinstellung", "CNC");

        add(words, "Program Editing", "Редактирование программы", "Proqramın redaktəsi",
                "Program düzenleme", "Programmbearbeitung", "CNC");

        add(words, "Program Backup", "Резервная копия программы", "Proqram ehtiyat nüsxəsi",
                "Program yedekleme", "Programmsicherung", "CNC");

        add(words, "Program Transfer", "Передача программы", "Proqramın ötürülməsi",
                "Program aktarımı", "Programmübertragung", "CNC");

        add(words, "USB Transfer", "Передача через USB", "USB ilə ötürmə",
                "USB aktarımı", "USB-Übertragung", "CNC");

        add(words, "Program File", "Файл программы", "Proqram faylı",
                "Program dosyası", "Programmdatei", "CNC");

        add(words, "Program Name", "Имя программы", "Proqram adı",
                "Program adı", "Programmname", "CNC");

        add(words, "Sequence Number", "Номер последовательности", "Ardıcıllıq nömrəsi",
                "Sıra numarası", "Satznummer", "CNC");

        add(words, "Block Number", "Номер блока", "Blok nömrəsi",
                "Blok numarası", "Satznummer", "CNC");

        add(words, "Block Skip", "Пропуск блока", "Blokun keçilməsi",
                "Blok atlama", "Satzüberspringen", "CNC");

        add(words, "Optional Stop", "Опциональная остановка", "İstəyə bağlı dayanma",
                "İsteğe bağlı durdurma", "Optionaler Stopp", "CNC");

        add(words, "Machine Cycle", "Цикл станка", "Dəzgah sikli",
                "Makine çevrimi", "Maschinenzyklus", "CNC");

        add(words, "Fixed Cycle", "Фиксированный цикл", "Sabit sikl",
                "Sabit çevrim", "Fester Zyklus", "CNC");

        add(words, "Drilling Cycle", "Цикл сверления", "Deşmə sikli",
                "Delme çevrimi", "Bohrzyklus", "CNC");

        add(words, "Tapping Cycle", "Цикл нарезания резьбы", "Yiv açma sikli",
                "Kılavuz çekme çevrimi", "Gewindeschneidzyklus", "CNC");

        add(words, "Boring Cycle", "Цикл расточки", "Burma sikli",
                "İç tornalama çevrimi", "Ausdrehzyklus", "CNC");

        add(words, "Peck Drilling", "Прерывистое сверление", "Fasiləli deşmə",
                "Kademeli delme", "Peckbohren", "CNC");

        add(words, "Thread Milling", "Фрезерование резьбы", "Yivin frezlənməsi",
                "Diş frezeleme", "Gewindefräsen", "CNC");

        add(words, "Thread Cutting", "Нарезание резьбы", "Yiv kəsmə",
                "Diş açma", "Gewindeschneiden", "CNC");

        add(words, "Tapping", "Нарезание резьбы метчиком", "Metçiklə yiv açma",
                "Kılavuz çekme", "Gewindebohren", "CNC");

        add(words, "Boring", "Расточка", "Burma",
                "İç tornalama", "Ausdrehen", "CNC");

        add(words, "Reaming", "Развёртывание", "Raybalama",
                "Raybalama", "Reiben", "CNC");

        add(words, "Drilling", "Сверление", "Deşmə",
                "Delme", "Bohren", "CNC");

        add(words, "Milling", "Фрезерование", "Frezləmə",
                "Frezeleme", "Fräsen", "CNC");

        add(words, "Turning", "Токарная обработка", "Torna emalı",
                "Tornalama", "Drehen", "CNC");

        add(words, "Facing", "Торцевание", "Alın emalı",
                "Alın tornalama", "Planen", "CNC");

        add(words, "Grooving", "Проточка канавки", "Yiv açma",
                "Kanal açma", "Nutfräsen", "CNC");

        add(words, "Threading", "Нарезание резьбы", "Yiv açma",
                "Diş açma", "Gewindeschneiden", "CNC");

        add(words, "Chamfering", "Фаска", "Faska",
                "Pah kırma", "Anfasen", "CNC");

        add(words, "Contour Milling", "Контурное фрезерование", "Kontur frezləmə",
                "Kontur frezeleme", "Konturfräsen", "CNC");

        add(words, "Pocket Milling", "Фрезерование кармана", "Cib frezləmə",
                "Cep frezeleme", "Taschenfräsen", "CNC");

        add(words, "Slot Milling", "Фрезерование паза", "Yivin frezlənməsi",
                "Kanal frezeleme", "Nutfräsen", "CNC");

        add(words, "Roughing", "Черновая обработка", "Qaba emal",
                "Kaba işleme", "Schruppen", "CNC");

        add(words, "Finishing", "Чистовая обработка", "Təmiz emal",
                "Finiş işleme", "Schlichten", "CNC");

        add(words, "Workpiece", "Заготовка / деталь", "Pəstah / detal",
                "İş parçası", "Werkstück", "CNC");

        add(words, "Workholding", "Закрепление детали", "Detalın bərkidilməsi",
                "İş parçası bağlama", "Werkstückspannung", "CNC");

        add(words, "Clamping", "Зажим", "Sıxma",
                "Bağlama", "Spannen", "CNC");

        add(words, "Clamping Force", "Сила зажима", "Sıxma qüvvəsi",
                "Bağlama kuvveti", "Spannkraft", "CNC");

        add(words, "Chuck", "Патрон", "Patron",
                "Ayna", "Futter", "CNC");

        add(words, "Three-Jaw Chuck", "Трёхкулачковый патрон", "Üççənəli patron",
                "Üç çeneli ayna", "Dreibackenfutter", "CNC");

        add(words, "Four-Jaw Chuck", "Четырёхкулачковый патрон", "Dördcənəli patron",
                "Dört çeneli ayna", "Vierbackenfutter", "CNC");

        add(words, "Collet", "Цанга", "Sıxac",
                "Pens", "Spannzange", "CNC");

        add(words, "Soft Jaw", "Мягкие кулачки", "Yumşaq çənələr",
                "Yumuşak çeneler", "Weichbacken", "CNC");

        add(words, "Hard Jaw", "Закалённые кулачки", "Sərt çənələr",
                "Sert çeneler", "Hartbacken", "CNC");

        add(words, "Coolant", "Охлаждающая жидкость", "Soyuducu maye",
                "Soğutma sıvısı", "Kühlschmierstoff", "CNC");

        add(words, "Coolant Pressure", "Давление охлаждения", "Soyutma təzyiqi",
                "Soğutma basıncı", "Kühldruck", "CNC");

        add(words, "Coolant Flow", "Поток охлаждающей жидкости", "Soyuducu maye axını",
                "Soğutma sıvısı akışı", "Kühlmittelfluss", "CNC");

        add(words, "Air Blast", "Воздушная продувка", "Hava üfürülməsi",
                "Hava üfleme", "Luftstrahl", "CNC");

        add(words, "Chip", "Стружка", "Yonqar",
                "Talaş", "Span", "CNC");

        add(words, "Chip Removal", "Удаление стружки", "Yonqarın çıxarılması",
                "Talaş temizleme", "Spanabfuhr", "CNC");

        add(words, "Chip Conveyor", "Конвейер стружки", "Yonqar konveyeri",
                "Talaş konveyörü", "Späneförderer", "CNC");

        add(words, "Chip Load", "Нагрузка на зуб", "Diş yükü",
                "Diş başına yük", "Zahnvorschub", "CNC");

        add(words, "Cutting Force", "Сила резания", "Kəsmə qüvvəsi",
                "Kesme kuvveti", "Schnittkraft", "CNC");

        add(words, "Cutting Temperature", "Температура резания", "Kəsmə temperaturu",
                "Kesme sıcaklığı", "Schnitt­temperatur", "CNC");

        add(words, "Surface Speed", "Скорость поверхности", "Səth sürəti",
                "Çevresel hız", "Schnittgeschwindigkeit", "CNC");

        add(words, "Feed Per Tooth", "Подача на зуб", "Dişə düşən veriş",
                "Diş başına ilerleme", "Vorschub pro Zahn", "CNC");

        add(words, "Feed Per Revolution", "Подача на оборот", "Dövrə başına veriş",
                "Devir başına ilerleme", "Vorschub pro Umdrehung", "CNC");

        add(words, "Depth of Cut", "Глубина резания", "Kəsmə dərinliyi",
                "Kesme derinliği", "Schnitttiefe", "CNC");

        add(words, "Step Over", "Поперечная подача", "Addım üstü",
                "Yanal adım", "Seitlicher Zustellweg", "CNC");

        add(words, "Step Down", "Вертикальный шаг", "Şaquli addım",
                "Dikey adım", "Zustelltiefe", "CNC");

        add(words, "Machining Time", "Время обработки", "Emal vaxtı",
                "İşleme süresi", "Bearbeitungszeit", "CNC");

        add(words, "Machine Accuracy", "Точность станка", "Dəzgah dəqiqliyi",
                "Makine hassasiyeti", "Maschinengenauigkeit", "CNC");

        add(words, "Machine Repeatability", "Повторяемость станка", "Dəzgah təkrarlanması",
                "Makine tekrarlanabilirliği", "Maschinenwiederholgenauigkeit", "CNC");

        add(words, "Backlash", "Люфт", "Boşluq",
                "Boşluk", "Spiel", "CNC");

        add(words, "Axis Alignment", "Выравнивание осей", "Oxların düzülməsi",
                "Eksen hizalama", "Achsausrichtung", "CNC");

        add(words, "Axis Calibration", "Калибровка осей", "Oxların kalibrlənməsi",
                "Eksen kalibrasyonu", "Achskalibrierung", "CNC");

        add(words, "Servo Motor", "Сервомотор", "Servo mühərrik",
                "Servo motor", "Servomotor", "CNC");

        add(words, "Servo Drive", "Сервопривод", "Servo ötürücü",
                "Servo sürücü", "Servoantrieb", "CNC");

        add(words, "Encoder", "Энкодер", "Enkoder",
                "Enkoder", "Encoder", "CNC");

        add(words, "Linear Scale", "Линейка измерительная", "Xətti ölçü sistemi",
                "Lineer cetvel", "Linearmaßstab", "CNC");

        add(words, "Ball Screw", "Шарико-винтовая передача", "Kürəli vint ötürücü",
                "Bilyalı vida", "Kugelgewindetrieb", "CNC");

        add(words, "Linear Guide", "Линейная направляющая", "Xətti istiqamətləndirici",
                "Lineer kızak", "Linearführung", "CNC");

        add(words, "Overtravel", "Выход за пределы хода", "Hərəkət həddinin aşılması",
                "Hareket sınırı aşımı", "Überlauf", "CNC");

        add(words, "Servo Alarm", "Авария сервопривода", "Servo alarmı",
                "Servo alarmı", "Servoalarm", "CNC");

        add(words, "Spindle Alarm", "Авария шпинделя", "Şpindel alarmı",
                "İş mili alarmı", "Spindelalarm", "CNC");

        add(words, "Overload Alarm", "Авария перегрузки", "Həddən artıq yük alarmı",
                "Aşırı yük alarmı", "Überlastalarm", "CNC");

        add(words, "Communication Error", "Ошибка связи", "Rabitə xətası",
                "İletişim hatası", "Kommunikationsfehler", "CNC");

        add(words, "Coolant Alarm", "Авария охлаждения", "Soyutma alarmı",
                "Soğutma alarmı", "Kühlmittelalarm", "CNC");


        // =====================================================
        // STAMPING
        // =====================================================

        add(words, "Stamping", "Штамповка", "Ştamplama",
                "Presleme", "Stanzen", "STAMPING");

        add(words, "Stamping Machine", "Штамповочный станок", "Ştamplama dəzgahı",
                "Pres makinesi", "Stanzmaschine", "STAMPING");

        add(words, "Stamping Press", "Штамповочный пресс", "Ştamplama presi",
                "Pres", "Stanzpresse", "STAMPING");

        add(words, "Stamping Die", "Штамп", "Ştamp",
                "Kalıp", "Stanzwerkzeug", "STAMPING");

        add(words, "Stamping Cycle", "Цикл штамповки", "Ştamplama sikli",
                "Presleme çevrimi", "Stanzzyklus", "STAMPING");

        add(words, "Stamping Force", "Сила штамповки", "Ştamplama qüvvəsi",
                "Presleme kuvveti", "Stanzkraft", "STAMPING");

        add(words, "Stamping Speed", "Скорость штамповки", "Ştamplama sürəti",
                "Presleme hızı", "Stanzgeschwindigkeit", "STAMPING");

        add(words, "Stamping Defect", "Дефект штамповки", "Ştamplama qüsuru",
                "Presleme kusuru", "Stanzfehler", "STAMPING");

        add(words, "Punch", "Пуансон", "Puanson",
                "Zımba", "Stempel", "STAMPING");

        add(words, "Punch Clearance", "Зазор пуансона", "Puanson boşluğu",
                "Zımba boşluğu", "Stempelspiel", "STAMPING");

        add(words, "Punch Holder", "Держатель пуансона", "Puanson tutacağı",
                "Zımba tutucu", "Stempelhalter", "STAMPING");

        add(words, "Punch Life", "Срок службы пуансона", "Puansonun xidmət müddəti",
                "Zımba ömrü", "Stempellebensdauer", "STAMPING");

        add(words, "Die", "Матрица", "Matrisa",
                "Kalıp", "Matrize", "STAMPING");

        add(words, "Die Clearance", "Зазор матрицы", "Matrisa boşluğu",
                "Kalıp boşluğu", "Matrizenspiel", "STAMPING");

        add(words, "Die Holder", "Держатель матрицы", "Matrisa tutacağı",
                "Kalıp tutucu", "Matrizenhalter", "STAMPING");

        add(words, "Die Inspection", "Проверка штампа", "Ştampın yoxlanması",
                "Kalıp kontrolü", "Werkzeugprüfung", "STAMPING");

        add(words, "Die Life", "Срок службы штампа", "Ştampın xidmət müddəti",
                "Kalıp ömrü", "Werkzeuglebensdauer", "STAMPING");

        add(words, "Die Maintenance", "Обслуживание штампа", "Ştampın texniki xidməti",
                "Kalıp bakımı", "Werkzeuginstandhaltung", "STAMPING");

        add(words, "Die Repair", "Ремонт штампа", "Ştampın təmiri",
                "Kalıp onarımı", "Werkzeugreparatur", "STAMPING");

        add(words, "Die Set", "Комплект штампа", "Ştamp dəsti",
                "Kalıp seti", "Werkzeugsatz", "STAMPING");

        add(words, "Blank", "Заготовка", "Pəstah",
                "Taslak", "Rohling", "STAMPING");

        add(words, "Blank Holder", "Прижим заготовки", "Pəstah sıxıcısı",
                "Taslak tutucu", "Niederhalter", "STAMPING");

        add(words, "Blank Thickness", "Толщина заготовки", "Pəstah qalınlığı",
                "Taslak kalınlığı", "Rohlingdicke", "STAMPING");

        add(words, "Bending Operation", "Операция гибки", "Əyilmə əməliyyatı",
                "Bükme işlemi", "Biegeoperation", "STAMPING");

        add(words, "Bending Force", "Сила гибки", "Əyilmə qüvvəsi",
                "Bükme kuvveti", "Biegekraft", "STAMPING");

        add(words, "Bending Angle", "Угол гибки", "Əyilmə bucağı",
                "Bükme açısı", "Biegewinkel", "STAMPING");

        add(words, "Bending Radius", "Радиус гибки", "Əyilmə radiusu",
                "Bükme yarıçapı", "Biegeradius", "STAMPING");

        add(words, "Deep Drawing", "Глубокая вытяжка", "Dərin dartma",
                "Derin çekme", "Tiefziehen", "STAMPING");

        add(words, "Piercing", "Пробивка", "Deşmə",
                "Delme", "Lochen", "STAMPING");

        add(words, "Piercing Tool", "Пробивной инструмент", "Deşmə aləti",
                "Delme takımı", "Stanzwerkzeug", "STAMPING");

        add(words, "Part Ejection", "Выброс детали", "Detalın çıxarılması",
                "Parça çıkarma", "Teileauswurf", "STAMPING");

        add(words, "Ejection Pin", "Выталкиватель", "Çıxarıcı pin",
                "İtici pim", "Auswerferstift", "STAMPING");

        add(words, "Ejector Plate", "Плита выталкивателя", "Çıxarıcı plitə",
                "İtici plaka", "Auswerferplatte", "STAMPING");

        add(words, "Finished Part", "Готовая деталь", "Hazır detal",
                "Bitmiş parça", "Fertiges Teil", "STAMPING");

        add(words, "Press", "Пресс", "Pres",
                "Pres", "Presse", "STAMPING");

        add(words, "Press Capacity", "Мощность пресса", "Pres gücü",
                "Pres kapasitesi", "Presskraft", "STAMPING");

        add(words, "Press Stroke", "Ход пресса", "Pres gedişi",
                "Pres stroku", "Pressenhub", "STAMPING");

        add(words, "Stroke Length", "Длина хода", "Gediş uzunluğu",
                "Strok uzunluğu", "Hublänge", "STAMPING");

        add(words, "Press Speed", "Скорость пресса", "Pres sürəti",
                "Pres hızı", "Pressengeschwindigkeit", "STAMPING");

        add(words, "Press Operator", "Оператор пресса", "Pres operatoru",
                "Pres operatörü", "Pressenbediener", "STAMPING");

        add(words, "Sheet Metal", "Листовой металл", "Vərəq metal",
                "Sac metal", "Blech", "STAMPING");

        add(words, "Metal Sheet", "Металлический лист", "Metal vərəqi",
                "Metal levha", "Metallblech", "STAMPING");

        add(words, "Sheet Thickness", "Толщина листа", "Vərəqin qalınlığı",
                "Sac kalınlığı", "Blechdicke", "STAMPING");

        add(words, "Sheet Width", "Ширина листа", "Vərəqin eni",
                "Sac genişliği", "Blechbreite", "STAMPING");

        add(words, "Sheet Length", "Длина листа", "Vərəqin uzunluğu",
                "Sac uzunluğu", "Blechlänge", "STAMPING");

        add(words, "Coil", "Рулон металла", "Metal rulonu",
                "Rulo", "Coil", "STAMPING");

        add(words, "Coil Feeding", "Подача рулона", "Rulonun verilməsi",
                "Rulo besleme", "Coilzuführung", "STAMPING");

        add(words, "Feeder", "Подающее устройство", "Verici",
                "Besleyici", "Zuführgerät", "STAMPING");

        add(words, "Strip Feeder", "Подача полосы", "Zolaq vericisi",
                "Şerit besleyici", "Bandzuführung", "STAMPING");

        add(words, "Feeding System", "Система подачи", "Veriş sistemi",
                "Besleme sistemi", "Zuführsystem", "STAMPING");

        add(words, "Feed Length", "Длина подачи", "Veriş uzunluğu",
                "Besleme uzunluğu", "Vorschublänge", "STAMPING");

        add(words, "Progressive Die", "Прогрессивный штамп", "Proqressiv ştamp",
                "Progresif kalıp", "Folgeverbundwerkzeug", "STAMPING");

        add(words, "Compound Die", "Комбинированный штамп", "Kombinə edilmiş ştamp",
                "Kombine kalıp", "Kombinationswerkzeug", "STAMPING");

        add(words, "Forming", "Формовка", "Formalaşdırma",
                "Şekillendirme", "Umformen", "STAMPING");

        add(words, "Forming Tool", "Формовочный инструмент", "Formalaşdırma aləti",
                "Şekillendirme takımı", "Umformwerkzeug", "STAMPING");

        add(words, "Cutting Operation", "Операция резки", "Kəsmə əməliyyatı",
                "Kesme işlemi", "Schneidoperation", "STAMPING");

        add(words, "Blanking", "Вырезка", "Kəsib çıxarma",
                "Kesme", "Ausschneiden", "STAMPING");

        add(words, "Trimming", "Обрезка", "Kənarların kəsilməsi",
                "Kenar kesme", "Beschneiden", "STAMPING");

        add(words, "Flanging", "Отбортовка", "Bortlama",
                "Flanşlama", "Bördeln", "STAMPING");

        add(words, "Metal Forming", "Обработка металла давлением", "Metala təzyiqlə forma vermə",
                "Metal şekillendirme", "Metallumformen", "STAMPING");

        add(words, "Press Brake", "Листогибочный пресс", "Vərəq bükmə presi",
                "Abkant pres", "Abkantpresse", "STAMPING");

        add(words, "Press Tool", "Штамповочный инструмент", "Pres aləti",
                "Pres takımı", "Presswerkzeug", "STAMPING");

        add(words, "Tool Clearance", "Зазор инструмента", "Alət boşluğu",
                "Takım boşluğu", "Werkzeugspiel", "STAMPING");

        add(words, "Strip", "Металлическая полоса", "Metal zolaq",
                "Şerit", "Metallstreifen", "STAMPING");


        // =====================================================
        // FURNACE
        // =====================================================

        add(words, "Furnace", "Печь", "Soba",
                "Fırın", "Ofen", "FURNACE");

        add(words, "Heating Element", "Нагревательный элемент", "Qızdırıcı element",
                "Isıtma elemanı", "Heizelement", "FURNACE");

        add(words, "Heating", "Нагрев", "Qızdırma",
                "Isıtma", "Erwärmung", "FURNACE");

        add(words, "Temperature", "Температура", "Temperatur",
                "Sıcaklık", "Temperatur", "FURNACE");

        add(words, "Heat Treatment", "Термообработка", "İstilik emalı",
                "Isıl işlem", "Wärmebehandlung", "FURNACE");

        add(words, "Overheat", "Перегрев", "Həddindən artıq qızma",
                "Aşırı ısınma", "Überhitzung", "FURNACE");

        add(words, "Quenching", "Закалка", "Tablama",
                "Su verme", "Abschrecken", "FURNACE");

        add(words, "Heat Detector", "Тепловой датчик", "İstilik detektoru",
                "Isı dedektörü", "Wärmemelder", "FURNACE");


        // =====================================================
        // FIRE
        // =====================================================

        add(words, "Fire Extinguisher", "Огнетушитель", "Yanğınsöndürən",
                "Yangın söndürücü", "Feuerlöscher", "FIRE");

        add(words, "Water Extinguisher", "Водный огнетушитель", "Su ilə yanğınsöndürən",
                "Sulu yangın söndürücü", "Wasserlöscher", "FIRE");

        add(words, "Foam Extinguisher", "Пенный огнетушитель", "Köpüklü yanğınsöndürən",
                "Köpüklü yangın söndürücü", "Schaumlöscher", "FIRE");

        add(words, "Dry Powder Extinguisher", "Порошковый огнетушитель", "Tozlu yanğınsöndürən",
                "Kuru kimyevi tozlu söndürücü", "Pulverlöscher", "FIRE");

        add(words, "Carbon Dioxide Extinguisher", "Углекислотный огнетушитель", "Karbon qazlı yanğınsöndürən",
                "Karbondioksitli söndürücü", "Kohlendioxidlöscher", "FIRE");

        add(words, "CO2 Extinguisher", "Огнетушитель CO2", "CO2 yanğınsöndürən",
                "CO2 söndürücü", "CO2-Löscher", "FIRE");

        add(words, "Fire Alarm", "Пожарная сигнализация", "Yanğın siqnalizasiyası",
                "Yangın alarmı", "Brandmeldeanlage", "FIRE");

        add(words, "Fire Detector", "Пожарный датчик", "Yanğın detektoru",
                "Yangın dedektörü", "Brandmelder", "FIRE");

        add(words, "Smoke Detector", "Дымовой датчик", "Tüstü detektoru",
                "Duman dedektörü", "Rauchmelder", "FIRE");

        add(words, "Fire Hose", "Пожарный шланг", "Yanğın şlanqı",
                "Yangın hortumu", "Feuerwehrschlauch", "FIRE");

        add(words, "Fire Hydrant", "Пожарный гидрант", "Yanğın hidrantı",
                "Yangın hidrantı", "Hydrant", "FIRE");

        add(words, "Fire Safety", "Пожарная безопасность", "Yanğın təhlükəsizliyi",
                "Yangın güvenliği", "Brandschutz", "FIRE");

        add(words, "Fire Prevention", "Предотвращение пожара", "Yanğının qarşısının alınması",
                "Yangın önleme", "Brandverhütung", "FIRE");

        add(words, "Fire Drill", "Пожарная тренировка", "Yanğın təlimi",
                "Yangın tatbikatı", "Feuerübung", "FIRE");

        add(words, "Muster Point", "Место сбора", "Toplanış yeri",
                "Toplanma noktası", "Sammelplatz", "FIRE");

        add(words, "Hot Work Permit", "Разрешение на огневые работы", "İsti iş icazəsi",
                "Sıcak çalışma izni", "Erlaubnisschein für Heißarbeiten", "FIRE");

        add(words, "Flammable Liquid", "Легковоспламеняющаяся жидкость", "Tez alışan maye",
                "Yanıcı sıvı", "Brennbare Flüssigkeit", "FIRE");

        add(words, "Flammable Gas", "Легковоспламеняющийся газ", "Tez alışan qaz",
                "Yanıcı gaz", "Brennbares Gas", "FIRE");

        add(words, "Ignition Source", "Источник воспламенения", "Alışma mənbəyi",
                "Tutuşturma kaynağı", "Zündquelle", "FIRE");

        add(words, "Open Flame", "Открытое пламя", "Açıq alov",
                "Açık alev", "Offene Flamme", "FIRE");

        add(words, "Spark", "Искра", "Qığılcım",
                "Kıvılcım", "Funke", "FIRE");

        add(words, "Fire Triangle", "Треугольник огня", "Yanğın üçbucağı",
                "Yangın üçgeni", "Feuerdreieck", "FIRE");

        add(words, "Fuel", "Топливо", "Yanacaq",
                "Yakıt", "Brennstoff", "FIRE");

        add(words, "Oxygen", "Кислород", "Oksigen",
                "Oksijen", "Sauerstoff", "FIRE");

        add(words, "Smoke", "Дым", "Tüstü",
                "Duman", "Rauch", "FIRE");

        add(words, "Flame", "Пламя", "Alov",
                "Alev", "Flamme", "FIRE");


        // =====================================================
        // SAFETY
        // =====================================================

        add(words, "Safety", "Безопасность", "Təhlükəsizlik",
                "Güvenlik", "Sicherheit", "SAFETY");

        add(words, "Safety Glasses", "Защитные очки", "Qoruyucu eynək",
                "Koruyucu gözlük", "Schutzbrille", "SAFETY");

        add(words, "Safety Shoes", "Защитная обувь", "Qoruyucu ayaqqabı",
                "İş güvenliği ayakkabısı", "Sicherheitsschuhe", "SAFETY");

        add(words, "Safety Rule", "Правило безопасности", "Təhlükəsizlik qaydası",
                "Güvenlik kuralı", "Sicherheitsregel", "SAFETY");

        add(words, "Safety Training", "Обучение безопасности", "Təhlükəsizlik təlimi",
                "Güvenlik eğitimi", "Sicherheitsschulung", "SAFETY");

        add(words, "PPE", "СИЗ", "Fərdi mühafizə vasitələri",
                "KKD", "PSA", "SAFETY");

        add(words, "Gloves", "Перчатки", "Əlcəklər",
                "Eldiven", "Handschuhe", "SAFETY");

        add(words, "Helmet", "Каска", "Kaska",
                "Baret", "Helm", "SAFETY");

        add(words, "Hazard", "Опасность", "Təhlükə",
                "Tehlike", "Gefahr", "SAFETY");

        add(words, "Risk", "Риск", "Risk",
                "Risk", "Risiko", "SAFETY");

        add(words, "Emergency", "Аварийная ситуация", "Fövqəladə vəziyyət",
                "Acil durum", "Notfall", "SAFETY");

        add(words, "Emergency Exit", "Аварийный выход", "Təcili çıxış",
                "Acil çıkış", "Notausgang", "SAFETY");

        add(words, "Emergency Stop", "Аварийная остановка", "Təcili dayandırma",
                "Acil durdurma", "Not-Aus", "SAFETY");

        add(words, "Emergency Evacuation", "Аварийная эвакуация", "Təcili təxliyə",
                "Acil tahliye", "Notfallevakuierung", "SAFETY");

        add(words, "Emergency Route", "Аварийный маршрут", "Təcili marşrut",
                "Acil güzergah", "Fluchtweg", "SAFETY");

        add(words, "Grounding", "Заземление", "Torpaqlama",
                "Topraklama", "Erdung", "SAFETY");

        add(words, "Insulation", "Изоляция", "İzolyasiya",
                "Yalıtım", "Isolierung", "SAFETY");

        add(words, "Safety Helmet", "Защитная каска", "Qoruyucu kaska",
                "Koruyucu baret", "Schutzhelm", "SAFETY");

        add(words, "Ear Protection", "Защита слуха", "Qulaq mühafizəsi",
                "Kulak koruması", "Gehörschutz", "SAFETY");

        add(words, "Face Shield", "Защитный щиток", "Üz qoruyucusu",
                "Yüz siperi", "Gesichtsschutz", "SAFETY");

        add(words, "Respirator", "Респиратор", "Respirator",
                "Solunum maskesi", "Atemschutzmaske", "SAFETY");

        add(words, "Protective Clothing", "Защитная одежда", "Qoruyucu geyim",
                "Koruyucu kıyafet", "Schutzkleidung", "SAFETY");

        add(words, "Safety Harness", "Страховочная привязь", "Təhlükəsizlik kəməri",
                "Emniyet kemeri", "Sicherheitsgurt", "SAFETY");

        add(words, "Warning Sign", "Предупреждающий знак", "Xəbərdarlıq nişanı",
                "Uyarı işareti", "Warnzeichen", "SAFETY");

        add(words, "Danger Sign", "Знак опасности", "Təhlükə nişanı",
                "Tehlike işareti", "Gefahrzeichen", "SAFETY");

        add(words, "Safety Barrier", "Защитное ограждение", "Təhlükəsizlik baryeri",
                "Güvenlik bariyeri", "Sicherheitsbarriere", "SAFETY");

        add(words, "Restricted Area", "Запретная зона", "Məhdud ərazi",
                "Giriş yasak alan", "Sperrbereich", "SAFETY");

        add(words, "Safe Distance", "Безопасное расстояние", "Təhlükəsiz məsafə",
                "Güvenli mesafe", "Sicherheitsabstand", "SAFETY");

        add(words, "Lockout", "Блокировка", "Bloklama",
                "Kilitleme", "Verriegelung", "SAFETY");

        add(words, "Tagout", "Маркировка", "Etiketləmə",
                "Etiketleme", "Kennzeichnung", "SAFETY");

        add(words, "Lockout Tagout", "Блокировка и маркировка", "Bloklama və etiketləmə",
                "Kilitleme ve etiketleme", "Lockout-Tagout", "SAFETY");

        add(words, "Electrical Safety", "Электробезопасность", "Elektrik təhlükəsizliyi",
                "Elektrik güvenliği", "Elektrische Sicherheit", "SAFETY");

        add(words, "Mechanical Hazard", "Механическая опасность", "Mexaniki təhlükə",
                "Mekanik tehlike", "Mechanische Gefahr", "SAFETY");

        add(words, "Chemical Hazard", "Химическая опасность", "Kimyəvi təhlükə",
                "Kimyasal tehlike", "Chemische Gefahr", "SAFETY");

        add(words, "Noise Level", "Уровень шума", "Səs səviyyəsi",
                "Gürültü seviyesi", "Lärmpegel", "SAFETY");

        add(words, "Safety Inspection", "Проверка безопасности", "Təhlükəsizlik yoxlaması",
                "Güvenlik denetimi", "Sicherheitsinspektion", "SAFETY");

        add(words, "Incident", "Инцидент", "Hadisə",
                "Olay", "Vorfall", "SAFETY");


        // =====================================================
        // WELDING
        // =====================================================

        add(words, "Welding", "Сварка", "Qaynaq",
                "Kaynak", "Schweißen", "WELDING");

        add(words, "Welder", "Сварщик", "Qaynaqçı",
                "Kaynakçı", "Schweißer", "WELDING");

        add(words, "Welding Machine", "Сварочный аппарат", "Qaynaq aparatı",
                "Kaynak makinesi", "Schweißgerät", "WELDING");

        add(words, "Welding Cable", "Сварочный кабель", "Qaynaq kabeli",
                "Kaynak kablosu", "Schweißkabel", "WELDING");

        add(words, "Welding Torch", "Сварочная горелка", "Qaynaq məşəli",
                "Kaynak torcu", "Schweißbrenner", "WELDING");

        add(words, "Electrode", "Электрод", "Elektrod",
                "Elektrot", "Elektrode", "WELDING");

        add(words, "Wire", "Проволока", "Tel",
                "Tel", "Draht", "WELDING");

        add(words, "Welding Joint", "Сварное соединение", "Qaynaq birləşməsi",
                "Kaynak bağlantısı", "Schweißverbindung", "WELDING");

        add(words, "Welding Defect", "Дефект сварки", "Qaynaq qüsuru",
                "Kaynak kusuru", "Schweißfehler", "WELDING");


        // =====================================================
        // GALVANIC
        // =====================================================

        add(words, "Plating", "Гальваническое покрытие", "Qalvanik örtük",
                "Kaplama", "Galvanische Beschichtung", "GALVANIC");

        add(words, "Metal Plating", "Покрытие металла", "Metal örtüyü",
                "Metal kaplama", "Metallbeschichtung", "GALVANIC");

        add(words, "Surface Coating", "Поверхностное покрытие", "Səth örtüyü",
                "Yüzey kaplaması", "Oberflächenbeschichtung", "GALVANIC");

        add(words, "Protective Coating", "Защитное покрытие", "Qoruyucu örtük",
                "Koruyucu kaplama", "Schutzbeschichtung", "GALVANIC");

        add(words, "Zinc Plating", "Цинкование", "Sinkləmə",
                "Çinko kaplama", "Verzinken", "GALVANIC");

        add(words, "Nickel Plating", "Никелирование", "Nikel örtüyü",
                "Nikel kaplama", "Vernickeln", "GALVANIC");

        add(words, "Chrome Plating", "Хромирование", "Xromlama",
                "Krom kaplama", "Verchromen", "GALVANIC");

        add(words, "Copper Plating", "Меднение", "Mis örtüyü",
                "Bakır kaplama", "Verkupfern", "GALVANIC");

        add(words, "Anodizing", "Анодирование", "Anodlaşdırma",
                "Anodizasyon", "Eloxieren", "GALVANIC");

        add(words, "Anode", "Анод", "Anod",
                "Anot", "Anode", "GALVANIC");

        add(words, "Cathode", "Катод", "Katod",
                "Katot", "Kathode", "GALVANIC");

        add(words, "Electrolyte", "Электролит", "Elektrolit",
                "Elektrolit", "Elektrolyt", "GALVANIC");

        add(words, "Electric Current", "Электрический ток", "Elektrik cərəyanı",
                "Elektrik akımı", "Elektrischer Strom", "GALVANIC");

        add(words, "Current Density", "Плотность тока", "Cərəyan sıxlığı",
                "Akım yoğunluğu", "Stromdichte", "GALVANIC");

        add(words, "Bath Temperature", "Температура ванны", "Vannanın temperaturu",
                "Banyo sıcaklığı", "Badtemperatur", "GALVANIC");

        add(words, "Bath Level", "Уровень ванны", "Vannanın səviyyəsi",
                "Banyo seviyesi", "Badfüllstand", "GALVANIC");

        add(words, "Bath Concentration", "Концентрация ванны", "Vannanın konsentrasiyası",
                "Banyo konsantrasyonu", "Badkonzentration", "GALVANIC");

        add(words, "pH Value", "Значение pH", "pH dəyəri",
                "pH değeri", "pH-Wert", "GALVANIC");

        add(words, "Rinse Tank", "Промывочная ванна", "Yuma çəni",
                "Durulama tankı", "Spülbehälter", "GALVANIC");

        add(words, "Rinsing", "Промывка", "Yuma",
                "Durulama", "Spülen", "GALVANIC");

        add(words, "Degreasing", "Обезжиривание", "Yağdan təmizləmə",
                "Yağ alma", "Entfetten", "GALVANIC");

        add(words, "Acid Cleaning", "Кислотная очистка", "Turşu ilə təmizləmə",
                "Asitle temizleme", "Säurereinigung", "GALVANIC");

        add(words, "Alkaline Cleaning", "Щелочная очистка", "Qələvi ilə təmizləmə",
                "Alkali temizleme", "Alkalische Reinigung", "GALVANIC");

        add(words, "Passivation", "Пассивация", "Passivasiya",
                "Pasivasyon", "Passivierung", "GALVANIC");

        add(words, "Coating Thickness", "Толщина покрытия", "Örtük qalınlığı",
                "Kaplama kalınlığı", "Schichtdicke", "GALVANIC");

        add(words, "Coating Adhesion", "Адгезия покрытия", "Örtüyün yapışması",
                "Kaplama yapışması", "Schichthaftung", "GALVANIC");

        add(words, "Coating Defect", "Дефект покрытия", "Örtük qüsuru",
                "Kaplama kusuru", "Beschichtungsfehler", "GALVANIC");

        add(words, "Peeling", "Отслоение", "Soyulma",
                "Soyulma", "Abblättern", "GALVANIC");

        add(words, "Blistering", "Вздутие покрытия", "Örtüyün qabarması",
                "Kabarcıklanma", "Blasenbildung", "GALVANIC");

        add(words, "Contamination", "Загрязнение", "Çirklənmə",
                "Kirlenme", "Verunreinigung", "GALVANIC");

        add(words, "Ventilation", "Вентиляция", "Ventilyasiya",
                "Havalandırma", "Belüftung", "GALVANIC");

        add(words, "Chemical Spill", "Разлив химикатов", "Kimyəvi maddə tökülməsi",
                "Kimyasal dökülme", "Chemikalienverschüttung", "GALVANIC");

        add(words, "Chemical Waste", "Химические отходы", "Kimyəvi tullantılar",
                "Kimyasal atık", "Chemieabfall", "GALVANIC");

        add(words, "Emergency Shower", "Аварийный душ", "Təcili duş",
                "Acil duş", "Notdusche", "GALVANIC");

        add(words, "Eye Wash Station", "Станция промывки глаз", "Göz yuma məntəqəsi",
                "Göz duşu istasyonu", "Augenspülstation", "GALVANIC");


        // =====================================================
        // MAINTENANCE
        // =====================================================

        add(words, "Maintenance", "Техническое обслуживание", "Texniki xidmət",
                "Bakım", "Wartung", "MAINTENANCE");

        add(words, "Repair", "Ремонт", "Təmir",
                "Onarım", "Reparatur", "MAINTENANCE");

        add(words, "Lubricant", "Смазка", "Sürtkü",
                "Yağlayıcı", "Schmierstoff", "MAINTENANCE");

        add(words, "Lubrication", "Смазка механизмов", "Yağlama",
                "Yağlama", "Schmierung", "MAINTENANCE");

        add(words, "Oil", "Масло", "Yağ",
                "Yağ", "Öl", "MAINTENANCE");

        add(words, "Oil Filter", "Масляный фильтр", "Yağ filtri",
                "Yağ filtresi", "Ölfilter", "MAINTENANCE");

        add(words, "Filter", "Фильтр", "Filtr",
                "Filtre", "Filter", "MAINTENANCE");

        add(words, "Replacement Part", "Запасная часть", "Əvəzedici hissə",
                "Yedek parça", "Ersatzteil", "MAINTENANCE");

        add(words, "Wear", "Износ", "Aşınma",
                "Aşınma", "Verschleiß", "MAINTENANCE");

        add(words, "Vibration", "Вибрация", "Vibrasiya",
                "Titreşim", "Vibration", "MAINTENANCE");

        add(words, "Noise", "Шум", "Səs",
                "Gürültü", "Geräusch", "MAINTENANCE");

        add(words, "Overload", "Перегрузка", "Həddindən artıq yük",
                "Aşırı yük", "Überlastung", "MAINTENANCE");


        // =====================================================
        // QUALITY
        // =====================================================

        add(words, "Quality", "Качество", "Keyfiyyət",
                "Kalite", "Qualität", "QUALITY");

        add(words, "Quality Check", "Проверка качества", "Keyfiyyət yoxlaması",
                "Kalite kontrolü", "Qualitätsprüfung", "QUALITY");

        add(words, "Quality Control", "Контроль качества", "Keyfiyyətə nəzarət",
                "Kalite kontrolü", "Qualitätskontrolle", "QUALITY");

        add(words, "Quality Inspector", "Контролёр качества", "Keyfiyyət müfəttişi",
                "Kalite kontrolörü", "Qualitätsprüfer", "QUALITY");

        add(words, "Quality Standard", "Стандарт качества", "Keyfiyyət standartı",
                "Kalite standardı", "Qualitätsstandard", "QUALITY");

        add(words, "Defect", "Дефект", "Qüsur",
                "Kusur", "Fehler", "QUALITY");

        add(words, "Rejected Part", "Бракованная деталь", "Qüsurlu detal",
                "Reddedilen parça", "Ausschussteil", "QUALITY");

        add(words, "Scrap", "Брак / отходы", "Tullantı",
                "Hurda", "Ausschuss", "QUALITY");

        add(words, "Scrap Rate", "Процент брака", "Tullantı faizi",
                "Hurda oranı", "Ausschussquote", "QUALITY");

        add(words, "Inspection", "Проверка", "Yoxlama",
                "Kontrol", "Prüfung", "QUALITY");

        add(words, "Inspection Report", "Отчёт проверки", "Yoxlama hesabatı",
                "Kontrol raporu", "Prüfbericht", "QUALITY");

        add(words, "Accuracy", "Точность", "Dəqiqlik",
                "Hassasiyet", "Genauigkeit", "QUALITY");

        add(words, "Surface Finish", "Качество поверхности", "Səthin keyfiyyəti",
                "Yüzey kalitesi", "Oberflächenqualität", "QUALITY");

        add(words, "Crack", "Трещина", "Çat",
                "Çatlak", "Riss", "QUALITY");

        add(words, "Burr", "Заусенец", "Qabarıq kənar",
                "Çapak", "Grat", "QUALITY");

        add(words, "Burr Height", "Высота заусенца", "Qabarıq kənarın hündürlüyü",
                "Çapak yüksekliği", "Grathöhe", "QUALITY");

        add(words, "Inspection Point", "Точка проверки", "Yoxlama nöqtəsi",
                "Kontrol noktası", "Prüfpunkt", "QUALITY");

        add(words, "Inspection Method", "Метод проверки", "Yoxlama metodu",
                "Kontrol yöntemi", "Prüfmethode", "QUALITY");

        add(words, "Inspection Result", "Результат проверки", "Yoxlama nəticəsi",
                "Kontrol sonucu", "Prüfergebnis", "QUALITY");

        add(words, "Acceptance Criteria", "Критерии приемки", "Qəbul meyarları",
                "Kabul kriterleri", "Abnahmekriterien", "QUALITY");

        add(words, "Specification", "Спецификация", "Spesifikasiya",
                "Şartname", "Spezifikation", "QUALITY");

        add(words, "Drawing", "Чертёж", "Çertyoj",
                "Teknik resim", "Zeichnung", "QUALITY");

        add(words, "Technical Drawing", "Технический чертёж", "Texniki çertyoj",
                "Teknik çizim", "Technische Zeichnung", "QUALITY");

        add(words, "Drawing Number", "Номер чертежа", "Çertyoj nömrəsi",
                "Çizim numarası", "Zeichnungsnummer", "QUALITY");

        add(words, "Revision", "Версия / редакция", "Redaktə",
                "Revizyon", "Revision", "QUALITY");

        add(words, "Traceability", "Прослеживаемость", "İzlənəbilənlik",
                "İzlenebilirlik", "Rückverfolgbarkeit", "QUALITY");

        add(words, "Batch Number", "Номер партии", "Partiya nömrəsi",
                "Parti numarası", "Chargennummer", "QUALITY");

        add(words, "Serial Number", "Серийный номер", "Seriya nömrəsi",
                "Seri numarası", "Seriennummer", "QUALITY");

        add(words, "Inspection Record", "Запись проверки", "Yoxlama qeydi",
                "Kontrol kaydı", "Prüfaufzeichnung", "QUALITY");

        add(words, "Nonconformance", "Несоответствие", "Uyğunsuzluq",
                "Uygunsuzluk", "Nichtkonformität", "QUALITY");

        add(words, "Corrective Action", "Корректирующее действие", "Düzəldici tədbir",
                "Düzeltici faaliyet", "Korrekturmaßnahme", "QUALITY");

        add(words, "Preventive Action", "Предупреждающее действие", "Qabaqlayıcı tədbir",
                "Önleyici faaliyet", "Vorbeugemaßnahme", "QUALITY");

        add(words, "Root Cause", "Первопричина", "Kök səbəb",
                "Kök neden", "Grundursache", "QUALITY");

        add(words, "Visual Inspection", "Визуальный контроль", "Vizual yoxlama",
                "Görsel kontrol", "Sichtprüfung", "QUALITY");

        add(words, "Dimensional Inspection", "Контроль размеров", "Ölçü yoxlaması",
                "Boyutsal kontrol", "Maßprüfung", "QUALITY");

        add(words, "Final Inspection", "Финальная проверка", "Son yoxlama",
                "Son kontrol", "Endprüfung", "QUALITY");


        // =====================================================
        // MEASUREMENT
        // =====================================================

        add(words, "Measure", "Измерять", "Ölçmək",
                "Ölçmek", "Messen", "MEASUREMENT");

        add(words, "Measurement", "Измерение", "Ölçmə",
                "Ölçüm", "Messung", "MEASUREMENT");

        add(words, "Caliper", "Штангенциркуль", "Ştangensirkul",
                "Kumpas", "Messschieber", "MEASUREMENT");

        add(words, "Vernier Caliper", "Штангенциркуль", "Ştangensirkul",
                "Verniyerli kumpas", "Messschieber", "MEASUREMENT");

        add(words, "Micrometer", "Микрометр", "Mikrometr",
                "Mikrometre", "Mikrometer", "MEASUREMENT");

        add(words, "Gauge", "Калибр", "Kalibr",
                "Mastar", "Lehre", "MEASUREMENT");

        add(words, "Depth Gauge", "Глубиномер", "Dərinlik ölçən",
                "Derinlik kumpası", "Tiefenmessgerät", "MEASUREMENT");

        add(words, "Pressure Gauge", "Манометр", "Manometr",
                "Basınç göstergesi", "Manometer", "MEASUREMENT");

        add(words, "Diameter", "Диаметр", "Diametr",
                "Çap", "Durchmesser", "MEASUREMENT");

        add(words, "Nominal Diameter", "Номинальный диаметр", "Nominal diametr",
                "Nominal çap", "Nenndurchmesser", "MEASUREMENT");

        add(words, "Outside Diameter", "Наружный диаметр", "Xarici diametr",
                "Dış çap", "Außendurchmesser", "MEASUREMENT");

        add(words, "Length", "Длина", "Uzunluq",
                "Uzunluk", "Länge", "MEASUREMENT");

        add(words, "Width", "Ширина", "En",
                "Genişlik", "Breite", "MEASUREMENT");

        add(words, "Thickness", "Толщина", "Qalınlıq",
                "Kalınlık", "Dicke", "MEASUREMENT");

        add(words, "Depth", "Глубина", "Dərinlik",
                "Derinlik", "Tiefe", "MEASUREMENT");

        add(words, "Tolerance", "Допуск", "Tolerans",
                "Tolerans", "Toleranz", "MEASUREMENT");

        add(words, "Ruler", "Линейка", "Xətkeş",
                "Cetvel", "Lineal", "MEASUREMENT");

        add(words, "Steel Ruler", "Стальная линейка", "Polad xətkeş",
                "Çelik cetvel", "Stahllineal", "MEASUREMENT");

        add(words, "Dial Indicator", "Индикатор часового типа", "Saat tipli indikator",
                "Komparatör", "Messuhr", "MEASUREMENT");

        add(words, "Digital Caliper", "Цифровой штангенциркуль", "Rəqəmsal ştangensirkul",
                "Dijital kumpas", "Digitaler Messschieber", "MEASUREMENT");

        add(words, "Digital Micrometer", "Цифровой микрометр", "Rəqəmsal mikrometr",
                "Dijital mikrometre", "Digitalmikrometer", "MEASUREMENT");

        add(words, "Height Gauge", "Высотомер", "Hündürlük ölçən",
                "Yükseklik kumpası", "Höhenmessgerät", "MEASUREMENT");

        add(words, "Radius Gauge", "Радиусный калибр", "Radius kalibri",
                "Radyüs mastarı", "Radiuslehre", "MEASUREMENT");

        add(words, "Thread Gauge", "Резьбовой калибр", "Yiv kalibri",
                "Vida mastarı", "Gewindelehre", "MEASUREMENT");

        add(words, "Go Gauge", "Проходной калибр", "Keçən kalibr",
                "Geçer mastar", "Gutlehre", "MEASUREMENT");

        add(words, "No-Go Gauge", "Непроходной калибр", "Keçməyən kalibr",
                "Geçmez mastar", "Ausschusslehre", "MEASUREMENT");

        add(words, "Gauge Block", "Концевая мера", "Ölçü bloku",
                "Mastar bloğu", "Endmaß", "MEASUREMENT");

        add(words, "Measurement Error", "Погрешность измерения", "Ölçmə xətası",
                "Ölçüm hatası", "Messfehler", "MEASUREMENT");

        add(words, "Measurement Accuracy", "Точность измерения", "Ölçmə dəqiqliyi",
                "Ölçüm hassasiyeti", "Messgenauigkeit", "MEASUREMENT");

        add(words, "Calibration", "Калибровка", "Kalibrləmə",
                "Kalibrasyon", "Kalibrierung", "MEASUREMENT");

        add(words, "Calibration Certificate", "Сертификат калибровки", "Kalibrləmə sertifikatı",
                "Kalibrasyon sertifikası", "Kalibrierzertifikat", "MEASUREMENT");

        add(words, "Unit", "Единица измерения", "Ölçü vahidi",
                "Birim", "Einheit", "MEASUREMENT");

        add(words, "Millimeter", "Миллиметр", "Millimetr",
                "Milimetre", "Millimeter", "MEASUREMENT");

        add(words, "Angle", "Угол", "Bucaq",
                "Açı", "Winkel", "MEASUREMENT");

        add(words, "Angle Gauge", "Угломер", "Bucaq ölçən",
                "Açı mastarı", "Winkelmesser", "MEASUREMENT");


        // =====================================================
        // TOOLS
        // =====================================================

        add(words, "Tool", "Инструмент", "Alət",
                "Takım", "Werkzeug", "TOOLS");

        add(words, "Cutting Tool", "Режущий инструмент", "Kəsici alət",
                "Kesici takım", "Schneidwerkzeug", "TOOLS");

        add(words, "Cutter", "Фреза", "Freza",
                "Kesici", "Fräser", "TOOLS");

        add(words, "Milling Cutter", "Фреза", "Freza",
                "Freze", "Fräser", "TOOLS");

        add(words, "Face Mill", "Торцевая фреза", "Alın frezası",
                "Alın frezesi", "Planfräser", "TOOLS");

        add(words, "Drill", "Сверло", "Burğu",
                "Matkap", "Bohrer", "TOOLS");

        add(words, "Drill Bit", "Сверло", "Burğu",
                "Matkap ucu", "Bohrer", "TOOLS");

        add(words, "Reamer", "Развёртка", "Rayba",
                "Rayba", "Reibahle", "TOOLS");

        add(words, "Tap", "Метчик", "Metçik",
                "Kılavuz", "Gewindebohrer", "TOOLS");

        add(words, "Tap Wrench", "Вороток для метчика", "Metçik tutacağı",
                "Kılavuz kolu", "Windeisen", "TOOLS");

        add(words, "Hammer", "Молоток", "Çəkic",
                "Çekiç", "Hammer", "TOOLS");

        add(words, "Chisel", "Зубило", "Mişar",
                "Keski", "Meißel", "TOOLS");

        add(words, "Pliers", "Плоскогубцы", "Kəlbətin",
                "Pense", "Zange", "TOOLS");

        add(words, "Wrench", "Гаечный ключ", "Açar",
                "Anahtar", "Schraubenschlüssel", "TOOLS");

        add(words, "Allen Key", "Шестигранник", "Altıbucaqlı açar",
                "Alyan anahtarı", "Innensechskantschlüssel", "TOOLS");

        add(words, "Combination Wrench", "Комбинированный ключ", "Kombinə edilmiş açar",
                "Kombine anahtar", "Kombischlüssel", "TOOLS");

        add(words, "Socket Wrench", "Торцевой ключ", "Başlıq açarı",
                "Lokma anahtarı", "Steckschlüssel", "TOOLS");

        add(words, "Torque Wrench", "Динамометрический ключ", "Moment açarı",
                "Tork anahtarı", "Drehmomentschlüssel", "TOOLS");

        add(words, "Impact Wrench", "Ударный гайковёрт", "Zərbəli açar",
                "Darbeli somun sıkma", "Schlagschrauber", "TOOLS");

        add(words, "Vice", "Тиски", "Məngənə",
                "Mengene", "Schraubstock", "TOOLS");

        add(words, "Jig", "Кондуктор", "Konduktor",
                "Fikstür", "Vorrichtung", "TOOLS");

        add(words, "Fixture", "Приспособление", "Qurğu",
                "Bağlama aparatı", "Vorrichtung", "TOOLS");


        // =====================================================
        // RETURN
        // =====================================================

        return words;
    }
}