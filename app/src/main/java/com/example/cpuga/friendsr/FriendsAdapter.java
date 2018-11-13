package com.example.cpuga.friendsr;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FriendsAdapter extends ArrayAdapter<Friend> {

    private ArrayList <Friend>  friends;

    public FriendsAdapter(Context context, int resource, ArrayList<Friend> friends) {
        super(context, resource, friends);
        this.friends = friends;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
        }

        Friend friend = getItem(position);

        TextView nameTextView = convertView.findViewById(R.id.name_textView);
        nameTextView.setText(friend.getName());

        ImageView imageView = convertView.findViewById(R.id.grid_image);
        imageView.setImageResource(friend.getDrawableId());


        return convertView;
    }
}