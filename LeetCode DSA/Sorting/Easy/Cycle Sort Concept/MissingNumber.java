//Question Link : https://leetcode.com/problems/missing-number/
//Amazon Question
package com.ateeth.LeetCodeDSA.sorting.easy.CycleSortConcept;

import java.util.Scanner;

public class MissingNumber {
    public static void swap(int[] arr , int first , int second){
        int temp = arr[first] ;
        arr[first] = arr[second] ;
        arr[second] = temp ;
    }

    public static int missingNumber(int[] arr) {
        int i = 0 ;

        /*
        First sort the array using cyclic sort
        swap till if possible we can make element at i index arr[i] as 0 is also in the range
        */
        while(i < arr.length){
            int correct = arr[i] ;

          /*
          if it is same as arr.length just ignore move ahead as index nums.length does not               exist
          */
            if(arr[i] == arr.length){
                ++i ;
            }

            //swap the element with its correct index
            else if(arr[i] != arr[correct]){
                swap(arr , i , correct) ;
            }

            //element will be at correct position move ahead
            else {
                ++i ;
            }
        }

        /*
        now loop the array and return arr[i] if it is not equal to i
        as this means arr.length is at i index hence the number supposed to be at index i
        is missing
        */

        for(i = 0 ; i < arr.length ; ++i){
            if(arr[i] != i){
                return i ;
            }
        }

        //case when 0 to n-1 is present and n is missing
        return arr.length ;
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

        int ans = missingNumber(arr) ;
        System.out.println(ans);
    }
}
