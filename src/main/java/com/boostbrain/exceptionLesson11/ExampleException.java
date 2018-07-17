package com.boostbrain.exceptionLesson11;

public class ExampleException extends Exception{
    private String text;

    public ExampleException(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
