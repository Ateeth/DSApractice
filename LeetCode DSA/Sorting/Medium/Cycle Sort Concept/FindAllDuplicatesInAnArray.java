package com.ateeth.LeetCodeDSA.sorting.medium.CycleSortConcept;

import java.util.ArrayList;
import java.util.Scanner;

public class FindAllDuplicatesInAnArray {
    public static void swap(int[] arr , int first , int second){
        int temp = arr[first] ;
        arr[first] = arr[second] ;
        arr[second] = temp ;
    }

    public static ArrayList<Integer> findDuplicates(int[] arr) {
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
        /*
        If element not at correct index add to ans ArrayList
        */

        ArrayList<Integer> ans = new ArrayList<>() ;
        for(i = 0 ; i < arr.length ; ++i){
            if(arr[i] != i + 1){
                ans.add(arr[i]) ;
            }
        }

        return ans ;
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

        ArrayList<Integer> ans = findDuplicates(arr) ;
        System.out.println(ans);
    }
}
