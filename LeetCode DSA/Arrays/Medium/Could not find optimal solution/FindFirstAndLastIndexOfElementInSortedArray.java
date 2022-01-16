//Problem Link : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
package com.ateeth.LeetCodeDSA.arrays.medium.CouldNotThinkOfOptimalSolution;

import java.util.Arrays;
import java.util.Scanner;

public class FindFirstAndLastIndexOfElementInSortedArray {

    public static int binarySearch(int[] arr , int x , boolean firstIndex){
        int beg = 0 , end = arr.length - 1  , mid , res = -1 ;
        while(beg <= end){
             mid = beg + (end - beg) / 2 ;
             if(arr[mid] == x){
                 /*
                we found the element at the position this can be a possible answer
                so store it for the time being

                now if we r looking for the first index make end = mid - 1
                i.e look at the left if we find any more occurences of the same element

                if we r looking for the  last index of occurence of element make
                start = mid + 1

                i.e look for the element in the right half of the current index
                */
                 res = mid ;

                 if(firstIndex == true){
                     end = mid - 1 ;
                 }
                 //can be written as else directly
                 else if(firstIndex == false){
                     beg = mid + 1  ;
                 }
             }else if(arr[mid] > x){
                 end = mid - 1 ;
             }else{
                 beg = mid + 1 ;
             }
        }
        return res ;
    }

    public static int[] FirstAndLastPosition(int[] arr , int x){
        int[] ans = new int[2] ;

        //pass the value of true as we r seeing for the first index of the element
        ans[0] = binarySearch(arr , x , true) ;

        //pass the value of false as we r seeing for the last index of the element
        ans[1] = binarySearch(arr , x , false) ;
        return ans ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt() ;
        }

        System.out.println("Enter the element you are looking for in the array : ");
        int x = sc.nextInt() ;

        int[] ans = FirstAndLastPosition(arr , x) ;
        System.out.println(Arrays.toString((ans)));
    }
}
