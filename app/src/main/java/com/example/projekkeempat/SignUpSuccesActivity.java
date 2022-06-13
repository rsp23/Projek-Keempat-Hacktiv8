package com.example.projekkeempat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SignUpSuccesActivity extends AppCompatActivity {
    Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_succes);
        btnNext =findViewById(R.id.btnNext);
        btnNext.setOnClickListener(view -> {
            startActivity(new Intent(this, HomeActivity.class));
        });
    }
}