//Problem Link : https://leetcode.com/problems/power-of-three/
package com.ateeth.LeetCodeDSA.Recursion.Easy;

import java.util.Scanner;

public class IsPowerOfThree {
    public  static boolean isPowerOfThree(int n) {
        if(n == 1){
            return true ;
        }

        if(n % 3 != 0 || n == 0){
            return false ;
        }

        return isPowerOfThree(n/3) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();

        System.out.println(isPowerOfThree(n));
    }
}
