package com.example.projekkeempat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button btnSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnSearch =findViewById(R.id.btnSaveNumber);
        btnSearch.setOnClickListener(view -> {
            startActivity(new Intent(this, SignUpSuccesActivity.class));
        });
    }
}