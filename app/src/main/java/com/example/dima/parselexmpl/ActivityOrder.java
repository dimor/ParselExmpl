package com.example.dima.parselexmpl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityOrder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);


        Intent reciveIntent =getIntent();
       ArrayList<Device> allDevices = reciveIntent.getParcelableArrayListExtra("allDevices");


       ((TextView)findViewById(R.id.modelTV)).setText(allDevices.get(0).model);
        ( (TextView)findViewById(R.id.sizeTV)).setText(allDevices.get(0).size);
       ((TextView)findViewById(R.id.yearTV)).setText(String.valueOf(allDevices.get(0).year));
        ((TextView)findViewById(R.id.makerTV)).setText(String.valueOf(allDevices.get(0).maker));

    }
}
