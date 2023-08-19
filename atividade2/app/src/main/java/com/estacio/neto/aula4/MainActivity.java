package com.estacio.neto.aula4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnLogin = findViewById(R.id.btnLogin);
        final EditText inputNome =  findViewById(R.id.lblNome);
        final EditText inputSenha = findViewById(R.id.lblSenha);
        btnLogin.setOnClickListener((View view) -> {

            String nome = inputNome.getText().toString();
            String senha = inputSenha.getText().toString();

            Intent intent = new Intent(MainActivity.this, Tela02.class);
            intent.putExtra("Nome", inputNome.getText().toString());

            if (nome.equals("Neto") && senha.equals("123")) {
                startActivity(intent);
            } else {
                Toast.makeText(this, "Usuário e/ou senha incorreto(s)",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}