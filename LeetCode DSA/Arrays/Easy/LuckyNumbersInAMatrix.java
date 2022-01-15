//Problem Link : https://leetcode.com/problems/lucky-numbers-in-a-matrix/
package com.ateeth.LeetCodeDSA.arrays.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuckyNumbersInAMatrix {


    public static List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>() ;

        //get the min of all rows
        ArrayList<Integer> rowMin = new ArrayList<>() ;
        for( int i = 0 ; i < matrix.length ; ++i){
            int min = matrix[i][0] ;
            for(int j = 0 ; j < matrix[i].length ; ++j){
                min = Math.min(min , matrix[i][j])  ;
            }
            rowMin.add(min) ;
        }

        //Get max of all columns
        ArrayList<Integer> colMax = new ArrayList<>() ;
        for(int j = 0 ; j < matrix[0].length ; ++j){
            int max = matrix[0][j] ;
            for(int i = 0 ; i < matrix.length ; ++i){
                max = Math.max(max , matrix[i][j]) ;
            }
            colMax.add(max) ;
        }

        //if present in rowMin and colMax add the number to result ArrayList
        for(int x : rowMin){ //forEach loop
            if(colMax.contains(x)){
                result.add(x) ;
            }
        }
        return result ;
    }

    public static void main(String[] args){
        int m , n  ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of rows in the matrix  : ");
        m = sc.nextInt() ;

        System.out.println("Enter the number of columns in the matrix : ");
        n = sc.nextInt();

        int[][] matrix = new int[m][n] ;
        System.out.println("Enter the values in the matrix : ");
        for(int i = 0 ; i < m ; ++i){
            for(int j = 0 ; j < n ; ++j){
                matrix[i][j] = sc.nextInt() ;
            }
        }

        List<Integer> ans = luckyNumbers(matrix) ;
        for(int i  : ans){
            System.out.println(i);
        }
    }
}
