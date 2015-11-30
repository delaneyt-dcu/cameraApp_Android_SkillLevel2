package com.example.delaneyt.assigntwotimdelaney;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.util.Log;
import android.view.MenuItem;

/**
 * Created by delaneyt on 28/11/2015.
 * This activity displays a linear list with a back arrow in the Actionbar
 */

public class LinActivity extends Activity {
    // Calls up Log Class for debug logging
    private final String TAG="LinActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // Required call through to Activity.onCreate()
        // Restore any saved instance state
        super.onCreate(savedInstanceState);
        // Set up the application's user interface (content view)
        setContentView(R.layout.lin_expl_intent);
        Log.i(TAG, "The activity is visible and about to be created");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        Log.i(TAG, "The activity is visible and about to be selected");
        return super.onOptionsItemSelected(item);

    }
}

