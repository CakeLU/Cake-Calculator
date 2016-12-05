package com.example.ss2sa.cakescalculator;

import android.content.Intent;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
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

    static String operation = "";
    static boolean operationPressed = false;
    static boolean isDecimal = false;
    static String stringTmpResult = "";

    // This function will provide error messages to the user
    public void showAlert(View view, String alertMessage) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage(alertMessage).create();
        myAlert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        myAlert.setTitle("There was an error!");
        myAlert.setIcon(R.drawable.cakeicon);
        myAlert.show();
    }

    // This function retrieves the currently displayed text
    public String getDisplayString() {

        TextView result = (TextView) findViewById(R.id.result_text);
        CharSequence currentResult = result.getText();
        String stringResult = currentResult.toString();
        /*if (stringResult.substring(stringResult.length() - 1).equals(".")) {
            stringResult += "0";
        }*/
        return stringResult;

    }

    // This function clears all numbers on screen and operations
    public void buttonACPressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);
        operationPressed = false;
        isDecimal = false;
        result.setText("0");
    }

    // This function performs the operation and stores the new result
    public void buttonEqualsPressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);

        if (operation.equals("+")) {

            if (isDecimal) {
                double output = Double.parseDouble(stringTmpResult) + Double.parseDouble(getDisplayString());
                stringTmpResult = String.valueOf(output);
                result.setText(stringTmpResult);
            }

            else {
                int output = Integer.parseInt(stringTmpResult) + Integer.parseInt(getDisplayString());
                stringTmpResult = String.valueOf(output);
                result.setText(stringTmpResult);
            }

        }

        else if (operation.equals("-")) {

            if (isDecimal) {
                double output = Double.parseDouble(stringTmpResult) - Double.parseDouble(getDisplayString());
                stringTmpResult = String.valueOf(output);
                result.setText(stringTmpResult);
            }

            else {
                int output = Integer.parseInt(stringTmpResult) - Integer.parseInt(getDisplayString());
                stringTmpResult = String.valueOf(output);
                result.setText(stringTmpResult);
            }

        }

        else if (operation.equals("*")) {

            if (isDecimal) {
                double output = Double.parseDouble(stringTmpResult) * Double.parseDouble(getDisplayString());
                stringTmpResult = String.valueOf(output);
                result.setText(stringTmpResult);
            }

            else {
                int output = Integer.parseInt(stringTmpResult) * Integer.parseInt(getDisplayString());
                stringTmpResult = String.valueOf(output);
                result.setText(stringTmpResult);
            }

        }

        else if (operation.equals("/")) {

            if (isDecimal) {
                double output = Double.parseDouble(stringTmpResult) / Double.parseDouble(getDisplayString());
                stringTmpResult = String.valueOf(output);
                result.setText(stringTmpResult);
            }

            else {
                int output = Integer.parseInt(stringTmpResult) / Integer.parseInt(getDisplayString());
                stringTmpResult = String.valueOf(output);
                result.setText(stringTmpResult);
            }

        }

        else if (operation.equals("%")) {

            if (isDecimal) {
//                showAlert(view, "Cannot perform modulus with non-integer numbers");
            }

            else {
                int output = Integer.parseInt(stringTmpResult) + Integer.parseInt(getDisplayString());
                stringTmpResult = String.valueOf(output);
                result.setText(stringTmpResult);
            }

        }

        operation = "";
        operationPressed = false;

    }

    // This function adds a decimal point to the number
    public void buttonDecimalPressed(View view) {

        if (isDecimal) {
            showAlert(view, "This number already contains a decimal place.");
        }

        else {
            TextView result = (TextView) findViewById(R.id.result_text);
            result.setText(getDisplayString() + ".");
            isDecimal = true;
        }

    }


    // This function stores the addition operation
    public void buttonPlusPressed(View view) {

        stringTmpResult = getDisplayString();
        operation = "+";
        operationPressed = true;

    }

    // This function stores the subtraction operation
    public void buttonMinusPressed(View view) {

        stringTmpResult = getDisplayString();
        operation = "-";
        operationPressed = true;
    }

    // This function stores the multiplication operation
    public void buttonTimesPressed(View view) {

        stringTmpResult = getDisplayString();
        operation = "*";
        operationPressed = true;

    }

    // This function stores the division operation
    public void buttonDivisionPressed(View view) {

        stringTmpResult = getDisplayString();
        operation = "/";
        operationPressed = true;

    }

    // This function stores the modulus operation
    public void buttonModuloPressed(View view) {
        stringTmpResult = getDisplayString();
        operation = "%";
        operationPressed = true;
    }

    // This function changes a postitive number to a negative number and vice versa
    public void buttonPlusMinusPressed(View view) {
        showAlert(view, "This button has not been implemented yet!");
    }

    // This function adds a 0 to the currently displayed number
    public void buttonZeroPressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);

        if (operationPressed) {

            result.setText("0");
            operationPressed = false;
        }

        else if (isDecimal) {
            result.setText(getDisplayString() + "0");
        }

        else {
            String stringResult = getDisplayString();
            int intResult = Integer.parseInt(stringResult);
            intResult *= 10;
            result.setText(Integer.toString(intResult));
        }

    }

    // This function adds a 1 to the currently displayed number
    public void buttonOnePressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);

        // If an operation is in place, auto set to the number pressed
        if (operationPressed) {
            result.setText("1");
            operationPressed = false;
        }

        else if (isDecimal) {
            result.setText(getDisplayString() + "1");
        }

        else {
            String stringResult = getDisplayString();
            int intResult = Integer.parseInt(stringResult);
            intResult *= 10;
            intResult += 1;
            result.setText(Integer.toString(intResult));
        }

    }

    // This function adds a 2 to the currently displayed number
    public void buttonTwoPressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);

        if (operationPressed) {
            result.setText("2");
            operationPressed = false;
        }

        else if (isDecimal) {
            result.setText(getDisplayString() + "2");
        }

        else {
            String stringResult = getDisplayString();
            int intResult = Integer.parseInt(stringResult);
            intResult *= 10;
            intResult += 2;
            result.setText(Integer.toString(intResult));
        }

    }

    // This function adds a 3 to the currently displayed number
    public void buttonThreePressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);

        if (operationPressed) {
            result.setText("3");
            operationPressed = false;
        }

        else if (isDecimal) {
            result.setText(getDisplayString() + "3");
        }

        else {
            String stringResult = getDisplayString();
            int intResult = Integer.parseInt(stringResult);
            intResult *= 10;
            intResult += 3;
            result.setText(Integer.toString(intResult));
        }

    }

    // This function adds a 4 to the currently displayed number
    public void buttonFourPressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);

        if (operationPressed) {
            result.setText("4");
            operationPressed = false;
        }

        else {
            CharSequence currentResult = result.getText();
            String stringResult = currentResult.toString();
            int intResult = Integer.parseInt(stringResult);
            intResult *= 10;
            intResult += 4;
            stringResult = Integer.toString(intResult);
            result.setText(stringResult);
        }

    }

    // This function adds a 5 to the currently displayed number
    public void buttonFivePressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);

        if (operationPressed) {
            result.setText("5");
            operationPressed = false;
        }

        else {
            CharSequence currentResult = result.getText();
            String stringResult = currentResult.toString();
            int intResult = Integer.parseInt(stringResult);
            intResult *= 10;
            intResult += 5;
            stringResult = Integer.toString(intResult);
            result.setText(stringResult);
        }

    }

    // This function adds a 6 to the currently displayed number
    public void buttonSixPressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);

        if (operationPressed) {
            result.setText("6");
            operationPressed = false;
        }

        else {
            CharSequence currentResult = result.getText();
            String stringResult = currentResult.toString();
            int intResult = Integer.parseInt(stringResult);
            intResult *= 10;
            intResult += 6;
            stringResult = Integer.toString(intResult);
            result.setText(stringResult);
        }

    }

    // This function adds a 7 to the currently displayed number
    public void buttonSevenPressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);

        if (operationPressed) {
            result.setText("7");
            operationPressed = false;
        }

        else {
            CharSequence currentResult = result.getText();
            String stringResult = currentResult.toString();
            int intResult = Integer.parseInt(stringResult);
            intResult *= 10;
            intResult += 7;
            stringResult = Integer.toString(intResult);
            result.setText(stringResult);
        }

    }

    // This function adds an 8 to the currently displayed number
    public void buttonEightPressed(View view) {

        if (operationPressed) {
            TextView result = (TextView) findViewById(R.id.result_text);
            result.setText("8");
            operationPressed = false;
        }

        else {
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

    // This function adds a 9 to the currently displayed number
    public void buttonNinePressed(View view) {

        if (operationPressed) {
            TextView result = (TextView) findViewById(R.id.result_text);
            result.setText("9");
            operationPressed = false;
        }

        else {
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

    // This function switches to the second activity with the remaining functions available
    public void buttonMoreFunctionsPressed(View view) {
        Intent intent = new Intent(this, MoreFunctions.class);
        startActivity(intent);
    }
}
