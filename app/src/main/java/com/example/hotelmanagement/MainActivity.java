package com.example.hotelmanagement;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    TextInputLayout username, password;
    Button login;
    Button mvetoreg;
    Button mvtolog;

    LinearLayout error;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_activitylogin);
        username = findViewById(R.id.userId);
        password = findViewById(R.id.userPass);
        login = findViewById(R.id.button_login);
        mvetoreg=findViewById(R.id.mvtoregister);
        mvetoreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, Registration.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //call validation action
                Intent intent= new Intent(MainActivity.this, Home.class);
                startActivity(intent);

            }
        });

        mvtolog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }

        });
    }
    public void validate(){
        if (username.getEditText().getText().toString().equals(" "))
        {
            username.setError("username is required!");
            errorDisplay("Enter Username");
        }
        else if(password.getEditText().getText( ).toString().equals(" ")){
            password.setError("password is required!");
            errorDisplay("Enter Password");
        }
        else {
            interData();
            progressDialog.show();
        }
    }
    void errorDisplay(String putError){
        Snackbar.make(error, putError,Snackbar.LENGTH_SHORT).show();

    }
    void interData(){

    }

}
