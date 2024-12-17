package com.exam.calcu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class addact extends AppCompatActivity {
    String g1,g2,result;
    int n1,n2,s;
    Button ba1,ba2;
    EditText ea1,ea2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addact);

        ba1=(Button) findViewById(R.id.aa);
        ba2=(Button) findViewById(R.id.ba);
        ea1=(EditText) findViewById(R.id.na1);
        ea2=(EditText) findViewById(R.id.na2);

        ba1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                g1=ea1.getText().toString();
                g2=ea2.getText().toString();
                n1=Integer.parseInt(g1);
                n2=Integer.parseInt(g2);
                s=n1+n2;
                result=String.valueOf(s);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();


            }
        });


        ba2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(o);
            }
        });


        };
    }
