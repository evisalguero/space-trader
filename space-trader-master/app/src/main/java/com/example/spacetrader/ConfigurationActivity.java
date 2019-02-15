package com.example.spacetrader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ConfigurationActivity extends AppCompatActivity {

    private Spinner level_spinner;

    private Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);

        level_spinner = findViewById(R.id.spinnerDifficulty);

        ArrayAdapter<Difficulty> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, game.difficulty.values());
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        level_spinner.setAdapter(adapter2);

    }
}
