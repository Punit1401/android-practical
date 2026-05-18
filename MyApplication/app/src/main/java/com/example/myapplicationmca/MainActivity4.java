package com.example.myapplicationmca;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {

    ListView list1;
    Spinner list2;
    AutoCompleteTextView autoComplete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);

        findViewById();
        body();
    }

    private void body() {

        String name[]={"Apple","Mango","Banana","Orange","Pineapple"};

        ArrayAdapter <String> ad = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,name);
        list1.setAdapter(ad);
        list2.setAdapter(ad);


        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String str = name[i];
                Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
            }
        });

        list2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String str = name[i];
                Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        String[] countryNameList = {"India","China","Russia","Japan","New Zeland","Indonesia","England"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,countryNameList);
        autoComplete.setAdapter(adapter);
    }

    private void findViewById() {

        list1 = findViewById(R.id.list1);
        list2 = findViewById(R.id.list2);
        autoComplete = findViewById(R.id.autoComplete);


    }
}