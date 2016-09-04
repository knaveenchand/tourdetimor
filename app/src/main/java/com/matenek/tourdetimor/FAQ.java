package com.matenek.tourdetimor;

import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class FAQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();


        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);


        WebView lWebView = (WebView)findViewById(R.id.webView);
        lWebView.setWebChromeClient(new WebChromeClient());
        WebSettings webSettings = lWebView.getSettings();
        webSettings.setBuiltInZoomControls(true);

        webSettings.setJavaScriptEnabled(true);

        lWebView.loadUrl("file:///android_asset/tourdetimorfaq.html");


    }
}
