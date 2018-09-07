
package com.example.android.justjava;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.text.NumberFormat.getCurrencyInstance;

public class MainActivity extends AppCompatActivity {
    int quantity = 2;
    EditText name_edi;
    boolean wc_check = false, cc_check = false;
    Button orderbtn;
    TextView display;
    int basePrize;
    String name;
    TextView editNumberOfCoffee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        orderbtn = findViewById(R.id.order);
        editNumberOfCoffee = findViewById(R.id.edit_numberOfCoffee);
        display = findViewById(R.id.price_text_view);
         name_edi = findViewById(R.id.name_edittxt);
        //name = name_edi.getText().toString();


        orderbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String body =  claculatePrize();

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:")); // to open next a only email
                intent.putExtra(Intent.EXTRA_SUBJECT, "coffee order for "+name);
                intent.putExtra(Intent.EXTRA_TEXT,body);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }

            }
        });
    }

    /**
     * This method is called when the order button is clicked.
     */
   /* public void submitOrder() {
        display(quantity);
        String msg = "Thank you";
        int prize = quantity * 5;
        displayPrice(msg +"\n"+ prize);

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {

        editNumberOfCoffee.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(String number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(getCurrencyInstance().format(number));
    }

    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    public void decrement(View view) {
        if (quantity > 0) {
            quantity = quantity - 1;
        }
        display(quantity);
    }
    public void weap_check(View view)
    {
        if(wc_check == false)
            wc_check = true;
        else
            wc_check = false;
    }
    public void choco_check(View view)
    {
        if(cc_check == false)
            cc_check = true;
        else
            cc_check = false;
    }
    public String claculatePrize()
    {
        String coffee = editNumberOfCoffee.getText().toString();
        int number = Integer.parseInt(coffee);
        basePrize = number * 5;
        name = name_edi.getText().toString();
        if(wc_check == true)
            basePrize = basePrize + 2;

        if (cc_check == true)
            basePrize = basePrize + 4;
        return "Name: "+ name +
                "\nAdd weap_cream "+ wc_check+
                "\nAdd chocolate_cream "+ cc_check+
                "\nQuantity: " + quantity +
                "\nTotal: Rs" + basePrize + "" + "\n"+ getString(R.string.thank_you);


    }
}