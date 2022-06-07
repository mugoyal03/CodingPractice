package com.example.codility;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class LowestIntNotInArrayAndGT0 {
    public static void main(String[] args) {
        int A[] = {-1,2};//{1,3,6,4,1,2};
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        Arrays.sort(A);
        int l =A.length;

        int j;
        for (j=0;j<A.length-1;j++) {
            if ((A[j] & Integer.MIN_VALUE) < 0) // continue in case of -ve Integers
                continue;
            if((A[j+1] - A[j])>1){
                return A[j]+1;
            }
        }
        if(j==l){
            // Element is greater than all element in A
        }
        return A[j]+1;
    }

    public static int solution2(int[] A) {
        Set<Integer> set = new TreeSet<>();

        int l =A.length;
        int res=1;
        for (int j=0;j<A.length-1;j++) {
            if ((A[j] & Integer.MIN_VALUE) < 0) // continue in case of -ve Integers
                continue;
            if((A[j+1] - A[j])>1){
                return A[j]+1;
            }
        }
        return res;
    }
}
