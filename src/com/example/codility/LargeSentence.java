package com.example.codility;

import java.util.Arrays;

public class LargeSentence {

    public static void main(String[] args) {
        String str = "Forget          CVs..Save time . x x"; //"We are Coders. Give us a try?Morning! ";
        String spli[] = str.split("[.?!]");
        int max=0;
        for(String s : spli) {
            int l = s.trim().replaceAll(" +"," ").split(" ").length;
            System.out.println("Sentence: "+ s);
            if (l > max)
                max = l;
        }
        System.out.println(max);
    }
}
