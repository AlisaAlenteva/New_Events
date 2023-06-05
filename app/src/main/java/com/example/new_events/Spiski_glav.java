package com.example.new_events;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Spiski_glav extends AppCompatActivity
{
    TextView zagolovok_spiski,podzogol_spiski;
    Button spisok_1, spisok_2, spisok_3, nazad_k_glav2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiski_glav);
        zagolovok_spiski = findViewById(R.id.zagolovok_spiski);
        podzogol_spiski = findViewById(R.id.podzogol_spiski);
        spisok_1 = findViewById(R.id.spisok_1);
        spisok_2 = findViewById(R.id.spisok_2);
        spisok_3 = findViewById(R.id.spisok_3);
        nazad_k_glav2 = findViewById(R.id.nazad_k_glav2);
    }

    // Блок работы с кнопками, переход на другие страницы
    public void spisok_1 (View one)
    {
        Intent intent = new Intent(this, Spiski.class);
        startActivity(intent);
    }

    public void spisok_2 (View two)
    {
        Intent intent = new Intent(this, Spiski2.class);
        startActivity(intent);
    }

    public void spisok_3 (View tree)
    {
        Intent intent = new Intent(this, Spiski3.class);
        startActivity(intent);
    }

    public void nazad_k_glav2 (View four)
    {
        Intent intent = new Intent(this, glav_menu.class);
        startActivity(intent);
    }
}