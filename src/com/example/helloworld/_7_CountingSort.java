package com.example.helloworld;

import java.util.Arrays;

public class _7_CountingSort {

    public static void main(String[] args) {

        char a[] = { 'g', 'e', 'e', 'k', 's', 'f', 'o',
                'r', 'g', 'e', 'e', 'k', 's' };
        for (int i = 0; i < a.length; ++i)
            System.out.print(a[i]);
        sort(a);
        System.out.println();
        for (int i = 0; i < a.length; ++i)
            System.out.print(a[i]);
    }

    public static void sort(char[] arr){
        int[] countArr = new int[256];
        for (int i = 1; i < 256; ++i)
            countArr[i] = 0;

        for(int i=0;i<arr.length;i++){
            countArr[arr[i]]++;
        }

        for (int i = 1; i <= 255; ++i)
            countArr[i] += countArr[i - 1];

        char b[] = new char[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            b[countArr[arr[i]] - 1] = arr[i];
            --countArr[arr[i]];
        }

        for (int i = 0; i < arr.length; ++i)
            arr[i] = b[i];
    }
}
