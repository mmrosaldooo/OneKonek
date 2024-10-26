package com.example.onekonek;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);


    }
    public void OpenHome_Page(View view) {
        startActivity(new Intent(this, Account_Settings.class));
    }

    public void OpenPaynow(View view) {
        startActivity(new Intent(this, Pay_Now.class));
    }

    public void loggingout(View view) {
        startActivity(new Intent(this, LoginPage.class));
    }

}
