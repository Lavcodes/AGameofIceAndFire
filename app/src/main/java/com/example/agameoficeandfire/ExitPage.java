package com.example.agameoficeandfire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ExitPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit_page);
        TextView textView=(TextView) findViewById(R.id.yourscore);
        Intent intent= getIntent();
        String score= intent.getStringExtra("Score");
        textView.setText(score);
    }


}
