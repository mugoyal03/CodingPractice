package com.example.ruff;

import java.util.HashMap;
import java.util.Hashtable;

public class CountCharOccurance {

    public static void main(String[] args) {
        String str = "aadgg4560vfkaf999";

        HashMap<Character, Integer> map = new HashMap<>();
        Hashtable<String,String > table = new Hashtable<>();

        table.put(null,null);

        map.put(null,null);

        for(int i=0;i<str.length();i++){
            Character c = str.charAt(i);

            if(map.containsKey(c)){
                int x = map.get(c);
                x++;
                map.put(c,x);
            }
            else{
                map.put(c,1);
            }
        }
        System.out.println(map);

    }

}
