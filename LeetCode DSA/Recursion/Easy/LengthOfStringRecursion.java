//Problem Link : https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/
package com.ateeth.LeetCodeDSA.Recursion.Easy;

import java.util.Scanner;

public class LengthOfStringRecursion {
    public static int strLen(String str){
        if( str.equals("") ){
            return 0 ;
        }

        return 1 + strLen(str.substring(1)) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the String : ");
        String s = sc.next() ;

        System.out.println(strLen(s));
    }
}
