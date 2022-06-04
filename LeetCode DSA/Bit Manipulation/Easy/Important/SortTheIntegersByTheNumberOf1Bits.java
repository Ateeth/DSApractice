//Problem Link : https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
package com.ateeth.LeetCodeDSA.bitwise.easy.Important;

import java.util.*;

public class SortTheIntegersByTheNumberOf1Bits {
    public static int[] sortByBits(int[] arr) {
        for(int i=0;i<arr.length;i++){
            //multiply by 10001 so that the number of bits will be greater than the array element and thus hold more influence when the array is sorted regardless of what the array element is
            arr[i] = setBitCount(arr[i])*10001 + arr[i];
        }
        Arrays.sort(arr);

        //because multiplication by 10001 in previous loop thus restoring elements in sorted arrat to their values as they occured in the orignal array
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]%10001;
        }
        return arr;
    }

    //find number of 1 bits
    public static int setBitCount(int n){
        int count = 0;
        while(n>0){
            int last_bit = n&1;
            count += last_bit;
            n = n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter array size : ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter elements of the array : ");
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt() ;
        }

        System.out.println(Arrays.toString(sortByBits(arr)));
    }
}
