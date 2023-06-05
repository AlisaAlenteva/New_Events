package com.example.new_events;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Social_network extends AppCompatActivity
{
    Button save_social_network, nazad_k_glav7;
    EditText Sslka3_s, Sslka2_s, Sslka_s;
    TextView text_social_network;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_network);
        Sslka3_s = findViewById(R.id.Sslka3_s);
        Sslka2_s = findViewById(R.id.Sslka2_s);
        Sslka_s = findViewById(R.id.Sslka_s);
        save_social_network = findViewById(R.id.save_social_network);
        nazad_k_glav7 = findViewById(R.id.nazad_k_glav7);
        text_social_network = findViewById(R.id.text_social_network);
    }

    // Блок работы с кнопками, переход на другие страницы
    public void nazad_k_glav7 (View one)
    {
        Intent intent = new Intent(this, Detali.class);
        startActivity(intent);
    }
}
