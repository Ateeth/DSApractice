//Problem Link : https://leetcode.com/problems/find-peak-element/
package com.ateeth.LeetCodeDSA.searching.medium.CouldNotThinkOfOptimalSolution;

import java.util.Scanner;

public class FindPeakElement {
   /*
    public static int findPeakElement(int[] nums) {
        int N = nums.length;
        if (N == 1) {
            return 0;
        }

        int left = 0, right = N - 1;
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

    
    //    if left is last element return that index
      //  if left is greater than its next element return left

    //    else return right
    
    //    return (left == N - 1 || nums[left] > nums[left + 1]) ? left : right;
    }

    
    
     public static int findPeakElement(int[] nums) {
        int N = nums.length;
        if (N == 1) {
            return 0;
        }

        int left = 0, right = N - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

   
   //     if left is last element return that index
   //     if left is greater than its next element return left
   //     else return right
    
        return (left == N - 1 || nums[left] > nums[left + 1]) ? left : right;
    }
   */
   
   public static int findPeakElement(int[] nums) {
        int N = nums.length;
        if (N == 1) {
            return 0;
        }

        int left = 0, right = N - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left ; 
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

        int ans = findPeakElement(arr) ;
        System.out.println(ans);
    }
}
