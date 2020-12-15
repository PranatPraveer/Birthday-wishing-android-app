package com.example.birthdaywishingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnsubmit;
    EditText etid1,etid2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsubmit=findViewById(R.id.btnsubmit);
        etid1=findViewById(R.id.etid1);
        etid2=findViewById(R.id.etid2);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String from = etid2.getText().toString();
                if (etid1.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter the field", Toast.LENGTH_SHORT).show();
                } else {
                    String name = etid1.getText().toString().trim();
                    Intent intent = new Intent(MainActivity.this, com.example.birthdaywishingapp.Birthday.class);
                    intent.putExtra("name", name);
                    intent.putExtra("from",from);
                    startActivity(intent);
                }

            }
        });
    }
}