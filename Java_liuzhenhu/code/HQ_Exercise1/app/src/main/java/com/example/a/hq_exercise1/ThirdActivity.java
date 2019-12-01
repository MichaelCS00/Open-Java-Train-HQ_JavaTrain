package com.example.a.hq_exercise1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ThirdActivity extends AppCompatActivity {
    private MyDatabaseHelper dbHelper;
    private List<Vocabulary> vocabularyList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        //查询表格
        dbHelper=new MyDatabaseHelper(this,"TheOldManAndTheSea.db",null,2);
        SQLiteDatabase db=dbHelper.getWritableDatabase();
        Cursor cursor=db.query("VocabularyAndFrequency",null,null,null,null,null,null);
        if(cursor.moveToFirst()){
            do{
                int d=cursor.getInt(cursor.getColumnIndex("id"));
                String v=cursor.getString(cursor.getColumnIndex("vocabulary"));
                Integer f=cursor.getInt(cursor.getColumnIndex("frequency"));
                if(f<1000) break;
                Vocabulary vocabulary=new Vocabulary(d,v,f);
                vocabularyList.add(vocabulary);
            }while(cursor.moveToNext());
        }
        cursor.close();
        //ListView
        VocabularyAdapter adapter=new VocabularyAdapter(
                ThirdActivity.this,R.layout.vocabulary_item,vocabularyList);
        ListView listView =(ListView) findViewById(R.id.list_view3);
        listView.setAdapter(adapter);
    }
}
