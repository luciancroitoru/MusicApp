package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the View that shows the mood category
        TextView mood = (TextView) findViewById(R.id.category_mood);

        // Set a click listener on that View
        mood.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the mood View is clicked on.
            @Override
            public void onClick(View view) {
                Intent moodIntent = new Intent(MainActivity.this, MoodActivity.class);
                startActivity(moodIntent);
            }
        });

        // Find the View that shows the mood category
        TextView playlists = (TextView) findViewById(R.id.category_playlists);

        // Set a click listener on that View
        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the mood View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });

        // Find the View that shows the genre category
        TextView genre = (TextView) findViewById(R.id.category_genre);

        // Set a click listener on that View
        genre.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the genre View is clicked on.
            @Override
            public void onClick(View view) {
                Intent genreIntent = new Intent(MainActivity.this, GenreActivity.class);
                startActivity(genreIntent);
            }
        });

        //Find the View that shows the favorite category
        TextView favorite = (TextView) findViewById(R.id.category_favorites);

        //Set a click listener on that View
        favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favoriteIntent = new Intent(MainActivity.this, FavoriteActivity.class);
                startActivity(favoriteIntent);
            }
        });

        //Find the View that shows the now playing category
        TextView nowPlaying = (TextView) findViewById(R.id.view_song_button_main);

        //Set a click listener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });
    }

}
