package com.example.a.hq_exercise1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by a on 2019/11/29.
 */

public class MyDatabaseHelper extends SQLiteOpenHelper{

    public static final String CREATE_VOCABULARY="create table VocabularyAndFrequency ("
            +"id integer primary key autoincrement,"
            +"vocabulary text,"
            +"frequency integer)";

    private Context mContext;

    public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context,name,factory,version);
        mContext=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_VOCABULARY);
        Toast.makeText(mContext,"Create VocabularyTable succeeded",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
        db.execSQL("drop table if exists VocabularyAndFrequency");
        onCreate(db);
    }
}
