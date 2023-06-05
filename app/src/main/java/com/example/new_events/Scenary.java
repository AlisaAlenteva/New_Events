package com.example.new_events;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

public class Scenary extends AppCompatActivity
{
    TextView zagolovok_scenary,text_scenary, text_scenary2;
    Button nazad_scenary, gotov_scenary, save_scenary;
    EditText vvod_scenary;
    ScrollView SCROLLER_ID;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenary);
        zagolovok_scenary = findViewById(R.id.zagolovok_scenary);
        save_scenary = findViewById(R.id.save_scenary);
        text_scenary = findViewById(R.id.text_scenary);
        text_scenary2 = findViewById(R.id.text_scenary2);
        SCROLLER_ID = findViewById(R.id.SCROLLER_ID);
        vvod_scenary = findViewById(R.id.vvod_scenary);
        gotov_scenary = findViewById(R.id.gotov_scenary);
        nazad_scenary = findViewById(R.id.nazad_scenary);
    }

    // Блок работы с кнопками, переход на другие страницы
    public void nazad_scenary (View three)
    {
        Intent intent = new Intent(this, glav_menu.class);
        startActivity(intent);
    }

    public void gotov_scenary (View four)
    {
        Intent intent = new Intent(this, Dress_cod.class);
        startActivity(intent);
    }
}