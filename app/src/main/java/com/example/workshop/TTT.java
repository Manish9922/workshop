package com.example.workshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Objects;

public class TTT extends AppCompatActivity {
    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int flag=0,count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ttt);

        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);

    }

    public void submit(View view) {

        Button curbtn = (Button) view;
        if(curbtn.getText().toString().isEmpty()){
            if(flag==0){
                curbtn.setText("X");
                flag=1;
                count++;
            }
            else{
                curbtn.setText("O");
                flag=0;
                count++;
            }
            if(count>4){
                // we r converting view to string
                b1=btn_1.getText().toString();
                b2=btn_2.getText().toString();
                b3=btn_3.getText().toString();
                b4=btn_4.getText().toString();
                b5=btn_5.getText().toString();
                b6=btn_6.getText().toString();
                b7=btn_7.getText().toString();
                b8=btn_8.getText().toString();
                b9=btn_9.getText().toString();

                if(Objects.equals(b1, b2) && Objects.equals(b2, b3) && !b1.equals("")){
                    Toast.makeText(this,"Winner is "+b1,Toast.LENGTH_SHORT).show();
                    reset();
                }
                else if(Objects.equals(b4, b5) && Objects.equals(b5, b6) && !b4.equals("")){
                    Toast.makeText(this,"Winner is "+b4,Toast.LENGTH_SHORT).show();
                    reset();
                }
                else if(Objects.equals(b7, b8) && Objects.equals(b8, b9) && !b7.equals("")){
                    Toast.makeText(this,"Winner is "+b7,Toast.LENGTH_SHORT).show();
                    reset();
                }
                else if(Objects.equals(b1, b4) && Objects.equals(b4, b7) && !b1.equals("")){
                    Toast.makeText(this,"Winner is "+b1,Toast.LENGTH_SHORT).show();
                    reset();
                }
                else if(Objects.equals(b2, b5) && Objects.equals(b5, b8) && !b2.equals("")){
                    Toast.makeText(this,"Winner is "+b2,Toast.LENGTH_SHORT).show();
                    reset();
                }
                else if(Objects.equals(b3, b6) && Objects.equals(b6, b9) && !b3.equals("")){
                    Toast.makeText(this,"Winner is "+b3,Toast.LENGTH_SHORT).show();
                    reset();
                }
                else if(Objects.equals(b1, b5) && Objects.equals(b5, b9) && !b1.equals("")){
                    Toast.makeText(this,"Winner is "+b1,Toast.LENGTH_SHORT).show();
                    reset();
                }
                else if(Objects.equals(b3, b5) && Objects.equals(b5, b7) && !b3.equals("")){
                    Toast.makeText(this,"Winner is "+b3,Toast.LENGTH_SHORT).show();
                    reset();
                }
                else{
                    if(count==9){
                        Toast.makeText(this,"Game Drawn...",Toast.LENGTH_SHORT).show();
                        reset();
                    }
                }
            }
        }
    }

    private void reset() {
        btn_1.setText("");
        btn_2.setText("");
        btn_3.setText("");
        btn_4.setText("");
        btn_5.setText("");
        btn_6.setText("");
        btn_7.setText("");
        btn_8.setText("");
        btn_9.setText("");
        flag=0;
        count=0;
    }
}