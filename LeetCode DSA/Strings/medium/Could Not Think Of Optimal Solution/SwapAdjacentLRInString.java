//Problem Link : https://leetcode.com/problems/swap-adjacent-in-lr-string/
package com.ateeth.LeetCodeDSA.strings.Medium.CouldNotThinkOfOptimalSolution;

import java.util.Scanner;

public class SwapAdjacentLRInString {
    public static boolean canTransform(String start, String end) {
        if (!start.replace("X", "").equals(end.replace("X", "")))
            return false;

        int p1 = 0;
        int p2 = 0;

        while(p1 < start.length() && p2 < end.length()){

            // get the non-X positions of 2 strings
            while(p1 < start.length() && start.charAt(p1) == 'X'){
                p1++;
            }
            while(p2 < end.length() && end.charAt(p2) == 'X'){
                p2++;
            }

            //if both of the pointers reach the end the strings are transformable
            if(p1 == start.length() && p2 == end.length()){
                return true;
            }
            // if only one of the pointer reach the end they are not transformable
            if(p1 == start.length() || p2 == end.length()){
                return false;
            }

            if(start.charAt(p1) != end.charAt(p2)){
                return false;
            }
            // if the character is 'L', it can only be moved to the left. p1 should be greater or
            // equal to p2.
            if(start.charAt(p1) == 'L' && p2 > p1){
                return false;
            }
            // if the character is 'R', it can only be moved to the right. p2 should be greater or
            // equal to p1.
            if(start.charAt(p1) == 'R' && p1 > p2){
                return false;
            }
            p1++;
            p2++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();

        System.out.println("Enter the string : ");
        String str1 = sc.nextLine();

        boolean ans = canTransform(str , str1) ;
        System.out.println(ans);
    }
}
