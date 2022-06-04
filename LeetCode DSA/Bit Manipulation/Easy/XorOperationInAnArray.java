//Problem Link : https://leetcode.com/problems/xor-operation-in-an-array/
package com.ateeth.LeetCodeDSA.bitwise.easy;

import java.util.* ;
public class XorOperationInAnArray {

    public static int xorOperation(int n, int start) {
        int xor = 0 ;
        int ctr = 0 ;
        while(ctr < n){
            xor ^= start + 2 * ctr ;
            ++ctr ;
        }

        return xor ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt() ;

        System.out.println("Enter the value of start : ");
        int start = sc.nextInt() ;

        System.out.println(xorOperation(n , start));
    }
}
