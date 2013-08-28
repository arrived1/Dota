package com.dota.my;


import android.app.Activity;
import android.widget.TextView;

public class Score {
    private Activity actv;

    private int guessesLeft = 3;
    private int points = 0;

    private TextView score;
    private TextView guesses;

    public Score(Activity actv_) {
        this.actv = actv_;
    }

    public void addPoint() {
        points++;
        score.setText(Integer.toString(points));
    }

    public void subGuesses() {
        guessesLeft--;
        guesses.setText(Integer.toString(guessesLeft));
    }

    public int getPiots() {
        return points;
    }

    public int getGuessesLeft() {
        return guessesLeft;
    }

    public void prepareScore() {
        score = (TextView)actv.findViewById(R.id.score);
        score.setText(Integer.toString(points));

        guesses = (TextView)actv.findViewById(R.id.guessesLeft);
        guesses.setText(Integer.toString(guessesLeft));

//        time = (TextView)findViewById(R.id.time);
//        time.setText(Integer.toString(0));
    }
}
