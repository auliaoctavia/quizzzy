package com.smkn9semarang.quizzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Start extends AppCompatActivity {

    ImageView ivEasy;
    ImageView ivMedium;
    ImageView ivHard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        ivEasy = findViewById(R.id.easy);
        ivMedium = findViewById(R.id.medium);
        ivHard = findViewById(R.id.hard);


        ivEasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Start.this, easy.class);
                startActivity(intent);
            }
        });

        ivMedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Start.this, medium.class);
                startActivity(intent);
            }
        });

        ivHard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Start.this, hard.class);
                startActivity(intent);
            }
        });
    }
}