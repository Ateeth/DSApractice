//Problem Link : https://www.geeksforgeeks.org/stock-buy-sell/

/*
Here if stock price on a day is greater than stock price on its previous day add the 2 days to the answer as a profit can be made
 */
package com.ateeth.GeeksForGeeksDSA.SDESheet.Arrays.Important;

import java.util.* ;
public class StockBuyAndSell {
    //Function to find the days of buying and selling stock for max profit.
//    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
    public static void stockBuySell(int A[], int n) {
        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<ArrayList<Integer>>() ;
        int ctr = 0 ;
        for(int i = 1 ; i < n  ; ++i){
            if(A[i] > A[i-1]){
                listOfLists.add(new ArrayList<Integer>());
                listOfLists.get(ctr).add(i-1) ;
                listOfLists.get(ctr).add(i) ;
                ++ctr ;
            }
        }

        for(ArrayList<Integer> i : listOfLists){
            System.out.println(i) ;
        }
        //return listOfLists ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter stock prices : ");
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt() ;
        }

        stockBuySell(arr , n);
    }
}
