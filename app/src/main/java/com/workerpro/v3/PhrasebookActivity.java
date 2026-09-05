package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.speech.tts.TextToSpeech;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Locale;

public class PhrasebookActivity extends Activity {

    private String language = "RU";
    private TextToSpeech textToSpeech;

    private LinearLayout phraseContainer;
    private List<WorkerPhrasebook.Phrase> allPhrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        language = getIntent().getStringExtra("LANGUAGE");

        if (language == null) {
            language = "RU";
        }

        initTextToSpeech();
        createScreen();
    }

    private void initTextToSpeech() {

        textToSpeech = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

                if (status == TextToSpeech.SUCCESS) {
                    textToSpeech.setLanguage(Locale.ENGLISH);
                }
            }
        });
    }

    private void createScreen() {

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(Color.WHITE);

        // Заголовок
        TextView title = new TextView(this);
        title.setText(getPhrasebookTitle());
        title.setTextSize(24);
        title.setTypeface(null, Typeface.BOLD);
        title.setTextColor(Color.rgb(0, 120, 70));
        title.setGravity(Gravity.CENTER);
        title.setPadding(10, 25, 10, 20);

        root.addView(title);

        // Поле поиска
        EditText search = new EditText(this);

        if (language.equals("AZ")) {
            search.setHint("🔎 Frazanı axtar");
        } else if (language.equals("EN")) {
            search.setHint("🔎 Search phrase");
        } else {
            search.setHint("🔎 Поиск фразы");
        }

        search.setTextSize(17);
        search.setSingleLine(true);
        search.setPadding(20, 10, 20, 10);

        root.addView(search);

        // ScrollView
        ScrollView scrollView = new ScrollView(this);

        phraseContainer = new LinearLayout(this);
        phraseContainer.setOrientation(LinearLayout.VERTICAL);
        phraseContainer.setPadding(15, 15, 15, 20);

        scrollView.addView(phraseContainer);

        root.addView(
                scrollView,
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        0,
                        1
                )
        );

        // Футер
        TextView footer = new TextView(this);
        footer.setText("F.S");
        footer.setTextSize(14);
        footer.setTextColor(Color.GRAY);
        footer.setGravity(Gravity.CENTER);
        footer.setPadding(10, 8, 10, 15);

        root.addView(footer);

        setContentView(root);

        allPhrases = WorkerPhrasebook.getPhrases();

        showPhrases(allPhrases);

        // Поиск
        search.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(
                    CharSequence s,
                    int start,
                    int count,
                    int after) {
            }

            @Override
            public void onTextChanged(
                    CharSequence s,
                    int start,
                    int before,
                    int count) {

                filterPhrases(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    private void filterPhrases(String query) {

        query = query.toLowerCase(Locale.getDefault()).trim();

        if (query.isEmpty()) {
            showPhrases(allPhrases);
            return;
        }

        java.util.ArrayList<WorkerPhrasebook.Phrase> result =
                new java.util.ArrayList<>();

        for (WorkerPhrasebook.Phrase phrase : allPhrases) {

            String english = phrase.english.toLowerCase(Locale.getDefault());
            String russian = phrase.russian.toLowerCase(Locale.getDefault());
            String azerbaijani = phrase.azerbaijani.toLowerCase(Locale.getDefault());

            if (english.contains(query)
                    || russian.contains(query)
                    || azerbaijani.contains(query)) {

                result.add(phrase);
            }
        }

        showPhrases(result);
    }

    private void showPhrases(List<WorkerPhrasebook.Phrase> phrases) {

        phraseContainer.removeAllViews();

        if (phrases.isEmpty()) {

            TextView empty = new TextView(this);

            if (language.equals("AZ")) {
                empty.setText("Heç nə tapılmadı.");
            } else if (language.equals("EN")) {
                empty.setText("Nothing found.");
            } else {
                empty.setText("Ничего не найдено.");
            }

            empty.setTextSize(18);
            empty.setGravity(Gravity.CENTER);
            empty.setPadding(20, 40, 20, 40);

            phraseContainer.addView(empty);
            return;
        }

        for (final WorkerPhrasebook.Phrase phrase : phrases) {

            LinearLayout card = new LinearLayout(this);
            card.setOrientation(LinearLayout.VERTICAL);
            card.setPadding(15, 15, 15, 15);

            // Английский
            TextView english = new TextView(this);
            english.setText("🇬🇧 " + phrase.english);
            english.setTextSize(18);
            english.setTypeface(null, Typeface.BOLD);
            english.setTextColor(Color.rgb(0, 100, 60));

            card.addView(english);

            // Русский
            TextView russian = new TextView(this);
            russian.setText("🇷🇺 " + phrase.russian);
            russian.setTextSize(16);
            russian.setPadding(0, 8, 0, 4);

            card.addView(russian);

            // Азербайджанский
            TextView azerbaijani = new TextView(this);
            azerbaijani.setText("🇦🇿 " + phrase.azerbaijani);
            azerbaijani.setTextSize(16);
            azerbaijani.setPadding(0, 4, 0, 8);

            card.addView(azerbaijani);

            // Кнопка произношения
            Button speakButton = new Button(this);
            speakButton.setText("🔊 English");

            speakButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (textToSpeech == null) {
                        return;
                    }

                    int result = textToSpeech.setLanguage(Locale.ENGLISH);

                    if (result == TextToSpeech.LANG_MISSING_DATA
                            || result == TextToSpeech.LANG_NOT_SUPPORTED) {

                        Toast.makeText(
                                PhrasebookActivity.this,
                                "English voice is not available",
                                Toast.LENGTH_SHORT
                        ).show();

                        return;
                    }

                    textToSpeech.speak(
                            phrase.english,
                            TextToSpeech.QUEUE_FLUSH,
                            null,
                            "WORKER_PRO_PHRASE"
                    );
                }
            });

            card.addView(speakButton);

            // Разделитель
            View divider = new View(this);
            divider.setBackgroundColor(Color.LTGRAY);

            LinearLayout.LayoutParams dividerParams =
                    new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            2
                    );

            dividerParams.setMargins(0, 10, 0, 10);

            phraseContainer.addView(card);

            phraseContainer.addView(divider);
        }
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

    @Override
    protected void onDestroy() {

        if (textToSpeech != null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }

        super.onDestroy();
    }
}