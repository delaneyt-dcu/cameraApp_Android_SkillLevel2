package com.example.delaneyt.assigntwotimdelaney;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

/**
 * Created by delaneyt on 29/11/2015.
 * This Activity Class displays editable text in relative layout format
 * and returns data to the MainActivity
 */
public class RelActivity extends Activity{
    // Calls up Log Class for debug logging
    private final String TAG="RelActivity";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // Required call through to Activity.onCreate()
        // Restore any saved instance state
        super.onCreate(savedInstanceState);
        Log.i(TAG, "The activity is visible and about to be created");
        // Set up the application's user interface (content view)
        setContentView(R.layout.rel_expl_intent);
    }

    public void onClick(View view) {
        Intent i = new Intent(this, MainActivity.class);

        EditText name = (EditText) findViewById(R.id.enterNameEditText);
        EditText email = (EditText) findViewById(R.id.enterEmailEditText);
        EditText phone = (EditText) findViewById(R.id.enterPhoneEditText);
        String myString =   "Name: " + name.getText().toString() +
                            "\nEmail: " + email.getText().toString() +
                            "\nPhone: " + phone.getText().toString();
        i.putExtra("qString", myString);
        startActivity(i);
        Log.i(TAG, "The activity is visible and about to be started");
    }
}
