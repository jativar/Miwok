package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.max;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //TODO: Create an ArrayList words
        ArrayList<String> words = new ArrayList<String>();

        //TODO: Add elements in the ArrayList words
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        // Create a variable index to keep track of the current index position
        int maxElementsInWords = 0;

        maxElementsInWords = words.size();



        //TODO: For loop implementation
        for (int index = 0; index < maxElementsInWords; index++){
            // Create a new {@link TextView} that displayed the word at
            // and add the View as a child to the rootView
            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);

            Log.v("NumbersActivity", "Index: " + index + " Value: " + words.get(index));

        }

    }
}
