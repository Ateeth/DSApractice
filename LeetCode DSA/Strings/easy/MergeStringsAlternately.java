//Problem Link : https://leetcode.com/problems/merge-strings-alternately/
package com.ateeth.LeetCodeDSA.strings.easy;

import java.util.Scanner;

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {

        int ctr1  = 0, ctr2 = 0 ;
        StringBuilder sb = new StringBuilder() ;

        while(ctr1 < word1.length() || ctr2 < word2.length()){
            if(ctr1 < word1.length()){
                sb.append(word1.charAt(ctr1)) ;
                ++ctr1 ;
            }

            if(ctr2 < word2.length()){
                sb.append(word2.charAt(ctr2)) ;
                ++ctr2 ;
            }
        }

        return sb.toString() ;
    }

    /*
    public static String mergeAlternately(String word1, String word2) {
       int length1 = word1.length(), length2 = word2.length();

        char[] resultArr = new char[length1 + length2];

        // Two pointers are maintained which will be used to
        // fetch the characters in alternating order.
        int pointer1 = 0, pointer2 = 0, resultPointer = 0;

        //When either of the word's traversal is completed then loop
        //will only consider the other word.
        while (pointer1 < length1 || pointer2 < length2) {
            if (pointer1 < length1) {
                resultArr[resultPointer++] = word1.charAt(pointer1++);
            }
            if (pointer2 < length2) {
                resultArr[resultPointer++] = word2.charAt(pointer2++);
            }
        }
        return new String(resultArr);
     }
    */

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in) ;
        System.out.println("Enter the string : ");
        String str = sc.next() ;

        System.out.println("Enter the string 2 : ");
        String str1 = sc.next() ;

        String ans = mergeAlternately(str , str1) ;
        System.out.println(ans);
    }
}
