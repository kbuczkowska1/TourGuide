package com.example.android.tourguide.Category;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.tourguide.R;
import com.example.android.tourguide.SubCategory;
import com.example.android.tourguide.SubCategoryAdapter;

import java.util.ArrayList;

public class CategoryParks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category);

        // Create a list of Parks
        final ArrayList<SubCategory> category = new ArrayList<SubCategory>();
        category.add(new SubCategory(getString(R.string.szczytnicki_text_description), getString(R.string.park_text_name), R.drawable.image_park_szczytnicki));
        category.add(new SubCategory(getString(R.string.wschodni_text_description), getString(R.string.park_text_name), R.drawable.image_park_wschodni));
        category.add(new SubCategory(getString(R.string.grabiszynski_text_description), getString(R.string.park_text_name), R.drawable.image_park_grabiszynski));
        category.add(new SubCategory(getString(R.string.poludniowy_text_description), getString(R.string.park_text_name), R.drawable.image_park_poludniowy));
        category.add(new SubCategory(getString(R.string.brochowski_text_description), getString(R.string.park_text_name), R.drawable.image_park_brochowski));
        category.add(new SubCategory(getString(R.string.zachodni_text_description), getString(R.string.park_text_name), R.drawable.image_park_zachodni));
        category.add(new SubCategory(getString(R.string.skowroni_text_description), getString(R.string.park_text_name), R.drawable.image_park_skowroni));
        category.add(new SubCategory(getString(R.string.lesnica_text_description), getString(R.string.park_text_name), R.drawable.image_park_lesnica));
        category.add(new SubCategory(getString(R.string.g_w_andersa_text_description), getString(R.string.park_text_name), R.drawable.image_park_g_w_andersa));

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
