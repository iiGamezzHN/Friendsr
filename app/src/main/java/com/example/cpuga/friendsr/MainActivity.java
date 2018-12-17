package com.example.cpuga.friendsr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Friend> friends = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add friends to the ArrayList
        friends.add(new Friend("Aang", "Airbender", R.drawable.aang));
        friends.add(new Friend("Katara", "Waterbender", R.drawable.katara));
        friends.add(new Friend("Sokka", "Warrior", R.drawable.sokka));
        friends.add(new Friend("Toph", "Earthbender", R.drawable.toph));
        friends.add(new Friend("Zuko", "Firebender", R.drawable.zuko));
        friends.add(new Friend("Iroh", "Firebender", R.drawable.iroh));
        friends.add(new Friend("Azula", "Princess", R.drawable.azula));
        friends.add(new Friend("Ozai", "Firelord", R.drawable.ozai));
        friends.add(new Friend("Appa", "Steed", R.drawable.appa));

        FriendsAdapter adapter = new FriendsAdapter(this, R.layout.grid_item, friends);

        GridView gridView = findViewById(R.id.gridView);
        gridView.setAdapter(adapter);                                   // Set adapter to GridView
        gridView.setOnItemClickListener(new GridItemClickListener());   // Set listener to GridView
    }

    // Go to DetailActivity when clicking on a friend
    private class GridItemClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("friend_key", friends.get(position));
            startActivity(intent);
        }
    }

}
