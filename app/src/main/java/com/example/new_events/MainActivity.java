package com.example.new_events;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView zagolovok2;
    Button start3, gotov_merop;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zagolovok2 = findViewById(R.id.zagolovok2);
        start3 = findViewById(R.id.start3);
        gotov_merop = findViewById(R.id.gotov_merop);
    }

    // Блок работы с кнопками, переход на другие страницы
    public void Start(View one)
    {
        Intent intent = new Intent(this, OsnovnoeActivity.class);
        startActivity(intent);
    }
}