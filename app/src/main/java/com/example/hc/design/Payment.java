package com.example.hc.design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        Intent intent=this.getIntent();
        int price=intent.getIntExtra("price1",1);
        TextView txt4=(TextView)findViewById(R.id.textView4);
        txt4.setText("The total price is $"+price);
        Button btn5=(Button)findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Payment.this,Payment2.class
                );
                startActivity(intent);
            }
        });
    }
}
