package com.example.onekonek;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page); // Set the content view first


        Button button = findViewById(R.id.loginbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Using getApplicationContext() in case there's an issue with context
                Intent intent = new Intent(LoginPage.this, HomePage.class);
                startActivity(intent);
                Toast.makeText(LoginPage.this, "Back Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton button2 =findViewById(R.id.back2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginPage.this, landingpage.class);
                startActivity(intent);
            }
        });


    }

}