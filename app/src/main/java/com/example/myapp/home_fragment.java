package com.example.myapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.tabs.TabLayout;

public class home_fragment extends Fragment {

    private TabLayout tabLayout;
    private FrameLayout fragmentContainer;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @org.jetbrains.annotations.NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        super.onCreate(savedInstanceState);

        tabLayout=(TabLayout) view.findViewById(R.id.home_tab_layout);
        fragmentContainer=(FrameLayout)view.findViewById(R.id.home_fragment_container);

        getChildFragmentManager().beginTransaction().replace(R.id.home_fragment_container, new news_fragment()).commit();


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            Fragment selectedFragment=null;
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch(tab.getPosition()){
                    case 0:
                        selectedFragment =new news_fragment();
                        break;
                    case 1:
                        selectedFragment =new weather_fragment();
                        break;
                }
                getChildFragmentManager().beginTransaction().replace(R.id.home_fragment_container, selectedFragment).commit();
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        return view;
    }


}
