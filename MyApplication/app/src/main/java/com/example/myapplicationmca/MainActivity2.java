package com.example.myapplicationmca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    TextView txt1,txt2,txt3,txt4,txt5;
    EditText edttxt1,edttxt2,edttxt3,edttxt4,edttxt5;
    Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        findViewById();
        body();
    }

    private void body() {

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String firstname,lastname,email,password,mobile;
                firstname = edttxt1.getText().toString().trim();
                lastname = edttxt2.getText().toString().trim();
                email = edttxt4.getText().toString().trim();
                password = edttxt5.getText().toString().trim();
                mobile = edttxt3.getText().toString().trim();


                Toast.makeText(getApplicationContext(), "Data Submited", Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity2.this,MainActivity3.class);
                i.putExtra("fname",firstname);
                i.putExtra("lname",lastname);
                i.putExtra("mob",mobile);
                i.putExtra("email",email);
                i.putExtra("pass",password);
                startActivity(i);


            }
        });

    }

    private void findViewById() {

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        edttxt1 = findViewById(R.id.edttxt1);
        edttxt2 = findViewById(R.id.edttxt2);
        edttxt3 = findViewById(R.id.edttxt3);
        edttxt4 = findViewById(R.id.edttxt4);
        edttxt5 = findViewById(R.id.edttxt5);
        btnsubmit = findViewById(R.id.btnsubmit);

    }
}