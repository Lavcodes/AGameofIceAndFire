package com.example.agameoficeandfire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OnlyNerds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_only_nerds);
    }
    public void onlynerdstype1(View view)
    {
        Intent intent = new Intent(this,Onlynerdstype1qpage.class);
        startActivity(intent);
    }
    public void onlynerdstype2(View view)
    {
        Intent intent = new Intent(this,Onlynerdstype2.class);
        startActivity(intent);
    }
}
