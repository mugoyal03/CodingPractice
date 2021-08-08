package com.example.helloworld;

import java.util.Arrays;

public class _2_MergeSort {
    public static void main(String[] args) {

        int a[]={1,2,3,4,5,6,7,1};
        Arrays.stream(a).forEach((ab)->{System.out.print(ab+", ");});
        sort(a,0,a.length-1);
        System.out.println();
        Arrays.stream(a).forEach((ab)->{System.out.print(ab+", ");});
    }

    public static  void sort(int arr[],int S,int E){

        // Boundary Conditions
        if((E-S)<=1){
            if(arr[S]>arr[E]){
                swap(arr,S,E);
            }
            return;
        }
        // Divide And Conquer
        int M = (S+E)/2;
        sort(arr,S,M);
        sort(arr,M+1,E);
        merge(arr,S,M,E);
    }

    // In-place sorting
    public static void merge(int arr[],int S, int M, int E){
        int ptr1=S;
        int ptr2=M+1;

        while(ptr1<ptr2 && ptr2<=E){
            if(arr[ptr2]<arr[ptr1]){
                for(int i=ptr2-1;i>=ptr1;i--){
                    swap(arr,i,i+1);
                }
                ptr2++;
            }
            ptr1++;
        }

    }

    public static void swap(int arr[], int p,int q){
        arr[p]=arr[p]*arr[q];
        arr[q]=arr[p]/arr[q];
        arr[p]=arr[p]/arr[q];
    }
}
