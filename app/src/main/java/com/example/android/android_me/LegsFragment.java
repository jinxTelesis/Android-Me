package com.example.android.android_me;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.android_me.data.AndroidImageAssets;
import com.example.android.android_me.ui.MasterListAdapter;

import java.util.ArrayList;
import java.util.List;
/**
 * A simple {@link Fragment} subclass.
 * this fragment displays body parts and is a listener for click to
 * said body part
 */
public class LegsFragment extends Fragment {
    OnFragmentInteractionLegsListener mListener;



    public interface OnFragmentInteractionLegsListener {
        void ChoiceLegs(int choiceLegs);
    }

    private List<Integer> imagelist = new ArrayList<Integer>();
    private AndroidImageAssets imageAssets = new AndroidImageAssets();
    private ListView listViewx;



    public LegsFragment() {
        // Required empty public constructor
    }


    // uses the adapter to populate the body parts
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_legs, container, false);
        listViewx = (ListView) view.findViewById(R.id.legsListViewGoood);
        imagelist = imageAssets.getLegs();
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
                //Toast.makeText(getActivity(),Integer.toString(position),Toast.LENGTH_LONG).show();
                switch(position)
                {
                    case 0:
                        //Toast.makeText(getActivity(),Integer.toString(position),Toast.LENGTH_LONG).show();
                        mListener.ChoiceLegs(0);
                        break;

                    case 1:
                        //Toast.makeText(getActivity(),Integer.toString(position),Toast.LENGTH_LONG).show();
                        mListener.ChoiceLegs(1);
                        break;

                    case 2:
                        mListener.ChoiceLegs(2);
                        break;

                    case 3:
                        mListener.ChoiceLegs(3);
                        break;

                    case 4:
                        mListener.ChoiceLegs(4);
                        break;

                    case 5:
                        mListener.ChoiceLegs(5);
                        break;

                    case 6:
                        mListener.ChoiceLegs(6);
                        break;

                    case 7:
                        mListener.ChoiceLegs(7);
                        break;

                    case 8:
                        mListener.ChoiceLegs(8);
                        break;

                    case 9:
                        mListener.ChoiceLegs(9);
                        break;

                    case 10:
                        mListener.ChoiceLegs(10);
                        break;

                    case 11:
                        mListener.ChoiceLegs(11);
                        break;
                }
            }
        });
    }

    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);

        if(context instanceof OnFragmentInteractionLegsListener)
        {
            mListener = (OnFragmentInteractionLegsListener) context;
        } else
        {
            throw new ClassCastException(context.toString() + "fragment on attach error");
        }
    }
}

