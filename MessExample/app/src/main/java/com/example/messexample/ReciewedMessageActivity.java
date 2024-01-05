package com.example.messexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReciewedMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciewed_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra("m");
        TextView textshow = findViewById(R.id.recievedText);
        textshow.setText(message);



    }
}