//Problem Link : https://leetcode.com/problems/number-complement/
package com.ateeth.LeetCodeDSA.bitwise.easy.Important;

import java.util.* ;
public class NumberComplement {
    public static int findComplement(int num) {
        int mask = 1 , complement = num ;

        //just xor complement with the mask and that dig bits will reverse
        //after each xor shift complement to left once to xor next digit
        while( num > 0 )
        {
            complement ^= mask ;
            mask <<= 1 ;
            num >>= 1 ;
        }
        return complement ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println(findComplement(n));
    }
}
