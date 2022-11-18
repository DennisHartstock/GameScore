package com.example.gamescore;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int score1 = 0;
    private int score2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            score1 = savedInstanceState.getInt("score1");
            score2 = savedInstanceState.getInt("score2");
        }

        TextView tvScore1 = findViewById(R.id.tvScore1);
        TextView tvScore2 = findViewById(R.id.tvScore2);

        tvScore1.setText(String.valueOf(score1));
        tvScore2.setText(String.valueOf(score2));

        tvScore1.setOnClickListener(view -> tvScore1.setText(String.valueOf(++score1)));
        tvScore2.setOnClickListener(view -> tvScore2.setText(String.valueOf(++score2)));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("score1", score1);
        outState.putInt("score2", score2);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}