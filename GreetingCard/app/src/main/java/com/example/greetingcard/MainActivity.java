package com.example.greetingcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.submitValue);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editTextTextPersonName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "CLICKED",Toast.LENGTH_LONG).show();
                String s = editText.getText().toString();
                int a =Integer.parseInt(s);
                double pound = 2.205 * a;
                textView.setText("The correspoding value in Pound is"+pound);
            }
        });

    }

}