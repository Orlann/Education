package com.boostbrain.threadsLesson20;

public class Ticker implements Runnable {
    private final String name;

    public Ticker(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println(name+": "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
