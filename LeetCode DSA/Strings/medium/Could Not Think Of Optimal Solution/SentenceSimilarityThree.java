//Problem Link : https://leetcode.com/problems/sentence-similarity-iii/
package com.ateeth.LeetCodeDSA.strings.Medium.CouldNotThinkOfOptimalSolution;

import java.util.Scanner;

public class SentenceSimilarityThree {
    /*
        Split the two sentences into words;
        Scan the shorter one from left and compare word by word with the longer;
        Whenever the words from the 2 sentences are not equal, compare the tails of the 2 sentences
        word by word till the end or they do not match;
        Confirm if the pointer reaches the end of shorter sentence. If yes, return true; otherwise, return false.
    */
    public static boolean areSentencesSimilar(String s1, String s2) {
        String[] words1 = s1.split(" "), words2 = s2.split(" ");
        int i = 0, n1 = words1.length, n2 = words2.length;
        if (n1 > n2) {
            return areSentencesSimilar(s2, s1);
        }
        while (i < n1 && words1[i].equals(words2[i])) {
            ++i;
        }
        while (i < n1 && words1[i].equals(words2[n2 - n1 + i])) {
            ++i;
        }
        return i == n1;
    }

    /*
    My own soln but does work with duplicate characters
    passed 128/136 cases
     public static boolean areSentencesSimilar(String sentence1, String sentence2) {
        //we r trying to make the longer string as sentence1
        //shorter string as sentence 2
        if(sentence1.length() < sentence2.length()){
            return areSentencesSimilar(sentence2 , sentence1) ;
        }

        String longer = sentence1 ;
        String shorter  = sentence2 ;

        String[] longerArray = sentence1.split(" ") ;
        String[] shorterArray = sentence2.split(" ") ;


        System.out.println(Arrays.toString(longerArray)) ;


        for(String word : shorterArray){
            if(check(word , longerArray) == 0){
                return false ;
            }
        }

        ArrayList<String> remaining = new ArrayList<>() ;
        for(String word : longerArray){
            if(check(word , shorterArray) == 0){
                remaining.add(word) ;
            }
        }

        System.out.println(remaining) ;

        StringBuilder sb = new StringBuilder() ;
        for(String word : remaining){
            sb.append(word + " ") ;
        }

        String remainingWord = sb.toString().trim() ;

        System.out.println(remaining.get(0)) ;
        int idx = checkFirstMissingIndex(longerArray , remaining.get(0)) ;
        System.out.println(idx) ;

        StringBuilder shorterPlusRemaining = new StringBuilder() ;
        for(int i = 0 ; i < shorterArray.length ; ++i){
            if(i == idx){
                for(int j = 0 ; j < remaining.size() ; ++j){
                    shorterPlusRemaining.append(remaining.get(j) + " ") ;
                }
            }
            shorterPlusRemaining.append(shorterArray[i] + " ") ;
        }

        System.out.println(shorterPlusRemaining.toString().trim()) ;
        // if(longer.length() != (shorter.length() + remainingWord.length())){
        //     return false;
        // }

        if(longer.equals(shorterPlusRemaining.toString().trim())){
            return true ;
        }
        return false ;
    }

    public int check(String str , String[] arr) {
        for(int i = 0 ; i < arr.length ; ++i){
            if(arr[i].equals(str)){
                return 1 ;
            }
        }

        return 0 ;
    }

    public int checkFirstMissingIndex(String[] longerArray , String remainingWord1){
        for(int i = 0 ; i < longerArray.length ; ++i){
            if(longerArray[i].equals(remainingWord1)){
                return i ;
            }
        }
        return -1 ;
    }
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();

        System.out.println("Enter the string : ");
        String str1 = sc.nextLine();

        boolean ans = areSentencesSimilar(str , str1) ;
        System.out.println(ans);
    }
}
