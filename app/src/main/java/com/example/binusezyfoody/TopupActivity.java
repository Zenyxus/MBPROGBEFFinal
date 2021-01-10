package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TopupActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "test1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_topup);
    }
    public void home (View view){
        Intent intenthome = new Intent(this, MainActivity.class);
        startActivity(intenthome);

    }
    public void hometop (View view){
        Intent intenthometop = new Intent(this, MainActivity.class);
        TextView texttopup = (TextView) findViewById(R.id.QTYS);
        String Saldotop = texttopup.getText().toString();
        intenthometop.putExtra(EXTRA_MESSAGE, Saldotop);
        startActivity(intenthometop);

    }
}
