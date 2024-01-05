package com.example.messexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSendMessage = findViewById(R.id.sendbutton);
        TextView input = findViewById(R.id.editTextMessage);
        buttonSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = input.getText().toString();
                launchNextScreen(message);
            }
        });
    }
    private void launchNextScreen(String message){
        Intent intent = new Intent(this, ReciewedMessageActivity.class);
        intent.putExtra("m", message);
        startActivity(intent);

    }
}