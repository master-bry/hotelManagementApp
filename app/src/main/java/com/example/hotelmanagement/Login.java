package com.example.hotelmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

/** @noinspection ALL */
public class Login extends AppCompatActivity {
    TextView mvtoreg;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_activitylogin);
        login = findViewById(R.id.button_login);
        mvtoreg = findViewById(R.id.mvregister);
        mvtoreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this, "Register", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(Login.this, Registration.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this, "Login", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(Login.this, Home.class);
                startActivity(intent);
            }
        });
    }
}