//Problem Link : https://leetcode.com/problems/counting-bits/
package com.ateeth.LeetCodeDSA.bitwise.easy.Important;

import java.util.Scanner;

public class CountingBits {
    // you need to treat n as an unsigned value
    public static int countOnes(int n) {
        int ctr = 0 ;
        while(n != 0){
            ctr += (n & 1) ;
            n = n>>>1;
        }

        return ctr ;
    }
    public static int[] countBits(int n) {
        int[] ans = new int[n + 1] ;
        int i ;
        for(i = 0 ; i <= n ; ++i ){
            ans[i] = countOnes(i);
        }

        return ans ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt() ;

        int[] ans = new int[n + 1] ;
        ans = countBits(n) ;


        for(int i = 0 ; i < ans.length ; ++i){
            System.out.print(ans[i] + " ");
        }
    }
}
