package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Belenchis on 03/07/2017.
 */

public class NumbersAdapter extends ArrayAdapter<Numbers>{
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_numbers,parent,false); // "R.layout.list_numbers" makes a reference to the file "list_numbers.xml" under the layout folder

        }

        Numbers currentNumber = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentNumber.getmMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentNumber.getmDefaultTranslation());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        iconView.setImageResource(currentNumber.getmImageResourceId());



        return listItemView;

        //return super.getView(position, convertView, parent);

    }

    public NumbersAdapter(Activity context, ArrayList<Numbers> numbers){
        super(context, 0, numbers);

    }
}
