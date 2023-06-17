package com.example.studentcalcy;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity11 extends AppCompatActivity {

    EditText input1, input2, input3,input4, input5;
    Button calculate;
    TextView output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);


        input1 = findViewById(R.id.input18);
        input2 = findViewById(R.id.input28);
        input3 = findViewById(R.id.input38);
        input4 = findViewById(R.id.input48);
        input5 = findViewById(R.id.input58);
        calculate = findViewById(R.id.calculate8);
        output = findViewById(R.id.output8);

        calculate.setOnClickListener(new View.OnClickListener() {

            int grades;
            int mark(float x){
                if (x <= 100) {
                    if (x >= 90) {
                        return grades = 10;
                    } else if (x >= 80) {
                        return grades = 9;
                    } else if (x >= 70) {
                        return grades = 8;
                    } else if (x >= 60) {
                        return grades = 7;
                    } else if (x >= 50) {
                        return grades = 6;
                    } else if (x >= 45) {
                        return grades = 5;
                    } else if (x >= 40) {
                        return grades = 4;
                    } else if (x < 40) {
                        return grades = 0;
                    } else {
                        return grades = 0;

                    }
                }
                return grades;
            }

            @Override
            public void onClick(View v) {
                String inputText1 = input1.getText().toString();
                String inputText2 = input2.getText().toString();
                String inputText3 = input3.getText().toString();
                String inputText4 = input4.getText().toString();
                String inputText5 = input5.getText().toString();
                if (inputText1.isEmpty() || inputText2.isEmpty() || inputText3.isEmpty() || inputText4.isEmpty() || inputText5.isEmpty()) {
                    output.setText("Please enter numbers");
                } else {
                    float num1 = mark(Float.parseFloat(inputText1.trim()));
                    float num2 = mark(Float.parseFloat(inputText2.trim()));
                    float num3 = mark(Float.parseFloat(inputText3.trim()));
                    float num4 = mark(Float.parseFloat(inputText4.trim()));
                    float num5 = mark(Float.parseFloat(inputText5.trim()));
                    int credit = 18;

                    num1 = (num1) * 3;
                    num2 = (num2) * 3;
                    num3 = (num3) * 8;
                    num4 = (num4) * 1;
                    num5 = (num5) * 3;


                    float totalcredit = num1 + num2 + num3 + num4 + num5 ;
                    float sgpa = (totalcredit/credit);
                    double perc = (sgpa-0.75)*10;
                    output.setText("SGPA : " + sgpa + "  Percentage :" + String.format("%.2f",perc) +"%");
                }
            }
        });
    }
}