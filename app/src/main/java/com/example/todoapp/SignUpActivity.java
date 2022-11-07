package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class SignUpActivity extends AppCompatActivity {
    EditText name, Email, password;
    MaterialButton signup;
    TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name = findViewById(R.id.name);
        Email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.logintxt);
        signup = findViewById(R.id.SignUp);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

      String  nameText= name.getText().toString();
                String  EmailText= name.getText().toString();
                String  PasswordText= name.getText().toString();

                if (nameText.isEmpty() || EmailText.isEmpty() || PasswordText.isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(SignUpActivity.this, MainActivity.class);

                    startActivity(intent);
                }
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this, MainActivity.class);

                startActivity(intent);
            }
        });
    }
}