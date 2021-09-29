package com.example.myapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder> {

    private ArrayList<Weather> weatherList;
    private OnWeatherItemClickListener onWeatherItemClickListener;


    interface OnWeatherItemClickListener{
        void onWeatherItemClick(int position);
    }

    public WeatherAdapter(ArrayList<Weather> weatherList,OnWeatherItemClickListener onWeatherItemClickListener) {
        this.weatherList = weatherList;
        this.onWeatherItemClickListener=onWeatherItemClickListener;
    }

    @NonNull
    @NotNull
    @Override
    public WeatherViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_item_layout,parent,false);
        WeatherViewHolder holder =new WeatherViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull WeatherAdapter.WeatherViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return weatherList.size();
    }

    public class WeatherViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView temperature;
        TextView day;
        TextView date;
        public WeatherViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            temperature=(TextView) itemView.findViewById(R.id.temperature_textView);
            day=(TextView) itemView.findViewById(R.id.day_textView);
            date=(TextView) itemView.findViewById(R.id.date_textView);

            itemView.setOnClickListener(this::onClick);
        }

        public void bind(int position){
            day.setText(""+position);
        }

        @Override
        public void onClick(View v) {
            int currPosition=getAdapterPosition();
            onWeatherItemClickListener.onWeatherItemClick(currPosition);
        }
    }
}
