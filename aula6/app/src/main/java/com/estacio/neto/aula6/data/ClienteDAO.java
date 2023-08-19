package com.estacio.neto.aula6.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.estacio.neto.aula6.models.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    public DbConnection dbConnection;
    public SQLiteDatabase banco;

    public ClienteDAO(Context context) {
        this.dbConnection = new DbConnection(context);
        this.banco = dbConnection.getWritableDatabase();
    }

    public long inserirCliente(Cliente cliente) {
        ContentValues values = new ContentValues();
        values.put("nome", cliente.getNome());

        return banco.insert("cliente", null, values);
    }

    public List<Cliente> obterTodos() {
        List<Cliente> clientes = new ArrayList<>();
        Cursor cursor = banco.query("cliente", new String[] {"id", "nome"}, null,
                null, null, null, null);

        while (cursor.moveToNext()) {
            Cliente c = new Cliente();
            c.setId(cursor.getInt(0));
            c.setNome(cursor.getString(1));
            clientes.add(c);
        }

        return clientes;
    }
}
