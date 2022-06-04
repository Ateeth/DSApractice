//Problem Link : https://leetcode.com/problems/number-of-1-bits/
package com.ateeth.LeetCodeDSA.bitwise.easy.CouldNotThinkOfOptimalSolution;

import java.util.* ;
public class NumberOfOneBits {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int ctr = 0 ;
        while(n != 0){
            ctr += (n & 1) ;
            n = n>>>1;
        }

        return ctr ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt() ;
        System.out.println(hammingWeight(n));
    }
}
