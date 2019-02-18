package com.example.home_work;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btOne, btTwo, btThree, btFour, btFive;
    Button btSix, btSeven, btEight, btNine, btZero;
    Button btPlus, btMinus, btMulti, btDivision, btEqual, btClear;
    TextView text;
    int operand1, operand2, flagAction;
    double result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btOne = (Button) findViewById(R.id.btOne);
        btTwo = (Button) findViewById(R.id.btTwo);
        btThree = (Button) findViewById(R.id.btThree);
        btFour = (Button) findViewById(R.id.btFour);
        btFive = (Button) findViewById(R.id.btFive);
        btSix = (Button) findViewById(R.id.btSix);
        btSeven = (Button) findViewById(R.id.btSeven);
        btEight = (Button) findViewById(R.id.btEight);
        btNine = (Button) findViewById(R.id.btNine);
        btZero = (Button) findViewById(R.id.btZero);
        btPlus = (Button) findViewById(R.id.btPlus);
        btMinus = (Button) findViewById(R.id.btMinus);
        btMulti = (Button) findViewById(R.id.btMulti);
        btDivision = (Button) findViewById(R.id.btDivision);
        btEqual = (Button) findViewById(R.id.btEqually);
        btClear = (Button) findViewById(R.id.btClear);
        text = (TextView) findViewById(R.id.textInput);

        btOne.setOnClickListener(this);
        btTwo.setOnClickListener(this);
        btThree.setOnClickListener(this);
        btFour.setOnClickListener(this);
        btFive.setOnClickListener(this);
        btSix.setOnClickListener(this);
        btSeven.setOnClickListener(this);
        btEight.setOnClickListener(this);
        btNine.setOnClickListener(this);
        btZero.setOnClickListener(this);
        btPlus.setOnClickListener(this);
        btMinus.setOnClickListener(this);
        btMulti.setOnClickListener(this);
        btDivision.setOnClickListener(this);
        btClear.setOnClickListener(this);
        btEqual.setOnClickListener(this);


        operand1 = 0;
        operand2 = 0;
        result = 0;
        flagAction = 0;
        text.setText(Integer.toString(operand1));
    }

    public void onClick(View v){
        switch(v.getId()) {

            case R.id.btOne:

                ClickNumber(1);

                break;

            case R.id.btTwo:

                ClickNumber(2);

                break;

            case R.id.btThree:

                ClickNumber(3);

                break;

            case R.id.btFour:

                ClickNumber(4);

                break;

            case R.id.btFive:

                ClickNumber(5);

                break;

            case R.id.btSix:

                ClickNumber(6);

                break;

            case R.id.btSeven:

                ClickNumber(7);

                break;

            case R.id.btEight:

                ClickNumber(8);

                break;

            case R.id.btNine:

                ClickNumber(9);

                break;

            case R.id.btZero:

                ClickNumber(0);

                break;

            case R.id.btPlus:

                if (flagAction == 0) flagAction = 1;

                break;

            case R.id.btMinus:

                if (flagAction == 0) flagAction = 2;

                break;

            case R.id.btMulti:

                if (flagAction == 0) flagAction = 3;

                break;

            case R.id.btDivision:

                if (flagAction == 0) flagAction = 4;

                break;
            case R.id.btEqually:

                switch(flagAction){

                    case 1:

                        result = operand1 + operand2;

                        break;

                    case 2:

                        result = operand1 - operand2;

                        break;

                    case 3:

                        result = operand1 * operand2;

                        break;

                    case 4:

                        result =(double) operand1 / (double) operand2;

                        break;

                    default:

                        Toast.makeText(this, "Операция не задана", Toast.LENGTH_LONG).show();

                }

                if(flagAction != 0){

                    text.setText(Double.toString(result));

                    operand1 = 0;

                    operand2 = 0;

                    result = 0;

                    flagAction = 0;

                }

                break;

            case R.id.btClear:

                operand1 = 0;

                operand2 = 0;

                result = 0;

                flagAction = 0;

                text.setText(Integer.toString(operand1));

                break;
        }
    }

    private void ClickNumber(int num){

        if(flagAction == 0){

            operand1 = operand1*10 + num;

            text.setText(Integer.toString(operand1));

        }else{

            operand2 = operand2*10 + num;

            text.setText(Integer.toString(operand2));

        }

    }
}
