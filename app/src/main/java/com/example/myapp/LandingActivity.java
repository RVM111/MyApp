package com.example.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class LandingActivity extends AppCompatActivity {


    private androidx.appcompat.widget.Toolbar toolbar;
    private TextView sectionNameTextView;
    private BottomNavigationView bottomNavigation;
    private BottomNavigationView.OnNavigationItemSelectedListener bottomNavListener;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        toolbar=(Toolbar) findViewById(R.id.landing_page_toolbar);

        sectionNameTextView=(TextView)findViewById(R.id.section_name_textview);

        bottomNavigation=(BottomNavigationView) findViewById(R.id.landing_page_bottom_nav_menu);

        toolbar.setVisibility(View.VISIBLE);
        sectionNameTextView.setText("News and Weather");
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new home_fragment()).commit();
        bottomNavListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( MenuItem item) {

                Fragment selectedFragment=null;
                switch (item.getItemId()){
                    case R.id.home_bottom_menu: toolbar.setVisibility(View.VISIBLE);
                                                selectedFragment=new home_fragment();
                                                sectionNameTextView.setText("News and Weather");
                        break;
                    case R.id.qr_bottom_menu:toolbar.setVisibility(View.VISIBLE);
                                             selectedFragment=new qr_fragment();
                                             sectionNameTextView.setText("Scanner and Maker");
                        break;
                    case R.id.profile_bottom_menu:  toolbar.setVisibility(View.GONE);
                                                    selectedFragment=new profile_fragment();

                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
                return true;
            }
        };

        bottomNavigation.setOnNavigationItemSelectedListener(bottomNavListener);


    }
}