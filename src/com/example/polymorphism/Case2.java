package com.example.polymorphism;

public class Case2 {

    public static void main(String[] args) {
        Case2 case2 = new Case2();

        // int will get priority
        case2.test(1,2);

        // Integer will get priority
        case2.test(1,null);


        // Compiler error : Ambiguous call
        //case2.test(null,null);


    }


    void test(Integer a, Integer b){
        System.out.println("Integer");
    }
    void test(int a, int b){
        System.out.println("int");
    }

    void test(Float a, Float b){
        System.out.println("Float");
    }

}
