package com.example.anjali.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView txtdisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtdisplay = findViewById(R.id.welcomtxt);
        Bundle bundle = getIntent().getExtras();
        String strID = bundle.getString("ID");
        String strPASS = bundle.getString("PASS");
        txtdisplay.setText(strID+"\n"+strPASS);
    }
}
