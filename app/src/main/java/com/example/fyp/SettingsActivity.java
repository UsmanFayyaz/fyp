package com.example.fyp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SettingsActivity extends AppCompatActivity {
    ListView l1;
    String stitle[]={"FontSzie", "Font Color", "Profile Info", "Change User Name & Password"};
    String sdescriptor[]={"Font Size Description", "Font Color Description", "Profile Info Description","Chnage password Description"};
    int images[]= {R.drawable.fontsize, R.drawable.fontsize, R.drawable.fontsize, R.drawable.fontsize};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        l1=findViewById(R.id.myList);



    }

    class MyAdapter extends ArrayAdapter<String>{

        Context conetxt;
        String stitle[];
        String sdescriptor[];
        int stags[];
    MyAdapter(Context c,String stitle[],String sdescriptor[],int stags[]) {
        super(c,R.layout.row,R.id.textView, title);
        this.context=c;
        this.stitle=title;
        this.sdescriptor=descriptor;
        this.tags=tags;

    }

    @NonNull
    @Override
        public View getview(int position, @Nullable View correctView, NonNull ViewGroup parent){
        LayoutInflater layoutInflater =(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        View




    }



    }
}
