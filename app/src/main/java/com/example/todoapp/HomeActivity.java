package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;

import com.google.android.material.button.MaterialButton;

public class HomeActivity extends AppCompatActivity {
    DatePicker date;
    Button home, add, delete, back;
    MaterialButton complete, upcoming;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        date = findViewById(R.id.date);
        home = findViewById(R.id.Homebtn);
        add = findViewById(R.id.Add);
        delete = findViewById(R.id.delete);
        back = findViewById(R.id.exit);
        complete = findViewById(R.id.completed);
        upcoming = findViewById(R.id.upcong);


    }
}