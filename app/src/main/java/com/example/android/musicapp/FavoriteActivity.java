package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FavoriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        //Find the View that shows the go to main screen button
        Button goToMainScreen = (Button) findViewById(R.id.go_to_main_screen_from_favorite_button);

        //Set a click listener on that View
        goToMainScreen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent goToMainScreenIntent = new Intent(FavoriteActivity.this, MainActivity.class);
                startActivity(goToMainScreenIntent);
            }
        });
    }
}
