//Problem Link : https://www.geeksforgeeks.org/leaders-in-an-array/
package com.ateeth.GeeksForGeeksDSA.SDESheet.Arrays;

import java.util.* ;
public class LeadersInAnArray {
    /*
    Scan elements from right of the array for maximum till ith index
    If max value changes add it to ArrayList
     */

    public static ArrayList leader(int[] nums){
        int maxTillI = nums[nums.length - 1] ;
        ArrayList<Integer> ans = new ArrayList<>() ;

        ans.add(0 , maxTillI) ;

        for(int i = nums.length - 2 ; i >= 0 ; --i){
            if(nums[i] >= maxTillI){
                maxTillI = nums[i] ;
                ans.add(0 , maxTillI) ;
            }
        }
        return ans ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter array elements : ");
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt();
        }

        System.out.println(leader(arr));
    }
}
