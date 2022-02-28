//Problem Link : https://leetcode.com/problems/sorting-the-sentence/
package com.ateeth.LeetCodeDSA.strings.easy.CouldNotUnderstandOptimalSolution;

import java.util.Scanner;

public class SortingTheSentence {
    public static String sortSentence(String s) {
        String[] str = s.split(" ");
        // Since the String contains only whitespaces, it's safe to split the String at them

        String[] res = new String[str.length];
        // This String array will hold the rearranged words

        StringBuilder sb = new StringBuilder();
        // Instead of using '+' operator to concat repeatedly,
        // I have created a StringBuilder object which is more efficient

        int i = 0;
        for (String elem : str) {
            i = (int) (elem.charAt(elem.length() - 1) - '0');
            // This  will extract the digit present at the end of each String
            // and store it in i (i = index of the word in res[])

            res[i - 1] = elem.substring(0, elem.length() - 1);
            // This gives the substring of each String except for the digit in the end and
            // stores the word at an appropriate index (i - 1) in res[]
        }
        //append the words from res[] to StringBuilder object to form a sentence
        for (i = 0; i < res.length - 1; i++)
            sb.append(res[i]).append(" ");

        //Append the last word without trailing space
        sb.append(res[i]);
        return sb.toString();
    }

    /*
        public String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();

        // append a string into StringBuilder input1
        sb.append(s);

        // reverse StringBuilder input1
        sb.reverse();

        String str = sb.toString() ;

        String[] words = str.split(" ") ;

        Arrays.sort(words) ;

        StringBuilder s1 = new StringBuilder() ;
        StringBuilder ans = new StringBuilder() ;
        StringBuilder s2 = new StringBuilder() ;

        for(String word : words){
            // append a string into StringBuilder input1
            s1.append(word);

            s2.append(s1.substring(1)) ;

            ans.append((s2.reverse())) ;

            ans.append(" ") ;
            s1.setLength(0);
            s2.setLength(0) ;
        }

        System.out.println(ans) ;


        return ans.toString().trim() ;
    }
     */

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in) ;
        System.out.println("Enter the string : ");
        String str = sc.next() ;
        String ans = sortSentence(str) ;
        System.out.println(ans);
    }
}
