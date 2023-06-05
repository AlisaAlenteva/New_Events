package com.example.new_events;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class glav_menu extends AppCompatActivity
{
    TextView zagolovok3,mesto, data, odejda, kuhna, scenariy, detali, txtSeconds;
    Button dalee2, nazad1, btnStart, podskazka_button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glav_menu);
        zagolovok3 = findViewById(R.id.zagolovok3);
        mesto = findViewById(R.id.mesto);
        data = findViewById(R.id.data);
        odejda = findViewById(R.id.odejda);
        dalee2 = findViewById(R.id.dalee2);
        kuhna = findViewById(R.id.kuhna);
        scenariy = findViewById(R.id.scenariy);
        detali = findViewById(R.id.detali);
        nazad1 = findViewById(R.id.nazad1);
        txtSeconds = findViewById(R.id.txtSeconds);
        btnStart = findViewById(R.id.btnStart);
        podskazka_button = findViewById(R.id.podskazka_button);

        //Блок работы с кнопкой для вывода подсказки
        podskazka_button.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            AlertDialog.Builder mydialog = new AlertDialog.Builder(glav_menu.this);
            mydialog.setMessage
                    ("Следует заполнить как можно больше критериев, " +
                            "так как это значительно упростит процесс организация вашего мероприятия. " +
                            "Помните о времени и старайтесь избегать ситуаций, когда из-за большого количества " +
                            "намеченных на одно мероприятие событий, " +
                            "приходится торопиться и отменять их уже во время мероприятия" );

            final EditText weightInput = new EditText(glav_menu.this);
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

        //Блок работы с таймером
        View.OnClickListener oclbtn = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                long seconds = Long.parseLong(txtSeconds.getText().toString());

                CountDownTimer my_timer = new CountDownTimer(seconds*1000, 1000)
                {
                    @Override
                    public void onTick(long millisUntilFuture)
                    {
                        txtSeconds.setText(Long.toString(millisUntilFuture / 1000));
                    }
                    @Override
                    public void onFinish()
                    {
                        txtSeconds.setText("Праздник начался!");
                    }
                };
                my_timer.start();
            }
        };

        btnStart.setOnClickListener(oclbtn);
    }

    // Блок работы с кнопками, переход на другие страницы
    public void dalee1 (View one)
    {
        Intent intent = new Intent(this, Itog.class);
        startActivity(intent);
    }

    public void mesto (View two)
    {
        Intent intent = new Intent(this, Mesto.class);
        startActivity(intent);
    }

    public void data (View three)
    {
        Intent intent = new Intent(this, Data_Vremya.class);
        startActivity(intent);
    }

    public void odejda (View four)
    {
        Intent intent = new Intent(this, Dress_cod.class);
        startActivity(intent);
    }

    public void scenary (View five)
    {
        Intent intent = new Intent(this, Scenary.class);
        startActivity(intent);
    }

    public void nazad_12 (View six)
    {
        Intent intent = new Intent(this, OsnovnoeActivity.class);
        startActivity(intent);
    }

    public void gosti1 (View seven)
    {
        Intent intent = new Intent(this, Gosti.class);
        startActivity(intent);
    }

    public void kuhna (View eight)
    {
        Intent intent = new Intent(this, Kuhnya.class);
        startActivity(intent);
    }

    public void spiski (View nine)
    {
        Intent intent = new Intent(this, Spiski_glav.class);
        startActivity(intent);
    }
}