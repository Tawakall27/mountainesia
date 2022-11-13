package com.example.mountainesia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Reservasi extends AppCompatActivity {

    Button buttonbayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservasi);

        buttonbayar = findViewById(R.id.buttonbayar);

        buttonbayar.setOnClickListener(view ->{
            Intent i = new Intent(Reservasi.this,Pembayaran.class);
            startActivity(i);
        });
    }
}