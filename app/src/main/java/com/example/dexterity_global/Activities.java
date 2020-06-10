package com.example.dexterity_global;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Activities extends AppCompatActivity {
ImageButton es,ol,wo,qui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);
        getSupportActionBar().hide();
        es=(ImageButton)findViewById(R.id.essay);
        ol=(ImageButton)findViewById(R.id.olympiad);
        qui=(ImageButton)findViewById(R.id.quiz);
        wo=(ImageButton)findViewById(R.id.wordgame);
        es.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), comingsoon.class);
                startActivity(intent);
            }
        });
        ol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), comingsoon.class);
                startActivity(intent);
            }
        });
        qui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), comingsoon.class);
                startActivity(intent);
            }
        });
        wo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), comingsoon.class);
                startActivity(intent);
            }
        });
    }
}