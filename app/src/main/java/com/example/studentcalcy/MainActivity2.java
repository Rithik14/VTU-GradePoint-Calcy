package com.example.studentcalcy;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    MaterialButton buttonsem1p,buttonsem1c,buttonsem3,buttonsem4,buttonsem5,buttonsem6,buttonsem7,buttonsem8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        assignId(buttonsem1p,R.id.button_sem1p);
        assignId(buttonsem1c,R.id.button_sem1c);
        assignId(buttonsem3,R.id.button_sem3);
        assignId(buttonsem4,R.id.button_sem4);
        assignId(buttonsem5,R.id.button_sem5);
        assignId(buttonsem6,R.id.button_sem6);
        assignId(buttonsem7,R.id.button_sem7);
        assignId(buttonsem8,R.id.button_sem8);
    }

    void assignId(MaterialButton btn,int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        MaterialButton button =(MaterialButton) view;
        String buttonText = button.getText().toString();
        Intent sem1p = new Intent(MainActivity2.this,MainActivity4.class);
        Intent sem1c = new Intent(MainActivity2.this,MainActivity5.class);
        Intent sem3 = new Intent(MainActivity2.this,MainActivity6.class);
        Intent sem4 = new Intent(MainActivity2.this,MainActivity7.class);
        Intent sem5 = new Intent(MainActivity2.this,MainActivity8.class);
        Intent sem6 = new Intent(MainActivity2.this,MainActivity9.class);
        Intent sem7 = new Intent(MainActivity2.this,MainActivity10.class);
        Intent sem8 = new Intent(MainActivity2.this,MainActivity11.class);

        if(buttonText.equals("1st and 2nd sem(Physics)")){
            startActivity(sem1p);
        }
        if(buttonText.equals("1st and 2nd sem(Chemistry)")){
            startActivity(sem1c);
        }
        if(buttonText.equals("3rd sem(All Branch)")){
            startActivity(sem3);
        }
        if(buttonText.equals("4th sem(All Branch)")){
            startActivity(sem4);
        }
        if(buttonText.equals("5th Sem(All Branch)")){
            startActivity(sem5);
        }
        if(buttonText.equals("6th Sem(All branch)")){
            startActivity(sem6);
        }
        if(buttonText.equals("7th Sem(ISE,CSE)")){
            startActivity(sem7);
        }
        if(buttonText.equals("8th Sem(All branch)")){
            startActivity(sem8);
        }
    }
}