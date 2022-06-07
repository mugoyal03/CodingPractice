package com.example.company;

import java.util.*;
import java.util.stream.IntStream;

public class GlobalLogic {

    public static void main(String[] args) {

        List list = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        int[] aa= {1,2,3};
        IntStream.of(aa).sum();
        Arrays.fill(aa,1);
        Math.min(2,3);

    }
}
