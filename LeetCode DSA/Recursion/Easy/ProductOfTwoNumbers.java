//Problem Link : https://www.geeksforgeeks.org/product-2-numbers-using-recursion/
package com.ateeth.LeetCodeDSA.Recursion.Easy;

import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static int product(int x , int y , int sum){
        if( y == 0 ){
            return sum ;
        }

        return product(x , y - 1 , sum + x) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the first number : ");
        int x = sc.nextInt() ;
        System.out.println("Enter the second number : ");
        int y = sc.nextInt();

        if(x < y){
            System.out.println(product(x , y , 0));
        }else{
            System.out.println(product(y , x , 0));
        }
    }
}
