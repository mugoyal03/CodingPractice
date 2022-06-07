package com.example.helloworld;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class _6_BucketSort {

    public static void main(String[] args) {

        double a[] = { (double)0.897, (double)0.565,
                (double)0.656, (double)0.1234,
                (double)0.665, (double)0.3434 };

        Arrays.stream(a).forEach(System.out::print);
        sort(a,a.length);
        System.out.println();
        Arrays.stream(a).forEach((sorted)->{System.out.print(sorted+", ");});
        
    }

    public static void sort(double arr[],int n) {
        Vector<Double>[] list = new Vector[n];
        for (int i = 0; i < arr.length; i++) {
            list[i] = new Vector<Double>();
        }

        for (int i = 0; i < arr.length; i++) {
            double dbl = arr[i] * n;
            list[(int) dbl].add(arr[i]);
        }

        // Sort the individual List
        for (int i = 0; i < arr.length; i++) {
            Collections.sort(list[i]);
        }

        // Replace original arr[] with Sorted list
        int cn = 0;
        for (Vector<Double> vec : list) {
            for (Double val : vec) {
                arr[cn++] = val;
            }
        }
    }
}
