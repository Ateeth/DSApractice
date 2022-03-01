//Problem Link : https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/
package com.ateeth.LeetCodeDSA.strings.easy;

import java.util.Scanner;

public class CheckIfBinaryStringHasAtmostOneSegmentOfOnes {
    public static boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in) ;
        System.out.println("Enter the string : ");
        String str = sc.next() ;

        boolean ans = checkOnesSegment(str) ;
        System.out.println(ans);
    }
}
