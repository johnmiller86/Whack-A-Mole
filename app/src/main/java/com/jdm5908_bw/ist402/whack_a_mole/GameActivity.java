package com.jdm5908_bw.ist402.whack_a_mole;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class GameActivity extends Activity {

    // UI References
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        initializeReferences();

        // TODO instantiate game with difficulty setting
        // TODO randomly show button for a predetermined period of time
        // TODO Increment TextView (Yet To Be Added) for score

    }

    /**
     * Creates the references to the buttons.
     */
   private void initializeReferences(){

       button1 = (Button) findViewById(R.id.button1);
       button2 = (Button) findViewById(R.id.button2);
       button3 = (Button) findViewById(R.id.button3);
       button4 = (Button) findViewById(R.id.button4);
       button5 = (Button) findViewById(R.id.button5);
       button6 = (Button) findViewById(R.id.button6);
       button7 = (Button) findViewById(R.id.button7);
       button8 = (Button) findViewById(R.id.button8);
       button9 = (Button) findViewById(R.id.button9);

   }
}
