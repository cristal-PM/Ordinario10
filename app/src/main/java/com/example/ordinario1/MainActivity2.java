package com.example.ordinario1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    private ImageButton l3,l4,l1,l2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        l1=(ImageButton) findViewById(R.id.imageButton3);
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity2.this,MapsActivity.class);
                startActivity(i);;
            }
        });
        l2=(ImageButton) findViewById(R.id.imageButton4);
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity2.this,MapsActivity3.class);
                startActivity(i);;
            }
        });
        l3=(ImageButton) findViewById(R.id.imageButton2);
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity2.this,MapsActivity4.class);
                startActivity(i);;
            }
        });
        l4=(ImageButton)  findViewById(R.id.imageButton);
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity2.this,MapsActivity2.class);
                startActivity(i);;
            }
        });
    }
}