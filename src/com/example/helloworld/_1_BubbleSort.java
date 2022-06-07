package com.example.helloworld;

import java.util.Arrays;

public class _1_BubbleSort {


    public static void main(String[] args) {

        int a[]={1,2,3,4,5,6,0};
        Arrays.stream(a).forEach((ab)->{System.out.print(ab+", ");});
        sort(a,a.length);
        System.out.println();
        Arrays.stream(a).forEach((ab)->{System.out.print(ab+", ");});
    }

    public static  void sort(int arr[],int N){

        for(int i=0;i<N-1;i++){
            for(int j=0;j<N-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    public static void swap(int arr[], int p,int q){
        int temp;
        temp= arr[p];
        arr[p]=arr[q];
        arr[q]=temp;
    }

}
