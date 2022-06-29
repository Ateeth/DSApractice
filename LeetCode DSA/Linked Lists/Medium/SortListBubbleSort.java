//Question Link : https://leetcode.com/problems/sort-list/

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
    public ListNode get(int index , ListNode head) {
        ListNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    
    public int findSize(ListNode head){
        int length = 0 ; 
        ListNode temp = head ; 
        
        while(temp != null){
            temp = temp.next ; 
            ++length ; 
        }
        
        return length ; 
    }
    
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head ; 
        }
        
        int size = findSize(head) ; 
         return bubbleSort(size - 1, 0 , head);
    }
    
    public ListNode bubbleSort(int row, int col , ListNode head) {
        if (row == 0) {
            return head;
        }

        ListNode tail = head ; 
        
        while(tail != null){
            tail = tail.next ; 
        }
        
        if (col < row) {
            ListNode first = get(col , head);
            ListNode second = get(col + 1 , head);

            if (first.val > second.val) {
                // swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    ListNode prev = get(col - 1 , head);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    ListNode prev = get(col - 1 , head);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            return bubbleSort(row, col + 1 , head);
        } else {
          return bubbleSort(row - 1, 0 , head);
        }
        
     
    }
}
