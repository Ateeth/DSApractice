//Problem Link : https://leetcode.com/problems/roman-to-integer/
package com.ateeth.LeetCodeDSA.strings.easy.CouldNotUnderstandOptimalSolution;

import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String s) {
        //       First, we build an array that stores the integer value
        //   of each character in s.

        //       Second, we need to decide if we want to add, or subtract this
        //   value to get the final integer representation of 's'.

        //   Notice, only when the integer value of a character is less than
        //   than the integer value of the next character do we want to subtract it.

        //   In the end, only the last character has not been accounted for
        //   so we account for it and return.

        int n = s.length();
        int arr[] = new int[n];

        for (int i =0 ; i < n; i++){
            switch (s.charAt(i)){
                case 'I' :
                    arr[i] = 1;
                    break;
                case 'V' :
                    arr[i] = 5;
                    break;
                case 'X' :
                    arr[i] = 10;
                    break;
                case 'L' :
                    arr[i] = 50;
                    break;
                case 'C' :
                    arr[i] = 100;
                    break;
                case 'D' :
                    arr[i] = 500;
                    break;
                case 'M':
                    arr[i] = 1000;
                    break;
            }
        }

        int sol = 0;
        int i = 0;
        while ( i < n-1 ){
            if (arr[i] < arr[i+1]) sol -= arr[i];
            else sol += arr[i];
            i++;
        }

        return sol +arr[i];

    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in) ;
        System.out.println("Enter the string : ");
        String str = sc.next() ;

        int ans = romanToInt(str) ;
        System.out.println(ans);
    }
}
