//Problem Link : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
package com.ateeth.LeetCodeDSA.searching.medium;

import java.util.Scanner;

public class FindMinimumInARotatedSortedArray {

    public static int findMin(int[] nums) {
        //First find the pivot elements
        int pivot = findPivot(nums) ;
        if(pivot == -1 || pivot == nums.length - 1){
            return nums[0] ;
        }else{
            return Math.min(nums[0] , nums[pivot + 1 ]) ;
        }
    }

    public static int findPivot(int[] nums){
        int beg = 0 , end = nums.length - 1 ;
        while(beg <= end){
            int mid = beg + (end - beg) / 2 ;
            if(mid < end && nums[mid + 1] < nums[mid]){
                return mid ;
            }else if(mid > beg && nums[mid - 1] > nums[mid]){
                return mid - 1 ;
            }else if(nums[mid] < nums[beg]){
                end = mid - 1 ;
            }else{
                beg = mid + 1 ;
            }
        }
        return -1 ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt() ;

        System.out.println("Enter the elements of the array : ");
        int[] arr = new int[n] ;

        for(int i = 0 ; i < n ; ++i ){
            arr[i] = sc.nextInt() ;
        }

        int ans = findMin(arr) ;
        System.out.println(ans);
    }
}
