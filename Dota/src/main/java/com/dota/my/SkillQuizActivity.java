package com.dota.my;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
import java.util.Vector;


public class SkillQuizActivity extends Activity {
    private Random rand = new Random();

    private DataBase base = new DataBase();
    private Hero newHero;
    private Vector<ImageButton> answers = new Vector<ImageButton>();

    private int correctAnswer = -1;

    private int guessesLeft = 3;
    private int points = 0;

    private TextView time;
    private TextView score;
    private TextView guesses;

    private ImageView heroPic;

    private ImageButton button0;
    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button4;
    private ImageButton button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill_quiz);

        prepareScore();
        prapareBoard();

        prepareQuestion();
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
            addPoint();
            prepareQuestion();
        }
        else {
            subGuesses();
            if(guessesLeft == 0) {

                Intent myIntent = new Intent(this, GameOverActivity.class);
                myIntent.putExtra("SCORE", points);
                myIntent.putExtra("TIME", "1:04:12");
                startActivity(myIntent);
                finish();
            }
        }
    }

    private void addPoint() {
        points++;
        score.setText(Integer.toString(points));
    }

    private void subGuesses() {
        guessesLeft--;
        guesses.setText(Integer.toString(guessesLeft));
    }

    private void prepareScore() {
        score = (TextView)findViewById(R.id.score);
        score.setText(Integer.toString(points));

        guesses = (TextView)findViewById(R.id.guessesLeft);
        guesses.setText(Integer.toString(guessesLeft));

        time = (TextView)findViewById(R.id.time);
        time.setText(Integer.toString(0));
    }

    private void prapareBoard() {
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