package com.example.ringtones2;

import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ViewActivity extends AppCompatActivity {

    Button play1, play2, play3, play4, play5;
    Button share1, share2, share3, share4, share5;
    Button blue1, blue2, blue3, blue4, blue5;

    MediaPlayer mp1, mp2, mp3, mp4, mp5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        play1 = (Button)findViewById(R.id.play1);
        play2 = (Button)findViewById(R.id.play2);
        play3 = (Button)findViewById(R.id.play3);
        play4 = (Button)findViewById(R.id.play4);
        play5 = (Button)findViewById(R.id.play5);

        share1 = (Button)findViewById(R.id.share1);
        share2 = (Button)findViewById(R.id.share2);
        share3 = (Button)findViewById(R.id.share3);
        share4 = (Button)findViewById(R.id.share4);
        share5 = (Button)findViewById(R.id.share5);

        blue1 = (Button)findViewById(R.id.blue1);
        blue2 = (Button)findViewById(R.id.blue2);
        blue3 = (Button)findViewById(R.id.blue3);
        blue4 = (Button)findViewById(R.id.blue4);
        blue5 = (Button)findViewById(R.id.blue5);

        mp1 = MediaPlayer.create(this, R.raw.afterlife);
        mp2 = MediaPlayer.create(this, R.raw.beast);
        mp3 = MediaPlayer.create(this, R.raw.carry);
        mp4 = MediaPlayer.create(this, R.raw.danger);
        mp5 = MediaPlayer.create(this, R.raw.guns);

        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp1.isPlaying()){
                    mp1.pause();
                    Toast.makeText(ViewActivity.this,"pausa", Toast.LENGTH_SHORT).show();
                }else{
                    mp1.start();
                    Toast.makeText(ViewActivity.this,"play", Toast.LENGTH_SHORT).show();
                }
            }
        });

        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp2.isPlaying()){
                    mp2.pause();
                    Toast.makeText(ViewActivity.this,"pausa", Toast.LENGTH_SHORT).show();
                }else{
                    mp2.start();
                    Toast.makeText(ViewActivity.this,"play", Toast.LENGTH_SHORT).show();
                }
            }
        });

        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp3.isPlaying()) {
                    mp3.pause();
                    Toast.makeText(ViewActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                } else {
                    mp3.start();
                    Toast.makeText(ViewActivity.this, "Reproduciendo Carry", Toast.LENGTH_SHORT).show();
                }
            }
        });

        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp4.isPlaying()) {
                    mp4.pause();
                    Toast.makeText(ViewActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                } else {
                    mp4.start();
                    Toast.makeText(ViewActivity.this, "Reproduciendo Danger", Toast.LENGTH_SHORT).show();
                }
            }
        });

        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp5.isPlaying()) {
                    mp5.pause();
                    Toast.makeText(ViewActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                } else {
                    mp5.start();
                    Toast.makeText(ViewActivity.this, "Reproduciendo Guns", Toast.LENGTH_SHORT).show();
                }
            }
        });

        share1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ViewActivity.this, ShareActivity.class);
                startActivity(i);
            }
        });

        share2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ViewActivity.this, ShareActivity.class);
                startActivity(i);
            }
        });

        share3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ViewActivity.this, ShareActivity.class);
                startActivity(i);
            }
        });

        share4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ViewActivity.this, ShareActivity.class);
                startActivity(i);
            }
        });

        share5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ViewActivity.this, ShareActivity.class);
                startActivity(i);
            }
        });

        blue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear una alerta
                AlertDialog.Builder alerta = new AlertDialog.Builder(ViewActivity.this);
                alerta.setMessage("¡Muchas felicidades! Has conseguido un punto. Sigue juntando puntos para recibir fantásticas recompensas... ¿Deseas salir?")
                        .setCancelable(false)
                        .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });

                AlertDialog titulo = alerta.create();
                titulo.setTitle("¡Felicidades!!!");
                titulo.show();
            }
        });
        blue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear una alerta
                AlertDialog.Builder alerta = new AlertDialog.Builder(ViewActivity.this);
                alerta.setMessage("¡Muchas felicidades! Has conseguido un punto. Sigue juntando puntos para recibir fantásticas recompensas... ¿Deseas salir?")
                        .setCancelable(false)
                        .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });

                AlertDialog titulo = alerta.create();
                titulo.setTitle("¡Felicidades!!!");
                titulo.show();
            }
        });
        blue3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear una alerta
                AlertDialog.Builder alerta = new AlertDialog.Builder(ViewActivity.this);
                alerta.setMessage("¡Muchas felicidades! Has conseguido un punto. Sigue juntando puntos para recibir fantásticas recompensas... ¿Deseas salir?")
                        .setCancelable(false)
                        .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });

                AlertDialog titulo = alerta.create();
                titulo.setTitle("¡Felicidades!!!");
                titulo.show();
            }
        });
        blue4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear una alerta
                AlertDialog.Builder alerta = new AlertDialog.Builder(ViewActivity.this);
                alerta.setMessage("¡Muchas felicidades! Has conseguido un punto. Sigue juntando puntos para recibir fantásticas recompensas... ¿Deseas salir?")
                        .setCancelable(false)
                        .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });

                AlertDialog titulo = alerta.create();
                titulo.setTitle("¡Felicidades!!!");
                titulo.show();
            }
        });
        blue5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear una alerta
                AlertDialog.Builder alerta = new AlertDialog.Builder(ViewActivity.this);
                alerta.setMessage("¡Muchas felicidades! Has conseguido un punto. Sigue juntando puntos para recibir fantásticas recompensas... ¿Deseas salir?")
                        .setCancelable(false)
                        .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });

                AlertDialog titulo = alerta.create();
                titulo.setTitle("¡Felicidades!!!");
                titulo.show();
            }
        });
    }
}
