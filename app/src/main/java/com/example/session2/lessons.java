package com.example.session2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lessons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);
    }
    public void Voitenko (View view) {
        Intent sign = new Intent(lessons.this, Spine.class);
        startActivity(sign);
    }
    public void Voitenko2 (View view) {
        Intent sign = new Intent(lessons.this, Torso.class);
        startActivity(sign);
    }
    public void Voitenko3 (View view) {
        Intent sign = new Intent(lessons.this, Legs.class);
        startActivity(sign);
    }
    public void Voitenko4 (View view) {
        Intent sign = new Intent(lessons.this, hello7.class);
        startActivity(sign);
    }
}