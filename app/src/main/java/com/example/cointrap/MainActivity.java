package com.example.cointrap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Integer tCoin = 21;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void one(View view) {
        if (tCoin>1){
            tCoin = tCoin - 1;
            ((TextView)findViewById(R.id.textView)).setText(tCoin.toString());
        }
        else{
            ((TextView)findViewById(R.id.textView3)).setText("YOU LOSE");
        }
    }

    public void two(View view) {
        if (tCoin>1){
            tCoin = tCoin - 2;
            ((TextView)findViewById(R.id.textView)).setText(tCoin.toString());
        }
        else{
        ((TextView)findViewById(R.id.textView3)).setText("YOU LOSE");}
    }

    public void three(View view) {
        if (tCoin>1){
            tCoin = tCoin - 3;
            ((TextView)findViewById(R.id.textView)).setText(tCoin.toString());
        }
        else{
        ((TextView)findViewById(R.id.textView3)).setText("YOU LOSE");}
    }

    public void four(View view) {
        if (tCoin>1){
            tCoin = tCoin - 4;
            ((TextView)findViewById(R.id.textView)).setText(tCoin.toString());
        }
        else{
        ((TextView)findViewById(R.id.textView3)).setText("YOU LOSE");}
    }
    public void bot(View view) {
        if (tCoin>2){
            if (tCoin>3){
                if (tCoin>4){
                    if (tCoin>5){
                        tCoin = tCoin - 4;
                        ((TextView)findViewById(R.id.textView)).setText(tCoin.toString());
                        //break;
                    }
                    tCoin = tCoin - 3;
                    ((TextView)findViewById(R.id.textView)).setText(tCoin.toString());
                    //break;
                }
                tCoin = tCoin - 2;
                ((TextView)findViewById(R.id.textView)).setText(tCoin.toString());
                //break;
            }
            tCoin = tCoin - 1;
            ((TextView)findViewById(R.id.textView)).setText(tCoin.toString());
        }
        else{
            ((TextView)findViewById(R.id.textView3)).setText("YOU LOSE");}
        }




}