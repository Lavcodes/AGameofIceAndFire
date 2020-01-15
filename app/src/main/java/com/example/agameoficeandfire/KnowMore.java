package com.example.agameoficeandfire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class KnowMore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_know_more);


        Intent intent = getIntent();
        String Image = intent.getStringExtra("ImageId");
        String ImageId = "@drawable/" + Image;
        Intent intent2 = getIntent();
        String Text = intent.getStringExtra("Text");
        TextView textView = (TextView) findViewById(R.id.textview);
        textView.setText(Text);

    }
}
