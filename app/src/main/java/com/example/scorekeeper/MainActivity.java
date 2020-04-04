package com.example.scorekeeper;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void threePointsToA(View v) {
        scoreA+=3;
        displayForTeamA(scoreA);
    }

    public void twoPointsToA(View v) {
        scoreA+=2;
        displayForTeamA(scoreA);
    }

    public void onePointsToA(View v) {
        scoreA+=1;
        displayForTeamA(scoreA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void threePointsToB(View v) {
        scoreB+=3;
        displayForTeamB(scoreB);
    }

    public void twoPointsToB(View v) {
        scoreB+=2;
        displayForTeamB(scoreB);
    }

    public void onePointsToB(View v) {
        scoreB+=1;
        displayForTeamB(scoreB);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    public void resetScore(View v) {
        scoreB=0;
        scoreA=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
