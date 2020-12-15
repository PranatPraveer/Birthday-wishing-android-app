package com.example.birthdaywishingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Birthday extends AppCompatActivity {
    TextView tvresult1,tvresult2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);
        tvresult1=findViewById(R.id.tvresult1);
        tvresult2=findViewById(R.id.tvresult2);
        String name = getIntent().getStringExtra("name");
        String from = getIntent().getStringExtra("from");
        tvresult1.setText("Happy Birthday "+name);
        tvresult2.setText("--from "+from);
    }
}