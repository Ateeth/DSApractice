//Question Link : https://leetcode.com/problems/defanging-an-ip-address/
package com.ateeth.LeetCodeDSA.strings.easy;

import java.util.Scanner;

public class DefangingAnIPAddress {
    public static String defangIPaddr(String address) {
        StringBuilder defanged = new StringBuilder() ;
        for(int i = 0 ; i < address.length() ; ++i){
            if(address.charAt(i) == '.'){
                defanged.append("[.]") ;
            }else{
                defanged.append(address.charAt(i)) ;
            }
        }

        return defanged.toString() ;
    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in) ;
        System.out.println("Enter the string : ");
        String str = sc.next() ;
        String ans = defangIPaddr(str) ;
        System.out.println(ans);
    }
}
