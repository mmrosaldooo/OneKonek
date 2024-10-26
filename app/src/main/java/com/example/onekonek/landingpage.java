package com.example.onekonek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class landingpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
    }

    public void landingpage(View view) {
        Intent intent = new Intent(this, ApplicationForm.class);
        startActivity(intent);
    }

    public void loginPageview(View view) {
        Intent intent = new Intent(this, LoginPage.class);
        startActivity(intent);
    }
}
