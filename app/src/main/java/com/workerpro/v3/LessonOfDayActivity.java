package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class LessonOfDayActivity extends Activity {

    private TextToSpeech tts;
    private String language = "RU";

    private final Set<String> learnedWords = new HashSet<>();

    private int learnedToday = 0;
    private int streak = 0;
    private int bestStreak = 0;

    private TextView progressText;
    private TextView streakText;

    /*
     * ============================================================
     * 200 ПРОФЕССИОНАЛЬНЫХ СЛОВ
     *
     * English | Russian | Azerbaijani
     * 5 слов в день = 40 дней
     * ============================================================
     */

    private final String[][] words = {

            {"Safety", "Безопасность", "Təhlükəsizlik"},
            {"Worker", "Рабочий", "İşçi"},
            {"Machine", "Станок", "Dəzgah"},
            {"Tool", "Инструмент", "Alət"},
            {"Quality", "Качество", "Keyfiyyət"},
            {"Defect", "Дефект", "Qüsur"},
            {"Sensor", "Датчик", "Sensor"},
            {"CNC", "Станок с ЧПУ", "CNC dəzgahı"},
            {"Stamping", "Штамповка", "Ştamplama"},
            {"Welding", "Сварка", "Qaynaq"},

            {"Maintenance", "Техническое обслуживание", "Texniki xidmət"},
            {"Repair", "Ремонт", "Təmir"},
            {"Measurement", "Измерение", "Ölçmə"},
            {"Tolerance", "Допуск", "Tolerans"},
            {"Emergency", "Аварийная ситуация", "Fövqəladə vəziyyət"},
            {"Helmet", "Каска", "Dəbilqə"},
            {"Gloves", "Перчатки", "Əlcəklər"},
            {"Fire", "Пожар", "Yanğın"},
            {"Operator", "Оператор", "Operator"},
            {"Production", "Производство", "İstehsalat"},

            {"Factory", "Завод", "Zavod"},
            {"Process", "Процесс", "Proses"},
            {"Material", "Материал", "Material"},
            {"Task", "Задание", "Tapşırıq"},
            {"Workplace", "Рабочее место", "İş yeri"},
            {"Equipment", "Оборудование", "Avadanlıq"},
            {"System", "Система", "Sistem"},
            {"Control", "Контроль", "Nəzarət"},
            {"Check", "Проверка", "Yoxlama"},
            {"Inspection", "Инспекция", "Yoxlama"},

            {"Standard", "Стандарт", "Standart"},
            {"Rule", "Правило", "Qayda"},
            {"Risk", "Риск", "Risk"},
            {"Danger", "Опасность", "Təhlükə"},
            {"Warning", "Предупреждение", "Xəbərdarlıq"},
            {"Accident", "Несчастный случай", "Qəza"},
            {"Protection", "Защита", "Mühafizə"},
            {"Shield", "Защитный экран", "Qoruyucu ekran"},
            {"Mask", "Маска", "Maska"},
            {"Goggles", "Защитные очки", "Qoruyucu eynək"},

            {"Boots", "Защитная обувь", "Qoruyucu ayaqqabı"},
            {"Uniform", "Рабочая форма", "İş forması"},
            {"Earplugs", "Беруши", "Qulaq tıxacları"},
            {"Vest", "Жилет", "Jilet"},
            {"First Aid", "Первая помощь", "İlk yardım"},
            {"Alarm", "Сигнал тревоги", "Həyəcan siqnalı"},
            {"Exit", "Выход", "Çıxış"},
            {"Entrance", "Вход", "Giriş"},
            {"Evacuation", "Эвакуация", "Təxliyə"},
            {"Fire Exit", "Пожарный выход", "Yanğın çıxışı"},

            {"Machine Guard", "Защитное ограждение станка", "Dəzgah qoruyucusu"},
            {"Button", "Кнопка", "Düymə"},
            {"Switch", "Переключатель", "Açar"},
            {"Emergency Stop", "Аварийная остановка", "Təcili dayandırma"},
            {"Start", "Запуск", "Başlatma"},
            {"Stop", "Остановка", "Dayandırma"},
            {"Reset", "Сброс", "Sıfırlama"},
            {"Program", "Программа", "Proqram"},
            {"Parameter", "Параметр", "Parametr"},
            {"Setting", "Настройка", "Parametr ayarı"},

            {"Speed", "Скорость", "Sürət"},
            {"Pressure", "Давление", "Təzyiq"},
            {"Temperature", "Температура", "Temperatur"},
            {"Force", "Сила", "Qüvvə"},
            {"Power", "Мощность", "Güc"},
            {"Voltage", "Напряжение", "Gərginlik"},
            {"Current", "Ток", "Cərəyan"},
            {"Frequency", "Частота", "Tezlik"},
            {"Motor", "Двигатель", "Mühərrik"},
            {"Pump", "Насос", "Nasos"},

            {"Valve", "Клапан", "Klapan"},
            {"Pipe", "Труба", "Boru"},
            {"Cable", "Кабель", "Kabel"},
            {"Wire", "Провод", "Tel"},
            {"Bearing", "Подшипник", "Yastıq"},
            {"Gear", "Шестерня", "Dişli çarx"},
            {"Shaft", "Вал", "Val"},
            {"Bolt", "Болт", "Bolt"},
            {"Nut", "Гайка", "Qayka"},
            {"Screw", "Винт", "Vint"},

            {"Washer", "Шайба", "Şayba"},
            {"Spring", "Пружина", "Yay"},
            {"Plate", "Пластина", "Lövhə"},
            {"Sheet", "Лист металла", "Metal təbəqə"},
            {"Metal", "Металл", "Metal"},
            {"Steel", "Сталь", "Polad"},
            {"Aluminum", "Алюминий", "Alüminium"},
            {"Copper", "Медь", "Mis"},
            {"Alloy", "Сплав", "Ərinti"},
            {"Surface", "Поверхность", "Səth"},

            {"Thickness", "Толщина", "Qalınlıq"},
            {"Length", "Длина", "Uzunluq"},
            {"Width", "Ширина", "En"},
            {"Height", "Высота", "Hündürlük"},
            {"Diameter", "Диаметр", "Diametr"},
            {"Angle", "Угол", "Bucaq"},
            {"Weight", "Вес", "Çəki"},
            {"Size", "Размер", "Ölçü"},
            {"Dimension", "Размер / габарит", "Ölçü"},
            {"Accuracy", "Точность", "Dəqiqlik"},

            {"Caliper", "Штангенциркуль", "Ştangensirkul"},
            {"Micrometer", "Микрометр", "Mikrometr"},
            {"Ruler", "Линейка", "Xətkeş"},
            {"Gauge", "Измерительный прибор", "Ölçü cihazı"},
            {"Scale", "Шкала", "Şkala"},
            {"Measure", "Измерять", "Ölçmək"},
            {"Check Dimension", "Проверить размер", "Ölçünü yoxlamaq"},
            {"Limit", "Предел", "Hədd"},
            {"Minimum", "Минимум", "Minimum"},
            {"Maximum", "Максимум", "Maksimum"},

            {"Tolerance Zone", "Поле допуска", "Tolerans sahəsi"},
            {"Drawing", "Чертёж", "Çertyoj"},
            {"Technical Drawing", "Технический чертёж", "Texniki çertyoj"},
            {"Specification", "Спецификация", "Spesifikasiya"},
            {"Instruction", "Инструкция", "Təlimat"},
            {"Manual", "Руководство", "Təlimat kitabçası"},
            {"Document", "Документ", "Sənəd"},
            {"Report", "Отчёт", "Hesabat"},
            {"Record", "Запись", "Qeyd"},
            {"Number", "Номер", "Nömrə"},

            {"Part", "Деталь", "Detal"},
            {"Component", "Компонент", "Komponent"},
            {"Product", "Изделие", "Məhsul"},
            {"Workpiece", "Заготовка", "Pəstah"},
            {"Blank", "Заготовка", "Hazırlaşdırılmış detal"},
            {"Finished Part", "Готовая деталь", "Hazır detal"},
            {"Raw Material", "Сырьё", "Xammal"},
            {"Batch", "Партия", "Partiya"},
            {"Order", "Заказ", "Sifariş"},
            {"Production Line", "Производственная линия", "İstehsal xətti"},

            {"Press", "Пресс", "Pres"},
            {"Press Tool", "Штамп", "Ştamp"},
            {"Die", "Матрица", "Matrisa"},
            {"Punch", "Пуансон", "Puanson"},
            {"Mold", "Форма", "Forma"},
            {"Stamping Press", "Штамповочный пресс", "Ştamplama presi"},
            {"Hot Stamping", "Горячая штамповка", "İsti ştamplama"},
            {"Cold Stamping", "Холодная штамповка", "Soyuq ştamplama"},
            {"Heating", "Нагрев", "Qızdırma"},
            {"Cooling", "Охлаждение", "Soyutma"},

            {"Furnace", "Печь", "Soba"},
            {"Oven", "Печь / камера нагрева", "Qızdırıcı soba"},
            {"Burner", "Горелка", "Yandırıcı"},
            {"Flame", "Пламя", "Alov"},
            {"Gas", "Газ", "Qaz"},
            {"Fuel", "Топливо", "Yanacaq"},
            {"Heat", "Тепло", "İstilik"},
            {"Hot", "Горячий", "İsti"},
            {"Cold", "Холодный", "Soyuq"},
            {"Temperature Sensor", "Датчик температуры", "Temperatur sensoru"},

            {"Welding Machine", "Сварочный аппарат", "Qaynaq aparatı"},
            {"Welder", "Сварщик", "Qaynaqçı"},
            {"Welding Helmet", "Сварочная маска", "Qaynaq maskası"},
            {"Electrode", "Электрод", "Elektrod"},
            {"Welding Cable", "Сварочный кабель", "Qaynaq kabeli"},
            {"Arc", "Дуга", "Qövs"},
            {"Weld", "Сварной шов", "Qaynaq tikişi"},
            {"Gas Cylinder", "Газовый баллон", "Qaz balonu"},
            {"Grounding", "Заземление", "Torpaqlama"},
            {"Spark", "Искра", "Qığılcım"},

            {"Electrical", "Электрический", "Elektrik"},
            {"Electronics", "Электроника", "Elektronika"},
            {"Voltage Sensor", "Датчик напряжения", "Gərginlik sensoru"},
            {"Magnetic Sensor", "Магнитный датчик", "Maqnit sensoru"},
            {"Proximity Sensor", "Датчик приближения", "Yaxınlıq sensoru"},
            {"Switch Sensor", "Датчик переключения", "Keçid sensoru"},
            {"Signal", "Сигнал", "Siqnal"},
            {"Input", "Вход", "Giriş"},
            {"Output", "Выход", "Çıxış"},
            {"Circuit", "Электрическая цепь", "Elektrik dövrəsi"},

            {"Maintenance Schedule", "График обслуживания", "Texniki xidmət cədvəli"},
            {"Lubrication", "Смазка", "Yağlama"},
            {"Oil", "Масло", "Yağ"},
            {"Grease", "Смазка", "Sürtkü yağı"},
            {"Filter", "Фильтр", "Filtr"},
            {"Cleaning", "Очистка", "Təmizləmə"},
            {"Replacement", "Замена", "Dəyişdirmə"},
            {"Wear", "Износ", "Aşınma"},
            {"Broken", "Сломанный", "Sınıq"},
            {"Fault", "Неисправность", "Nasazlıq"},

            {"Troubleshooting", "Поиск неисправности", "Nasazlığın axtarışı"},
            {"Cause", "Причина", "Səbəb"},
            {"Solution", "Решение", "Həll"},
            {"Problem", "Проблема", "Problem"},
            {"Repair Work", "Ремонтные работы", "Təmir işləri"},
            {"Technician", "Техник", "Texnik"},
            {"Engineer", "Инженер", "Mühəndis"},
            {"Supervisor", "Мастер / руководитель", "Nəzarətçi"},
            {"Team", "Команда", "Komanda"},
            {"Shift", "Смена", "Növbə"},

            {"Morning Shift", "Утренняя смена", "Səhər növbəsi"},
            {"Night Shift", "Ночная смена", "Gecə növbəsi"},
            {"Break", "Перерыв", "Fasilə"},
            {"Work Time", "Рабочее время", "İş vaxtı"},
            {"Overtime", "Сверхурочная работа", "Əlavə iş"},
            {"Experience", "Опыт", "Təcrübə"},
            {"Training", "Обучение", "Təlim"},
            {"Skill", "Навык", "Bacarıq"},
            {"Certificate", "Сертификат", "Sertifikat"},
            {"Qualification", "Квалификация", "İxtisas"},

            {"Productivity", "Производительность", "Məhsuldarlıq"},
            {"Efficiency", "Эффективность", "Səmərəlilik"},
            {"Waste", "Отходы", "Tullantı"},
            {"Scrap", "Брак / лом", "Zay məhsul"},
            {"Rework", "Переделка", "Yenidən işləmə"},
            {"Process Control", "Контроль процесса", "Prosesə nəzarət"},
            {"Quality Check", "Проверка качества", "Keyfiyyət yoxlaması"},
            {"Final Inspection", "Финальная проверка", "Son yoxlama"},
            {"Approved", "Одобрено", "Təsdiqlənib"},
            {"Rejected", "Отклонено", "Rədd edilib"}

    };

    /*
     * ============================================================
     * РАБОЧИЕ ФРАЗЫ
     * ============================================================
     */

    private final String[][] phrases = {

            {"Safety first.",
                    "Безопасность прежде всего.",
                    "Təhlükəsizlik hər şeydən əvvəl."},

            {"Check the machine.",
                    "Проверь станок.",
                    "Dəzgahı yoxla."},

            {"I found a defect.",
                    "Я нашёл дефект.",
                    "Qüsur tapdım."},

            {"Please check my work.",
                    "Пожалуйста, проверьте мою работу.",
                    "Zəhmət olmasa işimi yoxlayın."},

            {"The machine stopped.",
                    "Станок остановился.",
                    "Dəzgah dayandı."},

            {"I need help.",
                    "Мне нужна помощь.",
                    "Mənə kömək lazımdır."},

            {"Wear your gloves.",
                    "Надень перчатки.",
                    "Əlcəklərini tax."},

            {"Check the CNC program.",
                    "Проверь программу CNC.",
                    "CNC proqramını yoxla."},

            {"Stop the machine.",
                    "Останови станок.",
                    "Dəzgahı dayandır."},

            {"The quality is good.",
                    "Качество хорошее.",
                    "Keyfiyyət yaxşıdır."},

            {"The tool is worn.",
                    "Инструмент изношен.",
                    "Alət aşınıb."},

            {"The machine needs maintenance.",
                    "Станку нужно обслуживание.",
                    "Dəzgaha texniki xidmət lazımdır."},

            {"The temperature is too high.",
                    "Температура слишком высокая.",
                    "Temperatur çox yüksəkdir."},

            {"The pressure is too low.",
                    "Давление слишком низкое.",
                    "Təzyiq çox aşağıdır."},

            {"Check the sensor.",
                    "Проверь датчик.",
                    "Sensoru yoxla."},

            {"The sensor is not working.",
                    "Датчик не работает.",
                    "Sensor işləmir."},

            {"The tool needs replacement.",
                    "Инструмент нужно заменить.",
                    "Aləti dəyişmək lazımdır."},

            {"Measure the part.",
                    "Измерь деталь.",
                    "Detalın ölçüsünü yoxla."},

            {"Check the drawing.",
                    "Проверь чертёж.",
                    "Çertyoju yoxla."},

            {"The dimension is correct.",
                    "Размер правильный.",
                    "Ölçü düzgündür."},

            {"The dimension is wrong.",
                    "Размер неправильный.",
                    "Ölçü yanlışdır."},

            {"There is a problem with the machine.",
                    "Есть проблема со станком.",
                    "Dəzgahda problem var."},

            {"Call the technician.",
                    "Позови техника.",
                    "Texniki işçini çağır."},

            {"Call the supervisor.",
                    "Позови мастера.",
                    "Nəzarətçini çağır."},

            {"The machine is ready.",
                    "Станок готов.",
                    "Dəzgah hazırdır."},

            {"The material is ready.",
                    "Материал готов.",
                    "Material hazırdır."},

            {"The work is finished.",
                    "Работа закончена.",
                    "İş bitib."},

            {"Start the machine.",
                    "Запусти станок.",
                    "Dəzgahı işə sal."},

            {"Turn off the machine.",
                    "Выключи станок.",
                    "Dəzgahı söndür."},

            {"Press the emergency stop button.",
                    "Нажми кнопку аварийной остановки.",
                    "Təcili dayandırma düyməsinə bas."}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String savedLanguage =
                getIntent().getStringExtra("LANGUAGE");

        if (savedLanguage != null) {
            language = savedLanguage;
        }

        loadProgress();
        createScreen();

        tts = new TextToSpeech(
                this,
                new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {

                        if (status == TextToSpeech.SUCCESS) {
                            tts.setLanguage(Locale.US);
                        }
                    }
                }
        );
    }

    private void createScreen() {

        ScrollView scrollView =
                new ScrollView(this);

        LinearLayout root =
                new LinearLayout(this);

        root.setOrientation(
                LinearLayout.VERTICAL
        );

        root.setPadding(
                20, 20, 20, 20
        );

        root.setBackgroundColor(
                Color.WHITE
        );

        // TITLE

        TextView title =
                new TextView(this);

        title.setText(
                "📚 " + getTitleText()
        );

        title.setTextSize(28);

        title.setTypeface(
                null,
                Typeface.BOLD
        );

        title.setTextColor(
                Color.rgb(0, 130, 70)
        );

        title.setGravity(
                Gravity.CENTER
        );

        title.setPadding(
                0, 10, 0, 20
        );

        root.addView(title);

        // DAY

        Calendar calendar =
                Calendar.getInstance();

        int day =
                calendar.get(Calendar.DAY_OF_YEAR);

        TextView dayText =
                new TextView(this);

        dayText.setText(
                getDayText() +
                        " #" +
                        day +
                        "\n📚 " +
                        getCourseText()
        );

        dayText.setTextSize(18);

        dayText.setGravity(
                Gravity.CENTER
        );

        dayText.setTextColor(
                Color.DKGRAY
        );

        dayText.setPadding(
                0, 0, 0, 15
        );

        root.addView(dayText);

        // STREAK

        streakText =
                new TextView(this);

        streakText.setTextSize(20);

        streakText.setTypeface(
                null,
                Typeface.BOLD
        );

        streakText.setGravity(
                Gravity.CENTER
        );

        streakText.setTextColor(
                Color.rgb(220, 120, 0)
        );

        streakText.setPadding(
                0, 5, 0, 8
        );

        root.addView(streakText);

        updateStreak();

        // PROGRESS

        progressText =
                new TextView(this);

        progressText.setTextSize(20);

        progressText.setTypeface(
                null,
                Typeface.BOLD
        );

        progressText.setGravity(
                Gravity.CENTER
        );

        progressText.setTextColor(
                Color.rgb(0, 120, 60)
        );

        progressText.setPadding(
                0, 5, 0, 20
        );

        root.addView(progressText);

        updateProgress();

        // WORDS TITLE

        TextView wordsTitle =
                new TextView(this);

        wordsTitle.setText(
                "📖 " +
                        getWordsTitle()
        );

        wordsTitle.setTextSize(23);

        wordsTitle.setTypeface(
                null,
                Typeface.BOLD
        );

        wordsTitle.setTextColor(
                Color.rgb(0, 120, 60)
        );

        wordsTitle.setPadding(
                0, 10, 0, 15
        );

        root.addView(wordsTitle);

        /*
         * 5 СЛОВ В ДЕНЬ
         */

        int startWord =
                (day * 5) % words.length;

        for (int i = 0; i < 5; i++) {

            int index =
                    (startWord + i)
                            % words.length;

            addWordCard(
                    root,
                    words[index]
            );
        }

        // PHRASES TITLE

        TextView phrasesTitle =
                new TextView(this);

        phrasesTitle.setText(
                "💬 " +
                        getPhrasesTitle()
        );

        phrasesTitle.setTextSize(23);

        phrasesTitle.setTypeface(
                null,
                Typeface.BOLD
        );

        phrasesTitle.setTextColor(
                Color.rgb(0, 120, 60)
        );

        phrasesTitle.setPadding(
                0, 25, 0, 15
        );

        root.addView(phrasesTitle);

        /*
         * 3 ФРАЗЫ В ДЕНЬ
         */

        int startPhrase =
                (day * 3) % phrases.length;

        for (int i = 0; i < 3; i++) {

            int index =
                    (startPhrase + i)
                            % phrases.length;

            addPhraseCard(
                    root,
                    phrases[index]
            );
        }

        // FOOTER

        TextView footer =
                new TextView(this);

        footer.setText(
                "\nF.S"
        );

        footer.setTextSize(15);

        footer.setGravity(
                Gravity.CENTER
        );

        footer.setTextColor(
                Color.GRAY
        );

        footer.setPadding(
                0, 20, 0, 10
        );

        root.addView(footer);

        scrollView.addView(root);

        setContentView(scrollView);
    }

    private void addWordCard(
            LinearLayout root,
            String[] word) {

        LinearLayout card =
                new LinearLayout(this);

        card.setOrientation(
                LinearLayout.VERTICAL
        );

        card.setPadding(
                20, 15, 20, 15
        );

        GradientDrawable background =
                new GradientDrawable();

        background.setColor(
                Color.rgb(
                        242, 248, 244
                )
        );

        background.setCornerRadius(
                18
        );

        background.setStroke(
                2,
                Color.rgb(
                        0, 130, 70
                )
        );

        card.setBackground(background);

        TextView english =
                new TextView(this);

        english.setText(
                "🇬🇧 " +
                        word[0]
        );

        english.setTextSize(22);

        english.setTypeface(
                null,
                Typeface.BOLD
        );

        english.setTextColor(
                Color.BLACK
        );

        card.addView(english);

        TextView translation =
                new TextView(this);

        if (language.equals("AZ")) {

            translation.setText(
                    "🇦🇿 " +
                            word[2]
            );

        } else if (language.equals("EN")) {

            translation.setText(
                    "🇷🇺 " +
                            word[1] +
                            "\n🇦🇿 " +
                            word[2]
            );

        } else {

            translation.setText(
                    "🇷🇺 " +
                            word[1] +
                            "\n🇦🇿 " +
                            word[2]
            );
        }

        translation.setTextSize(18);

        translation.setTextColor(
                Color.DKGRAY
        );

        translation.setPadding(
                0, 8, 0, 8
        );

        card.addView(translation);

        // LISTEN

        Button listen =
                new Button(this);

        listen.setText(
                "🔊 " +
                        getListenText()
        );

        listen.setOnClickListener(
                v -> speak(word[0])
        );

        card.addView(listen);

        // LEARNED

        Button learned =
                new Button(this);

        boolean isLearned =
                learnedWords.contains(
                        wordKey(word)
                );

        if (isLearned) {

            learned.setText(
                    "✅ " +
                            getLearnedText()
            );

        } else {

            learned.setText(
                    "⭐ " +
                            getLearnText()
            );
        }

        learned.setOnClickListener(
                v -> {

                    String key =
                            wordKey(word);

                    if (!learnedWords.contains(key)) {

                        learnedWords.add(key);

                        learnedToday++;

                        if (learnedToday > 5) {
                            learnedToday = 5;
                        }

                        saveProgress();

                        learned.setText(
                                "✅ " +
                                        getLearnedText()
                        );

                        updateProgress();

                        if (learnedToday == 5) {
                            completeToday();
                        }
                    }
                }
        );

        card.addView(learned);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );

        params.setMargins(
                0, 0, 0, 12
        );

        root.addView(
                card,
                params
        );
    }

    private void addPhraseCard(
            LinearLayout root,
            String[] phrase) {

        LinearLayout card =
                new LinearLayout(this);

        card.setOrientation(
                LinearLayout.VERTICAL
        );

        card.setPadding(
                20, 15, 20, 15
        );

        GradientDrawable background =
                new GradientDrawable();

        background.setColor(
                Color.rgb(
                        248, 250, 248
                )
        );

        background.setCornerRadius(
                18
        );

        background.setStroke(
                2,
                Color.rgb(
                        0, 130, 70
                )
        );

        card.setBackground(background);

        TextView text =
                new TextView(this);

        text.setText(
                "🇬🇧 " +
                        phrase[0] +
                        "\n\n🇷🇺 " +
                        phrase[1] +
                        "\n🇦🇿 " +
                        phrase[2]
        );

        text.setTextSize(18);

        text.setTextColor(
                Color.BLACK
        );

        card.addView(text);

        Button listen =
                new Button(this);

        listen.setText(
                "🔊 " +
                        getListenText()
        );

        listen.setOnClickListener(
                v -> speak(phrase[0])
        );

        card.addView(listen);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );

        params.setMargins(
                0, 0, 0, 12
        );

        root.addView(
                card,
                params
        );
    }

    private void completeToday() {

        Calendar calendar =
                Calendar.getInstance();

        int today =
                calendar.get(Calendar.DAY_OF_YEAR);

        android.content.SharedPreferences prefs =
                getSharedPreferences(
                        "WORKER_PRO_LESSON_PROGRESS",
                        MODE_PRIVATE
                );

        int completedDay =
                prefs.getInt(
                        "completedDay",
                        -1
                );

        if (completedDay != today) {

            streak++;

            if (streak > bestStreak) {
                bestStreak = streak;
            }

            prefs.edit()
                    .putInt(
                            "completedDay",
                            today
                    )
                    .putInt(
                            "streak",
                            streak
                    )
                    .putInt(
                            "bestStreak",
                            bestStreak
                    )
                    .apply();

            updateStreak();
        }
    }

    private void loadProgress() {

        android.content.SharedPreferences prefs =
                getSharedPreferences(
                        "WORKER_PRO_LESSON_PROGRESS",
                        MODE_PRIVATE
                );

        Calendar calendar =
                Calendar.getInstance();

        int today =
                calendar.get(
                        Calendar.DAY_OF_YEAR
                );

        int savedDay =
                prefs.getInt(
                        "day",
                        -1
                );

        streak =
                prefs.getInt(
                        "streak",
                        0
                );

        bestStreak =
                prefs.getInt(
                        "bestStreak",
                        0
                );

        if (savedDay == today) {

            learnedToday =
                    prefs.getInt(
                            "learnedToday",
                            0
                    );

            String savedWords =
                    prefs.getString(
                            "learnedWords",
                            ""
                    );

            if (!savedWords.isEmpty()) {

                String[] list =
                        savedWords.split("\\|");

                for (String item : list) {

                    if (!item.isEmpty()) {
                        learnedWords.add(item);
                    }
                }
            }

        } else {

            learnedToday = 0;

            learnedWords.clear();

            prefs.edit()
                    .putInt(
                            "day",
                            today
                    )
                    .putInt(
                            "learnedToday",
                            0
                    )
                    .putString(
                            "learnedWords",
                            ""
                    )
                    .apply();
        }
    }

    private void saveProgress() {

        StringBuilder builder =
                new StringBuilder();

        for (String word :
                learnedWords) {

            builder.append(word)
                    .append("|");
        }

        Calendar calendar =
                Calendar.getInstance();

        int today =
                calendar.get(
                        Calendar.DAY_OF_YEAR
                );

        getSharedPreferences(
                "WORKER_PRO_LESSON_PROGRESS",
                MODE_PRIVATE
        )
                .edit()
                .putInt(
                        "day",
                        today
                )
                .putInt(
                        "learnedToday",
                        learnedToday
                )
                .putString(
                        "learnedWords",
                        builder.toString()
                )
                .apply();
    }

    private void updateProgress() {

        if (progressText != null) {

            progressText.setText(
                    "📊 " +
                            getProgressText() +
                            ": " +
                            learnedToday +
                            " / 5"
            );
        }
    }

    private void updateStreak() {

        if (streakText != null) {

            streakText.setText(
                    "🔥 " +
                            getStreakText() +
                            ": " +
                            streak +
                            "\n🏆 " +
                            getBestText() +
                            ": " +
                            bestStreak
            );
        }
    }

    private String wordKey(
            String[] word) {

        return word[0];
    }

    private void speak(
            String text) {

        if (tts != null) {

            tts.setLanguage(
                    Locale.US
            );

            tts.speak(
                    text,
                    TextToSpeech.QUEUE_FLUSH,
                    null,
                    "worker_pro_lesson"
            );
        }
    }

    private String getTitleText() {

        if (language.equals("AZ")) {
            return "Günün dərsi";
        }

        if (language.equals("EN")) {
            return "Lesson of the Day";
        }

        if (language.equals("TR")) {
            return "Günün Dersi";
        }

        if (language.equals("DE")) {
            return "Lektion des Tages";
        }

        return "Урок дня";
    }

    private String getDayText() {

        if (language.equals("AZ")) {
            return "Gündəlik dərs";
        }

        if (language.equals("EN")) {
            return "Daily lesson";
        }

        if (language.equals("TR")) {
            return "Gündəlik dərs";
        }

        if (language.equals("DE")) {
            return "Tägliche Lektion";
        }

        return "Ежедневный урок";
    }

    private String getCourseText() {

        if (language.equals("AZ")) {
            return "200 peşəkar söz";
        }

        if (language.equals("EN")) {
            return "200 professional words";
        }

        if (language.equals("TR")) {
            return "200 profesyonel kelime";
        }

        if (language.equals("DE")) {
            return "200 Fachwörter";
        }

        return "200 профессиональных слов";
    }

    private String getWordsTitle() {

        if (language.equals("AZ")) {
            return "5 yeni söz";
        }

        if (language.equals("EN")) {
            return "5 New Words";
        }

        if (language.equals("TR")) {
            return "5 Yeni Kelime";
        }

        if (language.equals("DE")) {
            return "5 neue Wörter";
        }

        return "5 новых слов";
    }

    private String getPhrasesTitle() {

        if (language.equals("AZ")) {
            return "3 işçi ifadəsi";
        }

        if (language.equals("EN")) {
            return "3 Worker Phrases";
        }

        if (language.equals("TR")) {
            return "3 İşçi İfadesi";
        }

        if (language.equals("DE")) {
            return "3 Arbeitsphrasen";
        }

        return "3 рабочие фразы";
    }

    private String getListenText() {

        if (language.equals("AZ")) {
            return "Dinlə";
        }

        if (language.equals("EN")) {
            return "Listen";
        }

        if (language.equals("TR")) {
            return "Dinle";
        }

        if (language.equals("DE")) {
            return "Anhören";
        }

        return "Послушать";
    }

    private String getLearnText() {

        if (language.equals("AZ")) {
            return "Öyrəndim";
        }

        if (language.equals("EN")) {
            return "I learned it";
        }

        if (language.equals("TR")) {
            return "Öğrendim";
        }

        if (language.equals("DE")) {
            return "Gelernt";
        }

        return "Я выучил";
    }

    private String getLearnedText() {

        if (language.equals("AZ")) {
            return "Öyrənildi";
        }

        if (language.equals("EN")) {
            return "Learned";
        }

        if (language.equals("TR")) {
            return "Öyrənildi";
        }

        if (language.equals("DE")) {
            return "Gelernt";
        }

        return "Выучено";
    }

    private String getProgressText() {

        if (language.equals("AZ")) {
            return "Bugünkü irəliləyiş";
        }

        if (language.equals("EN")) {
            return "Today's progress";
        }

        if (language.equals("TR")) {
            return "Bugünkü ilerleme";
        }

        if (language.equals("DE")) {
            return "Fortschritt heute";
        }

        return "Прогресс сегодня";
    }

    private String getStreakText() {

        if (language.equals("AZ")) {
            return "Ardıcıl günlər";
        }

        if (language.equals("EN")) {
            return "Day streak";
        }

        if (language.equals("TR")) {
            return "Ardışık günler";
        }

        if (language.equals("DE")) {
            return "Tagesserie";
        }

        return "Дней подряд";
    }

    private String getBestText() {

        if (language.equals("AZ")) {
            return "Ən yaxşı nəticə";
        }

        if (language.equals("EN")) {
            return "Best streak";
        }

        if (language.equals("TR")) {
            return "Ən yaxşı nəticə";
        }

        if (language.equals("DE")) {
            return "Beste Serie";
        }

        return "Лучший результат";
    }

    @Override
    protected void onDestroy() {

        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }

        super.onDestroy();
    }
}