package com.example.eval1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button red , green, blue , black;
    static int theme = R.style.Theme_Eval1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(theme);
        setContentView(R.layout.activity_main);

        red = findViewById(R.id.red);
//        green = findViewById(R.id.green);
        black = findViewById(R.id.black);
        blue = findViewById(R.id.blue);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeTheme(R.style.RED);
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeTheme(R.style.BLUE);
            }
        });
        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeTheme(R.style.BLACK);
            }
        });




    }
    public void changeTheme(int newtheme){
        theme = newtheme;
        recreate();
    }
}