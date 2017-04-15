package com.example.arushi.hackinnorth;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.*;
import android.widget.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.util.concurrent.Callable;

public class gardener extends AppCompatActivity {



    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gardener);


        Button btn = (Button) findViewById(R.id.gar);
        txt = (TextView) findViewById(R.id.textView7);
        /*EditText edit1= (EditText)findViewById(R.id.input) ;
        final String edit= edit1.toString();*/


        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //edit.setText("Data fetched from URL");
                new JSONtask().execute("https://hintdd-5a02.restdb.io/rest/Hint");

            }
        });

    }


    public class JSONtask extends AsyncTask<String, String, String> {


        protected String doInBackground(String... params) {


            HttpURLConnection connection = null;
            BufferedReader reader = null;
            try {
                URL url = new URL(params[0]);
                connection = (HttpURLConnection) url.openConnection();
                connection.connect();
                InputStream stream = connection.getInputStream();
                reader = new BufferedReader(new InputStreamReader(stream));
                StringBuffer buffer = new StringBuffer();
                String line = "";
                while ((line = reader.readLine()) != null) {
                    buffer.append(line);
                }
                return buffer.toString();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            finally

            {
                if (connection != null) {
                    connection.disconnect();
                }
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();

                }
                return null;
            }
        }

        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            txt.setText(result);


        }
    }
}