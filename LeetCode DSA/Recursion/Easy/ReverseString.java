//Problem Link : https://leetcode.com/problems/reverse-string/
package com.ateeth.LeetCodeDSA.Recursion.Easy;

import java.util.* ;
public class ReverseString {
    public static void reverseString(char[] s) {

        rs(s , 0 , s.length - 1) ;

        System.out.println(Arrays.toString(s));
    }

    public static void rs(char[] s , int start , int end){
        if(end < start){
            return ;
        }

        char temp = s[start] ;
        s[start] = s[end] ;
        s[end] = temp ;
        rs(s , start + 1 , end - 1) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the string : ");
        String s = sc.next() ;
        reverseString(s.toCharArray());
    }

}
