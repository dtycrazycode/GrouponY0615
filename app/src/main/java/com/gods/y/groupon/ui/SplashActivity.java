package com.gods.y.groupon.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gods.y.groupon.R;
import com.gods.y.groupon.config.Constant;
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
                    intent = new Intent(SplashActivity.this,GuideActivity.class);
                    spu.setFirst(false);
                }else {
                    intent = new Intent(SplashActivity.this,MainActivity.class);
                }
                startActivity(intent);
                finish();
            }
        }, 1500);
    }
}
