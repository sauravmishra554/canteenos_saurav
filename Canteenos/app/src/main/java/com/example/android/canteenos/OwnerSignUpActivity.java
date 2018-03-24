package com.example.android.canteenos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by saurav on 24/3/18.
 */
public class OwnerSignUpActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.owner_sign_up);

        Spinner hall=(Spinner)findViewById(R.id.hall);
        ArrayAdapter<CharSequence> halladapter=ArrayAdapter.createFromResource(this,R.array.Hall,android.R.layout.simple_spinner_item);
        halladapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hall.setAdapter(halladapter);
    }
}
