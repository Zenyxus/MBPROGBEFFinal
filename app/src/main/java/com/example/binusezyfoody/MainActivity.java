package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intenthometop = getIntent();
        String saldonew= intenthometop.getStringExtra(TopupActivity.EXTRA_MESSAGE);
        TextView textsaldo = findViewById(R.id.saldo);
        textsaldo.setText(saldonew);
    }
    public void myorder (View view){
        Intent intentorder = new Intent(this, MyOrderActivity.class);
        startActivity(intentorder);

    }
    public void drinks (View view){
        Intent intentdrinks = new Intent(this, DrinksActivity.class);
        startActivity(intentdrinks);

    }
    public void foods (View view){
        Intent intentfoods = new Intent(this, FoodActivity.class);
        startActivity(intentfoods);

    }
    public void snack (View view){
        Intent intentsnack = new Intent(this, SnackActivity.class);
        startActivity(intentsnack);

    }
    public void topup (View view){
        Intent intenttop = new Intent(this, TopupActivity.class);
        startActivity(intenttop);

    }
}
