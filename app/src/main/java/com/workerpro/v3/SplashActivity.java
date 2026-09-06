package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundResource(R.drawable.background);

        ImageView logo = new ImageView(this);
        logo.setImageResource(R.drawable.worker_logo);
        logo.setScaleType(ImageView.ScaleType.CENTER_INSIDE);

        int size = (int) (220 * getResources().getDisplayMetrics().density);

        layout.addView(logo, new LinearLayout.LayoutParams(size, size));

        TextView title = new TextView(this);
        title.setText("WORKER PRO");
        title.setTextSize(28);
        title.setTextColor(Color.rgb(0, 150, 70));
        title.setGravity(Gravity.CENTER);
        title.setTypeface(null, 1);

        layout.addView(title);

        TextView subtitle = new TextView(this);
        subtitle.setText("English for Workers");
        subtitle.setTextSize(18);
        subtitle.setTextColor(Color.DKGRAY);
        subtitle.setGravity(Gravity.CENTER);

        layout.addView(subtitle);

        TextView developer = new TextView(this);
        developer.setText("F.S");
        developer.setTextSize(16);
        developer.setTextColor(Color.GRAY);
        developer.setGravity(Gravity.CENTER);

        LinearLayout.LayoutParams developerParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);

        developerParams.topMargin = 25;

        layout.addView(developer, developerParams);

        setContentView(layout);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 1800);
    }
}