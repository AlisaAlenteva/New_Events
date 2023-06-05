package com.example.new_events;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gift extends AppCompatActivity
{
    ListView spisok_gift;
    Button dobav_gift, save_gift, nazad_k_glav_gift, podskazka_button4;
    EditText vvod_gift;
    TextView text_gift;
    String[] ListElements = new String[] {};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gift);
        spisok_gift = findViewById(R.id.spisok_gift);
        dobav_gift = findViewById(R.id.dobav_gift);
        save_gift = findViewById(R.id.save_gift);
        nazad_k_glav_gift = findViewById(R.id.nazad_k_glav_gift);
        vvod_gift = findViewById(R.id.vvod_gift);
        text_gift = findViewById(R.id.text_gift);
        podskazka_button4 = findViewById(R.id.podskazka_button4);

        //Блок работы с кнопкой для вывода подсказки
        podskazka_button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                AlertDialog.Builder mydialog = new AlertDialog.Builder(Gift.this);
                mydialog.setMessage
                        ("Вы можете самостоятельно вписать список подарков, " +
                                "или составить вишлист на одной из доступной платформ " +
                                "(например https://podarkus.ru/#catalog) " +
                                "и вписать ссылку на него в список" );

                final EditText weightInput = new EditText(Gift.this);
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

        // Блок работы со списками для ввода
        final List< String > ListElementsArrayList = new ArrayList< String >
                (Arrays.asList(ListElements));


        final ArrayAdapter< String > adapter = new ArrayAdapter < String >
                (Gift.this, android.R.layout.simple_list_item_1,
                        ListElementsArrayList);

        spisok_gift.setAdapter(adapter);

        dobav_gift.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                ListElementsArrayList.add(vvod_gift.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });

        spisok_gift.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        spisok_gift.setAdapter(adapter);
    }

    // Блок работы с кнопками, переход на другие страницы
    public void nazad_k_glav_gift (View one)
    {
        Intent intent = new Intent(this, Detali.class);
        startActivity(intent);
    }

}
