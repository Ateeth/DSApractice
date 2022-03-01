//Problem Link : https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
package com.ateeth.LeetCodeDSA.strings.easy;

import java.util.Scanner;

public class DecryptStringFromAlphabetToIntegerMapping {
    public static String freqAlphabets(String s) {
        int n = s.length();
        StringBuilder res = new StringBuilder();
        int i = 0 ;
        while (i < n) {
            //greater than 9 i.e 2 digit + #
            if(i + 2 < n && s.charAt(i+2) == '#') {
                //96 is ascii val of a
                res.append((char)(Integer.parseInt(s.substring(i, i+2)) + 96));
                i += 3;
            }

            //Single digit i.e 0 - 9
            else {
                res.append((char)(s.charAt(i) + '0'));
                i++;
            }
        }
        return res.toString();
    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in) ;
        System.out.println("Enter the string : ");
        String str = sc.next() ;
        String ans = freqAlphabets(str) ;
        System.out.println(ans);
    }
}
