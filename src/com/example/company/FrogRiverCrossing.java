package com.example.company;

import java.util.*;

public class FrogRiverCrossing {

    public static void main(String[] args) {
        int[] Arr= {1,3,1,4,2,3,5,4};
        System.out.println(solution(5,Arr));
    }

    public static  int solution(int X, int[] A) {
        BitSet bits = new BitSet(X);
        bits.set(1,X+1);
        for (int i=0; i < A.length; i++) {
            bits.set(A[i],false);
            if(bits.isEmpty())
                return i;
        }
        return -1;
    }

}
