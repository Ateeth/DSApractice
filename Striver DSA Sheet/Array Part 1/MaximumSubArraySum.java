//Problem Link : https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/

package com.ateeth.StriverSheet.Arrays1;

import java.util.Scanner;

public class MaximumSubArraySum {

        public static long maxSubarraySum(int a[], int size){
            long maxSum = 0, curSum = 0;

            for(int i = 0; i < size; i++) {
                curSum = Math.max(0L, curSum + a[i]);
                maxSum = Math.max(maxSum, curSum);
            }

            return maxSum;
        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ;

            System.out.println("Enter size of array : ");
            int n = sc.nextInt(); ;

            int[] arr = new int[n] ;
            System.out.println("Enter array elements : ");
            for(int i = 0 ; i < n ; ++i){
                arr[i] = sc.nextInt();
            }
            System.out.println(maxSubarraySum(arr, n));
        }
    }


