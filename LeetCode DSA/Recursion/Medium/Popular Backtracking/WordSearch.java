//Problem Link : https://leetcode.com/problems/word-search/
package com.ateeth.LeetCodeDSA.Recursion.medium.PopularBacktracking;

import java.util.* ;
public class WordSearch {
    public static boolean exist(char[][] board, String word) {
        //check if visited or not
        boolean[][] visited = new boolean[board.length][board[0].length] ;

        int i , j ;
        for(i = 0 ; i < board.length ; ++i){
            for(j = 0 ; j < board[0].length ; ++j){
                if(board[i][j] == word.charAt(0) && search(board , visited , word , i , j , 0)){
                    return true ;
                }
            }
        }

        return false ;
    }

    public static boolean search(char[][] board , boolean[][] visited , String word , int row , int column , int idx){

        if(idx == word.length()){
            return true ;
        }

        if(row >= board.length || row < 0 || column < 0 || column >= board[0].length || board[row][column] != word.charAt(idx) || visited[row][column] == true){
            return false ;
        }

        //mark the cell as visited
        visited[row][column] = true ;

        //look for the next character in all directions
        if(search(board , visited , word , row - 1 , column , idx + 1) || search(board , visited , word , row + 1 , column , idx + 1) || search(board , visited , word , row , column - 1 , idx + 1) || search(board , visited , word , row , column + 1 , idx + 1)){
            return true ;
        }

        //mark the cell back as unvisited i.e backtrack
        visited[row][column] = false ;

        return false ;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of rows of the board : ");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns of the board : ");
        int columns = sc.nextInt();

        char[][] board = new char[rows][columns] ;
        System.out.println("Enter the characters of the board : ");

        int i , j ;
        for(i = 0 ; i < board.length ; ++i){
            for(j = 0 ; j < board[0].length ; ++j){
                board[i][j] = sc.next().charAt(0) ;
            }
        }

        System.out.println("Enter the word : ");
        String str = sc.next() ;

        System.out.println(exist(board , str));
    }
}
