package com.example.fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TrainingActivity extends AppCompatActivity {

    boolean isTrained = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);
    }

    public void trainingComplete(View view){
        isTrained = true;
        if(isTrained){
            Intent j = new Intent(this, Home.class);
            startActivity(j);
        }
    }
}
