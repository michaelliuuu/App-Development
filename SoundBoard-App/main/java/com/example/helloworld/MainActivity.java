package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private ConstraintLayout constraintLayout;

    //main method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //title
        TextView title = findViewById(R.id.texttitle);
        title.setTextColor(Color.parseColor("#FFFFFF"));

        //dark/light mode switch
        @SuppressLint("UseSwitchCompatOrMaterialCode") Switch dlmode = findViewById(R.id.switch1);
        constraintLayout = findViewById(R.id.borderpane);
        dlmode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        dlmode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    constraintLayout.setBackgroundColor(Color.WHITE);
                    title.setTextColor(Color.BLACK);
                }
                else {
                    int color = Color.rgb(40, 40, 40);
                    constraintLayout.setBackgroundColor(color);
                    title.setTextColor(Color.WHITE);
                }
            }
        });

        //create buttons
        ImageButton chickenSaladBtn = findViewById(R.id.imageButton1);
        ImageButton croissantBtn = findViewById(R.id.imageButton2);
        ImageButton yamzBtn = findViewById(R.id.imageButton3);
        ImageButton zoolanderBtn = findViewById(R.id.imageButton4);
        ImageButton omgBtn = findViewById(R.id.imageButton5);
        ImageButton goofyBtn = findViewById(R.id.imageButton6);
        ImageButton postmanBtn = findViewById(R.id.imageButton7);
        ImageButton ninkyBtn = findViewById(R.id.imageButton8);
        ImageButton katrinaBtn = findViewById(R.id.imageButton9);
        ImageButton roadWorkBtn = findViewById(R.id.imageButton10);
        ImageButton boomBtn = findViewById(R.id.imageButton11);
        ImageButton walkawayBtn = findViewById(R.id.imageButton12);

        //get audio into the variable first before we can stop it when another audio is playing
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.chickensalad_a);

        //button implementation
        chickenSaladBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.chickensalad_a);
                mediaPlayer.start();
            }
        });
        croissantBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.croissant_a);
                mediaPlayer.start();
            }
        });
        yamzBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.yamz_a);
                mediaPlayer.start();
            }
        });
        zoolanderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sincity_a);
                mediaPlayer.start();
            }
        });
        omgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.wth_a);
                mediaPlayer.start();
            }
        });
        goofyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.goofy_a);
                mediaPlayer.start();
            }
        });
        katrinaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.katrina_a);
                mediaPlayer.start();
            }
        });
        ninkyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ninky_a);
                mediaPlayer.start();
            }
        });
        postmanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.postman_a);
                mediaPlayer.start();
            }
        });
        roadWorkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.roadwork_a);
                mediaPlayer.start();
            }
        });
        boomBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.boom_a);
                mediaPlayer.start();
            }
        });
        walkawayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.walk_a);
                mediaPlayer.start();
            }
        });
    }
}
