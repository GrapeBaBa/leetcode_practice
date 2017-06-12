package me.grapebaba;


class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2(int x) {
        val = x;
    }
}

public class A206 {
    public ListNode2 reverseList(ListNode2 head) {
        ListNode2 prev = null;
        while (head != null) {
            ListNode2 next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    public ListNode2 reverseList1(ListNode2 head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode2 reversed = reverseList1(head.next);
        head.next.next = head;
        head.next = null;

        return reversed;
    }
}
