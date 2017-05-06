package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        //Find the View that shows the go to favorites button
        Button goToFavorites = (Button) findViewById(R.id.go_to_favorites_button);

        //Set a click listener on that View
        goToFavorites.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent goToFavoritesIntent = new Intent(NowPlayingActivity.this, FavoriteActivity.class);
                startActivity(goToFavoritesIntent);
            }
        });
    }
}
