package com.umitpasahz.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1text;
    EditText number2text;
    TextView result1text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1text = findViewById(R.id.number1);
        number2text = findViewById(R.id.number2);
        result1text = findViewById(R.id.textView);
    }
    public void onSum(View view){
        if (number1text.getText().toString().matches("") || number2text.getText().toString().matches("")){
            result1text.setText("Numara girmediniz.");
        } else{
            int num1 = Integer.parseInt(number1text.getText().toString());
            int num2 = Integer.parseInt(number2text.getText().toString());
            int result = num1 + num2;

            result1text.setText("Sonuç: " + result);
        }


    }
    public void onDeduct(View view){
        if (number1text.getText().toString().matches("") || number2text.getText().toString().matches("")){
            result1text.setText("Numara girmediniz.");
        } else{
            int num1 = Integer.parseInt(number1text.getText().toString());
            int num2 = Integer.parseInt(number2text.getText().toString());
            int result = num1 - num2;

            result1text.setText("Sonuç: " + result);
        }

    }
    public void onMultiply(View view){
        if (number1text.getText().toString().matches("") || number2text.getText().toString().matches("")){
            result1text.setText("Numara girmediniz.");
        } else{
            int num1 = Integer.parseInt(number1text.getText().toString());
            int num2 = Integer.parseInt(number2text.getText().toString());
            int result = num1 * num2;

            result1text.setText("Sonuç: " + result);
        }
    }
    public void onDivide(View view){
        if (number1text.getText().toString().matches("") || number2text.getText().toString().matches("")){
            result1text.setText("Numara girmediniz.");
        } else{
            int num1 = Integer.parseInt(number1text.getText().toString());
            int num2 = Integer.parseInt(number2text.getText().toString());
            int result = num1 / num2;

            result1text.setText("Sonuç: " + result);
        }

    }
}