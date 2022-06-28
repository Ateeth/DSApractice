//Problem Link : https://leetcode.com/problems/middle-of-the-linked-list/

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
    public ListNode middleNode(ListNode head) {
        ListNode fast = head ; 
        ListNode slow = head ; 
        
        /*
        use a slow and fast pointer
        fast pointer moves 2 ahead at a time
        slow pointer moves 1 ahead at a time
        by the time fast pointer reaches the end the slow pointer will reach the middle
        */
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next ; 
        }
        
        return slow ; 
    }
}
