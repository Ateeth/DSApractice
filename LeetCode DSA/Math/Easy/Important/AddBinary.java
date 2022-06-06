//Problem Link : https://leetcode.com/problems/add-binary/
package com.ateeth.LeetCodeDSA.math.easy.Important;

import java.util.Scanner;

public class AddBinary {

    /*
    public static int B2N(String s){
        int x = 0  , p = 0;
        for(int i = s.length() - 1 ; i >= 0 ; i--){
            char ch = s.charAt(i) ;
            x += (ch - '0') * Math.pow(2 , p) ;
            ++p ;
        }

        return x ;
    }

    public static String N2B(int j){
        StringBuilder sb = new StringBuilder() ;
        while(j > 0){
            int d = j % 2 ;
            sb.insert(0 , d) ;
            j /= 2 ;
        }

        return sb.toString() ;
    }

    public static String addBinary(String a, String b) {
        int x = B2N(a) ;
        int y = B2N(b) ;
        System.out.println( x + " " + y) ;
        return N2B(x + y) ;
    }
   */

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder(); //Google immutability or string vs stringbuilder if you don't know why we use this instead of regular string
        int i = a.length() - 1, j = b.length() -1, carry = 0; //two pointers starting from the back, just think of adding two regular ints from you add from back
        while (i >= 0 || j >= 0) {
            int sum = carry; //if there is a carry from the last addition, add it to carry
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                --j ;
            }//we subtract '0' to get the int value of the char from the ascii
            if (i >= 0){
                sum += a.charAt(i) - '0';
                --i ;
            }
            sb.append(sum % 2); //if sum==2 or sum==0 append 0 cause 1+1=0 in this case as this is base 2 (just like 1+9 is 0 if adding ints in columns)
            carry = sum / 2; //if sum==2 we have a carry, else no carry 1/2 rounds down to 0 in integer arithematic
        }
        if (carry != 0) sb.append(carry); //leftover carry, add it
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the first string : ");
        String a = sc.next() ;
        System.out.println("Enter the second string : ");
        String b = sc.next() ;
        System.out.println(addBinary(a , b)) ;
    }
}
