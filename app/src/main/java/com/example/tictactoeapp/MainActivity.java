package com.example.tictactoeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
// 0: celtics, 1: sixers
    int activePlayer = 0;

    public void dropIn (View view){
        ImageView counter = (ImageView) view;
        Log.i("Tag", counter.getTag().toString());
        counter.setTranslationY(-1500);

        if (activePlayer == 0){
            counter.setImageResource(R.drawable.celtics_icon);
            activePlayer = 1;
        } else {
            counter.setImageResource(R.drawable.sixers_icon);
            activePlayer = 0;
        }

        counter.animate().translationYBy(1500).rotation(3600).setDuration(300);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
