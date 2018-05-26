package com.rungene.trainbrain;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button buttonGo;

    TextView textViewAddition;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGo = findViewById(R.id.buttonGo);

        textViewAddition = findViewById(R.id.textViewAddition);

        Random rand = new Random();

        int a = rand.nextInt(21);

        int b = rand.nextInt(21);

        Log.i("Random number one",Integer.toString(a));

        Log.i("Random number two",Integer.toString(b));

       // String c = Integer.toString(a+b);

        textViewAddition.setText(Integer.toString(a));

        //textViewAddition.setText(Integer.toString(b));







    }

    public void start(View view){
        buttonGo.setVisibility(View.INVISIBLE);

    }
}
