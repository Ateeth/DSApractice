//Problem Link : https://leetcode.com/problems/reverse-prefix-of-word/
package com.ateeth.LeetCodeDSA.strings.easy.CouldNotUnderstandOptimalSolution;

import java.util.Scanner;

public class ReversePrefixOfWord {
    public static String reversePrefix(String word, char ch) {
        StringBuilder ans = new StringBuilder();
        int k = 0 , i = 0;

        //Loop through string to find the first index of ch
        while(i < word.length()) {

            //if the first occurence of ch is found
            if(word.charAt(i) == ch) {

                //let k be the index of the character ch
                k = i++;

                //now from k to 0 append the characters to StringBuilder
                while(k >= 0) {
                    ans.append(word.charAt(k));
                    --k ;
                }

                //exit the loop after the letters from k to 0 are added
                break;
            }
            ++i ;
        }

        //add the rest of the word after the occurence of ch
        while(i < word.length()) {
            ans.append(word.charAt(i++));
        }

        //if no occurence of ch was found return the word as it is
        if(ans.toString() == ""){
            return word;
        }

        return ans.toString();
    }

    /*
    public String reversePrefix(String word, char ch) {
        char[] c = word.toCharArray();
        int locate = 0;
        for (int i = 0; i < word.length(); i++) { //first occurrence of ch
            if (ch == c[i]) {
                locate = i;
                break;
            }
        }
        char[] res = new char[word.length()];
        for (int i = 0; i <= locate; i++) {
            res[i] = c[locate - i];
        }
        for (int i = locate + 1; i < word.length(); i++) {
            res[i] = c[i];
        }
        return String.valueOf(res);
    }
    */

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in) ;
        System.out.println("Enter the string : ");
        String str = sc.next() ;

        System.out.println("Enter the string 2 : ");
        char ch = sc.next().charAt(0) ;

        String ans = reversePrefix(str , ch) ;
        System.out.println(ans);
    }
}
