//Problem Link : https://leetcode.com/problems/set-matrix-zeroes/
package com.ateeth.StriverSheet.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class SetMatrix0s {
    public static void setZeros(int[][] matrix) {
        boolean fr = false, fc = false;

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {

                //a cell of the matrix has been found out as 0
                if (matrix[i][j] == 0) {
                    if (i == 0) { //first row had a 0 at first itself
                        fr = true;
                    }
                    if (j == 0) { //first column had a zero at first itself
                        fc = true;
                    }

                    //set the first element in the same row as 0
                    matrix[i][0] = 0;

                    //set the first element in the same column as 0
                    matrix[0][j] = 0;
                }
            }
        }

        //traverse the matrix except the first row or first column thus index starts from 1
        for (int i = 1; i < matrix.length; ++i) {
            for (int j = 1 ; j < matrix[i].length ; ++j){

                /*
                    if the first element in the same row is 0 or the first element in the same column is 0
                    if condition true => there was a 0 in the same row or column so make the cell 0
                */
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0 ;
                }
            }
        }

        /* if fr is true it means the first row aldready had a 0 prior itself so make entire first row as 0 */
        if(fr == true){
            for(int i = 0 ; i < matrix[0].length ; ++i){
                matrix[0][i] = 0 ;
            }
        }

        /* if fc is true it means the first column already had a 0 prior itself so make entire first column as 0 */
        if(fc == true) {
            for (int i = 0; i < matrix.length; ++i) {
                matrix[i][0] = 0;
            }
        }

        for(int i = 0 ; i < matrix.length ; ++i){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter number of rows : ");
        int r = sc.nextInt() ;
        System.out.println("Enter number of columns : ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c] ;
        System.out.println("Enter matrix elements : ");
        for(int i = 0 ; i < r ; ++i){
            for(int j = 0 ; j < c ; ++j){
                matrix[i][j] = sc.nextInt();
            }
        }

        setZeros(matrix);
    }
}
