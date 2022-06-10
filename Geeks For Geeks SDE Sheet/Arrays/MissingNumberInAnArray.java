//Problem Link : https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1#


/*
Use n * (n + 1) / 2 to find sum of numbers till n
then take sum of array elements then subtract expected sum - array sum
 */
package com.ateeth.GeeksForGeeksDSA.SDESheet.Arrays;

import java.util.Scanner;

public class MissingNumberInAnArray {
    public static int MissingNumber(int array[], int n) {
        int expected = n * (n+1) / 2 ;
        int sum = 0 ;
        for(int i = 0 ; i < n - 1 ; ++i){
            sum += array[i] ;
        }

        return expected - sum ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter size of array : ");
        int n = sc.nextInt(); ;

        int[] arr = new int[n] ;
        System.out.println("Enter array elements : ");
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt();
        }
        System.out.println(MissingNumber(arr, n));
    }
}
