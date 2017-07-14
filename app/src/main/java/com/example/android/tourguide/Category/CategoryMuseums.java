package com.example.android.tourguide.Category;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.tourguide.R;
import com.example.android.tourguide.SubCategory;
import com.example.android.tourguide.SubCategoryAdapter;
import com.example.android.tourguide.SubCategoryMuseums.SubCategoryMuseums_Henryk_Tomaszewski_Theatre_Museum;
import com.example.android.tourguide.SubCategoryMuseums.SubCategoryMuseums_History_Centre_Zajezdnia;
import com.example.android.tourguide.SubCategoryMuseums.SubCategoryMuseums_MWW;
import com.example.android.tourguide.SubCategoryMuseums.SubCategoryMuseums_Pan_Tadeusz;
import com.example.android.tourguide.SubCategoryMuseums.SubCategoryMuseums_Pharmacy;
import com.example.android.tourguide.SubCategoryMuseums.SubCategoryMuseums_Royal_Palace;
import com.example.android.tourguide.SubCategoryMuseums.SubCategoryMuseums_The_Arsenal;

import java.util.ArrayList;

public class CategoryMuseums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category);

        // Create a list of Museums
        final ArrayList<SubCategory> category = new ArrayList<SubCategory>();
        category.add(new SubCategory(getString(R.string.wroclaw_text_view), getString(R.string.royal_palace_text_view), R.drawable.image_royal_place, R.drawable.icon_go));
        category.add(new SubCategory(getString(R.string.wroclaw_text_view), getString(R.string.henryk_tomaszewski_theatre_museum_text_view), R.drawable.image_henryk_tomaszewski, R.drawable.icon_go));
        category.add(new SubCategory(getString(R.string.wroclaw_text_view), getString(R.string.pan_tadeusz_text_view), R.drawable.image_pan_tadeusz, R.drawable.icon_go));
        category.add(new SubCategory(getString(R.string.wroclaw_text_view), getString(R.string.history_centre_zajezdnia_text_view), R.drawable.image_zajezdnia, R.drawable.icon_go));
        category.add(new SubCategory(getString(R.string.wroclaw_text_view), getString(R.string.mww_text_view), R.drawable.image_mww, R.drawable.icon_go));
        category.add(new SubCategory(getString(R.string.wroclaw_text_view), getString(R.string.museum_of_pharmacy_text_view), R.drawable.image_pharmacy, R.drawable.icon_go));
        category.add(new SubCategory(getString(R.string.wroclaw_text_view), getString(R.string.the_arsenal_text_view), R.drawable.image_the_arsenal, R.drawable.icon_go));

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

        // Moving from {@link ArrayList} ( position x ) to Activity (x)
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                if (position == 0) {
                    Intent RoyalPlace = new Intent(CategoryMuseums.this, SubCategoryMuseums_Royal_Palace.class);
                    startActivity(RoyalPlace);
                } else if (position == 1) {
                    Intent HenrykTomaszewski = new Intent(CategoryMuseums.this, SubCategoryMuseums_Henryk_Tomaszewski_Theatre_Museum.class);
                    startActivity(HenrykTomaszewski);
                } else if (position == 2) {
                    Intent PanTadeusz = new Intent(CategoryMuseums.this, SubCategoryMuseums_Pan_Tadeusz.class);
                    startActivity(PanTadeusz);
                } else if (position == 3) {
                    Intent Zajezdnia = new Intent(CategoryMuseums.this, SubCategoryMuseums_History_Centre_Zajezdnia.class);
                    startActivity(Zajezdnia);
                } else if (position == 4) {
                    Intent MWW = new Intent(CategoryMuseums.this, SubCategoryMuseums_MWW.class);
                    startActivity(MWW);
                } else if (position == 5) {
                    Intent Pharmacy = new Intent(CategoryMuseums.this, SubCategoryMuseums_Pharmacy.class);
                    startActivity(Pharmacy);
                } else if (position == 6) {
                    Intent Arsenal = new Intent(CategoryMuseums.this, SubCategoryMuseums_The_Arsenal.class);
                    startActivity(Arsenal);
                }
            }
        });
    }
}
