import java.util.* ; 
public class Solution {
    public static ArrayList<ArrayList<Integer>> solveNQueens(int n) {
        int i , j ; 
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>() ; 
        int[][] board  = new int[n][n] ;
        nQueens(board , ans , 0) ; 
        return ans ; 
    }
    
    public static void nQueens(int[][] board , ArrayList<ArrayList<Integer>> ans , int row){
        if(row == board.length){
            ArrayList<Integer> possible = new ArrayList<>() ; 
            for(int i = 0 ; i < board.length ; ++i){
                for(int j = 0 ; j < board.length ; ++j){
                    possible.add(board[i][j]) ;
                }
            }
            
            ans.add(possible) ;
            return ;
        }
        
        for(int col = 0 ; col < board.length ; ++col){
            if(isSafe(board , row , col)){
                board[row][col] = 1 ; 
                nQueens(board , ans ,  row + 1) ; 
                board[row][col] = 0 ; 
            }
        }
    }
    
    public static boolean isSafe(int[][] board , int row , int col){
        //vertical check
        for(int i = 0 ; i < row ; ++i){
            if(board[i][col] == 1){
                return false ; 
            }
        }
        
        //diagonal left
        int maxLeft = Math.min(row , col) ; 
        for(int i = 1 ; i <= maxLeft ; ++i){
            if(board[row - i][col - i] == 1){
                return false ; 
            }
        }
        
        //diagonal right
        int maxRight = Math.min(row , board.length - col - 1) ; 
         for(int i = 1 ; i <= maxRight ; ++i){
            if(board[row - i][col + i] == 1){
                return false ; 
            }
        }
        return true  ; 
    }
    
}
