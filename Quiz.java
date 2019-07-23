package com.example.mycanvas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Button butt15 = (Button) findViewById(R.id.button15);
        Button butt16 = (Button) findViewById(R.id.button16);

        butt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(Quiz.this, Quiz1.class);
                startActivity(int1);
            }
        });

        butt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(Quiz.this,Quiz2.class);
                startActivity(int1);
            }
        });
    }
}
