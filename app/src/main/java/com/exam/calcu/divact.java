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

public class divact extends AppCompatActivity {
    Button bid1,bid2;
    EditText edi1,edi2;
    int num1,num2,prod;
    String st1,st2,rm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_divact);


        edi1=(EditText) findViewById(R.id.ed1);
        edi2=(EditText) findViewById(R.id.ed2);
        bid2=(Button) findViewById(R.id.bd2);
        bid1=(Button) findViewById(R.id.bd1);

        bid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st1=edi1.getText().toString();
                st2=edi2.getText().toString();
                num1=Integer.parseInt(st1);
                num2=Integer.parseInt(st2);
                prod=num1/num2;
                rm=String.valueOf(prod);
                Toast.makeText(getApplicationContext(),prod,Toast.LENGTH_LONG).show();


            }

        });


        bid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o2=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(o2);
            }
        });
        };
    }