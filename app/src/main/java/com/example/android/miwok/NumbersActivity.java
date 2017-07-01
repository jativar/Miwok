package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //TODO: Add words here
        //Create an array of words
        String[] words = {"one", "two", "three", "four", "five",
                            "six", "seven", "eight", "nine", "ten"};
        Log.v("NumbersActivity", "Word at index 0: " + words[0]);
        Log.v("NumbersActivity", "Word at index 1: " + words[1]);
        Log.v("NumbersActivity", "Word at index 2: " + words[2]);
        Log.v("NumbersActivity", "Word at index 3: " + words[3]);
        Log.v("NumbersActivity", "Word at index 4: " + words[4]);
        Log.v("NumbersActivity", "Word at index 5: " + words[5]);
        Log.v("NumbersActivity", "Word at index 6: " + words[6]);
        Log.v("NumbersActivity", "Word at index 7: " + words[7]);
        Log.v("NumbersActivity", "Word at index 8: " + words[8]);
        Log.v("NumbersActivity", "Word at index 9: " + words[9]);


        //TODO: Create an ArrayList musicLibrary
        ArrayList<String> musicLibrary = new ArrayList<String>();

        //TODO: Add elements in an ArrayList
        musicLibrary.add("Yellow Submarine");
        musicLibrary.add("Thriller");

        //TODO: Adds an element at a specific index
        musicLibrary.add(0,"Blue Suede Shoes");

        //TODO: Access elements in an ArrayList
        Log.v("NumberActivity", "access to element with index 0: " + musicLibrary.get(0));
        Log.v("NumberActivity", "access to element with index 1: " + musicLibrary.get(1));
        Log.v("NumberActivity", "access to element with index 2: " + musicLibrary.get(2));

        //TODO: Remove elememnts from an ArrayList
        musicLibrary.remove(2);

        //TODO: Get the ArrayList length or size
        int l;

        l = musicLibrary.size();
        Log.v("NumberActivity", "ArrayList length is: " + l);


    }
}
