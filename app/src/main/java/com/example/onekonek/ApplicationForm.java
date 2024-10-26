package com.example.onekonek;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ApplicationForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applicationform);


        ImageButton button1 = findViewById(R.id.back1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ApplicationForm.this, landingpage.class);
                startActivity(intent);
            }
        });
    }


    public void openApplicationForm(View view) {
        Intent intent = new Intent(this, LoginPage.class);
        startActivity(intent);
    }
}
