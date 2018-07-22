package com.digipodium.lkobus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class IconActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon);
        final Intent i =new Intent(this,HomeActivity.class);
        Runnable r=new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {


                        startActivity(i);
                        finish();
                    }
                });
            }
        };
        Thread t=new Thread(r);
        t.start();
    }
    }

