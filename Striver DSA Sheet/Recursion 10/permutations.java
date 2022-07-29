//Question Link : https://takeuforward.org/data-structure/print-all-permutations-of-a-string-array/

import java.util.* ; 
public class Solution {
    public static List<String> findPermutations(String s) {
        List<String> arr = new ArrayList<String>() ; 
        int len = s.length() ; 
        permutations("" , s , arr , len) ; 
        return arr ; 
    }
    
    public static void permutations(String p , String up , List<String> arr , int len){
        if(p.length() == len){
            arr.add(p) ; 
            return ; 
        }
        
        char ch = up.charAt(0) ; 
        for(int i = 0 ; i <= p.length() ; ++i){
            String first = p.substring(0 , i) ; 
            String second = p.substring(i , p.length()) ; 
            permutations(first + ch + second , up.substring(1) , arr , len) ; 
        }
    }
}
