//Problem Link : https://leetcode.com/problems/determine-if-string-halves-are-alike/
package com.ateeth.LeetCodeDSA.strings.easy;

import java.util.Scanner;

public class DetermineIfStringHalvesAreEqual {
    public static boolean checkVowel(char ch){
        char[] Vowels = {'a' , 'e' , 'i' , 'o' , 'u' , 'A' , 'E' , 'I' , 'O' , 'U'} ;
        for(char v : Vowels){
            if(v == ch){
                return true ;
            }
        }
        return false ;
    }

    public static boolean halvesAreAlike(String s) {
        int ctr1 = 0 , ctr2 = 0 ;

        for(int i = 0 ; i < s.length() ; ++i){
            if(checkVowel(s.charAt(i)) == true && i < s.length()/2){
                ++ctr1 ;
            } else if(checkVowel(s.charAt(i)) == true){
                ++ctr2 ;
            }
        }

        return ctr1 == ctr2 ;
    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in) ;
        System.out.println("Enter the string : ");
        String str = sc.next() ;
        boolean ans = halvesAreAlike(str) ;
        System.out.println(ans);
    }
}
