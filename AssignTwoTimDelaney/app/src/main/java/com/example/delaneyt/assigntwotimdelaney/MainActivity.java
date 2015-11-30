package com.example.delaneyt.assigntwotimdelaney;

import android.content.Intent;
import android.graphics.Color;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.provider.MediaStore;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    // Calls up Log Class for debug logging
    private final String TAG="MainActivity";
    protected void onCreate(Bundle savedInstanceState) {
        final Context context = this;
        super.onCreate(savedInstanceState);
        Log.i(TAG, "The activity is visible and about to be created");
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.url_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(
                        context, WebViewActivity.class);
                startActivity(intent);
                Log.i(TAG, "The activity is visible and about to be started");
            }

        });
        button = (Button) findViewById(R.id.cam_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(cameraIntent);
                Log.i(TAG, "The activity is visible and about to be started");
            }
        });
        button = (Button) findViewById(R.id.lin_layout_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, LinActivity.class);
                startActivity(intent);
                Log.i(TAG, "The activity is visible and about to be started");
            }
        });
        button = (Button) findViewById(R.id.rel_layout_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, RelActivity.class);
                startActivity(intent);
                Log.i(TAG, "The activity is visible and about to be started");
            }
        });

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }

        String qString = extras.getString("qString");

        final TextView textView = (TextView)
                findViewById(R.id.details_textView);
        textView.setTextColor(Color.RED);
        textView.setText(qString);
        Log.i(TAG, "The text is visible and about to be set");
    }

    public void onClick(View view) {
        finish();
    }

    @Override
    public void finish() {
        Intent data = new Intent();

        EditText editText1 = (EditText) findViewById(R.id.enterNameEditText);

        String returnString = editText1.getText().toString();
        data.putExtra("returnData", returnString);

        setResult(RESULT_OK, data);
        Log.i(TAG, "The result is visible and about to be set");
        super.finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
