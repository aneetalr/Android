package com.example.login;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText user,pass;
    String u="anu";
    String p="123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void verify(View v) {
        if(v.getId ()==R.id.login){
            user=(EditText)findViewById ( R.id.username );
            pass=(EditText)findViewById ( R.id.password );
            String a=user.getText().toString();
            String b=pass.getText().toString();
            if(a.equals ( u ) && b.equals ( p )){
                Toast.makeText ( this,"Login Successful", Toast.LENGTH_LONG ).show();
            }
            else{
                Toast.makeText ( this,"Invalid Login",Toast.LENGTH_LONG ).show();

            }

        }
    }
}