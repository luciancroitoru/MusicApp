package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        //Find the View that shows the go to favorites button
        Button goToGenre = (Button) findViewById(R.id.go_to_genre_from_playlist_button);

        //Set a click listener on that View
        goToGenre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToGenreIntent = new Intent(PlaylistsActivity.this, GenreActivity.class);
                startActivity(goToGenreIntent);
            }
        });
    }
}