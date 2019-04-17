package com.example.BenMFirstAppAddition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText firstNumEditText, secondNumEditText;
TextView resultTextView;

    public void setNum() {
         firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
         secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
         resultTextView = (TextView) findViewById(R.id.resultTextView);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setNum();


                resultTextView.setText((getNumberOne(firstNumEditText) + getNumberTwo(secondNumEditText)) + "");
            }
        });
        Button subBtn = (Button) findViewById(R.id.subBtn);
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNum();

                resultTextView.setText((getNumberOne(firstNumEditText) - getNumberTwo(secondNumEditText)) + "");
            }
        });
        Button multBtn = (Button) findViewById(R.id.multBtn);
        multBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNum();

                resultTextView.setText((getNumberOne(firstNumEditText) * getNumberTwo(secondNumEditText)) + "");
            }
        });
        Button divBtn = (Button) findViewById(R.id.divBtn);
        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNum();

                resultTextView.setText((getNumberOne(firstNumEditText) / getNumberTwo(secondNumEditText)) + "");


            }
        });
        Button powerBtn = (Button) findViewById(R.id.powerBtn);
        powerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNum();

                double result = Math.pow(getNumberOne(firstNumEditText), getNumberTwo(secondNumEditText));
                resultTextView.setText(result + "");

            }
        });
        Button clearBtn = (Button) findViewById(R.id.clearBtn);
        clearBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                setNum();

                String result = "Result";
                resultTextView.setText(result + "");
                firstNumEditText.setText("");
                secondNumEditText.setText("");

            }
        });

    }

    private double getNumberOne(EditText num1) {
        return Double.parseDouble(num1.getText().toString());
    }
    private double getNumberTwo(EditText num2) {
        return Double.parseDouble(num2.getText().toString());
    }
}
