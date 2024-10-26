package com.example.onekonek;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageButton;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class Account_Settings extends AppCompatActivity {

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_settings);


        aSwitch = findViewById(R.id.switcher);

        aSwitch.setOnCheckedChangeListener((compoundButton, b) -> {
            if(b)
            {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            }
            else
            {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }
        });

            ImageButton button = findViewById(R.id.back3);
            button.setOnClickListener(v -> {
                Intent intent = new Intent(Account_Settings.this, HomePage.class);
                startActivity(intent);
            });

        }

    public void OpenHome_PageBack(View view) {
    }
}
