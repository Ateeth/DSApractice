//Problem Link : https://leetcode.com/problems/reverse-bits/
package com.ateeth.LeetCodeDSA.bitwise.easy.Important;

import java.util.* ;
public class ReverseBits {
    public static int reverseBits(int n) {
        int ans = 0 ;
        for(int i = 0 ; i < 32 ; ++i){
            ans = ans << 1 ;
            ans += (n & (1)) ;
            n = n >> 1 ;
        }

        return ans ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt() ;

        System.out.println(reverseBits(n));
    }
}
