package com.example.fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        String[] fruits = {"Font Size", "Theme", "Profile Info", "Change Username/Password"};

        ArrayAdapter<String> myArrayAdapter = new ArrayAdapter<String>(this,R.layout.activity_setting_listview,R.id.list,fruits);
        ListView myListView = (ListView) findViewById(R.id.myList);
        myListView.setAdapter(myArrayAdapter);
    }
}
