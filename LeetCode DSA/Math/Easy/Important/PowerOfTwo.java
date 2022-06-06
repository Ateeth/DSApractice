//Problem Link : https://leetcode.com/problems/power-of-two/
package com.ateeth.LeetCodeDSA.math.easy.Important;

import java.util.*;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        return ((n & (n-1))==0 && n>0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter value of n : ");
        int n = sc.nextInt() ;
        System.out.println(isPowerOfTwo(n));
    }
}
