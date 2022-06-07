package com.example.helloworld;

public class NumberOfSubsequencesInaStringDivisibleByN {

    public static void main(String[] args) {
        String str = "1234";
        System.out.println();

    }

    public static int find(String str, int k){
        if(str.length()<1)
            return 0;
        if(str.length()==1){
            if(stringToInt(str)%k==0)
                return 1;
        }

        for(char ch: str.toCharArray()){

            // Number of Such strings without ch
            //                 +
            // Number of Such strings with ch
            //                 +
            //                 1 (if  )
        }

        return 1;
    }

    public static int stringToInt(String str){
        return Integer.parseInt(str);
    }
}

final class MyImMutableClass{

    int value;

    public MyImMutableClass(int value) {
        this.value = value;
    }

    public void print(){
        System.out.println(value);
    }
}
