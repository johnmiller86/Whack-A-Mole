package com.jdm5908_bw.ist402.whack_a_mole;

public class Game {

    private String difficulty;
    private double gameSpeed;

    public Game(){

        difficulty = "normal";
        gameSpeed = 1;
    }

    public Game(String difficulty)
    {
        if (difficulty.equals("easy")){
            gameSpeed = .5;
        }
        else if (difficulty.equals("normal")){
            gameSpeed = 1;
        }
        else {
            gameSpeed = 1.5;
        }
    }
}
