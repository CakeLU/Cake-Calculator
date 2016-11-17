package com.example.ss2sa.cakescalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // This function adds a 6 to the currently displayed number
    public void buttonSixPressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);
        CharSequence currentResult = result.getText();
        String stringResult = currentResult.toString();
        int intResult = Integer.parseInt(stringResult);
        intResult *= 10;
        intResult += 6;
        stringResult = Integer.toString(intResult);
        result.setText(stringResult);

    }

    // This function adds a 7 to the currently displayed number
    public void buttonSevenPressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);
        CharSequence currentResult = result.getText();
        String stringResult = currentResult.toString();
        int intResult = Integer.parseInt(stringResult);
        intResult *= 10;
        intResult += 7;
        stringResult = Integer.toString(intResult);
        result.setText(stringResult);

    }

    // This function adds an 8 to the currently displayed number
    public void buttonEightPressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);
        CharSequence currentResult = result.getText();
        String stringResult = currentResult.toString();
        int intResult = Integer.parseInt(stringResult);
        intResult *= 10;
        intResult += 8;
        stringResult = Integer.toString(intResult);
        result.setText(stringResult);

    }
}
