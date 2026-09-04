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

        words.add(new Word("Production", "Производство", "İstehsalat"));
        words.add(new Word("Factory", "Завод", "Zavod"));
        words.add(new Word("Worker", "Рабочий", "İşçi"));
        words.add(new Word("Operator", "Оператор", "Operator"));
        words.add(new Word("Machine", "Станок", "Dəzgah"));
        words.add(new Word("Equipment", "Оборудование", "Avadanlıq"));
        words.add(new Word("Workshop", "Цех", "Sex"));
        words.add(new Word("Plant", "Предприятие", "Müəssisə"));
        words.add(new Word("Department", "Отдел", "Şöbə"));
        words.add(new Word("Shift", "Смена", "Növbə"));

        words.add(new Word("Workplace", "Рабочее место", "İş yeri"));
        words.add(new Word("Process", "Процесс", "Proses"));
        words.add(new Word("Operation", "Операция", "Əməliyyat"));
        words.add(new Word("Task", "Задача", "Tapşırıq"));
        words.add(new Word("Job", "Работа", "İş"));
        words.add(new Word("Product", "Изделие / продукт", "Məhsul"));
        words.add(new Word("Part", "Деталь", "Detal"));
        words.add(new Word("Material", "Материал", "Material"));
        words.add(new Word("Metal", "Металл", "Metal"));
        words.add(new Word("Steel", "Сталь", "Polad"));

        words.add(new Word("Aluminum", "Алюминий", "Alüminium"));
        words.add(new Word("Copper", "Медь", "Mis"));
        words.add(new Word("Iron", "Железо", "Dəmir"));
        words.add(new Word("Alloy", "Сплав", "Ərinti"));
        words.add(new Word("Raw Material", "Сырьё", "Xammal"));
        words.add(new Word("Finished Product", "Готовое изделие", "Hazır məhsul"));
        words.add(new Word("Component", "Компонент", "Komponent"));
        words.add(new Word("Assembly", "Сборка", "Yığma"));
        words.add(new Word("Production Line", "Производственная линия", "İstehsal xətti"));
        words.add(new Word("Station", "Рабочая станция", "İş stansiyası"));

        words.add(new Word("Supervisor", "Начальник / руководитель", "Rəhbər"));
        words.add(new Word("Manager", "Менеджер", "Menecer"));
        words.add(new Word("Engineer", "Инженер", "Mühəndis"));
        words.add(new Word("Technician", "Техник", "Texnik"));
        words.add(new Word("Mechanic", "Механик", "Mexanik"));
        words.add(new Word("Electrician", "Электрик", "Elektrikçi"));
        words.add(new Word("Welder", "Сварщик", "Qaynaqçı"));
        words.add(new Word("Inspector", "Инспектор / контролёр", "Müfəttiş"));
        words.add(new Word("Quality Inspector", "Контролёр качества", "Keyfiyyət nəzarətçisi"));
        words.add(new Word("Maintenance", "Техническое обслуживание", "Texniki xidmət"));

        words.add(new Word("Repair", "Ремонт", "Təmir"));
        words.add(new Word("Inspection", "Проверка", "Yoxlama"));
        words.add(new Word("Control", "Контроль", "Nəzarət"));
        words.add(new Word("Quality", "Качество", "Keyfiyyət"));
        words.add(new Word("Safety", "Безопасность", "Təhlükəsizlik"));
        words.add(new Word("Standard", "Стандарт", "Standart"));
        words.add(new Word("Procedure", "Процедура", "Prosedur"));
        words.add(new Word("Instruction", "Инструкция", "Təlimat"));
        words.add(new Word("Manual", "Руководство / инструкция", "Təlimat kitabçası"));
        words.add(new Word("Drawing", "Чертёж", "Çertyoj"));

        words.add(new Word("Technical Drawing", "Технический чертёж", "Texniki çertyoj"));
        words.add(new Word("Specification", "Спецификация", "Spesifikasiya"));
        words.add(new Word("Measurement", "Измерение", "Ölçmə"));
        words.add(new Word("Dimension", "Размер", "Ölçü"));
        words.add(new Word("Length", "Длина", "Uzunluq"));
        words.add(new Word("Width", "Ширина", "En"));
        words.add(new Word("Height", "Высота", "Hündürlük"));
        words.add(new Word("Thickness", "Толщина", "Qalınlıq"));
        words.add(new Word("Weight", "Вес", "Çəki"));
        words.add(new Word("Temperature", "Температура", "Temperatur"));

        words.add(new Word("Pressure", "Давление", "Təzyiq"));
        words.add(new Word("Speed", "Скорость", "Sürət"));
        words.add(new Word("Force", "Сила", "Qüvvə"));
        words.add(new Word("Power", "Мощность", "Güc"));
        words.add(new Word("Voltage", "Напряжение", "Gərginlik"));
        words.add(new Word("Current", "Ток", "Cərəyan"));
        words.add(new Word("Energy", "Энергия", "Enerji"));
        words.add(new Word("Electricity", "Электричество", "Elektrik"));
        words.add(new Word("Gas", "Газ", "Qaz"));
        words.add(new Word("Water", "Вода", "Su"));

        words.add(new Word("Oil", "Масло", "Yağ"));
        words.add(new Word("Coolant", "Охлаждающая жидкость", "Soyuducu maye"));
        words.add(new Word("Lubricant", "Смазка", "Sürtkü"));
        words.add(new Word("Tool", "Инструмент", "Alət"));
        words.add(new Word("Workpiece", "Заготовка / рабочая деталь", "Pəstah"));
        words.add(new Word("Fixture", "Приспособление", "Qurğu"));
        words.add(new Word("Clamp", "Зажим", "Sıxac"));
        words.add(new Word("Holder", "Держатель", "Tutacaq"));
        words.add(new Word("Cutter", "Резец / фреза", "Kəsici"));
        words.add(new Word("Blade", "Лезвие", "Bıçaq"));

        words.add(new Word("Drill", "Сверло / дрель", "Burğu"));
        words.add(new Word("Saw", "Пила", "Mişar"));
        words.add(new Word("Grinder", "Шлифовальная машина", "Şlifləyici"));
        words.add(new Word("Wrench", "Гаечный ключ", "Açar"));
        words.add(new Word("Hammer", "Молоток", "Çəkic"));
        words.add(new Word("Screwdriver", "Отвёртка", "Vintaçan"));
        words.add(new Word("Nut", "Гайка", "Qayka"));
        words.add(new Word("Bolt", "Болт", "Bolt"));
        words.add(new Word("Screw", "Винт / шуруп", "Vint"));
        words.add(new Word("Washer", "Шайба", "Şayba"));

        words.add(new Word("Bearing", "Подшипник", "Yastıqça"));
        words.add(new Word("Motor", "Двигатель", "Mühərrik"));
        words.add(new Word("Pump", "Насос", "Nasos"));
        words.add(new Word("Valve", "Клапан", "Klapan"));
        words.add(new Word("Pipe", "Труба", "Boru"));
        words.add(new Word("Hose", "Шланг", "Şlanq"));
        words.add(new Word("Cable", "Кабель", "Kabel"));
        words.add(new Word("Wire", "Провод / проволока", "Tel"));
        words.add(new Word("Switch", "Выключатель / переключатель", "Açar"));
        words.add(new Word("Button", "Кнопка", "Düymə"));

        words.add(new Word("Start", "Запуск / начать", "Başlatmaq"));
        words.add(new Word("Stop", "Остановить / остановка", "Dayandırmaq"));
        words.add(new Word("Check", "Проверить", "Yoxlamaq"));
        words.add(new Word("Clean", "Очистить", "Təmizləmək"));
        words.add(new Word("Adjust", "Отрегулировать", "Tənzimləmək"));
        words.add(new Word("Measure", "Измерить", "Ölçmək"));
        words.add(new Word("Install", "Установить", "Quraşdırmaq"));
        words.add(new Word("Remove", "Снять / удалить", "Çıxarmaq"));
        words.add(new Word("Replace", "Заменить", "Əvəz etmək"));
        words.add(new Word("Operate", "Эксплуатировать / управлять", "İdarə etmək"));

        return words;
    }
}