package com.example.android.tourguide.Category;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.tourguide.R;
import com.example.android.tourguide.SubCategory;
import com.example.android.tourguide.SubCategoryAdapter;

import java.util.ArrayList;

public class CategoryStatues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category);
        // Create a list of Parks
        final ArrayList<SubCategory> category = new ArrayList<SubCategory>();
        category.add(new SubCategory(getString(R.string.adress_crystal_planet), getString(R.string.name_crystal_planet), R.drawable.image_crystal_planet));
        category.add(new SubCategory(getString(R.string.adress_the_burning_sculpture), getString(R.string.name_the_burning_sculpture), R.drawable.image_the_burning_sculpture));
        category.add(new SubCategory(getString(R.string.adress_waiting), getString(R.string.name_waiting), R.drawable.image_waiting));
        category.add(new SubCategory(getString(R.string.adress_train), getString(R.string.name_train), R.drawable.image_train));
        category.add(new SubCategory(getString(R.string.adress_wroclawianka), getString(R.string.name_wroclawianka), R.drawable.image_wroclawianka));
        category.add(new SubCategory(getString(R.string.adress_the_swordsman), getString(R.string.name_the_swordsman), R.drawable.image_the_swordsman));
        category.add(new SubCategory(getString(R.string.wroclaw_text_view), getString(R.string.name_dwarfs), R.drawable.image_dwarfs));

        // Create an {@link SubCategoryAdapter}, whose data source is a list of {@link category}s. The
        // adapter knows how to create list items for each item in the list.
        SubCategoryAdapter adapter = new SubCategoryAdapter(this, category, R.color.category_color);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_sub_category.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SubCategoryAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link SubCategory} in the list.
        listView.setAdapter(adapter);

    }
}
