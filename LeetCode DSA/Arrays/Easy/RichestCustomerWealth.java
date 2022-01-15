//problem link : https://leetcode.com/problems/richest-customer-wealth/

package com.ateeth.LeetCodeDSA.arrays.easy;

import java.util.Scanner;

public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {
        int ans = 0 , sum;
        for( int i = 0 ; i < accounts.length ; ++i){
            sum = 0 ;
            for(int j = 0 ; j < accounts[i].length ; ++j){
                sum += accounts[i][j] ;
            }
            if(ans < sum){
                ans = sum ;
            }
        }
        return ans ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int m , n ;
        System.out.println("Enter the number of customers : ");
        m = sc.nextInt() ;

        System.out.println("Enter the number of banks : ");
        n = sc.nextInt() ;

        int[][] nums = new int[m][n] ;
        System.out.println("Enter the elements of the array: ") ;
        for(int i = 0 ; i < m ; ++i){
            System.out.println("Enter the amounts stored by customer " + i+1 + " has stored in banks") ;
            for(int j = 0 ; j < n ;++j) {
                nums[i][j] = sc.nextInt();
            }
        }

        int ans = maximumWealth(nums) ;

        System.out.println(ans) ;
    }
}
