package com.example.fyp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TrainingActivity extends AppCompatActivity {

    boolean isTrained = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        Toolbar toolbar = findViewById(R.id.appbarlayout_tool_bar);
        toolbar.setTitle("Training");
    }

    public void trainingComplete(View view){
        isTrained = true;
        if(isTrained){
            Intent j = new Intent(this, Home.class);
            startActivity(j);
        }
    }
}
