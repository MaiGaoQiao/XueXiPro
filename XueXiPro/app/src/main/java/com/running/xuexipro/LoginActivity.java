package com.running.xuexipro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }


    public void login(View v){
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        //intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        intent.putExtra("type", FeiMiApp.NewsContentType_DiMingZhi);
        startActivity(intent);
        finish();
    }
}
