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
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.nav_home) {
                    selectorFragment = new HomeFragment();
                }
                else if (item.getItemId() == R.id.nav_search) {
                    selectorFragment = new SearchFragment();
                }
                else if (item.getItemId() == R.id.nav_add) {
                    selectorFragment = null;
                }
                else if (item.getItemId() == R.id.nav_fav) {
                    selectorFragment = new NotificationFragment();
                }
                else if (item.getItemId() == R.id.nav_person) {
                    selectorFragment = new ProfileFragment();
                }

                if (selectorFragment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectorFragment).commit();
                }
                return true;
            }
        });


    }


    }
