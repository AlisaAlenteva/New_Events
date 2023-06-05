package com.example.new_events;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Itog extends AppCompatActivity
{
    TextView itog;
    Button priglah, finish, nazad_k_glav_v_conce, podskazka_button6;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itog);
        itog = findViewById(R.id.itog);
        priglah = findViewById(R.id.priglah);
        finish = findViewById(R.id.finish);
        nazad_k_glav_v_conce = findViewById(R.id.nazad_k_glav_v_conce);
        podskazka_button6 = findViewById(R.id.podskazka_button6);

        //Блок работы с кнопкой для вывода подсказки
        podskazka_button6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                AlertDialog.Builder mydialog = new AlertDialog.Builder(Itog.this);
                mydialog.setMessage
                        ("Убедитесь что вы выбрали все необходимые для себя критерии. " +
                                "Не забудьте отправить приглашение всем гостям, " +
                                "а так же пригласить всех членов команды, если таковые имеются" );

                final EditText weightInput = new EditText(Itog.this);
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
    }

    // Блок работы с кнопками, переход на другие страницы
    public void nazad_k_glav_v_conce (View one)
    {
        Intent intent = new Intent(this, glav_menu.class);
        startActivity(intent);
    }
}