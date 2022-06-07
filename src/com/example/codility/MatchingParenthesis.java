package com.example.codility;

import java.util.Deque;
import java.util.LinkedList;

public class MatchingParenthesis {
    public static void main(String[] args) {
        // 7,4,2,9,8,1 = 8
        System.out.println(new Solution().solution("{([][][])]"));
    }
    static class Solution {
        public int solution(String S) {
            // write your code in Java SE 8
            int l = S.length();
            Deque<Character> stack = new LinkedList<>();
            for(int i=0;i<l;i++){
                char ch = S.charAt(i);
                if( '{' == ch || '[' == ch || '(' == ch){
                    stack.push(ch);
                }
                else if(stack.isEmpty()){
                    return 0;
                }
                else{
                    Character opening = stack.pop();
                    if(!(ch-opening==1 || ch-opening==2))
                        return 0;
                }
            }

            return stack.isEmpty()?1:0;
        }
    }
}
