package com.example.android.miwok;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.Adapter;
        import android.widget.ArrayAdapter;
        import android.widget.GridView;
        import android.widget.ListView;

        import java.util.ArrayList;

        import static com.example.android.miwok.R.id.colors;


public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        //TODO: Create an ArrayList colors
        ArrayList<Family> family = new ArrayList<Family>();

        //TODO: Add elements in the ArrayList family
        //words.add("one");
        family.add(new Family("father","әpә"));
        family.add(new Family("mother","әta"));
        family.add(new Family("son","angsi"));
        family.add(new Family("daughter","tune"));
        family.add(new Family("older brother","taachi"));
        family.add(new Family("younger brother","chalitti"));
        family.add(new Family("older sister","tete"));
        family.add(new Family("younger sister","kolliti"));
        family.add(new Family("grandmother","ama"));
        family.add(new Family("grandfather","paapa"));

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
        FamilyAdapter adapter = new FamilyAdapter(this, family);

        //Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        //There should be a {@link ListView} with the view ID called list, which is declared in the
        //activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        //Make the {@link ListView} use the {@Link ArrayAdapter} we created above, so that the
        //{@link List View} will display list items for each word in the list of words.
        //Do this by calling the setAdapter method on the {@link ListView} object and pass in
        //1 argument, which is the {@link Array Adapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);



    }
}
