//Problem Link : https://www.geeksforgeeks.org/program-check-array-sorted-not-iterative-recursive/
package com.ateeth.LeetCodeDSA.Recursion.Easy;

import java.util.Scanner;

public class CheckIfArrayIsSortedOrNot {
    public static boolean isSorted(int[] arr , int idx){
        if(idx == arr.length - 1){
            return true ;
        }

        return arr[idx] <= arr[idx + 1] && isSorted(arr , idx + 1) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter number of elements in the array : ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter the array elements : ");
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt() ;
        }

        System.out.println(isSorted(arr, 0));
    }
}
