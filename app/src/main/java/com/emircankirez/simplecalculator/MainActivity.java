package com.emircankirez.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtViewResult;
    EditText txtFirstNumber;
    EditText txtSecondNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtViewResult = findViewById(R.id.txtViewResult);
        txtFirstNumber = findViewById(R.id.txtFirstNumber);
        txtSecondNumber = findViewById(R.id.txtSecondNumber);
    }

    public void sum(View view){
        if(txtFirstNumber.getText().toString().matches("") || txtSecondNumber.getText().toString().matches("")){
            txtViewResult.setText("No number!");
        }else{
            int firstNumber = Integer.parseInt(txtFirstNumber.getText().toString());
            int secondNumber = Integer.parseInt(txtSecondNumber.getText().toString());
            int result = firstNumber + secondNumber;
            txtViewResult.setText("Result: " + result);
        }
    }

    public void sub(View view){
        if(txtFirstNumber.getText().toString().matches("") || txtSecondNumber.getText().toString().matches("")){
            txtViewResult.setText("No number!");
        }else{
            int firstNumber = Integer.parseInt(txtFirstNumber.getText().toString());
            int secondNumber = Integer.parseInt(txtSecondNumber.getText().toString());
            int result = firstNumber - secondNumber;
            txtViewResult.setText("Result: " + result);
        }
    }

    public void mul(View view){
        if(txtFirstNumber.getText().toString().matches("") || txtSecondNumber.getText().toString().matches("")){
            txtViewResult.setText("No number!");
        }else{
            int firstNumber = Integer.parseInt(txtFirstNumber.getText().toString());
            int secondNumber = Integer.parseInt(txtSecondNumber.getText().toString());
            int result = firstNumber * secondNumber;
            txtViewResult.setText("Result: " + result);
        }
    }

    public void div(View view){
        if(txtFirstNumber.getText().toString().matches("") || txtSecondNumber.getText().toString().matches("")){
            txtViewResult.setText("No number!");
        }else{
            int firstNumber = Integer.parseInt(txtFirstNumber.getText().toString());
            int secondNumber = Integer.parseInt(txtSecondNumber.getText().toString());
            if(firstNumber == 0){
                txtViewResult.setText("Unsolvable");
            }else{
                Float result = (float) firstNumber / secondNumber;
                txtViewResult.setText("Result: " + String.format("%.2f", result));
            }

        }
    }
}