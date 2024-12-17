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

public class subact extends AppCompatActivity {
    Button bc1,bc2;
    EditText es1,es2;
    String s1,s2,dif;
    int i1,i2,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_subact);

        es1=(EditText) findViewById(R.id.ns1);
        es2=(EditText) findViewById(R.id.ns2);
        bc1=(Button) findViewById(R.id.bs1);
        bc2=(Button) findViewById(R.id.bs2);
        bc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=es1.getText().toString();
                s2=es2.getText().toString();
                i1=Integer.parseInt(s1);
                i2=Integer.parseInt(s2);
                d=i1-i2;
                dif=String.valueOf(d);
                Toast.makeText(getApplicationContext(),dif,Toast.LENGTH_LONG).show();
            }
        });
        bc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o2=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(o2);
            }
        });

        };
    }
