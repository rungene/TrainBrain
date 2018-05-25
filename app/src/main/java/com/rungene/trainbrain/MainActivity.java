package com.rungene.trainbrain;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonGo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGo = findViewById(R.id.buttonGo);


    }

    public void start(View view){
        buttonGo.setVisibility(View.INVISIBLE);

    }
}
