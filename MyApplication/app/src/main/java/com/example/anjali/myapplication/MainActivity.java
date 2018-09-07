package com.example.anjali.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Button btnLogin;
    EditText edtId, edtPass;
    //TextView txtdisplay;
    TextView forgettxt;
    ImageView fbImg, googleImg, linkedImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtId = findViewById(R.id.enterId);
       edtPass = findViewById(R.id.enterPass);
       btnLogin = findViewById(R.id.btnLogin);
       fbImg = findViewById(R.id.fbimg);
        googleImg = findViewById(R.id.googleimg);
        linkedImg = findViewById(R.id.linkimg);
        forgettxt = findViewById(R.id.txtForget);
       //txtdisplay = findViewById(R.id.txtDisplay);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Id = edtId.getText().toString();
                String Pass = edtPass.getText().toString();
                Toast.makeText(MainActivity.this,"Your data: "+Id+"\n"+Pass,Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("ID",Id);
                intent.putExtra("PASS",Pass);
                startActivity(intent);
                //txtdisplay.setText(Id + "\n" + Pass);
            }
        });

        fbImg.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fb = "login using facebook in process";
                Toast.makeText(MainActivity.this, fb, Toast.LENGTH_SHORT).show();
            }
            });


        googleImg.setOnClickListener( new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                String google = "login using google+ in process";
                Toast.makeText(MainActivity.this, google, Toast.LENGTH_SHORT).show();
            }
            });

        linkedImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String linked = "login using linkedin in process";
                Toast.makeText(MainActivity.this, linked, Toast.LENGTH_SHORT).show();
            }
        });

        forgettxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String forgetpass = "change password!";
                Toast.makeText(MainActivity.this, forgetpass, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
