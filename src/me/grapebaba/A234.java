package me.grapebaba;


class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int x) {
        val = x;
    }
}

public class A234 {
    public boolean isPalindrome(ListNode1 head) {
        ListNode1 slow = head;
        ListNode1 fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        slow = reverseList(slow);
        fast = head;

        while (slow != null) {
            if (slow.val != fast.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }

    private ListNode1 reverseList(ListNode1 head) {
        ListNode1 prev = null;
        while (head != null) {
            ListNode1 next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }


    public static void main(String[] args) throws Exception {
        ListNode1 head = new ListNode1(1);
        head.next = new ListNode1(2);

        A234 a234 = new A234();
        a234.isPalindrome(head);
    }
}
