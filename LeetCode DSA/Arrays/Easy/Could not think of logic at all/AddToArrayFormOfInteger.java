//Problem Link : https://leetcode.com/problems/add-to-array-form-of-integer/

package com.ateeth.LeetCodeDSA.arrays.easy.CouldNotThinkOfLogicAtAll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AddToArrayFormOfInteger {
    //Method 1
    public static ArrayList<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans = new ArrayList<>() ;

        //find length of the array
        int len = num.length - 1 ;

        //start from last
        while(len >= 0 || k!=0){
            if(len >= 0){
                //add the digits to k from the end
                k += num[len] ;
                --len ;
            }
            //add the last digit to answer ArrayList in case it is 2 digit
            ans.add(k%10) ;

            //if single digit k is 0 else if it is 2 digit now it is divided by 10
            k /= 10 ;
        }

        //reverse the answer ArrayList
        Collections.reverse(ans) ;
        return ans ;
    }

    public static ArrayList<Integer> addToArrayForm1(int[] num, int k) {
        ArrayList<Integer> ans = new ArrayList<>();

        //traverse num array from the end
        for(int i = num.length-1 ; i >= 0 ; i--){
            int n = num[i]; //take the digit from the end of nums array
            int sum = n + k; //add to the sum n + k
            int rem = sum % 10; //remainder of sum i.e to get the last digit of rem
            ans.add(0,rem); // add to index 0 the value of rem
            k = sum/10; //if k is single digit it will be 0 else if it is more than 1 digit it will be divided by 10
        }

        //if k is still not 0
        while(k>0){
            ans.add(0,k%10);
            k/=10;
        }

        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n] ;
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt() ;
        }
        System.out.println("Enter the value of k : ");
        int k = sc.nextInt() ;

        ArrayList<Integer> ans = addToArrayForm(arr , k) ;
        System.out.println(ans);

        ans = addToArrayForm1(arr , k) ;
        System.out.println(ans);
    }
}
