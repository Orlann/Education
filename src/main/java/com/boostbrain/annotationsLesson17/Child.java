package com.boostbrain.annotationsLesson17;

@SuppressWarnings("unused")
public class Child extends Parent {

    @Override
    public void method(){
        this.method2();
    }

    @Deprecated
    public void method2(){

    }
}
