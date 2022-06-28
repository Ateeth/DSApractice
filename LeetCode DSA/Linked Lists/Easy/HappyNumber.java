//Question Link : https://leetcode.com/problems/happy-number/
class Solution {
    
    public int findSquare(int n){
        int sq = 0 ; 
        int dig , rem ; 
        while(n > 0){
            dig = n % 10 ; 
            sq += (dig * dig) ;
            n /= 10 ; 
        }
        
        return sq ; 
    }
    
    public boolean isHappy(int n) {
        int slow = n ; 
        int fast = n ;
    
        //if slow and fast meet a cycle exists
        do{
            slow = findSquare(slow) ; 
            fast = findSquare(findSquare(fast)) ; 
        }while(slow != 1 && slow != fast) ; 
        //if slow == 1 no cycle exists
         return slow == 1 ; 
    }
}
