package com.example.calculatorrabat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultDisplay;
    TextView inputDisplay;

    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonAdd;
    Button buttonSub;
    Button buttonMul;
    Button buttonDiv;
    Button buttonDot;
    Button buttonPower;
    Button buttonSqrt;
    Button buttonMod;
    Button buttonC;
    Button buttonEqual;

    ImageButton imgButtonDlt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputDisplay=(TextView) findViewById(R.id.input);
        resultDisplay=(TextView)findViewById(R.id.result);
        button0=(Button) findViewById(R.id.btn0);
        button1=(Button)findViewById(R.id.btn1);
        button2=(Button)findViewById(R.id.btn2);
        button3=(Button)findViewById(R.id.btn3);
        button4=(Button)findViewById(R.id.btn4);
        button5=(Button)findViewById(R.id.btn5);
        button6=(Button)findViewById(R.id.btn6);
        button7=(Button)findViewById(R.id.btn7);
        button8=(Button)findViewById(R.id.btn8);
        button9=(Button)findViewById(R.id.btn9);
        buttonDot=(Button)findViewById(R.id.dotbtn);
        buttonAdd=(Button)findViewById(R.id.addbtn);
        buttonSub=(Button)findViewById(R.id.subbtn);
        buttonDiv=(Button)findViewById(R.id.divbtn);
        buttonMul=(Button)findViewById(R.id.mulbtn);
        buttonEqual=(Button)findViewById(R.id.equalbtn);
        buttonMod=(Button)findViewById(R.id.modbtn);
        buttonPower=(Button)findViewById(R.id.powerbtn);
        buttonSqrt=(Button)findViewById(R.id.rootbtn);
        buttonC=(Button)findViewById(R.id.clearbtn);
        imgButtonDlt=(ImageButton) findViewById(R.id.dltbtn);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("0"));
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("1"));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("2"));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("3"));
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("4"));
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("5"));
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("6"));
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("7"));
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("8"));
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("9"));
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("+"));
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("-"));
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("*"));
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("/"));
            }
        });

        buttonPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("^"));
            }
        });

        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("%"));
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("."));
            }
        });

        buttonSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("Sqrt of "));
            }
        });

        imgButtonDlt.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                String clearAll = Controller.setOperation("clear");
                inputDisplay.setText(clearAll);
                resultDisplay.setText(clearAll);
                return true;
            }
        });

        imgButtonDlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(Controller.setOperation("delete"));
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String clearAll = Controller.setOperation("clear");
                inputDisplay.setText(clearAll);
                resultDisplay.setText(clearAll);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultDisplay.setText(Controller.setOperation("="));
            }
        });
    }
}
