package com.metanit.streams;

public class ExceptionExample extends Exception {
    private String text;

    public ExceptionExample(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
