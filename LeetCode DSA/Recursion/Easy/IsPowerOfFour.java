//Problem Link : https://leetcode.com/problems/power-of-four/
package com.ateeth.LeetCodeDSA.Recursion.Easy;

import java.util.Scanner;

public class IsPowerOfFour {
    public static boolean isPowerOfFour(int n) {
        if(n == 1){
            return true ;
        }

        if(n % 4 != 0 || n == 0){
            return false ;
        }

        return isPowerOfFour(n/4) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();

        System.out.println(isPowerOfFour(n));
    }
}
