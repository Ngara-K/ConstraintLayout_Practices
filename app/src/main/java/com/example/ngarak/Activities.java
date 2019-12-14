package com.example.ngarak;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activities extends AppCompatActivity {

    private Button btnOne, btnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);

        btnOne = findViewById(R.id.btn_one);
        btnTwo = findViewById(R.id.btn_two);

        btnOne.setOnClickListener(v -> startActivity(new Intent(Activities.this, One.class)));
    }
}
