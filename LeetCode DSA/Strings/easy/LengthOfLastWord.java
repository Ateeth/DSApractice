//Problem Link : https://leetcode.com/problems/length-of-last-word/
package com.ateeth.LeetCodeDSA.strings.easy;

import java.util.Scanner;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ") ;
        return words[words.length-1].length() ;
    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in) ;
        System.out.println("Enter the string : ");
        String str = sc.next() ;

        int ans = lengthOfLastWord(str) ;
        System.out.println(ans);
    }
}
