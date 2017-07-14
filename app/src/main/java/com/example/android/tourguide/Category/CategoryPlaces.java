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
import com.example.android.tourguide.SubCategoryPlaces.SubCategoryPlaces_Centennial_Hall;
import com.example.android.tourguide.SubCategoryPlaces.SubCategoryPlaces_Market;
import com.example.android.tourguide.SubCategoryPlaces.SubCategoryPlaces_Ostrow_Tumski;
import com.example.android.tourguide.SubCategoryPlaces.SubCategoryPlaces_Panorama_Raclawicka;
import com.example.android.tourguide.SubCategoryPlaces.SubCategoryPlaces_sts_Mary_M;
import com.example.android.tourguide.SubCategoryPlaces.SubCategoryPlaces_the_Four_Denominations_District;
import com.example.android.tourguide.SubCategoryPlaces.SubCategoryPlaces_university_of_wroclaw;

import java.util.ArrayList;

public class CategoryPlaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category);

        // Create a list of Places
        final ArrayList<SubCategory> category = new ArrayList<SubCategory>();
        category.add(new SubCategory(getString(R.string.wroclaw_text_view), getString(R.string.market_text_view), R.drawable.image_market, R.drawable.icon_go));
        category.add(new SubCategory(getString(R.string.wroclaw_text_view), getString(R.string.centennial_hall_text_view), R.drawable.image_hall_of_the_century, R.drawable.icon_go));
        category.add(new SubCategory(getString(R.string.wroclaw_text_view), getString(R.string.university_of_wroclaw_text_view), R.drawable.image_university_of_wroclaw, R.drawable.icon_go));
        category.add(new SubCategory(getString(R.string.wroclaw_text_view), getString(R.string.panorama_raclawicka_text_view), R.drawable.image_panorama_raclawicka, R.drawable.icon_go));
        category.add(new SubCategory(getString(R.string.wroclaw_text_view), getString(R.string.church_of_sts_mary_magdalene_text_view), R.drawable.image_sts_mary_m, R.drawable.icon_go));
        category.add(new SubCategory(getString(R.string.wroclaw_text_view), getString(R.string.ostrow_tumski_text_view), R.drawable.image_ostrow_tumski, R.drawable.icon_go));
        category.add(new SubCategory(getString(R.string.wroclaw_text_view), getString(R.string.the_four_denominations_district_text_view), R.drawable.image_the_four_d_d, R.drawable.icon_go));

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
                    Intent market = new Intent(CategoryPlaces.this, SubCategoryPlaces_Market.class);
                    startActivity(market);
                } else if (position == 1) {
                    Intent hallOfTheCentury = new Intent(CategoryPlaces.this, SubCategoryPlaces_Centennial_Hall.class);
                    startActivity(hallOfTheCentury);
                } else if (position == 2) {
                    Intent universityOfWroclaw = new Intent(CategoryPlaces.this, SubCategoryPlaces_university_of_wroclaw.class);
                    startActivity(universityOfWroclaw);
                } else if (position == 3) {
                    Intent panoramaRaclawicka = new Intent(CategoryPlaces.this, SubCategoryPlaces_Panorama_Raclawicka.class);
                    startActivity(panoramaRaclawicka);
                } else if (position == 4) {
                    Intent stsMaryM = new Intent(CategoryPlaces.this, SubCategoryPlaces_sts_Mary_M.class);
                    startActivity(stsMaryM);
                } else if (position == 5) {
                    Intent OstrowTumski = new Intent(CategoryPlaces.this, SubCategoryPlaces_Ostrow_Tumski.class);
                    startActivity(OstrowTumski);
                } else if (position == 6) {
                    Intent theFourDD = new Intent(CategoryPlaces.this, SubCategoryPlaces_the_Four_Denominations_District.class);
                    startActivity(theFourDD);
                }
            }
        });
    }
}
