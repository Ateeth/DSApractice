//Problem Link : https://leetcode.com/problems/peak-index-in-a-mountain-array/
package com.ateeth.LeetCodeDSA.searching.easy;

import java.util.Scanner;

public class PeakIndexInAMountainArray {

    public static int peakIndexInMountainArray(int[] arr) {
        int beg = 0 , end = arr.length - 1 ;
        while(beg <= end){
            int mid = beg + (end - beg) / 2 ;

            /*
                we r still in the ascending sort part i.e first part of array
                so we need to skip that part of the array
            */
            if(arr[mid] < arr[mid + 1]){
                beg = mid + 1 ;
            }
            /*
                we r in the descending part i.e second part of the array
                so we need to look towards the left half
            */
            else{
                end = mid - 1 ;
            }
        }

        //will return the index where the peak lies as at the end beg = end + 1 thus optimal answer
        return beg ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter number of elements in the array : ");
        int n = sc.nextInt()  ;

        int[] arr = new int[n] ;
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < arr.length ; ++i){
            arr[i] = sc.nextInt() ;
        }

        int ans = peakIndexInMountainArray(arr) ;
        System.out.println(ans);
    }
}
