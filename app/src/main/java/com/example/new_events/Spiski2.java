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

public class Spiski2 extends AppCompatActivity
{
    ListView spisok2;
    Button button1_2, button2_2, button3_2;
    EditText vvod_2;
    TextView text_spisok2;
    String[] ListElements = new String[] {};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiski2);

        spisok2 = (ListView) findViewById(R.id.spisok2);
        button1_2 = (Button) findViewById(R.id.button1_2);
        button2_2 = (Button) findViewById(R.id.button2_2);
        button3_2 = (Button) findViewById(R.id.button3_2);
        vvod_2 = (EditText) findViewById(R.id.vvod_2);
        text_spisok2 = findViewById(R.id.text_spisok2);

        // Блок работы со списками для ввода
        final List< String > ListElementsArrayList = new ArrayList< String >
                (Arrays.asList(ListElements));


        final ArrayAdapter< String > adapter = new ArrayAdapter < String >
                (Spiski2.this, android.R.layout.simple_list_item_1,
                        ListElementsArrayList);

        spisok2.setAdapter(adapter);

        button1_2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ListElementsArrayList.add(vvod_2.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });
    }

    // Блок работы с кнопками, переход на другие страницы
    public void button2_3 (View one)
    {
        Intent intent = new Intent(this, Spiski_glav.class);
        startActivity(intent);
    }
}