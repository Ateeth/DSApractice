//Problem Link : https://leetcode.com/problems/two-sum/
package com.ateeth.LeetCodeDSA.arrays.easy.CouldNotThinkOfOptimalSolution;

import java.util.Arrays;
import java.util.Scanner;
/*Note the optimal solution is using hashmaps*/
public class TwoSum {

    public static int[] binarySearch(int[] nums , int target){
        //sort one of the arrays
        Arrays.sort(nums) ;

        int[] ans = new int[2] ;
        int start  = 0 , end = 0 ;
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            if (nums[l] + nums[r] == target){
                start = nums[l];
                end = nums[r] ;
                break ;
            }
            else if (nums[l] + nums[r] < target){
                l++;
            }
            else{// nums[i] + nums[j] > sum
                r--;
            }
        }

        int[] result = new int[2] ;
        result[0] = start ;
        result[1] = end ;

        return result ;
    }

    public static int findIndex(int[] copy , int x){
        for(int i = 0 ; i < copy.length ; ++i){
            if(copy[i] == x){
                copy[i] = -1 ;
                return  i ;
            }
        }
        return -1 ;
    }

    public static int[] twoSum(int[] nums, int target) {
        //copy array element into another array
        int[] copy = new int[nums.length] ;
        for(int i = 0 ; i < nums.length ; ++i){
            copy[i] = nums[i] ;
        }


        int[] result = binarySearch(nums , target) ;
        int[] ans = new int[2] ;
        ans[0] = findIndex(copy , result[0]) ;
        ans[1] = findIndex(copy, result[1]) ;


        return ans  ;
    }

    public static void main(String[] args){
        int n ,target  ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements in the array : ");
        n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt() ;
        }

        System.out.println("Enter the target : ");
        target = sc.nextInt() ;

        int[] ans = twoSum(arr , target) ;
        System.out.println(Arrays.toString(ans));
    }
}
