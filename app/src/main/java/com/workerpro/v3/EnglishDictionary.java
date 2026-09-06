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

        // Старый конструктор.
        // Все твои существующие записи продолжат работать.
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

    // =====================================================
    // СТАРЫЙ ФОРМАТ — НЕ УДАЛЯЕМ
    // =====================================================

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

    // =====================================================
    // НОВЫЙ ФОРМАТ — 5 ЯЗЫКОВ
    // =====================================================

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
        // ТВОИ СУЩЕСТВУЮЩИЕ СЛОВА
        // =====================================================
        // Здесь оставляются ВСЕ твои текущие add(...)
        // записи без удаления.
        //
        // Важно:
        // старый формат add(...) продолжает работать.
        // Поэтому существующие примерно 400 слов не пропадут.
        // =====================================================


        // =====================================================
        // НОВЫЕ СЛОВА — WORK
        // =====================================================

        add(words, "Workplace", "Рабочее место", "İş yeri",
                "İş yeri", "Arbeitsplatz", "WORK");

        add(words, "Workday", "Рабочий день", "İş günü",
                "İş günü", "Arbeitstag", "WORK");

        add(words, "Workload", "Рабочая нагрузка", "İş yükü",
                "İş yükü", "Arbeitsbelastung", "WORK");

        add(words, "Work Schedule", "График работы", "İş qrafiki",
                "Çalışma programı", "Arbeitsplan", "WORK");

        add(words, "Work Permit", "Разрешение на работу", "İş icazəsi",
                "Çalışma izni", "Arbeitserlaubnis", "WORK");

        add(words, "Work Procedure", "Рабочая процедура", "İş proseduru",
                "İş prosedürü", "Arbeitsverfahren", "WORK");

        add(words, "Work Standard", "Рабочий стандарт", "İş standartı",
                "İş standardı", "Arbeitsstandard", "WORK");

        add(words, "Work Performance", "Производительность работы", "İş məhsuldarlığı",
                "İş performansı", "Arbeitsleistung", "WORK");

        add(words, "Production Worker", "Производственный рабочий", "İstehsalat işçisi",
                "Üretim işçisi", "Produktionsarbeiter", "WORK");

        add(words, "Production Worker Training", "Обучение производственного рабочего",
                "İstehsalat işçisinin təlimi",
                "Üretim işçisi eğitimi", "Schulung des Produktionsarbeiters", "WORK");


        // =====================================================
        // MACHINE
        // =====================================================

        add(words, "Machine Operation", "Работа на станке", "Dəzgahda iş",
                "Makine kullanımı", "Maschinenbedienung", "MACHINE");

        add(words, "Machine Operator", "Оператор станка", "Dəzgah operatoru",
                "Makine operatörü", "Maschinenbediener", "MACHINE");

        add(words, "Machine Inspection", "Проверка станка", "Dəzgahın yoxlanılması",
                "Makine kontrolü", "Maschinenprüfung", "MACHINE");

        add(words, "Machine Maintenance", "Обслуживание станка", "Dəzgaha texniki xidmət",
                "Makine bakımı", "Maschinenwartung", "MACHINE");

        add(words, "Machine Failure", "Неисправность станка", "Dəzgah nasazlığı",
                "Makine arızası", "Maschinenfehler", "MACHINE");

        add(words, "Machine Failure", "Поломка станка", "Dəzgahın sıradan çıxması",
                "Makine arızası", "Maschinenausfall", "MACHINE");

        add(words, "Machine Condition", "Состояние станка", "Dəzgahın vəziyyəti",
                "Makine durumu", "Maschinenzustand", "MACHINE");

        add(words, "Machine Setting", "Настройка станка", "Dəzgah sazlaması",
                "Makine ayarı", "Maschineneinstellung", "MACHINE");

        add(words, "Machine Parameter", "Параметр станка", "Dəzgah parametri",
                "Makine parametresi", "Maschinenparameter", "MACHINE");

        add(words, "Machine Operator Manual", "Руководство оператора станка",
                "Dəzgah operatorunun təlimatı",
                "Makine operatör kılavuzu", "Maschinenbedienungsanleitung", "MACHINE");


        // =====================================================
        // CNC
        // =====================================================

        add(words, "CNC Operator", "Оператор ЧПУ", "CNC operatoru",
                "CNC operatörü", "CNC-Bediener", "CNC");

        add(words, "CNC Setup", "Настройка ЧПУ", "CNC sazlanması",
                "CNC ayarı", "CNC-Einstellung", "CNC");

        add(words, "CNC Machine Setup", "Настройка станка ЧПУ",
                "CNC dəzgahının sazlanması",
                "CNC makine ayarı", "CNC-Maschineneinstellung", "CNC");

        add(words, "CNC Alarm", "Авария ЧПУ", "CNC siqnalı",
                "CNC alarmı", "CNC-Alarm", "CNC");

        add(words, "CNC Error", "Ошибка ЧПУ", "CNC xətası",
                "CNC hatası", "CNC-Fehler", "CNC");

        add(words, "CNC Axis", "Ось ЧПУ", "CNC oxu",
                "CNC ekseni", "CNC-Achse", "CNC");

        add(words, "CNC Tool", "Инструмент ЧПУ", "CNC aləti",
                "CNC takımı", "CNC-Werkzeug", "CNC");

        add(words, "CNC Workpiece", "Деталь ЧПУ", "CNC detalı",
                "CNC iş parçası", "CNC-Werkstück", "CNC");

        add(words, "CNC Program Check", "Проверка программы ЧПУ",
                "CNC proqramının yoxlanılması",
                "CNC program kontrolü", "CNC-Programmprüfung", "CNC");

        add(words, "CNC Program Error", "Ошибка программы ЧПУ",
                "CNC proqram xətası",
                "CNC program hatası", "CNC-Programmierfehler", "CNC");


        // =====================================================
        // STAMPING
        // =====================================================

        add(words, "Stamping Operator", "Оператор штамповки",
                "Ştamplama operatoru",
                "Pres operatörü", "Stanzmaschinenbediener", "STAMPING");

        add(words, "Hot Stamping", "Горячая штамповка",
                "İsti ştamplama",
                "Sıcak dövme", "Warmpressen", "STAMPING");

        add(words, "Cold Stamping", "Холодная штамповка",
                "Soyuq ştamplama",
                "Soğuk şekillendirme", "Kaltpressen", "STAMPING");

        add(words, "Stamping Tool", "Штамповочный инструмент",
                "Ştamplama aləti",
                "Pres takımı", "Stanzwerkzeug", "STAMPING");

        add(words, "Stamping Pressure", "Давление при штамповке",
                "Ştamplama təzyiqi",
                "Pres basıncı", "Stanzdruck", "STAMPING");

        add(words, "Stamping Temperature", "Температура штамповки",
                "Ştamplama temperaturu",
                "Pres sıcaklığı", "Stanztemperatur", "STAMPING");

        add(words, "Stamping Line", "Линия штамповки",
                "Ştamplama xətti",
                "Pres hattı", "Stanzlinie", "STAMPING");

        add(words, "Press Operator", "Оператор пресса",
                "Pres operatoru",
                "Pres operatörü", "Pressenbediener", "STAMPING");

        add(words, "Press Maintenance", "Обслуживание пресса",
                "Presə texniki xidmət",
                "Pres bakımı", "Pressenwartung", "STAMPING");

        add(words, "Press Safety", "Безопасность при работе на прессе",
                "Presdə təhlükəsizlik",
                "Pres güvenliği", "Pressensicherheit", "STAMPING");


        // =====================================================
        // FURNACE
        // =====================================================

        add(words, "Furnace Operator", "Оператор печи", "Soba operatoru",
                "Fırın operatörü", "Ofenbediener", "FURNACE");

        add(words, "Furnace Temperature", "Температура печи", "Soba temperaturu",
                "Fırın sıcaklığı", "Ofentemperatur", "FURNACE");

        add(words, "Furnace Control", "Управление печью", "Sobanın idarə edilməsi",
                "Fırın kontrolü", "Ofensteuerung", "FURNACE");

        add(words, "Heating Zone", "Зона нагрева", "Qızdırma zonası",
                "Isıtma bölgesi", "Heizzone", "FURNACE");

        add(words, "Heating Time", "Время нагрева", "Qızdırma vaxtı",
                "Isıtma süresi", "Aufheizzeit", "FURNACE");

        add(words, "Cooling Time", "Время охлаждения", "Soyutma vaxtı",
                "Soğutma süresi", "Abkühlzeit", "FURNACE");

        add(words, "Heat Treatment Cycle", "Цикл термообработки",
                "İstilik emalı tsikli",
                "Isıl işlem çevrimi", "Wärmebehandlungszyklus", "FURNACE");

        add(words, "Quenching Tank", "Закалочная ванна", "Sərtləşdirmə vannası",
                "Su verme tankı", "Abschreckbad", "FURNACE");


        // =====================================================
        // FIRE
        // =====================================================

        add(words, "Fire Safety Training", "Обучение пожарной безопасности",
                "Yanğın təhlükəsizliyi təlimi",
                "Yangın güvenliği eğitimi", "Brandschutzschulung", "FIRE");

        add(words, "Fire Risk", "Пожарный риск", "Yanğın riski",
                "Yangın riski", "Brandrisiko", "FIRE");

        add(words, "Fire Prevention Plan", "План предотвращения пожара",
                "Yanğının qarşısının alınması planı",
                "Yangın önleme planı", "Brandschutzplan", "FIRE");

        add(words, "Fire Extinguisher Check", "Проверка огнетушителя",
                "Yanğınsöndürənin yoxlanılması",
                "Yangın söndürücü kontrolü", "Feuerlöscherprüfung", "FIRE");

        add(words, "Emergency Alarm", "Аварийная сигнализация",
                "Fövqəladə siqnal",
                "Acil alarm", "Notalarm", "FIRE");

        add(words, "Evacuation Route", "Маршрут эвакуации",
                "Təxliyə marşrutu",
                "Tahliye yolu", "Fluchtweg", "FIRE");


        // =====================================================
        // SAFETY
        // =====================================================

        add(words, "Safety Officer", "Специалист по безопасности",
                "Təhlükəsizlik üzrə mütəxəssis",
                "İş güvenliği uzmanı", "Sicherheitsbeauftragter", "SAFETY");

        add(words, "Safety Check", "Проверка безопасности",
                "Təhlükəsizlik yoxlaması",
                "Güvenlik kontrolü", "Sicherheitsprüfung", "SAFETY");

        add(words, "Safety Procedure", "Процедура безопасности",
                "Təhlükəsizlik proseduru",
                "Güvenlik prosedürü", "Sicherheitsverfahren", "SAFETY");

        add(words, "Safety Equipment", "Оборудование безопасности",
                "Təhlükəsizlik avadanlığı",
                "Güvenlik ekipmanı", "Sicherheitsausrüstung", "SAFETY");

        add(words, "Safety Training Course", "Курс обучения безопасности",
                "Təhlükəsizlik təlim kursu",
                "İş güvenliği eğitim kursu", "Sicherheitsschulung", "SAFETY");

        add(words, "Personal Protective Equipment", "Средства индивидуальной защиты",
                "Fərdi mühafizə vasitələri",
                "Kişisel koruyucu ekipman", "Persönliche Schutzausrüstung", "SAFETY");

        add(words, "Protective Gloves", "Защитные перчатки",
                "Qoruyucu əlcəklər",
                "Koruyucu eldivenler", "Schutzhandschuhe", "SAFETY");

        add(words, "Protective Glasses", "Защитные очки",
                "Qoruyucu eynək",
                "Koruyucu gözlük", "Schutzbrille", "SAFETY");

        add(words, "Hearing Protection", "Защита слуха",
                "Eşitmə mühafizəsi",
                "İşitme koruması", "Gehörschutz", "SAFETY");

        add(words, "Safety Inspection", "Проверка безопасности",
                "Təhlükəsizlik yoxlaması",
                "Güvenlik denetimi", "Sicherheitsinspektion", "SAFETY");


        // =====================================================
        // WELDING
        // =====================================================

        add(words, "Welding Operator", "Сварщик / оператор сварки",
                "Qaynaq operatoru",
                "Kaynak operatörü", "Schweißbediener", "WELDING");

        add(words, "Welding Safety", "Безопасность при сварке",
                "Qaynaq təhlükəsizliyi",
                "Kaynak güvenliği", "Schweißsicherheit", "WELDING");

        add(words, "Welding Helmet", "Сварочная маска",
                "Qaynaq maskası",
                "Kaynak maskesi", "Schweißhelm", "WELDING");

        add(words, "Welding Current", "Сварочный ток",
                "Qaynaq cərəyanı",
                "Kaynak akımı", "Schweißstrom", "WELDING");

        add(words, "Welding Voltage", "Сварочное напряжение",
                "Qaynaq gərginliyi",
                "Kaynak voltajı", "Schweißspannung", "WELDING");

        add(words, "Welding Gas", "Сварочный газ",
                "Qaynaq qazı",
                "Kaynak gazı", "Schweißgas", "WELDING");

        add(words, "Welding Quality", "Качество сварки",
                "Qaynaq keyfiyyəti",
                "Kaynak kalitesi", "Schweißqualität", "WELDING");


        // =====================================================
        // GALVANIC
        // =====================================================

        add(words, "Galvanic Process", "Гальванический процесс",
                "Qalvanik proses",
                "Galvanik işlem", "Galvanischer Prozess", "GALVANIC");

        add(words, "Galvanic Bath", "Гальваническая ванна",
                "Qalvanik vanna",
                "Galvanik banyo", "Galvanikbad", "GALVANIC");

        add(words, "Chemical Solution", "Химический раствор",
                "Kimyəvi məhlul",
                "Kimyasal çözelti", "Chemische Lösung", "GALVANIC");

        add(words, "Plating Bath", "Ванна для покрытия",
                "Kaplama vannası",
                "Kaplama banyosu", "Beschichtungsbad", "GALVANIC");

        add(words, "Surface Treatment", "Обработка поверхности",
                "Səthin emalı",
                "Yüzey işlemi", "Oberflächenbehandlung", "GALVANIC");

        add(words, "Chemical Safety", "Химическая безопасность",
                "Kimyəvi təhlükəsizlik",
                "Kimyasal güvenlik", "Chemikaliensicherheit", "GALVANIC");


        // =====================================================
        // MAINTENANCE
        // =====================================================

        add(words, "Maintenance Worker", "Рабочий по обслуживанию",
                "Texniki xidmət işçisi",
                "Bakım işçisi", "Wartungsmitarbeiter", "MAINTENANCE");

        add(words, "Preventive Maintenance", "Профилактическое обслуживание",
                "Profilaktik texniki xidmət",
                "Önleyici bakım", "Vorbeugende Wartung", "MAINTENANCE");

        add(words, "Corrective Maintenance", "Корректирующее обслуживание",
                "Düzəldici texniki xidmət",
                "Düzeltici bakım", "Korrigierende Wartung", "MAINTENANCE");

        add(words, "Maintenance Schedule", "График обслуживания",
                "Texniki xidmət qrafiki",
                "Bakım programı", "Wartungsplan", "MAINTENANCE");

        add(words, "Lubrication Point", "Точка смазки",
                "Yağlama nöqtəsi",
                "Yağlama noktası", "Schmierstelle", "MAINTENANCE");

        add(words, "Spare Part", "Запасная часть",
                "Ehtiyat hissə",
                "Yedek parça", "Ersatzteil", "MAINTENANCE");


        // =====================================================
        // QUALITY
        // =====================================================

        add(words, "Quality Assurance", "Обеспечение качества",
                "Keyfiyyət təminatı",
                "Kalite güvencesi", "Qualitätssicherung", "QUALITY");

        add(words, "Quality Standard", "Стандарт качества",
                "Keyfiyyət standartı",
                "Kalite standardı", "Qualitätsstandard", "QUALITY");

        add(words, "Quality Inspection", "Контроль качества",
                "Keyfiyyət yoxlaması",
                "Kalite kontrolü", "Qualitätsprüfung", "QUALITY");

        add(words, "Defect Rate", "Процент дефектов",
                "Qüsur faizi",
                "Hata oranı", "Fehlerquote", "QUALITY");

        add(words, "Defective Part", "Дефектная деталь",
                "Qüsurlu detal",
                "Hatalı parça", "Fehlerhaftes Teil", "QUALITY");

        add(words, "Good Part", "Годная деталь",
                "Yararlı detal",
                "Uygun parça", "Gutes Teil", "QUALITY");

        add(words, "Inspection Tool", "Инструмент контроля",
                "Yoxlama aləti",
                "Kontrol aleti", "Prüfwerkzeug", "QUALITY");

        add(words, "Inspection Standard", "Стандарт проверки",
                "Yoxlama standartı",
                "Kontrol standardı", "Prüfstandard", "QUALITY");


        // =====================================================
        // MEASUREMENT
        // =====================================================

        add(words, "Measurement Tool", "Измерительный инструмент",
                "Ölçü aləti",
                "Ölçüm aleti", "Messwerkzeug", "MEASUREMENT");

        add(words, "Measurement Point", "Точка измерения",
                "Ölçmə nöqtəsi",
                "Ölçüm noktası", "Messpunkt", "MEASUREMENT");

        add(words, "Measurement Range", "Диапазон измерения",
                "Ölçmə diapazonu",
                "Ölçüm aralığı", "Messbereich", "MEASUREMENT");

        add(words, "Measurement Result", "Результат измерения",
                "Ölçmə nəticəsi",
                "Ölçüm sonucu", "Messergebnis", "MEASUREMENT");

        add(words, "Dimensional Accuracy", "Размерная точность",
                "Ölçü dəqiqliyi",
                "Boyutsal doğruluk", "Maßgenauigkeit", "MEASUREMENT");

        add(words, "Tolerance Range", "Диапазон допуска",
                "Tolerans diapazonu",
                "Tolerans aralığı", "Toleranzbereich", "MEASUREMENT");


        // =====================================================
        // TOOLS
        // =====================================================

        add(words, "Hand Tool", "Ручной инструмент",
                "Əl aləti",
                "El aleti", "Handwerkzeug", "TOOLS");

        add(words, "Power Tool", "Электроинструмент",
                "Elektrik aləti",
                "Elektrikli alet", "Elektrowerkzeug", "TOOLS");

        add(words, "Cutting Tool", "Режущий инструмент",
                "Kəsici alət",
                "Kesici takım", "Schneidwerkzeug", "TOOLS");

        add(words, "Measuring Tool", "Измерительный инструмент",
                "Ölçü aləti",
                "Ölçüm aleti", "Messwerkzeug", "TOOLS");

        add(words, "Tool Box", "Ящик для инструментов",
                "Alət qutusu",
                "Takım çantası", "Werkzeugkasten", "TOOLS");

        add(words, "Tool Holder", "Держатель инструмента",
                "Alət tutacağı",
                "Takım tutucu", "Werkzeughalter", "TOOLS");

        add(words, "Tool Storage", "Хранение инструментов",
                "Alətlərin saxlanması",
                "Takım depolama", "Werkzeuglagerung", "TOOLS");


        return words;
    }
}