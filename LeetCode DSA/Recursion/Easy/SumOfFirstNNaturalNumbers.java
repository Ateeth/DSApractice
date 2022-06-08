//Problem Link : https://www.geeksforgeeks.org/sum-of-natural-numbers-using-recursion/
package com.ateeth.LeetCodeDSA.Recursion.Easy;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
    public static double sum(int n){
        if( n == 0 ){
            return 0 ;
        }

        return n + sum(n - 1) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();

        System.out.println(sum(n));
    }
}
