package com.example.agameoficeandfire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HowTheyRelated extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_they_related);
    }
    public void callhowrelatedqpage(View view)
    {

        Intent intent = new Intent(this,HowRelatedqpage.class);
        startActivity(intent);

    }
}
