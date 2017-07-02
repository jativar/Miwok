package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import com.example.android.miwok.R;

import java.util.ArrayList;

import static com.example.android.miwok.R.id.gridview;


public class HideAndSeekActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hide_and_seek);

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

        //TODO: Create an {@link Array Adapter}
        //NB: Spinner, ListView and GridView follow similar concept when used with ArrayAdapter.
        //Whose data source is a list of String. The
        //adapter knows how to create layouts for each item in the list, using the
        //simple_list_item_1.xml layout resource defined in the Android framework.
        //This list item layout contains a single {@link TextView}, which the adapter will set
        //to display a single word.
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        //Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        //There should be a {@link ListView} with the view ID called list, which is declared in the
        //activity_numbers.xml layout file.
        //ListView listView = (ListView) findViewById(R.id.list);
        GridView gridView = (GridView) findViewById(gridview);

        //Make the {@link ListView} use the {@Link ArrayAdapter} we created above, so that the
        //{@link List View} will display list items for each word in the list of words.
        //Do this by calling the setAdapter method on the {@link ListView} object and pass in
        //1 argument, which is the {@link Array Adapter} with the variable name itemsAdapter.
        //listView.setAdapter(itemsAdapter);
        gridView.setAdapter(itemsAdapter);


    }
}
