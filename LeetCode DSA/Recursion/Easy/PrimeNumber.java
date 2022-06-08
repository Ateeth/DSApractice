//Problem Link : https://www.geeksforgeeks.org/recursive-program-prime-number/
package com.ateeth.LeetCodeDSA.Recursion.Easy;

import java.util.Scanner;

public class PrimeNumber {
    public static String isPrime(int n , int f){
        if(f > Math.sqrt(n)){
            return "Yes" ;
        }

        if(n % f == 0){
            return "No" ;
        }

        return isPrime(n , f + 1) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();

        System.out.println(isPrime(n , 2));
    }
}
