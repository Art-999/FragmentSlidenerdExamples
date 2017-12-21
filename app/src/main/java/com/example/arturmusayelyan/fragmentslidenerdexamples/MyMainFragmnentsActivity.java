package com.example.arturmusayelyan.fragmentslidenerdexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MyMainFragmnentsActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_main_fragmnents);
    }

    @Override
    public void communicateFragments(int i) {
        FragmentSecond fragmentSecond = (FragmentSecond) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        fragmentSecond.changeData(i);
    }
}
