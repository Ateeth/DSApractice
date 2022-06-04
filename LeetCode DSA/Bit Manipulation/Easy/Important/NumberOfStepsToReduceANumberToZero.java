//Problem Link : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
package com.ateeth.LeetCodeDSA.bitwise.easy.Important;

import java.util.Scanner;

public class NumberOfStepsToReduceANumberToZero {
    public static int numberOfSteps(int num) {
        int ctr = 0;
        while(num != 0){
            int dig = num & 1 ;
            if(dig == 1){
                num -= 1 ;
            }else{
                num = num >> 1 ;
            }
            ++ctr ;
        }
        return ctr ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println(numberOfSteps(n));
    }
}
