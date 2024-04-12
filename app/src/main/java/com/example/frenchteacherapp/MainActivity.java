package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button redButton;
    Button greenButton;
    Button blackButton;
    Button purpleButton;
    Button yellowButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redButton=findViewById(R.id.red);
        greenButton=findViewById(R.id.green);
        blackButton=findViewById(R.id.black);
        purpleButton=findViewById(R.id.Purple);
        yellowButton=findViewById(R.id.yellow);

        redButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);
        blackButton.setOnClickListener(this);
        purpleButton.setOnClickListener(this);
        yellowButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        int id=view.getId();

        if(id==R.id.red){
            Toast.makeText(this,"Playing red sound",Toast.LENGTH_SHORT).show();
            playVoice(R.raw.red);
        } else if (id==R.id.green) {
            Toast.makeText(this,"Playing green sound",Toast.LENGTH_SHORT).show();
            playVoice(R.raw.green);
        }else if (id==R.id.black) {
            Toast.makeText(this,"Playing black sound",Toast.LENGTH_SHORT).show();
            playVoice(R.raw.black);
        }else if (id==R.id.Purple) {
            Toast.makeText(this,"Playing purple sound",Toast.LENGTH_SHORT).show();
            playVoice(R.raw.purple);
        }else if (id==R.id.yellow) {
            Toast.makeText(this,"Playing yellow sound",Toast.LENGTH_SHORT).show();
            playVoice(R.raw.yellow);
        }
    }

    public void playVoice(int id){
        MediaPlayer mediaPlayer= MediaPlayer.create(this,id);
        mediaPlayer.start();

    }
}