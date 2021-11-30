package com.example.session2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Spine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spine);
    }

    public void Voitenko(View view) {
        Intent sign = new Intent(Spine.this, lessons.class);
        startActivity(sign);
    }
    public void Voitenko2(View view) {
        Intent sign = new Intent(Spine.this, Torso.class);
        startActivity(sign);
    }
    public void Voitenko3(View view) {
        Intent sign = new Intent(Spine.this, Legs.class);
        startActivity(sign);
    }
    public void Voitenko4 (View view) {
        Intent sign = new Intent(Spine.this, hello7.class);
        startActivity(sign);
    }
}