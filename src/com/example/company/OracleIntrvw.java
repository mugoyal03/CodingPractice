package com.example.company;

public class OracleIntrvw {

    public static void main(String[] args) {
        String input = "aaabccddd";

        String remaining = input.substring(1);
        String previousRes = input.substring(0,1);

        while(remaining.length() !=0) {
            char newChar = remaining.charAt(0);
            remaining = remaining.substring(1);

            if(previousRes.charAt(previousRes.length()-1) == newChar){
                previousRes= previousRes.substring(0,previousRes.length()-2);
            }
        }
        System.out.println(previousRes);

    }
}


/*
* input 1 : aaabccddd | output : abd | Explanation : aaabccddd → abccddd → abddd → abd

 * */