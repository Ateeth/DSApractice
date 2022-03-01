//Problem Link : https://leetcode.com/problems/reverse-words-in-a-string-iii/
package com.ateeth.LeetCodeDSA.strings.easy;

import java.util.Scanner;

public class ReverseWordsInAStringIII {
    public static String reverseWords(String s) {
        String[] words = s.split(" ") ;
        StringBuilder sb = new StringBuilder() ;
        StringBuilder ans = new StringBuilder() ;

        for(String word : words){
            sb.append(word) ;
            sb.reverse() ;

            ans.append(sb + " ") ;
            sb.setLength(0) ;
        }

        String res = ans.substring(0 , ans.length() - 1).toString() ;
        return res ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();

        String ans = reverseWords(str) ;
        System.out.println(ans);
    }
}
