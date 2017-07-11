package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;


public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers); // Make a reference to the file activity_numbers.xml under the folder layout

        //TODO: Create an ArrayList words
        ArrayList<Numbers> numbers = new ArrayList<Numbers>();

        //TODO: Add elements in the ArrayList words
        //words.add("one");
        numbers.add(new Numbers("ONE","lutti", R.drawable.number_one));

        numbers.add(new Numbers("two","otiiko", R.drawable.number_two));
        numbers.add(new Numbers("three","tolookosu", R.drawable.number_three));
        numbers.add(new Numbers("four","oyyisa", R.drawable.number_four));
        numbers.add(new Numbers("five","massokka", R. drawable.number_five));
        numbers.add(new Numbers("six","temmokka", R.drawable.number_six));
        numbers.add(new Numbers("seven","kenekaku", R.drawable.number_seven));
        numbers.add(new Numbers("eight","kawinta", R.drawable.number_eight));
        numbers.add(new Numbers("nine","wo'e", R.drawable.number_nine));
        numbers.add(new Numbers("ten","na'aacha", R.drawable.number_ten));

        //TODO: WHEN TO CREATE A CUSTOM CLASS?
        /* Create the Word class for the Miwok app, so we can show a list
        of English and Miwok words on the screen for the numbers 1-10.
        The Word object should contain as data type 2 String variables. One for
        English Translation, and one for the Miwok translation of the same word.
        The methods that should have are miwokTranslation "getMiwokTranslation()" and
        defaultTranslation "getDefaultTranslation()"
         */


        //TODO: Create an {@link Array Adapter}
        //NB: Spinner, ListView and GridView follow similar concept when used with ArrayAdapter.
        //Whose data source is a list of String. The
        //adapter knows how to create layouts for each item in the list, using the
        //simple_list_item_1.xml layout resource defined in the Android framework.
        //This list item layout contains a single {@link TextView}, which the adapter will set
        //to display a single word.
        NumbersAdapter adapter = new NumbersAdapter(this, numbers);

        //Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        //There should be a {@link ListView} with the view ID called list, which is declared in the
        //activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.category_numbers); // Make reference to the tag android:id="@+id/category_numbers" defined into the file activity_numbers.xml

        //Make the {@link ListView} use the {@Link ArrayAdapter} we created above, so that the
        //{@link List View} will display list items for each word in the list of words.
        //Do this by calling the setAdapter method on the {@link ListView} object and pass in
        //1 argument, which is the {@link Array Adapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);



    }
}
