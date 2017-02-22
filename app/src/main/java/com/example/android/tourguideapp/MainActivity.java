package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        TextView museums = (TextView) findViewById(R.id.museums);

        museums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent museumIntent = new Intent(MainActivity.this, MuseumActivity.class);

                startActivity(museumIntent);
            }
        });


        TextView nightlife = (TextView) findViewById(R.id.nightlife);

        nightlife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nightlifeIntent = new Intent(MainActivity.this, NightlifeActivity.class);

                startActivity(nightlifeIntent);
            }
        });

        TextView restaurants = (TextView) findViewById(R.id.restaurants);

        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantActivity.class);

                startActivity(restaurantsIntent);
            }
        });

        TextView sightseeings = (TextView) findViewById(R.id.sightseeings);

        sightseeings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sightseeingsIntent = new Intent(MainActivity.this, SightseeingActivity.class);

                startActivity(sightseeingsIntent);
            }
        });
    }
}
