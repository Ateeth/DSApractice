//Problem Link : https://leetcode.com/problems/single-number/
package com.ateeth.LeetCodeDSA.bitwise.easy.Important;

import java.util.* ;
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int XOR = 0 ;
        for(int n : nums){
            XOR ^= n ;
        }
        return XOR ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter size of the array : ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter elements of the array : ");

        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt() ;
        }

        System.out.println(singleNumber(arr));
    }
}
