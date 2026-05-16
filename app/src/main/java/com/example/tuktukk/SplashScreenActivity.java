package com.example.tuktukk;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import io.reactivex.Completable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.concurrent.TimeUnit;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        delaySplashScreen();
    }

    private void delaySplashScreen() {
        Completable.timer(5, TimeUnit.SECONDS, AndroidSchedulers.mainThread())
            .subscribe(() -> Toast.makeText(SplashScreenActivity.this, "splash screen done !!!", Toast.LENGTH_SHORT).show());
    }
}