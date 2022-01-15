//Problem Link : https://leetcode.com/problems/plus-one/
package com.ateeth.LeetCodeDSA.arrays.easy.CouldNotThinkOfLogicAtAll;

import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {


    public static int[] plusOne(int[] digits){
        int n = digits.length ;
        for(int i = n-1 ; i >= 0 ; --i){
            //start from end of array
            //if digit is less than 9 add 1 and return digits
            if(digits[i] < 9){
                ++digits[i];
                return digits ;
            }

            //if digit is 9 make it 0 1 carried over
            digits[i] = 0 ;
        }

        //example all digits r 9 so we make a new number and then we make the first digit 1
        int[] number = new int[n+1] ;
        number[0] = 1 ;
        return number ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n ;
        System.out.println("Enter the number of digits : ");
        n = sc.nextInt();

        int[] digits = new int[n] ;
        System.out.println("Enter the digits of the number seperated by space : ");
        for(int i = 0 ; i < n ; ++i){
            digits[i] = sc.nextInt() ;
        }

        int[] ans = plusOne(digits) ;
        System.out.println(Arrays.toString(ans));

    }
}
