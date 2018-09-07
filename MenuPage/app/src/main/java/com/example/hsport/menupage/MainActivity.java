package com.example.hsport.menupage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView heading, txtCab,txttrain,txtbus,txtairline;
    ImageView cabIm, trainIm, airlineIm, busIm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        heading = (TextView) findViewById(R.id.heading);
        txtCab = findViewById(R.id.textcab);
        txttrain = findViewById(R.id.texttrain);
        txtbus = findViewById(R.id.textbus);
        txtairline = findViewById(R.id.textairline);
        cabIm = findViewById(R.id.cab);
        trainIm = findViewById(R.id.train);
        busIm = findViewById(R.id.bus);
        airlineIm = findViewById(R.id.airline);

        cabIm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "cab booking", Toast.LENGTH_SHORT).show();
            }
        } );
            busIm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "Bus booking", Toast.LENGTH_SHORT).show();
                }

            });
            trainIm.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(MainActivity.this, "train booking", Toast.LENGTH_SHORT).show();
                        }
            });
            airlineIm.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(MainActivity.this, "airline booking", Toast.LENGTH_SHORT).show();
                        }
             });

    }
}

