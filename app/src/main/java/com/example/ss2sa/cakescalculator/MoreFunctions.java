package com.example.ss2sa.cakescalculator;

import android.content.Intent;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MoreFunctions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_functions);

    }

    // This function takes the square root of the currently displayed number
    /*public void buttonSquareRootPressed(View view) {

    }*/

    // This function returns to the original functions display
    public void buttonMoreFunctionsPressed2(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
