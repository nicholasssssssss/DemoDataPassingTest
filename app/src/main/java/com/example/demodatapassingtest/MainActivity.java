package com.example.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnPassInteger;
    Button btnPassChar;
    TextView tvPassDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Event handling Step 2
        btnPassInteger = findViewById(R.id.buttonPassInteger);

        //Event handling Step 3
        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });

        btnPassChar =findViewById(R.id.buttonPassChar);

        btnPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                intent.putExtra("value", 'a');
                startActivity(intent);
            }
        });
        tvPassDouble =findViewById(R.id.buttonText);

        tvPassDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FourthActivity.class);
                intent.putExtra("value", 99.99);
                startActivity(intent);
            }
        });


    }
}

