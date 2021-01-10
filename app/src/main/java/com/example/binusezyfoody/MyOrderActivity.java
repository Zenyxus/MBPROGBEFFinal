package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;


import java.util.ArrayList;
public class MyOrderActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ItemArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);

        recyclerView = (RecyclerView) findViewById(R.id.rvorders);

  RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MyOrderActivity.this);
recyclerView.setLayoutManager(layoutManager);

        ArrayList <Orders> itemList = new ArrayList<Orders>();
        adapter = new ItemArrayAdapter(itemList);
        recyclerView.setAdapter(adapter);

    }
    public void payorder (View view){
        Intent intentpayorder = new Intent(this, PaymentActivity.class);
        startActivity(intentpayorder);

    }
}
