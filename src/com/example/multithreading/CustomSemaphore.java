package com.example.multithreading;

import java.util.concurrent.Semaphore;

public class CustomSemaphore {
    int count;
    Semaphore sem = new Semaphore(1);

    public CustomSemaphore(int count) {
        this.count = count;
    }

    public void acquire(){
        Thread t = Thread.currentThread();

    }

    public void release(){

    }

}
