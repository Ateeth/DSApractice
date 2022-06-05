//Problem Link : https://leetcode.com/problems/happy-number/
package com.ateeth.LeetCodeDSA.math.easy.CouldNotThinkOfOptimalSolution;

import java.util.* ;
public class HappyNumber {

    public static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public static boolean isHappy(int n) {
        int slowRunner = n;
        int fastRunner = getNext(n);

        //if slow and fast meet meaning there is a cycle and this is an endless loop
        //Floyd's cycle detection - fastRunner moves 2 ahead at a time and slowRunner moves
        //1 ahead at a time
        while (fastRunner != 1 && slowRunner != fastRunner) {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }
        return fastRunner == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt() ;
        System.out.println(isHappy(n));
    }
}
