package com.example.educationalapp;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score_team_A = 0;
    int score_team_B = 0;


    public void plus_three_team_a(View v){
        score_team_A=score_team_A+3;
        display_for_team_A(score_team_A);
    }
    public void plus_two_team_a(View v){
        score_team_A=score_team_A+2;
        display_for_team_A(score_team_A);
    }
    public void plus_one_team_a(View v){
        score_team_A=score_team_A+1;
        display_for_team_A(score_team_A);



    }
    public void plus_three_team_b(View v){
        score_team_B=score_team_B+3;
        display_for_team_B(score_team_B);
    }
    public void plus_two_team_b(View v){
        score_team_B=score_team_B+2;
        display_for_team_B(score_team_B);
    }
    public void plus_one_team_b(View v){
        score_team_B=score_team_B+1;
        display_for_team_B(score_team_B);
    }


    public void reset(View v){
        score_team_A=0;
        score_team_B=0;
        display_for_team_A(score_team_A);
        display_for_team_B(score_team_B);
    }



    public void display_for_team_A(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
                scoreView.setText(String.valueOf(score));
    }

    public void display_for_team_B(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}