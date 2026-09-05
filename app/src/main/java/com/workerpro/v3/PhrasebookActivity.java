package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.List;

public class PhrasebookActivity extends Activity {

    private String language = "RU";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        language = getIntent().getStringExtra("LANGUAGE");

        if (language == null) {
            language = "RU";
        }

        createScreen();
    }

    private void createScreen() {

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(Color.WHITE);
        root.setPadding(16, 12, 16, 12);

        // HEADER
        TextView title = new TextView(this);
        title.setText(getPhrasebookTitle());
        title.setTextSize(25);
        title.setTypeface(null, Typeface.BOLD);
        title.setTextColor(Color.rgb(0, 130, 70));
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 8, 0, 15);

        root.addView(title);

        // SCROLL
        ScrollView scrollView = new ScrollView(this);

        LinearLayout list = new LinearLayout(this);
        list.setOrientation(LinearLayout.VERTICAL);

        List<WorkerPhrasebook.Phrase> phrases =
                WorkerPhrasebook.getPhrases();

        for (WorkerPhrasebook.Phrase phrase : phrases) {

            LinearLayout card = new LinearLayout(this);
            card.setOrientation(LinearLayout.VERTICAL);
            card.setPadding(18, 14, 18, 14);

            TextView english = new TextView(this);
            english.setText("🇬🇧 " + phrase.english);
            english.setTextSize(19);
            english.setTypeface(null, Typeface.BOLD);
            english.setTextColor(Color.rgb(0, 105, 60));

            TextView russian = new TextView(this);
            russian.setText("🇷🇺 " + phrase.russian);
            russian.setTextSize(17);
            russian.setTextColor(Color.DKGRAY);
            russian.setPadding(0, 7, 0, 0);

            TextView azerbaijani = new TextView(this);
            azerbaijani.setText("🇦🇿 " + phrase.azerbaijani);
            azerbaijani.setTextSize(17);
            azerbaijani.setTextColor(Color.DKGRAY);
            azerbaijani.setPadding(0, 5, 0, 0);

            card.addView(english);
            card.addView(russian);
            card.addView(azerbaijani);

            LinearLayout.LayoutParams params =
                    new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.WRAP_CONTENT
                    );

            params.setMargins(0, 0, 0, 10);

            card.setLayoutParams(params);

            list.addView(card);
        }

        scrollView.addView(list);

        root.addView(
                scrollView,
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        0,
                        1
                )
        );

        // DEVELOPER
        TextView developer = new TextView(this);
        developer.setText("F.S");
        developer.setTextSize(15);
        developer.setTextColor(Color.GRAY);
        developer.setGravity(Gravity.CENTER);
        developer.setPadding(0, 8, 0, 5);

        root.addView(developer);

        setContentView(root);
    }

    private String getPhrasebookTitle() {

        if (language.equals("AZ")) {
            return "💬 Danışıq kitabçası";
        }

        if (language.equals("EN")) {
            return "💬 WORKER PHRASEBOOK";
        }

        return "💬 РАЗГОВОРНИК";
    }
}