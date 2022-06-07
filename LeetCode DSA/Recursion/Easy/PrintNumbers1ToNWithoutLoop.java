//Problem Link : https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1/
package com.ateeth.LeetCodeDSA.Recursion.Easy;

import java.util.* ;
public class PrintNumbers1ToNWithoutLoop {
    public static void printNos(int N) {
        if (N == 0) {
            return;
        }

        printNos(N - 1);
        System.out.print(N + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt() ;

        printNos(n);
    }
}