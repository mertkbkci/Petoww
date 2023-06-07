package com.camerba.petoww;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.camerba.petoww.Fragments.ProfileFragment;
import com.camerba.petoww.R;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;


import com.camerba.petoww.Fragments.HomeFragment;
import com.camerba.petoww.Fragments.NotificationFragment;
import com.camerba.petoww.Fragments.SearchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import static com.camerba.petoww.R.*;


public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private Fragment selectorFragment;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        bottomNavigationView = findViewById(id.bottom_navigation);
        bottomNavigationView.setOnItemSelectedListener((NavigationBarView.OnItemSelectedListener) this::onNavigationItemSelected);
        
    }

    private boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case id.nav_home:
                selectorFragment = new HomeFragment();
                break;
            case id.nav_search:
                selectorFragment = new SearchFragment();
                break;
            case id.nav_add:
                selectorFragment = null;
                startActivity(new Intent(MainActivity.this, PostActivity.class));
                break;
            case id.nav_fav:
                selectorFragment = new NotificationFragment();
                break;
            case id.nav_person:
                selectorFragment = new ProfileFragment();
                break;

        }
        if (selectorFragment != null) {
            getSupportFragmentManager().beginTransaction().replace(id.fragment_container, selectorFragment).commit();
        }
    }
}