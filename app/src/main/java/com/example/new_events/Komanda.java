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

public class Komanda extends AppCompatActivity
{
    ListView spisok_comand;
    Button dobav, save_dabav, nazad_k_glav4, podskazka_button7;
    EditText vvod_comand;
    TextView text_komand;
    String[] ListElements = new String[] {};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komanda);
        spisok_comand = (ListView) findViewById(R.id.spisok_comand);
        dobav = (Button) findViewById(R.id.dobav);
        save_dabav = (Button) findViewById(R.id.save_dabav);
        nazad_k_glav4 = (Button) findViewById(R.id.nazad_k_glav4);
        vvod_comand = (EditText) findViewById(R.id.vvod_comand);
        text_komand = findViewById(R.id.text_komand);
        podskazka_button7 = findViewById(R.id.podskazka_button7);

        //Блок работы с кнопкой для вывода подсказки
        podskazka_button7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                AlertDialog.Builder mydialog = new AlertDialog.Builder(Komanda.this);
                mydialog.setMessage
                        ("При составлении списка обязательно уточняйте, " +
                                "чем будет заниматься этот человек на вашем мероприятии. " +
                                "Вы можете воспользоваться представленными ссылками, " +
                                "для получения более подробной информации, " +
                                "о том кого можно нанять на мероприятие: " +
                                "1. https://event.ru/overviews/chem-razvlech-gostey-na-meropriyatii-20-yarkih-idey/" +
                                "2. https://eventspro.ru/node/6697" +
                                "3. https://more-radosti.ru/blog/artist-na-meropriyatie " +
                                "4. https://profi.ru/domashnii_personal/povar-na-meropriyatie/" +
                                "5. https://video-uslugi.ru/fotografyi-i-videografyi/");

                final EditText weightInput = new EditText(Komanda.this);
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
                (Komanda.this, android.R.layout.simple_list_item_1,
                        ListElementsArrayList);

        spisok_comand.setAdapter(adapter);

        dobav.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                ListElementsArrayList.add(vvod_comand.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });

        spisok_comand.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        spisok_comand.setAdapter(adapter);
    }

    // Блок работы с кнопками, переход на другие страницы
    public void nazad_k_glav4 (View one)
    {
        Intent intent = new Intent(this, Detali.class);
        startActivity(intent);
    }
}
