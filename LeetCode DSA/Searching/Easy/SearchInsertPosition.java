//Problem Link : https://leetcode.com/problems/search-insert-position/
package com.ateeth.LeetCodeDSA.searching.easy;

import java.util.Scanner;

public class SearchInsertPosition {

    /*
    Here just regular binary search
    if we find the target in the array return its index
    else if we dont find the target in the array
        return the value of beg/left pointer as it will be the appropriate position where the target
        element can be inseted once the loop of binary search is broken
     */

    public static int searchInsert(int[] nums, int target) {
        int beg = 0 , end = nums.length - 1 ;
        while(beg <= end){
            int mid = beg + (end - beg) / 2  ;
            if(nums[mid] == target){
                return mid ;
            }else if(nums[mid] > target){
                end = mid - 1 ;
            }else{
                beg = mid + 1 ;
            }
        }
        return beg ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < arr.length ; ++i){
            arr[i] = sc.nextInt() ;
        }

        System.out.println("Enter the target element : ");
        int target = sc.nextInt() ;

        int ans = searchInsert(arr , target) ;
        System.out.println(ans);
    }
}
