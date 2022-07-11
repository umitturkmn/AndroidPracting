/* Bismillahirrahmanirrahim.
   Rahman ve Rahim Olan Allah'ın Adıyla.
 */

package com.umitpasahz.firstapp;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Hello World");
    }

    public void changeImg(View view){
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.images);

    }
}