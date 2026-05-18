package com.example.myapplicationmca;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    TextView txt1,txt2,txt3,txt4,txt5,txtfirstname,txtlastname,txtmobile,txtemail,txtpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        findViewById();
        body();



    }

    private void body() {
        String fname,lname,mob,email,pass;
        fname = getIntent().getStringExtra("fname");
        lname = getIntent().getStringExtra("lname");
        mob = getIntent().getStringExtra("mob");
        email = getIntent().getStringExtra("email");
        pass = getIntent().getStringExtra("pass");

        txtfirstname.setText(fname);
        txtlastname.setText(lname);
        txtmobile.setText(mob);
        txtemail.setText(email);
        txtpassword.setText(pass);
    }

    private void findViewById() {
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        txtfirstname = findViewById(R.id.txtfirstname);
        txtlastname = findViewById(R.id.txtlastname);
        txtmobile = findViewById(R.id.txtmobile);
        txtemail = findViewById(R.id.txtemail);
        txtpassword = findViewById(R.id.txtpassword);

    }
}