package com.example.kalkulator1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    public static final String SHARED_PREFS = "shared_prefs";
    public static final String EMAIL_KEY = "email_key";
    public static final String PASSWORD_KEY = "password_key";

    SharedPreferences sharedPreferences;
    String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        sharedPreferences = getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
        email = sharedPreferences.getString(EMAIL_KEY, null);
        password = sharedPreferences.getString(PASSWORD_KEY, null);

        if (email != null && password != null){
            Intent i = new Intent(SplashScreen.this, Kalkulator.class);
            startActivity(i);
        } else {
            Intent a = new Intent(SplashScreen.this, MainActivity.class);
            startActivity(a);
        }
        finish();
    }
}