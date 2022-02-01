//Problem Link : https://leetcode.com/problems/find-the-duplicate-number/
package com.ateeth.LeetCodeDSA.sorting.medium.CycleSortConcept;

import java.util.Scanner;

public class FindTheDuplicateNumber {

    public static void swap(int[] arr , int first , int second){
        int temp = arr[first] ;
        arr[first] = arr[second] ;
        arr[second] = temp ;
    }

    public static int findDuplicate(int[] arr) {
        int i = 0 ;
        /*
            Apply cyclic sort
            correct index of i is arr[i] - 1
        */
        while( i < arr.length ){
            //correct index of arr[i] is i - 1
            int correct = arr[i] - 1 ;

            //swap arr[i] to its correct index
            if(arr[i] != arr[correct]){
                swap(arr , i , correct) ;
            }

            //arr[i] at correct position proceed
            else{
                ++i ;
            }
        }


        for(i = 0 ; i < arr.length ; ++i){
            if(arr[i] != i + 1  ){
                return arr[i] ;
            }
        }

        return -1 ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; ++i ){
            arr[i] = sc.nextInt() ;
        }

        int ans = findDuplicate(arr) ;
        System.out.println(ans);
    }
}
