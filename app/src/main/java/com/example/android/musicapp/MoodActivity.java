package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood);

        //Find the View that shows the go to playlists button
        Button goToPlaylists = (Button) findViewById(R.id.go_to_playlist_from_mood_button);

        //Set a click listener on that View
        goToPlaylists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPlaylistsIntent = new Intent(MoodActivity.this, PlaylistsActivity.class);
                startActivity(goToPlaylistsIntent);
            }
        });
    }
}
