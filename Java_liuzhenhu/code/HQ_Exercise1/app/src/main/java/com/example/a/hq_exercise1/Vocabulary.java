package com.example.a.hq_exercise1;

/**
 * Created by a on 2019/11/30.
 */

public class Vocabulary {
    private Integer number;
    private String word;
    private Integer frequency;

    public Vocabulary(int number,String word,Integer frequency){
        this.number=number;
        this.word=word;
        this.frequency=frequency;
    }

    public Integer getNumber(){
        return number;
    }
    public String getWord(){
        return word;
    }
    public Integer getFrequency(){
        return frequency;
    }
}
