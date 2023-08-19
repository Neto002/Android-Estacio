package com.estacio.neto.aula6.data;

// import android.database.sqlite.SQLiteDatabase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbConnection extends SQLiteOpenHelper {
    private static final String NAME = "banco.db";
    private static final int VERSION = 1;
    // private static final SQLiteDatabase.CursorFactory factory = null;

    public DbConnection(Context context) {
        super(context, NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(
                "CREATE TABLE cliente(" +
                        "id integer primary key autoincrement," +
                        " nome varchar(50))"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
