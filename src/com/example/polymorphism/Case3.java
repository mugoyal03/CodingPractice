package com.example.polymorphism;

public class Case3 {
    public static void main(String[] args) {
        Case3 case3 = new Case3();
        // Integer test will get called. Number class is abstract
        case3.test(1);
    }

    void test(Number a){
        System.out.println("Number");
    }
    void test(Integer b){
        System.out.println("Integer");
    }

}
