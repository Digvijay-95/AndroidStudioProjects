package com.example.radiocheck;

import static com.example.radiocheck.R.id.cb1;
import static com.example.radiocheck.R.id.cb2;
import static com.example.radiocheck.R.id.cb3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    CheckBox c1,c2,c3 ;
    RadioGroup g;
    RadioButton r1,r2,r3;
    Button b1 , b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1 = findViewById(cb1);
        c2 = findViewById(R.id.cb2);
        c3 = findViewById(R.id.cb3);

        r1 = findViewById(R.id.rb1);
        r2 = findViewById(R.id.rb2);
        r3 = findViewById(R.id.rb3);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        g = findViewById(R.id.rg);
        b1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg=" ";
                if(c1.isChecked()){
                    msg = msg+" CPP";
                }
                if(c2.isChecked()){
                    msg = msg+" Java";
                }
                if(c3.isChecked()){
                    msg = msg+" Python";
                }

                Toast.makeText(MainActivity.this , msg ,Toast.LENGTH_LONG).show();

            }



        });





        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean checked;
                if (((MaterialButton) view).isChecked()) checked = true;
                else checked = false;
                String msg = " ";

                switch ( view.getId() ){

                    case cb1:
                        if(checked){
                            msg = msg +" Male";
                        }
                        break;
                    case cb2:
                        if(checked) {
                            msg = msg + "Female";
                        }
                        break;
                    case cb3:
                        if(checked){
                            msg = msg +" Other";
                        }
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + view.getId());
                }

                Toast.makeText(MainActivity.this , msg ,Toast.LENGTH_LONG).show();


            }
        });



    }
}