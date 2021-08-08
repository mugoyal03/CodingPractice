package com.example.multithreading;

public class ProducerConsumerDemo {

    public static void main(String[] args) {
        Count shared = new Count(0);

        Producer producer = new Producer(shared);
        Consumer consumer = new Consumer(shared);

        try {
            producer.t.join();
            consumer.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Producer implements Runnable{

    Count c;
    Thread t;
    public Producer(Count c) {
        this.c = c;
        t  = new Thread(this,"Producer");
        t.start();
    }

    @Override
    public void run() {

        while(true){
            c.produce();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable{

    Count c;
    Thread t;
    public Consumer(Count c) {
        this.c = c;
        t  = new Thread(this,"Consumer");
        t.start();
    }

    @Override
    public void run() {

        while(true){
            c.consume();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Count{
    private int c;

    private static final int SIZE=10;

    public Count(int c) {
        this.c = c;
    }

    public synchronized void produce() {
        if(c>=SIZE){
            // Wait for Consumer to consume!!!
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Producer produced: " + (++c) );

        if (c==1)
            notify();
    }

    public synchronized void consume(){
        if(c<=0){
            // Wait for Producer to produce
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumer consumed: " + this.c-- );

        if(c<SIZE)
            notify();
    }
}
