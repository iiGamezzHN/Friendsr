package com.example.cpuga.friendsr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Friend Aang = new Friend("Aang", "Airbender",getResources().getIdentifier("aang","drawable","android:drawable"));
        Friend Katara = new Friend("Katara", "Waterbender",getResources().getIdentifier("katara","drawable","android:drawable"));
        Friend Sokka = new Friend("Sokka", "Warrior",getResources().getIdentifier("sokka","drawable","android:drawable"));
        Friend Toph = new Friend("Toph", "Earthbender",getResources().getIdentifier("toph","drawable","android:drawable"));
        Friend Zuko = new Friend("Zuko", "Firebender",getResources().getIdentifier("zuko","drawable","android:drawable"));
        Friend Iroh = new Friend("Iroh", "Firebender",getResources().getIdentifier("iroh","drawable","android:drawable"));
        Friend Azula = new Friend("Azula", "Princess",getResources().getIdentifier("azula","drawable","android:drawable"));
        Friend Ozai = new Friend("Ozai", "Firelord",getResources().getIdentifier("ozai","drawable","android:drawable"));
        Friend Appa = new Friend("Appa", "Steed",getResources().getIdentifier("appa","drawable","android:drawable"));

    }

    ArrayList<Friend> friends = new ArrayList<>();

    FriendsAdapter adapter = new FriendsAdapter(this, R.layout.grid_item, friends);

}
