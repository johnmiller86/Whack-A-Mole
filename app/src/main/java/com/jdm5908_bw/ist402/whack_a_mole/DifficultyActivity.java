package com.jdm5908_bw.ist402.whack_a_mole;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

        // Setting reference to easyButton and adding listener
        easyButton = (Button) findViewById(R.id.easyButton);
        easyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try{
                    PrintWriter output = new PrintWriter(new FileOutputStream(file, false));
                    output.println("easy");
                    output.flush();
                    output.close();
                }
                catch (FileNotFoundException e){
                    e.printStackTrace();
                }

                Toast.makeText(DifficultyActivity.this, "Difficulty Set", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        // Setting reference to normalButton and adding listener
        normalButton = (Button) findViewById(R.id.normalButton);
        normalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    PrintWriter output = new PrintWriter(file);
                    output.println("normal");
                    output.flush();
                    output.close();
                }
                catch (FileNotFoundException e){
                    e.printStackTrace();
                }

                Toast.makeText(DifficultyActivity.this, "Difficulty Set", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        // Setting reference to hardButton and adding listener
        hardButton = (Button) findViewById(R.id.hardButton);
        hardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    PrintWriter output = new PrintWriter(file);
                    output.println("hard");
                    output.flush();
                    output.close();
                }
                catch (FileNotFoundException e){
                    e.printStackTrace();
                }

                Toast.makeText(DifficultyActivity.this, "Difficulty Set", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}