package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button safety = findViewById(R.id.btnSafety);
        Button manufacturing = findViewById(R.id.btnManufacturing);
        Button stamping = findViewById(R.id.btnStamping);
        Button furnaces = findViewById(R.id.btnFurnaces);
        Button fire = findViewById(R.id.btnFire);
        Button sensors = findViewById(R.id.btnSensors);
        Button welding = findViewById(R.id.btnWelding);
        Button quality = findViewById(R.id.btnQuality);
        Button english = findViewById(R.id.btnEnglish);

        safety.setOnClickListener(v ->
                Toast.makeText(this, "SAFETY", Toast.LENGTH_SHORT).show());

        manufacturing.setOnClickListener(v ->
                Toast.makeText(this, "MANUFACTURING", Toast.LENGTH_SHORT).show());

        stamping.setOnClickListener(v ->
                Toast.makeText(this, "STAMPING", Toast.LENGTH_SHORT).show());

        furnaces.setOnClickListener(v ->
                Toast.makeText(this, "FURNACES", Toast.LENGTH_SHORT).show());

        fire.setOnClickListener(v ->
                Toast.makeText(this, "FIRE EXTINGUISHERS", Toast.LENGTH_SHORT).show());

        sensors.setOnClickListener(v ->
                Toast.makeText(this, "SENSORS", Toast.LENGTH_SHORT).show());

        welding.setOnClickListener(v ->
                Toast.makeText(this, "WELDING", Toast.LENGTH_SHORT).show());

        quality.setOnClickListener(v ->
                Toast.makeText(this, "QUALITY CONTROL", Toast.LENGTH_SHORT).show());

        english.setOnClickListener(v ->
                Toast.makeText(this, "ENGLISH FOR WORKERS", Toast.LENGTH_SHORT).show());
    }
}