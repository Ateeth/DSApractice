//Problem Link : https://www.geeksforgeeks.org/recursive-bubble-sort/
package com.ateeth.LeetCodeDSA.Recursion.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBubbleSort {
    public static void rbs(int[] arr , int r , int c){
        if(r == 0){
            System.out.println(Arrays.toString(arr));
            return ;
        }

        if(c < r){
            if(arr[c] > arr[c + 1]){
                int temp = arr[c+1] ;
                arr[c+1] = arr[c] ;
                arr[c] = temp ;
            }

            rbs(arr , r , c + 1) ;
        }else{
            rbs(arr , r - 1 , 0) ;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter size of array : ");
        int n = sc.nextInt() ;

        System.out.println("Enter elements of the array : ");
        int[] arr = new int[n] ;
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt() ;
        }

        rbs(arr, arr.length - 1  , 0);
    }
}
