package com.example.agameoficeandfire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
    }
    public void KnowYourCharacters(View view)
    {
        Intent intent = new Intent(this,KnowYourCharacters.class);
        startActivity(intent);
    }
    public void HowTheyRelated(View view)
    {
        Intent intent = new Intent(this,HowTheyRelated.class);
        startActivity(intent);
    } public void OnlyNerds(View view)
    {
        Intent intent = new Intent(this,OnlyNerds.class);
        startActivity(intent);
    }

}
