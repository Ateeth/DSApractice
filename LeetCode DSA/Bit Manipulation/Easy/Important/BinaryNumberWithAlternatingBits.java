//Problem Link : https://leetcode.com/problems/binary-number-with-alternating-bits/
package com.ateeth.LeetCodeDSA.bitwise.easy.Important;

import java.util.* ;
public class BinaryNumberWithAlternatingBits {
    public static boolean hasAlternatingBits(int n) {
        int prevBit = n & 1 ;
        n = n >> 1 ;
        while(n > 0){
            int dig = n & 1 ;
            if(prevBit == dig){
                return false ;
            }
            prevBit = dig ;
            n = n >> 1 ;
        }
        return true ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println(hasAlternatingBits(n));
    }
}
