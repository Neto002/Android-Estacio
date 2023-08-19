package com.estacio.neto.aula3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    final EditText n = (EditText) findViewById(R.id.txtUsuario);
                    TextView tLogin = (TextView) findViewById(R.id.txtUsuario);
                    TextView tSenha = (TextView) findViewById(R.id.txtSenha);

                    String login = tLogin.getText().toString();
                    String senha = tSenha.getText().toString();

                    if (login.equals("neto") && senha.equals("123")) {
                        alert("login realizado");
                    } else {
                        alert("login invalido");
                    }
            }
        });
    }



    private void alert(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}