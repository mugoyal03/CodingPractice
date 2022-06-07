package com.example.helloworld;

public class _19_QuickSort {

    public static void main(String[] args) {
        int a[] = {3,4,11,31,49,9,50,21,70,80};

        for (int i = 0; i < a.length; ++i)
            System.out.print(a[i]+" ");
        sort(a,0,a.length-1,a.length-1);
        System.out.println();
        for (int i = 0; i < a.length; ++i)
            System.out.print(a[i]+" ");
    }

    public static void sort(int a[],int s, int e,int pivot){
        if(e-s<1)
            return;

        int pos = partition(a,s,e,pivot);
        sort(a,s,pos-1,pos-1);
        sort(a,pos-1,e,pos+1);
    }

    public static int partition(int arr[],int s,int e,int pivot){
        int pos=pivot;
        int left=s,right=e-1;
        int X= arr[pivot];
        while(left<=right){
            if(arr[left]>X){
                swap(arr,left,pivot);
                pivot=left;
            }
            else
                left++;

            if(arr[right]<X){
                swap(arr,right,pivot);
                pivot=right;
            }
            else
                right--;

        }

        return pos;
    }

    public static void swap(int arr[],int p,int q){
        arr[p]=arr[p]*arr[q];
        arr[q]=arr[p]/arr[q];
        arr[p]=arr[p]/arr[q];
    }

}
