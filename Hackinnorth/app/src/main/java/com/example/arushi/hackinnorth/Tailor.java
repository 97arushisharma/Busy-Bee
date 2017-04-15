package com.example.arushi.hackinnorth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tailor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tailor);


        Button btn1 = (Button) findViewById(R.id.tailer);
        final TextView txt1 = (TextView) findViewById(R.id.textView11);


        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                txt1.setText("\n           Rajesh Singh       9897654367\n\n            Akash Vishwa      777886908\n\n             Vishal Yadav       9987658989\n\n             Kuldeep Verma      7658907659");
            }

        });
    }
}


