//Problem Link : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
package com.ateeth.LeetCodeDSA.searching.medium;

import java.util.Arrays;
import java.util.Scanner;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2] ;
        ans[0] = binarySearch(nums , target , true) ;
        ans[1] = binarySearch(nums , target , false) ;
        return ans ;
    }

    public static int binarySearch(int[] nums , int target , boolean firstIndex){
        int beg = 0 , end = nums.length - 1 , res = -1 ;
        while(beg <= end){
            int mid = beg + (end - beg) / 2 ;
            if(nums[mid] == target){
                res = mid ;

                /*
                We need to find first occurence so look to left
                of current index and see if any more occurences are there
                */
                if(firstIndex == true){
                    end = mid - 1 ;
                }
                /*
                we need to find the last occurence so look to right of current index and see if
                any more occurences of the element are there
                */
                else{
                    beg = mid + 1 ;
                }
            }else if(nums[mid] < target){
                beg = mid + 1 ;
            }else{
                end = mid - 1 ;
            }
        }
        return res ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of values in the array : ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter the elements of the sorted array : ");
        for(int i = 0 ; i < n ; ++i ){
            arr[i] = sc.nextInt() ;
        }

        System.out.println("Enter the element whose first and last occurrence must be found : ");
        int target = sc.nextInt() ;

        int[] ans = searchRange(arr , target) ;
        System.out.println(Arrays.toString(ans));
    }
}
