package com.zihadul.digitaltajbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvCount;
    Button buttonAdd, buttonSub , buttonReset;
     int count =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCount= findViewById(R.id.tvDisplay);
        buttonAdd= findViewById(R.id.buttonAdd);
        buttonSub= findViewById(R.id.buttonSub);
        buttonReset= findViewById(R.id.buttonRest);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
               tvCount.setText(""+count);
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                tvCount.setText(""+count);
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count =0;
                tvCount.setText(""+count);
            }
        });




    }
}