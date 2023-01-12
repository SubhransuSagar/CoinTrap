package com.example.cointrap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class login_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);


    }

    public void clicked(View view) {
        String usNm = ((TextView) findViewById(R.id.username)).getText().toString();
        String pwd = ((TextView) findViewById(R.id.password)).getText().toString();
        if (usNm.equals("admin")) {
            if (pwd.equals("admin1234")) {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(),"Enter Valid Password", Toast.LENGTH_SHORT).show();
            }
        } else if (usNm.equals("guest")) {
            if (pwd.equals("guest1234")) {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(),"Enter Valid Password", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(getApplicationContext(),"Invalid Login", Toast.LENGTH_SHORT).show();
        }
    }
}
