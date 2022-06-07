package com.example.multithreading;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicRefDemo {
    volatile static boolean flag=false;
    static int c1=5,c2=5;
    public static void main(String[] args) {
        AtomicReference<Call> ref = new AtomicReference();

        ref.compareAndSet(null,null);
        Runnable logic = ()->{

            while ( (c1 & c2) != 0 ) {
                if ("Producer".equals(Thread.currentThread().getName())) {
                    if(!flag){
                        System.out.println("Produced");
                        flag = true;
                        c1--;
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }else {
                    if(flag){
                        System.out.println("Consumed");
                        flag = false;
                        c2--;
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        new Thread(logic,"Producer").start();
        new Thread(logic,"Consumer").start();
    }
}
