package com.example.tictactoe.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import com.example.tictactoe.Config;
import com.example.tictactoe.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class ThirdPage extends AppCompatActivity {

    String[] shayri_arr;
    TextView textView;
    Button b;
    int pos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);
        shayri_arr=getIntent().getStringArrayExtra("shayriarr");
        pos=getIntent().getIntExtra("pos",0);
        textView=findViewById(R.id.text);
        textView.setText(shayri_arr[pos]);

        b=findViewById(R.id.b);
        b.setOnClickListener(view -> {
            BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(this);
            View view1= LayoutInflater.from(this).inflate(R.layout.background,null);

            GridView gridView=view1.findViewById(R.id.grid);
            textView.setBackgroundColor(getResources().getColor(Config.colors[0]));

            bottomSheetDialog.setContentView(view1);
            bottomSheetDialog.show();
        });
    }
}