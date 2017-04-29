package com.akanshi.babymonitortm;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

public class SplashActivity extends RevealActivity {

    private final int SPLASH_DISPLAY_DURATION = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                destroyActivity(findViewById(R.id.activity_main2));
            }
        }, 3000);



    }
    @Override
    public void destroyAnimationFinished () {
        super.destroyAnimationFinished();
        onFinish();
    }

    public void onFinish() {
        Boolean isFirstRun=getSharedPreferences("PREFERENCE",MODE_PRIVATE).getBoolean("isFirstRun",true);



            Intent i = new Intent(SplashActivity.this, LoginActivity.class);
            startActivity(i);
            finish();}
    }


