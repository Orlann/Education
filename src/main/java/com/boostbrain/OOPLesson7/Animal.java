package com.boostbrain.OOPLesson7;

public abstract class Animal {
    private String name;
//    private String speed;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void voice() {
        System.out.println("Animal voice");
    }

    public void printSpeed(int speed) {
        System.out.println(String.format("Animal speed is %s", speed));
    }
}
