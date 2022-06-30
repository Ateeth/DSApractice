//Question Link : https://leetcode.com/problems/reverse-linked-list-ii/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head ; 
        }
        
        ListNode current = head ; 
        ListNode prev = null ; 
        
        int i ; 
        
        //arrive at part to reverse the linked list i.e left - 1
        for(i = 0 ; current != null && i < left - 1 ; ++i){
            prev = current ; 
            current = current.next ; 
        }
        
        //current points to first node in the part to reverse 
        //last is last element before the part to reverse
        //next will first pint to second element in part to reverse
        
        ListNode last = prev ; 
        ListNode newEnd = current ;
        ListNode next = current.next ; 
        
        //now right - left + 1 times just reverse like usual
        for(i = 0 ; current != null && i < right - left + 1 ; ++i){
            current.next = prev ; 
            prev = current ; 
            current = next ; 
            if(next != null){
                next = next.next ; 
            }
        }
        
        //if last was null then head will be equal to prev element
        if(last == null){
            head = prev ; 
        }
        //last.next will now point to prev which is the first node in the reversed part of linked list
        else{
            last.next = prev ; 
        }
        
        //new end will now point to current , current is now the first element outside the paer of the linekd list to reverse
        newEnd.next = current ; 
        
        return head ; 
    }
}
