//Problem Link : https://leetcode.com/problems/kth-largest-element-in-an-array/
package com.ateeth.LeetCodeDSA.sorting.medium.NotAbleToThinkOptimal;

/*
OPTIMAL USE QUICKSORT
public int findKthLargest(int[] nums, int k) {
  return quickSelect(nums, 0, nums.length - 1, k);
}

int quickSelect(int[] nums, int low, int high, int k) {
  int pivot = low;

  // use quick sort's idea
  // put nums that are <= pivot to the left
  // put nums that are  > pivot to the right
  for (int j = low; j < high; j++) {
    if (nums[j] <= nums[high]) {
      swap(nums, pivot++, j);
    }
  }
  swap(nums, pivot, high);
  
  // count the nums that are > pivot from high
  int count = high - pivot + 1;
  // pivot is the one!
  if (count == k) return nums[pivot];
  // pivot is too small, so it must be on the right
  if (count > k) return quickSelect(nums, pivot + 1, high, k);
  // pivot is too big, so it must be on the left
  return quickSelect(nums, low, pivot - 1, k - count);
}
 */
import java.util.Arrays;
import java.util.Scanner;

public class KthLargestElementInAnArray {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums) ;
        return nums[nums.length - k] ;
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
        int k = sc.nextInt() ;

        int ans = findKthLargest(arr , k) ;
        System.out.println(ans);
    }
}
