package com.example.onekonek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
public class Pay_Now extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_paynow);

                ImageButton button3 = findViewById(R.id.imageButton3);
                button3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                Intent intent = new Intent(Pay_Now.this, HomePage.class);
                                startActivity(intent);
                        }
                });
        }

        public void OpenPayment(View view) {
                startActivity(new Intent(this, Payments.class));
        }
}
