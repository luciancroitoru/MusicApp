package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GenreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        //Find the View that shows the go to favorite button
        Button goToFavorite = (Button) findViewById(R.id.go_to_favorite_from_genre_button);

        //Set a click listener on that View
        goToFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToFavoriteIntent = new Intent(GenreActivity.this, FavoriteActivity.class);
                startActivity(goToFavoriteIntent);
            }
        });
    }
}
