package com.example.moandroidapps.orientationbasedconfigurationevents;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //#########################################################################################
    //#########################################################################################
    public static final String LOG_TAG = "MainActivity";
    //#########################################################################################
    //#########################################################################################

    /*Life Cycle Event*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //#########################################################################################
        //#########################################################################################
        //To trace events:
        Log.d(LOG_TAG, "onCreate");

        //Using Java code to output current class name:
        //Log.d(getClass().getSimpleName(), "onCreate");
        //#########################################################################################
        //#########################################################################################
    }//end onCreate

    /*Event Handler*/
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Toast.makeText(MainActivity.this,
                    "Your Orientation is Portrait", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this,
                    "Your Orientation is Landscape", Toast.LENGTH_SHORT).show();
        }//end else
    }

    /*Life Cycle Event*/
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    /*Life Cycle Event*/
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    /*Life Cycle Event*/
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    /*Life Cycle Event*/
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    /*Life Cycle Event*/
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    /*Life Cycle Event*/
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }//end onRestart
}//end MainActivity
