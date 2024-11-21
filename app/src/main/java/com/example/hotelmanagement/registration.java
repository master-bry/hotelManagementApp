package com.example.hotelmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class registration extends AppCompatActivity {
TextView registering;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registration);
        registering =findViewById(R.id.logi_tab);
        registering.setOnClickListener(view -> {
            //navigate to register
            Intent intent = new Intent(registration.this,activitylogin.class);
            startActivity(intent);
        });
    }
}