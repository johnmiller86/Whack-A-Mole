package com.jdm5908_bw.ist402.whack_a_mole;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class GameActivity extends Activity {

    // UI References
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private TextView scoreTextView, timeTextView;

    // Game Elements
    private ArrayList<Button> buttons;
    private CountDownTimer timer;
    private int mole, score;
    private Random random;
    private String difficulty;
    // Settings
    File file;
    BufferedReader reader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        // Initializing variables
        buttons = new ArrayList<>();
        random = new Random();
        mole = 0;
        score = 0;
        difficulty = "normal";
        initializeGame();


        file = new File(getFilesDir(), "Settings.txt");
        Boolean exists = file.exists();
        try {
            reader = new BufferedReader(new FileReader(file));
            String line ="";
            while ((line = reader.readLine()) != null){
                difficulty = line;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        Game game = new Game(difficulty);

        timer = new CountDownTimer(60000, game.getGameSpeed()) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeTextView.setText("Time: " + millisUntilFinished / 1000);
                buttons.get(mole).setVisibility(View.INVISIBLE);
                mole = random.nextInt(9);
                buttons.get(mole).setVisibility(View.VISIBLE);
            }

            @Override
            public void onFinish() {
                buttons.get(mole).setVisibility(View.INVISIBLE);
                timeTextView.setText("Time: 0");
                Toast.makeText(GameActivity.this, "Game Over!!", Toast.LENGTH_SHORT).show();

                //TODO if highscore launch intent to addHighScore activity else finish();
            }
        }.start();
    }

    /**
     * Creates the references to the buttons and add them to an ArrayList.
     */
   private void initializeGame(){

       // Creating references
       button1 = (Button) findViewById(R.id.button1);
       button2 = (Button) findViewById(R.id.button2);
       button3 = (Button) findViewById(R.id.button3);
       button4 = (Button) findViewById(R.id.button4);
       button5 = (Button) findViewById(R.id.button5);
       button6 = (Button) findViewById(R.id.button6);
       button7 = (Button) findViewById(R.id.button7);
       button8 = (Button) findViewById(R.id.button8);
       button9 = (Button) findViewById(R.id.button9);
       scoreTextView = (TextView) findViewById(R.id.scoreTextView);
       timeTextView = (TextView) findViewById(R.id.timeTextView);

       // Adding buttons
       buttons.add(button1);
       buttons.add(button2);
       buttons.add(button3);
       buttons.add(button4);
       buttons.add(button5);
       buttons.add(button6);
       buttons.add(button7);
       buttons.add(button8);
       buttons.add(button9);

       // Setting listener
       for (Button button : buttons){
           button.setOnClickListener(buttonListener);
       }
   }

    /**
     * Listener for all mole buttons.
     */
    private final OnClickListener buttonListener = new OnClickListener(){

        public void onClick(View v){
            score += 1;
            scoreTextView.setText(String.valueOf(score));
            buttons.get(mole).setVisibility(View.INVISIBLE);
        }
    };
}