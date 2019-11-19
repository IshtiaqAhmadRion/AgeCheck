package com.example.agecheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText date;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        date = findViewById(R.id.edit_date);
        submit = findViewById(R.id.button_submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s = date.getText().toString();
                String[] something = null;
                if (s.contains(".")) {
                    something = s.split(".");
                } else if (s.contains("-")) {
                    something = s.split("-");

                } else if (s.contains("/")) {
                    something = s.split("/");
                }
                for (int i = 0; i < something.length; i++) {
                    Log.e("Checking", something[i] + "\n");
                }

                Calendar cal = Calendar.getInstance();
                SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                Log.e("Tag", dateFormat.format(cal.getTime()));


            }


        });


    }
}
