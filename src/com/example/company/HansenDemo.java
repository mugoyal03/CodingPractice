package com.example.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HansenDemo {

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(2,4,21,66,7,55);
        List<Integer> B = Arrays.asList(2,7,21,66,9,71);

        // Tast1 = Delta = 4,55    9,71
        List<Integer> A_Delta = A.stream().filter((a)->{
            if(!B.contains(a))
                return true;
            return false;
        }).collect(Collectors.toList());

        List<Integer> B_Delta = B.stream().filter((b)->{
            if(!A.contains(b))
                return true;
            return false;
        }).collect(Collectors.toList());

        A_Delta.forEach(System.out::println);
        B_Delta.forEach(System.out::println);

        // Tast2 Prime = 71


    }
}
