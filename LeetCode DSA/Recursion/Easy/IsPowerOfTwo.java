//Problem Link : https://leetcode.com/problems/power-of-two/
package com.ateeth.LeetCodeDSA.Recursion.Easy;

import java.util.Scanner;

public class IsPowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if(n == 1){
            return true ;
        }

        if(n % 2 == 1 || n == 0){
            return false ;
        }

        return isPowerOfTwo(n/2) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();

        System.out.println(isPowerOfTwo(n));
    }
}
