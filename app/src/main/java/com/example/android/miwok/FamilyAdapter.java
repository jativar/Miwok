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

        import static com.example.android.miwok.R.id.colors;

/**
 * Created by Belenchis on 03/07/2017.
 */

public class FamilyAdapter extends ArrayAdapter<Family> {
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_family,parent,false); // "R.layout.list_family" makes a reference to the file "list_family.xml" under the layout folder

        }

        Family currentFamily = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentFamily.getmMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentFamily.getmDefaultTranslation());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        iconView.setImageResource(currentFamily.getmImageResourceId());

        return listItemView;

        //return super.getView(position, convertView, parent);

    }

    public FamilyAdapter(Activity context, ArrayList<Family> family){
        super(context, 0, family);

    }
}
