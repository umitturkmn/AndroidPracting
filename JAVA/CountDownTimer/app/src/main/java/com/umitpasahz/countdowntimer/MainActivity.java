package com.umitpasahz.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
        new CountDownTimer(30000, 100) {

            @Override
            public void onTick(long l) {
                textView.setText("Kalan: " + l/1000);
            }

            @Override
            public void onFinish() {
                textView.setText("Bitti.");
            }
        }.start();
    }
}