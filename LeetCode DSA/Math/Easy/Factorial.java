//Problem Link : https://practice.geeksforgeeks.org/problems/factorial5739/1
package com.ateeth.LeetCodeDSA.math.easy;

import java.util.Scanner;

public class Factorial {
    public static long factorial(int N){
        if(N < 0){
            return -1;
        }

        if( N <= 1){
            return 1 ;
        }

        return N * factorial(N - 1) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt() ;
        System.out.println(factorial(n));
    }
}
