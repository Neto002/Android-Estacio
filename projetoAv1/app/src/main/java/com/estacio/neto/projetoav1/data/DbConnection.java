package com.estacio.neto.projetoav1.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DbConnection extends SQLiteOpenHelper {
    private static final String NAME = "banco.db";
    private static final int VERSION = 1;

    public DbConnection(Context context) {
        super(context, NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(
                "CREATE TABLE fornecedor(" +
                        "id integer primary key autoincrement," +
                        "matricula integer," +
                        "nome varchar(50)," +
                        "cidade varchar(50)," +
                        "estado varchar(50)" +
                ")"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
