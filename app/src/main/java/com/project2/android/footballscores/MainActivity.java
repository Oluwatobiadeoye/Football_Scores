package com.project2.android.footballscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int chelseaScore = 0;
    int manuScore = 0;
    int chelseaYellowCard = 0;
    int manuYellowCard = 0;
    int chelseaRedCard = 0;
    int manuRedCard = 0;
    int chelseaPosession;
    String cPosession;
    int manuPosession;
    String mPosession;

    /*
        * This method creates a TextView and also set the text in the TextView
     */
    public void displayChelseaScore(int score) {
        TextView scoreChelsea = (TextView) findViewById(R.id.chelsea_score);
        scoreChelsea.setText(String.valueOf(score));
    }

    /*
        *Increases chelsea's score by 1
        *It also changes chelsea's score to the value of chelseaScore variable
     */
    public void scoreChelsea(View v) {
        chelseaScore++;
        displayChelseaScore(chelseaScore);
    }

    /*
        * This method creates a TextView and also set the text in the TextView
     */
    public void setChelseaYellowCard(int yellowCard) {
        Button yChelsea = (Button) findViewById(R.id.chelsea_yellow);
        yChelsea.setText(String.valueOf(yellowCard));
    }
    /*
         *Increases chelsea's yellow card by 1
         *It also changes chelsea's yellow card to the value of chelseaYellowCard variable
      */
    public void yellowChelsea(View v) {
        chelseaYellowCard++;
        setChelseaYellowCard(chelseaYellowCard);
    }
    /*
            * This method creates a TextView and also set the text in the TextView
         */
    public void setChelseaRedCard(int redCard) {
        Button rChelsea = (Button) findViewById(R.id.chelsea_red);
        rChelsea.setText(String.valueOf(redCard));
    }
    /*
             *Increases chelsea's red card by 1
             *It also changes chelsea's red card to the value of chelseaRedCard variable
          */
    public void redChelsea(View v) {
        chelseaRedCard++;
        setChelseaRedCard(chelseaRedCard);
    }

    public void  setChelseaPosession(String posession) {
        TextView cPosession = (TextView) findViewById(R.id.chelsea_percent);
        cPosession.setText(posession);
    }
    /*
            * This method hanldes both chelsea and manu posession
         */

    // This method returns the value of chelseaPosession of type integer
    public int giveChelseaPosession() {
        int chelseaPosession = (int) (Math.random() * 100);
        return chelseaPosession;
    }

    public void chelseaPosession(View v) {
        chelseaPosession = giveChelseaPosession();
        manuPosession = 100 - chelseaPosession;
        cPosession = chelseaPosession + "%";
        mPosession = manuPosession + "%";
        setChelseaPosession(cPosession);
        setManuPosession(mPosession);
    }

    public void displayManuScore(int score) {
        TextView scoreManu = (TextView) findViewById(R.id.manu_score);
        scoreManu.setText(String.valueOf(score));
    }

    public void scoreManu(View v) {
        manuScore++;
        displayManuScore(manuScore);
    }

    public void setManuYellowCard(int yellowCard) {
        Button yManu = (Button) findViewById(R.id.manu_yellow);
        yManu.setText(String.valueOf(yellowCard));
    }

    public void yellowManu(View v) {
        manuYellowCard++;
        setManuYellowCard(manuYellowCard);
    }

    public void setManuRedCard(int redCard) {
        Button rManu = (Button) findViewById(R.id.manu_red);
        rManu.setText(String.valueOf(redCard));
    }

    public void redManu(View v) {
        manuRedCard++;
        setManuRedCard(manuRedCard);
    }

    public void setManuPosession(String posession) {
        TextView mPosession = (TextView) findViewById(R.id.manu_percent);
        mPosession.setText(posession);
    }




     //  This method reset all the value to "0"
    public void resetAll(View v) {
        chelseaScore = 0;
        manuScore = 0;
        chelseaYellowCard = 0;
        manuYellowCard = 0;
        chelseaRedCard = 0;
        manuRedCard = 0;
        chelseaPosession = 0;
        cPosession = chelseaPosession + "%";
        manuPosession = 0;
        mPosession = manuPosession + "%";
        displayChelseaScore(chelseaScore);
        displayManuScore(manuScore);
        setChelseaYellowCard(chelseaYellowCard);
        setManuYellowCard(manuYellowCard);
        setChelseaRedCard(chelseaRedCard);
        setManuRedCard(manuRedCard);
        setChelseaPosession(cPosession);
        setManuPosession(mPosession);
    }

}
