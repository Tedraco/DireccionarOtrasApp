package com.example.direccionarotrasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Button facebook, instagram, youtube, buscador, steam;
    ImageButton gato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        facebook =   findViewById(R.id.btnFacebook);
        instagram = findViewById(R.id.btnInstagram);
        youtube = findViewById(R.id.btnYoutube);
        buscador = findViewById(R.id.btnBuscador);
        steam = findViewById(R.id.btnSteam);
        gato = findViewById(R.id.imgbtnGato);

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               try {
                   Intent facebook = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                   startActivity( facebook);
               }
               catch (Exception e)
               {
                   System.out.println("The 'try catch' is finished.");
               }


            }
        });

        gato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent gato = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                    startActivity(gato);
                }
                catch (Exception e)
                {
                    System.out.println("The 'try catch' is finished.");
                }
            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent instagram = getPackageManager().getLaunchIntentForPackage("com.instagram.android");
                    startActivity(instagram);
                }
                catch (Exception e) {
                    System.out.println("The 'try catch' is finished.");
                }

            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                Intent youtube = getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
                startActivity(youtube);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        buscador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            try {

                Uri google = Uri.parse("http://www.google.com");
                Intent intent = new Intent(Intent.ACTION_VIEW,google);
                startActivity(intent);
            }catch (Exception e){
                System.out.println("The 'try catch' is finished.");
            }
            }
        });
        steam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent steam = getPackageManager().getLaunchIntentForPackage("com.valvesoftware.android.steam.community");
                    startActivity(steam);
                }catch (Exception e){
                    System.out.println("The 'try catch' is finished.");
                }

            }
        });
    }
}