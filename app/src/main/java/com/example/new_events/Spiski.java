package com.example.new_events;

import androidx.appcompat.app.AppCompatActivity;
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

public class Spiski extends AppCompatActivity
{
    ListView spisok;
    Button button1, button2, button3;
    EditText vvod;
    TextView text_spisok;
    String[] ListElements = new String[] {};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiski);
        spisok = findViewById(R.id.spisok);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        vvod = findViewById(R.id.vvod);
        text_spisok = findViewById(R.id.text_spisok);

        // Блок работы со списками для ввода
        final List< String > ListElementsArrayList = new ArrayList < String >
                (Arrays.asList(ListElements));

        final ArrayAdapter < String > adapter = new ArrayAdapter < String >
                (Spiski.this, android.R.layout.simple_list_item_1,
                        ListElementsArrayList);

        spisok.setAdapter(adapter);

        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                ListElementsArrayList.add(vvod.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });
    }

    // Блок работы с кнопками, переход на другие страницы
    public void button3 (View one)
    {
        Intent intent = new Intent(this, Spiski_glav.class);
        startActivity(intent);
    }

}