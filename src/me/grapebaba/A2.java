package me.grapebaba;

class ListNode3 {
    int val;
    ListNode3 next;

    ListNode3(int x) {
        val = x;
    }
}

public class A2 {
    // 1.Dummy node
    // 2.
    public ListNode3 addTwoNumbers(ListNode3 l1, ListNode3 l2) {
        ListNode3 head1 = l1;
        ListNode3 head2 = l2;

        ListNode3 dummy = new ListNode3(0);
        ListNode3 head3 = dummy;
        int carry = 0;

        while (head1 != null || head2 != null) {
            int val1 = head1 != null ? head1.val : 0;
            int val2 = head2 != null ? head2.val : 0;
            int sum = val1 + val2 + carry;
            int val = sum % 10;
            carry = sum / 10;
            head3.next = new ListNode3(val);

            head1 = head1 != null ? head1.next : null;
            head2 = head2 != null ? head2.next : null;
            head3 = head3.next;
        }

        if (carry > 0) {
            head3.next = new ListNode3(1);
        }

        return dummy.next;
    }

    public static void main(String[] args) throws Exception {
        ListNode3 head1 = new ListNode3(2);
        head1.next = new ListNode3(4);
        head1.next.next = new ListNode3(3);

        ListNode3 head2 = new ListNode3(5);
        head2.next = new ListNode3(6);
        head2.next.next = new ListNode3(4);

        A2 a2 = new A2();
        a2.addTwoNumbers(head1, head2);
    }
}
