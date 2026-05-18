package com.example.myapplicationmca;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity6 extends AppCompatActivity {

    TextView cal,total;
    Button add,sub,mul,div;
    EditText num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main6);

        findViewById();
        body();

    }

    private void body() {
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1=num1.getText().toString();
                String number2=num2.getText().toString();
                float n1 = Float.parseFloat(number1);
                float n2 = Float.parseFloat(number2);
                Float sum=n1+n2;
                total.setText(String.valueOf(sum));

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1=num1.getText().toString();
                String number2=num2.getText().toString();
                float n1 = Float.parseFloat(number1);
                float n2 = Float.parseFloat(number2);
                Float sum=n1-n2;
                total.setText(String.valueOf(sum));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1=num1.getText().toString();
                String number2=num2.getText().toString();
                float n1 = Float.parseFloat(number1);
                float n2 = Float.parseFloat(number2);
                Float sum=n1*n2;
                total.setText(String.valueOf(sum));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1=num1.getText().toString();
                String number2=num2.getText().toString();
                float n1 = Float.parseFloat(number1);
                float n2 = Float.parseFloat(number2);
                Float sum=n1/n2;
                total.setText(String.valueOf(sum));
            }
        });
    }

    private void findViewById() {
        cal = findViewById(R.id.cal);
        total = findViewById(R.id.total);
        num1= findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
    }
}