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
        return currentResult.toString();

    }

    // This function retrieves the currently displayed int
    public int getDisplayInt() {

        TextView result = (TextView) findViewById(R.id.result_text);
        CharSequence currentResult = result.getText();
        return Integer.parseInt(currentResult.toString());

    }

    // This function retrieves the currently displayed float
    public double getDisplayDouble() {

        TextView result = (TextView) findViewById(R.id.result_text);
        CharSequence currentResult = result.getText();
        return Double.parseDouble(currentResult.toString());

    }

    // This function clears all numbers on screen and operations
    public void buttonACPressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);
        operation = "";
        operationPressed = false;
        isDecimal = false;
        result.setText("0");
    }

    // This function performs the operation and stores the new result
    public void buttonEqualsPressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);

        if (operation.equals("+")) {
            String tmp = (String.valueOf(Double.parseDouble(stringTmpResult) + Double.parseDouble(getDisplayString())));
            if (tmp.substring(tmp.length() - 2, tmp.length()).equals(".0")) {
                tmp = tmp.substring(0, tmp.length() - 2);
                result.setText(String.valueOf(Integer.parseInt(tmp)));
            }
            else {
                isDecimal = true;
                result.setText(tmp);
            }
        }

        else if (operation.equals("-")) {
            String tmp = (String.valueOf(Double.parseDouble(stringTmpResult) - Double.parseDouble(getDisplayString())));
            if (tmp.substring(tmp.length() - 2, tmp.length()).equals(".0")) {
                tmp = tmp.substring(0, tmp.length() - 2);
                result.setText(String.valueOf(Integer.parseInt(tmp)));
            }
            else {
                isDecimal = true;
                result.setText(tmp);
            }

        }

        else if (operation.equals("*")) {
            String tmp = (String.valueOf(Double.parseDouble(stringTmpResult) * Double.parseDouble(getDisplayString())));
            if (tmp.substring(tmp.length() - 2, tmp.length()).equals(".0")) {
                tmp = tmp.substring(0, tmp.length() - 2);
                result.setText(String.valueOf(Integer.parseInt(tmp)));
            }
            else {
                isDecimal = true;
                result.setText(tmp);
            }

        }

        else if (operation.equals("/")) {
            String tmp = (String.valueOf(Double.parseDouble(stringTmpResult) / Double.parseDouble(getDisplayString())));
            if (tmp.substring(tmp.length() - 2, tmp.length()).equals(".0")) {
                tmp = tmp.substring(0, tmp.length() - 2);
                result.setText(String.valueOf(Integer.parseInt(tmp)));
            }
            else {
                isDecimal = true;
                result.setText(tmp);
            }

        }

        else if (operation.equals("%")) {
            String tmp = (String.valueOf(Double.parseDouble(stringTmpResult) % Double.parseDouble(getDisplayString())));
            if (tmp.substring(tmp.length() - 2, tmp.length()).equals(".0")) {
                tmp = tmp.substring(0, tmp.length() - 2);
                result.setText(String.valueOf(Integer.parseInt(tmp)));
            }
            else {
                isDecimal = true;
                result.setText(tmp);
            }
        }

        stringTmpResult = getDisplayString();
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

        if (operationPressed) {
            showAlert(view, "There is already an operation in place!");
        }
        else {
            stringTmpResult = getDisplayString();
            operation = "+";
            operationPressed = true;
            isDecimal = false;
        }

    }

    // This function stores the subtraction operation
    public void buttonMinusPressed(View view) {

        if (operationPressed) {
            showAlert(view, "There is already an operation in place!");
        }
        else {
            stringTmpResult = getDisplayString();
            operation = "-";
            operationPressed = true;
            isDecimal = false;
        }
    }

    // This function stores the multiplication operation
    public void buttonTimesPressed(View view) {

        if (operationPressed) {
            showAlert(view, "There is already an operation in place!");
        }
        else{
            stringTmpResult = getDisplayString();
            operation = "*";
            operationPressed = true;
            isDecimal = false;
        }

    }

    // This function stores the division operation
    public void buttonDivisionPressed(View view) {

        if (operationPressed) {
            showAlert(view, "There is already an operation in place!");
        }
        else {
            stringTmpResult = getDisplayString();
            operation = "/";
            operationPressed = true;
            isDecimal = false;
        }

    }

    // This function stores the modulus operation
    public void buttonModuloPressed(View view) {
        if (operationPressed) {
            showAlert(view, "There is already an operation in place!");
        }
        else {
            stringTmpResult = getDisplayString();
            operation = "%";
            operationPressed = true;
            isDecimal = false;
        }
    }

    // This function changes a postitive number to a negative number and vice versa
    public void buttonPlusMinusPressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(String.valueOf(Double.parseDouble(getDisplayString())));

    }

    // Checks if display is only zero
    public boolean isZero() {
        if (getDisplayString().equals("0")) {
            return true;
        }
        else {
            return false;
        }
    }

    // Checks if it should be printed as an int or as a float
    public String intOrFloat(String tmp) {
        if (tmp.substring(tmp.length() - 2, tmp.length()).equals(".0")) {
            return String.valueOf(Integer.parseInt(tmp.substring(0, tmp.length() - 2)));
        }
        else {
            return String.valueOf(Double.parseDouble(tmp.substring(0, tmp.length() - 2)));
        }
    }

    // This function takes the square root of a number
    public void buttonSquareRootPressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);

        String tmp = String.valueOf(Math.sqrt(Double.parseDouble(getDisplayString())));
        result.setText(intOrFloat(tmp));

    }

    // This function takes the sine of a number as long as it is given in degrees
    public void buttonSinePressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);

        if ((getDisplayInt() < -360 || getDisplayInt() > 360) || (getDisplayDouble() < -360.0 || getDisplayDouble() > 360.0)) {
            showAlert(view, "You need to input an angle between -360 and 360 degrees!");
        }

        else {
            result.setText(String.valueOf(Math.sin(Math.toRadians(Double.parseDouble(getDisplayString())))));
        }

    }

    // This function takes the cosine of a number as long as it is given in degrees
    public void buttonCosinePressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);

        if ((getDisplayInt() < -360 || getDisplayInt() > 360) || (getDisplayDouble() < -360.0 || getDisplayDouble() > 360.0)) {
            showAlert(view, "You need to input an angle between -360 and 360 degrees!");
        }

        else {
            result.setText(String.valueOf(Math.cos(Math.toRadians(Double.parseDouble(getDisplayString())))));
        }

    }

    // This function takes the hyperbolic tangent of a number
    public void buttonHyperbolicTangentPressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);

        if ((getDisplayInt() < -360 || getDisplayInt() > 360) || (getDisplayDouble() < -360.0 || getDisplayDouble() > 360.0)) {
            showAlert(view, "You need to input an angle between -360 and 360 degrees!");
        }

        else {
            result.setText(String.valueOf(Math.tanh(Math.toRadians(Double.parseDouble(getDisplayString())))));
        }

    }


    // This function adds a 0 to the currently displayed number
    public void buttonZeroPressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);

        if (operationPressed) {
            result.setText("0");
            operationPressed = false;
        }

        if (isZero()) {
            showAlert(view, "It is already zero!");
        }

        else {
            result.setText(getDisplayString() + "0");
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

        else {
            if (isZero()) {
                result.setText("1");
            }
            else {
                result.setText(getDisplayString() + "1");
            }
        }

    }

    // This function adds a 2 to the currently displayed number
    public void buttonTwoPressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);

        if (operationPressed) {
            result.setText("2");
            operationPressed = false;
        }

        else {
            if (isZero()) {
                result.setText("2");
            }
            else {
                result.setText(getDisplayString() + "2");
            }
        }

    }

    // This function adds a 3 to the currently displayed number
    public void buttonThreePressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);

        if (operationPressed) {
            result.setText("3");
            operationPressed = false;
        }

        else {
            if (isZero()) {
                result.setText("3");
            }
            else {
                result.setText(getDisplayString() + "3");
            }
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
            if (isZero()) {
                result.setText("4");
            }
            else {
                result.setText(getDisplayString() + "4");
            }
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
            if (isZero()) {
                result.setText("5");
            }
            else {
                result.setText(getDisplayString() + "5");
            }
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
            if (isZero()) {
                result.setText("6");
            }
            else {
                result.setText(getDisplayString() + "6");
            }
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
            if (isZero()) {
                result.setText("7");
            }
            else {
                result.setText(getDisplayString() + "8");
            }
        }

    }

    // This function adds an 8 to the currently displayed number
    public void buttonEightPressed(View view) {

        TextView result = (TextView) findViewById(R.id.result_text);

        if (operationPressed) {
            result.setText("8");
            operationPressed = false;
        }

        else {
            if (isZero()) {
                result.setText("8");
            }
            else {
                result.setText(getDisplayString() + "8");
            }
        }

    }

    // This function adds a 9 to the currently displayed number
    public void buttonNinePressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);

        if (operationPressed) {
            result.setText("9");
            operationPressed = false;
        }

        else {
            if (isZero()) {
                result.setText("9");
            }
            else {
                result.setText(getDisplayString() + "9");
            }
        }

    }
}
