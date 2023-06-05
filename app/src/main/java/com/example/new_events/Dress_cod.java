package com.example.new_events;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Dress_cod extends AppCompatActivity
{
    TextView zagolovok4,cvet,nazvaniedress2,detali2;
    Button save, nazad, podskazka_button3;
    EditText nazvaniedress,Detali2;
    Spinner vborcvet;
    String[] countries = { "Черный", "Красный", "Голубой", "Белый", "Желтый"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dress_cod);
        zagolovok4 = findViewById(R.id.zagolovok4);
        nazvaniedress = findViewById(R.id.nazvaniedress);
        cvet = findViewById(R.id.cvet);
        vborcvet = findViewById(R.id.vborcvet);
        Detali2 = findViewById(R.id.Detali2);
        save = findViewById(R.id.save);
        nazad = findViewById(R.id.nazad);
        nazvaniedress2 = findViewById(R.id.nazvaniedress2);
        detali2 = findViewById(R.id.Detali2);
        podskazka_button3 = findViewById(R.id.podskazka_button3);

        //Блок работы с кнопкой для вывода подсказки
        podskazka_button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                AlertDialog.Builder mydialog = new AlertDialog.Builder(Dress_cod.this);
                mydialog.setMessage
                        ("При выборе дресс-кода следует помнить, " +
                        "что гостям должно чувствовать себя удобно и практично в данной одежде," +
                        "проверьте прогноз погоды, а так же место, где будет мероприятие. " +
                        "Узнать больше про дресс-код и его виды вы можете перейдя по ссылке " +
                        "https://www.sostav.ru/publication/bonton-moveton-dress-kod-31622.html" );

                final EditText weightInput = new EditText(Dress_cod.this);
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

    // Блок с работой спинера
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, countries);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        vborcvet.setAdapter(adapter);
    }

    public void clear_1(View c)
    {
        nazvaniedress.setText("");
    }

    public void click_dress(View c)
    { // Процедура, отображающая поле для ввода текста (названия)
        nazvaniedress2.setVisibility(View.INVISIBLE); // скрываем textview с названием
        nazvaniedress.setVisibility(View.VISIBLE); // отображаем поле для ввода текста
        nazvaniedress.requestFocus(); // устанавливаем фокус (курсор) на поле для ввода текста
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE); // создаем объект класса InputMethodManager для автоматического отображения клавиатуры после нажатия на textview, инициализируем его актуальным интерфейсом, используемым для ввода данных
        imm.showSoftInput(nazvaniedress, InputMethodManager.SHOW_IMPLICIT); // отображаем клавиатуру для ввода текста
    }

    // Блок работы с кнопками, переход на другие страницы
    public void nazad2(View one)
    {
        Intent intent = new Intent(this, glav_menu.class);
        startActivity(intent);
    }
}