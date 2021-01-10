package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

import com.example.binusezyfoody.ItemArrayAdapter;

public class DrinkOrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_order);

        Intent intentpaydrink = getIntent();
        String itembought = intentpaydrink.getStringExtra(DrinksActivity.EXTRA_MESSAGE);
        TextView textitem = findViewById(R.id.itemname);
        textitem.setText(itembought);

        String priceitem = intentpaydrink.getStringExtra(DrinksActivity.EXTRA_MESSAGE2);
        TextView textprice = findViewById(R.id.itemprice);
        textprice.setText(priceitem);
    }
    public void myorder2 (View view){
        Intent intentorder2 = new Intent(this, MyOrderActivity.class);
        TextView itemboughtname = (TextView) findViewById(R.id.itemname);
        String itemboughtnamestr = itemboughtname.getText().toString();
        EditText Itemquantitybought = (EditText) findViewById((R.id.QTY)) ;
        String QTYText = Itemquantitybought.getText().toString();
        int QTYValue = Integer.parseInt(QTYText);
        if(itemboughtnamestr.equals("Air Mineral")){
            OrdersArray.holdorder("Air Mineral", 2000, QTYValue);
            startActivity(intentorder2);
        }else if(itemboughtnamestr.equals("Jus Apel")){
            OrdersArray.holdorder("Jus Apel", 3000, QTYValue);
            startActivity(intentorder2);
        }else if(itemboughtnamestr.equals("Soft Drinks")){
            OrdersArray.holdorder("Soft Drinks", 4000, QTYValue);startActivity(intentorder2);
        }else if(itemboughtnamestr.equals("Coffee")){
            OrdersArray.holdorder("Coffee", 3000, QTYValue);startActivity(intentorder2);
        }else if(itemboughtnamestr.equals("Jus Mangga")){
            OrdersArray.holdorder("Jus Mangga", 4000, QTYValue);startActivity(intentorder2);
        }else if(itemboughtnamestr.equals("Jus Alpukat")){
            OrdersArray.holdorder("Jus Alpukat", 5000, QTYValue);startActivity(intentorder2);
        }


    }
    public void drinks (View view){
        Intent intentdrinks = new Intent(this, DrinksActivity.class);
        TextView itemboughtname = (TextView) findViewById(R.id.itemname);
        String itemboughtnamestr = itemboughtname.getText().toString();
        EditText Itemquantitybought = (EditText) findViewById((R.id.QTY)) ;
        String QTYText = Itemquantitybought.getText().toString();
        int QTYValue = Integer.parseInt(QTYText);
        if(itemboughtnamestr.equals("Air Mineral")){
            OrdersArray.holdorder("Air Mineral", 2000, QTYValue);

        }else if(itemboughtnamestr.equals("Jus Apel")){
            OrdersArray.holdorder("Jus Apel", 3000, QTYValue);

        }else if(itemboughtnamestr.equals("Soft Drinks")){
            OrdersArray.holdorder("Soft Drinks", 4000, QTYValue);
        }else if(itemboughtnamestr.equals("Coffee")){
            OrdersArray.holdorder("Coffee", 3000, QTYValue);
        }else if(itemboughtnamestr.equals("Jus Mangga")){
            OrdersArray.holdorder("Jus Mangga", 4000, QTYValue);
        }else if(itemboughtnamestr.equals("Jus Alpukat")){
            OrdersArray.holdorder("Jus Alpukat", 5000, QTYValue);
        }
        startActivity(intentdrinks);


    }
    public void home (View view){
        Intent intenthome = new Intent(this, MainActivity.class);
        startActivity(intenthome);

    }    public void gmap (View view){
        Intent intentgmap = new Intent(this, MapsActivity.class);
        startActivity(intentgmap);

    }
}
