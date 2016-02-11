package com.jdm5908_bw.ist402.whack_a_mole;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DifficultyActivity extends Activity {

    // UI Buttons to be referenced
    Button easyButton, normalButton, hardButton;

    // Settings file and writer
    File file;
    PrintWriter output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);

        file = new File(getFilesDir(), "Settings.txt");
        try {
            PrintWriter output = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        easyButton = (Button) findViewById(R.id.easyButton);
        easyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //TODO write difficulty to settings file
                output.println("easy");

                Toast.makeText(DifficultyActivity.this, "Difficulty Set", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        normalButton = (Button) findViewById(R.id.normalButton);
        normalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //TODO write difficulty to settings file
                output.println("normal");

                Toast.makeText(DifficultyActivity.this, "Difficulty Set", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        hardButton = (Button) findViewById(R.id.hardButton);
        hardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //TODO write difficulty to settings file
                output.println("hard");

                Toast.makeText(DifficultyActivity.this, "Difficulty Set", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
