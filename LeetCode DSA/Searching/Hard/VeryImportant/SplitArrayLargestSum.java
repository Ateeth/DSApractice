//Problem Link : https://leetcode.com/problems/split-array-largest-sum/

/*
The answer is between maximum value of input array numbers and sum of those numbers.
Use binary search to approach the correct answer. We have l = max number of array; r = sum of all numbers in the array;
Every time we do mid = (l + r) / 2;
Use greedy to narrow down left and right boundaries in binary search.
3.1 Cut the array from left.
3.2 Try our best to make sure that the sum of numbers between each two cuts (inclusive)
    is large enough but still less than mid.
3.3 We'll end up with two results: either we can divide the array into more than m subarrays or we cannot.
    If we can, it means that the mid value we pick is too small because we've already tried our best
    to make sure each part holds as many non-negative numbers as we can but we still have numbers left.
    So, it is impossible to cut the array into m parts and make sure each parts is no larger than mid.
    We should increase m. This leads to l = mid + 1;
If we can't, it is either we successfully divide the array into m parts and the sum of each part is less than mid,
 or we used up all numbers before we reach m. Both of them mean that we should lower mid because we need to find
  the minimum one. This leads to r = mid - 1;
 */

package com.ateeth.LeetCodeDSA.searching.hard.VeryImportant;

import java.util.Scanner;

public class SplitArrayLargestSum {
    public static int splitArray(int[] nums, int m) {
        int low = 0 , high = 0 ;
        for(int x : nums){
            low = Math.max(x , low) ;
            high += x ;
        }
        while(low <= high){
            int ctr = 0 , total = 0 ;
            int mid = low + (high - low) / 2 ;

            //count how many splits must be made if mid is the largest sum
            for(int num : nums){
                total += num ;
                if(total  > mid){
                    total = num ;
                    ++ctr ;
                }
            }

            //number of splits is lesser than the given target which means mid may be too big so reduce high to mid - 1
            if (ctr < m) {
                high = mid - 1;
            }

            //number of splits is more than or equal to the given target which
            //means mid may be small or optimal so increase low to mid + 1
            else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt() ;

        System.out.println("Enter the elements of the array one by one : ");
        int[] arr = new int[n] ;
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt() ;
        }

        System.out.println("Enter the minimum number of splits : ");
        int m = sc.nextInt() ;

        int ans = splitArray(arr , m) ;
        System.out.println(ans);
    }
}
