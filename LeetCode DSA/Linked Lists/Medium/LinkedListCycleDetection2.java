//Problem Link : https://leetcode.com/problems/linked-list-cycle-ii/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int lengthCycle(ListNode head){
        ListNode fast = head ; 
        ListNode slow = head ;
        int length = 0 ; 
        
        //first find intersection of fast and slow pointers
        while(fast != null && fast.next != null){
            fast = fast.next.next ; 
            slow = slow.next ; 
            
            //we have found a meeting point of fast and slow thus detected a cycle
            //now declare a new pointer from slow and move it ahead in the cycle untill
            //it reaches back to the slow pointer(can be done with fast pointer as well)
            //calculate how many times the temp pointer moved to get back to slow
            //this is length of cycle
            //i have used a do while loop as at first temp == slow so we need to move ahead
            //atleast 1 time
            if(fast == slow){
                ListNode temp = slow ; 
                do{
                    temp = temp.next ; 
                    ++length ; 
                }while(temp != slow) ; 
                
                return length ; 
            }
        }
        
        return 0 ; 
    }
    
    public ListNode detectCycle(ListNode head) {
        int length = lengthCycle(head) ; 
        //if length is 0 no cycle was found
        if(length == 0){
            return null ; 
        }
        
        //start a pointer f from head and move f ahead length of cycle number of times
        ListNode f = head ; 
        while(length > 0){
            f = f.next ; 
            --length ; 
        }
        
        //now declare a pointer s from head
        ListNode s = head ; 
        
        //keep moving f and s ahead by 1 and once they are equal return the node they point to i.e f or s
        //when they meet thwy will definitely meet at start of cycle
        while(f != s){
            f = f.next ; 
            s = s.next ; 
        }
        
        return f ; 
    }
}
