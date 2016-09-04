package com.matenek.tourdetimor;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Schedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        Toolbar myToolbarSchedule = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbarSchedule);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar abschedule = getSupportActionBar();


        // Enable the Up button
        abschedule.setDisplayHomeAsUpEnabled(true);


        WebView lWebView = (WebView)findViewById(R.id.webView);
        lWebView.setWebChromeClient(new WebChromeClient());
        WebSettings webSettings = lWebView.getSettings();
        webSettings.setBuiltInZoomControls(true);

        webSettings.setJavaScriptEnabled(true);

        lWebView.loadUrl("file:///android_asset/schedule.html");
    }
}
