package com.estacio.neto.aula5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nome = findViewById(R.id.txtNome);
        nome.setTextSize(30);
        nome.setText(R.string.nome);

        TextView time = findViewById(R.id.txtTime);
        time.setTextSize(30);
        time.setText(R.string.time);

        TextView cidade = findViewById(R.id.txtCidade);
        cidade.setTextSize(30);
        cidade.setText(R.string.cidade);
    }
}