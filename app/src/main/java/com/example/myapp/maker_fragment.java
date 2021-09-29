package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

public class maker_fragment extends Fragment {

    EditText editText;
    Button makeQRButton;
    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_maker,container,false);

        editText=(EditText)view.findViewById(R.id.editText);
        makeQRButton=(Button)view.findViewById(R.id.make_qr_button);

        makeQRButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=editText.getText().toString().trim();
                Intent intent = new Intent(getContext(),GenerateQRCodeActivity.class);
                intent.putExtra("INPUT_TEXT",text);
                startActivity(intent);
            }
        });
        return view;
    }
}
