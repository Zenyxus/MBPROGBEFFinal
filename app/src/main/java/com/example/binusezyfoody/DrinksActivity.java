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

public class DrinksActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "test1";
    public static final String EXTRA_MESSAGE2 = "test2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);



     }

    public void myorder2 (View view){
        Intent intentorder2 = new Intent(this, MyOrderActivity.class);
        startActivity(intentorder2);

    }
    public void paydrinkaqua (View view){
        Intent intentpaydrink = new Intent(this, DrinkOrderActivity.class);
        TextView textaqua = (TextView) findViewById(R.id.aquatext);
        TextView priceaqua = (TextView) findViewById(R.id.aquaprice);
        String item = textaqua.getText().toString();
        String price = priceaqua.getText().toString();
        intentpaydrink.putExtra(EXTRA_MESSAGE, item);
        intentpaydrink.putExtra(EXTRA_MESSAGE2, price);
        startActivity(intentpaydrink);

    }
    public void paydrinkapel (View view){
        Intent intentpaydrink = new Intent(this, DrinkOrderActivity.class);
        TextView textapel = (TextView) findViewById(R.id.appletext);
        TextView priceapel = (TextView) findViewById(R.id.appleprice);
        String item = textapel.getText().toString();
        String price = priceapel.getText().toString();
        intentpaydrink.putExtra(EXTRA_MESSAGE , item);
        intentpaydrink.putExtra(EXTRA_MESSAGE2 , price);
        startActivity(intentpaydrink);

    }
    public void paydrinkcocacola (View view){
        Intent intentpaydrink = new Intent(this, DrinkOrderActivity.class);
        TextView textcola = (TextView) findViewById(R.id.cocacolatext);
        TextView pricecola = (TextView) findViewById(R.id.softdrinkprice);
        String item = textcola.getText().toString();
        String price = pricecola.getText().toString();
        intentpaydrink.putExtra(EXTRA_MESSAGE , item);
        intentpaydrink.putExtra(EXTRA_MESSAGE2 , price);
        startActivity(intentpaydrink);

    }
    public void paydrinkcoffee (View view){
        Intent intentpaydrink = new Intent(this, DrinkOrderActivity.class);
        TextView textcoffee = (TextView) findViewById(R.id.coffeetext);
        TextView pricecoffee = (TextView) findViewById(R.id.coffeeprice);
        String item = textcoffee.getText().toString();
        String price = pricecoffee.getText().toString();
        intentpaydrink.putExtra(EXTRA_MESSAGE , item);
        intentpaydrink.putExtra(EXTRA_MESSAGE2 , price);
        startActivity(intentpaydrink);

    }
    public void paydrinkmanggo (View view){
        Intent intentpaydrink = new Intent(this, DrinkOrderActivity.class);
        TextView textmanggo = (TextView) findViewById(R.id.manggotext);
        TextView pricemanggo = (TextView) findViewById(R.id.manggoprice);
        String item = textmanggo.getText().toString();
        String price = pricemanggo.getText().toString();
        intentpaydrink.putExtra(EXTRA_MESSAGE , item);
        intentpaydrink.putExtra(EXTRA_MESSAGE2 , price);
        startActivity(intentpaydrink);

    }
    public void paydrinkavocado (View view){
        Intent intentpaydrink = new Intent(this, DrinkOrderActivity.class);
        TextView textavocado = (TextView) findViewById(R.id.avocadotext);
        TextView priceavocado = (TextView) findViewById(R.id.avocadoprice);
        String item = textavocado.getText().toString();
        String price = priceavocado.getText().toString();
        intentpaydrink.putExtra(EXTRA_MESSAGE , item);
        intentpaydrink.putExtra(EXTRA_MESSAGE2 , price);
        startActivity(intentpaydrink);

    }
}
