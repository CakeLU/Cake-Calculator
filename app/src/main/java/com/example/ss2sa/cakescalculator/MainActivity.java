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

    public void buttonPlusPressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);
        CharSequence currentResult = result.getText();
        String stringResult = currentResult.toString();
        stringResult = stringResult + "+";
        result.setText(stringResult);

    }

    // This function adds a 0 to the currently displayed number
    public void buttonZeroPressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);
        CharSequence currentResult = result.getText();
        String stringResult = currentResult.toString();
        int intResult = Integer.parseInt(stringResult);
        intResult *= 10;
        stringResult = Integer.toString(intResult);
        result.setText(stringResult);

    }

    // This function adds a 1 to the currently displayed number
    public void buttonOnePressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);
        CharSequence currentResult = result.getText();
        String stringResult = currentResult.toString();
        int intResult = Integer.parseInt(stringResult);
        intResult *= 10;
        intResult += 1;
        stringResult = Integer.toString(intResult);
        result.setText(stringResult);

    }

    // This function adds a 2 to the currently displayed number
    public void buttonTwoPressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);
        CharSequence currentResult = result.getText();
        String stringResult = currentResult.toString();
        int intResult = Integer.parseInt(stringResult);
        intResult *= 10;
        intResult += 2;
        stringResult = Integer.toString(intResult);
        result.setText(stringResult);

    }

    // This function adds a 3 to the currently displayed number
    public void buttonThreePressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);
        CharSequence currentResult = result.getText();
        String stringResult = currentResult.toString();
        int intResult = Integer.parseInt(stringResult);
        intResult *= 10;
        intResult += 3;
        stringResult = Integer.toString(intResult);
        result.setText(stringResult);

    }

    // This function adds a 4 to the currently displayed number
    public void buttonFourPressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);
        CharSequence currentResult = result.getText();
        String stringResult = currentResult.toString();
        int intResult = Integer.parseInt(stringResult);
        intResult *= 10;
        intResult += 4;
        stringResult = Integer.toString(intResult);
        result.setText(stringResult);

    }

    // This function adds a 5 to the currently displayed number
    public void buttonFivePressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);
        CharSequence currentResult = result.getText();
        String stringResult = currentResult.toString();
        int intResult = Integer.parseInt(stringResult);
        intResult *= 10;
        intResult += 5;
        stringResult = Integer.toString(intResult);
        result.setText(stringResult);

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

    // This function adds a 9 to the currently displayed number
    public void buttonNinePressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);
        CharSequence currentResult = result.getText();
        String stringResult = currentResult.toString();
        int intResult = Integer.parseInt(stringResult);
        intResult *= 10;
        intResult += 9;
        stringResult = Integer.toString(intResult);
        result.setText(stringResult);

    }
}
