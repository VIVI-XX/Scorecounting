package com.example.tinkpad.scorecounting;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Score extends AppCompatActivity implements View.OnClickListener {
    TextView sco;
    TextView sco2;
    private final String TAG = "second";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        sco=findViewById(R.id.score);
        sco2=findViewById(R.id.score2);
        Log.i(TAG, "onCreate: ");


    }

    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: ");
    }

    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: ");
    }

    @Override
    //保留原始数据
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String scorea = ((TextView) findViewById(R.id.score)).getText().toString();
        String scoreb = ((TextView) findViewById(R.id.score2)).getText().toString();
        Log.i(TAG, "onSaveInstanceState: ");

        outState.putString("teama_score", scorea);
        outState.putString("teamb_score", scoreb);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String scorea = savedInstanceState.getString("teama_score");
        String scoreb = savedInstanceState.getString("teamb_score");
        Log.i(TAG, "onRestoreInstanceState: ");

        ((TextView) findViewById(R.id.score)).setText(scorea);
        ((TextView) findViewById(R.id.score2)).setText(scoreb);

    }

    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: ");
    }

    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: ");
    }

    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: ");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
    }


    @Override
    public void onClick(View v) {

    }

    public void onClick3(View btn) {
        if(btn.getId()==R.id.btn3){
            showScore(3);
        }else{
            showScore2(3);
        }
    }

    public void onClick2(View btn) {
        if(btn.getId()==R.id.btn2){
            showScore(2);
        }else{
            showScore2(2);
        }

    }


    public void onClick1(View btn) {
        if(btn.getId()==R.id.btn1){
            showScore(1);
        }else{
            showScore2(1);
        }

    }


    public void onClick4(View btn) {
        sco.setText("0");
        sco2.setText("0");
    }

    private void showScore(int inc){
        Log.i("show","inc="+inc);
        String oldString =(String) sco.getText();
        int newScore= Integer.parseInt(oldString)+inc;
        sco.setText(""+ newScore );

    }
    private void showScore2(int inc){
        Log.i("show","inc="+inc);
        String oldString =(String) sco2.getText();
        int newScore= Integer.parseInt(oldString)+inc;
        sco2.setText(""+ newScore );

    }

}

