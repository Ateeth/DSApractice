//Problem Link : https://www.hackerrank.com/challenges/30-recursion/problem
package com.ateeth.LeetCodeDSA.Recursion.Easy;

import java.util.Scanner;

public class Factorial {
    public static double factorial(int n) {
        if(n < 0){
            return  - 1;
        }

        if(n <  2){
            return n ;
        }

        return  n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();

        System.out.println(factorial(n));
    }
}
