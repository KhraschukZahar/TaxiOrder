package com.example.taxiorder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Thread thread = new Thread() {
//            @Override
//            public void run() {
//                try {
//                    sleep(5000);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                } finally {
//                    startActivity(new Intent(
//                            MainActivity.this,
//                            ChooseActivityMode.class));
//                }
//            }
//        };
//
//        thread.start();
    }

    public void goToClientSignIn(View view) {
        startActivity(new Intent(
                MainActivity.this,
                ClientSignInActivity.class
        ));
    }

    public void goToDriverSignIn(View view) {
        startActivity(new Intent(
                MainActivity.this,
                DriverSignInActivity.class
        ));
    }
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}