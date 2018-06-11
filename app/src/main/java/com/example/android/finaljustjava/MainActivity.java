package com.example.android.justjava;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.justjava2.R;

import java.text.NumberFormat;



//This app display and order form to order coffee:


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This method is called when the plus button is clicked.
    public void increment(View view) {
        int quantity = 2;
        quantity = 3;
        display(quantity);

    }


    //This method is called when the minus button is clicked.
    public void decrement(View view) {
        int quantity = 2;
        quantity = 1;
        display(quantity);

    }

    //This method is called when the Order button is clicked.
    public void submitOrder(View view) {
        int quantity = 1;
        display(quantity);
        display(quantity * 5);

    }


    //This method displays the given quantity on the screen.
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.Quantity_text_view);
        quantityTextView.setText("" + number);

    }

    //This method displays the given quantity value on the screen:
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.PRICE_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }


}
