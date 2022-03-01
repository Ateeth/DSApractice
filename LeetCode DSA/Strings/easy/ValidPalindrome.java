//Problem Link : https://leetcode.com/problems/valid-palindrome/
package com.ateeth.LeetCodeDSA.strings.easy;

import java.util.Scanner;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase() ;
        StringBuilder sb = new StringBuilder() ;
        for(int i = 0 ; i < s.length() ; ++i){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                sb.append(s.charAt(i)) ;
            }
        }

        String res = sb.toString() ;

        if(res.length() == 1 || res.length() == 0){
            return true ;
        }

        for(int i = 0 ; i <= res.length()/2 ; ++i){
            if(res.charAt(i) != res.charAt(res.length() - 1 - i)){
                return false ;
            }
        }
        System.out.println(sb.toString()) ;

        return true ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.next();

        boolean ans = isPalindrome(str) ;
        System.out.println(ans);
    }
}
