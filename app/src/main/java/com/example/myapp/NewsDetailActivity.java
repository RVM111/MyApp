package com.example.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;

public class NewsDetailActivity extends AppCompatActivity {

    Toolbar newsDetailToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        newsDetailToolbar=(Toolbar)findViewById(R.id.news_detail_toolbar);
        newsDetailToolbar.setOnMenuItemClickListener(this::onOptionsItemSelected);
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