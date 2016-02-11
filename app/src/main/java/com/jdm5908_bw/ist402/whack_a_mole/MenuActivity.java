package com.jdm5908_bw.ist402.whack_a_mole;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends Activity {

    // UI Buttons to be referenced
    Button newGameButton, highScoresButton, selectDifficultyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        newGameButton = (Button) findViewById(R.id.newGameButton);
        newGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GameActivity.class);
                startActivity(intent);
            }
        });

        highScoresButton = (Button) findViewById(R.id.highScoresButton);
        highScoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TODO check if file exists and display toast if not

                Intent intent = new Intent(getApplicationContext(), HighScoreActivity.class);
                startActivity(intent);
            }
        });

        selectDifficultyButton = (Button) findViewById(R.id.selectDifficultyButton);
        selectDifficultyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DifficultyActivity.class);
                startActivity(intent);
            }
        });
    }
}
