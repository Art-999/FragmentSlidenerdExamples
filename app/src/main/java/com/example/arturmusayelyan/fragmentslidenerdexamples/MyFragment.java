package com.example.arturmusayelyan.fragmentslidenerdexamples;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by artur.musayelyan on 18/12/2017.
 */

public class MyFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        Log.d("Artur","on Attach Fragment");
        super.onAttach(context);
        //karonx enq arden ogtagorcel activity-c findViewById() methode
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("Artur","on Create Fragment");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("Artur","on CreateView Fragment");
        return inflater.inflate(R.layout.my_fragment_layout,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d("Artur","on Activity Created Fragment");
        super.onActivityCreated(savedInstanceState);
        //mez asum e vor activity-i onCreate methode arden avartvel e
    }

    @Override
    public void onStart() {
        Log.d("Artur","on Start Fragment");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d("Artur","on Resume Fragment");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d("Artur","on Pause Fragment");
        super.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.d("Artur","on SaveInstanceState Fragment");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStop() {
        Log.d("Artur","on Stop Fragment");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d("Artur","on Destroy View Fragment");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("Artur","on Destroy Fragment");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d("Artur","on Detach Fragment");
        super.onDetach();
    }
}
