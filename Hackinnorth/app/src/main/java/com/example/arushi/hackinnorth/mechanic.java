package com.example.arushi.hackinnorth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class mechanic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanic);


        Button btn = (Button) findViewById(R.id.mech);
        final TextView txt = (TextView) findViewById(R.id.textView5);


        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                txt.setText("\n           Rajesh Singh       9897654367\n\n            Akash Vishwa      777886908\n\n             Vishal Yadav       9987658989\n\n             Kuldeep Verma      7658907659");
            }

        });
    }
}


