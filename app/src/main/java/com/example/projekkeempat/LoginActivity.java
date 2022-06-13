package com.example.projekkeempat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

public class LoginActivity extends AppCompatActivity {
    Button btnSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnSignUp =findViewById(R.id.btnSignUp);
        btnSignUp.setOnClickListener(view -> {
            startActivity(new Intent(this, InputPhoneActivity.class));
        });
    }
}