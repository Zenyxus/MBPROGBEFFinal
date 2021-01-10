package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageButton;
import java.lang.String;
import java.lang.StringBuffer;
import android.view.View.OnClickListener;

public class FoodActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "test1";
    public static final String EXTRA_MESSAGE2 = "test2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
    }
    public void myorder2 (View view){
        Intent intentorder2 = new Intent(this, MyOrderActivity.class);
        startActivity(intentorder2);

    }
    public void payfood1 (View view){
        Intent intentpaydrink = new Intent(this, DrinkOrderActivity.class);
        TextView textfood1 = (TextView) findViewById(R.id.textf1);
        TextView pricefood1 = (TextView) findViewById(R.id.pf1);
        String item = textfood1.getText().toString();
        String price = pricefood1.getText().toString();
        intentpaydrink.putExtra(EXTRA_MESSAGE, item);
        intentpaydrink.putExtra(EXTRA_MESSAGE2, price);
        startActivity(intentpaydrink);

    }
    public void paydfood2 (View view){
        Intent intentpaydrink = new Intent(this, DrinkOrderActivity.class);
        TextView textfood2 = (TextView) findViewById(R.id.textf2);
        TextView pricefood2 = (TextView) findViewById(R.id.pf2);
        String item = textfood2.getText().toString();
        String price = pricefood2.getText().toString();
        intentpaydrink.putExtra(EXTRA_MESSAGE , item);
        intentpaydrink.putExtra(EXTRA_MESSAGE2 , price);
        startActivity(intentpaydrink);

    }
}
