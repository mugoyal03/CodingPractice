package com.example.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        ArrayList<String> listArr= new ArrayList<>();
        List<String> list = new LinkedList<>();
        listArr.add("AC");
        System.out.println(listArr.get(0));
        listArr.ensureCapacity(100);
        listArr.forEach((s -> System.out.println(s)));

        String s = new String("a");
        Integer b = Integer.valueOf(1);
        b.compareTo(1);
        s.compareTo("");
    }
}
