package com.estacio.neto.aula6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.estacio.neto.aula6.data.ClienteDAO;
import com.estacio.neto.aula6.models.Cliente;

import java.text.MessageFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGravar = findViewById(R.id.btnGravar);

        btnGravar.setOnClickListener((View view) -> {
            EditText txtNome = findViewById(R.id.txtNome);
            String nome = txtNome.getText().toString();
            ClienteDAO dao = new ClienteDAO(this);
            Cliente cliente = new Cliente();
            cliente.setNome(nome);
            long id = dao.inserirCliente(cliente);
            Toast.makeText(this, "Cliente cadastrado com id: " + id,
                    Toast.LENGTH_SHORT).show();
        });
    }
}