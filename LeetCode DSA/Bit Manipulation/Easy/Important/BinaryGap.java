//Problem Link : https://leetcode.com/problems/binary-gap/
package com.ateeth.LeetCodeDSA.bitwise.easy.Important;

import java.util.* ;
public class BinaryGap {
    public static int binaryGap(int n) {
        int ctr = 0 ;
        int[] arr = new int[32];
        int arrSize = 0 ;

        //store pos of all set bits in an array
        while(n > 0){
            int dig = n & 1 ;
            if(dig == 1){
                arr[arrSize] = ctr ;
                ++arrSize ;
            }
            ++ctr ;
            n = n >> 1 ;
        }

        //find max dist
        int dist = 0 , maxDist = 0 ;
        for(int i = 0 ; i < arrSize - 1  ; ++i){
            dist = arr[i + 1] - arr[i] ;
            maxDist = Math.max(dist , maxDist) ;
            dist = 0 ;
        }

        return maxDist ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println(binaryGap(n));
    }
}
