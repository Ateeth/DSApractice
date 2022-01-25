//Problem Link : https://leetcode.com/problems/find-the-duplicate-number/
package com.ateeth.LeetCodeDSA.searching.medium.VeryImportant;

import java.util.Scanner;

public class FindTheDuplicateNumber {

    public static int findDuplicate(int[] nums) {
        int[] freq = new int [nums.length] ;


        for( int i = 0 ; i < nums.length ; ++i ){

            /*
            this condition implies the number at the index is not duplicate as it
            has not occured before

            we will make its corresponding frequency in freq array i.e the index of the
            number(index nums[i] - 1) in frequency array as 1
            */
            if(freq[nums[i] - 1] == 0){
                freq[nums[i] - 1] = 1 ;
            }

            /*
            its index in frequency array is 1 which means it has definitely occured before
            so return the number
            */
            else{
                return nums[i] ;
            }
        }
        return -1 ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n + 1] ;
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < arr.length ; ++i){
            arr[i] = sc.nextInt() ;
        }

        int ans = findDuplicate(arr)  ;
        System.out.println(ans);
    }
}
