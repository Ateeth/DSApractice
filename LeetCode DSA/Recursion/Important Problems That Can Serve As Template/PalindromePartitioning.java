//Problem Link : https://leetcode.com/problems/palindrome-partitioning/
package com.ateeth.LeetCodeDSA.Recursion.ImportantProgramsThatCanServeAsTemplates;

import java.util.* ;
public class PalindromePartitioning {
    public static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>() ;
        List<String> tempList = new ArrayList<>() ;
        backtrack(ans , tempList , s , 0) ;
        return ans ;
    }

    public static void backtrack(List<List<String>> ans , List<String> tempList , String str , int start){
        if(start == str.length()){
            ans.add(new ArrayList<>(tempList)) ;
        }

        for(int i = start ; i < str.length() ; ++i){
            if(isPalindrome(str , start , i)){
                tempList.add(str.substring(start , i + 1)) ;
                backtrack(ans , tempList , str , i + 1) ;
                tempList.remove(tempList.size() - 1) ;
            }
        }
    }
    public static boolean isPalindrome(String s , int low , int high){
        while(low < high){
            if(s.charAt(low) != s.charAt(high)){
                return false ;
            }

            --high ;
            ++low ;
        }

        return true ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the string : ");
        String str = sc.next() ;
        List<List<String>> list = partition(str) ;

        for(List<String> l : list){
            System.out.println(l);
        }
    }
}
