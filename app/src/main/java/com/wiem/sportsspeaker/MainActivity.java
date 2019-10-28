package com.wiem.sportsspeaker;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton imgBoxing , imgKickBoxing , imgJudo , imgKarate , imgAikido , imgTaekwondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgBoxing = findViewById(R.id.imgBoxing);
        imgKickBoxing = findViewById(R.id.imgKikboxing);
        imgJudo = findViewById(R.id.imgJudo);
        imgKarate = findViewById(R.id.imgKarate);
        imgAikido = findViewById(R.id.imgAikido);
        imgTaekwondo = findViewById(R.id.imgTaekwondo);

        //Listener
        imgBoxing.setOnClickListener(MainActivity.this);
        imgKickBoxing.setOnClickListener(MainActivity.this);
        imgJudo.setOnClickListener(MainActivity.this);
        imgKarate.setOnClickListener(MainActivity.this);
        imgAikido.setOnClickListener(MainActivity.this);
        imgTaekwondo.setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View imgButtonView) {
        switch(imgButtonView.getId()){
            case R.id.imgBoxing :
                placeSportName(imgBoxing.getTag().toString());
                break;
            case R.id.imgKikboxing :
                placeSportName(imgKickBoxing.getTag().toString());
                break;
            case R.id.imgJudo :
                placeSportName(imgJudo.getTag().toString());
                break;
            case R.id.imgKarate :
                placeSportName(imgKarate.getTag().toString());
                break;
            case R.id.imgAikido :
                placeSportName(imgAikido.getTag().toString());
                break;
            case R.id.imgTaekwondo :
                placeSportName(imgTaekwondo.getTag().toString());
                break;

        }

    }
    private void placeSportName (String sportName){
        MediaPlayer sportPlayer = MediaPlayer.create(this, getResources().getIdentifier(sportName , "raw" , getPackageName()));
        sportPlayer.start();
    }
}
