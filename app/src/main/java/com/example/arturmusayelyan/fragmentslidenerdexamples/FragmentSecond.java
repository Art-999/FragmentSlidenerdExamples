package com.example.arturmusayelyan.fragmentslidenerdexamples;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by artur.musayelyan on 21/12/2017.
 */

public class FragmentSecond extends Fragment {
    TextView textView;

    public FragmentSecond() {

    }

    public static FragmentSecond newInstance() {
        Bundle args = new Bundle();
        FragmentSecond fragment = new FragmentSecond();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.second_fragmnet, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = view.findViewById(R.id.text_view);
    }

    public void changeData(int position) {
        Resources resources = getResources();
        String[] descriptions = resources.getStringArray(R.array.descriptions);
        textView.setText(descriptions[position]);
    }
}
