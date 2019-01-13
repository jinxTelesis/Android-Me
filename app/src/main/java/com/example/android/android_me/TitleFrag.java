package com.example.android.android_me;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.android_me.data.AndroidImageAssets;
import com.example.android.android_me.ui.MasterListAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * was a project requirement but is not really used anymore
 * could remove
 */
public class TitleFrag extends Fragment {


    public TitleFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_title, container, false);
        TextView textView = (TextView) view.findViewById(R.id.titletextView);
        return view;
    }

}
