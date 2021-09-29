package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class weather_fragment extends Fragment implements WeatherAdapter.OnWeatherItemClickListener {

    private RecyclerView weatherRecyclerView;
    private WeatherAdapter weatherAdapter;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_weather,container,false);

        weatherRecyclerView=(RecyclerView)view.findViewById(R.id.weather_recyclerview);
        weatherRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        weatherRecyclerView.setHasFixedSize(true);

        ArrayList<Weather> weatherList = new ArrayList<Weather>();
        weatherList.add(new Weather("25 C","Yesterday","10/1/2001"));
        weatherList.add(new Weather("26 C","Today","11/1/2001"));
        weatherList.add(new Weather("27 C","Tomorrow","12/1/2001"));

        weatherAdapter=new WeatherAdapter(weatherList,this::onWeatherItemClick);
        weatherRecyclerView.setAdapter(weatherAdapter);


        return view;
    }

    @Override
    public void onWeatherItemClick(int position) {
        Intent intent = new Intent(getContext(),WeatherDetailActivity.class);
        startActivity(intent);
    }
}
