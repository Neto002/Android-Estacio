package com.estacio.neto.projetoav1.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.estacio.neto.projetoav1.models.Fornecedor;

public class FornecedorDAO {
    public DbConnection dbConnection;
    public SQLiteDatabase banco;

    public FornecedorDAO(Context context) {
        this.dbConnection = new DbConnection(context);
        this.banco = dbConnection.getWritableDatabase();
    }

    public long inserirFornecedor(Fornecedor fornecedor) {
        ContentValues values = new ContentValues();
        values.put("matricula", fornecedor.getMatricula());
        values.put("nome", fornecedor.getNome());
        values.put("cidade", fornecedor.getCidade());
        values.put("estado", fornecedor.getEstado());

        return banco.insert("fornecedor", null, values);
    }
}
