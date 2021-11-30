package com.example.session2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class hello8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello8);
    }

    public void Voitenko(View view) {
        Intent sign = new Intent(hello8.this, lessons.class);
        startActivity(sign);
    }

    public void Voitenko2 (View view) {
        Intent sign = new Intent(hello8.this, Spine.class);
        startActivity(sign);
    }
    public void Voitenko3 (View view) {
        Intent sign = new Intent(hello8.this, Torso.class);
        startActivity(sign);
    }
}