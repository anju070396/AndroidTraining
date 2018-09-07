package com.example.android.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int ScoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void point3A(View view)
    {
        scoreTeamA = scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }

    public void point2A(View view)
    {
        scoreTeamA = scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }

    public void free_throwA(View view)
    {
        //scoreTeamA = scoreTeamA+1;
        displayForTeamA(++scoreTeamA);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void point3B(View view)
    {
        ScoreTeamB = ScoreTeamB+3;
        displayForTeamB(ScoreTeamB);
    }

    public void point2B(View view)
    {
        ScoreTeamB = ScoreTeamB+2;
        displayForTeamB(ScoreTeamB);
    }

    public void free_throwB(View view)
    {
        ScoreTeamB = ScoreTeamB+1;
        displayForTeamB(
                ScoreTeamB);
    }


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View view) {
        scoreTeamA = 0;
        ScoreTeamB = 0;
        displayForTeamB( ScoreTeamB);
        displayForTeamA( scoreTeamA);
    }
}
