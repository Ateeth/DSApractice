//Problem Link : https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/

package com.ateeth.GeeksForGeeksDSA.SDESheet.Arrays.Important;

import java.util.Scanner;

public class KadanesAlgorithm {
    public static long maxSubarraySum(int a[], int size){

        long max_so_far = a[0];
        long curr_max = a[0];

        for (int i = 1; i < size; i++){
            curr_max = Math.max(a[i], curr_max+a[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;

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
