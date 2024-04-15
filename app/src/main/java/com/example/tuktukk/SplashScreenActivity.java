package com.example.tuktukk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        delaySplashScreen();
    }
    private void delauSplashScreen(){
        completable.timer( delay 5,TimeUnit.SECONDS,
                AndriodSchedulers.mainThread())
        .sunscribe(()-> Toast.makeText(context SplashScreenActivity.this, text:"splash screen done !!!", Toast.LENGTH_SHORT).show();

            }



    }
}