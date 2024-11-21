package com.example.hotelmanagement;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

/** @noinspection ALL */
public class activitylogin extends AppCompatActivity {
    TextInputLayout username, password;
    Button login;
    TextView signup;
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
        signup = findViewById(R.id.reg_tab);
        error=findViewById(R.id.showError);
        progressDialog=new ProgressDialog(this);
        getSupportActionBar().hide();

      progressDialog.setTitle("notification");
      progressDialog.setMessage("Please! Wait ....");
      progressDialog.setCanceledOnTouchOutside(false);
      progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        signup.setOnClickListener(view -> {
            //navigate to register
            Intent intent = new Intent(activitylogin.this, registration.class);
            startActivity(intent);
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //call validation action

                validate();

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
