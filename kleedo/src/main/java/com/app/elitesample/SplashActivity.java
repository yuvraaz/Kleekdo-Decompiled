package com.app.elitesample;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.app.elitesample.utils.PreferenceData;

public class SplashActivity
        extends AppCompatActivity {
    private Runnable loginSection = new Runnable() {
        public void run() {
            Object localObject = new PreferenceData(SplashActivity.this);
            if (((PreferenceData) localObject).getSlideScreenIsViewable()) {
                localObject = new Intent(SplashActivity.this, LoginActivity.class);
                SplashActivity.this.startActivity((Intent) localObject);
                SplashActivity.this.finish();
                return;
            }
            ((PreferenceData) localObject).setSlideScreenOneTime();
            localObject = new Intent(SplashActivity.this, ScreenSlidePagerActivity.class);
            SplashActivity.this.startActivity((Intent) localObject);
            SplashActivity.this.finish();
        }
    };
    private Handler mHandler;

    protected void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
        setContentView(R.layout.activity_splash);
        this.mHandler = new Handler();
        this.mHandler.postDelayed(this.loginSection, 4000L);
    }
}

