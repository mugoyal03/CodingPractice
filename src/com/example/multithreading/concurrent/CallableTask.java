package com.example.multithreading.concurrent;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {

    String year;

    public CallableTask(String year) {
        this.year = year;
    }

    @Override
    public String call() throws Exception {

        Thread.sleep(1000);

        return "Hello!!! I am from Future! Year : " + this.year;
    }
}
