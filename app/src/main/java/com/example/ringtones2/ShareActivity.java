package com.example.ringtones2;

import android.os.Bundle;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class ShareActivity extends AppCompatActivity {

    Button back, face, wsp, twit, insta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        back = (Button)findViewById(R.id.back);
        face = (Button)findViewById(R.id.face);
        wsp = (Button)findViewById(R.id.wsp);
        twit = (Button)findViewById(R.id.twit);
        insta = (Button)findViewById(R.id.insta);

        face.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_TEXT, "Encuentra la mejor variedad de sonidos en http://www.sonidosmp3gratis.com/");
                share.setPackage("com.facebook.katana");
                startActivity(Intent.createChooser(share, "Compartir"));
            }
        });
        wsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_TEXT, "Encuentra la mejor variedad de sonidos en http://www.sonidosmp3gratis.com/");
                share.setPackage("com.whatsapp");
                startActivity(Intent.createChooser(share, "Compartir"));
            }
        });
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_TEXT, "Encuentra la mejor variedad de sonidos en http://www.sonidosmp3gratis.com/");
                share.setPackage("com.instagram");
                startActivity(Intent.createChooser(share, "Compartir"));
            }
        });

        twit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_TEXT, "Encuentra la mejor variedad de sonidos en http://www.sonidosmp3gratis.com/");
                share.setPackage("com.twitter.android");
                startActivity(Intent.createChooser(share, "Compartir"));
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ShareActivity.this, ViewActivity.class);
                startActivity(i);
            }
        });
    }
}