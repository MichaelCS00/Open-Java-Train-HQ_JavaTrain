package com.example.a.hq_exercise1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by a on 2019/11/30.
 */

public class VocabularyAdapter extends ArrayAdapter<Vocabulary>{


    private int resourceId;

    public VocabularyAdapter(Context context, int textViewResourceId, List<Vocabulary> objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Vocabulary vocabulary=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        TextView number=(TextView) view.findViewById(R.id.text_view1);
        TextView word=(TextView) view.findViewById(R.id.text_view2);
        TextView frequency=(TextView) view.findViewById(R.id.text_view3);
        number.setText(vocabulary.getNumber().toString());
        word.setText(vocabulary.getWord());
        frequency.setText(vocabulary.getFrequency().toString());
        return view;
    }

}
