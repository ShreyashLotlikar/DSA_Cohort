package org.dsa.PradeepDSASheet._7LinkedList;

// https://leetcode.com/problems/add-two-numbers/description/
// https://youtu.be/OgSnJa9pDk0
public class AddTwoNumbers {
    public static void main(String[] args) {

    }
    /*
    // revise more
     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;
        while(l1!=null || l2!=null || carry!=0) {
            int val1 = (l1==null)?0:l1.val;
            int val2 = (l2==null)?0:l2.val;
            int value = val1 + val2 + carry;
            ListNode newNode = new ListNode(value%10);
            carry = value / 10;
            if(head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
            if(l1!=null)
                l1 = l1.next;
            if(l2!=null)
                l2 = l2.next;
        }
        return head;
    }
    */
}
