package org.westada.slopecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText xOneEditText, yOneEditText, xTwoEditText, yTwoEditText;
    TextView slopeTextView, interceptTextView;


    private double getXOne(EditText xOneEditText) {
        return Double.parseDouble(xOneEditText.getText().toString());
    }
    private double getYOne(EditText yOneEditText) {
        return Double.parseDouble(yOneEditText.getText().toString());
    }
    private double getXTwo(EditText xTwoEditText) {
        return Double.parseDouble(xTwoEditText.getText().toString());
    }
    private double getYTwo(EditText yTwoEditText) {
        return Double.parseDouble(yTwoEditText.getText().toString());
    }

    public void setValues() {
        xOneEditText = (EditText) findViewById(R.id.xOne);
        yOneEditText = (EditText) findViewById(R.id.yOne);
        xTwoEditText = (EditText) findViewById(R.id.xTwo);
        yTwoEditText = (EditText) findViewById(R.id.yTwo);
        slopeTextView = (TextView) findViewById(R.id.slopeTextView);
        interceptTextView = (TextView) findViewById(R.id.interceptTextView);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calcBtn = (Button) findViewById(R.id.calcBtn);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValues();
                double slope = (getYTwo(yTwoEditText) - getYOne(yOneEditText)) / (getXTwo(xTwoEditText) - getXOne(xOneEditText));
                slopeTextView.setText(slope + "");
                double intercept = (getYOne(yOneEditText) - slope * (getXOne(xOneEditText)));
                interceptTextView.setText("(0, " + intercept + ")");
            }
        });

    }

}