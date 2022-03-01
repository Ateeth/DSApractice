//Problem Link : https://leetcode.com/problems/longest-common-prefix/
package com.ateeth.LeetCodeDSA.strings.easy.Important;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "" ;
        }

        //Take prefix initially as the first word in the array
        String prefix = strs[0];
        int i = 1;

        //loop through array
        while(i < strs.length){

            //if prefix is not in word
            //take substring of common prefix
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
            i++;
        }

        return prefix;
    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in) ;
        System.out.println("Enter the number of words : ");
        int n = sc.nextInt();

        String[] word = new String[n] ;
        System.out.println("Enter the words for array 2 : ");
        for(int i = 0 ; i < n ; ++i){
            word[i] = sc.next() ;
        }
        String ans = longestCommonPrefix(word) ;
        System.out.println(ans);
    }
}
