package org.dsa.PradeepDSASheet._7LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        // https://leetcode.com/problems/reverse-linked-list/description/
    }
    /*public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode curr = head, prev = null;
        ListNode next = head.next;

        while(curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null)
                next = next.next;
        }
        return prev;
    }*/
}
