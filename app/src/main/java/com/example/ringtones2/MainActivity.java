package com.example.ringtones2;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Agregar animaciones: de arriba a abajo
        Animation animacion1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation animacion2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);

        //Agregar animaciones: de abajo a arriba
        //Animation animacion1 = AnimatioUtils.loadAnimation(This,R.anim.desplazamiento_abajo);
        //Animation animacion2 = AnimatioUtils.loadAnimation(This,R.anim.desplazamiento_abajo);

        TextView audiotextview = findViewById(R.id.audiotextView);
        ImageView logoimageview = findViewById(R.id.logoimageView);

        audiotextview.setAnimation(animacion1);
        logoimageview.setAnimation(animacion2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(MainActivity.this, ViewActivity.class);
                startActivity(intent);
                finish();
            }
        }, 6000);
    }

}