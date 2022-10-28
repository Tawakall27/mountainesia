package com.example.mountainesia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    TextView menu1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        menu1 = findViewById(R.id.buttonScan);

        menu1.setOnClickListener(view ->{
            Intent i = new Intent(Login.this,Profile.class);
            startActivity(i);
        });
    }
}