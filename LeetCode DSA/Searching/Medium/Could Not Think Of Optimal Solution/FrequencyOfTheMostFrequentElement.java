//Question Link : https://leetcode.com/problems/frequency-of-the-most-frequent-element/
package com.ateeth.LeetCodeDSA.searching.medium.CouldNotThinkOfOptimalSolution;

import java.util.Arrays;
import java.util.Scanner;

/*
          here we will start from the left 2 pointers start and end
          we will try and make the elements in the window the same
          as long as (sum of elements in window + k) >= right * window size
              we can expand the right of the window
          if the above condition jot met subtract left from sum and increment left pointer

          the reason we compare sum of elements in window + k to window size * nums[right] is because we
          try to get the maximum window size in which al elements in the window are the same
          if this is the case the window size will definitely be the maximum

          sum + k >= nums[r] * window size implies we can make all elements in the window the same with
          the possibility of incremeneting an element at an index by 1 k times

          right - left + 1 = window size
      */

public class FrequencyOfTheMostFrequentElement {

    public static int maxFrequency(int[] nums , int k){
        Arrays.sort(nums);
        long sum = 0;
        int left= 0, max = 1 , right = 0;
        while(right < nums.length)
        {
            //right - left + 1 = window size
            sum += nums[right];
            while(sum + k < (long)nums[right] * (right - left +1))
            {
                sum -= nums[left];
                left += 1;
            }

            max = Math.max(max, right-left+1);
            ++right ;
        }

        return max;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt() ;
        }

        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();

        int ans = maxFrequency(arr , k) ;
        System.out.println(ans);
    }
}
