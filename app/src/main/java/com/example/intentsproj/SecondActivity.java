package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String takeExtra;
    private TextView n1,n2;
    Button plus,min,multiply,divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        n1 = findViewById(R.id.textView6);
        n2 = findViewById(R.id.textView5);

        String NUM1 = getIntent().getStringExtra("number_one");
        String NUM2 = getIntent().getStringExtra("number_two");

        n1.setText(NUM1);
        n2.setText(NUM2);



        Intent myIntent = new Intent();
        takeExtra = myIntent.getStringExtra("MAIN_EXTRA");

        plus = (Button)findViewById(R.id.button2);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String val1;

            }
        });
    }
}