//Problem Link : https://leetcode.com/problems/check-if-the-sentence-is-pangram/

package com.ateeth.LeetCodeDSA.arrays.easy;

import java.util.Scanner ;
public class CheckIfTheSentenceIsPanagram {
        public static boolean checkIfPangram(String sentence) {
            boolean[] letters = new boolean[26];

            for (char c : sentence.toCharArray()) {
                letters[c - 'a'] = true;
            }

            //find any letter that not exist
            for (boolean existLetter : letters) {
                if (!existLetter) return false;
            }

            return true;
        }

    public static void main(String[] args) {
        String sentence ;
        Scanner sc  = new Scanner(System.in) ;
        System.out.println("Enter the sentence: ") ;
        sentence = sc.next() ;

        boolean ans = checkIfPangram(sentence) ;
        System.out.println(ans); ;
    }
}
