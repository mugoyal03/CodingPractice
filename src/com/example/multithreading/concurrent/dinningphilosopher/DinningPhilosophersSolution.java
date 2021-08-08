package com.example.multithreading.concurrent.dinningphilosopher;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class DinningPhilosophersSolution {

    public static void main(String[] args) throws InterruptedException {
        int N=6;
        ArrayList<Semaphore> semaphores = new ArrayList<>();
        semaphores.add(new Semaphore(1));
        semaphores.add(new Semaphore(1));
        semaphores.add(new Semaphore(1));
        semaphores.add(new Semaphore(1));
        semaphores.add(new Semaphore(1));
        semaphores.add(new Semaphore(1));
        System.out.println(semaphores.size());


        new Philosopher(1,1000,2000,Philosopher.STATE.THINKING, semaphores.get(0), semaphores.get(5));
        new Philosopher(2,1000,2000,Philosopher.STATE.THINKING, semaphores.get(1), semaphores.get(0));
        new Philosopher(3,1000,2000,Philosopher.STATE.THINKING, semaphores.get(2), semaphores.get(1));
        new Philosopher(4,1000,2000,Philosopher.STATE.THINKING, semaphores.get(3), semaphores.get(2));
        new Philosopher(5,1000,2000,Philosopher.STATE.THINKING, semaphores.get(4), semaphores.get(3));
        new Philosopher(6,1000,2000,Philosopher.STATE.THINKING, semaphores.get(5), semaphores.get(4));

        /*ExecutorService service = Executors.newFixedThreadPool(N);

        IntStream.rangeClosed(0,N-1).forEach((i)->{
            int left = (i-1)<0?N-1:(i-1);
            int right = (i+1)>=N?0:(i+1);
            service.submit(new Philosopher(i,1000,2000,Philosopher.STATE.THINKING, semaphores.get(left), semaphores.get(right)));
        });

        service.shutdown();
        service.awaitTermination(10000, TimeUnit.MILLISECONDS);*/

    }
}
