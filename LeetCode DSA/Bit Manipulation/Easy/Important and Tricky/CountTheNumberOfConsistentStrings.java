//Problem Link : https://leetcode.com/problems/count-the-number-of-consistent-strings/
package com.ateeth.LeetCodeDSA.bitwise.easy.ImportantAndTricky;

import java.util.* ;
public class CountTheNumberOfConsistentStrings {
    public static int countConsistentStrings(String allowed, String[] words) {
        int map = 0;

        //map which all characters are allowed for example allowed = "ab"
        //first map for a  = 1
        //for b second position mapped = 11 => ba
        for (char c : allowed.toCharArray()) {
            map |= 1 << c - 'a';
        }

        int count = 0;
        for (String word : words) {
            boolean consistent = true;
            for (char c : word.toCharArray()) {
                //if the bit of map at c-'a' is not set meaning it is not allowed
                if ((map & (1 << c - 'a')) == 0) {
                    consistent = false;
                    break;
                }
            }
            count += consistent ? 1 : 0;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the allowed string : ");
        String allowed = sc.next() ;

        System.out.println("Enter the number of words : ");
        int n = sc.nextInt() ;

        System.out.println("Enter the words : ");
        String[] words = new String[n] ;

        for(int i = 0 ; i < n ; ++i){
            words[i] = sc.next();
        }

        System.out.println(countConsistentStrings(allowed , words));
    }

}
