package com.example.mycanvas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
        Button butt11 = (Button)findViewById(R.id.button11);
        Button butt17 = (Button)findViewById(R.id.button17);
        Button butt18 = (Button)findViewById(R.id.button18);
        Button butt19 = (Button)findViewById(R.id.button19);
        //Button butt20 = (Button)findViewById(R.id.button20);
        TextView tv44 = (TextView)findViewById(R.id.textView44);

        butt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv44 = (TextView)findViewById(R.id.textView44);
                tv44.setText("Wrong ");
                tv44.setTextSize(36);
               //tv44.setTextColor(FF0000);
            }
        });

        butt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv44 = (TextView)findViewById(R.id.textView44);
                tv44.setText("Correct ");
                tv44.setTextSize(36);
                Intent int1 = new Intent(Quiz1.this,Quiz11.class);
                startActivity(int1);
                //Toast.makeText(Quiz1.this,"Correct Answer",Toast.LENGTH_LONG).show();
            }
        });

        butt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv44 = (TextView)findViewById(R.id.textView44);
                tv44.setText("Wrong");
                tv44.setTextSize(36);
                //Toast.makeText(Quiz1.this,"Wrong Answer",Toast.LENGTH_LONG).show();
            }
        });

        butt19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv44 = (TextView)findViewById(R.id.textView44);
                tv44.setText("Wrong ");
                tv44.setTextSize(36);
                //Toast.makeText(Quiz1.this,"Wrong Answer",Toast.LENGTH_LONG).show();
            }
        });

        //butt20.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View view) {
               // Intent int1 = new Intent(Quiz1.this,Quiz11.class);
                //startActivity(int1);
            //}
        //});

    }
}
