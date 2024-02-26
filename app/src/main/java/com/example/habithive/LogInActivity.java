package com.example.habithive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LogInActivity extends AppCompatActivity {

    public static boolean validateLogIn(String userName, String passWord) {
    // Log-In Method
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }
}