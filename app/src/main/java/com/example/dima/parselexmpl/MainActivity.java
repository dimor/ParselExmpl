package com.example.dima.parselexmpl;

import android.content.Intent;
import android.support.v4.media.RatingCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Device> allDevices;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ((Button)findViewById(R.id.submitBtn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String model= ((EditText)findViewById(R.id.modelET)).getText().toString();
                String size= ((EditText)findViewById(R.id.sizeET)).getText().toString();
                int year= Integer.parseInt(((EditText)findViewById(R.id.yearET)).getText().toString());
                String maker= ((EditText)findViewById(R.id.makerET)).getText().toString();

                allDevices= new ArrayList<>();
                allDevices.add(new Device(model,size,year,maker));

                Intent intent = new Intent(MainActivity.this,ActivityOrder.class);
                intent.putExtra("allDevices",allDevices);
                startActivity(intent);
            }
        });
    }
}
