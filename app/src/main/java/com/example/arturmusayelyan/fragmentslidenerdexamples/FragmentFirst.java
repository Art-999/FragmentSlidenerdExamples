package com.example.arturmusayelyan.fragmentslidenerdexamples;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by artur.musayelyan on 21/12/2017.
 */

public class FragmentFirst extends Fragment implements AdapterView.OnItemClickListener {
    private ListView listView;
    private Communicator communicator;

    public FragmentFirst() {

    }

    public static FragmentFirst newInstance() {
        Bundle args = new Bundle();
        FragmentFirst fragment = new FragmentFirst();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.first_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listView = view.findViewById(R.id.list_view_for_fragment);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.titles, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        communicator = (Communicator) getActivity();
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        communicator.communicateFragments(position);
    }
}
