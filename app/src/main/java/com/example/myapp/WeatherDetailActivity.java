package com.example.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;

public class WeatherDetailActivity extends AppCompatActivity {

    Toolbar weatherDetailToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_detail);

        weatherDetailToolbar=(Toolbar)findViewById(R.id.weather_detail_toolbar);

        weatherDetailToolbar.setOnMenuItemClickListener(this::onOptionsItemSelected);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.close_menu_item){
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}