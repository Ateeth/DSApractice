//Problem Link : https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
package com.ateeth.LeetCodeDSA.strings.easy;

import java.util.Scanner;

public class CheckIfTwoStringsAreEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder() ;
        StringBuilder sb2 = new StringBuilder() ;

        for(String word : word1){
            sb1.append(word) ;
        }

        for(String word : word2){
            sb2.append(word) ;
        }

        String s1 = sb1.toString() ;
        String s2 = sb2.toString() ;
        if(s1.equals(s2)){
            return true ;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter number of elements for string array 1: ");
        int n1 = sc.nextInt() ;

        String[] word1 = new String[n1] ;
        System.out.println("Enter the words for array 1 : ");
        for(int i = 0 ; i < n1 ; ++i){
            word1[i] = sc.next() ;
        }

        System.out.println("Enter number of elements for string array 2: ");
        int n2 = sc.nextInt() ;

        String[] word2 = new String[n1] ;
        System.out.println("Enter the words for array 2 : ");
        for(int i = 0 ; i < n2 ; ++i){
            word2[i] = sc.next() ;
        }

        boolean ans = arrayStringsAreEqual(word1 , word2) ;
        System.out.println(ans);
    }
}
