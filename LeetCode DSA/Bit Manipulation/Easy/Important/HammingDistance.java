//Problem Link : https://leetcode.com/problems/hamming-distance/
package com.ateeth.LeetCodeDSA.bitwise.easy.Important;

import java.util.* ;
public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int ctr = 0 ;
        //x ^ y will give 1 where the digit of x and y are different
        int m = x ^ y;
        while(m > 0){
            ctr += (m & 1) ;
            m = m >> 1 ;
        }
        return ctr ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the first number : ");
        int x = sc.nextInt() ;
        System.out.println("Enter the second nuumber : ");
        int y = sc.nextInt();

        System.out.println(hammingDistance(x , y));
    }
}
