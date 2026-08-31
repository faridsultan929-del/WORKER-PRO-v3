package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout main = new LinearLayout(this);
        main.setOrientation(LinearLayout.VERTICAL);
        main.setPadding(25, 25, 25, 25);
        main.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("WORKER PRO v3");
        title.setTextSize(28);
        title.setTextColor(Color.WHITE);
        title.setTypeface(null, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);
        title.setBackgroundColor(Color.rgb(0, 130, 70));
        title.setPadding(10, 35, 10, 35);

        main.addView(title);

        TextView subtitle = new TextView(this);
        subtitle.setText("Manufacturing & Safety Training");
        subtitle.setTextSize(18);
        subtitle.setTextColor(Color.DKGRAY);
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(10, 25, 10, 20);

        main.addView(subtitle);

        addButton(main, "🦺 SAFETY", "Safety rules and emergency situations");
        addButton(main, "🧯 FIRE EXTINGUISHERS", "Types and correct use");
        addButton(main, "⚙ STAMPING", "Hot and cold stamping");
        addButton(main, "🔧 CNC", "CNC machines and tools");
        addButton(main, "⚡ SENSORS", "Electronic and magnetic sensors");
        addButton(main, "🔥 WELDING", "Welding safety and basics");
        addButton(main, "✅ QUALITY CONTROL", "Quality inspection");

        setContentView(main);
    }

    private void addButton(LinearLayout main, String title, String description) {

        Button button = new Button(this);
        button.setText(title + "\n" + description);
        button.setTextSize(16);
        button.setTextColor(Color.WHITE);
        button.setGravity(Gravity.CENTER);
        button.setBackgroundColor(Color.rgb(0, 130, 70));
        button.setPadding(10, 20, 10, 20);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );

        params.setMargins(0, 8, 0, 8);

        main.addView(button, params);
    }
}