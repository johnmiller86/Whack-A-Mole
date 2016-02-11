package com.jdm5908_bw.ist402.whack_a_mole;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DifficultyActivity extends Activity {

    // UI Buttons to be referenced
    Button easyButton, normalButton, hardButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);

        easyButton = (Button) findViewById(R.id.easyButton);
        easyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //TODO write difficulty to settings file


                Toast.makeText(DifficultyActivity.this, "Difficulty Set", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        normalButton = (Button) findViewById(R.id.normalButton);
        normalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //TODO write difficulty to settings file


                Toast.makeText(DifficultyActivity.this, "Difficulty Set", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        hardButton = (Button) findViewById(R.id.hardButton);
        hardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //TODO write difficulty to settings file


                Toast.makeText(DifficultyActivity.this, "Difficulty Set", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
