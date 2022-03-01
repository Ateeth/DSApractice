//Problem Link : https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
package com.ateeth.LeetCodeDSA.strings.easy;

import java.util.Scanner;

public class NumberOfStringsThatAppearAsASubstringInAWord {
    public static int numOfStrings(String[] patterns, String word) {
        int ctr = 0 ;
        for(String pattern : patterns){
            if(word.contains(pattern)){
                ++ctr ;
            }
        }

        return ctr ;
    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in) ;
        System.out.println("Enter the string : ");
        String str = sc.next() ;

        System.out.println("Enter the number of words : ");
        int n = sc.nextInt();

        String[] word = new String[n] ;
        System.out.println("Enter the words for array 2 : ");
        for(int i = 0 ; i < n ; ++i){
            word[i] = sc.next() ;
        }
        int ans = numOfStrings(word,str) ;
        System.out.println(ans);
    }
}
