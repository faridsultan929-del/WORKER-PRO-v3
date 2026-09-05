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

    private TextView progressText;

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
            {"Maintenance", "Обслуживание", "Texniki xidmət"},
            {"Repair", "Ремонт", "Təmir"},
            {"Measurement", "Измерение", "Ölçmə"},
            {"Tolerance", "Допуск", "Tolerans"},
            {"Emergency", "Авария", "Fövqəladə vəziyyət"},
            {"Helmet", "Каска", "Dəbilqə"},
            {"Gloves", "Перчатки", "Əlcəklər"},
            {"Fire", "Пожар", "Yanğın"},
            {"Sensor", "Датчик", "Sensor"},
            {"Operator", "Оператор", "Operator"},
            {"Production", "Производство", "İstehsalat"},
            {"Factory", "Завод", "Zavod"},
            {"Process", "Процесс", "Proses"},
            {"Material", "Материал", "Material"}
    };

    private final String[][] phrases = {

            {
                    "Safety first.",
                    "Безопасность прежде всего.",
                    "Təhlükəsizlik hər şeydən əvvəl."
            },

            {
                    "Check the machine.",
                    "Проверь станок.",
                    "Dəzgahı yoxla."
            },

            {
                    "I found a defect.",
                    "Я нашёл дефект.",
                    "Qüsur tapdım."
            },

            {
                    "Please check my work.",
                    "Пожалуйста, проверьте мою работу.",
                    "Zəhmət olmasa işimi yoxlayın."
            },

            {
                    "The machine stopped.",
                    "Станок остановился.",
                    "Dəzgah dayandı."
            },

            {
                    "I need help.",
                    "Мне нужна помощь.",
                    "Mənə kömək lazımdır."
            },

            {
                    "Wear your gloves.",
                    "Надень перчатки.",
                    "Əlcəklərini tax."
            },

            {
                    "Check the CNC program.",
                    "Проверь программу CNC.",
                    "CNC proqramını yoxla."
            },

            {
                    "Stop the machine.",
                    "Останови станок.",
                    "Dəzgahı dayandır."
            },

            {
                    "The quality is good.",
                    "Качество хорошее.",
                    "Keyfiyyət yaxşıdır."
            },

            {
                    "The tool is worn.",
                    "Инструмент изношен.",
                    "Alət aşınıb."
            },

            {
                    "The machine needs maintenance.",
                    "Станку нужно обслуживание.",
                    "Dəzgaha texniki xidmət lazımdır."
            }
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

        ScrollView scrollView = new ScrollView(this);

        LinearLayout root = new LinearLayout(this);

        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(20, 20, 20, 20);
        root.setBackgroundColor(Color.WHITE);

        // TITLE

        TextView title = new TextView(this);

        title.setText("📚 " + getTitleText());
        title.setTextSize(28);
        title.setTypeface(null, Typeface.BOLD);
        title.setTextColor(Color.rgb(0, 130, 70));
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 10, 0, 20);

        root.addView(title);

        // DAY

        Calendar calendar = Calendar.getInstance();

        int day = calendar.get(Calendar.DAY_OF_YEAR);

        TextView dayText = new TextView(this);

        dayText.setText(
                getDayText() + " #" + day
        );

        dayText.setTextSize(18);
        dayText.setGravity(Gravity.CENTER);
        dayText.setTextColor(Color.DKGRAY);
        dayText.setPadding(0, 0, 0, 15);

        root.addView(dayText);

        // PROGRESS

        progressText = new TextView(this);

        progressText.setTextSize(20);
        progressText.setTypeface(null, Typeface.BOLD);
        progressText.setGravity(Gravity.CENTER);
        progressText.setTextColor(Color.rgb(0, 120, 60));
        progressText.setPadding(0, 10, 0, 20);

        root.addView(progressText);

        updateProgress();

        // WORDS TITLE

        TextView wordsTitle = new TextView(this);

        wordsTitle.setText(
                "📖 " + getWordsTitle()
        );

        wordsTitle.setTextSize(23);
        wordsTitle.setTypeface(null, Typeface.BOLD);
        wordsTitle.setTextColor(Color.rgb(0, 120, 60));
        wordsTitle.setPadding(0, 10, 0, 15);

        root.addView(wordsTitle);

        // FIVE WORDS

        int startWord = day % words.length;

        for (int i = 0; i < 5; i++) {

            int index =
                    (startWord + i) % words.length;

            addWordCard(
                    root,
                    words[index],
                    index
            );
        }

        // PHRASES TITLE

        TextView phrasesTitle = new TextView(this);

        phrasesTitle.setText(
                "💬 " + getPhrasesTitle()
        );

        phrasesTitle.setTextSize(23);
        phrasesTitle.setTypeface(null, Typeface.BOLD);
        phrasesTitle.setTextColor(Color.rgb(0, 120, 60));
        phrasesTitle.setPadding(0, 25, 0, 15);

        root.addView(phrasesTitle);

        // THREE PHRASES

        int startPhrase =
                day % phrases.length;

        for (int i = 0; i < 3; i++) {

            int index =
                    (startPhrase + i) % phrases.length;

            addPhraseCard(
                    root,
                    phrases[index]
            );
        }

        // FOOTER

        TextView footer = new TextView(this);

        footer.setText("\nF.S");
        footer.setTextSize(15);
        footer.setGravity(Gravity.CENTER);
        footer.setTextColor(Color.GRAY);
        footer.setPadding(0, 20, 0, 10);

        root.addView(footer);

        scrollView.addView(root);

        setContentView(scrollView);
    }

    private void addWordCard(
            LinearLayout root,
            String[] word,
            int wordIndex) {

        LinearLayout card =
                new LinearLayout(this);

        card.setOrientation(
                LinearLayout.VERTICAL
        );

        card.setPadding(
                20,
                15,
                20,
                15
        );

        GradientDrawable background =
                new GradientDrawable();

        background.setColor(
                Color.rgb(242, 248, 244)
        );

        background.setCornerRadius(18);

        background.setStroke(
                2,
                Color.rgb(0, 130, 70)
        );

        card.setBackground(background);

        TextView english =
                new TextView(this);

        english.setText(
                "🇬🇧 " + word[0]
        );

        english.setTextSize(22);
        english.setTypeface(
                null,
                Typeface.BOLD
        );

        english.setTextColor(Color.BLACK);

        card.addView(english);

        TextView translation =
                new TextView(this);

        if (language.equals("AZ")) {

            translation.setText(
                    "🇦🇿 " + word[2]
            );

        } else {

            translation.setText(
                    "🇷🇺 " + word[1] +
                    "\n🇦🇿 " + word[2]
            );
        }

        translation.setTextSize(18);
        translation.setTextColor(Color.DKGRAY);
        translation.setPadding(0, 8, 0, 8);

        card.addView(translation);

        Button listen =
                new Button(this);

        listen.setText(
                "🔊 " + getListenText()
        );

        listen.setOnClickListener(
                v -> speak(word[0])
        );

        card.addView(listen);

        Button learned =
                new Button(this);

        boolean isLearned =
                learnedWords.contains(
                        wordKey(word)
                );

        if (isLearned) {

            learned.setText(
                    "✅ " + getLearnedText()
            );

        } else {

            learned.setText(
                    "⭐ " + getLearnText()
            );
        }

        learned.setOnClickListener(
                v -> {

                    String key =
                            wordKey(word);

                    if (!learnedWords.contains(key)) {

                        learnedWords.add(key);

                        learnedToday++;

                        saveProgress();

                        learned.setText(
                                "✅ " +
                                getLearnedText()
                        );

                        updateProgress();
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
                0,
                0,
                0,
                12
        );

        root.addView(card, params);
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
                20,
                15,
                20,
                15
        );

        GradientDrawable background =
                new GradientDrawable();

        background.setColor(
                Color.rgb(248, 250, 248)
        );

        background.setCornerRadius(18);

        background.setStroke(
                2,
                Color.rgb(0, 130, 70)
        );

        card.setBackground(background);

        TextView text =
                new TextView(this);

        text.setText(
                "🇬🇧 " + phrase[0] +
                "\n\n🇷🇺 " + phrase[1] +
                "\n🇦🇿 " + phrase[2]
        );

        text.setTextSize(18);
        text.setTextColor(Color.BLACK);

        card.addView(text);

        Button listen =
                new Button(this);

        listen.setText(
                "🔊 " + getListenText()
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
                0,
                0,
                0,
                12
        );

        root.addView(card, params);
    }

    private void updateProgress() {

        if (progressText == null) {
            return;
        }

        progressText.setText(
                "📊 " +
                getProgressText() +
                ": " +
                learnedToday +
                " / 5"
        );
    }

    private String wordKey(String[] word) {

        return word[0];
    }

    private void loadProgress() {

        android.content.SharedPreferences prefs =
                getSharedPreferences(
                        "WORKER_PRO_LESSON_PROGRESS",
                        MODE_PRIVATE
                );

        int savedDay =
                prefs.getInt(
                        "day",
                        -1
                );

        Calendar calendar =
                Calendar.getInstance();

        int today =
                calendar.get(Calendar.DAY_OF_YEAR);

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
                    .putInt("day", today)
                    .putInt("learnedToday", 0)
                    .putString("learnedWords", "")
                    .apply();
        }
    }

    private void saveProgress() {

        StringBuilder builder =
                new StringBuilder();

        for (String word : learnedWords) {

            builder.append(word)
                    .append("|");
        }

        Calendar calendar =
                Calendar.getInstance();

        int today =
                calendar.get(Calendar.DAY_OF_YEAR);

        getSharedPreferences(
                "WORKER_PRO_LESSON_PROGRESS",
                MODE_PRIVATE
        )
                .edit()
                .putInt("day", today)
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

    private void speak(String text) {

        if (tts != null) {

            tts.setLanguage(Locale.US);

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

        return "Урок дня";
    }

    private String getDayText() {

        if (language.equals("AZ")) {
            return "Gündəlik dərs";
        }

        if (language.equals("EN")) {
            return "Daily lesson";
        }

        return "Ежедневный урок";
    }

    private String getWordsTitle() {

        if (language.equals("AZ")) {
            return "5 yeni söz";
        }

        if (language.equals("EN")) {
            return "5 New Words";
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

        return "3 рабочие фразы";
    }

    private String getListenText() {

        if (language.equals("AZ")) {
            return "Dinlə";
        }

        if (language.equals("EN")) {
            return "Listen";
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

        return "Я выучил";
    }

    private String getLearnedText() {

        if (language.equals("AZ")) {
            return "Öyrənildi";
        }

        if (language.equals("EN")) {
            return "Learned";
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

        return "Прогресс сегодня";
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