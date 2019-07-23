package com.example.mycanvas;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private  EditText password;
    private Button login;
    private TextView info;
    private int counter=5;
    private TextView userRegistration;
    private FirebaseAuth firebaseAuth;
    private ProgressBar progressBar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name =  (EditText)findViewById(R.id.etUser);
        password = (EditText)findViewById(R.id.etPassword);
        login =  (Button)findViewById(R.id.btnLogin);
        info = (TextView)findViewById(R.id.tvInfo);
        userRegistration = (TextView)findViewById(R.id.tvRegiter);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);



        info.setText("No.of attempts remaining is : 5");

        firebaseAuth = FirebaseAuth.getInstance();


        FirebaseUser user = firebaseAuth.getCurrentUser();

        if(user !=null){
            finish();
            startActivity(new Intent(MainActivity.this,Main2Activity.class));
        }



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //progressBar.setVisibility(View.VISIBLE);
                validate(name.getText().toString(),password.getText().toString());
            }
        });

        userRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,RegisterActivity.class));
            }
        });


    }
    private void validate(String userName,String userPassword){
        progressBar.setVisibility(View.VISIBLE);
        firebaseAuth.signInWithEmailAndPassword(userName,userPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                //progressBar.setVisibility(View.VISIBLE);
                if(task.isSuccessful()){
                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this,"Login successful",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this,Main2Activity.class));
                }else{
                    Toast.makeText(MainActivity.this,"Login failed",Toast.LENGTH_SHORT).show();
                    counter--;
                    info.setText("No.of attempts remaining: " +counter);
                    progressBar.setVisibility(View.GONE);
                    if(counter==0){
                        login.setEnabled(false);
                    }
                }
            }
        });
        }
    }

