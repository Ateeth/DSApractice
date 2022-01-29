//Problem Link : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
package com.ateeth.LeetCodeDSA.searching.hard;

import java.util.Scanner;

public class FindMinimumInARotatedSortedArray2 {

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
        int start = 0 , end = nums.length -1 ;
        while(start <= end){
            int mid = start + (end - start) / 2 ;
            if( mid < end && nums[mid] > nums[mid+1] ){
                //the element that is the part from where it is rotated if greater than next element it is no longer in ascending so return that index
                return mid ;
            }if(mid > start && nums[mid] < nums[mid-1]){
                //mid element less than previous which means the previous element has violated ascending order hence it is the pivot element
                return mid - 1 ;
            }
            //if elements at start , end , middle are equal skip dupliacates
            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                //skip the duplicates
                //Note what if start and end elements are pivot

                //check if start is pivot
                if(start < nums.length - 1 && nums[start] > nums[start+1]){
                    return start ;
                }
                ++start ;

                //check if end is pivot
                if(end > 0 && nums[end] < nums[end-1]){
                    return end - 1;
                }
                --end ;
            }

            //left side sorted pivot must be in right
            else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[end] < nums[mid])){
                start = mid + 1 ;
            }else{
                end = mid -1 ;
            }
        }
        return -1 ;
    }

    public static boolean binarySearch(int[] nums , int target , int start , int end){
        while( start <= end ){
            int mid = start + (end - start) / 2  ;
            if(nums[mid] == target){
                return true ;
            }else if(nums[mid] < target){
                start = mid + 1 ;
            }else{
                end = mid - 1 ;
            }
        }
        return false ;
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
