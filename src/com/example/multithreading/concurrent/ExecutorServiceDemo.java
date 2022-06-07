package com.example.multithreading.concurrent;

import java.util.concurrent.*;

public class ExecutorServiceDemo {
    static Future<String> task;
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();

        task = service.submit(new CallableTask("2050"));
        System.out.println("Sicking help from Future Masiha!!");

        int futureWaitThreshold=0;
        while(!task.isDone() && futureWaitThreshold<3){
            futureWaitThreshold++;
            System.out.println("Waiting for Masiha from Future!!!!!");
            Thread.sleep(1000);
        }

        if(futureWaitThreshold>=3 && task.cancel(true))
            System.out.println("Masiha didn't show!! Save yourself!!!");
        else
            System.out.println(task.get());

        service.shutdown();

    }
}
