package com.example.cpuga.friendsr;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.List;

public class FriendsAdapter extends ArrayAdapter<Friend> {

    private ArrayList <Friend>  friends;

    public FriendsAdapter(Context context, int resource, ArrayList<Friend> objects) {
        super(context, resource, objects);
        friends = objects;
    }

    @androidx.annotation.NonNull
    @Override
    public View getView(int position, @androidx.annotation.Nullable View convertView, @androidx.annotation.NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
        }
        String name = friends.get(position).getName();
        String bio = friends.get(position).getBio();
        Drawable image = getContext().getDrawable(friends.get(position).getDrawableId());


        Log.d("checknaam","name is: "+name);

//        getContext().getDrawable(friends.get());

        return convertView;
    }
}