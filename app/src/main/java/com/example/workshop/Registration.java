package com.example.workshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import kotlin.text.Regex;

public class Registration extends AppCompatActivity {

    String myname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        myname=getIntent().getStringExtra("Myname");
        Toast.makeText(Registration.this,"Welcome "+myname,Toast.LENGTH_LONG).show();
    }

    public void submit(View view) {
        Toast.makeText(Registration.this,"Registered Successfully",Toast.LENGTH_LONG).show();
    }
}