package com.estacio.neto.aula6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import com.estacio.neto.aula6.data.ClienteDAO;
import com.estacio.neto.aula6.models.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListarClientesActivity extends AppCompatActivity {

    private ListView listView;
    private ClienteDAO dao;
    private List<Cliente> clientes;
    private List<Cliente> clientesFiltrados = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_clientes);

        listView = findViewById(R.id.lista_clientes);
        dao = new ClienteDAO(this);
        clientes = dao.obterTodos();
        clientesFiltrados.addAll(clientes);

        ArrayAdapter<Cliente> adaptador = new ArrayAdapter<Cliente>(this,
                //android.R.layout.simple_list_item_1, clientes);
                android.R.layout.simple_list_item_1, clientesFiltrados);

        listView.setAdapter(adaptador);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater i = getMenuInflater();
        i.inflate(R.menu.menu_principal, menu);

        SearchView sv = (SearchView) menu.findItem(R.id.appBarSearch).getActionView();

        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                procuraCliente(s);
                return false;
            }
        });

        return true;
    }

    @Override
    public void onResume() {
        super.onResume();
        clientes = dao.obterTodos();
        clientesFiltrados.clear();
        clientesFiltrados.addAll(clientes);
        listView.invalidateViews();
    }

    public void cadastrar(MenuItem item) {
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }

    private void procuraCliente(String nome) {
        clientesFiltrados.clear();
        for (Cliente c: clientes) {
            if (c.getNome().toLowerCase().contains(nome.toLowerCase())) {
                clientesFiltrados.add(c);
            }
        }
        listView.invalidateViews();
    }
}