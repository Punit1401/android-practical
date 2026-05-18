package com.example.myapplicationandroid;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    TextView txt1;
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

    }
    @Override
    protected void onStart() {
        super.onStart();
        showToast("onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showToast("onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showToast("onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showToast("onStop called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showToast("onRestart called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToast("onDestroy called");
    }
}