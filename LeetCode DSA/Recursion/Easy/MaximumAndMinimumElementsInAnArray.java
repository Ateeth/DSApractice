//Problem Link : https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
package com.ateeth.LeetCodeDSA.Recursion.Easy;

import java.util.Scanner;

public class MaximumAndMinimumElementsInAnArray {
    public static void MaxMin(int[] arr , int idx , int max , int min){
        if(idx == arr.length){
//            System.out.println(idx);
            System.out.println("Maximum element : " + max);
            System.out.println("Minimum element : " + min);
            return ;
        }

        if(max < arr[idx]){
//            System.out.println(idx);
//            System.out.println("Maximum element : " + max);
//            System.out.println("Minimum element : " + min);
            MaxMin(arr , idx + 1  , arr[idx] , min);
        }

         else if(min > arr[idx]){
//            System.out.println(idx);
//            System.out.println("Maximum element : " + max);
//            System.out.println("Minimum element : " + min);
            MaxMin(arr , idx + 1 , max , arr[idx]) ;
        }

        else{
            MaxMin(arr , idx + 1 , max , min);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter size of array : ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter elements of the array : ");

        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt() ;
        }

        MaxMin(arr , 1 , arr[0] , arr[0]);
    }
}
