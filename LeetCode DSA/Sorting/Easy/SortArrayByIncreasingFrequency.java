//Problem Link : https://leetcode.com/problems/sort-array-by-increasing-frequency/
package com.ateeth.LeetCodeDSA.sorting.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class SortArrayByIncreasingFrequency {
    public static int[] frequencySort(int[] nums) {
        Arrays.sort(nums) ;
        HashSet<Integer> set = new HashSet<Integer>() ;

        //add unique numbers to set
        for(int num : nums){
            set.add(num) ;
        }

        //to find the freq of elements
        int[] freq = new int[set.size()] ;

        //add the unique elements from hashset to unique array
        int[] unique = new int[set.size()];
        int ctr = 0 ;
        for(int element : set){
            unique[ctr] = element ;
            ++ctr ;
        }

        //append the freq of unique elements
        for(int i = 0 ; i < unique.length ; ++i){
            for(int j = 0; j < nums.length ; ++j){
                if(unique[i] == nums[j]){
                    ++freq[i] ;
                }
            }
        }

        //use bubble sort in order of frequency and sort freq unique
        for(int i = 0 ; i < freq.length ; ++i){
            for(int j = 0 ; j < freq.length - i - 1  ; ++j){
                if(freq[j] > freq[j + 1]){
                    int temp = freq[j] ;
                    freq[j] = freq[j + 1] ;
                    freq[j + 1] = temp ;

                    temp = unique[j] ;
                    unique[j] = unique[j + 1] ;
                    unique[j + 1] = temp ;
                }

                //if 2 elemnts freq r equal make the values of same freq in descending order
                if(unique[j] < unique[j+1] && freq[j] == freq[j+1]){
                    int temp = unique[j] ;
                    unique[j] = unique[j + 1] ;
                    unique[j + 1] = temp ;
                }
            }
        }

        //create an array ans
        int[] ans = new int[nums.length] ;
        ctr = 0 ;

        //keep appending elements of unique to ans freq number of times
        for(int i = 0 ; i < freq.length ; ++i){
            while(freq[i] > 0){
                ans[ctr] = unique[i] ;
                ++ctr ;
                --freq[i] ;
            }
        }

        return ans ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt()  ;

        int[] nums = new int[n] ;
        System.out.println("Enter the elements of nums : ");
        for(int i = 0 ; i < n ; ++i){
            nums[i] = sc.nextInt() ;
        }

        int[] ans = frequencySort(nums) ;
        System.out.println(Arrays.toString(ans));
    }
}
