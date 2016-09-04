package com.matenek.tourdetimor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void GoToSmsCall(View view) {
        Intent intent = new Intent(MainActivity.this,SmsCall.class);
        startActivity(intent);
    }

    public void GoToFAQ(View view) {
        Intent intent = new Intent(MainActivity.this,FAQ.class);
        startActivity(intent);
    }

    public void GoToSchedule(View view) {
        Intent intent = new Intent(MainActivity.this,Schedule.class);
        startActivity(intent);
    }

    public void GoToPrizes(View view) {
        Intent intent = new Intent(MainActivity.this,Prizes.class);
        startActivity(intent);
    }

    public void GoToMapsHome(View view) {
        Intent intent = new Intent(MainActivity.this,MapsHome.class);
        startActivity(intent);
    }

    public void GoToExplore(View view) {
    }
}
