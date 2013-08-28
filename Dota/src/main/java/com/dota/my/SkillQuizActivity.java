package com.dota.my;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
import java.util.Vector;

import com.google.ads.AdRequest;
import com.google.ads.AdView;


public class SkillQuizActivity extends Activity {
    private GameSounds sounds;
    private Score score;
    private Random rand = new Random();
    private Chronometer mChronometer;

    private DataBase base = new DataBase();
    private Hero newHero;
    private Vector<ImageButton> answers = new Vector<ImageButton>();

    private int correctAnswer = -1;

    private TextView time;

    private ImageView heroPic;

    private ImageButton button0;
    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button4;
    private ImageButton button5;

    public SkillQuizActivity() {
        sounds = new GameSounds(this);
        score = new Score(this);
//        sounds.playMusic();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill_quiz);

        mChronometer = (Chronometer) findViewById(R.id.time);
        mChronometer.start();

        addAdView();

        score.prepareScore();
        prepareBoard();

        prepareQuestion();
    }

    private void addAdView() {
        AdView ad = (AdView)findViewById(R.id.adView);
        ad.loadAd(new AdRequest());
    }

    private void prepareQuestion()
    {
        int heroIdx = prepareHero();
        prepareCorrectAnswer();

        for(int i = 0; i < answers.size(); ++i) {
            if(i == correctAnswer)
                continue;

            int heroRand = randHeroForAnswers(heroIdx);
            int skillRand = rand.nextInt(3);
            int resource = base.getHero(heroRand).getSkill(skillRand);
            answers.get(i).setImageResource(resource);
        }
    }

    private int prepareHero() {
        int heroIdx = rand.nextInt(base.size());
        newHero = base.getHero(heroIdx);

        heroPic = (ImageView)findViewById(R.id.pic);
        heroPic.setImageResource(newHero.getPic());

        return heroIdx;
    }

    private void  prepareCorrectAnswer() {
        correctAnswer = rand.nextInt(answers.size());
        int correctSkill = rand.nextInt(3);
        int correctResource = newHero.getSkill(correctSkill);
        answers.get(correctAnswer).setImageResource(correctResource);
    }

    private int randHeroForAnswers(int skipHeroIdx) {
        while(true) {
            int idx = rand.nextInt(base.size());

            if(idx != skipHeroIdx)
                return idx;
        }
    }

    private void action(int buttonId) {
        if(correctAnswer == buttonId) {
            sounds.correct();
            score.addPoint();
            prepareQuestion();
        }
        else {
            sounds.incorrect();
            score.subGuesses();
            if(score.getGuessesLeft() == 0) {
                mChronometer.stop();

                Intent myIntent = new Intent(this, GameOverActivity.class);
                myIntent.putExtra("SCORE", score.getPiots());

                myIntent.putExtra("TIME", mChronometer.getText());
                startActivity(myIntent);
                finish();
            }
        }
    }

    private void prepareBoard() {
        button0 = (ImageButton)findViewById(R.id.image0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                action(0);

            }
        });

        button1 = (ImageButton)findViewById(R.id.image1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                action(1);
            }
        });

        button2 = (ImageButton)findViewById(R.id.image2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                action(2);
            }
        });

        button3 = (ImageButton)findViewById(R.id.image3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                action(3);
            }
        });

        button4 = (ImageButton)findViewById(R.id.image4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                action(4);
            }
        });

        button5 = (ImageButton)findViewById(R.id.image5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                action(5);
            }
        });

        answers.add(button0);
        answers.add(button1);
        answers.add(button2);
        answers.add(button3);
        answers.add(button4);
        answers.add(button5);
    }
}