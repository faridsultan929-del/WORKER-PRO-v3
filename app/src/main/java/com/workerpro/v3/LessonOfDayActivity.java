package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.View;
import android.widget.*;
import android.content.Context;
import java.util.*;

public class LessonOfDayActivity extends Activity {

    private TextToSpeech tts;
    private String language = "RU";

    private int learnedWords = 0;
    private int learnedToday = 0;
    private int streak = 0;
    private int bestStreak = 0;

    private LinearLayout container;
    private SharedPreferences prefs;

    // =========================================================
    // 200 РАБОЧИХ ФРАЗ
    // =========================================================

    private final String[][] phrases = {

        {"Safety first.", "Безопасность прежде всего.", "Təhlükəsizlik hər şeydən vacibdir."},
        {"Check the machine.", "Проверь станок.", "Dəzgahı yoxla."},
        {"I found a defect.", "Я обнаружил дефект.", "Mən qüsur aşkar etdim."},
        {"Please check my work.", "Пожалуйста, проверьте мою работу.", "Zəhmət olmasa, işimi yoxlayın."},
        {"The machine stopped.", "Станок остановился.", "Dəzgah dayandı."},
        {"I need help.", "Мне нужна помощь.", "Mənə kömək lazımdır."},
        {"Wear your gloves.", "Надень перчатки.", "Əlcəklərini geyin."},
        {"Check the CNC program.", "Проверь программу CNC.", "CNC proqramını yoxla."},
        {"Stop the machine.", "Останови станок.", "Dəzgahı dayandır."},
        {"The quality is good.", "Качество хорошее.", "Keyfiyyət yaxşıdır."},
        {"The tool is worn.", "Инструмент изношен.", "Alət köhnəlib."},
        {"The machine needs maintenance.", "Станку требуется обслуживание.", "Dəzgaha texniki xidmət lazımdır."},
        {"The temperature is too high.", "Температура слишком высокая.", "Temperatur çox yüksəkdir."},
        {"The pressure is too low.", "Давление слишком низкое.", "Təzyiq çox aşağıdır."},
        {"Check the sensor.", "Проверь датчик.", "Sensoru yoxla."},
        {"The sensor is not working.", "Датчик не работает.", "Sensor işləmir."},
        {"The tool needs replacement.", "Инструмент нужно заменить.", "Aləti dəyişmək lazımdır."},
        {"Measure the part.", "Измерь деталь.", "Detalın ölçüsünü yoxla."},
        {"Check the drawing.", "Проверь чертёж.", "Çertyoju yoxla."},
        {"The dimension is correct.", "Размер правильный.", "Ölçü düzgündür."},
        {"The dimension is wrong.", "Размер неправильный.", "Ölçü səhvdir."},
        {"There is a problem with the machine.", "Есть проблема со станком.", "Dəzgahla bağlı problem var."},
        {"Call the technician.", "Позови техника.", "Texniki çağır."},
        {"Call the supervisor.", "Позови мастера.", "Nəzarətçini çağır."},
        {"The machine is ready.", "Станок готов.", "Dəzgah hazırdır."},
        {"The material is ready.", "Материал готов.", "Material hazırdır."},
        {"The work is finished.", "Работа закончена.", "İş bitib."},
        {"Start the machine.", "Запусти станок.", "Dəzgahı işə sal."},
        {"Turn off the machine.", "Выключи станок.", "Dəzgahı söndür."},
        {"Press the emergency stop button.", "Нажми кнопку аварийной остановки.", "Təcili dayandırma düyməsinə bas."},

        {"Check the oil level.", "Проверь уровень масла.", "Yağ səviyyəsini yoxla."},
        {"Check the pressure.", "Проверь давление.", "Təzyiqi yoxla."},
        {"Check the temperature.", "Проверь температуру.", "Temperaturu yoxla."},
        {"The motor is running.", "Двигатель работает.", "Mühərrik işləyir."},
        {"The motor is hot.", "Двигатель горячий.", "Mühərrik istidir."},
        {"The pump is running.", "Насос работает.", "Nasos işləyir."},
        {"The valve is closed.", "Клапан закрыт.", "Klapan bağlıdır."},
        {"Open the valve.", "Открой клапан.", "Klapanı aç."},
        {"Close the valve.", "Закрой клапан.", "Klapanı bağla."},
        {"Check the cable.", "Проверь кабель.", "Kabeli yoxla."},

        {"Check the wire.", "Проверь провод.", "Teli yoxla."},
        {"The bearing is worn.", "Подшипник изношен.", "Yastıq köhnəlib."},
        {"The gear is damaged.", "Шестерня повреждена.", "Dişli çarx zədələnib."},
        {"Check the shaft.", "Проверь вал.", "Valı yoxla."},
        {"Tighten the bolt.", "Затяни болт.", "Boltu bərkid."},
        {"Tighten the nut.", "Затяни гайку.", "Qaykanı bərkid."},
        {"Remove the screw.", "Сними винт.", "Vinti çıxart."},
        {"Check the washer.", "Проверь шайбу.", "Şaybanı yoxla."},
        {"The spring is broken.", "Пружина сломана.", "Yay sınıb."},
        {"Check the plate.", "Проверь пластину.", "Lövhəni yoxla."},

        {"Check the sheet.", "Проверь лист металла.", "Metal təbəqəni yoxla."},
        {"The metal is hot.", "Металл горячий.", "Metal istidir."},
        {"The steel is strong.", "Сталь прочная.", "Polad möhkəmdir."},
        {"Check the aluminum part.", "Проверь алюминиевую деталь.", "Alüminium detalı yoxla."},
        {"The copper wire is damaged.", "Медный провод повреждён.", "Mis tel zədələnib."},
        {"Check the alloy.", "Проверь сплав.", "Ərintini yoxla."},
        {"Clean the surface.", "Очисти поверхность.", "Səthi təmizlə."},
        {"Check the thickness.", "Проверь толщину.", "Qalınlığı yoxla."},
        {"Check the length.", "Проверь длину.", "Uzunluğu yoxla."},
        {"Check the width.", "Проверь ширину.", "Eni yoxla."},

        {"Check the height.", "Проверь высоту.", "Hündürlüyü yoxla."},
        {"Check the diameter.", "Проверь диаметр.", "Diametri yoxla."},
        {"Check the angle.", "Проверь угол.", "Bucağı yoxla."},
        {"Check the weight.", "Проверь вес.", "Çəkini yoxla."},
        {"Check the size.", "Проверь размер.", "Ölçünü yoxla."},
        {"We need high accuracy.", "Нам нужна высокая точность.", "Bizə yüksək dəqiqlik lazımdır."},
        {"Use the caliper.", "Используй штангенциркуль.", "Ştangensirkuldan istifadə et."},
        {"Use the micrometer.", "Используй микрометр.", "Mikrometrdən istifadə et."},
        {"Measure it again.", "Измерь это ещё раз.", "Bir daha ölç."},
        {"The measurement is correct.", "Измерение правильное.", "Ölçmə düzgündür."},

        {"Check the tolerance.", "Проверь допуск.", "Toleransı yoxla."},
        {"It is within tolerance.", "Это в пределах допуска.", "Bu, tolerans daxilindədir."},
        {"It is outside tolerance.", "Это вне допуска.", "Bu, toleransdan kənardadır."},
        {"Check the technical drawing.", "Проверь технический чертёж.", "Texniki çertyoju yoxla."},
        {"Read the instruction.", "Прочитай инструкцию.", "Təlimatı oxu."},
        {"Follow the instruction.", "Следуй инструкции.", "Təlimata əməl et."},
        {"Check the document.", "Проверь документ.", "Sənədi yoxla."},
        {"Write a report.", "Напиши отчёт.", "Hesabat yaz."},
        {"Record the result.", "Запиши результат.", "Nəticəni qeyd et."},
        {"Check the part number.", "Проверь номер детали.", "Detal nömrəsini yoxla."},

        {"This part is damaged.", "Эта деталь повреждена.", "Bu detal zədələnib."},
        {"The component is good.", "Компонент исправен.", "Komponent yaxşıdır."},
        {"The product is ready.", "Изделие готово.", "Məhsul hazırdır."},
        {"Check the workpiece.", "Проверь заготовку.", "Pəstahı yoxla."},
        {"Prepare the material.", "Подготовь материал.", "Materialı hazırla."},
        {"Check the batch.", "Проверь партию.", "Partiyanı yoxla."},
        {"Check the order.", "Проверь заказ.", "Sifarişi yoxla."},
        {"The production line is running.", "Производственная линия работает.", "İstehsal xətti işləyir."},
        {"The press is ready.", "Пресс готов.", "Pres hazırdır."},
        {"Check the press tool.", "Проверь штамп.", "Ştampı yoxla."},

        {"Check the die.", "Проверь матрицу.", "Matrisanı yoxla."},
        {"Check the punch.", "Проверь пуансон.", "Puansonu yoxla."},
        {"The mold is clean.", "Форма чистая.", "Forma təmizdir."},
        {"The stamping press is working.", "Штамповочный пресс работает.", "Ştamplama presi işləyir."},
        {"Hot stamping is dangerous.", "Горячая штамповка опасна.", "İsti ştamplama təhlükəlidir."},
        {"Cold stamping is different.", "Холодная штамповка отличается.", "Soyuq ştamplama fərqlidir."},
        {"Check the heating system.", "Проверь систему нагрева.", "Qızdırma sistemini yoxla."},
        {"Check the cooling system.", "Проверь систему охлаждения.", "Soyutma sistemini yoxla."},
        {"The furnace is hot.", "Печь горячая.", "Soba istidir."},
        {"Check the burner.", "Проверь горелку.", "Yandırıcını yoxla."},

        {"The flame is stable.", "Пламя стабильное.", "Alov sabitdir."},
        {"Check the gas.", "Проверь газ.", "Qazı yoxla."},
        {"Check the fuel.", "Проверь топливо.", "Yanacağı yoxla."},
        {"The heat is too high.", "Жар слишком сильный.", "İstilik çox yüksəkdir."},
        {"The part is hot.", "Деталь горячая.", "Detal istidir."},
        {"Let the part cool.", "Дай детали остыть.", "Detalın soyumasını gözlə."},
        {"Check the temperature sensor.", "Проверь датчик температуры.", "Temperatur sensorunu yoxla."},
        {"Wear a welding helmet.", "Надень сварочную маску.", "Qaynaq maskasını geyin."},
        {"Check the welding machine.", "Проверь сварочный аппарат.", "Qaynaq aparatını yoxla."},
        {"The welder is ready.", "Сварщик готов.", "Qaynaqçı hazırdır."},

        {"Check the electrode.", "Проверь электрод.", "Elektrodu yoxla."},
        {"Check the welding cable.", "Проверь сварочный кабель.", "Qaynaq kabelini yoxla."},
        {"The arc is stable.", "Дуга стабильная.", "Qövs sabitdir."},
        {"Check the weld.", "Проверь сварной шов.", "Qaynaq tikişini yoxla."},
        {"The gas cylinder is full.", "Газовый баллон полный.", "Qaz balonu doludur."},
        {"Check the grounding.", "Проверь заземление.", "Torpaqlamanı yoxla."},
        {"Be careful with sparks.", "Будь осторожен с искрами.", "Qığılcımlardan ehtiyatlı ol."},
        {"Check the electrical system.", "Проверь электрическую систему.", "Elektrik sistemini yoxla."},
        {"Check the electronics.", "Проверь электронику.", "Elektronikanı yoxla."},
        {"Check the voltage sensor.", "Проверь датчик напряжения.", "Gərginlik sensorunu yoxla."},

        {"Check the magnetic sensor.", "Проверь магнитный датчик.", "Maqnit sensorunu yoxla."},
        {"Check the proximity sensor.", "Проверь датчик приближения.", "Yaxınlıq sensorunu yoxla."},
        {"The sensor gives a signal.", "Датчик даёт сигнал.", "Sensor siqnal verir."},
        {"Check the input signal.", "Проверь входной сигнал.", "Giriş siqnalını yoxla."},
        {"Check the output signal.", "Проверь выходной сигнал.", "Çıxış siqnalını yoxla."},
        {"Check the electrical circuit.", "Проверь электрическую цепь.", "Elektrik dövrəsini yoxla."},
        {"Follow the maintenance schedule.", "Следуй графику обслуживания.", "Texniki xidmət cədvəlinə əməl et."},
        {"Lubricate the machine.", "Смажь станок.", "Dəzgahı yağla."},
        {"Check the oil.", "Проверь масло.", "Yağı yoxla."},
        {"Add grease.", "Добавь смазку.", "Sürtkü yağı əlavə et."},

        {"Replace the filter.", "Замени фильтр.", "Filtri dəyiş."},
        {"Clean the machine.", "Очисти станок.", "Dəzgahı təmizlə."},
        {"Replace the damaged part.", "Замени повреждённую деталь.", "Zədələnmiş detalı dəyiş."},
        {"The part is worn.", "Деталь изношена.", "Detal köhnəlib."},
        {"The part is broken.", "Деталь сломана.", "Detal sınıb."},
        {"Find the fault.", "Найди неисправность.", "Nasazlığı tap."},
        {"Find the cause.", "Найди причину.", "Səbəbi tap."},
        {"Find a solution.", "Найди решение.", "Həll tap."},
        {"There is a problem.", "Есть проблема.", "Problem var."},
        {"Start the repair.", "Начни ремонт.", "Təmirə başla."},

        {"The technician is coming.", "Техник идёт.", "Texnik gəlir."},
        {"Call the engineer.", "Позови инженера.", "Mühəndisi çağır."},
        {"Tell the supervisor.", "Сообщи мастеру.", "Nəzarətçiyə xəbər ver."},
        {"Work as a team.", "Работайте командой.", "Komanda ilə işləyin."},
        {"The shift starts at nine.", "Смена начинается в девять.", "Növbə saat doqquzda başlayır."},
        {"The morning shift is ready.", "Утренняя смена готова.", "Səhər növbəsi hazırdır."},
        {"The night shift is finished.", "Ночная смена закончена.", "Gecə növbəsi bitib."},
        {"Take a short break.", "Сделай короткий перерыв.", "Qısa fasilə et."},
        {"Work time is finished.", "Рабочее время закончено.", "İş vaxtı bitib."},
        {"I worked overtime.", "Я работал сверхурочно.", "Mən əlavə işləmişəm."},

        {"I have experience.", "У меня есть опыт.", "Mənim təcrübəm var."},
        {"I need training.", "Мне нужно обучение.", "Mənə təlim lazımdır."},
        {"I have this skill.", "У меня есть этот навык.", "Məndə bu bacarıq var."},
        {"I have a certificate.", "У меня есть сертификат.", "Mənim sertifikatım var."},
        {"I have the qualification.", "У меня есть квалификация.", "Mənim ixtisasım var."},
        {"Please repeat.", "Пожалуйста, повторите.", "Zəhmət olmasa, təkrar edin."},
        {"Please speak slowly.", "Пожалуйста, говорите медленно.", "Zəhmət olmasa, yavaş danışın."},
        {"I understand.", "Я понимаю.", "Mən başa düşürəm."},
        {"I do not understand.", "Я не понимаю.", "Mən başa düşmürəm."},
        {"Please explain.", "Пожалуйста, объясните.", "Zəhmət olmasa, izah edin."},

        {"What is the problem?", "В чём проблема?", "Problem nədir?"},
        {"What should I do?", "Что мне делать?", "Mən nə etməliyəm?"},
        {"Is the machine safe?", "Станок безопасен?", "Dəzgah təhlükəsizdir?"},
        {"Can I start the machine?", "Я могу запустить станок?", "Dəzgahı işə sala bilərəm?"},
        {"Can I stop the machine?", "Я могу остановить станок?", "Dəzgahı dayandıra bilərəm?"},
        {"Is the material ready?", "Материал готов?", "Material hazırdır?"},
        {"Is the drawing correct?", "Чертёж правильный?", "Çertyoj düzgündür?"},
        {"Is this dimension correct?", "Этот размер правильный?", "Bu ölçü düzgündür?"},
        {"Where is the tool?", "Где инструмент?", "Alət haradadır?"},
        {"Where is the supervisor?", "Где мастер?", "Nəzarətçi haradadır?"},

        {"Be careful.", "Будь осторожен.", "Ehtiyatlı ol."},
        {"Do not touch the machine.", "Не трогай станок.", "Dəzgaha toxunma."},
        {"Do not remove the guard.", "Не снимай защиту.", "Qoruyucunu çıxarma."},
        {"Keep the workplace clean.", "Держи рабочее место чистым.", "İş yerini təmiz saxla."},
        {"Keep the tools organized.", "Держи инструменты в порядке.", "Alətləri qaydasında saxla."},
        {"Wear your safety glasses.", "Носи защитные очки.", "Qoruyucu eynək tax."},
        {"Wear your safety shoes.", "Носи защитную обувь.", "Qoruyucu ayaqqabı geyin."},
        {"Use hearing protection.", "Используй защиту слуха.", "Qulaq qoruyucusundan istifadə et."},
        {"Follow the safety rules.", "Соблюдай правила безопасности.", "Təhlükəsizlik qaydalarına əməl et."},
        {"Report the accident.", "Сообщи о несчастном случае.", "Qəza barədə məlumat ver."},

        {"Press the alarm button.", "Нажми кнопку тревоги.", "Həyəcan düyməsinə bas."},
        {"Go to the exit.", "Иди к выходу.", "Çıxışa get."},
        {"Use the emergency exit.", "Используй аварийный выход.", "Təcili çıxışdan istifadə et."},
        {"Start the evacuation.", "Начни эвакуацию.", "Təxliyəyə başla."},
        {"Do not run.", "Не беги.", "Qaçma."},
        {"Stay calm.", "Сохраняй спокойствие.", "Sakit qal."},
        {"Call first aid.", "Вызови первую помощь.", "İlk yardımı çağır."},
        {"There is a fire.", "Есть пожар.", "Yanğın var."},
        {"Use the fire extinguisher.", "Используй огнетушитель.", "Yanğınsöndürəndən istifadə et."},
        {"Move away from the fire.", "Отойди от огня.", "Yanğından uzaqlaş."},

        {"Check the production plan.", "Проверь план производства.", "İstehsal planını yoxla."},
        {"The production is on time.", "Производство идёт по плану.", "İstehsal plana uyğun gedir."},
        {"We need more material.", "Нам нужно больше материала.", "Bizə daha çox material lazımdır."},
        {"We need another tool.", "Нам нужен другой инструмент.", "Bizə başqa alət lazımdır."},
        {"The machine is too slow.", "Станок работает слишком медленно.", "Dəzgah çox yavaş işləyir."},
        {"The machine is too fast.", "Станок работает слишком быстро.", "Dəzgah çox sürətli işləyir."},
        {"Reduce the speed.", "Уменьши скорость.", "Sürəti azalt."},
        {"Increase the speed.", "Увеличь скорость.", "Sürəti artır."},
        {"Reduce the pressure.", "Уменьши давление.", "Təzyiqi azalt."},
        {"Increase the pressure.", "Увеличь давление.", "Təzyiqi artır."},

        {"The process is stable.", "Процесс стабильный.", "Proses sabitdir."},
        {"The process has changed.", "Процесс изменился.", "Proses dəyişib."},
        {"Check the process control.", "Проверь контроль процесса.", "Proses nəzarətini yoxla."},
        {"Perform a quality check.", "Проведи проверку качества.", "Keyfiyyət yoxlaması apar."},
        {"Perform the final inspection.", "Проведи финальную проверку.", "Son yoxlamanı apar."},
        {"The part is approved.", "Деталь одобрена.", "Detal təsdiqlənib."},
        {"The part is rejected.", "Деталь забракована.", "Detal rədd edilib."},
        {"Separate the defective parts.", "Отдели дефектные детали.", "Qüsurlu detalları ayır."},
        {"Do the work again.", "Переделай работу.", "İşi yenidən gör."},
        {"Reduce waste.", "Уменьши отходы.", "Tullantıları azalt."},

        {"Check the scrap.", "Проверь брак.", "Zay məhsulu yoxla."},
        {"Improve productivity.", "Повышай производительность.", "Məhsuldarlığı artır."},
        {"Improve efficiency.", "Повышай эффективность.", "Səmərəliliyi artır."},
        {"The work is complete.", "Работа выполнена.", "İş tamamlanıb."},
        {"Everything is ready.", "Всё готово.", "Hər şey hazırdır."},
        {"The machine is safe.", "Станок безопасен.", "Dəzgah təhlükəsizdir."},
        {"The machine is not safe.", "Станок небезопасен.", "Dəzgah təhlükəsiz deyil."},
        {"Do not start the machine.", "Не запускай станок.", "Dəzgahı işə salma."},
        {"Wait for the technician.", "Подожди техника.", "Texniki gözlə."},
        {"Wait for the supervisor.", "Подожди мастера.", "Nəzarətçini gözlə."}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        language = getIntent().getStringExtra("LANGUAGE");
        if (language == null) language = "RU";

        prefs = getSharedPreferences(
                "WORKER_PRO_LESSON_PROGRESS",
                Context.MODE_PRIVATE
        );

        loadProgress();
        buildScreen();

        tts = new TextToSpeech(this, status -> {
            if (status == TextToSpeech.SUCCESS) {
                tts.setLanguage(Locale.US);
            }
        });
    }

    private void buildScreen() {

        ScrollView scrollView = new ScrollView(this);

        container = new LinearLayout(this);
        container.setOrientation(LinearLayout.VERTICAL);
        container.setPadding(24, 24, 24, 40);

        scrollView.addView(container);
        setContentView(scrollView);

        int day = getDay();

        TextView title = new TextView(this);
        title.setText("📚 " + getTitle());
        title.setTextSize(27);
        title.setTypeface(null, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 10, 0, 20);
        container.addView(title);

        TextView dayText = new TextView(this);
        dayText.setText(getDayText(day));
        dayText.setTextSize(20);
        dayText.setTypeface(null, Typeface.BOLD);
        dayText.setGravity(Gravity.CENTER);
        container.addView(dayText);

        TextView streakText = new TextView(this);
        streakText.setText(
                "🔥 " + getStreakText() +
                ": " + streak +
                "   🏆 " + bestStreak
        );
        streakText.setTextSize(17);
        streakText.setGravity(Gravity.CENTER);
        streakText.setPadding(0, 12, 0, 12);
        container.addView(streakText);

        TextView progressText = new TextView(this);
        progressText.setText(
                "⭐ " + learnedToday + " / 5"
        );
        progressText.setTextSize(19);
        progressText.setTypeface(null, Typeface.BOLD);
        progressText.setGravity(Gravity.CENTER);
        container.addView(progressText);

        int startWord = (day * 5) % phrases.length;

        for (int i = 0; i < 5; i++) {

            int index = (startWord + i) % phrases.length;

            addPhrase(
                    index,
                    i + 1,
                    progressText
            );
        }

        TextView footer = new TextView(this);
        footer.setText("\nF.S");
        footer.setTextSize(15);
        footer.setGravity(Gravity.CENTER);
        footer.setTextColor(Color.GRAY);
        container.addView(footer);
    }

    private void addPhrase(
            int index,
            int number,
            TextView progressText
    ) {

        LinearLayout box = new LinearLayout(this);
        box.setOrientation(LinearLayout.VERTICAL);
        box.setPadding(20, 18, 20, 18);

        TextView numberText = new TextView(this);
        numberText.setText("💬 " + number);
        numberText.setTextSize(16);
        numberText.setTypeface(null, Typeface.BOLD);

        TextView english = new TextView(this);
        english.setText("🇬🇧 " + phrases[index][0]);
        english.setTextSize(21);
        english.setTypeface(null, Typeface.BOLD);
        english.setPadding(0, 10, 0, 8);

        TextView russian = new TextView(this);
        russian.setText("🇷🇺 " + phrases[index][1]);
        russian.setTextSize(17);
        russian.setPadding(0, 4, 0, 4);

        TextView azeri = new TextView(this);
        azeri.setText("🇦🇿 " + phrases[index][2]);
        azeri.setTextSize(17);
        azeri.setPadding(0, 4, 0, 12);

        Button speakButton = new Button(this);
        speakButton.setText("🔊 " + getSpeakText());

        speakButton.setOnClickListener(v ->
                speak(phrases[index][0])
        );

        Button learnedButton = new Button(this);
        learnedButton.setText("⭐ " + getLearnText());

        String key = "phrase_" + index + "_day_" + getDay();

        if (prefs.getBoolean(key, false)) {
            learnedButton.setEnabled(false);
            learnedButton.setText("✅ " + getLearnedText());
        }

        learnedButton.setOnClickListener(v -> {

            if (!prefs.getBoolean(key, false)) {

                prefs.edit()
                        .putBoolean(key, true)
                        .apply();

                learnedToday++;

                learnedWords++;

                progressText.setText(
                        "⭐ " + learnedToday + " / 5"
                );

                learnedButton.setEnabled(false);
                learnedButton.setText(
                        "✅ " + getLearnedText()
                );

                if (learnedToday >= 5) {
                    completeToday();
                }
            }
        });

        box.addView(numberText);
        box.addView(english);
        box.addView(russian);
        box.addView(azeri);
        box.addView(speakButton);
        box.addView(learnedButton);

        container.addView(box);

        View line = new View(this);
        line.setBackgroundColor(Color.LTGRAY);

        LinearLayout.LayoutParams lineParams =
                new LinearLayout.LayoutParams(
                        -1,
                        2
                );

        lineParams.setMargins(0, 18, 0, 18);

        container.addView(line, lineParams);
    }

    private void speak(String text) {

        if (tts != null) {
            tts.speak(
                    text,
                    TextToSpeech.QUEUE_FLUSH,
                    null,
                    "worker_phrase"
            );
        }
    }

    private int getDay() {

        Calendar calendar = Calendar.getInstance();

        int dayOfYear =
                calendar.get(Calendar.DAY_OF_YEAR);

        return dayOfYear % 40;
    }

    private void loadProgress() {

        int savedDay =
                prefs.getInt("LAST_DAY", -1);

        int today = getDay();

        if (savedDay == today) {

            learnedToday =
                    prefs.getInt("LEARNED_TODAY", 0);

        } else {

            learnedToday = 0;
        }

        streak =
                prefs.getInt("STREAK", 0);

        bestStreak =
                prefs.getInt("BEST_STREAK", 0);

        learnedWords =
                prefs.getInt("LEARNED_WORDS", 0);
    }

    private void completeToday() {

        int savedDay =
                prefs.getInt("LAST_DAY", -1);

        int today = getDay();

        if (savedDay != today) {

            streak++;

            if (streak > bestStreak) {
                bestStreak = streak;
            }

            prefs.edit()
                    .putInt("LAST_DAY", today)
                    .putInt("STREAK", streak)
                    .putInt("BEST_STREAK", bestStreak)
                    .putInt("LEARNED_WORDS", learnedWords)
                    .putInt("LEARNED_TODAY", learnedToday)
                    .apply();

            Toast.makeText(
                    this,
                    "🎉 " + getCompleteText(),
                    Toast.LENGTH_LONG
            ).show();

        } else {

            prefs.edit()
                    .putInt("LEARNED_WORDS", learnedWords)
                    .putInt("LEARNED_TODAY", learnedToday)
                    .apply();
        }
    }

    private String getTitle() {

        switch (language) {

            case "AZ":
                return "Günün dərsi";

            case "EN":
                return "Lesson of the Day";

            case "TR":
                return "Günün dersi";

            case "DE":
                return "Lektion des Tages";

            default:
                return "Урок дня";
        }
    }

    private String getDayText(int day) {

        switch (language) {

            case "AZ":
                return "Gün " + (day + 1);

            case "EN":
                return "Day " + (day + 1);

            case "TR":
                return "Gün " + (day + 1);

            case "DE":
                return "Tag " + (day + 1);

            default:
                return "День " + (day + 1);
        }
    }

    private String getStreakText() {

        switch (language) {

            case "AZ":
                return "Ardıcıl günlər";

            case "EN":
                return "Streak";

            case "TR":
                return "Ardıcıl günlər";

            case "DE":
                return "Serie";

            default:
                return "Серия дней";
        }
    }

    private String getSpeakText() {

        switch (language) {

            case "AZ":
                return "Dinlə";

            case "EN":
                return "Listen";

            case "TR":
                return "Dinle";

            case "DE":
                return "Anhören";

            default:
                return "Слушать";
        }
    }

    private String getLearnText() {

        switch (language) {

            case "AZ":
                return "Öyrəndim";

            case "EN":
                return "I learned it";

            case "TR":
                return "Öğrendim";

            case "DE":
                return "Gelernt";

            default:
                return "Я выучил";
        }
    }

    private String getLearnedText() {

        switch (language) {

            case "AZ":
                return "Öyrənildi";

            case "EN":
                return "Learned";

            case "TR":
                return "Öyrənildi";

            case "DE":
                return "Gelernt";

            default:
                return "Выучено";
        }
    }

    private String getCompleteText() {

        switch (language) {

            case "AZ":
                return "Bugünkü dərs tamamlandı!";

            case "EN":
                return "Today's lesson is complete!";

            case "TR":
                return "Bugünkü ders tamamlandı!";

            case "DE":
                return "Die heutige Lektion ist abgeschlossen!";

            default:
                return "Урок на сегодня завершён!";
        }
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