package com.example.ruff;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Test {

    static int A[] = {1, 3, 6, 4, 1, 2};

    public static void main(String[] args) {



        Map<Object, String> map = new HashMap<>();
        boolean X = "ABC".equals(new String("ABC"));
        boolean y = ("XYZ" == "XYZ");
        boolean z = ("PQR" == new String("PQR"));
        System.out.println("Value X: " + X);
        System.out.println("Value y: " + y);
        System.out.println("Value z: " + z);
        System.out.println("Value z (applying biwise operator to String) : " + (~12));
        map.put(map, "Mukesh");
        int x= Integer.compareUnsigned(1,-1); // x: 0x00000001 y: 0xffffffff
        System.out.println(x);
        System.out.println(map);

        int N =10;
        IntStream.rangeClosed(1,N).parallel().forEach((a)->{
            if((a & 2) == 0){
                System.out.println("Fizz");
            }
            else if((a & 4) == 0){
                System.out.println("Buzz");
            }
            else
                System.out.println(a);
        });


    }
}


