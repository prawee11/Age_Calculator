package com.example.tute2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    EditText editYear;
    TextView txtMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editYear = findViewById(R.id.editYear);
        txtMessage = findViewById(R.id.txtMessage);



    }

    public void calculator(View view){

        //Extravt input Year
        int birthYear = Integer.parseInt(editYear.getText().toString());
        int currentYear = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()));

        Log.i("calculate",String.valueOf(birthYear));
        Log.i("calculate",String.valueOf(currentYear));

        txtMessage.setText("You are "+(currentYear-birthYear)+"Years Old");
        //caculate

        //Display

    }
}