package com.example.new_events;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Mesto extends AppCompatActivity
{
    TextView zagolovok_mesto;
    Button nazad_k_glav, podskazka_button9;
    EditText edit_mesto1, edit_mesto2, edit_mesto3, edit_mesto4, edit_mesto5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesto);
        zagolovok_mesto = findViewById(R.id.zagolovok_mesto);
        nazad_k_glav = findViewById(R.id.nazad_k_glav);
        edit_mesto1 = findViewById(R.id.edit_mesto1);
        edit_mesto2 = findViewById(R.id.edit_mesto2);
        edit_mesto3 = findViewById(R.id.edit_mesto3);
        edit_mesto4 = findViewById(R.id.edit_mesto4);
        edit_mesto5 = findViewById(R.id.edit_mesto5);
        podskazka_button9 = findViewById(R.id.podskazka_button9);

        //Блок работы с кнопкой для вывода подсказки
        podskazka_button9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                AlertDialog.Builder mydialog = new AlertDialog.Builder(Mesto.this);
                mydialog.setMessage
                        ("Самым важным критерием в проведении мероприятия является место/площадка. " +
                                "Если вы собираетесь проводить мероприятие дома, то заранее убедитесь, " +
                                "что вам хватит места, стульев, столов, для всех гостей." +
                                "Если вы хотите организовать мероприятие в кафе/ресторане, то заранее договоритесь с ними," +
                                "чтобы забронировать помещение, столы, а так же убедиться, что хватит места и согласовать меню." +
                                "Если вы планируете ваше мероприятие в другом месте, то помните, " +
                                "что вам необходимо так же договориться обо всем с хозяином данного места." +
                                "Советуем ознакомиться с данной информацией для большего понимания:" +
                                "1. https://av55.ru/articles/banketnyy-zal-stadion-ili-loft-kak-vybrat-podkhodyashchuyu-dlya-meropriyatiya-ploshchadku/" +
                                "2. https://eventbooking.ru/blog/kriterii-podbora-ploshchadki-na-meropriyatie" +
                                "3. https://www.youparty.ru/articles/ploshchadki-dlya-meropriyatij-kak-vybrat-podhodyashchuyu-ploshchadku/");

                final EditText weightInput = new EditText(Mesto.this);
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
    public void nazad_k_glav (View one)
    {
        Intent intent = new Intent(this, glav_menu.class);
        startActivity(intent);
    }
}