//Problem Link : https://leetcode.com/problems/power-of-four/
package com.ateeth.LeetCodeDSA.math.easy.CouldNotThinkOfOptimalSolution;

import java.util.Scanner;

public class PowerOfFour {
    /*
       public static boolean isPowerOfFour(int n) {

        while(n > 1){
            if(n % 4 != 0){
                return false ;
            }
            n /= 4 ;
        }

        return n == 1 ;
    }
     */

    public static boolean isPowerOfFour(int num) {
        //num & num-1 == 0 checks if it is power of 2
        //if a number is a power of 2 and 1 minus the number is divisible by 3 it is a power of 4
        return num > 0 && (num & (num - 1)) == 0 && (num - 1) % 3 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt() ;
        System.out.println(isPowerOfFour(n));
    }
}
