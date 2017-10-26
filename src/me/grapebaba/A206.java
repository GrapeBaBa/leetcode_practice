package me.grapebaba;

public class A206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode reversed = reverseList1(head.next);
        head.next.next = head;
        head.next = null;

        return reversed;
    }
}
