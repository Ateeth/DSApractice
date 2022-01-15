//Problem Link : https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
package com.ateeth.LeetCodeDSA.arrays.easy;

import java.util.Scanner;

public class CellsWithOddValuesInAMatrix {

    public static void incrementCells(int[][] matrix , int row , int col){
        //increment the entire row by 1
        for(int i = 0 ; i < matrix[row].length ; ++i){
            ++matrix[row][i] ;
        }

        //increment all cells on column column
        for(int i = 0 ; i < matrix.length ; ++i){
            ++matrix[i][col] ;
        }
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int ctr = 0 ;
        int[][] matrix = new int[m][n] ;
        for(int i = 0 ; i < indices.length ; ++i){
            incrementCells(matrix , indices[i][0] , indices[i][1]) ;
        }

        for(int i = 0 ; i < m ; ++i){
            for(int j = 0 ; j < n ; ++j){
                if(matrix[i][j] % 2 == 1){
                    ++ctr ;
                }
            }
        }
        return  ctr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the dimensions of the matrix: ") ;
        int m ,n ;
        m = sc.nextInt() ;
        n = sc.nextInt() ;

        int[][] matrix = new int[m][n] ;

        System.out.println("Enter the length for indices array : ") ;
        int len = sc.nextInt() ;
        int[][] indices = new int[len][2] ;

        System.out.println("Enter the values for indices: ") ;
        for(int i = 0 ; i < len ; ++i){
            indices[i][0] = sc.nextInt() ;
            indices[i][1] = sc.nextInt();
        }

        int ans = oddCells(m , n , indices) ;
        System.out.println(ans) ;

    }
}
