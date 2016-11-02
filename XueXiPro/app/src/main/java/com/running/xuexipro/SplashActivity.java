package com.running.xuexipro;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        gotoNextActivity();
    }

    private void gotoNextActivity(){
//        AlphaAnimation aa = new AlphaAnimation(0.1f, 1.0f);
//        aa.setDuration(1500);//锟斤拷锟矫讹拷锟斤拷时锟斤拷
//        imageview.setAnimation(aa);//锟斤拷image锟斤拷锟矫讹拷锟斤拷
//        aa.setAnimationListener(new Animation.AnimationListener() {
//            public void onAnimationStart(Animation animation) {
//
//            }
//
//            public void onAnimationRepeat(Animation animation) {
//
//            }
//
//            public void onAnimationEnd(Animation animation) {
//
//            }
//        });

        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent intent = new Intent();
                intent.setClass(SplashActivity.this, LoginActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        }, 1000);
    }
}
