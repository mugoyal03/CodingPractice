package com.example.company;

import java.util.Arrays;

public class Accolite {

    public static void main(String[] args) {

        String str="5321"; // 54321 // 2659 = 2569
        String reverseStr="";
        for (int i = str.length()-1; i >=0; i--) {
            reverseStr+=str.charAt(i);
        }
        char[] chArr = str.toCharArray() ;
        Arrays.sort(chArr);
        if(Arrays.equals(chArr, str.toCharArray()))
            System.out.println("NOT POSSIBLE");
        else{
            System.out.println(reverseStr);
        }
    }
}
