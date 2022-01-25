//Problem Link : https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
package com.ateeth.LeetCodeDSA.searching.medium.VeryImportant;

import java.util.Scanner;

public class SearchInARotatedArray2 {

    public static boolean search(int[] nums, int target) {
        //first find the index of pivot element
        if(nums.length == 1){
            if(nums[0] == target){
                return true ;
            }
            return false ;
        }
        int pivot = findPivot(nums) ; //find the index of element which violates ascending order
        System.out.println(pivot);
        if(pivot == -1){
            //no pivot element was found so regular binary search whole array i.e the array was not rotated
            return binarySearch(nums , target , 0 , nums.length - 1 ) ;
        }if(nums[pivot] == target){
            return true ;
        }if(target >= nums[0]){
            //the pivot element has not been encountered yet the target lies before the pivot element so do regular binary search from start to pivot
            return binarySearch(nums , target , 0 , pivot - 1) ;
        }

        return binarySearch(nums , target , pivot + 1  , nums.length - 1) ;
        //if the target is less than first element it lies after the pivot element so do binary search from pivot +1 element to the end

        //do not search with pivot element at all as it is not following binary search only
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
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt() ;

        System.out.println("Enter the elements in the array : ");
        int[] arr = new int[n] ;
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt() ;
        }

        System.out.println("Enter the target element : ");
        int target = sc.nextInt() ;

        System.out.println(search(arr , target));
    }
}
