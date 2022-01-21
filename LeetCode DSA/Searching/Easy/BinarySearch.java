//Problem Link : https://leetcode.com/problems/binary-search/
package com.ateeth.LeetCodeDSA.searching.easy;

import java.util.Scanner;

public class BinarySearch {

    public static int search(int[] nums, int target) {
        int beg = 0 , end = nums.length - 1 ;
        while(beg <= end){
            int mid = beg + (end - beg) / 2 ;
            if(nums[mid] == target){
                return mid ;
            }else if(nums[mid] > target){
                end = mid - 1 ;
            }else{
                beg = mid + 1 ;
            }
        }
        return -1 ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt() ;

        System.out.println("Enter the elements of the array : ");
        int[] arr = new int[n] ;
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt() ;
        }

        System.out.println("Enter the target element : ");
        int target = sc.nextInt() ;

        int ans = search(arr , target) ;
        System.out.println(ans);
    }
}
