package com.example.crime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

import static androidx.core.content.ContextCompat.startActivity;

public class Login extends AppCompatActivity {
    Button button, signup;
    TextInputLayout username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

                signup = findViewById(R.id.btn);
                signup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Login.this,SignUp.class);
                        startActivity(intent);
                    }
                });


                username = findViewById(R.id.user_name);
                password = findViewById(R.id.password);

                button = findViewById((R.id.button2));


                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Intent intent = new Intent(Login.this, Home.class);
                        // startActivity(intent);
                        if (!validatePassword() | !validateUsername()) {
                            return;
                        }

                        //get all the values
                        // String username = username.getEditText().getText().toString();
                        //String Password = password.getEditText().getText().toString();
                    }
                });


            }

            private Boolean validateUsername() {
                String val = username.getEditText().getText().toString();
                if (val.isEmpty()) {
                    username.setError("Field cannot be empty");
                    return false;
                } else {
                    username.setError(null);
                    username.setErrorEnabled(false);
                    return true;
                }
            }

            private Boolean validatePassword() {
                String val = password.getEditText().getText().toString();


                if (val.isEmpty()) {
                    password.setError("Field cannot be empty");
                    return false;
                } else {
                    password.setError(null);
                    password.setErrorEnabled(false);
                    return true;
                }
    }
}
