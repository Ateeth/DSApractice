//Problem Link : https://leetcode.com/problems/shuffle-string/
package com.ateeth.LeetCodeDSA.strings.easy;

import java.util.Scanner;

public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        char[] ans = new char[s.length()] ;
        for(int i = 0 ; i < s.length() ; ++i){
            ans[indices[i]]  = s.charAt(i) ;
        }


        return new String(ans) ;
    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in) ;
        System.out.println("Enter the string : ");
        String str = sc.next() ;

        int[] indices = new int[str.length()] ;
        System.out.println("Enter the indices : ");
        for(int i = 0 ; i < indices.length ; ++i){
            indices[i] = sc.nextInt();
        }

        String ans = restoreString(str , indices) ;
        System.out.println(ans);
    }
}
