//Problem Link : https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/
package com.ateeth.LeetCodeDSA.Recursion.medium;

import java.util.* ;
public class FindKthBitInNthBinaryString {
    public static char findKthBitRecursion(int n, int k) {
         String str = findNthString(n) ;
         return str.charAt(k - 1) ;
     }

     public static String findNthString(int n){
         if(n == 1){
             return "0" ;
         }

         return findNthString(n - 1) + "1" + reverse(invert(findNthString(n - 1))) ;
     }

    public static char findKthBitIterative(int n, int k) {
        ArrayList<String> arr = new ArrayList<>() ;
        arr.add("0") ;

        for(int i = 1 ; i < n ; ++i){
            arr.add(arr.get(i - 1) + "1" + reverse(invert(arr.get(i - 1)))) ;
        }
        String str = arr.get(n- 1) ;
        return str.charAt(k - 1) ;
    }


    public static String reverse(String str){
        StringBuilder sb = new StringBuilder() ;
        sb.append(str) ;

        String res = sb.reverse().toString() ;
        return res ;
    }

    public static String invert(String str){
        StringBuilder sb = new StringBuilder() ;
        for(int i = 0 ; i < str.length() ; ++i){
            char ch = str.charAt(i) ;
            if(ch == '0'){
                sb.append("1") ;
            }else{
                sb.append("0") ;
            }
        }

        return sb.toString() ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter which binary string number : ");
        int n = sc.nextInt();

        System.out.println("Enter the bit number : ");
        int k = sc.nextInt();

        System.out.println(findKthBitIterative(n , k));
        System.out.println(findKthBitRecursion(n , k));
    }
}
