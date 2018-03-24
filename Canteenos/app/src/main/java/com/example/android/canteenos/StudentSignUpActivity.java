package com.example.android.canteenos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.Array;

/**
 * Created by saurav on 24/3/18.
 */

public class StudentSignUpActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_sign_up);


        Spinner hall=(Spinner)findViewById(R.id.hall);
        ArrayAdapter<CharSequence> halladapter=ArrayAdapter.createFromResource(this,R.array.Hall,android.R.layout.simple_spinner_item);
        halladapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hall.setAdapter(halladapter);


        Spinner room=(Spinner)findViewById(R.id.room);
        ArrayAdapter<CharSequence> roomadapter=ArrayAdapter.createFromResource(this,R.array.Room,android.R.layout.simple_spinner_item);
        roomadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        room.setAdapter(roomadapter);

        Spinner whichHall=(Spinner)findViewById(R.id.whichHall);
        ArrayAdapter<CharSequence> whichHalladapter=ArrayAdapter.createFromResource(this,R.array.WhichHall,android.R.layout.simple_spinner_item);
        whichHalladapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        whichHall.setAdapter(whichHalladapter);
    }
}
