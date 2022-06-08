//Problem Link : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
package com.ateeth.LeetCodeDSA.Recursion.Easy;

import java.util.Scanner;

public class NumberOfStepsToReduceANumberToZero {
    public static int numberOfSteps(int num) {
        return nos(num , 0) ;
    }

    public static int nos(int n , int ctr){
        if(n == 0){
            return ctr ;
        }

        if(n % 2 == 0){
            return nos( n / 2 , ctr + 1) ;
        }else{
            return nos( n - 1 , ctr + 1 ) ;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();

        System.out.println(numberOfSteps(n));
    }
}
