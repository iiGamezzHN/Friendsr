package com.example.cpuga.friendsr;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    private final static String PREFS_NAME = "storage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        final Friend friend = (Friend) getIntent().getSerializableExtra("friend_key");

        final SharedPreferences.Editor editor = getSharedPreferences(PREFS_NAME, MODE_PRIVATE).edit();
        RatingBar ratingBar = findViewById(R.id.ratingBar);
        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        Float rating = prefs.getFloat("rating_" + friend.getName(), 0);
        ratingBar.setRating(rating);

        // Set image
        ImageView image = findViewById(R.id.profile_image);
        image.setImageResource(friend.getDrawableId());

        // Set name
        TextView name = findViewById(R.id.profile_name);
        String nameFinal = "Name: " + friend.getName();
        name.setText(nameFinal);

        // Set bio
        TextView bio = findViewById(R.id.profile_bio);
        String bioFinal = "Role: " + friend.getBio();
        bio.setText(bioFinal);


        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                editor.putFloat("rating_" + friend.getName(), rating);
                editor.apply();
            }
        });
    }
}
