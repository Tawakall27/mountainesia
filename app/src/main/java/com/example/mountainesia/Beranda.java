package com.example.mountainesia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Beranda extends AppCompatActivity {

    ImageView ImageView15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);
        ImageView15 = findViewById(R.id.imageView15);

        ImageView15.setOnClickListener(view ->{
            Intent i = new Intent(Beranda.this,Beranda2.class);
            startActivity(i);
        });
    }
}