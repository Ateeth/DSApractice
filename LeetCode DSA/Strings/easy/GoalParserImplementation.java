//Problem Link : https://leetcode.com/problems/goal-parser-interpretation/
package com.ateeth.LeetCodeDSA.strings.easy;

import java.util.Scanner;

public class GoalParserImplementation {
    public static String interpret(String command) {
        StringBuilder ans = new StringBuilder() ;
        int i = 0 ;
        while(i < command.length()){
            if(command.charAt(i) == 'G'){
                ans.append("G") ;
                ++i ;
            }else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')'){
                ans.append("o") ;
                i += 2 ;
            }else if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a' && command.charAt(i + 2) == 'l' && command.charAt(i + 3) == ')') { // case of (al)
                ans.append("al") ;
                i += 4 ;
            }
        }
        return ans.toString() ;
    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in) ;
        System.out.println("Enter the string : ");
        String str = sc.next() ;
        String ans = interpret(str);
        System.out.println(ans);
    }
}
