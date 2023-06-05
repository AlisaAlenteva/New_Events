package com.example.new_events;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

    public class Detali extends AppCompatActivity
    {
        TextView zagolovok_detali;
        Button gift, rassadka, komanda, oborudovanie, music, social_network, photos_and_videos, nazad_k_glav3 ;

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_detali);
            gift = findViewById(R.id.gift);
            rassadka = findViewById(R.id.rassadka);
            komanda = findViewById(R.id.komanda);
            oborudovanie = findViewById(R.id.oborudovanie);
            music = findViewById(R.id.music);
            social_network = findViewById(R.id.social_network);
            photos_and_videos = findViewById(R.id.photos_and_videos);
            nazad_k_glav3 = findViewById(R.id.nazad_k_glav3);
            zagolovok_detali = findViewById(R.id.zagolovok_detali);
        }

        //Блок работы с кнопками, переход на другие страницы
        public void rassadka (View one)
        {
            Intent intent = new Intent(this, Rassadka.class);
            startActivity(intent);
        }

        public void gift (View one)
        {
            Intent intent = new Intent(this, Gift.class);
            startActivity(intent);
        }

        public void komanda (View two)
        {
            Intent intent = new Intent(this, Komanda.class);
            startActivity(intent);
        }
        public void oborudovanie (View three)
        {
            Intent intent = new Intent(this, oborudovanie.class);
            startActivity(intent);
        }
        public void music (View four)
        {
            Intent intent = new Intent(this, Music.class);
            startActivity(intent);
        }

        public void social_network (View one)
        {
            Intent intent = new Intent(this, Scenary.class);
            startActivity(intent);
        }

        public void photos_and_videos (View three)
        {
            Intent intent = new Intent(this, Data_Vremya.class);
            startActivity(intent);
        }
        public void nazad_k_glav3 (View four)
        {
            Intent intent = new Intent(this, glav_menu.class);
            startActivity(intent);
        }
    }