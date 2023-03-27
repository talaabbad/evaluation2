package com.example.evaluaton2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class secondactivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

         tv = findViewById(R.id.textView);
        Intent i=getIntent();
       // startActivity(i);
         // i=getIntent();
        String s= i.getStringExtra("PersonName");
         tv.setText("Hello,"+s);


    }
}