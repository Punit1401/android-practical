package com.example.myapplicationmca;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txt1,txt2;
    Button btnclickme,btnsubmit;
    EditText edttxt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById();
        body();

    }

    private void body() {

        btnclickme.setOnClickListener(new View.OnClickListener() {
            @Override
//            explicite intent which direct us from internal screen only
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
            }
        });

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
//            implicite intent which direct us from one app to another app specifice screen
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.android.com/intl/en_in/"));
                startActivity(intent);
            }
        });

    }

    private void findViewById() {
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        btnclickme = findViewById(R.id.btnclickme);
        btnsubmit = findViewById(R.id.btnsubmit);
        edttxt1 = findViewById(R.id.edttxt1);
    }
}