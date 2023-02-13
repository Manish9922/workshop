package com.example.workshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class loginPage extends AppCompatActivity {

    EditText name,psw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        name=findViewById(R.id.edt_name);
        psw=findViewById(R.id.edt_psw);

    }


    public void submit(View view) {

        if(name.getText().toString().isEmpty() || psw.getText().toString().isEmpty()){
            Toast.makeText(loginPage.this,"Enter login credentials first",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(loginPage.this,"Logged in Successfully",Toast.LENGTH_LONG).show();

            Intent intent=new Intent(loginPage.this,Registration.class);
            intent.putExtra("Myname",name.getText().toString());
            startActivity(intent);
        }
    }
}