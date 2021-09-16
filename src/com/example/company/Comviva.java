package com.example.company;

import java.util.stream.IntStream;

public class Comviva {
    public static void main(String[] args) {

        IntStream.rangeClosed(1,10).filter(value -> value%2==0).forEach(System.out::println);

    }
}
