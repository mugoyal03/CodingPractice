package com.example.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Result {

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int n = s.size(),res=0;

        if((n-m+1)<0)
            return res;

        for(int i=0;i<(n-m+1);i++){
            int sum=0;
            for(int j=i;j<(i+m);j++){
                sum+=s.get(j);
            }
            if(sum==d)
                res++;
        }

        return res;
    }

}

public class SubArrayDivision {
    public static void main(String[] args) {

        int n = 5;

        List<Integer> s = new ArrayList<Integer>();
        s.add(2);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);

        int d = 3;

        int m = 2;

        int result = Result.birthday(s, d, m);


        Map<String,String> map = new HashMap<String ,String>(100);
    }
}

