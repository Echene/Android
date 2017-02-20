package com.example.emmanuel.td;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class NumberPicker extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_main);
        setContentView(R.layout.numberpick_layout);

        final android.widget.NumberPicker numberPicker = (android.widget.NumberPicker)findViewById(R.id.NumberPick);
        numberPicker.setMinValue(10);
        numberPicker.setMaxValue(20);
        numberPicker.setWrapSelectorWheel(false);

    }

}
