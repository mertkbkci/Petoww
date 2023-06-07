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


    }


    }
