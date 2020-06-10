package com.example.dexterity_global;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class comingsoon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comingsoon);
        getSupportActionBar().hide();
        final typewriter te=(typewriter)findViewById(R.id.tes);
        te.setText("");
        te.setCharacterDelay(40);
        te.animateText("COMING SOON");
    }
}