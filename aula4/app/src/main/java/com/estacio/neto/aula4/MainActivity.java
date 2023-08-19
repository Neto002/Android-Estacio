package com.estacio.neto.aula4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.estacio.neto.aula4.enums.EstadoAtual;
import com.estacio.neto.aula4.model.Curso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Curso> cursos = todosOsCursos();
        ListView listaCursos = findViewById(R.id.listCursos);

        ArrayAdapter<Curso> adapter = new ArrayAdapter<Curso>(
                this, android.R.layout.simple_list_item_1, cursos);

        listaCursos.setAdapter(adapter);
    }

    private List<Curso> todosOsCursos() {
        return new ArrayList<>(Arrays.asList(
                new Curso("Java", "Básico de Java", EstadoAtual.CONCLUIDO),
                new Curso("HTML e CSS", "Novidades", EstadoAtual.EM_ANDAMENTO),
                new Curso("Android", "Boas Práticas", EstadoAtual.INSCRICOES_ABERTAS)
        ));
    }
}