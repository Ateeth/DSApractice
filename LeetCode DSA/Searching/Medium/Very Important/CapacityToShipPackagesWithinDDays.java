//Problem Link : https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
package com.ateeth.LeetCodeDSA.searching.medium.VeryImportant;

import java.util.Scanner;

public class CapacityToShipPackagesWithinDDays {
    public static int shipWithinDays(int[] weights, int days) {
        int left = 0 , right = 0 ;
        for(int w : weights){
            left = Math.max(left , w) ;
            right += w ;
        }

        // left is max weight
        // right is sum of weights
        while(left < right){
            // we will find capacity by trial and error starting from max weight
            int sum = 0  , neededDays = 1 ; //needDed days is number of days needed with current capacity
            int mid = left + ( right - left ) / 2 ; //mid value
            for( int w : weights ){ //go through all the weights
                if( sum + w > mid ){ //if capacity exceeded for current day
                    sum = 0 ; //reset sum to 0
                    neededDays += 1 ; //increase number of days needed by one will continue from next day
                }
                sum += w ; //add the weights to the sum of weights of current day
            }

            //we must increase the capacity as number of days needed is more than given threshold
            if ( neededDays > days ){
                left = mid + 1  ; //so increase capacity by mid + 1
            }else{
                //mid is also a possible answer so do not make it right =  mid - 1 but right = mid
                right = mid ; //we make end value to mid
            }
        }

        return left ; //left will have the optimal capacity now
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the size of the array : ");
        for (int i = 0; i < n ; ++i){
            arr[i] = sc.nextInt()  ;
        }

        System.out.println("Enter the number of days : ");
        int days = sc.nextInt() ;

        int ans = shipWithinDays(arr , days) ;
        System.out.println(ans);
    }
}
