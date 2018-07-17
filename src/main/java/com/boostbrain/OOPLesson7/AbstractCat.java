package com.boostbrain.OOPLesson7;

public abstract class AbstractCat extends Animal {
    private int speed = 100;

    public int getSpeed() {
        return speed;
    }

    @Override
    public void voice(){
        System.out.println("Cat voice");
    }

    public void printSpeed() {
        super.printSpeed(this.speed);
    }


}
