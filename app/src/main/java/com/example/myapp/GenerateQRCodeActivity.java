package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class GenerateQRCodeActivity extends AppCompatActivity {

    TextView inputTextTextView;
    ImageView closeImageView;
    ImageView qrCodeImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_qrcode);

        inputTextTextView=(TextView) findViewById(R.id.input_text_textView);
        closeImageView=(ImageView) findViewById(R.id.generated_qrcode_close_imageView);
        qrCodeImageView=(ImageView) findViewById(R.id.generated_qr_code_imageView);

        Intent intent=getIntent();
        if(intent!=null && intent.hasExtra("INPUT_TEXT")){
            inputTextTextView.setText("Qr based on your Text : "+intent.getStringExtra("INPUT_TEXT"));
        }

        closeImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //generate qr code for input text and set that in qrCodeImageView.
    }
}