/*
* Copyright (C) 2017 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*  	http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.example.android.android_me.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.android.android_me.BodyFragment;
import com.example.android.android_me.HeadFragment;
import com.example.android.android_me.LegsFragment;
import com.example.android.android_me.R;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// This activity will display a custom Android image composed of three body parts: head, body, and legs
//https://www.youtube.com/watch?v=r6f7B7diM9w

public class AndroidMeActivity extends AppCompatActivity implements
        LegsFragment.OnFragmentInteractionLegsListener,
        HeadFragment.OnFragmentInteractionHeadListener,
BodyFragment.OnFragmentInteractionBodyListener{

    // == number of body part choices ==
    private int headChoice = 12;
    private int bodyChoice = 12;
    private int legsChoice = 12;

    // == put back in for random button ==
    //private Button btnRandom;
    // == put back in for random button ==

    // == the fragments displayed on the main activity

    private HeadFragment headFragment;
    private BodyFragment bodyFragment;
    private LegsFragment legsFragment;
    private DisplayingFragment displayingFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);

        // == below code is for a little green random button ==

        // == put back in for random button ==
        // == put back in for random button ==
//        btnRandom = (Button) findViewById(R.id.btnRandom);
//        btnRandom.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                headChoice = new Random().nextInt(13);
//                bodyChoice = new Random().nextInt(13);
//                legsChoice = new Random().nextInt(13);
//
//                //displayingFragment = DisplayingFragment.newInstance(headChoice, bodyChoice,legsChoice);
//
//                DisplayingFragment displayingFragment = DisplayingFragment.newInstance(headChoice, bodyChoice, legsChoice);
//                getSupportFragmentManager().beginTransaction().replace(R.id.displayContainer,displayingFragment).commit();
//
//            }
        ; // need }); to put it back in
        // == put back in for random button ==
        // == put back in for random button ==

        // == this is for rotation of the device ==
        if(savedInstanceState==null)
        {
            displayingFragment = DisplayingFragment.newInstance(headChoice, bodyChoice,legsChoice);

            Bundle displayBundle = new Bundle();
            displayingFragment.setArguments(displayBundle);
            DisplayingFragment displayingFragment = DisplayingFragment.newInstance(headChoice, bodyChoice, legsChoice);
            displayingFragment.setArguments(displayBundle);
            getSupportFragmentManager().beginTransaction().add(R.id.displayContainer,displayingFragment).commit();
        }

        // == this is for rotation of the device ==
        if(savedInstanceState == null)
        {

            headFragment = new HeadFragment();
            bodyFragment = new BodyFragment();
            legsFragment = new LegsFragment();

            Bundle bundlehead = new Bundle();
            headFragment.setArguments(bundlehead);
            Bundle bundlebody = new Bundle();
            bodyFragment.setArguments(bundlebody);
            Bundle bundleleg = new Bundle();
            legsFragment.setArguments(bundleleg);


            getSupportFragmentManager().beginTransaction().add(R.id.fragheadContainer,headFragment).commit();
            getSupportFragmentManager().beginTransaction().add(R.id.fragbodyContainer,bodyFragment).commit();
            getSupportFragmentManager().beginTransaction().add(R.id.fraglegContainer,legsFragment).commit();
        }



    }

    // == if the user clicks a new leg choice this updates the fragments ==
    @Override
    public void ChoiceLegs(int choice) {
        legsChoice = choice;
        //Toast.makeText(this, "choice is " + Integer.toString(choice), Toast.LENGTH_SHORT).show();

        DisplayingFragment displayingFragment = DisplayingFragment.newInstance(headChoice, bodyChoice, legsChoice);
        getSupportFragmentManager().beginTransaction().add(R.id.displayContainer,displayingFragment).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.displayContainer,displayingFragment).commit();
        displayingFragment = DisplayingFragment.newInstance(headChoice, bodyChoice,legsChoice);
        getSupportFragmentManager().beginTransaction().add(R.id.displayContainer,displayingFragment).commit();

    }

    // == if the user clicks a new body choice this updates the fragments ==
    @Override
    public void ChoiceBody(int choiceBody) {
        bodyChoice = choiceBody;
        //Toast.makeText(this, "choice is " + Integer.toString(choiceBody), Toast.LENGTH_SHORT).show();

        DisplayingFragment displayingFragment = DisplayingFragment.newInstance(headChoice, bodyChoice, legsChoice);
        getSupportFragmentManager().beginTransaction().add(R.id.displayContainer,displayingFragment).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.displayContainer,displayingFragment).commit();
        displayingFragment = DisplayingFragment.newInstance(headChoice, bodyChoice,legsChoice);
        getSupportFragmentManager().beginTransaction().add(R.id.displayContainer,displayingFragment).commit();
    }

    // == if the user clicks a new head choice this updates the fragments ==
    @Override
    public void ChoiceHead(int choiceHead) {
        headChoice = choiceHead;
        //Toast.makeText(this, "choice is " + Integer.toString(headChoice), Toast.LENGTH_SHORT).show();

        DisplayingFragment displayingFragment = DisplayingFragment.newInstance(headChoice, bodyChoice, legsChoice);
        getSupportFragmentManager().beginTransaction().add(R.id.displayContainer,displayingFragment).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.displayContainer,displayingFragment).commit();
        displayingFragment = DisplayingFragment.newInstance(headChoice, bodyChoice,legsChoice);
        getSupportFragmentManager().beginTransaction().add(R.id.displayContainer,displayingFragment).commit();
    }


    // == state information saved during rotation here ==
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        savedInstanceState.putInt("headc",headChoice);
        savedInstanceState.putInt("bodyc", bodyChoice);
        savedInstanceState.putInt("legc", legsChoice);

        super.onSaveInstanceState(savedInstanceState);
    }


    // == state information restored here after rotation ==
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {

        super.onRestoreInstanceState(savedInstanceState);
        headChoice = savedInstanceState.getInt("headc");
        bodyChoice = savedInstanceState.getInt("bodyc");
        legsChoice = savedInstanceState.getInt("legc");
    }
}

