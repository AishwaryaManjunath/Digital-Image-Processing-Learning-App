package com.example.mycanvas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Quiz11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz11);
        Button butt21 = (Button)findViewById(R.id.button21);
        Button butt22 = (Button)findViewById(R.id.button22);
        Button butt23 = (Button)findViewById(R.id.button23);
        Button butt24 = (Button)findViewById(R.id.button24);
        Button butt25 = (Button)findViewById(R.id.button25);

        butt21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Quiz11.this,"Correct Answer",Toast.LENGTH_LONG).show();
            }
        });

        butt22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Quiz11.this,"Wrong Answer",Toast.LENGTH_LONG).show();
            }
        });

        butt23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Quiz11.this,"Wrong Answer",Toast.LENGTH_LONG).show();
            }
        });

        butt24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Quiz11.this,"Wrong Answer",Toast.LENGTH_LONG).show();
            }
        });

        butt25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(Quiz11.this,Quiz12.class);
                startActivity(int1);
            }
        });
    }
}
