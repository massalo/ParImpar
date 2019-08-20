package com.example.parouimpar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button decide;
    private TextView result1;
    private TextView result2;
    private TextView result3;
    private Button clear;
    private int results;
    private boolean resultsb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        decide = findViewById(R.id.btnDecide);
        result1 = findViewById(R.id.tvResult);
        result2 = findViewById(R.id.tvResult2);
        result3 = findViewById(R.id.tvResult3);
        Random r1 = new Random();
        Random r2 = new Random();
        Random r3 = new Random();
        final int rez1 = r1.nextInt(3 - 1) + 1;
        final int rez2 = r2.nextInt(3 - 1) + 1;
        final int rez3 = r3.nextInt(3 - 1) + 1;
        clear = findViewById(R.id.btnClear);
        decide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultsb) {
                    result1.setText(String.valueOf(rez1));
                    result2.setText(String.valueOf(rez2));
                    result3.setText(String.valueOf(rez3));
                } else {
                    Random r4 = new Random();
                    Random r5 = new Random();
                    Random r6 = new Random();
                    //calls random number where 3 is not included
                    final int rez4 = r4.nextInt(3 - 1) + 1;
                    final int rez5 = r5.nextInt(3 - 1) + 1;
                    final int rez6 = r6.nextInt(3 - 1) + 1;
                    result1.setText(String.valueOf(rez4));
                    result2.setText(String.valueOf(rez5));
                    result3.setText(String.valueOf(rez6));
                }
            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result1.setText("");
                result2.setText("");
                result3.setText("");
            }
        });

    }

    }
