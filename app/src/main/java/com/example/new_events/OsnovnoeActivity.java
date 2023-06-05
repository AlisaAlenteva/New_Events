package com.example.new_events;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class OsnovnoeActivity extends AppCompatActivity
{
    TextView zagolovok, podzagal, gosti, name2;
    EditText colgost, name;
    Button dalee;
    Spinner vabormer;
    String[] mero = { "Свадьба", "День рождения", "Новый год", "Пасха", "Хэллоуин", "Девичник", "Мальчишник", "Рождество"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.osnovnoe);
        name = findViewById(R.id.name);
        zagolovok = findViewById(R.id.zagolovok);
        name2 = findViewById(R.id.name2);
        podzagal = findViewById(R.id.podzagal);
        gosti = findViewById(R.id.gosti);
        dalee = findViewById(R.id.dalee);
        colgost = findViewById(R.id.colgost);
        vabormer = findViewById(R.id.vabormer);

    // Блок с работой спинера
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, mero);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        vabormer.setAdapter(adapter);
    }

    public void clear(View c)
    {
        name.setText("");
    }

    public void click_city(View c)
    { // Процедура, отображающая поле для ввода текста (названия)
        name2.setVisibility(View.INVISIBLE); // скрываем textview с названием
        name.setVisibility(View.VISIBLE); // отображаем поле для ввода текста
        name.requestFocus(); // устанавливаем фокус (курсор) на поле для ввода текста
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE); // создаем объект класса InputMethodManager для автоматического отображения клавиатуры после нажатия на textview, инициализируем его актуальным интерфейсом, используемым для ввода данных
        imm.showSoftInput(name, InputMethodManager.SHOW_IMPLICIT); // отображаем клавиатуру для ввода текста
    }

    // Блок работы с кнопками, переход на другие страницы
    public void dalee(View one)
    {
        Intent intent = new Intent(this, glav_menu.class);
        startActivity(intent);
    }
}









