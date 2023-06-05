package com.example.new_events;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Music extends AppCompatActivity
{
    Button  save_musik, nazad_k_glav6;
    EditText Sslka3, Sslka2, Sslka;
    TextView text_musik;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        Sslka3 = findViewById(R.id.Sslka3);
        Sslka2 = findViewById(R.id.Sslka2);
        Sslka = findViewById(R.id.Sslka);
        save_musik = findViewById(R.id.save_musik);
        nazad_k_glav6 = findViewById(R.id.nazad_k_glav6);
        text_musik = findViewById(R.id.text_musik);
    }

    // Блок работы с кнопками, переход на другие страницы
    public void nazad_k_glav6 (View one)
    {
        Intent intent = new Intent(this, Detali.class);
        startActivity(intent);
    }

}
