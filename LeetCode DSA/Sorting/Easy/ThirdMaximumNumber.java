//Problem Link : https://leetcode.com/problems/third-maximum-number/
package com.ateeth.LeetCodeDSA.sorting.easy;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdMaximumNumber {

    public static int thirdMax(int[] nums) {
        Arrays.sort(nums) ;
        int ctr = 1 , ans = nums[nums.length - 1] ;

        //loop from the end
        for(int i = nums.length - 1 ; i > 0 ; --i){
            //if a number is not equal to previous element just increment the distinct counter
            if(nums[i] != nums[i-1]){
                ++ctr ;
            }

            //the i - 1 is the 3rd distinct element return it as third max
            if(ctr == 3){
                return nums[i - 1] ;
            }
        }

        //return max value if 3rd maximum does not exist
        return ans ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; ++i ){
            arr[i] = sc.nextInt() ;
        }

        int ans = thirdMax(arr) ;
        System.out.println(ans);
    }
}
