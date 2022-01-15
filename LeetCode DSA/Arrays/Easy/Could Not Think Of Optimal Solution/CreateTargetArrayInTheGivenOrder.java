//Problem Link : https://leetcode.com/problems/create-target-array-in-the-given-order/
package com.ateeth.LeetCodeDSA.arrays.easy.CouldNotThinkOfOptimalSolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CreateTargetArrayInTheGivenOrder {

    /*Method 1*/
    public static void insertAtIndex(int[] res , int number , int idx){
        //switch all elements from the index 1 right
        for(int i = res.length - 1  ;   i  > idx ; --i){
            res[i] = res[i-1] ;
        }
        res[idx] = number ;
    }


    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] res = new int[nums.length] ;

        for( int i = 0 ; i < nums.length ; ++i){
            /* //pass the answer array , the index to enter the number ,
             number to be inserted at index*/
            insertAtIndex(res , nums[i] , index[i]);
        }

        return res ;
    }

    /*Method 2
    An ArrayList has been used in this method so that easily elements can be added at the required index and the elements of the ArrayList can be put into an array which can be returned
    */
    public static int[] createTargetArray1(int[] nums, int[] index){
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            a.add(index[i],nums[i]);
        }
        int[] target = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            target[i] = a.get(i);
        }
        return target;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter size of the array : ") ;
        int len = sc.nextInt() ;

        int[] nums = new int[len] ;
        System.out.println("Enter the elements of the array: ") ;
        for(int i = 0 ; i < len ; ++i){
            nums[i] = sc.nextInt() ;
        }

        int[] index = new int[len] ;
        System.out.println("Enter the elements of the index array: ") ;
        for(int i = 0 ; i < len ; ++i){
            index[i] = sc.nextInt() ;
        }

        int[] ans = createTargetArray(nums , index) ;

        System.out.println(Arrays.toString(ans)) ;

        int[] ans1 = createTargetArray1(nums , index) ;

        System.out.println(Arrays.toString(ans1)) ;
    }
}
