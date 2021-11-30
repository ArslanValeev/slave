package com.example.session2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Typeface;
import android.widget.TextView;
import android.view.View;
import android.content.DialogInterface;

public class hello7 extends AppCompatActivity {

    TextView textView11;
    Typeface tf;
    int mCurrentPeriod = 0;
    private Timer myTimer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello7);
        textView11 = (TextView) findViewById(R.id.textView11);
        textView11.setTypeface(tf);
    }

    public void onStartButtonClick(View v) {
        myTimer = new Timer();
        myTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                TimerMethod();
            }
        }, 0, 1000);
    };

    public void onPauseButtonClick(View v) {
        if (myTimer != null)
            myTimer.cancel();
    };

    public void onResetButtonClick(View v) {
        mCurrentPeriod = 0;
        if (myTimer != null)
            myTimer.cancel();
        textView11.setText("00:00");
    };

    private void TimerMethod() {

        this.runOnUiThread(Timer_Tick);
    }

    private Runnable Timer_Tick = new Runnable() {
        public void run() {
            mCurrentPeriod++;
            String temp = (new SimpleDateFormat("mm:ss")).format(new Date(
                    mCurrentPeriod * 1000));
            textView11.setText(temp);


        }
    };

    public void onClick(View view) {
    }
}