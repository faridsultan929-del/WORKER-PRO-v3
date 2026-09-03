package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import java.util.Locale;

public class EnglishActivity extends Activity {

private LinearLayout listLayout;
private EditText searchBox;
private List<EnglishDictionary.Word> words;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    String language = getIntent().getStringExtra("LANGUAGE");
    if (language == null) language = "RU";

    words = EnglishDictionary.getWords();

    LinearLayout root = new LinearLayout(this);
    root.setOrientation(LinearLayout.VERTICAL);
    root.setPadding(20, 20, 20, 20);
    root.setBackgroundColor(Color.WHITE);

    TextView title = new TextView(this);
    title.setText("🇬🇧  English for Workers");
    title.setTextSize(26);
    title.setTextColor(Color.rgb(0, 130, 70));
    title.setGravity(Gravity.CENTER);
    title.setPadding(0, 10, 0, 20);

    root.addView(title);

    searchBox = new EditText(this);
    searchBox.setHint("🔍 Search...");
    searchBox.setTextSize(17);
    searchBox.setSingleLine(true);

    root.addView(searchBox,
            new LinearLayout.LayoutParams(
                    -1,
                    60
            ));

    listLayout = new LinearLayout(this);
    listLayout.setOrientation(LinearLayout.VERTICAL);

    android.widget.ScrollView scrollView = new android.widget.ScrollView(this);
    scrollView.addView(listLayout);

    LinearLayout.LayoutParams scrollParams =
            new LinearLayout.LayoutParams(
                    -1,
                    0,
                    1
            );

    root.addView(scrollView, scrollParams);

    setContentView(root);

    showWords("");

    searchBox.setOnEditorActionListener((v, actionId, event) -> {
        showWords(searchBox.getText().toString());
        return false;
    });

    searchBox.addTextChangedListener(
            new android.text.TextWatcher() {

                public void beforeTextChanged(
                        CharSequence s,
                        int start,
                        int count,
                        int after) {
                }

                public void onTextChanged(
                        CharSequence s,
                        int start,
                        int before,
                        int count) {

                    showWords(s.toString());
                }

                public void afterTextChanged(
                        android.text.Editable s) {
                }
            }
    );
}

private void showWords(String search) {

    listLayout.removeAllViews();

    String query = search.toLowerCase(Locale.ROOT);

    for (EnglishDictionary.Word word : words) {

        if (!query.isEmpty()
                && !word.english.toLowerCase(Locale.ROOT).contains(query)
                && !word.russian.toLowerCase(Locale.ROOT).contains(query)
                && !word.azerbaijani.toLowerCase(Locale.ROOT).contains(query)) {

            continue;
        }

        TextView item = new TextView(this);

        item.setText(
                "🇬🇧 " + word.english
                        + "\n🇷🇺 " + word.russian
                        + "\n🇦🇿 " + word.azerbaijani
        );

        item.setTextSize(17);
        item.setTextColor(Color.DKGRAY);
        item.setPadding(20, 18, 20, 18);
        item.setBackgroundColor(Color.rgb(245, 250, 247));

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        -1,
                        -2
                );

        params.setMargins(0, 0, 0, 12);

        listLayout.addView(item, params);
    }
}

}