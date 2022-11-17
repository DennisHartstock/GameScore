package com.example.gamescore;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int score1 = 0;
    private int score2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvScore1 = findViewById(R.id.tvScore1);
        TextView tvScore2 = findViewById(R.id.tvScore2);

        tvScore1.setText(String.valueOf(score1));
        tvScore2.setText(String.valueOf(score2));

        tvScore1.setOnClickListener(view -> tvScore1.setText(String.valueOf(++score1)));
        tvScore2.setOnClickListener(view -> tvScore2.setText(String.valueOf(++score2)));
    }
}