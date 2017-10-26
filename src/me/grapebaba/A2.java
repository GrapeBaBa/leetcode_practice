package me.grapebaba;

public class A2 {
    // 1.Dummy node
    // 2.Last digit carry not missing
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;

        ListNode dummy = new ListNode(0);
        ListNode head3 = dummy;
        int carry = 0;

        while (head1 != null || head2 != null) {
            int val1 = head1 != null ? head1.val : 0;
            int val2 = head2 != null ? head2.val : 0;
            int sum = val1 + val2 + carry;
            int val = sum % 10;
            carry = sum / 10;
            head3.next = new ListNode(val);

            head1 = head1 != null ? head1.next : null;
            head2 = head2 != null ? head2.next : null;
            head3 = head3.next;
        }

        if (carry > 0) {
            head3.next = new ListNode(1);
        }

        return dummy.next;
    }

    public static void main(String[] args) throws Exception {
        ListNode head1 = new ListNode(2);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(3);

        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(6);
        head2.next.next = new ListNode(4);

        A2 a2 = new A2();
        a2.addTwoNumbers(head1, head2);
    }
}
