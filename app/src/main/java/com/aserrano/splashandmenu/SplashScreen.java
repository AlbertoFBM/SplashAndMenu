package com.aserrano.splashandmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_SCREEN = 4000;

    ImageView logo;
    TextView title, version, createdBy;
    Animation topAnim, bottonAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        //Animations

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottonAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        // ID's
        logo = findViewById(R.id.logo);
        title = findViewById(R.id.title);
        version = findViewById(R.id.version);
        createdBy = findViewById(R.id.createdBY);

        logo.setAnimation(topAnim);
        title.setAnimation(topAnim);
        version.setAnimation(bottonAnim);
        createdBy.setAnimation(bottonAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainMenu.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN);
    }
}