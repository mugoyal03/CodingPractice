package com.example.ruff;

import java.util.Arrays;
import java.util.List;

public class StreamReduceMethod {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        System.out.println(list.parallelStream().reduce(0,(a,b)->a+b+1));
    }
}
