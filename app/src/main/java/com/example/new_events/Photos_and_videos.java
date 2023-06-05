package com.example.new_events;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Photos_and_videos extends AppCompatActivity
{
    Button save_photos_and_videos, nazad_k_glav8;
    EditText Sslka_photo, Sslka_video, Sslka_photo_and_video;
    TextView text_Photos_and_videos;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photos_and_videos);
        Sslka_photo = findViewById(R.id.Sslka_photo);
        Sslka_video = findViewById(R.id.Sslka_video);
        Sslka_photo_and_video = findViewById(R.id.Sslka_photo_and_video);
        save_photos_and_videos = findViewById(R.id.save_photos_and_videos);
        nazad_k_glav8 = findViewById(R.id.nazad_k_glav8);
        text_Photos_and_videos = findViewById(R.id.text_Photos_and_videos);
    }

    // Блок работы с кнопками, переход на другие страницы
    public void nazad_k_glav8 (View one)
    {
        Intent intent = new Intent(this, Detali.class);
        startActivity(intent);
    }
}
