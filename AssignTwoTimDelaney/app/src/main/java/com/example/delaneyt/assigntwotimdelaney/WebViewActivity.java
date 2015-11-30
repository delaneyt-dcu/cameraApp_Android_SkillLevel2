package com.example.delaneyt.assigntwotimdelaney;

/**
 * Created by delaneyt on 25/11/2015.
 * This Activity display a http web page
 */

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class WebViewActivity extends Activity{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Calls up Log Class for debug logging
        String TAG = "WebViewActivity";
        Log.i(TAG, "The activity is visible and about to be created");
        setContentView(R.layout.impl_intent_http);

        WebView webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.dcu.ie");
        Log.i(TAG, "The webView is visible and about to be loaded");
    }
}
