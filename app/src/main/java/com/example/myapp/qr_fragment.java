package com.example.myapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.tabs.TabLayout;

import org.jetbrains.annotations.NotNull;

public class qr_fragment extends Fragment {

    private TabLayout tabLayout;
    private FrameLayout fragmentContainer;


    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_qr,container,false);

        tabLayout=(TabLayout) view.findViewById(R.id.qr_tab_layout);
        fragmentContainer=(FrameLayout)view.findViewById(R.id.qr_fragment_container);

        getChildFragmentManager().beginTransaction().replace(R.id.qr_fragment_container,new scanner_fragment()).commit();

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            Fragment selectedFragment=null;
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch(tab.getPosition()){
                    case 0:selectedFragment=new scanner_fragment();
                        break;
                    case 1:selectedFragment=new maker_fragment();
                        break;
                }

                getChildFragmentManager().beginTransaction().replace(R.id.qr_fragment_container,selectedFragment).commit();
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
