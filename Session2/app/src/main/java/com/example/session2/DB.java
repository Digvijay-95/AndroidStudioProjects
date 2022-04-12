package com.example.session2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DB extends SQLiteOpenHelper {

    private static final String DB_NAME = "RIT";
    private static final int DB_VERSION = 1;

    public DB(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE USER (EMAIL TEXT, PASSWORD TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        //sqLiteDatabase.execSQL("DROP TABLE IF EXISTS USER");
        onCreate(sqLiteDatabase);

    }

    public  void  InsertRecord(String email, String password){
        SQLiteDatabase DD;
        DD = getWritableDatabase();
        ContentValues contentValues  = new ContentValues();
        contentValues.put("EMAIL",email);
        contentValues.put("PASSWORD",password);
        DD.insert("USER",null,contentValues);
    }
    public Cursor selectRecord(){
        SQLiteDatabase dd = getReadableDatabase();
        Cursor cursor = dd.rawQuery("SELECT * FROM USER",null);
        return cursor;
    }

}
