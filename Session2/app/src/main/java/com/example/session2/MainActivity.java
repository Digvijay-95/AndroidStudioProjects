package com.example.session2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login, register;
    EditText mail,pass;
    DB db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.log);
        register = findViewById(R.id.reg);
        mail = findViewById(R.id.mail);
        pass = findViewById(R.id.pass);
        db = new DB(MainActivity.this);


        // Registeration
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = mail.getText().toString();
                String password = pass.getText().toString();
                db.InsertRecord(email,password);
                Toast.makeText(MainActivity.this,"REGISTRED!",Toast.LENGTH_SHORT).show();
            }
        });

        // LogIn
        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int flag = 0;

                Cursor cursor = db.selectRecord();
                String Email = mail.getText().toString();
                String Password = pass.getText().toString();
                if(cursor !=null){
                    while(cursor.moveToNext()){
                        if(Email.equals(cursor.getString(0))  && Password.equals(cursor.getString(1))){
                            flag =1;
                            Toast.makeText(getApplicationContext(),"LOGIN SUCCESSFUL",Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(MainActivity.this, home.class);
                            startActivity(intent);
                            break;
                        }
                    }

                }
                if(flag == 0){
                    Toast.makeText(getApplicationContext(),"LOGIN FAILED!",Toast.LENGTH_LONG).show();

                }
            }
        });







    }

}