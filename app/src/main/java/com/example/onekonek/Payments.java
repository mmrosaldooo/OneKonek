package com.example.onekonek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Payments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payments);
}

    public void OpenBack(View view) {
        startActivity(new Intent(this, HomePage.class));
    }


    public void OpenHomeBack(View view) {
        startActivity(new Intent(this, HomePage.class));
    }

    public void OpenPaymentBack(View view) {
        startActivity(new Intent(this, Payments.class));
    }

    public void OpenTicketBack(View view) {
        startActivity(new Intent(this, Tickets.class));
    }
}
