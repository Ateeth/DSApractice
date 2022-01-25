//Problem Link : https://leetcode.com/problems/search-in-rotated-sorted-array/
package com.ateeth.LeetCodeDSA.searching.medium.VeryImportant;

import java.util.Scanner;

public class SearchInARotatedSortedArray {

    public static int search(int[] nums, int target) {
        //first find the index of pivot element
        int pivot = findPivot(nums) ; //find the index of element which violates ascending order
        if(pivot == -1){//no pivot element was found so regular binary search whole array i.e the array was not rotated
            return binarySearch(nums , target , 0 , nums.length - 1 ) ;
        }else if(nums[pivot] == target){
            return pivot ;
        }else if(target >= nums[0]){ //the pivot element has not been encountered yet the target lies before the pivot element so do regular binary search from start to pivot
            return binarySearch(nums , target , 0 , pivot - 1) ;
        }

        return binarySearch(nums , target , pivot + 1  , nums.length - 1) ; //if the target is less than first element it lies after the pivot element so do binary search from pivot element to the end
    }

    public static int findPivot(int[] nums){
        int start = 0 , end = nums.length -1 ;
        while(start <= end){
            int mid = start + (end - start) / 2 ;
            if( mid < end && nums[mid] > nums[mid+1] ){
                //the element that is the part from where it is rotated if greater than next element it is no longer in                             ascending so return that index
                return mid ;
            }if(mid > start && nums[mid] < nums[mid-1]){
                //mid element less than previous which means the previous element has violated ascending order hence it is the                      pivot element
                return mid - 1 ;
            }if(nums[mid] <= nums[start] ){
                //in this case mid element is lesser than start element which means the pivot element must be to the left half                      of the mid element so do end = mid - 1
                end = mid - 1 ;
            }else{ //last case pivot must be in the right side of current mid
                start = mid + 1 ;
            }
        }
        return -1 ;
    }

    public static int binarySearch(int[] nums , int target , int start , int end){
        while( start <= end ){
            int mid = start + (end - start) / 2  ;
            if(nums[mid] == target){
                return mid ;
            }else if(nums[mid] < target){
                start = mid + 1 ;
            }else{
                end = mid - 1 ;
            }
        }
        return -1 ;
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
