//Problem link : https://leetcode.com/problems/single-element-in-a-sorted-array/
package com.ateeth.LeetCodeDSA.searching.medium.CouldNotThinkOfOptimalSolution;

import java.util.Scanner;

public class SingleElementInASortedArray {
    public static int singleNonDuplicate(int[] nums) {
        int beg = 0 , end = nums.length - 1 , mid ;
        while(beg <= end){
            mid = beg + (end - beg) / 2 ;

            //Check to see if single element is in the middlle
            if(mid > 0 && mid < nums.length - 1 && nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]){
                return nums[mid] ;
            }

             /*
            In the below check we see if the mid element is same as its immediate left or right
            if the mid element is same as the element to its immediate left .
                if true see if the element to the left of mid is in an even index
                    if true we will begin to search in the right half of the array
                    because the first occurence of duplicate elements will always be in even index
                    if the first occurence of the mid element is in even index the required answer has not yet arrived

            if the mid element is same as the element to itd immediate right
                if true see if the mid pistion is an even index
                    if true it implies that the first occurence of the mid element (i.e at mid index) is at an even position
                    we will then begin to search in the right half of the array
                    because the first occurence of duplicate elements will always be in even index
                    if the first occurence of the mid element is in even index the required answer has not yet arrived
            */
            else if ((mid > 0 && nums[mid] == nums[mid - 1] && (mid - 1) % 2 == 0 ) || (mid < nums.length - 1 && nums[mid] == nums[mid+1] && mid % 2 == 0)){
                beg = mid + 1 ;
            }

             /*
                The first occurence of the element at the mid position has occured at odd position which implies
                that the required answer which is a single occuring element is in the left half of the array.
            */
            else{
                end = mid - 1 ;
            }
        }
        return -1 ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements of the array : ");
        int n = sc.nextInt()  ;

        System.out.println("Enter the elements of the array : ");
        int[] nums = new int[n] ;
        for(int i = 0 ; i < n ; ++i){
            nums[i] = sc.nextInt() ;
        }

        int ans = singleNonDuplicate(nums) ;
        System.out.println(ans);

    }
}
