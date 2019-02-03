package com.example.android.android_me.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.android.android_me.R;

/**
 * A simple {@link Fragment} subclass.
 *  this is the primary display fragment
 *  this sets the resource image to be used
 */
public class DisplayingFragment extends Fragment {

    private int headChoice;
    private int bodyChoice;
    private int legChoice;

    private static final String CHOICE = "choice";
    private static final String BODYCHOICE = "bodychocie";
    private static final String LEGCHOICE = "legchoice";

    public DisplayingFragment() {
        // Required empty public constructor
    }

    // == puts the correct image choices into the fragment data ==
    public static DisplayingFragment newInstance(int choice, int bodychoice, int legchoice) {
        DisplayingFragment fragment = new DisplayingFragment();
        Bundle arguments = new Bundle();
        arguments.putInt(CHOICE, choice);
        arguments.putInt(BODYCHOICE, bodychoice);
        arguments.putInt(LEGCHOICE,legchoice);
        fragment.setArguments(arguments);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View view = inflater.inflate(R.layout.fragment_displaying, container, false);

        ImageView imageViewHead = (ImageView) view.findViewById(R.id.headDisplay);
        ImageView imageViewBody = (ImageView) view.findViewById(R.id.bodyDisplay);
        ImageView imageViewLegs = (ImageView) view.findViewById(R.id.legDisplay);

        imageViewHead.setImageResource(R.drawable.head1);
        imageViewBody.setImageResource(R.drawable.body1);
        imageViewLegs.setImageResource(R.drawable.legs1);

        // make this into a loop lol
        // wtf you doing

        // == selects the correct image data based on what user selected ==
        // == via the data passed into the fragment ==

        if(getArguments().containsKey(CHOICE))
        {
            headChoice = getArguments().getInt(CHOICE);
            //Toast.makeText(getActivity(), "choice in getArugs " + Integer.toString(headChoice), Toast.LENGTH_SHORT).show();
        }

        if(getArguments().containsKey(BODYCHOICE))
        {
            bodyChoice = getArguments().getInt(BODYCHOICE);
        }

        if(getArguments().containsKey(LEGCHOICE))
        {
            legChoice = getArguments().getInt(LEGCHOICE);
        }

        if(headChoice == 0)
        {
            imageViewHead.setImageResource(R.drawable.head1);
        }

        if(headChoice == 1)
        {
            imageViewHead.setImageResource(R.drawable.head2);
        }

        if(headChoice == 2)
        {
            imageViewHead.setImageResource(R.drawable.head3);
        }

        if(headChoice == 3)
        {
            imageViewHead.setImageResource(R.drawable.head4);
            //Toast.makeText(getActivity(), "choice in set image " + Integer.toString(headChoice), Toast.LENGTH_SHORT).show();
        }

        if(headChoice == 4)
        {
            imageViewHead.setImageResource(R.drawable.head5);
        }

        if(headChoice == 5)
        {
            imageViewHead.setImageResource(R.drawable.head6);
        }

        if(headChoice == 6)
        {
            imageViewHead.setImageResource(R.drawable.head7);
        }

        if(headChoice == 7)
        {
            imageViewHead.setImageResource(R.drawable.head8);
        }

        if(headChoice == 8)
        {
            imageViewHead.setImageResource(R.drawable.head9);
        }

        if(headChoice == 9)
        {
            imageViewHead.setImageResource(R.drawable.head10);
        }

        if(headChoice == 10)
        {
            imageViewHead.setImageResource(R.drawable.head11);
        }

        if(headChoice == 11)
        {
            imageViewHead.setImageResource(R.drawable.head12);
        }

        if(bodyChoice == 0)
        {
            imageViewBody.setImageResource(R.drawable.body1);
        }

        if(bodyChoice == 1)
        {
            imageViewBody.setImageResource(R.drawable.body2);
        }

        if(bodyChoice == 2)
        {
            imageViewBody.setImageResource(R.drawable.body3);
        }

        if(bodyChoice == 3)
        {
            imageViewBody.setImageResource(R.drawable.body4);
        }

        if(bodyChoice == 4)
        {
            imageViewBody.setImageResource(R.drawable.body5);
        }

        if(bodyChoice == 5)
        {
            imageViewBody.setImageResource(R.drawable.body6);
        }

        if(bodyChoice == 6)
        {
            imageViewBody.setImageResource(R.drawable.body7);
        }

        if(bodyChoice == 7)
        {
            imageViewBody.setImageResource(R.drawable.body8);
        }

        if(bodyChoice == 8)
        {
            imageViewBody.setImageResource(R.drawable.body9);
        }

        if(bodyChoice == 9)
        {
            imageViewBody.setImageResource(R.drawable.body10);
        }

        if(bodyChoice == 10)
        {
            imageViewBody.setImageResource(R.drawable.body11);
        }

        if(bodyChoice == 11)
        {
            imageViewBody.setImageResource(R.drawable.body12);
        }

        if(legChoice == 0)
        {
            imageViewLegs.setImageResource(R.drawable.legs1);
        }

        if(legChoice == 1)
        {
            imageViewLegs.setImageResource(R.drawable.legs2);
        }

        if(legChoice == 2)
        {
            imageViewLegs.setImageResource(R.drawable.legs3);
        }

        if(legChoice == 3)
        {
            imageViewLegs.setImageResource(R.drawable.legs4);
        }

        if(legChoice == 4)
        {
            imageViewLegs.setImageResource(R.drawable.legs5);
        }

        if(legChoice == 5)
        {
            imageViewLegs.setImageResource(R.drawable.legs6);
        }

        if(legChoice == 6)
        {
            imageViewLegs.setImageResource(R.drawable.legs7);
        }

        if(legChoice == 7)
        {
            imageViewLegs.setImageResource(R.drawable.legs8);
        }

        if(legChoice == 8)
        {
            imageViewLegs.setImageResource(R.drawable.legs9);
        }

        if(legChoice == 9)
        {
            imageViewLegs.setImageResource(R.drawable.legs10);
        }

        if(legChoice == 10)
        {
            imageViewLegs.setImageResource(R.drawable.legs11);
        }

        if(legChoice == 11)
        {
            imageViewLegs.setImageResource(R.drawable.legs12);
        }

        if(savedInstanceState != null)
        {

        }

        return view;
    }
}
