//Problem Link : https://leetcode.com/problems/set-mismatch/
package com.ateeth.LeetCodeDSA.sorting.easy.CycleSortConcept;


import java.util.Arrays;
import java.util.Scanner;

public class SetMismatch {


    public static void swap(int[] nums , int first , int second){
        int temp = nums[first] ;
        nums[first] = nums[second] ;
        nums[second] = temp ;
    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0 ;
        int[] ans = new int[2] ;

        /*
            Perform cyclic sort
        */
        while( i < nums.length ){
            int correct = nums[i] - 1 ;
            if(nums[i] != nums[correct]){
                swap(nums , i , correct) ;
            }else{
                ++i ;
            }
        }

        for(i = 0 ; i < nums.length ; ++i){
            if(nums[i] != i + 1){
                //duplicated number
                ans[0] = nums[i] ;

                //expected value of the number
                ans[1] = i + 1 ;

                return ans ;
            }
        }

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

        int[] ans = findErrorNums(arr) ;
        System.out.println(Arrays.toString(ans));
    }
}
