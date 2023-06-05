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

public class Spiski3 extends AppCompatActivity
{
    ListView spisok3;
    Button button1_3, button2_3, button3_3;
    EditText vvod_3;
    TextView text_spisok3;
    String[] ListElements = new String[] {};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiski3);
        spisok3 = (ListView) findViewById(R.id.spisok3);
        button1_3 = (Button) findViewById(R.id.button1_3);
        button2_3 = (Button) findViewById(R.id.button2_3);
        button3_3 = (Button) findViewById(R.id.button3_3);
        vvod_3 = (EditText) findViewById(R.id.vvod_3);
        text_spisok3 = findViewById(R.id.text_spisok3);

        // Блок работы со списками для ввода
        final List< String > ListElementsArrayList = new ArrayList< String >
                (Arrays.asList(ListElements));

        final ArrayAdapter< String > adapter = new ArrayAdapter < String >
                (Spiski3.this, android.R.layout.simple_list_item_1,
                        ListElementsArrayList);

        spisok3.setAdapter(adapter);

        button1_3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                ListElementsArrayList.add(vvod_3.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });
    }

    // Блок работы с кнопками, переход на другие страницы
    public void button3_3 (View one)
    {
        Intent intent = new Intent(this, Spiski_glav.class);
        startActivity(intent);
    }
}