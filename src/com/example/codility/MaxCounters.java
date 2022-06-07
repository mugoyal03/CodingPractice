package com.example.codility;

import java.util.Arrays;

public class MaxCounters {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{3, 4, 4, 6, 1, 4, 4})));
    }

    public static int[] solution(int N, int A[]){
        int res[] = new int[N],MAX=0;
        Arrays.fill(res, MAX);
        for(int i=0;i<A.length;i++){
            if(A[i]>N){
                Arrays.fill(res, MAX);
            }
            else{
                res[A[i]-1]+=1;
                if(MAX<res[A[i]-1])
                    MAX++;
            }
        }
        return res;
    }

    public static int[] optimize(int N, int A[]){
        int res[] = new int[N],BASE=0;
        Arrays.fill(res, BASE);
        for(int i=0;i<A.length;i++){
            if(A[i]<=N){
                res[A[i]-1]+=1;
            }
        }

        return res;
    }

}
