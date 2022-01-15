//Problem Link :https://leetcode.com/problems/number-of-good-pairs/
package com.ateeth.LeetCodeDSA.arrays.easy.CouldNotThinkOfOptimalSolution;

import java.util.Scanner;

public class NumberOfGoodPairs {

    public static int numIdenticalPairs(int[] nums) {
        /*Method 1 this solution will exceed the time limit
        int ctr =  0;
        for(int i = 0 ; i < nums.length-1 ; ++i ){
            for( int j = i + 1 ; j < nums.length ; ++j ){
                if(nums[i] == nums[j]){
                    ++ctr ;
                }
            }
        }
        return ctr ;

         */

        int ctr = 0 ;
        int[] count = new int[101] ;
        //size 101 as numbers will be less than 101 greater than equal to 0
        for( int i : nums){ //for each loop
            //i is element in nums
            ++count[i] ; //increment frequency of nums[i]
        }

        //now go through the count array and increment the ans bu
        //count[i] * (count[i]-1) / 2
        //this will give number of pairs possible with count[i]

        for(int i : count){
            ctr += i * (i-1) / 2 ;
        }

        return ctr ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter size of the array : ") ;
        int len = sc.nextInt() ;

        int[] nums = new int[len] ;
        System.out.println("Enter the elements of the array: ") ;
        for(int i = 0 ; i < len ; ++i){
            nums[i] = sc.nextInt() ;
        }

        int ans = numIdenticalPairs(nums) ;

        System.out.println(ans) ;
    }

}
