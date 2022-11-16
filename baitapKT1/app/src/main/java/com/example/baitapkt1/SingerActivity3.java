package com.example.baitapkt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SingerActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singer3);
        TextView textviewdatg = findViewById(R.id.textviewdatg);
        TextView textViewttdatg = findViewById(R.id.textViewttdatg);
        Button buttonback2 = findViewById(R.id.buttonback2);

        buttonback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
    }
}