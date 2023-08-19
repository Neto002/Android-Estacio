package com.estacio.neto.aula4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.MessageFormat;

public class Tela02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela02);
        Intent intent = getIntent();
        String nome = (String) intent.getSerializableExtra("Nome");
        TextView text = findViewById(R.id.txtNome);
        text.setText(MessageFormat.format("Bem vindo, {0}!", nome));
        Button btnVoltar = findViewById(R.id.btnTela2);
        btnVoltar.setOnClickListener((View view) -> {
            Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent2);
        });
    }
}