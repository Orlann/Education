package com.boostbrain.OOPLesson7;

public abstract class AbstractDog extends Animal {
    private int dogSpeed = 120;




    @Override
    public void voice(){
        System.out.println("Dog voice");
    }

    public void writeSpeed(){
        super.printSpeed(dogSpeed);
    }
}
