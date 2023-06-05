package com.example.new_events;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Kuhnya extends AppCompatActivity
{
    TextView zagolovok6, podzagolovok3, textzagol;
    Button save4, nazad4, podskazka_button8;
    Spinner vborkuhni;
    EditText vvoddetali;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuhnya);
        zagolovok6 = findViewById(R.id.zagolovok6);
        podzagolovok3 = findViewById(R.id.podzagolovok3);
        vborkuhni = findViewById(R.id.vborkuhni);
        save4 = findViewById(R.id.save4);
        nazad4 = findViewById(R.id.nazad4);
        textzagol = findViewById(R.id.textzagol);
        vvoddetali = findViewById(R.id.vvoddetali);
        podskazka_button8 = findViewById(R.id.podskazka_button8);

        //Блок работы с кнопкой для вывода подсказки
        podskazka_button8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                AlertDialog.Builder mydialog = new AlertDialog.Builder(Kuhnya.this);
                mydialog.setMessage
                        ("Еда - один из важнейших критериев на мероприятие." +
                                "Если вы решили заняться готовкой самостоятельно, то предлагаем ознакомиться с данными статьями:" +
                                "1. https://a-catering.com/kak-podgotovit-furshet.html" +
                                "2. https://eventmarket.ru/neskolko-obshhih-pravil-sostavleniya-idealnogo-banketnogo-menyu-bez-izlishestv/" +
                                "3. https://food.ru/articles/2635-kak-organizovat-prazdnichnyi-stol" +
                                "Если вы решили нанять кейтеринг на ваше мероприятие, то советуем ознакомиться с данными статьями:" +
                                "1. https://event.ru/trips/chek-list-po-vyiboru-keyteringa-na-meropriyatie-ot-keytering-konsalting/" +
                                "2. https://caterme.ru/articles/kak-vibrat-keyteringovyu-kompaniu" +
                                "3. https://bash.today/posts/kak-vybrat-i-zakazat-kejtering-online" +
                                "5. https://www.eventnn.ru/articles/item/26/5559/" +
                                "Помните, что вы должны позволить каждому гостю находиться в комфортной обстановке," +
                                "а значит необходимо ознакомиться с их предпочтенинями и аллергией.");

                final EditText weightInput = new EditText(Kuhnya.this);
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
    public void nazad4 (View one)
    {
        Intent intent = new Intent(this, glav_menu.class);
        startActivity(intent);
    }
}