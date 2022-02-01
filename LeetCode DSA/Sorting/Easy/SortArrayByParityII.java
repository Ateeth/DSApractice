//Problem Link : https://leetcode.com/problems/sort-array-by-parity-ii/
package com.ateeth.LeetCodeDSA.sorting.easy;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayByParityII {
    public static int[] sortArrayByParityII(int[] A) {
        int[] ans = new int[A.length];
        int even = 0;
        int odd = 1 ;

        //even element put in even index odd element put in off index
        for (int i = 0; i < A.length; ++i){
            if (A[i] % 2 == 0){
                ans[even] = A[i];
                even += 2 ;
            }
            if (A[i] % 2 == 1){
                ans[odd] = A[i];
                odd += 2 ;
            }
        }


        return ans;
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

        int[] ans = sortArrayByParityII(arr) ;
        System.out.println(Arrays.toString(ans));
    }
}
