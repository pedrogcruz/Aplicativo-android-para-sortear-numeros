package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sort ( View v){
        TextView result = findViewById(R.id.sorted);
        TextView minView = (TextView)findViewById(R.id.txtMin);
        TextView maxView = (TextView)findViewById(R.id.txtMax);

        int min = Integer.parseInt(minView.getText().toString());
        int max = Integer.parseInt(maxView.getText().toString());

        int sorted = new Random().nextInt((max-min) + 1) + min;
        result.setText(String.valueOf((sorted)));
    }
}