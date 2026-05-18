package com.example.crud;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txtid,name,surname,age;
    EditText edt_id,edt_name,edt_surname,edt_age;
    Button insert,delete,update,view,viewall;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreat(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        findViewById();
        body();

    }
    public void showMessage(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }

    private void body() {

        db = openOrCreateDatabase("curd", Context.MODE_PRIVATE, null);
        String sql = "CREATE TABLE IF NOT EXISTS  demo(id VARCHAR,name VARCHAR,surname VARCHAR,age VARCHAR) ";
        db.execSQL(sql);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sql = "insert into demo (id,name,surname,age) values ('" + edt_id.getText() + "','" + edt_name.getText() + "','" + edt_surname.getText() + "','" + edt_age.getText() + "')";
                db.execSQL(sql);
                Toast.makeText(MainActivity.this, "Record inserted", Toast.LENGTH_LONG).show();
                edt_id.setText("");
                edt_name.setText("");
                edt_surname.setText("");
                edt_age.setText("");
            }
        });


        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sql = "delete from demo where id='" + edt_id.getText() + "'";
                db.execSQL(sql);
                Toast.makeText(MainActivity.this, "Record deleted", Toast.LENGTH_LONG).show();
                edt_id.setText("");
                edt_name.setText("");
                edt_surname.setText("");
                edt_age.setText("");
            }
        });

        view.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor c = db.rawQuery("SELECT * FROM demo WHERE id = '" + edt_id.getText() + "'", null);

                if (c.moveToFirst()) {
                    // Set values in EditTexts
                    edt_name.setText(c.getString(1));     // name
                    edt_surname.setText(c.getString(2));  // surname
                    edt_age.setText(c.getString(3));      // age
                    Toast.makeText(MainActivity.this, "Record Found", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "No record found with this ID", Toast.LENGTH_SHORT).show();
                    edt_name.setText("");
                    edt_surname.setText("");
                    edt_age.setText("");
                }

                c.close(); // Always close cursor

            }

        }));


        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sql = "update demo set name='"+edt_name.getText()+"',surname='"+edt_surname.getText()+"',age='"+edt_age.getText()+"' where id='"+edt_id.getText()+"'";
                db.execSQL(sql);
                edt_id.setText("");
                edt_name.setText("");
                edt_surname.setText("");
                edt_age.setText("");

            }
        });

        viewall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor c = db.rawQuery("SELECT * FROM demo", null);
                if (c.getCount() == 0)
                {
                    showMessage("Error", "No records found");
                    return;
                }

                StringBuffer buffer = new StringBuffer();
                while (c.moveToNext())
                {
                    buffer.append("Rollno: " + c.getString(0) + "\n");
                    buffer.append("Name: " + c.getString(1) + "\n");
                    buffer.append("Marks: " + c.getString(2) + "\n\n");
                }

                showMessage("Student Details", buffer.toString());
            }

        });


    }
    private void findViewById() {
        txtid = findViewById(R.id.txtid);
        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        age = findViewById(R.id.age);
        edt_id = findViewById(R.id.edt_id);
        edt_name = findViewById(R.id.edt_name);
        edt_surname = findViewById(R.id.edt_surname);
        edt_age = findViewById(R.id.edt_age);
        insert = findViewById(R.id.insert);
        delete = findViewById(R.id.delete);
        view = findViewById(R.id.view);
        update = findViewById(R.id.update);
        viewall = findViewById(R.id.viewall);






    }
}