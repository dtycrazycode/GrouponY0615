package com.gods.y.groupon.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.gods.y.groupon.R;
import com.gods.y.groupon.util.SharedPreferencesUtil;

public class SplashActivity extends AppCompatActivity {

    private SharedPreferencesUtil spu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        spu = new SharedPreferencesUtil(this);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent;
                if (spu.isFirst()){
//                if (true) {
                    intent = new Intent(SplashActivity.this, GuideActivity.class);
                    spu.setFirst(false);
                } else {
                    intent = new Intent(SplashActivity.this, MainActivity.class);
                }
                startActivity(intent);
//                overridePendingTransition(R.anim.splash_animation_alpha_scale_01, R.anim.animation_nothing);
                finish();
            }
        }, 1500);
    }
}
