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

public class oborudovanie extends AppCompatActivity
{
    ListView spisok_oborud;
    Button dobav_oborud, save_dabav1, nazad_k_glav5;
    EditText vvod_oborud;
    TextView text_oborud;
    String[] ListElements = new String[] {};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oborudovanie);
        spisok_oborud = (ListView) findViewById(R.id.spisok_oborud);
        dobav_oborud = (Button) findViewById(R.id.dobav_oborud);
        save_dabav1 = (Button) findViewById(R.id.save_dabav1);
        nazad_k_glav5 = (Button) findViewById(R.id.nazad_k_glav5);
        vvod_oborud = (EditText) findViewById(R.id.vvod_oborud);
        text_oborud = findViewById(R.id.text_oborud);

        // Блок работы со списками для ввода
        final List< String > ListElementsArrayList = new ArrayList< String >
                (Arrays.asList(ListElements));


        final ArrayAdapter< String > adapter = new ArrayAdapter < String >
                (oborudovanie.this, android.R.layout.simple_list_item_1,
                        ListElementsArrayList);

        spisok_oborud.setAdapter(adapter);

        dobav_oborud.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                ListElementsArrayList.add(vvod_oborud.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });

        spisok_oborud.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        spisok_oborud.setAdapter(adapter);
    }

    // Блок работы с кнопками, переход на другие страницы
    public void nazad_k_glav5 (View one)
    {
        Intent intent = new Intent(this, Detali.class);
        startActivity(intent);
    }
}
