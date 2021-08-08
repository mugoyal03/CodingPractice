package com.example.multithreading;

import java.util.concurrent.Exchanger;

public class ExchangerDemo {

    public static void main(String[] args) {
        Exchanger<String> ex = new Exchanger<>();


        try {
            String str = ex.exchange( "Hello!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
