package com.indah.indahjuniatipertemuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.RelativeLayout;

public class aktivity_splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktivity_splash);
        new Handler().postDelayed(new Runnable() {

            //Ketik dari sini
            @Override
            public void run() {
// This method will be executed once the timer is over
                Intent i = new Intent(aktivity_splash.this, relatif_layout.class);
                startActivity(i);
                finish();
            }
        }, 5000);
    }
}

