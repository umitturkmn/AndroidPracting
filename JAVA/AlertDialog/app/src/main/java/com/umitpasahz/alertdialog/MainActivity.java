package com.umitpasahz.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void save(View view){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Kaydet");
        alert.setMessage("Emin misin: ");
        alert.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"İşlem kaydedildi.",Toast.LENGTH_LONG).show();
            }
        });
        alert.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"İşlem kaydedilmedi.",Toast.LENGTH_LONG).show();
            }
        });
        alert.show();
    }
}