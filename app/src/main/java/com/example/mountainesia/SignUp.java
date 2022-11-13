package com.example.mountainesia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class SignUp extends AppCompatActivity {

    Button buttonsignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        buttonsignin = findViewById(R.id.buttonsignin);

        buttonsignin.setOnClickListener(view ->{
            Intent i = new Intent(SignUp.this,Login.class);
            startActivity(i);
        });
    }
}