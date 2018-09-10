package com.bill.location;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



        buttonNext= findViewById(R.id.buttonNext);
        buttonNext.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.buttonNext){
            Intent intent = new Intent(SplashScreenActivity.this, LocationActivity.class);
            startActivity(intent);
        }
    }
}
