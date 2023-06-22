package com.example.tugas5_audioquran;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailSurahActivity extends AppCompatActivity {

    TextView textViewNameSimpleSurah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_surah);


        int chapterNumber = getIntent().getIntExtra("id",1);
        textViewNameSimpleSurah = findViewById(R.id.tvNamaSurah);
        textViewNameSimpleSurah.setText(chapterNumber);

    }
    }
