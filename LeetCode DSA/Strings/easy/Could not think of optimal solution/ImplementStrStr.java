//Problem Link : https://leetcode.com/problems/implement-strstr/
package com.ateeth.LeetCodeDSA.strings.easy.CouldNotUnderstandOptimalSolution;

import java.util.Scanner;

public class ImplementStrStr {
    /*
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle) ;
    }
     */

    public static int strStr(String haystack, String needle) {
        int l1 = haystack.length(), l2 = needle.length();
        if (l1 < l2) {
            return -1;
        } else if (l2 == 0) {
            return 0;
        }
        int threshold = l1 - l2;
        for (int i = 0; i <= threshold; ++i) {
            if (haystack.substring(i,i+l2).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in) ;
        System.out.println("Enter the string : ");
        String str = sc.next() ;

        System.out.println("Enter the string 2 : ");
        String str1 = sc.next() ;

        int ans = strStr(str , str1) ;
        System.out.println(ans);
    }
}

