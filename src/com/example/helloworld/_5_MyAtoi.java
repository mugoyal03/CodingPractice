package com.example.helloworld;

import java.math.BigDecimal;
import java.util.Optional;

public class _5_MyAtoi {

    public static void main(String[] args) {

        System.out.println(myAtoi("123"));
    }

    public static long myAtoi(String str){
        long num = 0;

        for(int i=0;i<str.length();i++){
            num=num*10 + str.charAt(i) - '0';
        }

        return num;
    }
}
