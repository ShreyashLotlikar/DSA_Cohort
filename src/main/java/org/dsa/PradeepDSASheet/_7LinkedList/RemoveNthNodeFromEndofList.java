package org.dsa.PradeepDSASheet._7LinkedList;
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
public class RemoveNthNodeFromEndofList {
    public static void main(String[] args) {

    }
    /*public ListNode removeNthFromEnd(ListNode head, int n) {
        // need to do in our own way
        ListNode fast = head;

        for(int i=0;i<n;i++)
            fast = fast.next;

        if (fast == null)
            return head.next;

        ListNode slow = head;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }*/
}
