package com.example.mountainesia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Beranda2 extends AppCompatActivity {

    Button buttonpesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda2);

        buttonpesan = findViewById(R.id.buttonpesan);

        buttonpesan.setOnClickListener(view ->{
            Intent i = new Intent(Beranda2.this,Reservasi.class);
            startActivity(i);
        });
    }
}