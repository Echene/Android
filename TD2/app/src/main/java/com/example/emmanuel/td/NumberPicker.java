package com.example.emmanuel.td;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class NumberPicker extends Activity{

    NumberPicker MyNumPicker1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.numberpick_layout);

        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v1 = inflater.inflate(R.layout.numberpick_layout, null);
/*        MyNumPicker1 = (NumberPicker) v1.findViewById(R.id.MyNunPicker1);

        MyNumPicker1.setMinValue(10);
        MyNumPicker1.setMaxValue(20);*/

    }

}
