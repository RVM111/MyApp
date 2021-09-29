package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowingScanTextActivity extends AppCompatActivity {

    ImageView closeButton;
    TextView scanTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showing_scan_text);

        closeButton=(ImageView) findViewById(R.id.showing_scan_text_close_imageView);
        scanTextView=(TextView) findViewById(R.id.showing_scan_text_textView);

        Intent intent=getIntent();
        if(intent!=null && intent.hasExtra("SCAN_TEXT")){
            scanTextView.setText(intent.getStringExtra("SCAN_TEXT"));
        }


        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

}