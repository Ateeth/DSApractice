//Problem Link : https://www.geeksforgeeks.org/check-for-balanced-parenthesis-without-using-stack/
package com.ateeth.LeetCodeDSA.Recursion.Easy.ImportantAndTricky;

import java.util.Scanner;

public class CheckForBalancedParenthesisWithoutUsingStack {

    public static boolean check(String s , String op , int idx ){
        if(idx == s.length()){
            return true ;
        }


        char ch1 = s.charAt(idx) ;

        if(idx == s.length() - 1 && op.length() == 2){
            return false ;
        }

        if(idx == s.length() - 1 && (ch1 == '(' || ch1 =='[' || ch1 == '{')){
            return false ;
        }

        if(op.equals("") && (ch1 == ')' || ch1 ==']' || ch1 == '}')){
            return false ;
        }
        //System.out.println(op + " " + ch1);
        if(ch1 == '(' || ch1 == '[' || ch1 == '{'){
            return check(s , op + ch1 , idx + 1 ) ;
        }

        if(op.length() == 0 && (ch1 == ')' || ch1 == ')' || ch1 == '{')){
            return false ;
        }

        char c = op.charAt(op.length() - 1);
        if(ch1 == ')' && c != '('){
            return false ;
        }

        else if(ch1 == ']' && c != '['){
            return false ;
        }

        else if(ch1 == '}' && c != '{'){
            return false ;
        }

        else{
            return check(s , op.substring(0 , op.length() - 1) , idx + 1  ) ;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression : ");
        String expr = sc.next() ;
        if (check(expr, "" ,  0 ))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
