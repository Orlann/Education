package com.boostbrain.threadsLesson20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample {
    public static void main(String[] args) {
        Ticker first = new Ticker("First Thread");
        Ticker second = new Ticker("Second Thread");
//        first.run();      run separate thread
//        second.run();     run separate thread

        ExecutorService executorService = Executors.newFixedThreadPool(2);  // create pool of threads
        executorService.submit(first);
        executorService.submit(second);
        
    }
}
