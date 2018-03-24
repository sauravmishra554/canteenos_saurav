package com.example.android.canteenos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signIn = (Button) findViewById(R.id.signIn);

        // Set a click listener on that View
        signIn.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Sign in category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent signInIntent = new Intent(MainActivity.this, SignInActivity.class);

                // Start the new activity
                startActivity(signInIntent);
            }

        });

        Button studentSignUp = (Button) findViewById(R.id.studentSignUp);

        // Set a click listener on that View
        studentSignUp.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Sign in category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent studentSignUpIntent = new Intent(MainActivity.this, StudentSignUpActivity.class);

                // Start the new activity
                startActivity(studentSignUpIntent);
            }

        });

        Button ownerSignUp = (Button) findViewById(R.id.ownerSignUp);

        // Set a click listener on that View
        ownerSignUp.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Sign in category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent ownerSignUpIntent = new Intent(MainActivity.this, OwnerSignUpActivity.class);

                // Start the new activity
                startActivity(ownerSignUpIntent);
            }

        });
    }
}
