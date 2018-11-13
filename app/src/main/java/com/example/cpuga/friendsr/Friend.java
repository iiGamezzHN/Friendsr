package com.example.cpuga.friendsr;

import android.support.annotation.NonNull;

import java.io.Serializable;

public class Friend implements Serializable {
    @NonNull private final String name, bio;
    private final int drawableId;
    private float rating;

    Friend(@NonNull String name, @NonNull String bio, int drawableId) {
        this.name = name;
        this.bio = bio;
        this.drawableId = drawableId;
    }

    @NonNull
    public String getName() {
        return name;
    }

    @NonNull
    public String getBio() {
        return bio;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
