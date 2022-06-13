package com.example.projekkeempat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class InputPhoneActivity extends AppCompatActivity {
    Button btnSaveNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_phone);
        btnSaveNumber =findViewById(R.id.btnSaveNumber);
        btnSaveNumber.setOnClickListener(view -> {
            startActivity(new Intent(this, SignUpSuccesActivity.class));
        });
    }
}