package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Locale;

public class LessonOfDayActivity extends Activity {

    private TextToSpeech tts;

    private final String[][] lessons = {

            {"Safety", "Безопасность", "Təhlükəsizlik",
                    "Safety first.", "Безопасность прежде всего.", "Təhlükəsizlik hər şeydən əvvəl."},

            {"Machine", "Станок", "Dəzgah",
                    "The machine is running.", "Станок работает.", "Dəzgah işləyir."},

            {"Worker", "Рабочий", "İşçi",
                    "I am a worker.", "Я рабочий.", "Mən işçiyəm."},

            {"Task", "Задание", "Tapşırıq",
                    "What is my task today?", "Какое у меня сегодня задание?", "Bu gün mənim tapşırığım nədir?"},

            {"Tool", "Инструмент", "Alət",
                    "Check the tool.", "Проверь инструмент.", "Aləti yoxla."},

            {"Quality", "Качество", "Keyfiyyət",
                    "Check the quality.", "Проверь качество.", "Keyfiyyəti yoxla."},

            {"Defect", "Дефект", "Qüsur",
                    "I found a defect.", "Я нашёл дефект.", "Qüsur tapdım."},

            {"CNC", "Станок с ЧПУ", "CNC dəzgahı",
                    "Check the CNC program.", "Проверь программу CNC.", "CNC proqramını yoxla."},

            {"Stamping", "Штамповка", "Ştamplama",
                    "The stamping machine is ready.", "Штамповочная машина готова.", "Ştamplama maşını hazırdır."},

            {"Gloves", "Перчатки", "Əlcəklər",
                    "Wear your gloves.", "Надень перчатки.", "Əlcəklərini tax."},

            {"Helmet", "Каска", "Dəbilqə",
                    "Wear your helmet.", "Надень каску.", "Dəbilqəni tax."},

            {"Emergency", "Авария", "Fövqəladə vəziyyət",
                    "Emergency!", "Авария!", "Fövqəladə vəziyyət!"},

            {"Fire extinguisher", "Огнетушитель", "Yanğınsöndürən",
                    "Use the fire extinguisher.", "Используй огнетушитель.", "Yanğınsöndürəndən istifadə et."},

            {"Welding", "Сварка", "Qaynaq",
                    "The welding machine is ready.", "Сварочный аппарат готов.", "Qaynaq aparatı hazırdır."},

            {"Maintenance", "Техническое обслуживание", "Texniki xidmət",
                    "The machine needs maintenance.", "Станку нужно обслуживание.", "Dəzgaha texniki xidmət lazımdır."},

            {"Repair", "Ремонт", "Təmir",
                    "The machine needs repair.", "Станку нужен ремонт.", "Dəzgaha təmir lazımdır."},

            {"Sensor", "Датчик", "Sensor",
                    "Check the sensor.", "Проверь датчик.", "Sensoru yoxla."},

            {"Measurement", "Измерение", "Ölçmə",
                    "The measurement is correct.", "Измерение правильное.", "Ölçmə düzgündür."},

            {"Tolerance", "Допуск", "Tolerans",
                    "Check the tolerance.", "Проверь допуск.", "Toleransı yoxla."},

            {"Stop", "Остановить", "Dayandırmaq",
                    "Stop the machine.", "Останови станок.", "Dəzgahı dayandır."}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String language = getIntent().getStringExtra("LANGUAGE");

        if (language == null) {
            language = "RU";
        }

        final String currentLanguage = language;

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(30, 30, 30, 30);
        root.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("📚 " + getTitleText(currentLanguage));
        title.setTextSize(28);
        title.setTextColor(Color.rgb(0, 120, 60));
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 10, 0, 25);

        root.addView(title);

        int day = java.util.Calendar.getInstance()
                .get(java.util.Calendar.DAY_OF_YEAR);

        int index = day % lessons.length;

        String[] lesson = lessons[index];

        TextView dayText = new TextView(this);
        dayText.setText(
                currentLanguage.equals("AZ")
                        ? "Günün dərsi"
                        : currentLanguage.equals("EN")
                        ? "Lesson of the Day"
                        : "Урок дня"
        );
        dayText.setTextSize(20);
        dayText.setGravity(Gravity.CENTER);
        dayText.setTextColor(Color.DKGRAY);
        dayText.setPadding(0, 10, 0, 20);

        root.addView(dayText);

        TextView word = new TextView(this);
        word.setText("🇬🇧 " + lesson[0]);
        word.setTextSize(30);
        word.setGravity(Gravity.CENTER);
        word.setTextColor(Color.BLACK);
        word.setPadding(10, 20, 10, 20);

        root.addView(word);

        TextView translation = new TextView(this);

        String translationText;

        if (currentLanguage.equals("AZ")) {
            translationText = "🇦🇿 " + lesson[2];
        } else if (currentLanguage.equals("EN")) {
            translationText = "🇷🇺 " + lesson[1] +
                    "\n🇦🇿 " + lesson[2];
        } else {
            translationText = "🇷🇺 " + lesson[1] +
                    "\n🇦🇿 " + lesson[2];
        }

        translation.setText(translationText);
        translation.setTextSize(22);
        translation.setGravity(Gravity.CENTER);
        translation.setTextColor(Color.DKGRAY);
        translation.setPadding(10, 10, 10, 25);

        root.addView(translation);

        TextView phraseTitle = new TextView(this);
        phraseTitle.setText(
                currentLanguage.equals("AZ")
                        ? "Cümlə:"
                        : currentLanguage.equals("EN")
                        ? "Phrase:"
                        : "Фраза:"
        );
        phraseTitle.setTextSize(19);
        phraseTitle.setTextColor(Color.rgb(0, 120, 60));
        phraseTitle.setGravity(Gravity.CENTER);

        root.addView(phraseTitle);

        TextView phrase = new TextView(this);
        phrase.setText(
                "🇬🇧 " + lesson[3] +
                "\n\n🇷🇺 " + lesson[4] +
                "\n\n🇦🇿 " + lesson[5]
        );
        phrase.setTextSize(19);
        phrase.setGravity(Gravity.CENTER);
        phrase.setTextColor(Color.BLACK);
        phrase.setPadding(10, 15, 10, 20);

        root.addView(phrase);

        Button speak = new Button(this);
        speak.setText("🔊 " +
                (currentLanguage.equals("AZ")
                        ? "Dinlə"
                        : currentLanguage.equals("EN")
                        ? "Listen"
                        : "Послушать"));

        root.addView(speak);

        speak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tts != null) {
                    tts.setLanguage(Locale.US);
                    tts.speak(
                            lesson[3],
                            TextToSpeech.QUEUE_FLUSH,
                            null,
                            "lesson"
                    );
                }
            }
        });

        TextView footer = new TextView(this);
        footer.setText("\nF.S");
        footer.setTextSize(14);
        footer.setGravity(Gravity.CENTER);
        footer.setTextColor(Color.GRAY);

        root.addView(
                footer,
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                )
        );

        setContentView(root);

        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    tts.setLanguage(Locale.US);
                }
            }
        });
    }

    private String getTitleText(String language) {

        if (language.equals("AZ")) {
            return "Günün dərsi";
        }

        if (language.equals("EN")) {
            return "Lesson of the Day";
        }

        return "Урок дня";
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