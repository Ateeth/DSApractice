//Problem Link : https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
//Google question

package com.ateeth.LeetCodeDSA.sorting.easy.CycleSortConcept;

import java.util.ArrayList;
import java.util.Scanner;

public class FindAllNumbersDisappearedInAnArray {
    public static void swap(int[] arr , int first , int second){
        int temp = arr[first] ;
        arr[first] = arr[second] ;
        arr[second] = temp ;
    }


    public static ArrayList<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0 ;
        /*
            Apply cyclic sort
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

        ArrayList<Integer> ans = new ArrayList<>() ;
        /*
        Loop through array if we find at index i the element is not arr[i] + 1 add it i ans ArrayList
         */
        for(i = 0 ; i < arr.length ; ++i){
            if(i != arr[i] - 1){
                ans.add(i + 1) ;
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

        ArrayList<Integer> ans = findDisappearedNumbers(arr) ;
        System.out.println(ans);
    }
}
