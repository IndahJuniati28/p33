package com.indah.indahjuniatipertemuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class relatif_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatif_layout);
        Button Buttonexplicit=(Button) findViewById(R.id.button3);
        Button buttonimplicit=(Button) findViewById(R.id.button4);

    Buttonexplicit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i=new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        }
    });

    buttonimplicit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent Implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iweblogsite.com"));
            startActivity(Implicit);
        }
    });
    }
}