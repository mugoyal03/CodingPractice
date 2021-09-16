package com.example.company;

public class Zenart extends A{
    public void m1(){
        System.out.println("Zenart");
    }

    public static void main(String[] args) {
        //Zenart case1 = new A();  // COmPILE ERROR
        Zenart case2 = new Zenart();
        A case3  = new Zenart();
        A case4 = new A();

    }
}
class A{
    public void m1(){
        System.out.println("A");
    }
}
