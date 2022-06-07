package com.example.codility;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EOYBalance {
    public static void main(String[] args) {
        int A[] = {180, -50, -25, -25};
        String[] D = {"2020-01-01", "2020-01-01", "2020-01-01", "2020-01-31"};

        System.out.println(solution(A,D));
    }

    public static int solution(int[] A, String[] D) {
        Map<Integer, List<Integer>> groupByMonth = new HashMap<>();
        int balance=-60;
        for(int i=0;i<A.length;i++){
            int month = LocalDate.parse(D[i]).getMonthValue();
            if(groupByMonth.containsKey(month)){
                List<Integer> list = groupByMonth.get(month);
                list.add(A[i]);
                groupByMonth.put(month,list);
            }
            else{
                List<Integer> list = new ArrayList<>();
                list.add(A[i]);
                groupByMonth.put(month,list);
            }
        }
        List<Integer> eachMonthBalance = groupByMonth.entrySet().stream().map(monthTotal->{
            List<Integer> list = monthTotal.getValue();
            int monthy_balance=0;
            for(int y :list)
                monthy_balance+=y;
            if(areThereThreePayment(monthTotal.getKey(),list))
                monthy_balance+=5;
            return monthy_balance;
        }).collect(Collectors.toList());

        for(int x :eachMonthBalance)
            balance+=x;

        return balance;
    }

    public static boolean areThereThreePayment(int month,List<Integer> list){
        // Apply Fee : at least 3 Txsn of sum at least 100
        int trxnCount=0;
        int sumCount=0;
        for (Integer integer : list) {
            if(integer<0){
                trxnCount++;
                sumCount+=integer;
            }
        }
        System.out.println("For Month "+month+" Trxsncount: "+trxnCount + " sumCount: " + sumCount );
        if(trxnCount>=3 && sumCount>=100) {
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;

    }
}
