package com.example.multithreading.concurrent.dinningphilosopher;

import java.util.concurrent.Semaphore;

public class Philosopher implements Runnable{
    static enum STATE{
        EATING,THINKING
    }
    int eatTime;
    int thinkTime;
    int id;
    STATE currentState;
    Semaphore left;
    Semaphore right;


    public Philosopher(int id, int eatTime, int thinkTime, STATE initialState, Semaphore left, Semaphore right) {
        this.id = id;
        this.eatTime = eatTime;
        this.thinkTime = thinkTime;
        this.currentState = initialState;
        this.left = left;
        this.right = right;
        new Thread(this,"Philosopher_"+this.id).start();
    }

    @Override
    public void run() {
        while(true){
            try {
                think();

                if(this.id==0){
                    right.acquire();
                    left.acquire();
                }
                else{
                    left.acquire();
                    right.acquire();
                }

                eat();

                left.release();
                right.release();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    private void eat() throws InterruptedException {
        System.out.println("Philosopher "+ this.id + " is eating....");
        Thread.sleep(eatTime);

    }

    private void think() throws InterruptedException {
        System.out.println("Philosopher "+ this.id + " is thinking....");
        Thread.sleep(thinkTime);
    }

}
