package com.exam.calcu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class mulact extends AppCompatActivity {

    EditText e1,e2;
    Button bm1,bm2;
    int num1,num2,prod;
    String st1,st2,rm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mulact);

        e1=(EditText) findViewById(R.id.em1);
        e2=(EditText) findViewById(R.id.em2);
        bm1=(Button) findViewById(R.id.mb1);
        bm2=(Button) findViewById(R.id.mb2);


        bm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st1=e1.getText().toString();
                st2=e2.getText().toString();
                num1=Integer.parseInt(st1);
                num2=Integer.parseInt(st2);
                prod=num1*num2;
                rm=String.valueOf(prod);
                Toast.makeText(getApplicationContext(),rm,Toast.LENGTH_LONG).show();


            }

        });
        bm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o4=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(o4);
            }
        });

        };
    }