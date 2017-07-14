package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SubCategoryAdapter extends ArrayAdapter<SubCategory> {

    //Resource ID for the background color for this list
    private int mColorResourceId;

    //Create a new {@link SubCategory} object.
    public SubCategoryAdapter(Context context, ArrayList<SubCategory> category, int colorResourceId) {
        super(context, 0, category);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the object located at this position in the list
        SubCategory currentSubCategory = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_text_view.
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentSubCategory.getmName());

        // Find the TextView in the list_item.xml layout with the ID descryption_text_view.
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentSubCategory.getmDescription());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentSubCategory.getImageResourceId());

        // Find the ImageView in the list_item.xml layout with the ID imageGo.
        ImageView imageViewGo = (ImageView) listItemView.findViewById(R.id.imageGo);
        // Check if an image is provided for this category or not
        if (currentSubCategory.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageViewGo.setImageResource(currentSubCategory.getImageResourceIdGo());
            // Make sure the view is visible
            imageViewGo.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageViewGo.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}