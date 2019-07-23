package com.example.mycanvas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        Button intro = (Button) findViewById(R.id.button12);
        Button analog = (Button) findViewById(R.id.button9);
        Button digiintro = (Button)findViewById(R.id.button10);
        Button imagerelatesig = (Button)findViewById(R.id.button7);
        Button sysandsig = (Button)findViewById(R.id.button8);
        Button applyusage = (Button)findViewById(R.id.button5);
        Button dimen = (Button)findViewById(R.id.button6);
        Button imageoncamera = (Button)findViewById(R.id.button4);
        Button conceptsonpixel = (Button)findViewById(R.id.button);
        Button perspective = (Button)findViewById(R.id.button1);
        Button bitsperpixel = (Button)findViewById(R.id.button2);

        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(Content.this,Introduction.class);
                startActivity(int1);
            }
        });

        analog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(Content.this,Analog.class);
                startActivity(int1);
            }
        });

        digiintro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(Content.this,Digital_intro.class);
                startActivity(int1);
            }
        });

        imagerelatesig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(Content.this,imagerelatesig.class);
                startActivity(int1);
            }
        });

        sysandsig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(Content.this,sysandsig.class);
                startActivity(int1);
            }
        });

        applyusage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(Content.this,applyusage.class);
                startActivity(int1);
            }
        });

        dimen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(Content.this,dimen.class);
                startActivity(int1);
            }
        });

        imageoncamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(Content.this,imageoncamera.class);
                startActivity(int1);
            }
        });

        conceptsonpixel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(Content.this,conceptsonpixel.class);
                startActivity(int1);
            }
        });

        perspective.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(Content.this,perspectivetransform.class);
                startActivity(int1);
            }
        });

        bitsperpixel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(Content.this,bitsperpixel.class);
                startActivity(int1);
            }
        });
    }

}
