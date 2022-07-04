//Question Link : https://leetcode.com/problems/remove-nth-node-from-end-of-list/
package com.ateeth.StriverSheet.LinkedList5;

public class RemoveNthNodeFromEndOfTheList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int key) {
        // First pointer will point to
        // the head of the linked list
        ListNode first = head;

        // Second pointer will point to the
        // Nth node from the beginning
        ListNode second = head;
        for (int i = 0; i < key; i++) {

            // If count of nodes in the given
            // linked list is <= N
            if (second.next == null) {

                // If count = N i.e. delete the head node
                if (i == key - 1)
                    head = head.next;
                return head;
            }
            second = second.next;
        }

        // Increment both the pointers by one until
        // second pointer reaches the end
        while (second.next != null) {
            first = first.next;
            second = second.next;
        }

        // First must be pointing to the
        // Nth node from the end by now
        // So, delete the node first is pointing to
        first.next = first.next.next;
        return head ;
    }


}
