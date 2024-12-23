package com.example.hotelmanagement;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Registration extends AppCompatActivity {

    Button mvtolog;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registration);

         mvtolog = findViewById(R.id.mvlogin);
         mvtolog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Registration.this, "Login", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(Registration.this, Login.class);
                startActivity(intent);
            }

        });

    }
    }