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

public class Gosti extends AppCompatActivity
{
    ListView spisok_gost;
    Button dob_gosti, save_gosti, nazad_k_glav9, podskazka_button5;
    EditText vvod_gosti;
    TextView text_gosti;
    String[] ListElements = new String[] {};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gosti);

        spisok_gost = findViewById(R.id.spisok_gost);
        dob_gosti = findViewById(R.id.dob_gosti);
        save_gosti = findViewById(R.id.save_gosti);
        nazad_k_glav9 = findViewById(R.id.nazad_k_glav9);
        vvod_gosti = findViewById(R.id.vvod_gosti);
        text_gosti = findViewById(R.id.text_gosti);
        podskazka_button5 = findViewById(R.id.podskazka_button5);

        //Блок работы с кнопкой для вывода подсказки
        podskazka_button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                AlertDialog.Builder mydialog = new AlertDialog.Builder(Gosti.this);
                mydialog.setMessage
                        ("При составлении списка госте, " +
                                "записывайте номер телефона полностью, " +
                                "для каждого взрослого гостя." +
                                "Если среди гостей есть дети, без телефона, " +
                                "укажите для них номер телефона одного из родителей.");

                final EditText weightInput = new EditText(Gosti.this);
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
                (Gosti.this, android.R.layout.simple_list_item_1,
                        ListElementsArrayList);

        spisok_gost.setAdapter(adapter);

        dob_gosti.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                ListElementsArrayList.add(vvod_gosti.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });
    }

    // Блок работы с кнопками, переход на другие страницы
    public void nazad_k_glav9 (View one)
    {
        Intent intent = new Intent(this, glav_menu.class);
        startActivity(intent);
    }

}