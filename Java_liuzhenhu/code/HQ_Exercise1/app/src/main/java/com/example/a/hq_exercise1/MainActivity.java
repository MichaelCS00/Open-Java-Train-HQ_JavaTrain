package com.example.a.hq_exercise1;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //myTreeMap用于存储词汇和词频
    private static TreeMap<String,Integer> myTreeMap=new TreeMap<String,Integer>();

    private MyDatabaseHelper dbHelper;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获得词汇与词频
        getWords();

        //创建表格
        dbHelper=new MyDatabaseHelper(this,"TheOldManAndTheSea.db",null,2);
        SQLiteDatabase db=dbHelper.getWritableDatabase();

        //将词汇与词频存入表格
        wordsToTable();

        //搜索按钮
        Button button=(Button) findViewById(R.id.button_search);
        editText=(EditText) findViewById(R.id.edit_text);
        button.setOnClickListener(this);

        //按钮1
        Button createAllVocabulary=(Button) findViewById(R.id.button_1);
        createAllVocabulary.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,FirstActivity.class);
                startActivity(intent);
            }
        });

        //按钮2
        Button createTenVocabulary=(Button) findViewById(R.id.button_2);
        createTenVocabulary.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });

        //按钮3
        Button createTopThousandVocabulary=(Button) findViewById(R.id.button_3);
        createTopThousandVocabulary.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button_search:
                String inputText=editText.getText().toString();
                //遍历表格
                dbHelper=new MyDatabaseHelper(this,"TheOldManAndTheSea.db",null,2);
                SQLiteDatabase db=dbHelper.getWritableDatabase();
                Cursor cursor=db.query("VocabularyAndFrequency",null,null,null,null,null,null);
                String findFrequency=new String();
                if(cursor.moveToFirst()){
                    do{
                        String w=cursor.getString(cursor.getColumnIndex("vocabulary"));
                        Integer f=cursor.getInt(cursor.getColumnIndex("frequency"));
                        if(w.equals(inputText)) {findFrequency=f.toString();break;}
                    }while(cursor.moveToNext());
                }
                cursor.close();
                Toast.makeText(MainActivity.this,inputText+"的词频是"+findFrequency,Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
    }

    /**
     * getWords用于获取全部单词和词频，并存储到myTreeMap中去
     */
    public void getWords() {
        InputStreamReader isr = null;
        BufferedReader br = null;
        try {
            InputStream is = getResources().openRawResource(R.raw.theoldmanandthesea); // 节点类
            isr = new InputStreamReader(is, "UTF-8"); // 转化类
            br = new BufferedReader(isr); // 装饰类
            String line;
            StringBuffer c = new StringBuffer();
            int count = 0;
            while ((line = br.readLine()) != null) {
                c.append(line);
            }
            String m = c.toString().toLowerCase();
            String[] d = m.split("[^a-zA-Z]+");
            //将单词和其出现频率存入映射中
            for (int i = 0; i < d.length; i++) {
                if (myTreeMap.containsKey((d[i]))) {
                    count = myTreeMap.get(d[i]);
                    myTreeMap.put(d[i], count + 1);
                } else {
                    myTreeMap.put(d[i], 1);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void wordsToTable(){
        //创建表格
        dbHelper=new MyDatabaseHelper(this,"TheOldManAndTheSea.db",null,2);
        SQLiteDatabase db=dbHelper.getWritableDatabase();
        //获取词汇并按词频降序排序
        List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(myTreeMap.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<String,Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return -o1.getValue().compareTo(o2.getValue());
            }
        });
        //将数据添加进表格
        for(Map.Entry<String,Integer> mapping:list){
            ContentValues values=new ContentValues();
            values.put("vocabulary",mapping.getKey());
            values.put("frequency",mapping.getValue());
            db.insert("VocabularyAndFrequency",null,values);
            values.clear();
        }
    }
}
