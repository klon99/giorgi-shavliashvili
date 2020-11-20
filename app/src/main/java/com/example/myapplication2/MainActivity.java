package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void click (View view){
        EditText Model = (EditText)findViewById(R.id.editTextTextPersonName);
        EditText Manufacturer = (EditText)findViewById(R.id.editTextTextPersonName2);
        EditText doi = (EditText)findViewById(R.id.editTextTextPersonName3);

        if (Model.getText().toString().isEmpty() || Manufacturer.getText().toString().isEmpty() || doi.getText().toString().isEmpty()){
            Toast.makeText(this, "fill everything", Toast.LENGTH_SHORT).show();
        }
        else if (2020 - (Integer.parseInt(doi.getText().toString())) > 10){
            Toast.makeText(this, "Cannot be older than 10", Toast.LENGTH_SHORT).show();
            doi.setText("");
        }
        else if (2020 - (Integer.parseInt(doi.getText().toString())) < 1){
            Toast.makeText(this, "Can't be less than 1", Toast.LENGTH_SHORT).show();
            doi.setText("");
        }
        else {
            Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show();}
            car newcar = new car(Model.getText().toString(),Manufacturer.getText().toString(),Integer.parseInt(doi.getText().toString());
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}