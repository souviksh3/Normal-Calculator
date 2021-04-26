package com.example.demo_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.pm.ChangedPackages;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.textclassifier.ConversationActions;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText mEdt1;
    EditText mEdt2;
    TextView mRes;
    Button mBtn1;
    Button mBtn2;
    Button mBtn4;
    Button mBtn5,mBtn6;


    Double num1, num2, sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEdt1 = findViewById(R.id.nm1);
        mEdt2 = findViewById(R.id.nm2);
        mBtn1 = findViewById(R.id.btn1);
        mBtn2 = findViewById(R.id.btn2);
        mRes = findViewById(R.id.Vew3);
        mBtn4 = findViewById(R.id.btn4);
        mBtn5 = findViewById(R.id.btn5);
        mBtn6 = findViewById(R.id.btn6);


        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(mEdt1.getText().toString());
                num2 = Double.parseDouble(mEdt2.getText().toString());
                sum = num1 + num2;
                mRes.setText(Double.toString(sum));
            }
        });
        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(mEdt1.getText().toString());
                num2 = Double.parseDouble(mEdt2.getText().toString());
                sum = num1 - num2;
                mRes.setText(Double.toString(sum));
            }
        });
        mBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(mEdt1.getText().toString());
                num2 = Double.parseDouble(mEdt2.getText().toString());
                sum = num1 / num2;
                mRes.setText(Double.toString(sum));
            }
        });
        mBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(mEdt1.getText().toString());
                num2 = Double.parseDouble(mEdt2.getText().toString());
                sum = num1 * num2;
                mRes.setText(Double.toString(sum));
            }
        });
        mBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEdt1.setText(" ");
                mEdt2.setText("");
                mRes.setText("");
            }
        });

    }

}


