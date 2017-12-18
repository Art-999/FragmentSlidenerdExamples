package com.example.arturmusayelyan.fragmentslidenerdexamples;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Artur","on Create Activity");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Artur","on Start Activity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Artur","on Resume Activity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Artur","on Restart Activity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Artur","on Pause Activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Artur","on Stop Activity");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d("Artur","on Save Instance State Activity");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("Artur","on Restore Instance State Activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Artur","on Destroy Activity");
    }
}
