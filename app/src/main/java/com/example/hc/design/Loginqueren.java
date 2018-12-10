package com.example.hc.design;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Loginqueren extends AppCompatActivity {
    private static final String DB_FILE = "emails.db", DB_TABLE = "emails";
    private SQLiteDatabase mEmailsDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginqueren);

        Friend2DbOpenHelper friend2DbOpenHelper = new Friend2DbOpenHelper(getApplicationContext(), DB_FILE, null, 1);
        mEmailsDb=friend2DbOpenHelper.getWritableDatabase();
        final Intent intent=this.getIntent();
        String email1=intent.getStringExtra("name");
        String pass1=intent.getStringExtra("pass");
        TextView email11=(TextView)findViewById(R.id.textView);
        TextView pass11=(TextView)findViewById(R.id.textView2);
        email11.setText(email1);
        pass11.setText(pass1);
        Button btn1=(Button)findViewById(R.id.button);
        Button btn2=(Button)findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Loginqueren.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Loginqueren.this,Login.class);
                startActivity(intent);
            }
        });
    }
}
