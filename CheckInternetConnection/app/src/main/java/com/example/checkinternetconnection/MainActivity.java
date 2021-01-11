package com.example.checkinternetconnection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_connected;
    Button btn_connect;
    RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_connected = findViewById(R.id.connected);
        layout = findViewById(R.id.layout);
        btn_connect = findViewById(R.id.btn_retry);

        if (ConnectionManager.checkConnnection(getBaseContext())){

            //we are disabling layout for checking connection
            //and enabling connected text
            tv_connected.setVisibility(View.VISIBLE);
            layout.setVisibility(View.INVISIBLE);
        } else {

            //if not connected to internet
            //we are enabling layout  for checking connection
            //and disabling connected text
            tv_connected.setVisibility(View.INVISIBLE);
            layout.setVisibility(View.VISIBLE);
        }
    }
}