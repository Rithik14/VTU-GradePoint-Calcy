package com.example.studentcalcy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    EditText input1, input2, input3,input4, input5, input6,input7, input8;
    Button calculate;
    TextView output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        input4 = findViewById(R.id.input4);
        input5 = findViewById(R.id.input5);
        input6 = findViewById(R.id.input6);
        input7 = findViewById(R.id.input7);
        input8 = findViewById(R.id.input8);
        calculate = findViewById(R.id.calculate);
        output = findViewById(R.id.output);

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
                String inputText6 = input6.getText().toString();
                String inputText7 = input7.getText().toString();
                String inputText8 = input8.getText().toString();
                if (inputText1.isEmpty() || inputText2.isEmpty() || inputText3.isEmpty() || inputText4.isEmpty() || inputText5.isEmpty() || inputText6.isEmpty() || inputText7.isEmpty() || inputText8.isEmpty()) {
                    output.setText("Please enter numbers");
                } else {
                    float num1 = mark(Float.parseFloat(inputText1.trim()));
                    float num2 = mark(Float.parseFloat(inputText2.trim()));
                    float num3 = mark(Float.parseFloat(inputText3.trim()));
                    float num4 = mark(Float.parseFloat(inputText4.trim()));
                    float num5 = mark(Float.parseFloat(inputText5.trim()));
                    float num6 = mark(Float.parseFloat(inputText6.trim()));
                    float num7 = mark(Float.parseFloat(inputText7.trim()));
                    float num8 = mark(Float.parseFloat(inputText8.trim()));

                    int credit = 20;

                    num1 = (num1) * 4;
                    num2 = (num2) * 4;
                    num3 = (num3) * 3;
                    num4 = (num4) * 3;
                    num5 = (num5) * 3;
                    num6 = (num6) * 1;
                    num7 = (num7) * 1;
                    num8 = (num8) * 1;

                    float totalcredit = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8;
                    float sgpa = (totalcredit/credit);
                    double perc = (sgpa-0.75)*10;

                    output.setText("SGPA : " + sgpa + "  Percentage :" + String.format("%.2f",perc) +"%");
                }
            }



        });
    }
}
