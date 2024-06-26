package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class splash extends AppCompatActivity {

    TextView textView;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        textView=findViewById(R.id.txt);
        animation= AnimationUtils.loadAnimation(this,R.anim.animate);
        textView.setAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
             Intent intent=new Intent(getApplicationContext(),MainActivity.class);
             startActivity(intent);
             finish();

            }
        },2000);

    }
}