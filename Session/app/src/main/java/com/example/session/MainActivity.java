package com.example.session;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login, register;
    EditText mail,pass;
    SharedPreferences SP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.log);
        register = findViewById(R.id.reg);
        mail = findViewById(R.id.mail);
        pass = findViewById(R.id.pass);



        // Registeration
        SP = getSharedPreferences("RIT",MODE_PRIVATE);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email , Password;
                Email = mail.getText().toString();
                Password = pass.getText().toString();

                SharedPreferences.Editor editor = SP.edit();
                editor.putString("EMAIL",Email);
                editor.putString("PASS",Password);
                editor.commit();

            }
        });

        // LogIn
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email = mail.getText().toString();
                String Password = pass.getText().toString();

                if(Email.equals(SP.getString("EMAIL",null)) && Password.equals(SP.getString("PASS",null))){
                    Toast.makeText(getApplicationContext() , "SUCCESSFULLY LOGGED IN",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent( MainActivity.this, home.class);
                    startActivity(intent);


                }else{
                    Toast.makeText(getApplicationContext() , "LOGIN FAILED",Toast.LENGTH_LONG).show();
                }


            }
        });







    }
}