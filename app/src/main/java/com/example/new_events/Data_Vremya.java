package com.example.new_events;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

public class Data_Vremya extends AppCompatActivity
{
    TextView zagolovok4,podzagolovok,podzagolovok2;
    Button nazad3, save3, podskazka_button2;
    CalendarView calendar;
    EditText vremya;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_vremya);
        zagolovok4 = findViewById(R.id.zagolovok4);
        podzagolovok = findViewById(R.id.podzagolovok);
        calendar = findViewById(R.id.calendar);
        podzagolovok2 = findViewById(R.id.podzagolovok2);
        vremya = findViewById(R.id.vremya);
        nazad3 = findViewById(R.id.nazad3);
        save3 = findViewById(R.id.save3);
        podskazka_button2 = findViewById(R.id.podskazka_button2);

        //Блок работы с кнопкой для вывода подсказки
        podskazka_button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                AlertDialog.Builder mydialog = new AlertDialog.Builder(Data_Vremya.this);
                mydialog.setMessage
                        ("Дата и время очень важные критерии. " +
                        "Помните, если в вашем мероприятие " +
                        "присутствуют фотосессии и иные событие, " +
                        "их время так же стояит учитывать");

                final EditText weightInput = new EditText(Data_Vremya.this);
                mydialog.setNegativeButton("Закрыть", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        dialogInterface.cancel();
                    }
                });
                mydialog.show();
            }
        });
    }

    // Блок работы с кнопками, переход на другие страницы
    public void nazad3(View one)
    {
        Intent intent = new Intent(this, glav_menu.class);
        startActivity(intent);
    }
}