package com.example.codility;

public class LargeSentence {

    public static void main(String[] args) {
        String str = "Forget          CVs..Save time . x x"; //"We are Coders. Give us a try?Morning! ";
        String[] split = str.split("[.?!]");
        int max=0;
        for(String s : split) {
            int l = s.trim().replaceAll(" +"," ").split(" ").length;
            System.out.println("Sentence: "+ s);
            if (l > max)
                max = l;
        }
        System.out.println(max);
    }
}
