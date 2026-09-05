package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ProgressActivity extends Activity {

    private String language = "RU";

    private TextView title;
    private TextView learnedText;
    private TextView streakText;
    private TextView bestStreakText;
    private TextView completedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        language = getIntent().getStringExtra("LANGUAGE");
        if (language == null) {
            language = "RU";
        }

        createScreen();
        loadProgress();
    }

    private void createScreen() {

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(30, 35, 30, 25);
        root.setBackgroundColor(Color.WHITE);

        title = new TextView(this);
        title.setText(getTitleText());
        title.setTextSize(28);
        title.setTypeface(null, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 0, 0, 30);

        root.addView(title);

        TextView info = new TextView(this);
        info.setText(getInfoText());
        info.setTextSize(17);
        info.setGravity(Gravity.CENTER);
        info.setPadding(0, 0, 0, 25);

        root.addView(info);

        learnedText = createProgressItem("");
        streakText = createProgressItem("");
        bestStreakText = createProgressItem("");
        completedText = createProgressItem("");

        root.addView(learnedText);
        root.addView(streakText);
        root.addView(bestStreakText);
        root.addView(completedText);

        TextView backButton = new TextView(this);
        backButton.setText(getBackText());
        backButton.setTextSize(18);
        backButton.setTypeface(null, Typeface.BOLD);
        backButton.setGravity(Gravity.CENTER);
        backButton.setPadding(20, 25, 20, 25);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        root.addView(backButton);

        TextView footer = new TextView(this);
        footer.setText("F.S");
        footer.setTextSize(14);
        footer.setGravity(Gravity.CENTER);
        footer.setPadding(0, 20, 0, 0);

        root.addView(footer);

        setContentView(root);
    }

    private TextView createProgressItem(String text) {

        TextView item = new TextView(this);
        item.setText(text);
        item.setTextSize(20);
        item.setTypeface(null, Typeface.BOLD);
        item.setGravity(Gravity.CENTER);
        item.setPadding(20, 25, 20, 25);

        return item;
    }

    private void loadProgress() {

        android.content.SharedPreferences prefs =
                getSharedPreferences(
                        "WORKER_PRO_LESSON_PROGRESS",
                        MODE_PRIVATE
                );

        int learnedToday = prefs.getInt("learnedToday", 0);
        int streak = prefs.getInt("streak", 0);
        int bestStreak = prefs.getInt("bestStreak", 0);
        int completedLessons = prefs.getInt("completedLessons", 0);

        learnedText.setText(
                "📚 " + getLearnedText() + ": " + learnedToday + " / 5"
        );

        streakText.setText(
                "🔥 " + getStreakText() + ": " + streak
        );

        bestStreakText.setText(
                "🏆 " + getBestStreakText() + ": " + bestStreak
        );

        completedText.setText(
                "✅ " + getCompletedText() + ": " + completedLessons
        );
    }

    private String getTitleText() {

        if (language.equals("AZ")) {
            return "🏆 Mənim irəliləyişim";
        }

        if (language.equals("EN")) {
            return "🏆 My Progress";
        }

        return "🏆 Мой прогресс";
    }

    private String getInfoText() {

        if (language.equals("AZ")) {
            return "Öyrəndiyiniz sözləri və dərsləri izləyin";
        }

        if (language.equals("EN")) {
            return "Track your words and daily lessons";
        }

        return "Следи за своими словами и уроками";
    }

    private String getLearnedText() {

        if (language.equals("AZ")) {
            return "Bu gün öyrənildi";
        }

        if (language.equals("EN")) {
            return "Learned today";
        }

        return "Выучено сегодня";
    }

    private String getStreakText() {

        if (language.equals("AZ")) {
            return "Cari seriya";
        }

        if (language.equals("EN")) {
            return "Current streak";
        }

        return "Текущая серия";
    }

    private String getBestStreakText() {

        if (language.equals("AZ")) {
            return "Ən yaxşı seriya";
        }

        if (language.equals("EN")) {
            return "Best streak";
        }

        return "Лучшая серия";
    }

    private String getCompletedText() {

        if (language.equals("AZ")) {
            return "Tamamlanan dərslər";
        }

        if (language.equals("EN")) {
            return "Completed lessons";
        }

        return "Завершено уроков";
    }

    private String getBackText() {

        if (language.equals("AZ")) {
            return "← Geri";
        }

        if (language.equals("EN")) {
            return "← Back";
        }

        return "← Назад";
    }
}