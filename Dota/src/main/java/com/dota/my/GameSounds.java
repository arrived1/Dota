package com.dota.my;

import android.app.Activity;
import android.media.MediaPlayer;

public class GameSounds {
    private Activity actv;

    private void playSound(int id) {
        MediaPlayer mp = MediaPlayer.create(actv, id);
        mp.start();
    }

    public GameSounds(Activity actv_) {
        this.actv = actv_;
    }

    public void welcome() {
        playSound(R.raw.welcome);
    }

    public void playMusic() {
        playSound(R.raw.gamestartup2);
    }

    public void correct() {
        playSound(R.raw.correct);
    }

    public void incorrect() {
        playSound(R.raw.incorrect);
    }

    public void gameOver() {
        playSound(R.raw.game_over);
    }


}
