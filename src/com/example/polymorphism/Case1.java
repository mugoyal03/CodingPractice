package com.example.polymorphism;

public class Case1 {

    public static void main(String[] args) {
        Case1 case1 = new Case1();
        parent p = case1.new child();

        p.show();
    }


    class grand{
        public void show(){
            System.out.println("I AM Grand Parent!");
        }
    }

    class parent extends grand{
        public void show(){
            System.out.println("I AM Parent Parent!");
        }
    }

    class child extends parent{
        public void show(){
            System.out.println("I AM Child!");
        }
    }


}
