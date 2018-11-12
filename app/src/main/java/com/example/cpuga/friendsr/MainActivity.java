package com.example.cpuga.friendsr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Friend Aang = new Friend("Aang", "Airbender",getResources().getIdentifier("Aang","drawable","android:drawable"));
        Friend Katara = new Friend("Katara", "Waterbender",getResources().getIdentifier("Katara","drawable","android:drawable"));
        Friend Sokka = new Friend("Sokka", "Warrior",getResources().getIdentifier("Sokka","drawable","android:drawable"));
        Friend Toph = new Friend("Toph", "Earthbender",getResources().getIdentifier("Toph","drawable","android:drawable"));
        Friend Zuko = new Friend("Zuko", "Firebender",getResources().getIdentifier("Zuko","drawable","android:drawable"));
        Friend Iroh = new Friend("Iroh", "Firebender",getResources().getIdentifier("Iroh","drawable","android:drawable"));
        Friend Azula = new Friend("Azula", "Princess",getResources().getIdentifier("Azula","drawable","android:drawable"));
        Friend Ozai = new Friend("Ozai", "Firelord",getResources().getIdentifier("Firelord","drawable","android:drawable"));
        Friend Appa = new Friend("Appa", "Steed",getResources().getIdentifier("Appa","drawable","android:drawable"));
    }

    ArrayList<Friend> friends = new ArrayList<>();
}
