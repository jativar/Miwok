package com.example.android.miwok;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.Adapter;
        import android.widget.ArrayAdapter;
        import android.widget.GridView;
        import android.widget.ListView;

        import java.util.ArrayList;

        import static com.example.android.miwok.R.id.colors;


public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases); // Make a reference to the file activity_phrases.xml under the folder layout

        //TODO: Create an ArrayList phrases
        ArrayList<Phrase> phrases = new ArrayList<Phrase>();

        //TODO: Add elements in the ArrayList colors
        //words.add("one");
        phrases.add(new Phrase("Where are you going?","minto wuksus"));
        phrases.add(new Phrase("What is your name?","tinnә oyaase'nә"));
        phrases.add(new Phrase("My name is...","oyaaset..."));
        phrases.add(new Phrase("How are you feeling?","michәksәs?"));
        phrases.add(new Phrase("I’m feeling good.","kuchi achit"));
        phrases.add(new Phrase("Are you coming?","әәnәs'aa?"));
        phrases.add(new Phrase("Yes, I’m coming.","әәnәm"));
        phrases.add(new Phrase("Let’s go.","yoowutis"));
        phrases.add(new Phrase("Come here.","әnni'nem"));


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
        PhraseAdapter adapter = new PhraseAdapter(this, phrases);

        //Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        //There should be a {@link ListView} with the view ID called list, which is declared in the
        //activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.category_phrases); // Make reference to the tag android:id="@+id/category_phrases" defined into the file activity_colors.xml

        //Make the {@link ListView} use the {@Link ArrayAdapter} we created above, so that the
        //{@link List View} will display list items for each word in the list of words.
        //Do this by calling the setAdapter method on the {@link ListView} object and pass in
        //1 argument, which is the {@link Array Adapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);



    }
}
