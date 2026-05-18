package com.example.myapplicationmca;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity5 extends AppCompatActivity {

ToggleButton tog;
TextView torch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);

        findViewById();
        body();
    }

    private void body() {

        tog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tog.isChecked()) {
                    // on below line we are setting message for
                    // status text view if toggle button is checked.
                    torch.setText("Torch is On");
                } else {
                    // on below line we are setting message
                    // for status text view if toggle button is un checked.
                    torch.setText("Torch is off");
                }
            }
        });


    }

    private void findViewById() {
        tog = findViewById(R.id.tog);
        torch = findViewById(R.id.torch);
    }
}