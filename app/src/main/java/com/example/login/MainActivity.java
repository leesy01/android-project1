package com.example.login;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity{

    private TextView login_email, login_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_email = findViewById(R.id.login_email);
        login_password = findViewById(R.id.login_password);

        Intent intent = getIntent();
        String userEmail = intent.getStringExtra("UserEmail");
        String userpass = intent.getStringExtra("userPass");

        login_email.setText(userEmail);
        login_password.setText(userpass);
    }
}
