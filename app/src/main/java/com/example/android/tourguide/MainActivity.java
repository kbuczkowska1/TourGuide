package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.tourguide.Category.CategoryAbout;
import com.example.android.tourguide.Category.CategoryMuseums;
import com.example.android.tourguide.Category.CategoryParks;
import com.example.android.tourguide.Category.CategoryPlaces;
import com.example.android.tourguide.Category.CategoryStatues;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the View that shows the places category
        TextView places = (TextView) findViewById(R.id.Places_text_view);

        // Set a click listener on that View
        places.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the places category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link category_places}
                Intent placesIntent = new Intent(MainActivity.this, CategoryPlaces.class);

                // Start the new activity
                startActivity(placesIntent);
            }
        });

        // Find the View that shows the museums category
        TextView museums = (TextView) findViewById(R.id.Museums_text_view);

        // Set a click listener on that View
        museums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the museums category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link category_museums}
                Intent museumsIntent = new Intent(MainActivity.this, CategoryMuseums.class);

                // Start the new activity
                startActivity(museumsIntent);
            }
        });

        // Find the View that shows the statues category
        TextView statue = (TextView) findViewById(R.id.Statues_text_view);

        // Set a click listener on that View
        statue.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the statues category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link category_statues}
                Intent statuesIntent = new Intent(MainActivity.this, CategoryStatues.class);

                // Start the new activity
                startActivity(statuesIntent);
            }
        });

        // Find the View that shows the about category
        TextView about = (TextView) findViewById(R.id.About_text_view);

        // Set a click listener on that View
        about.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the about category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link category_about}
                Intent statuesIntent = new Intent(MainActivity.this, CategoryAbout.class);

                // Start the new activity
                startActivity(statuesIntent);
            }
        });

        // Find the View that shows the parks category
        TextView parks = (TextView) findViewById(R.id.Parks_text_view);

        // Set a click listener on that View
        parks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the parks category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link category_parks}
                Intent parksIntent = new Intent(MainActivity.this, CategoryParks.class);

                // Start the new activity
                startActivity(parksIntent);
            }
        });
    }
}

