//Problem Link : https://leetcode.com/problems/3sum/

package com.ateeth.LeetCodeDSA.sorting.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>() ;
        Arrays.sort(nums) ;

        for(int i = 0 ; i < nums.length - 2 ; ++i){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int sum = -nums[i] ;
            int low = i + 1 ;
            int high = nums.length - 1 ;

            while(low < high){
                if(nums[low] + nums[high] == sum ){
                    List<Integer> temp = new ArrayList<>() ;
                    temp.add(nums[i]) ;
                    temp.add(nums[low]) ;
                    temp.add(nums[high]) ;
                    result.add(temp) ;

                    low++;
                    high--;

                    while(low < high && nums[low] == nums[low-1]){
                        low++;
                    }

                    while(high > low && nums[high] == nums[high+1]){
                        high--;
                    }
                }else if(nums[low] + nums[high] > sum){
                    high-- ;
                }else if((nums[low] +nums[high]) < sum){
                    low++;
                }
            }
        }
        return result ;
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

        List<List<Integer>> ans = threeSum(arr) ;
        for( List row : ans){
            System.out.println(row);
        }
    }
}
