package com.example.tinkpad.scorecounting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Score extends AppCompatActivity implements View.OnClickListener {
    TextView sco;
    TextView sco2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        sco=findViewById(R.id.score);
        sco2=findViewById(R.id.score2);


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

