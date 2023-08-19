package com.estacio.neto.projetoav1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.estacio.neto.projetoav1.data.FornecedorDAO;
import com.estacio.neto.projetoav1.models.Fornecedor;

import java.text.MessageFormat;

public class InclusaoFornecedoresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inclusao_fornecedores);

        String tituloApp = getString(R.string.titulo);
        setTitle(tituloApp);

        Intent intent = getIntent();
        String usuario = (String) intent.getSerializableExtra("Usuario");

        TextView boasVindas = findViewById(R.id.lblUsuario);
        boasVindas.setText(MessageFormat.format(
                "Usuário(a) {0}, seja bem vindo(a) ao Formulário!", usuario));

        Button btnGravar = findViewById(R.id.btnGravar);

        btnGravar.setOnClickListener((View view) -> {
            EditText txtMatricula = findViewById(R.id.txtMatricula);
            String matricula = txtMatricula.getText().toString();

            EditText txtNome = findViewById(R.id.txtNome);
            String nome = txtNome.getText().toString();

            EditText txtCidade = findViewById(R.id.txtCidade);
            String cidade = txtCidade.getText().toString();

            EditText txtEstado = findViewById(R.id.txtEstado);
            String estado = txtEstado.getText().toString();

            FornecedorDAO dao = new FornecedorDAO(this);
            Fornecedor fornecedor = new Fornecedor();

            fornecedor.setMatricula(Integer.parseInt(matricula));
            fornecedor.setNome(nome);
            fornecedor.setCidade(cidade);
            fornecedor.setEstado(estado);

            long id = dao.inserirFornecedor(fornecedor);
            Toast.makeText(this, "Fornecedor cadastrado com id: " + id,
                    Toast.LENGTH_SHORT).show();
        });
    }
}