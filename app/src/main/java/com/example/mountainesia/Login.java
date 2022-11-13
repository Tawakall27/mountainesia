package com.example.mountainesia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    TextView menu1, textsignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        menu1 = findViewById(R.id.buttonScan);
        textsignup = findViewById(R.id.textsignup);

        menu1.setOnClickListener(view ->{
            Intent i = new Intent(Login.this,Profile.class);
            startActivity(i);
        });

        textsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this,SignUp.class);
                startActivity(i);
            }
        });
    }
}