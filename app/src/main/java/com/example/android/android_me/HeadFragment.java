package com.example.android.android_me;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.android.android_me.data.AndroidImageAssets;
import com.example.android.android_me.ui.MasterListAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * this fragment displays body parts and is a listener for click to
 * said body part
 */
public class HeadFragment extends Fragment {
    OnFragmentInteractionHeadListener mListener;

    private List<Integer> imagelist = new ArrayList<Integer>();
    private AndroidImageAssets imageAssets = new AndroidImageAssets();
    private ListView listViewx;


    public interface OnFragmentInteractionHeadListener {
        void ChoiceHead(int choiceHead);
    }

    public HeadFragment() {
        // Required empty public constructor
    }


    // uses the adapter to populate the body parts
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_head, container, false);
        listViewx = (ListView) view.findViewById(R.id.headListViewGoood);
        imagelist = imageAssets.getHeads();
        MasterListAdapter masterListAdapter = new MasterListAdapter(getActivity(), imagelist);
        listViewx.setAdapter(masterListAdapter);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    // == this is the listener for body clicks ==
    @Override
    public void onActivityCreated(Bundle saveIstanceState) {

        super.onActivityCreated(saveIstanceState);

        listViewx.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position)
                {
                    case 0:
                        mListener.ChoiceHead(0);
                        break;

                    case 1:
                        mListener.ChoiceHead(1);
                        break;

                    case 2:
                        mListener.ChoiceHead(2);
                        break;

                    case 3:
                        mListener.ChoiceHead(3);
                        break;

                    case 4:
                        mListener.ChoiceHead(4);
                        break;

                    case 5:
                        mListener.ChoiceHead(5);
                        break;

                    case 6:
                        mListener.ChoiceHead(6);
                        break;

                    case 7:
                        mListener.ChoiceHead(7);
                        break;

                    case 8:
                        mListener.ChoiceHead(8);
                        break;

                    case 9:
                        mListener.ChoiceHead(9);
                        break;

                    case 10:
                        mListener.ChoiceHead(10);
                        break;

                    case 11:
                        mListener.ChoiceHead(11);
                        break;
                }


            }
        });
    }

    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);

        if(context instanceof OnFragmentInteractionHeadListener)
        {
            mListener = (OnFragmentInteractionHeadListener)context;
        } else
        {
            throw new ClassCastException(context.toString() + "fragment on attach error");
        }
    }
}
