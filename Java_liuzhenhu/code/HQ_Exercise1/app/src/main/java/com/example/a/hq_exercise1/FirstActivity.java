package com.example.a.hq_exercise1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity extends AppCompatActivity {
    private MyDatabaseHelper dbHelper;
    private List<Vocabulary> vocabularyList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        //查询表格
        dbHelper=new MyDatabaseHelper(this,"TheOldManAndTheSea.db",null,2);
        SQLiteDatabase db=dbHelper.getWritableDatabase();
        Cursor cursor=db.query("VocabularyAndFrequency",null,null,null,null,null,null);
        if(cursor.moveToFirst()){
            do{
                int d=cursor.getInt(cursor.getColumnIndex("id"));
                String v=cursor.getString(cursor.getColumnIndex("vocabulary"));
                int f=cursor.getInt(cursor.getColumnIndex("frequency"));
                Vocabulary vocabulary=new Vocabulary(d,v,f);
                vocabularyList.add(vocabulary);
            }while(cursor.moveToNext());
        }
        cursor.close();
        //ListView
        VocabularyAdapter adapter=new VocabularyAdapter(
                FirstActivity.this,R.layout.vocabulary_item,vocabularyList);
        ListView listView =(ListView) findViewById(R.id.list_view1);
        listView.setAdapter(adapter);
    }
}
