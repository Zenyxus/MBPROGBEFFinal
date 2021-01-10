package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SnackActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "test1";
    public static final String EXTRA_MESSAGE2 = "test2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);
    }
    public void myorder2 (View view){
        Intent intentorder2 = new Intent(this, MyOrderActivity.class);
        startActivity(intentorder2);

    }
    public void paysnack1 (View view){
        Intent intentpaydrink = new Intent(this, DrinkOrderActivity.class);
        TextView textfood1 = (TextView) findViewById(R.id.texts1);
        TextView pricefood1 = (TextView) findViewById(R.id.ps1);
        String item = textfood1.getText().toString();
        String price = pricefood1.getText().toString();
        intentpaydrink.putExtra(EXTRA_MESSAGE, item);
        intentpaydrink.putExtra(EXTRA_MESSAGE2, price);
        startActivity(intentpaydrink);

    }
}
