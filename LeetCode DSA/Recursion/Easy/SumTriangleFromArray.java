//Problem Link: https://www.geeksforgeeks.org/sum-triangle-from-array/
package com.ateeth.LeetCodeDSA.Recursion.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class SumTriangleFromArray {

    public static void printTriangle(int[] A){
        if(A.length < 1){
            return ;
        }

        int[] temp = new int[A.length - 1] ;
        for(int i = 1 ; i < A.length ; ++i){
            temp[i - 1] = A[i-1] + A[i] ;
        }

        printTriangle(temp);

        System.out.println(Arrays.toString(A));
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter size of array : ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter elements of the array : ");

        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt() ;
        }

        printTriangle(arr);
    }
}
